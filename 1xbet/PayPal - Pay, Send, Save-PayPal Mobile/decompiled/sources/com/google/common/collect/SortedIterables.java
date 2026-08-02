package com.google.common.collect;

/* loaded from: classes9.dex */
final class SortedIterables {
    private SortedIterables() {
    }

    public static boolean hasSameComparator(java.util.Comparator<?> comparator, java.lang.Iterable<?> iterable) {
        java.util.Comparator comparator2;
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(iterable);
        if (iterable instanceof java.util.SortedSet) {
            comparator2 = comparator((java.util.SortedSet) iterable);
        } else {
            if (!(iterable instanceof com.google.common.collect.SortedIterable)) {
                return false;
            }
            comparator2 = ((com.google.common.collect.SortedIterable) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static <E> java.util.Comparator<? super E> comparator(java.util.SortedSet<E> sortedSet) {
        java.util.Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? com.google.common.collect.Ordering.natural() : comparator;
    }
}
