package com.google.common.collect;

/* loaded from: classes4.dex */
public abstract class Ordering<T> implements java.util.Comparator<T> {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public static <C extends java.lang.Comparable> com.google.common.collect.Ordering<C> natural() {
        return com.google.common.collect.NaturalOrdering.INSTANCE;
    }

    public static <T> com.google.common.collect.Ordering<T> from(java.util.Comparator<T> comparator) {
        if (comparator instanceof com.google.common.collect.Ordering) {
            return (com.google.common.collect.Ordering) comparator;
        }
        return new com.google.common.collect.ComparatorOrdering(comparator);
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.Ordering<T> from(com.google.common.collect.Ordering<T> ordering) {
        return (com.google.common.collect.Ordering) com.google.common.base.Preconditions.checkNotNull(ordering);
    }

    public static <T> com.google.common.collect.Ordering<T> explicit(java.util.List<T> list) {
        return new com.google.common.collect.ExplicitOrdering(list);
    }

    public static <T> com.google.common.collect.Ordering<T> explicit(T t, T... tArr) {
        return explicit(com.google.common.collect.Lists.asList(t, tArr));
    }

    public static com.google.common.collect.Ordering<java.lang.Object> allEqual() {
        return com.google.common.collect.AllEqualOrdering.INSTANCE;
    }

    public static com.google.common.collect.Ordering<java.lang.Object> usingToString() {
        return com.google.common.collect.UsingToStringOrdering.INSTANCE;
    }

    public static com.google.common.collect.Ordering<java.lang.Object> arbitrary() {
        return com.google.common.collect.Ordering.ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    /* loaded from: classes9.dex */
    static final class ArbitraryOrderingHolder {
        static final com.google.common.collect.Ordering<java.lang.Object> ARBITRARY_ORDERING = new com.google.common.collect.Ordering.ArbitraryOrdering();

        private ArbitraryOrderingHolder() {
        }
    }

    /* loaded from: classes9.dex */
    static class ArbitraryOrdering extends com.google.common.collect.Ordering<java.lang.Object> {
        private final java.util.concurrent.atomic.AtomicInteger counter = new java.util.concurrent.atomic.AtomicInteger(0);
        private final java.util.concurrent.ConcurrentMap<java.lang.Object, java.lang.Integer> uids = com.google.common.collect.Platform.tryWeakKeys(new com.google.common.collect.MapMaker()).makeMap();

        ArbitraryOrdering() {
        }

        private java.lang.Integer getUid(java.lang.Object obj) {
            java.lang.Integer putIfAbsent;
            java.lang.Integer num = this.uids.get(obj);
            return (num != null || (putIfAbsent = this.uids.putIfAbsent(obj, (num = java.lang.Integer.valueOf(this.counter.getAndIncrement())))) == null) ? num : putIfAbsent;
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(java.lang.Object obj, java.lang.Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int identityHashCode = identityHashCode(obj);
            int identityHashCode2 = identityHashCode(obj2);
            if (identityHashCode != identityHashCode2) {
                return identityHashCode < identityHashCode2 ? -1 : 1;
            }
            int compareTo = getUid(obj).compareTo(getUid(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new java.lang.AssertionError();
        }

        public java.lang.String toString() {
            return "Ordering.arbitrary()";
        }

        int identityHashCode(java.lang.Object obj) {
            return java.lang.System.identityHashCode(obj);
        }
    }

    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
        return new com.google.common.collect.ReverseOrdering(this);
    }

    public <S extends T> com.google.common.collect.Ordering<S> nullsFirst() {
        return new com.google.common.collect.NullsFirstOrdering(this);
    }

    public <S extends T> com.google.common.collect.Ordering<S> nullsLast() {
        return new com.google.common.collect.NullsLastOrdering(this);
    }

    public <F> com.google.common.collect.Ordering<F> onResultOf(com.google.common.base.Function<F, ? extends T> function) {
        return new com.google.common.collect.ByFunctionOrdering(function, this);
    }

    <T2 extends T> com.google.common.collect.Ordering<java.util.Map.Entry<T2, ?>> onKeys() {
        return (com.google.common.collect.Ordering<java.util.Map.Entry<T2, ?>>) onResultOf(com.google.common.collect.Maps.keyFunction());
    }

    public <U extends T> com.google.common.collect.Ordering<U> compound(java.util.Comparator<? super U> comparator) {
        return new com.google.common.collect.CompoundOrdering(this, (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public static <T> com.google.common.collect.Ordering<T> compound(java.lang.Iterable<? extends java.util.Comparator<? super T>> iterable) {
        return new com.google.common.collect.CompoundOrdering(iterable);
    }

    public <S extends T> com.google.common.collect.Ordering<java.lang.Iterable<S>> lexicographical() {
        return new com.google.common.collect.LexicographicalOrdering(this);
    }

    public <E extends T> E min(java.util.Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(java.lang.Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E min(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    public <E extends T> E min(E e, E e2, E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    public <E extends T> E max(java.util.Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E extends T> E max(java.lang.Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E max(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    public <E extends T> E max(E e, E e2, E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    public <E extends T> java.util.List<E> leastOf(java.lang.Iterable<E> iterable, int i) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            if (collection.size() <= i * 2) {
                java.lang.Object[] array = collection.toArray();
                java.util.Arrays.sort(array, this);
                if (array.length > i) {
                    array = java.util.Arrays.copyOf(array, i);
                }
                return java.util.Collections.unmodifiableList(java.util.Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    public <E extends T> java.util.List<E> leastOf(java.util.Iterator<E> it, int i) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "k");
        if (i == 0 || !it.hasNext()) {
            return java.util.Collections.emptyList();
        }
        if (i >= 1073741823) {
            java.util.ArrayList newArrayList = com.google.common.collect.Lists.newArrayList(it);
            java.util.Collections.sort(newArrayList, this);
            if (newArrayList.size() > i) {
                newArrayList.subList(i, newArrayList.size()).clear();
            }
            newArrayList.trimToSize();
            return java.util.Collections.unmodifiableList(newArrayList);
        }
        com.google.common.collect.TopKSelector least = com.google.common.collect.TopKSelector.least(i, this);
        least.offerAll(it);
        return least.topK();
    }

    public <E extends T> java.util.List<E> greatestOf(java.lang.Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E extends T> java.util.List<E> greatestOf(java.util.Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    public <E extends T> java.util.List<E> sortedCopy(java.lang.Iterable<E> iterable) {
        java.lang.Object[] array = com.google.common.collect.Iterables.toArray(iterable);
        java.util.Arrays.sort(array, this);
        return new java.util.ArrayList(java.util.Arrays.asList(array));
    }

    public <E extends T> com.google.common.collect.ImmutableList<E> immutableSortedCopy(java.lang.Iterable<E> iterable) {
        return com.google.common.collect.ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(java.lang.Iterable<? extends T> iterable) {
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(java.lang.Iterable<? extends T> iterable) {
        java.util.Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @java.lang.Deprecated
    public int binarySearch(java.util.List<? extends T> list, T t) {
        return java.util.Collections.binarySearch(list, t, this);
    }

    /* loaded from: classes9.dex */
    static final class IncomparableValueException extends java.lang.ClassCastException {
        private static final long serialVersionUID = 0;
        final java.lang.Object value;

        IncomparableValueException(java.lang.Object obj) {
            super("Cannot compare value: ".concat(java.lang.String.valueOf(obj)));
            this.value = obj;
        }
    }
}
