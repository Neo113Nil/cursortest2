package com.google.common.collect;

/* loaded from: classes9.dex */
public final class Comparators {
    private Comparators() {
    }

    public static <T, S extends T> java.util.Comparator<java.lang.Iterable<S>> lexicographical(java.util.Comparator<T> comparator) {
        return new com.google.common.collect.LexicographicalOrdering((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public static <T> boolean isInOrder(java.lang.Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(java.lang.Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> java.util.stream.Collector<T, ?, java.util.List<T>> least(final int i, final java.util.Comparator<? super T> comparator) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "k");
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                com.google.common.collect.TopKSelector least;
                least = com.google.common.collect.TopKSelector.least(i, comparator);
                return least;
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.common.collect.TopKSelector) obj).offer(obj2);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda2
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return ((com.google.common.collect.TopKSelector) obj).combine((com.google.common.collect.TopKSelector) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.common.collect.TopKSelector) obj).topK();
            }
        }, java.util.stream.Collector.Characteristics.UNORDERED);
    }

    public static <T> java.util.stream.Collector<T, ?, java.util.List<T>> greatest(int i, java.util.Comparator<? super T> comparator) {
        return least(i, comparator.reversed());
    }

    public static <T> java.util.Comparator<java.util.Optional<T>> emptiesFirst(java.util.Comparator<? super T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return java.util.Comparator.comparing(new java.util.function.Function() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object orElseNull;
                orElseNull = com.google.common.collect.Comparators.orElseNull((java.util.Optional) obj);
                return orElseNull;
            }
        }, java.util.Comparator.nullsFirst(comparator));
    }

    public static <T> java.util.Comparator<java.util.Optional<T>> emptiesLast(java.util.Comparator<? super T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return java.util.Comparator.comparing(new java.util.function.Function() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object orElseNull;
                orElseNull = com.google.common.collect.Comparators.orElseNull((java.util.Optional) obj);
                return orElseNull;
            }
        }, java.util.Comparator.nullsLast(comparator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T orElseNull(java.util.Optional<T> optional) {
        return optional.orElse(null);
    }

    public static <T extends java.lang.Comparable<? super T>> T min(T t, T t2) {
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    public static <T> T min(T t, T t2, java.util.Comparator<? super T> comparator) {
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    public static <T extends java.lang.Comparable<? super T>> T max(T t, T t2) {
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static <T> T max(T t, T t2, java.util.Comparator<? super T> comparator) {
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }
}
