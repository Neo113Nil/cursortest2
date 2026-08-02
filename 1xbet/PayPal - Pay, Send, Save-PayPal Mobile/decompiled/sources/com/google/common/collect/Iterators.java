package com.google.common.collect;

/* loaded from: classes4.dex */
public final class Iterators {
    private Iterators() {
    }

    static <T> com.google.common.collect.UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    static <T> com.google.common.collect.UnmodifiableListIterator<T> emptyListIterator() {
        return (com.google.common.collect.UnmodifiableListIterator<T>) com.google.common.collect.Iterators.ArrayItr.EMPTY;
    }

    /* loaded from: classes9.dex */
    enum EmptyModifiableIterator implements java.util.Iterator<java.lang.Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final java.lang.Object next() {
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(false);
        }
    }

    static <T> java.util.Iterator<T> emptyModifiableIterator() {
        return com.google.common.collect.Iterators.EmptyModifiableIterator.INSTANCE;
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(final java.util.Iterator<? extends T> it) {
        com.google.common.base.Preconditions.checkNotNull(it);
        if (it instanceof com.google.common.collect.UnmodifiableIterator) {
            return (com.google.common.collect.UnmodifiableIterator) it;
        }
        return new com.google.common.collect.UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                return (T) it.next();
            }
        };
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator) {
        return (com.google.common.collect.UnmodifiableIterator) com.google.common.base.Preconditions.checkNotNull(unmodifiableIterator);
    }

    public static int size(java.util.Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return com.google.common.primitives.Ints.saturatedCast(j);
    }

    public static boolean contains(java.util.Iterator<?> it, java.lang.Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeAll(java.util.Iterator<?> it, java.util.Collection<?> collection) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeIf(java.util.Iterator<T> it, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean retainAll(java.util.Iterator<?> it, java.util.Collection<?> collection) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean elementsEqual(java.util.Iterator<?> it, java.util.Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !java.util.Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static java.lang.String toString(java.util.Iterator<?> it) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static <T> T getOnlyElement(java.util.Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append(kotlin.text.Typography.greater);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static <T> T getOnlyElement(java.util.Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) getOnlyElement(it) : t;
    }

    public static <T> T[] toArray(java.util.Iterator<? extends T> it, java.lang.Class<T> cls) {
        return (T[]) com.google.common.collect.Iterables.toArray(com.google.common.collect.Lists.newArrayList(it), cls);
    }

    public static <T> boolean addAll(java.util.Collection<T> collection, java.util.Iterator<? extends T> it) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        com.google.common.base.Preconditions.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static int frequency(java.util.Iterator<?> it, java.lang.Object obj) {
        int i = 0;
        while (contains(it, obj)) {
            i++;
        }
        return i;
    }

    public static <T> java.util.Iterator<T> cycle(final java.lang.Iterable<T> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new java.util.Iterator<T>() { // from class: com.google.common.collect.Iterators.2
            java.util.Iterator<T> iterator = com.google.common.collect.Iterators.emptyModifiableIterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                if (!this.iterator.hasNext()) {
                    java.util.Iterator<T> it = iterable.iterator();
                    this.iterator = it;
                    if (!it.hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    @java.lang.SafeVarargs
    public static <T> java.util.Iterator<T> cycle(T... tArr) {
        return cycle(com.google.common.collect.Lists.newArrayList(tArr));
    }

    private static <I extends java.util.Iterator<?>> java.util.Iterator<I> consumingForArray(final I... iArr) {
        return new com.google.common.collect.UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3
            int index = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < iArr.length;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TI; */
            @Override // java.util.Iterator
            public java.util.Iterator next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.util.Iterator it = (java.util.Iterator) java.util.Objects.requireNonNull(iArr[this.index]);
                java.util.Iterator[] itArr = iArr;
                int i = this.index;
                itArr[i] = null;
                this.index = i + 1;
                return it;
            }
        };
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> it, java.util.Iterator<? extends T> it2) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(it2);
        return concat(consumingForArray(it, it2));
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> it, java.util.Iterator<? extends T> it2, java.util.Iterator<? extends T> it3) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(it2);
        com.google.common.base.Preconditions.checkNotNull(it3);
        return concat(consumingForArray(it, it2, it3));
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> it, java.util.Iterator<? extends T> it2, java.util.Iterator<? extends T> it3, java.util.Iterator<? extends T> it4) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(it2);
        com.google.common.base.Preconditions.checkNotNull(it3);
        com.google.common.base.Preconditions.checkNotNull(it4);
        return concat(consumingForArray(it, it2, it3, it4));
    }

    @java.lang.SafeVarargs
    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T>... itArr) {
        return concatNoDefensiveCopy((java.util.Iterator[]) java.util.Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> it) {
        return new com.google.common.collect.Iterators.ConcatenatedIterator(it);
    }

    static <T> java.util.Iterator<T> concatNoDefensiveCopy(java.util.Iterator<? extends T>... itArr) {
        for (java.util.Iterator it : (java.util.Iterator[]) com.google.common.base.Preconditions.checkNotNull(itArr)) {
            com.google.common.base.Preconditions.checkNotNull(it);
        }
        return concat(consumingForArray(itArr));
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> it, int i) {
        return partitionImpl(it, i, false);
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> it, int i) {
        return partitionImpl(it, i, true);
    }

    private static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partitionImpl(final java.util.Iterator<T> it, final int i, final boolean z) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        return new com.google.common.collect.UnmodifiableIterator<java.util.List<T>>() { // from class: com.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.List<T> next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object[] objArr = new java.lang.Object[i];
                int i2 = 0;
                while (i2 < i && it.hasNext()) {
                    objArr[i2] = it.next();
                    i2++;
                }
                for (int i3 = i2; i3 < i; i3++) {
                    objArr[i3] = null;
                }
                java.util.List<T> unmodifiableList = java.util.Collections.unmodifiableList(java.util.Arrays.asList(objArr));
                return (z || i2 == i) ? unmodifiableList : unmodifiableList.subList(0, i2);
            }
        };
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(final java.util.Iterator<T> it, final com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        return new com.google.common.collect.AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            @Override // com.google.common.collect.AbstractIterator
            protected T computeNext() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (predicate.apply(t)) {
                        return t;
                    }
                }
                return endOfData();
            }
        };
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<?> it, java.lang.Class<T> cls) {
        return filter(it, com.google.common.base.Predicates.instanceOf(cls));
    }

    public static <T> boolean any(java.util.Iterator<T> it, com.google.common.base.Predicate<? super T> predicate) {
        return indexOf(it, predicate) != -1;
    }

    public static <T> boolean all(java.util.Iterator<T> it, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (!predicate.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> T find(java.util.Iterator<T> it, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T find(java.util.Iterator<? extends T> it, com.google.common.base.Predicate<? super T> predicate, T t) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> com.google.common.base.Optional<T> tryFind(java.util.Iterator<T> it, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return com.google.common.base.Optional.of(next);
            }
        }
        return com.google.common.base.Optional.absent();
    }

    public static <T> int indexOf(java.util.Iterator<T> it, com.google.common.base.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> java.util.Iterator<T> transform(java.util.Iterator<F> it, final com.google.common.base.Function<? super F, ? extends T> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.TransformedIterator<F, T>(it) { // from class: com.google.common.collect.Iterators.6
            @Override // com.google.common.collect.TransformedIterator
            T transform(F f) {
                return (T) function.apply(f);
            }
        };
    }

    public static <T> T get(java.util.Iterator<T> it, int i) {
        checkNonnegative(i);
        int advance = advance(it, i);
        if (!it.hasNext()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("position (");
            sb.append(i);
            sb.append(") must be less than the number of elements that remained (");
            sb.append(advance);
            sb.append(")");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        return it.next();
    }

    public static <T> T get(java.util.Iterator<? extends T> it, int i, T t) {
        checkNonnegative(i);
        advance(it, i);
        return (T) getNext(it, t);
    }

    static void checkNonnegative(int i) {
        if (i >= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("position (");
        sb.append(i);
        sb.append(") must not be negative");
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public static <T> T getNext(java.util.Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T getLast(java.util.Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T getLast(java.util.Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) getLast(it) : t;
    }

    public static int advance(java.util.Iterator<?> it, int i) {
        com.google.common.base.Preconditions.checkNotNull(it);
        int i2 = 0;
        com.google.common.base.Preconditions.checkArgument(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> java.util.Iterator<T> limit(final java.util.Iterator<T> it, final int i) {
        com.google.common.base.Preconditions.checkNotNull(it);
        com.google.common.base.Preconditions.checkArgument(i >= 0, "limit is negative");
        return new java.util.Iterator<T>() { // from class: com.google.common.collect.Iterators.7
            private int count;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < i && it.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                this.count++;
                return (T) it.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                it.remove();
            }
        };
    }

    public static <T> java.util.Iterator<T> consumingIterator(final java.util.Iterator<T> it) {
        com.google.common.base.Preconditions.checkNotNull(it);
        return new com.google.common.collect.UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t = (T) it.next();
                it.remove();
                return t;
            }

            public java.lang.String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    static <T> T pollNext(java.util.Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    static void clear(java.util.Iterator<?> it) {
        com.google.common.base.Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.collect.UnmodifiableIterator<T> forArray(T... tArr) {
        return forArrayWithPosition(tArr, 0);
    }

    static <T> com.google.common.collect.UnmodifiableListIterator<T> forArrayWithPosition(T[] tArr, int i) {
        if (tArr.length == 0) {
            com.google.common.base.Preconditions.checkPositionIndex(i, tArr.length);
            return emptyListIterator();
        }
        return new com.google.common.collect.Iterators.ArrayItr(tArr, i);
    }

    static final class ArrayItr<T> extends com.google.common.collect.AbstractIndexedListIterator<T> {
        static final com.google.common.collect.UnmodifiableListIterator<java.lang.Object> EMPTY = new com.google.common.collect.Iterators.ArrayItr(new java.lang.Object[0], 0);
        private final T[] array;

        ArrayItr(T[] tArr, int i) {
            super(tArr.length, i);
            this.array = tArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected final T get(int i) {
            return this.array[i];
        }
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(T t) {
        return new com.google.common.collect.Iterators.SingletonIterator(t);
    }

    static final class SingletonIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {
        private boolean done;
        private final T value;

        SingletonIterator(T t) {
            this.value = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.done;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.done) {
                throw new java.util.NoSuchElementException();
            }
            this.done = true;
            return this.value;
        }
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> forEnumeration(final java.util.Enumeration<T> enumeration) {
        com.google.common.base.Preconditions.checkNotNull(enumeration);
        return new com.google.common.collect.UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            public T next() {
                return (T) enumeration.nextElement();
            }
        };
    }

    public static <T> java.util.Enumeration<T> asEnumeration(final java.util.Iterator<T> it) {
        com.google.common.base.Preconditions.checkNotNull(it);
        return new java.util.Enumeration<T>() { // from class: com.google.common.collect.Iterators.10
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public T nextElement() {
                return (T) it.next();
            }
        };
    }

    /* loaded from: classes9.dex */
    static final class PeekingImpl<E> implements com.google.common.collect.PeekingIterator<E> {
        private boolean hasPeeked;
        private final java.util.Iterator<? extends E> iterator;
        private E peekedElement;

        PeekingImpl(java.util.Iterator<? extends E> it) {
            this.iterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(it);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public final E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e = (E) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
            this.hasPeeked = false;
            this.peekedElement = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public final void remove() {
            com.google.common.base.Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }

        @Override // com.google.common.collect.PeekingIterator
        public final E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return (E) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        }
    }

    public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(java.util.Iterator<? extends T> it) {
        if (it instanceof com.google.common.collect.Iterators.PeekingImpl) {
            return (com.google.common.collect.Iterators.PeekingImpl) it;
        }
        return new com.google.common.collect.Iterators.PeekingImpl(it);
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(com.google.common.collect.PeekingIterator<T> peekingIterator) {
        return (com.google.common.collect.PeekingIterator) com.google.common.base.Preconditions.checkNotNull(peekingIterator);
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> iterable, java.util.Comparator<? super T> comparator) {
        com.google.common.base.Preconditions.checkNotNull(iterable, "iterators");
        com.google.common.base.Preconditions.checkNotNull(comparator, "comparator");
        return new com.google.common.collect.Iterators.MergingIterator(iterable, comparator);
    }

    /* loaded from: classes9.dex */
    static final class MergingIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {
        final java.util.Queue<com.google.common.collect.Iterators.MergingIterator.IndexedIterator<T>> queue;

        static class IndexedIterator<E> {
            final int index;
            final com.google.common.collect.PeekingIterator<E> iterator;

            IndexedIterator(com.google.common.collect.PeekingIterator<E> peekingIterator, int i) {
                this.iterator = peekingIterator;
                this.index = i;
            }
        }

        MergingIterator(java.lang.Iterable<? extends java.util.Iterator<? extends T>> iterable, final java.util.Comparator<? super T> comparator) {
            this.queue = new java.util.PriorityQueue(2, new java.util.Comparator() { // from class: com.google.common.collect.Iterators$MergingIterator$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int result;
                    result = com.google.common.collect.ComparisonChain.start().compare(r2.iterator.peek(), r3.iterator.peek(), comparator).compare(((com.google.common.collect.Iterators.MergingIterator.IndexedIterator) obj).index, ((com.google.common.collect.Iterators.MergingIterator.IndexedIterator) obj2).index).result();
                    return result;
                }
            });
            int i = 0;
            for (java.util.Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.queue.add(new com.google.common.collect.Iterators.MergingIterator.IndexedIterator<>(com.google.common.collect.Iterators.peekingIterator(it), i));
                    i++;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        public final T next() {
            com.google.common.collect.Iterators.MergingIterator.IndexedIterator<T> remove = this.queue.remove();
            com.google.common.collect.PeekingIterator<T> peekingIterator = remove.iterator;
            T next = peekingIterator.next();
            if (peekingIterator.hasNext()) {
                this.queue.add(remove);
            }
            return next;
        }
    }

    static final class ConcatenatedIterator<T> implements java.util.Iterator<T> {
        private java.util.Iterator<? extends T> iterator = com.google.common.collect.Iterators.emptyIterator();
        private java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> metaIterators;
        private java.util.Iterator<? extends T> toRemove;
        private java.util.Iterator<? extends java.util.Iterator<? extends T>> topMetaIterator;

        ConcatenatedIterator(java.util.Iterator<? extends java.util.Iterator<? extends T>> it) {
            this.topMetaIterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(it);
        }

        private java.util.Iterator<? extends java.util.Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                java.util.Iterator<? extends java.util.Iterator<? extends T>> it = this.topMetaIterator;
                if (it == null || !it.hasNext()) {
                    java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> deque = this.metaIterators;
                    if (deque == null || deque.isEmpty()) {
                        return null;
                    }
                    this.topMetaIterator = this.metaIterators.removeFirst();
                } else {
                    return this.topMetaIterator;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!((java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(this.iterator)).hasNext()) {
                java.util.Iterator<? extends java.util.Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                java.util.Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof com.google.common.collect.Iterators.ConcatenatedIterator) {
                    com.google.common.collect.Iterators.ConcatenatedIterator concatenatedIterator = (com.google.common.collect.Iterators.ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new java.util.ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                java.util.Iterator<? extends T> it = this.iterator;
                this.toRemove = it;
                return it.next();
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            java.util.Iterator<? extends T> it = this.toRemove;
            if (it == null) {
                throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.toRemove = null;
        }
    }
}
