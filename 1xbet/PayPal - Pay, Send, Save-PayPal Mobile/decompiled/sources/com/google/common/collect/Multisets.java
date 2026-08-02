package com.google.common.collect;

/* loaded from: classes9.dex */
public final class Multisets {
    private Multisets() {
    }

    public static <T, E, M extends com.google.common.collect.Multiset<E>> java.util.stream.Collector<T, ?, M> toMultiset(java.util.function.Function<? super T, E> function, java.util.function.ToIntFunction<? super T> toIntFunction, java.util.function.Supplier<M> supplier) {
        return com.google.common.collect.CollectCollectors.toMultiset(function, toIntFunction, supplier);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.Multiset<? extends E> multiset) {
        return ((multiset instanceof com.google.common.collect.Multisets.UnmodifiableMultiset) || (multiset instanceof com.google.common.collect.ImmutableMultiset)) ? multiset : new com.google.common.collect.Multisets.UnmodifiableMultiset((com.google.common.collect.Multiset) com.google.common.base.Preconditions.checkNotNull(multiset));
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.Multiset<E> unmodifiableMultiset(com.google.common.collect.ImmutableMultiset<E> immutableMultiset) {
        return (com.google.common.collect.Multiset) com.google.common.base.Preconditions.checkNotNull(immutableMultiset);
    }

    static class UnmodifiableMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.Multiset<? extends E> delegate;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<E> elementSet;

        @com.google.errorprone.annotations.concurrent.LazyInit
        transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

        UnmodifiableMultiset(com.google.common.collect.Multiset<? extends E> multiset) {
            this.delegate = multiset;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public com.google.common.collect.Multiset<E> delegate() {
            return this.delegate;
        }

        java.util.Set<E> createElementSet() {
            return java.util.Collections.unmodifiableSet(this.delegate.elementSet());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public java.util.Set<E> elementSet() {
            java.util.Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            java.util.Set<E> createElementSet = createElementSet();
            this.elementSet = createElementSet;
            return createElementSet;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
            java.util.Set<com.google.common.collect.Multiset.Entry<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            java.util.Set<com.google.common.collect.Multiset.Entry<E>> unmodifiableSet = java.util.Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = unmodifiableSet;
            return unmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(E e, int i) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(java.lang.Object obj, int i) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(E e, int i) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(E e, int i, int i2) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public static <E> com.google.common.collect.SortedMultiset<E> unmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
        return new com.google.common.collect.UnmodifiableSortedMultiset((com.google.common.collect.SortedMultiset) com.google.common.base.Preconditions.checkNotNull(sortedMultiset));
    }

    public static <E> com.google.common.collect.Multiset.Entry<E> immutableEntry(E e, int i) {
        return new com.google.common.collect.Multisets.ImmutableEntry(e, i);
    }

    static class ImmutableEntry<E> extends com.google.common.collect.Multisets.AbstractEntry<E> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public com.google.common.collect.Multisets.ImmutableEntry<E> nextInBucket() {
            return null;
        }

        ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final E getElement() {
            return this.element;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.count;
        }
    }

    public static <E> com.google.common.collect.Multiset<E> filter(com.google.common.collect.Multiset<E> multiset, com.google.common.base.Predicate<? super E> predicate) {
        if (multiset instanceof com.google.common.collect.Multisets.FilteredMultiset) {
            com.google.common.collect.Multisets.FilteredMultiset filteredMultiset = (com.google.common.collect.Multisets.FilteredMultiset) multiset;
            return new com.google.common.collect.Multisets.FilteredMultiset(filteredMultiset.unfiltered, com.google.common.base.Predicates.and(filteredMultiset.predicate, predicate));
        }
        return new com.google.common.collect.Multisets.FilteredMultiset(multiset, predicate);
    }

    static final class FilteredMultiset<E> extends com.google.common.collect.Multisets.ViewMultiset<E> {
        final com.google.common.base.Predicate<? super E> predicate;
        final com.google.common.collect.Multiset<E> unfiltered;

        FilteredMultiset(com.google.common.collect.Multiset<E> multiset, com.google.common.base.Predicate<? super E> predicate) {
            super();
            this.unfiltered = (com.google.common.collect.Multiset) com.google.common.base.Preconditions.checkNotNull(multiset);
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public final com.google.common.collect.UnmodifiableIterator<E> iterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset
        final java.util.Set<E> createElementSet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.elementSet(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset
        final java.util.Iterator<E> elementIterator() {
            throw new java.lang.AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        final java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
            return com.google.common.collect.Sets.filter(this.unfiltered.entrySet(), new com.google.common.base.Predicate() { // from class: com.google.common.collect.Multisets$FilteredMultiset$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return com.google.common.collect.Multisets.FilteredMultiset.this.m10317xe1ddd306((com.google.common.collect.Multiset.Entry) obj);
                }
            });
        }

        /* renamed from: lambda$createEntrySet$0$com-google-common-collect-Multisets$FilteredMultiset, reason: not valid java name */
        final /* synthetic */ boolean m10317xe1ddd306(com.google.common.collect.Multiset.Entry entry) {
            return this.predicate.apply((java.lang.Object) entry.getElement());
        }

        @Override // com.google.common.collect.AbstractMultiset
        final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
            throw new java.lang.AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multiset
        public final int count(java.lang.Object obj) {
            int count = this.unfiltered.count(obj);
            if (count <= 0 || !this.predicate.apply(obj)) {
                return 0;
            }
            return count;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int add(E e, int i) {
            com.google.common.base.Preconditions.checkArgument(this.predicate.apply(e), "Element %s does not match predicate %s", e, this.predicate);
            return this.unfiltered.add(e, i);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int remove(java.lang.Object obj, int i) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.unfiltered.remove(obj, i);
            }
            return 0;
        }
    }

    static int inferDistinctElements(java.lang.Iterable<?> iterable) {
        if (iterable instanceof com.google.common.collect.Multiset) {
            return ((com.google.common.collect.Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    public static <E> com.google.common.collect.Multiset<E> union(final com.google.common.collect.Multiset<? extends E> multiset, final com.google.common.collect.Multiset<? extends E> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(java.lang.Object obj) {
                return com.google.common.collect.Multiset.this.contains(obj) || multiset2.contains(obj);
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return com.google.common.collect.Multiset.this.isEmpty() && multiset2.isEmpty();
            }

            @Override // com.google.common.collect.Multiset
            public int count(java.lang.Object obj) {
                return java.lang.Math.max(com.google.common.collect.Multiset.this.count(obj), multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Set<E> createElementSet() {
                return com.google.common.collect.Sets.union(com.google.common.collect.Multiset.this.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                throw new java.lang.AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = com.google.common.collect.Multiset.this.entrySet().iterator();
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                final com.google.common.collect.Multiset multiset3 = multiset2;
                final com.google.common.collect.Multiset multiset4 = com.google.common.collect.Multiset.this;
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.1.1
                    final /* synthetic */ com.google.common.collect.Multisets.AnonymousClass1 this$0;

                    {
                        this.this$0 = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        if (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            return com.google.common.collect.Multisets.immutableEntry(element, java.lang.Math.max(entry.getCount(), multiset3.count(element)));
                        }
                        while (it2.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry2 = (com.google.common.collect.Multiset.Entry) it2.next();
                            java.lang.Object element2 = entry2.getElement();
                            if (!multiset4.contains(element2)) {
                                return com.google.common.collect.Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    public static <E> com.google.common.collect.Multiset<E> intersection(final com.google.common.collect.Multiset<E> multiset, final com.google.common.collect.Multiset<?> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multiset
            public int count(java.lang.Object obj) {
                int count = com.google.common.collect.Multiset.this.count(obj);
                if (count == 0) {
                    return 0;
                }
                return java.lang.Math.min(count, multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Set<E> createElementSet() {
                return com.google.common.collect.Sets.intersection(com.google.common.collect.Multiset.this.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                throw new java.lang.AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = com.google.common.collect.Multiset.this.entrySet().iterator();
                final com.google.common.collect.Multiset multiset3 = multiset2;
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.2.1
                    final /* synthetic */ com.google.common.collect.Multisets.AnonymousClass2 this$0;

                    {
                        this.this$0 = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            int min = java.lang.Math.min(entry.getCount(), multiset3.count(element));
                            if (min > 0) {
                                return com.google.common.collect.Multisets.immutableEntry(element, min);
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    public static <E> com.google.common.collect.Multiset<E> sum(final com.google.common.collect.Multiset<? extends E> multiset, final com.google.common.collect.Multiset<? extends E> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(java.lang.Object obj) {
                return com.google.common.collect.Multiset.this.contains(obj) || multiset2.contains(obj);
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return com.google.common.collect.Multiset.this.isEmpty() && multiset2.isEmpty();
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public int size() {
                return com.google.common.math.IntMath.saturatedAdd(com.google.common.collect.Multiset.this.size(), multiset2.size());
            }

            @Override // com.google.common.collect.Multiset
            public int count(java.lang.Object obj) {
                return com.google.common.collect.Multiset.this.count(obj) + multiset2.count(obj);
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Set<E> createElementSet() {
                return com.google.common.collect.Sets.union(com.google.common.collect.Multiset.this.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                throw new java.lang.AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = com.google.common.collect.Multiset.this.entrySet().iterator();
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                final com.google.common.collect.Multiset multiset3 = multiset2;
                final com.google.common.collect.Multiset multiset4 = com.google.common.collect.Multiset.this;
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.3.1
                    final /* synthetic */ com.google.common.collect.Multisets.AnonymousClass3 this$0;

                    {
                        this.this$0 = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        if (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            return com.google.common.collect.Multisets.immutableEntry(element, entry.getCount() + multiset3.count(element));
                        }
                        while (it2.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry2 = (com.google.common.collect.Multiset.Entry) it2.next();
                            java.lang.Object element2 = entry2.getElement();
                            if (!multiset4.contains(element2)) {
                                return com.google.common.collect.Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    public static <E> com.google.common.collect.Multiset<E> difference(final com.google.common.collect.Multiset<E> multiset, final com.google.common.collect.Multiset<?> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        return new com.google.common.collect.Multisets.ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multiset
            public int count(java.lang.Object obj) {
                int count = com.google.common.collect.Multiset.this.count(obj);
                if (count == 0) {
                    return 0;
                }
                return java.lang.Math.max(0, count - multiset2.count(obj));
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public void clear() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<E> elementIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = com.google.common.collect.Multiset.this.entrySet().iterator();
                final com.google.common.collect.Multiset multiset3 = multiset2;
                return new com.google.common.collect.AbstractIterator<E>(this) { // from class: com.google.common.collect.Multisets.4.1
                    final /* synthetic */ com.google.common.collect.Multisets.AnonymousClass4 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            E e = (E) entry.getElement();
                            if (entry.getCount() > multiset3.count(e)) {
                                return e;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = com.google.common.collect.Multiset.this.entrySet().iterator();
                final com.google.common.collect.Multiset multiset3 = multiset2;
                return new com.google.common.collect.AbstractIterator<com.google.common.collect.Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.4.2
                    final /* synthetic */ com.google.common.collect.Multisets.AnonymousClass4 this$0;

                    {
                        this.this$0 = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    public com.google.common.collect.Multiset.Entry<E> computeNext() {
                        while (it.hasNext()) {
                            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) it.next();
                            java.lang.Object element = entry.getElement();
                            int count = entry.getCount() - multiset3.count(element);
                            if (count > 0) {
                                return com.google.common.collect.Multisets.immutableEntry(element, count);
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
            int distinctElements() {
                return com.google.common.collect.Iterators.size(entryIterator());
            }
        };
    }

    public static boolean containsOccurrences(com.google.common.collect.Multiset<?> multiset, com.google.common.collect.Multiset<?> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        for (com.google.common.collect.Multiset.Entry<?> entry : multiset2.entrySet()) {
            if (multiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static boolean retainOccurrences(com.google.common.collect.Multiset<?> multiset, com.google.common.collect.Multiset<?> multiset2) {
        return retainOccurrencesImpl(multiset, multiset2);
    }

    private static <E> boolean retainOccurrencesImpl(com.google.common.collect.Multiset<E> multiset, com.google.common.collect.Multiset<?> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.google.common.collect.Multiset.Entry<E> next = it.next();
            int count = multiset2.count(next.getElement());
            if (count == 0) {
                it.remove();
            } else if (count < next.getCount()) {
                multiset.setCount(next.getElement(), count);
            }
            z = true;
        }
        return z;
    }

    public static boolean removeOccurrences(com.google.common.collect.Multiset<?> multiset, java.lang.Iterable<?> iterable) {
        if (iterable instanceof com.google.common.collect.Multiset) {
            return removeOccurrences(multiset, (com.google.common.collect.Multiset<?>) iterable);
        }
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(iterable);
        java.util.Iterator<?> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= multiset.remove(it.next());
        }
        return z;
    }

    public static boolean removeOccurrences(com.google.common.collect.Multiset<?> multiset, com.google.common.collect.Multiset<?> multiset2) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(multiset2);
        java.util.Iterator<com.google.common.collect.Multiset.Entry<?>> it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.google.common.collect.Multiset.Entry<?> next = it.next();
            int count = multiset2.count(next.getElement());
            if (count >= next.getCount()) {
                it.remove();
            } else if (count > 0) {
                multiset.remove(next.getElement(), count);
            }
            z = true;
        }
        return z;
    }

    static abstract class AbstractEntry<E> implements com.google.common.collect.Multiset.Entry<E> {
        AbstractEntry() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.collect.Multiset.Entry)) {
                return false;
            }
            com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) obj;
            return getCount() == entry.getCount() && java.util.Objects.equals(getElement(), entry.getElement());
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public java.lang.String toString() {
            java.lang.String valueOf = java.lang.String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    static boolean equalsImpl(com.google.common.collect.Multiset<?> multiset, java.lang.Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof com.google.common.collect.Multiset) {
            com.google.common.collect.Multiset multiset2 = (com.google.common.collect.Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (com.google.common.collect.Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> multiset, java.util.Collection<? extends E> collection) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        com.google.common.base.Preconditions.checkNotNull(collection);
        if (collection instanceof com.google.common.collect.Multiset) {
            return addAllImpl((com.google.common.collect.Multiset) multiset, (com.google.common.collect.Multiset) collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        return com.google.common.collect.Iterators.addAll(multiset, collection.iterator());
    }

    private static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> multiset, com.google.common.collect.Multiset<? extends E> multiset2) {
        if (multiset2 instanceof com.google.common.collect.AbstractMapBasedMultiset) {
            return addAllImpl((com.google.common.collect.Multiset) multiset, (com.google.common.collect.AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (com.google.common.collect.Multiset.Entry<? extends E> entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    private static <E> boolean addAllImpl(com.google.common.collect.Multiset<E> multiset, com.google.common.collect.AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(multiset);
        return true;
    }

    static boolean removeAllImpl(com.google.common.collect.Multiset<?> multiset, java.util.Collection<?> collection) {
        if (collection instanceof com.google.common.collect.Multiset) {
            collection = ((com.google.common.collect.Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    static boolean retainAllImpl(com.google.common.collect.Multiset<?> multiset, java.util.Collection<?> collection) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        if (collection instanceof com.google.common.collect.Multiset) {
            collection = ((com.google.common.collect.Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    static <E> int setCountImpl(com.google.common.collect.Multiset<E> multiset, E e, int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
        int count = multiset.count(e);
        int i2 = i - count;
        if (i2 > 0) {
            multiset.add(e, i2);
            return count;
        }
        if (i2 < 0) {
            multiset.remove(e, -i2);
        }
        return count;
    }

    static <E> boolean setCountImpl(com.google.common.collect.Multiset<E> multiset, E e, int i, int i2) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "oldCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(i2, "newCount");
        if (multiset.count(e) != i) {
            return false;
        }
        multiset.setCount(e, i2);
        return true;
    }

    static <E> java.util.Iterator<E> elementIterator(java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it) {
        return new com.google.common.collect.TransformedIterator<com.google.common.collect.Multiset.Entry<E>, E>(it) { // from class: com.google.common.collect.Multisets.5
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public E transform(com.google.common.collect.Multiset.Entry<E> entry) {
                return entry.getElement();
            }
        };
    }

    static abstract class ElementSet<E> extends com.google.common.collect.Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract java.util.Iterator<E> iterator();

        abstract com.google.common.collect.Multiset<E> multiset();

        ElementSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return multiset().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> collection) {
            return multiset().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return multiset().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            return multiset().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return multiset().entrySet().size();
        }
    }

    static abstract class EntrySet<E> extends com.google.common.collect.Sets.ImprovedAbstractSet<com.google.common.collect.Multiset.Entry<E>> {
        abstract com.google.common.collect.Multiset<E> multiset();

        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Multiset.Entry) {
                com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) obj;
                if (entry.getCount() > 0 && multiset().count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            if (obj instanceof com.google.common.collect.Multiset.Entry) {
                com.google.common.collect.Multiset.Entry entry = (com.google.common.collect.Multiset.Entry) obj;
                java.lang.Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return multiset().setCount(element, count, 0);
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }
    }

    static <E> java.util.Iterator<E> iteratorImpl(com.google.common.collect.Multiset<E> multiset) {
        return new com.google.common.collect.Multisets.MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static final class MultisetIteratorImpl<E> implements java.util.Iterator<E> {
        private boolean canRemove;
        private com.google.common.collect.Multiset.Entry<E> currentEntry;
        private final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator;
        private int laterCount;
        private final com.google.common.collect.Multiset<E> multiset;
        private int totalCount;

        MultisetIteratorImpl(com.google.common.collect.Multiset<E> multiset, java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it) {
            this.multiset = multiset;
            this.entryIterator = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.laterCount > 0 || this.entryIterator.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            if (this.laterCount == 0) {
                com.google.common.collect.Multiset.Entry<E> next = this.entryIterator.next();
                this.currentEntry = next;
                int count = next.getCount();
                this.laterCount = count;
                this.totalCount = count;
            }
            this.laterCount--;
            this.canRemove = true;
            return (E) ((com.google.common.collect.Multiset.Entry) java.util.Objects.requireNonNull(this.currentEntry)).getElement();
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.canRemove);
            if (this.totalCount == 1) {
                this.entryIterator.remove();
            } else {
                this.multiset.remove(((com.google.common.collect.Multiset.Entry) java.util.Objects.requireNonNull(this.currentEntry)).getElement());
            }
            this.totalCount--;
            this.canRemove = false;
        }
    }

    static int linearTimeSizeImpl(com.google.common.collect.Multiset<?> multiset) {
        long j = 0;
        while (multiset.entrySet().iterator().hasNext()) {
            j += r4.next().getCount();
        }
        return com.google.common.primitives.Ints.saturatedCast(j);
    }

    public static <E> com.google.common.collect.ImmutableMultiset<E> copyHighestCountFirst(com.google.common.collect.Multiset<E> multiset) {
        com.google.common.collect.Multiset.Entry[] entryArr = (com.google.common.collect.Multiset.Entry[]) multiset.entrySet().toArray(new com.google.common.collect.Multiset.Entry[0]);
        java.util.Arrays.sort(entryArr, com.google.common.collect.Multisets.DecreasingCount.INSTANCE);
        return com.google.common.collect.ImmutableMultiset.copyFromEntries(java.util.Arrays.asList(entryArr));
    }

    static final class DecreasingCount implements java.util.Comparator<com.google.common.collect.Multiset.Entry<?>> {
        static final java.util.Comparator<com.google.common.collect.Multiset.Entry<?>> INSTANCE = new com.google.common.collect.Multisets.DecreasingCount();

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public final int compare(com.google.common.collect.Multiset.Entry<?> entry, com.google.common.collect.Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    static abstract class ViewMultiset<E> extends com.google.common.collect.AbstractMultiset<E> {
        private ViewMultiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return com.google.common.collect.Multisets.linearTimeSizeImpl(this);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Multisets.iteratorImpl(this);
        }

        @Override // com.google.common.collect.AbstractMultiset
        int distinctElements() {
            return elementSet().size();
        }
    }
}
