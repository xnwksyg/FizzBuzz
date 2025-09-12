package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3,5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3 || divisibleBy5){
                count++;}
        }
        return count;
    }

    public static int multiples() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5){
                count++;}
        }
        return count;
    }
}
