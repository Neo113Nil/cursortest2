package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableMultiset<E> implements com.google.common.collect.SortedMultiset<E> {
    private static final long serialVersionUID = 912559;

    @com.google.errorprone.annotations.concurrent.LazyInit
    transient com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset;

    static /* synthetic */ int lambda$toImmutableSortedMultiset$0(java.lang.Object obj) {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public abstract com.google.common.collect.ImmutableSortedSet<E> elementSet();

    public abstract com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E e, com.google.common.collect.BoundType boundType);

    public abstract com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E e, com.google.common.collect.BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset headMultiset(java.lang.Object obj, com.google.common.collect.BoundType boundType) {
        return headMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) obj, boundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset subMultiset(java.lang.Object obj, com.google.common.collect.BoundType boundType, java.lang.Object obj2, com.google.common.collect.BoundType boundType2) {
        return subMultiset((com.google.common.collect.BoundType) obj, boundType, (com.google.common.collect.BoundType) obj2, boundType2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset tailMultiset(java.lang.Object obj, com.google.common.collect.BoundType boundType) {
        return tailMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) obj, boundType);
    }

    public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSortedMultiset<E>> toImmutableSortedMultiset(java.util.Comparator<? super E> comparator) {
        return toImmutableSortedMultiset(comparator, java.util.function.Function.identity(), new java.util.function.ToIntFunction() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda4
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(java.lang.Object obj) {
                return com.google.common.collect.ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$0(obj);
            }
        });
    }

    public static <T, E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableSortedMultiset<E>> toImmutableSortedMultiset(final java.util.Comparator<? super E> comparator, final java.util.function.Function<? super T, ? extends E> function, final java.util.function.ToIntFunction<? super T> toIntFunction) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        com.google.common.base.Preconditions.checkNotNull(function);
        com.google.common.base.Preconditions.checkNotNull(toIntFunction);
        return java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                com.google.common.collect.Multiset create;
                create = com.google.common.collect.TreeMultiset.create(comparator);
                return create;
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.common.collect.ImmutableSortedMultiset.mapAndAdd(obj2, (com.google.common.collect.Multiset) obj, function, toIntFunction);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda2
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.common.collect.ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$3((com.google.common.collect.Multiset) obj, (com.google.common.collect.Multiset) obj2);
            }
        }, new java.util.function.Function() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.common.collect.ImmutableSortedMultiset copyOfSortedEntries;
                copyOfSortedEntries = com.google.common.collect.ImmutableSortedMultiset.copyOfSortedEntries(comparator, ((com.google.common.collect.Multiset) obj).entrySet());
                return copyOfSortedEntries;
            }
        }, new java.util.stream.Collector.Characteristics[0]);
    }

    static /* synthetic */ com.google.common.collect.Multiset lambda$toImmutableSortedMultiset$3(com.google.common.collect.Multiset multiset, com.google.common.collect.Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E> void mapAndAdd(T t, com.google.common.collect.Multiset<E> multiset, java.util.function.Function<? super T, ? extends E> function, java.util.function.ToIntFunction<? super T> toIntFunction) {
        multiset.add(com.google.common.base.Preconditions.checkNotNull(function.apply(t)), toIntFunction.applyAsInt(t));
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of() {
        return (com.google.common.collect.ImmutableSortedMultiset<E>) com.google.common.collect.RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable comparable) {
        return new com.google.common.collect.RegularImmutableSortedMultiset((com.google.common.collect.RegularImmutableSortedSet) com.google.common.collect.ImmutableSortedSet.of(comparable), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(comparable, comparable2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable comparable, java.lang.Comparable comparable2, java.lang.Comparable comparable3) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable comparable, java.lang.Comparable comparable2, java.lang.Comparable comparable3, java.lang.Comparable comparable4) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable comparable, java.lang.Comparable comparable2, java.lang.Comparable comparable3, java.lang.Comparable comparable4, java.lang.Comparable comparable5) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset of(java.lang.Comparable comparable, java.lang.Comparable comparable2, java.lang.Comparable comparable3, java.lang.Comparable comparable4, java.lang.Comparable comparable5, java.lang.Comparable comparable6, java.lang.Comparable... comparableArr) {
        java.util.ArrayList newArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(comparableArr.length + 6);
        java.util.Collections.addAll(newArrayListWithCapacity, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        java.util.Collections.addAll(newArrayListWithCapacity, comparableArr);
        return copyOf(com.google.common.collect.Ordering.natural(), newArrayListWithCapacity);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static com.google.common.collect.ImmutableSortedMultiset copyOf(java.lang.Comparable[] comparableArr) {
        return copyOf(com.google.common.collect.Ordering.natural(), java.util.Arrays.asList(comparableArr));
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.lang.Iterable<? extends E> iterable) {
        return copyOf(com.google.common.collect.Ordering.natural(), iterable);
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Iterator<? extends E> it) {
        return copyOf(com.google.common.collect.Ordering.natural(), it);
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> comparator, java.util.Iterator<? extends E> it) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        return new com.google.common.collect.ImmutableSortedMultiset.Builder(comparator).addAll((java.util.Iterator) it).build();
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOf(java.util.Comparator<? super E> comparator, java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof com.google.common.collect.ImmutableSortedMultiset) {
            com.google.common.collect.ImmutableSortedMultiset<E> immutableSortedMultiset = (com.google.common.collect.ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new com.google.common.collect.ImmutableSortedMultiset.Builder(comparator).addAll((java.lang.Iterable) iterable).build();
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSorted(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
        return copyOfSortedEntries(sortedMultiset.comparator(), new java.util.ArrayList(sortedMultiset.entrySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> copyOfSortedEntries(java.util.Comparator<? super E> comparator, java.util.Collection<com.google.common.collect.Multiset.Entry<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(collection.size());
        long[] jArr = new long[collection.size() + 1];
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            builder.add((com.google.common.collect.ImmutableList.Builder) it.next().getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + r5.getCount();
            i = i2;
        }
        return new com.google.common.collect.RegularImmutableSortedMultiset(new com.google.common.collect.RegularImmutableSortedSet(builder.build(), comparator), jArr, 0, collection.size());
    }

    static <E> com.google.common.collect.ImmutableSortedMultiset<E> emptyMultiset(java.util.Comparator<? super E> comparator) {
        if (com.google.common.collect.Ordering.natural().equals(comparator)) {
            return (com.google.common.collect.ImmutableSortedMultiset<E>) com.google.common.collect.RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
        }
        return new com.google.common.collect.RegularImmutableSortedMultiset(comparator);
    }

    ImmutableSortedMultiset() {
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final java.util.Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset() {
        com.google.common.collect.ImmutableSortedMultiset<E> immutableSortedMultiset = this.descendingMultiset;
        if (immutableSortedMultiset == null) {
            if (isEmpty()) {
                immutableSortedMultiset = emptyMultiset(com.google.common.collect.Ordering.from(comparator()).reverse());
            } else {
                immutableSortedMultiset = new com.google.common.collect.DescendingImmutableSortedMultiset<>(this);
            }
            this.descendingMultiset = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }

    @Override // com.google.common.collect.SortedMultiset
    @java.lang.Deprecated
    public final com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @java.lang.Deprecated
    public final com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> subMultiset(E e, com.google.common.collect.BoundType boundType, E e2, com.google.common.collect.BoundType boundType2) {
        com.google.common.base.Preconditions.checkArgument(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) e, boundType).headMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) e2, boundType2);
    }

    public static <E> com.google.common.collect.ImmutableSortedMultiset.Builder<E> orderedBy(java.util.Comparator<E> comparator) {
        return new com.google.common.collect.ImmutableSortedMultiset.Builder<>(comparator);
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedMultiset.Builder<E> reverseOrder() {
        return new com.google.common.collect.ImmutableSortedMultiset.Builder<>(com.google.common.collect.Ordering.natural().reverse());
    }

    public static <E extends java.lang.Comparable<?>> com.google.common.collect.ImmutableSortedMultiset.Builder<E> naturalOrder() {
        return new com.google.common.collect.ImmutableSortedMultiset.Builder<>(com.google.common.collect.Ordering.natural());
    }

    public static class Builder<E> extends com.google.common.collect.ImmutableMultiset.Builder<E> {
        private final java.util.Comparator<? super E> comparator;
        private int[] counts;
        E[] elements;
        private boolean forceCopyElements;
        private int length;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder addCopies(java.lang.Object obj, int i) {
            return addCopies((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMultiset.Builder setCount(java.lang.Object obj, int i) {
            return setCount((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) obj, i);
        }

        public Builder(java.util.Comparator<? super E> comparator) {
            super(true);
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
            this.elements = (E[]) new java.lang.Object[4];
            this.counts = new int[4];
        }

        private void maintenance() {
            int i = this.length;
            E[] eArr = this.elements;
            if (i == eArr.length) {
                dedupAndCoalesce(true);
            } else if (this.forceCopyElements) {
                this.elements = (E[]) java.util.Arrays.copyOf(eArr, eArr.length);
            }
            this.forceCopyElements = false;
        }

        private void dedupAndCoalesce(boolean z) {
            int i = this.length;
            if (i == 0) {
                return;
            }
            java.lang.Object[] objArr = (E[]) java.util.Arrays.copyOf(this.elements, i);
            java.util.Arrays.sort(objArr, this.comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.comparator.compare((java.lang.Object) objArr[i2 - 1], (java.lang.Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            java.util.Arrays.fill(objArr, i2, this.length, (java.lang.Object) null);
            if (z) {
                int i4 = this.length;
                if (i2 * 4 > i4 * 3) {
                    objArr = (E[]) java.util.Arrays.copyOf(objArr, com.google.common.math.IntMath.saturatedAdd(i4, (i4 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i5 = 0; i5 < this.length; i5++) {
                int binarySearch = java.util.Arrays.binarySearch(objArr, 0, i2, this.elements[i5], this.comparator);
                int i6 = this.counts[i5];
                if (i6 >= 0) {
                    iArr[binarySearch] = iArr[binarySearch] + i6;
                } else {
                    iArr[binarySearch] = ~i6;
                }
            }
            this.elements = (E[]) objArr;
            this.counts = iArr;
            this.length = i2;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> add(E e) {
            return addCopies((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) e, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> add(E... eArr) {
            for (E e : eArr) {
                add((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addCopies(E e, int i) {
            com.google.common.base.Preconditions.checkNotNull(e);
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return this;
            }
            maintenance();
            E[] eArr = this.elements;
            int i2 = this.length;
            eArr[i2] = e;
            this.counts[i2] = i;
            this.length = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> setCount(E e, int i) {
            com.google.common.base.Preconditions.checkNotNull(e);
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
            maintenance();
            E[] eArr = this.elements;
            int i2 = this.length;
            eArr[i2] = e;
            this.counts[i2] = ~i;
            this.length = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addAll(java.lang.Iterable<? extends E> iterable) {
            if (iterable instanceof com.google.common.collect.Multiset) {
                for (com.google.common.collect.Multiset.Entry<E> entry : ((com.google.common.collect.Multiset) iterable).entrySet()) {
                    addCopies((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) entry.getElement(), entry.getCount());
                }
            } else {
                java.util.Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset.Builder<E> addAll(java.util.Iterator<? extends E> it) {
            while (it.hasNext()) {
                add((com.google.common.collect.ImmutableSortedMultiset.Builder<E>) it.next());
            }
            return this;
        }

        private void dedupAndCoalesceAndDeleteEmpty() {
            dedupAndCoalesce(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.length;
                if (i < i3) {
                    int[] iArr = this.counts;
                    int i4 = iArr[i];
                    if (i4 > 0) {
                        E[] eArr = this.elements;
                        eArr[i2] = eArr[i];
                        iArr[i2] = i4;
                        i2++;
                    }
                    i++;
                } else {
                    java.util.Arrays.fill(this.elements, i2, i3, (java.lang.Object) null);
                    java.util.Arrays.fill(this.counts, i2, this.length, 0);
                    this.length = i2;
                    return;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSortedMultiset<E> build() {
            dedupAndCoalesceAndDeleteEmpty();
            int i = this.length;
            if (i == 0) {
                return com.google.common.collect.ImmutableSortedMultiset.emptyMultiset(this.comparator);
            }
            com.google.common.collect.RegularImmutableSortedSet regularImmutableSortedSet = (com.google.common.collect.RegularImmutableSortedSet) com.google.common.collect.ImmutableSortedSet.construct(this.comparator, i, this.elements);
            long[] jArr = new long[this.length + 1];
            int i2 = 0;
            while (i2 < this.length) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + this.counts[i2];
                i2 = i3;
            }
            this.forceCopyElements = true;
            return new com.google.common.collect.RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.length);
        }
    }

    static final class SerializedForm<E> implements java.io.Serializable {
        final java.util.Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        SerializedForm(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
            this.comparator = sortedMultiset.comparator();
            int size = sortedMultiset.entrySet().size();
            this.elements = (E[]) new java.lang.Object[size];
            this.counts = new int[size];
            int i = 0;
            for (com.google.common.collect.Multiset.Entry<E> entry : sortedMultiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        final java.lang.Object readResolve() {
            int length = this.elements.length;
            com.google.common.collect.ImmutableSortedMultiset.Builder builder = new com.google.common.collect.ImmutableSortedMultiset.Builder(this.comparator);
            for (int i = 0; i < length; i++) {
                builder.addCopies((com.google.common.collect.ImmutableSortedMultiset.Builder) this.elements[i], this.counts[i]);
            }
            return builder.build();
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableSortedMultiset.SerializedForm(this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @java.lang.Deprecated
    public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <T, E> java.util.stream.Collector<T, ?, com.google.common.collect.ImmutableMultiset<E>> toImmutableMultiset(java.util.function.Function<? super T, ? extends E> function, java.util.function.ToIntFunction<? super T> toIntFunction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset.Builder<E> builder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e, E e2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e, E e2, E e3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static <Z> com.google.common.collect.ImmutableSortedMultiset<Z> copyOf(Z[] zArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
