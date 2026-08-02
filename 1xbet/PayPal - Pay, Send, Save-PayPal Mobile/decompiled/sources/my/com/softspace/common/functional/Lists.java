package my.com.softspace.common.functional;

/* loaded from: classes17.dex */
public class Lists {
    public static <T> java.util.List<T> of(T... tArr) {
        return java.util.Arrays.asList(tArr);
    }

    public static boolean notEmpty(java.util.List list) {
        return list != null && list.size() > 0;
    }

    public static boolean isEmpty(java.util.List list) {
        return !notEmpty(list);
    }

    public static <T> java.util.List<T> filter(java.util.List<T> list, java.util.function.Predicate<T> predicate) {
        java.util.Objects.requireNonNull(predicate);
        java.util.Objects.requireNonNull(list);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (T t : list) {
            if (predicate.test(t)) {
                linkedList.add(t);
            }
        }
        return linkedList;
    }

    public static <T, R> java.util.List<R> map(java.util.List<T> list, java.util.function.Function<T, R> function) {
        java.util.Objects.requireNonNull(function);
        java.util.Objects.requireNonNull(list);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(function.apply(it.next()));
        }
        return linkedList;
    }

    public static <T> T reduce(java.util.List<T> list, java.util.function.BiFunction<T, T, T> biFunction) {
        java.util.Objects.requireNonNull(list);
        java.util.Objects.requireNonNull(biFunction);
        if (isEmpty(list)) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        T t = list.get(0);
        java.util.Iterator<T> it = list.subList(1, list.size()).iterator();
        while (it.hasNext()) {
            t = biFunction.apply(t, it.next());
        }
        return t;
    }

    public static <T, R> R reduce(java.util.List<T> list, R r, java.util.function.BiFunction<R, T, R> biFunction) {
        java.util.Objects.requireNonNull(list);
        java.util.Objects.requireNonNull(biFunction);
        if (isEmpty(list)) {
            return r;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            r = biFunction.apply(r, it.next());
        }
        return r;
    }

    public static <T> T first(java.util.List<T> list, java.util.function.Predicate<T> predicate) {
        java.util.Objects.requireNonNull(list);
        java.util.Objects.requireNonNull(predicate);
        for (T t : list) {
            if (predicate.test(t)) {
                return t;
            }
        }
        throw null;
    }

    private Lists() {
    }
}
