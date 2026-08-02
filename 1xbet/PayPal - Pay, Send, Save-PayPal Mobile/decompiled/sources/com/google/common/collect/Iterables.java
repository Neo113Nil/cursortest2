package com.google.common.collect;

/* loaded from: classes4.dex */
public final class Iterables {
    private Iterables() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> java.lang.Iterable<T> unmodifiableIterable(java.lang.Iterable<? extends T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return ((iterable instanceof com.google.common.collect.Iterables.UnmodifiableIterable) || (iterable instanceof com.google.common.collect.ImmutableCollection)) ? iterable : new com.google.common.collect.Iterables.UnmodifiableIterable(iterable);
    }

    @java.lang.Deprecated
    public static <E> java.lang.Iterable<E> unmodifiableIterable(com.google.common.collect.ImmutableCollection<E> immutableCollection) {
        return (java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(immutableCollection);
    }

    /* loaded from: classes9.dex */
    static final class UnmodifiableIterable<T> extends com.google.common.collect.FluentIterable<T> {
        private final java.lang.Iterable<? extends T> iterable;

        private UnmodifiableIterable(java.lang.Iterable<? extends T> iterable) {
            this.iterable = iterable;
        }

        @Override // java.lang.Iterable
        public final java.util.Iterator<T> iterator() {
            return com.google.common.collect.Iterators.unmodifiableIterator(this.iterable.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public final java.lang.String toString() {
            return this.iterable.toString();
        }
    }

    public static int size(java.lang.Iterable<?> iterable) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).size();
        }
        return com.google.common.collect.Iterators.size(iterable.iterator());
    }

    public static boolean contains(java.lang.Iterable<?> iterable, java.lang.Object obj) {
        if (iterable instanceof java.util.Collection) {
            return com.google.common.collect.Collections2.safeContains((java.util.Collection) iterable, obj);
        }
        return com.google.common.collect.Iterators.contains(iterable.iterator(), obj);
    }

