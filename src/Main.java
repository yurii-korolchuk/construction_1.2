public class Main {
    public static void main(String[] args) {
        Person yurii = new Person("Yurii", "Korolchuk", 20);
        Person andrii = new Person("Andrii", "Galacan", 20);

        System.out.println(andrii.compareTo(yurii));
        System.out.println(andrii.toString());
        System.out.println(andrii.hashCode());
        try {
            Person tmp = andrii.clone();
            System.out.println(tmp);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
