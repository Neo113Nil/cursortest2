package com.google.common.collect;

/* loaded from: classes4.dex */
public abstract class FluentIterable<E> implements java.lang.Iterable<E> {
    private final com.google.common.base.Optional<java.lang.Iterable<E>> iterableDelegate;

    protected FluentIterable() {
        this.iterableDelegate = com.google.common.base.Optional.absent();
    }

    FluentIterable(java.lang.Iterable<E> iterable) {
        this.iterableDelegate = com.google.common.base.Optional.of(iterable);
    }

    private java.lang.Iterable<E> getDelegate() {
        return this.iterableDelegate.or((com.google.common.base.Optional<java.lang.Iterable<E>>) this);
    }

    public static <E> com.google.common.collect.FluentIterable<E> from(final java.lang.Iterable<E> iterable) {
        if (iterable instanceof com.google.common.collect.FluentIterable) {
            return (com.google.common.collect.FluentIterable) iterable;
        }
        return new com.google.common.collect.FluentIterable<E>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public java.util.Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <E> com.google.common.collect.FluentIterable<E> from(E[] eArr) {
        return from(java.util.Arrays.asList(eArr));
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.FluentIterable<E> from(com.google.common.collect.FluentIterable<E> fluentIterable) {
        return (com.google.common.collect.FluentIterable) com.google.common.base.Preconditions.checkNotNull(fluentIterable);
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> iterable, java.lang.Iterable<? extends T> iterable2) {
        return concatNoDefensiveCopy(iterable, iterable2);
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> iterable, java.lang.Iterable<? extends T> iterable2, java.lang.Iterable<? extends T> iterable3) {
        return concatNoDefensiveCopy(iterable, iterable2, iterable3);
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T> iterable, java.lang.Iterable<? extends T> iterable2, java.lang.Iterable<? extends T> iterable3, java.lang.Iterable<? extends T> iterable4) {
        return concatNoDefensiveCopy(iterable, iterable2, iterable3, iterable4);
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.collect.FluentIterable<T> concat(java.lang.Iterable<? extends T>... iterableArr) {
        return concatNoDefensiveCopy((java.lang.Iterable[]) java.util.Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <T> com.google.common.collect.FluentIterable<T> concat(final java.lang.Iterable<? extends java.lang.Iterable<? extends T>> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.2
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return com.google.common.collect.Iterators.concat(com.google.common.collect.Iterators.transform(iterable.iterator(), new com.google.common.collect.FluentIterable$2$$ExternalSyntheticLambda0()));
            }
        };
    }

    private static <T> com.google.common.collect.FluentIterable<T> concatNoDefensiveCopy(final java.lang.Iterable<? extends T>... iterableArr) {
        for (java.lang.Iterable<? extends T> iterable : iterableArr) {
            com.google.common.base.Preconditions.checkNotNull(iterable);
        }
        return new com.google.common.collect.FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.3
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                final java.lang.Iterable[] iterableArr2 = iterableArr;
                return com.google.common.collect.Iterators.concat(new com.google.common.collect.AbstractIndexedListIterator<java.util.Iterator<? extends T>>(this, iterableArr2.length) { // from class: com.google.common.collect.FluentIterable.3.1
                    final /* synthetic */ com.google.common.collect.FluentIterable.AnonymousClass3 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public java.util.Iterator<? extends T> get(int i) {
                        return iterableArr2[i].iterator();
                    }
                });
            }
        };
    }

    public static <E> com.google.common.collect.FluentIterable<E> of() {
        return from(java.util.Collections.emptyList());
    }

    public static <E> com.google.common.collect.FluentIterable<E> of(E e, E... eArr) {
        return from(com.google.common.collect.Lists.asList(e, eArr));
    }

    public java.lang.String toString() {
        return com.google.common.collect.Iterables.toString(getDelegate());
    }

    public final int size() {
        return com.google.common.collect.Iterables.size(getDelegate());
    }

    public final boolean contains(java.lang.Object obj) {
        return com.google.common.collect.Iterables.contains(getDelegate(), obj);
    }

    public final com.google.common.collect.FluentIterable<E> cycle() {
        return from(com.google.common.collect.Iterables.cycle(getDelegate()));
    }

    public final com.google.common.collect.FluentIterable<E> append(java.lang.Iterable<? extends E> iterable) {
        return concat(getDelegate(), iterable);
    }

    public final com.google.common.collect.FluentIterable<E> append(E... eArr) {
        return concat(getDelegate(), java.util.Arrays.asList(eArr));
    }

    public final com.google.common.collect.FluentIterable<E> filter(com.google.common.base.Predicate<? super E> predicate) {
        return from(com.google.common.collect.Iterables.filter(getDelegate(), predicate));
    }

    public final <T> com.google.common.collect.FluentIterable<T> filter(java.lang.Class<T> cls) {
        return from(com.google.common.collect.Iterables.filter((java.lang.Iterable<?>) getDelegate(), (java.lang.Class) cls));
    }

    public final boolean anyMatch(com.google.common.base.Predicate<? super E> predicate) {
        return com.google.common.collect.Iterables.any(getDelegate(), predicate);
    }

    public final boolean allMatch(com.google.common.base.Predicate<? super E> predicate) {
        return com.google.common.collect.Iterables.all(getDelegate(), predicate);
    }

    public final com.google.common.base.Optional<E> firstMatch(com.google.common.base.Predicate<? super E> predicate) {
        return com.google.common.collect.Iterables.tryFind(getDelegate(), predicate);
    }

    public final <T> com.google.common.collect.FluentIterable<T> transform(com.google.common.base.Function<? super E, T> function) {
        return from(com.google.common.collect.Iterables.transform(getDelegate(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> com.google.common.collect.FluentIterable<T> transformAndConcat(com.google.common.base.Function<? super E, ? extends java.lang.Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final com.google.common.base.Optional<E> first() {
        java.util.Iterator<E> it = getDelegate().iterator();
        return it.hasNext() ? com.google.common.base.Optional.of(it.next()) : com.google.common.base.Optional.absent();
    }

    public final com.google.common.base.Optional<E> last() {
        E next;
        java.lang.Iterable<E> delegate = getDelegate();
        if (delegate instanceof java.util.List) {
            java.util.List list = (java.util.List) delegate;
            if (list.isEmpty()) {
                return com.google.common.base.Optional.absent();
            }
            return com.google.common.base.Optional.of(list.get(list.size() - 1));
        }
        java.util.Iterator<E> it = delegate.iterator();
        if (!it.hasNext()) {
            return com.google.common.base.Optional.absent();
        }
        if (delegate instanceof java.util.SortedSet) {
            return com.google.common.base.Optional.of(((java.util.SortedSet) delegate).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return com.google.common.base.Optional.of(next);
    }

    public final com.google.common.collect.FluentIterable<E> skip(int i) {
        return from(com.google.common.collect.Iterables.skip(getDelegate(), i));
    }

    public final com.google.common.collect.FluentIterable<E> limit(int i) {
        return from(com.google.common.collect.Iterables.limit(getDelegate(), i));
    }

    public final boolean isEmpty() {
        return !getDelegate().iterator().hasNext();
    }

    public final com.google.common.collect.ImmutableList<E> toList() {
        return com.google.common.collect.ImmutableList.copyOf(getDelegate());
    }

    public final com.google.common.collect.ImmutableList<E> toSortedList(java.util.Comparator<? super E> comparator) {
        return com.google.common.collect.Ordering.from(comparator).immutableSortedCopy(getDelegate());
    }

    public final com.google.common.collect.ImmutableSet<E> toSet() {
        return com.google.common.collect.ImmutableSet.copyOf(getDelegate());
    }

    public final com.google.common.collect.ImmutableSortedSet<E> toSortedSet(java.util.Comparator<? super E> comparator) {
        return com.google.common.collect.ImmutableSortedSet.copyOf(comparator, getDelegate());
    }

    public final com.google.common.collect.ImmutableMultiset<E> toMultiset() {
        return com.google.common.collect.ImmutableMultiset.copyOf(getDelegate());
    }

    public final <V> com.google.common.collect.ImmutableMap<E, V> toMap(com.google.common.base.Function<? super E, V> function) {
        return com.google.common.collect.Maps.toMap(getDelegate(), function);
    }

    public final <K> com.google.common.collect.ImmutableListMultimap<K, E> index(com.google.common.base.Function<? super E, K> function) {
        return com.google.common.collect.Multimaps.index(getDelegate(), function);
    }

    public final <K> com.google.common.collect.ImmutableMap<K, E> uniqueIndex(com.google.common.base.Function<? super E, K> function) {
        return com.google.common.collect.Maps.uniqueIndex(getDelegate(), function);
    }

    public final E[] toArray(java.lang.Class<E> cls) {
        return (E[]) com.google.common.collect.Iterables.toArray(getDelegate(), cls);
    }

    public final <C extends java.util.Collection<? super E>> C copyInto(C c) {
        com.google.common.base.Preconditions.checkNotNull(c);
        java.lang.Iterable<E> delegate = getDelegate();
        if (delegate instanceof java.util.Collection) {
            c.addAll((java.util.Collection) delegate);
            return c;
        }
        java.util.Iterator<E> it = delegate.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public final java.lang.String join(com.google.common.base.Joiner joiner) {
        return joiner.join(this);
    }

    public final E get(int i) {
        return (E) com.google.common.collect.Iterables.get(getDelegate(), i);
    }
}
