package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ImmutableSortedSet<C> {
    final com.google.common.collect.DiscreteDomain<C> domain;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract com.google.common.collect.ContiguousSet<C> headSetImpl(C c, boolean z);

    public abstract com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> contiguousSet);

    public abstract com.google.common.collect.Range<C> range();

    public abstract com.google.common.collect.Range<C> range(com.google.common.collect.BoundType boundType, com.google.common.collect.BoundType boundType2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract com.google.common.collect.ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract com.google.common.collect.ContiguousSet<C> tailSetImpl(C c, boolean z);

    public static <C extends java.lang.Comparable> com.google.common.collect.ContiguousSet<C> create(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
        com.google.common.base.Preconditions.checkNotNull(range);
        com.google.common.base.Preconditions.checkNotNull(discreteDomain);
        try {
            com.google.common.collect.Range<C> intersection = !range.hasLowerBound() ? range.intersection(com.google.common.collect.Range.atLeast(discreteDomain.minValue())) : range;
            if (!range.hasUpperBound()) {
                intersection = intersection.intersection(com.google.common.collect.Range.atMost(discreteDomain.maxValue()));
            }
            if (intersection.isEmpty() || com.google.common.collect.Range.compareOrThrow((java.lang.Comparable) java.util.Objects.requireNonNull(range.lowerBound.leastValueAbove(discreteDomain)), (java.lang.Comparable) java.util.Objects.requireNonNull(range.upperBound.greatestValueBelow(discreteDomain))) > 0) {
                return new com.google.common.collect.EmptyContiguousSet(discreteDomain);
            }
            return new com.google.common.collect.RegularContiguousSet(intersection, discreteDomain);
        } catch (java.util.NoSuchElementException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Integer> closed(int i, int i2) {
        return create(com.google.common.collect.Range.closed(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)), com.google.common.collect.DiscreteDomain.integers());
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Long> closed(long j, long j2) {
        return create(com.google.common.collect.Range.closed(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)), com.google.common.collect.DiscreteDomain.longs());
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Integer> closedOpen(int i, int i2) {
        return create(com.google.common.collect.Range.closedOpen(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)), com.google.common.collect.DiscreteDomain.integers());
    }

    public static com.google.common.collect.ContiguousSet<java.lang.Long> closedOpen(long j, long j2) {
        return create(com.google.common.collect.Range.closedOpen(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)), com.google.common.collect.DiscreteDomain.longs());
    }

    ContiguousSet(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
        super(com.google.common.collect.Ordering.natural());
        this.domain = discreteDomain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ContiguousSet<C> headSet(C c) {
        return headSetImpl((com.google.common.collect.ContiguousSet<C>) com.google.common.base.Preconditions.checkNotNull(c), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.ContiguousSet<C> headSet(C c, boolean z) {
        return headSetImpl((com.google.common.collect.ContiguousSet<C>) com.google.common.base.Preconditions.checkNotNull(c), z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ContiguousSet<C> subSet(C c, C c2) {
        com.google.common.base.Preconditions.checkNotNull(c);
        com.google.common.base.Preconditions.checkNotNull(c2);
        com.google.common.base.Preconditions.checkArgument(comparator().compare(c, c2) <= 0);
        return subSetImpl((boolean) c, true, (boolean) c2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        com.google.common.base.Preconditions.checkNotNull(c);
        com.google.common.base.Preconditions.checkNotNull(c2);
        com.google.common.base.Preconditions.checkArgument(comparator().compare(c, c2) <= 0);
        return subSetImpl((boolean) c, z, (boolean) c2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public com.google.common.collect.ContiguousSet<C> tailSet(C c) {
        return tailSetImpl((com.google.common.collect.ContiguousSet<C>) com.google.common.base.Preconditions.checkNotNull(c), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public com.google.common.collect.ContiguousSet<C> tailSet(C c, boolean z) {
        return tailSetImpl((com.google.common.collect.ContiguousSet<C>) com.google.common.base.Preconditions.checkNotNull(c), z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
        return new com.google.common.collect.DescendingImmutableSortedSet(this);
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return range().toString();
    }

    @java.lang.Deprecated
    public static <E> com.google.common.collect.ImmutableSortedSet.Builder<E> builder() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
