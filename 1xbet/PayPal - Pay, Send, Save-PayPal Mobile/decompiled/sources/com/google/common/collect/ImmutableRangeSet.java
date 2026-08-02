package com.google.common.collect;

/* loaded from: classes9.dex */
public final class ImmutableRangeSet<C extends java.lang.Comparable> extends com.google.common.collect.AbstractRangeSet<C> implements java.io.Serializable {
    private final transient com.google.common.collect.ImmutableRangeSet<C> complement;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableRangeSet<C> lazyComplement;
    private final transient com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;
    private static final com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> EMPTY = new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.of());
    private static final com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>> ALL = new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.of(com.google.common.collect.Range.all()));

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final /* bridge */ /* synthetic */ boolean enclosesAll(com.google.common.collect.RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final /* bridge */ /* synthetic */ boolean enclosesAll(java.lang.Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public static <E extends java.lang.Comparable<? super E>> java.util.stream.Collector<com.google.common.collect.Range<E>, ?, com.google.common.collect.ImmutableRangeSet<E>> toImmutableRangeSet() {
        return com.google.common.collect.CollectCollectors.toImmutableRangeSet();
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> of() {
        return EMPTY;
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> of(com.google.common.collect.Range<C> range) {
        com.google.common.base.Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return of();
        }
        if (range.equals(com.google.common.collect.Range.all())) {
            return all();
        }
        return new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.of(range));
    }

    static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends java.lang.Comparable> com.google.common.collect.ImmutableRangeSet<C> copyOf(com.google.common.collect.RangeSet<C> rangeSet) {
        com.google.common.base.Preconditions.checkNotNull(rangeSet);
        if (rangeSet.isEmpty()) {
            return of();
        }
        if (rangeSet.encloses(com.google.common.collect.Range.all())) {
            return all();
        }
        if (rangeSet instanceof com.google.common.collect.ImmutableRangeSet) {
            com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet = (com.google.common.collect.ImmutableRangeSet) rangeSet;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new com.google.common.collect.ImmutableRangeSet<>(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) rangeSet.asRanges()));
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet<C> copyOf(java.lang.Iterable<com.google.common.collect.Range<C>> iterable) {
        return new com.google.common.collect.ImmutableRangeSet.Builder().addAll(iterable).build();
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet<C> unionOf(java.lang.Iterable<com.google.common.collect.Range<C>> iterable) {
        return copyOf(com.google.common.collect.TreeRangeSet.create(iterable));
    }

    ImmutableRangeSet(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> immutableList) {
        this(immutableList, null);
    }

    private ImmutableRangeSet(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> immutableList, com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet) {
        this.ranges = immutableList;
        this.complement = immutableRangeSet;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final boolean intersects(com.google.common.collect.Range<C> range) {
        int binarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda1(), range.lowerBound, com.google.common.collect.Ordering.natural(), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (binarySearch < this.ranges.size() && this.ranges.get(binarySearch).isConnected(range) && !this.ranges.get(binarySearch).intersection(range).isEmpty()) {
            return true;
        }
        if (binarySearch <= 0) {
            return false;
        }
        int i = binarySearch - 1;
        return this.ranges.get(i).isConnected(range) && !this.ranges.get(i).intersection(range).isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final boolean encloses(com.google.common.collect.Range<C> range) {
        int binarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda1(), range.lowerBound, com.google.common.collect.Ordering.natural(), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return binarySearch != -1 && this.ranges.get(binarySearch).encloses(range);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final com.google.common.collect.Range<C> rangeContaining(C c) {
        int binarySearch = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda1(), com.google.common.collect.Cut.belowValue(c), com.google.common.collect.Ordering.natural(), com.google.common.collect.SortedLists.KeyPresentBehavior.ANY_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (binarySearch == -1) {
            return null;
        }
        com.google.common.collect.Range<C> range = this.ranges.get(binarySearch);
        if (range.contains(c)) {
            return range;
        }
        return null;
    }

    @Override // com.google.common.collect.RangeSet
    public final com.google.common.collect.Range<C> span() {
        if (this.ranges.isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return com.google.common.collect.Range.create(this.ranges.get(0).lowerBound, this.ranges.get(r1.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public final boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public final void add(com.google.common.collect.Range<C> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public final void addAll(com.google.common.collect.RangeSet<C> rangeSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public final void addAll(java.lang.Iterable<com.google.common.collect.Range<C>> iterable) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public final void remove(com.google.common.collect.Range<C> range) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public final void removeAll(com.google.common.collect.RangeSet<C> rangeSet) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @java.lang.Deprecated
    public final void removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> iterable) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public final com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>> asRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableSet.of();
        }
        return new com.google.common.collect.RegularImmutableSortedSet(this.ranges, com.google.common.collect.Range.rangeLexOrdering());
    }

    @Override // com.google.common.collect.RangeSet
    public final com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>> asDescendingSetOfRanges() {
        if (this.ranges.isEmpty()) {
            return com.google.common.collect.ImmutableSet.of();
        }
        return new com.google.common.collect.RegularImmutableSortedSet(this.ranges.reverse(), com.google.common.collect.Range.rangeLexOrdering().reverse());
    }

    static final class ComplementRanges<C extends java.lang.Comparable> extends com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;
        private final int size;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        ComplementRanges(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> immutableList) {
            this.ranges = immutableList;
            boolean hasLowerBound = immutableList.get(0).hasLowerBound();
            this.positiveBoundedBelow = hasLowerBound;
            boolean hasUpperBound = ((com.google.common.collect.Range) com.google.common.collect.Iterables.getLast(immutableList)).hasUpperBound();
            this.positiveBoundedAbove = hasUpperBound;
            int size = immutableList.size();
            size = hasLowerBound ? size : size - 1;
            this.size = hasUpperBound ? size + 1 : size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.size;
        }

        @Override // java.util.List
        public final com.google.common.collect.Range<C> get(int i) {
            com.google.common.collect.Cut<C> cut;
            com.google.common.collect.Cut<C> cut2;
            com.google.common.base.Preconditions.checkElementIndex(i, this.size);
            if (this.positiveBoundedBelow) {
                cut = i == 0 ? com.google.common.collect.Cut.belowAll() : this.ranges.get(i - 1).upperBound;
            } else {
                cut = this.ranges.get(i).upperBound;
            }
            if (this.positiveBoundedAbove && i == this.size - 1) {
                cut2 = com.google.common.collect.Cut.aboveAll();
            } else {
                cut2 = this.ranges.get(i + (!this.positiveBoundedBelow ? 1 : 0)).lowerBound;
            }
            return com.google.common.collect.Range.create(cut, cut2);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.RangeSet
    public final com.google.common.collect.ImmutableRangeSet<C> complement() {
        com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            return all();
        }
        if (this.ranges.size() == 1 && this.ranges.get(0).equals(com.google.common.collect.Range.all())) {
            return of();
        }
        return lazyComplement();
    }

    private com.google.common.collect.ImmutableRangeSet<C> lazyComplement() {
        com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet = this.lazyComplement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        com.google.common.collect.ImmutableRangeSet<C> immutableRangeSet2 = new com.google.common.collect.ImmutableRangeSet<>(new com.google.common.collect.ImmutableRangeSet.ComplementRanges(this.ranges), this);
        this.lazyComplement = immutableRangeSet2;
        return immutableRangeSet2;
    }

    public final com.google.common.collect.ImmutableRangeSet<C> union(com.google.common.collect.RangeSet<C> rangeSet) {
        return unionOf(com.google.common.collect.Iterables.concat(asRanges(), rangeSet.asRanges()));
    }

    public final com.google.common.collect.ImmutableRangeSet<C> intersection(com.google.common.collect.RangeSet<C> rangeSet) {
        com.google.common.collect.TreeRangeSet create = com.google.common.collect.TreeRangeSet.create(this);
        create.removeAll(rangeSet.complement());
        return copyOf(create);
    }

    public final com.google.common.collect.ImmutableRangeSet<C> difference(com.google.common.collect.RangeSet<C> rangeSet) {
        com.google.common.collect.TreeRangeSet create = com.google.common.collect.TreeRangeSet.create(this);
        create.removeAll(rangeSet);
        return copyOf(create);
    }

    private com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> intersectRanges(final com.google.common.collect.Range<C> range) {
        int size;
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return com.google.common.collect.ImmutableList.of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        final int binarySearch = range.hasLowerBound() ? com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda0(), range.lowerBound, com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_AFTER, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        if (range.hasUpperBound()) {
            size = com.google.common.collect.SortedLists.binarySearch(this.ranges, new com.google.common.collect.ImmutableRangeMap$$ExternalSyntheticLambda1(), range.upperBound, com.google.common.collect.SortedLists.KeyPresentBehavior.FIRST_PRESENT, com.google.common.collect.SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        } else {
            size = this.ranges.size();
        }
        final int i = size - binarySearch;
        if (i == 0) {
            return com.google.common.collect.ImmutableList.of();
        }
        return (com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>) new com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>(this) { // from class: com.google.common.collect.ImmutableRangeSet.1
            final /* synthetic */ com.google.common.collect.ImmutableRangeSet this$0;

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public com.google.common.collect.Range<C> get(int i2) {
                com.google.common.base.Preconditions.checkElementIndex(i2, i);
                return (i2 == 0 || i2 == i + (-1)) ? ((com.google.common.collect.Range) this.this$0.ranges.get(i2 + binarySearch)).intersection(range) : (com.google.common.collect.Range) this.this$0.ranges.get(i2 + binarySearch);
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.RangeSet
    public final com.google.common.collect.ImmutableRangeSet<C> subRangeSet(com.google.common.collect.Range<C> range) {
        if (!isEmpty()) {
            com.google.common.collect.Range<C> span = span();
            if (range.encloses(span)) {
                return this;
            }
            if (range.isConnected(span)) {
                return new com.google.common.collect.ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return of();
    }

    public final com.google.common.collect.ImmutableSortedSet<C> asSet(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
        com.google.common.base.Preconditions.checkNotNull(discreteDomain);
        if (isEmpty()) {
            return com.google.common.collect.ImmutableSortedSet.of();
        }
        com.google.common.collect.Range<C> canonical = span().canonical(discreteDomain);
        if (!canonical.hasLowerBound()) {
            throw new java.lang.IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!canonical.hasUpperBound()) {
            try {
                discreteDomain.maxValue();
            } catch (java.util.NoSuchElementException unused) {
                throw new java.lang.IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new com.google.common.collect.ImmutableRangeSet.AsSet(discreteDomain);
    }

    final class AsSet extends com.google.common.collect.ImmutableSortedSet<C> {
        private final com.google.common.collect.DiscreteDomain<C> domain;

        @com.google.errorprone.annotations.concurrent.LazyInit
        private transient java.lang.Integer size;

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public final /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
            return descendingIterator();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return iterator();
        }

        AsSet(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            super(com.google.common.collect.Ordering.natural());
            this.domain = discreteDomain;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            java.lang.Integer num = this.size;
            if (num == null) {
                java.util.Iterator it = com.google.common.collect.ImmutableRangeSet.this.ranges.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += com.google.common.collect.ContiguousSet.create((com.google.common.collect.Range) it.next(), this.domain).size();
                    if (j >= androidx.collection.SieveCacheKt.NodeLinkMask) {
                        break;
                    }
                }
                num = java.lang.Integer.valueOf(com.google.common.primitives.Ints.saturatedCast(j));
                this.size = num;
            }
            return num.intValue();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final com.google.common.collect.UnmodifiableIterator<C> iterator() {
            return new com.google.common.collect.AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.1
                java.util.Iterator<C> elemItr = com.google.common.collect.Iterators.emptyIterator();
                final java.util.Iterator<com.google.common.collect.Range<C>> rangeItr;

                {
                    this.rangeItr = com.google.common.collect.ImmutableRangeSet.this.ranges.iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public C computeNext() {
                    while (!this.elemItr.hasNext()) {
                        if (this.rangeItr.hasNext()) {
                            this.elemItr = com.google.common.collect.ContiguousSet.create(this.rangeItr.next(), com.google.common.collect.ImmutableRangeSet.AsSet.this.domain).iterator();
                        } else {
                            return (C) endOfData();
                        }
                    }
                    return this.elemItr.next();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public final com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
            return new com.google.common.collect.AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.2
                java.util.Iterator<C> elemItr = com.google.common.collect.Iterators.emptyIterator();
                final java.util.Iterator<com.google.common.collect.Range<C>> rangeItr;

                {
                    this.rangeItr = com.google.common.collect.ImmutableRangeSet.this.ranges.reverse().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                public C computeNext() {
                    while (!this.elemItr.hasNext()) {
                        if (this.rangeItr.hasNext()) {
                            this.elemItr = com.google.common.collect.ContiguousSet.create(this.rangeItr.next(), com.google.common.collect.ImmutableRangeSet.AsSet.this.domain).descendingIterator();
                        } else {
                            return (C) endOfData();
                        }
                    }
                    return this.elemItr.next();
                }
            };
        }

        final com.google.common.collect.ImmutableSortedSet<C> subSet(com.google.common.collect.Range<C> range) {
            return com.google.common.collect.ImmutableRangeSet.this.subRangeSet((com.google.common.collect.Range) range).asSet(this.domain);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        public final com.google.common.collect.ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
            return subSet(com.google.common.collect.Range.upTo(c, com.google.common.collect.BoundType.forBoolean(z)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        public final com.google.common.collect.ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
            if (!z && !z2 && com.google.common.collect.Range.compareOrThrow(c, c2) == 0) {
                return com.google.common.collect.ImmutableSortedSet.of();
            }
            return subSet(com.google.common.collect.Range.range(c, com.google.common.collect.BoundType.forBoolean(z), c2, com.google.common.collect.BoundType.forBoolean(z2)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        public final com.google.common.collect.ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
            return subSet(com.google.common.collect.Range.downTo(c, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return com.google.common.collect.ImmutableRangeSet.this.contains((java.lang.Comparable) obj);
            } catch (java.lang.ClassCastException unused) {
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        final int indexOf(java.lang.Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            java.lang.Comparable comparable = (java.lang.Comparable) java.util.Objects.requireNonNull(obj);
            java.util.Iterator it = com.google.common.collect.ImmutableRangeSet.this.ranges.iterator();
            long j = 0;
            while (it.hasNext()) {
                if (((com.google.common.collect.Range) it.next()).contains(comparable)) {
                    return com.google.common.primitives.Ints.saturatedCast(j + com.google.common.collect.ContiguousSet.create(r3, this.domain).indexOf(comparable));
                }
                j += com.google.common.collect.ContiguousSet.create(r3, this.domain).size();
            }
            throw new java.lang.AssertionError("impossible");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        final com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
            return new com.google.common.collect.DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return com.google.common.collect.ImmutableRangeSet.this.ranges.isPartialView();
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            return com.google.common.collect.ImmutableRangeSet.this.ranges.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return new com.google.common.collect.ImmutableRangeSet.AsSetSerializedForm(com.google.common.collect.ImmutableRangeSet.this.ranges, this.domain);
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
            throw new java.io.InvalidObjectException("Use SerializedForm");
        }
    }

    static final class AsSetSerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private final com.google.common.collect.DiscreteDomain<C> domain;
        private final com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;

        AsSetSerializedForm(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> immutableList, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            this.ranges = immutableList;
            this.domain = discreteDomain;
        }

        final java.lang.Object readResolve() {
            return new com.google.common.collect.ImmutableRangeSet(this.ranges).asSet(this.domain);
        }
    }

    final boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    public static <C extends java.lang.Comparable<?>> com.google.common.collect.ImmutableRangeSet.Builder<C> builder() {
        return new com.google.common.collect.ImmutableRangeSet.Builder<>();
    }

    public static class Builder<C extends java.lang.Comparable<?>> {
        private final java.util.List<com.google.common.collect.Range<C>> ranges = new java.util.ArrayList();

        public com.google.common.collect.ImmutableRangeSet.Builder<C> add(com.google.common.collect.Range<C> range) {
            com.google.common.base.Preconditions.checkArgument(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.ranges.add(range);
            return this;
        }

        public com.google.common.collect.ImmutableRangeSet.Builder<C> addAll(com.google.common.collect.RangeSet<C> rangeSet) {
            return addAll(rangeSet.asRanges());
        }

        public com.google.common.collect.ImmutableRangeSet.Builder<C> addAll(java.lang.Iterable<com.google.common.collect.Range<C>> iterable) {
            java.util.Iterator<com.google.common.collect.Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        com.google.common.collect.ImmutableRangeSet.Builder<C> combine(com.google.common.collect.ImmutableRangeSet.Builder<C> builder) {
            addAll(builder.ranges);
            return this;
        }

        public com.google.common.collect.ImmutableRangeSet<C> build() {
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(this.ranges.size());
            java.util.Collections.sort(this.ranges, com.google.common.collect.Range.rangeLexOrdering());
            com.google.common.collect.PeekingIterator peekingIterator = com.google.common.collect.Iterators.peekingIterator(this.ranges.iterator());
            while (peekingIterator.hasNext()) {
                com.google.common.collect.Range range = (com.google.common.collect.Range) peekingIterator.next();
                while (peekingIterator.hasNext()) {
                    com.google.common.collect.Range<C> range2 = (com.google.common.collect.Range) peekingIterator.peek();
                    if (range.isConnected(range2)) {
                        com.google.common.base.Preconditions.checkArgument(range.intersection(range2).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", range, range2);
                        range = range.span((com.google.common.collect.Range) peekingIterator.next());
                    }
                }
                builder.add((com.google.common.collect.ImmutableList.Builder) range);
            }
            com.google.common.collect.ImmutableList build = builder.build();
            if (build.isEmpty()) {
                return com.google.common.collect.ImmutableRangeSet.of();
            }
            if (build.size() == 1 && ((com.google.common.collect.Range) com.google.common.collect.Iterables.getOnlyElement(build)).equals(com.google.common.collect.Range.all())) {
                return com.google.common.collect.ImmutableRangeSet.all();
            }
            return new com.google.common.collect.ImmutableRangeSet<>(build);
        }
    }

    static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private final com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges;

        SerializedForm(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> immutableList) {
            this.ranges = immutableList;
        }

        final java.lang.Object readResolve() {
            if (this.ranges.isEmpty()) {
                return com.google.common.collect.ImmutableRangeSet.of();
            }
            if (this.ranges.equals(com.google.common.collect.ImmutableList.of(com.google.common.collect.Range.all()))) {
                return com.google.common.collect.ImmutableRangeSet.all();
            }
            return new com.google.common.collect.ImmutableRangeSet(this.ranges);
        }
    }

    final java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableRangeSet.SerializedForm(this.ranges);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }
}