    public static boolean removeAll(java.lang.Iterable<?> iterable, java.util.Collection<?> collection) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).removeAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection));
        }
        return com.google.common.collect.Iterators.removeAll(iterable.iterator(), collection);
    }

    public static boolean retainAll(java.lang.Iterable<?> iterable, java.util.Collection<?> collection) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).retainAll((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection));
        }
        return com.google.common.collect.Iterators.retainAll(iterable.iterator(), collection);
    }

    public static <T> boolean removeIf(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        if ((iterable instanceof java.util.RandomAccess) && (iterable instanceof java.util.List)) {
            return removeIfFromRandomAccessList((java.util.List) iterable, (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
        }
        return com.google.common.collect.Iterators.removeIf(iterable.iterator(), predicate);
    }

    private static <T> boolean removeIfFromRandomAccessList(java.util.List<T> list, com.google.common.base.Predicate<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (java.lang.IllegalArgumentException unused) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static <T> void slowRemoveIfForRemainingElements(java.util.List<T> list, com.google.common.base.Predicate<? super T> predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    static <T> T removeFirstMatching(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static boolean elementsEqual(java.lang.Iterable<?> iterable, java.lang.Iterable<?> iterable2) {
        if ((iterable instanceof java.util.Collection) && (iterable2 instanceof java.util.Collection) && ((java.util.Collection) iterable).size() != ((java.util.Collection) iterable2).size()) {
            return false;
        }
        return com.google.common.collect.Iterators.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    public static java.lang.String toString(java.lang.Iterable<?> iterable) {
        return com.google.common.collect.Iterators.toString(iterable.iterator());
    }

    public static <T> T getOnlyElement(java.lang.Iterable<T> iterable) {
        return (T) com.google.common.collect.Iterators.getOnlyElement(iterable.iterator());
    }

    public static <T> T getOnlyElement(java.lang.Iterable<? extends T> iterable, T t) {
        return (T) com.google.common.collect.Iterators.getOnlyElement(iterable.iterator(), t);
    }

    public static <T> T[] toArray(java.lang.Iterable<? extends T> iterable, java.lang.Class<T> cls) {
        return (T[]) toArray(iterable, com.google.common.collect.ObjectArrays.newArray(cls, 0));
    }

    static <T> T[] toArray(java.lang.Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) castOrCopyToCollection(iterable).toArray(tArr);
    }

    static java.lang.Object[] toArray(java.lang.Iterable<?> iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }

    private static <E> java.util.Collection<E> castOrCopyToCollection(java.lang.Iterable<E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return (java.util.Collection) iterable;
        }
        return com.google.common.collect.Lists.newArrayList(iterable.iterator());
    }

    public static <T> boolean addAll(java.util.Collection<T> collection, java.lang.Iterable<? extends T> iterable) {
        if (iterable instanceof java.util.Collection) {
            return collection.addAll((java.util.Collection) iterable);
        }
        return com.google.common.collect.Iterators.addAll(collection, ((java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(iterable)).iterator());
    }

    public static int frequency(java.lang.Iterable<?> iterable, java.lang.Object obj) {
        if (iterable instanceof com.google.common.collect.Multiset) {
            return ((com.google.common.collect.Multiset) iterable).count(obj);
        }
        if (iterable instanceof java.util.Set) {
            return ((java.util.Set) iterable).contains(obj) ? 1 : 0;
        }
        return com.google.common.collect.Iterators.frequency(iterable.iterator(), obj);
    }

    public static <T> java.lang.Iterable<T> cycle(final java.lang.Iterable<T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.1
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.cycle(iterable);
            }

            @Override // com.google.common.collect.FluentIterable
            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(iterable.toString());
                sb.append(" (cycled)");
                return sb.toString();
            }
        };
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.Iterable<T> cycle(T... tArr) {
        return cycle(com.google.common.collect.Lists.newArrayList(tArr));
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> iterable, java.lang.Iterable<? extends T> iterable2) {
        return com.google.common.collect.FluentIterable.concat(iterable, iterable2);
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> iterable, java.lang.Iterable<? extends T> iterable2, java.lang.Iterable<? extends T> iterable3) {
        return com.google.common.collect.FluentIterable.concat(iterable, iterable2, iterable3);
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T> iterable, java.lang.Iterable<? extends T> iterable2, java.lang.Iterable<? extends T> iterable3, java.lang.Iterable<? extends T> iterable4) {
        return com.google.common.collect.FluentIterable.concat(iterable, iterable2, iterable3, iterable4);
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends T>... iterableArr) {
        return com.google.common.collect.FluentIterable.concat(iterableArr);
    }

    public static <T> java.lang.Iterable<T> concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> iterable) {
        return com.google.common.collect.FluentIterable.concat(iterable);
    }

    public static <T> java.lang.Iterable<java.util.List<T>> partition(final java.lang.Iterable<T> iterable, final int i) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        return new com.google.common.collect.FluentIterable<java.util.List<T>>() { // from class: com.google.common.collect.Iterables.2
            @Override // java.lang.Iterable
            public java.util.Iterator<java.util.List<T>> iterator() {
                return com.google.common.collect.Iterators.partition(iterable.iterator(), i);
            }
        };
    }

    public static <T> java.lang.Iterable<java.util.List<T>> paddedPartition(final java.lang.Iterable<T> iterable, final int i) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        return new com.google.common.collect.FluentIterable<java.util.List<T>>() { // from class: com.google.common.collect.Iterables.3
            @Override // java.lang.Iterable
            public java.util.Iterator<java.util.List<T>> iterator() {
                return com.google.common.collect.Iterators.paddedPartition(iterable.iterator(), i);
            }
        };
    }

    public static <T> java.lang.Iterable<T> filter(final java.lang.Iterable<T> iterable, final com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.4
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.filter(iterable.iterator(), predicate);
            }
        };
    }

    public static <T> java.lang.Iterable<T> filter(java.lang.Iterable<?> iterable, java.lang.Class<T> cls) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkNotNull(cls);
        return filter(iterable, com.google.common.base.Predicates.instanceOf(cls));
    }

    public static <T> boolean any(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.any(iterable.iterator(), predicate);
    }

    public static <T> boolean all(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.all(iterable.iterator(), predicate);
    }

    public static <T> T find(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return (T) com.google.common.collect.Iterators.find(iterable.iterator(), predicate);
    }

    public static <T> T find(java.lang.Iterable<? extends T> iterable, com.google.common.base.Predicate<? super T> predicate, T t) {
        return (T) com.google.common.collect.Iterators.find(iterable.iterator(), predicate, t);
    }

    public static <T> com.google.common.base.Optional<T> tryFind(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.tryFind(iterable.iterator(), predicate);
    }

    public static <T> int indexOf(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate) {
        return com.google.common.collect.Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static <F, T> java.lang.Iterable<T> transform(final java.lang.Iterable<F> iterable, final com.google.common.base.Function<? super F, ? extends T> function) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.5
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.transform(iterable.iterator(), function);
            }
        };
    }

    public static <T> T get(java.lang.Iterable<T> iterable, int i) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        if (iterable instanceof java.util.List) {
            return (T) ((java.util.List) iterable).get(i);
        }
        return (T) com.google.common.collect.Iterators.get(iterable.iterator(), i);
    }

    public static <T> T get(java.lang.Iterable<? extends T> iterable, int i, T t) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.collect.Iterators.checkNonnegative(i);
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            return i < list.size() ? (T) list.get(i) : t;
        }
        java.util.Iterator<? extends T> it = iterable.iterator();
        com.google.common.collect.Iterators.advance(it, i);
        return (T) com.google.common.collect.Iterators.getNext(it, t);
    }

    public static <T> T getFirst(java.lang.Iterable<? extends T> iterable, T t) {
        return (T) com.google.common.collect.Iterators.getNext(iterable.iterator(), t);
    }

    public static <T> T getLast(java.lang.Iterable<T> iterable) {
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                throw new java.util.NoSuchElementException();
            }
            return (T) getLastInNonemptyList(list);
        }
        if (iterable instanceof java.util.SortedSet) {
            return (T) ((java.util.SortedSet) iterable).last();
        }
        return (T) com.google.common.collect.Iterators.getLast(iterable.iterator());
    }

    public static <T> T getLast(java.lang.Iterable<? extends T> iterable, T t) {
        if (iterable instanceof java.util.Collection) {
            if (((java.util.Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof java.util.List) {
                return (T) getLastInNonemptyList((java.util.List) iterable);
            }
            if (iterable instanceof java.util.SortedSet) {
                return (T) ((java.util.SortedSet) iterable).last();
            }
        }
        return (T) com.google.common.collect.Iterators.getLast(iterable.iterator(), t);
    }

    private static <T> T getLastInNonemptyList(java.util.List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> java.lang.Iterable<T> skip(final java.lang.Iterable<T> iterable, final int i) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(i >= 0, "number to skip cannot be negative");
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.6
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                java.lang.Iterable iterable2 = iterable;
                if (iterable2 instanceof java.util.List) {
                    java.util.List list = (java.util.List) iterable2;
                    return list.subList(java.lang.Math.min(list.size(), i), list.size()).iterator();
                }
                final java.util.Iterator<T> it = iterable2.iterator();
                com.google.common.collect.Iterators.advance(it, i);
                return new java.util.Iterator<T>(this) { // from class: com.google.common.collect.Iterables.6.1
                    boolean atStart = true;
                    final /* synthetic */ com.google.common.collect.Iterables.AnonymousClass6 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        T t = (T) it.next();
                        this.atStart = false;
                        return t;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        com.google.common.collect.CollectPreconditions.checkRemove(!this.atStart);
                        it.remove();
                    }
                };
            }
        };
    }

    public static <T> java.lang.Iterable<T> limit(final java.lang.Iterable<T> iterable, final int i) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        com.google.common.base.Preconditions.checkArgument(i >= 0, "limit is negative");
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.7
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.limit(iterable.iterator(), i);
            }
        };
    }

    public static <T> java.lang.Iterable<T> consumingIterable(final java.lang.Iterable<T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.8
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                java.lang.Iterable iterable2 = iterable;
                if (iterable2 instanceof java.util.Queue) {
                    return new com.google.common.collect.ConsumingQueueIterator((java.util.Queue) iterable);
                }
                return com.google.common.collect.Iterators.consumingIterator(iterable2.iterator());
            }

            @Override // com.google.common.collect.FluentIterable
            public java.lang.String toString() {
                return "Iterables.consumingIterable(...)";
            }
        };
    }

    public static boolean isEmpty(java.lang.Iterable<?> iterable) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static <T> java.lang.Iterable<T> mergeSorted(final java.lang.Iterable<? extends java.lang.Iterable<? extends T>> iterable, final java.util.Comparator<? super T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(iterable, "iterables");
        com.google.common.base.Preconditions.checkNotNull(comparator, "comparator");
        return new com.google.common.collect.Iterables.UnmodifiableIterable(new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.Iterables.9
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.mergeSorted(com.google.common.collect.Iterables.transform(iterable, new com.google.common.collect.FluentIterable$2$$ExternalSyntheticLambda0()), comparator);
            }
        });
    }
}
