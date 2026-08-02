package com.google.common.collect;

/* loaded from: classes9.dex */
final class RegularImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultiset<E> {
    private final transient long[] cumulativeCounts;
    final transient com.google.common.collect.RegularImmutableSortedSet<E> elementSet;
    private final transient int length;
    private final transient int offset;
    private static final long[] zeroCumulativeCounts = {0};
    static final com.google.common.collect.ImmutableSortedMultiset<?> NATURAL_EMPTY_MULTISET = new com.google.common.collect.RegularImmutableSortedMultiset(com.google.common.collect.Ordering.natural());

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableSet elementSet() {
        return elementSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
        return elementSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return elementSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.SortedSet elementSet() {
        return elementSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset headMultiset(java.lang.Object obj, com.google.common.collect.BoundType boundType) {
        return headMultiset((com.google.common.collect.RegularImmutableSortedMultiset<E>) obj, boundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset tailMultiset(java.lang.Object obj, com.google.common.collect.BoundType boundType) {
        return tailMultiset((com.google.common.collect.RegularImmutableSortedMultiset<E>) obj, boundType);
    }

    RegularImmutableSortedMultiset(java.util.Comparator<? super E> comparator) {
        this.elementSet = com.google.common.collect.ImmutableSortedSet.emptySet(comparator);
        this.cumulativeCounts = zeroCumulativeCounts;
        this.offset = 0;
        this.length = 0;
    }

    RegularImmutableSortedMultiset(com.google.common.collect.RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.elementSet = regularImmutableSortedSet;
        this.cumulativeCounts = jArr;
        this.offset = i;
        this.length = i2;
    }

    private int getCount(int i) {
        long[] jArr = this.cumulativeCounts;
        int i2 = this.offset + i;
        return (int) (jArr[i2 + 1] - jArr[i2]);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    final com.google.common.collect.Multiset.Entry<E> getEntry(int i) {
        return com.google.common.collect.Multisets.immutableEntry(this.elementSet.asList().get(i), getCount(i));
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.length - 1);
    }

    @Override // com.google.common.collect.Multiset
    public final int count(java.lang.Object obj) {
        int indexOf = this.elementSet.indexOf(obj);
        if (indexOf >= 0) {
            return getCount(indexOf);
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        long[] jArr = this.cumulativeCounts;
        int i = this.offset;
        return com.google.common.primitives.Ints.saturatedCast(jArr[this.length + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final com.google.common.collect.ImmutableSortedSet<E> elementSet() {
        return this.elementSet;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E e, com.google.common.collect.BoundType boundType) {
        return getSubMultiset(0, this.elementSet.headIndex(e, com.google.common.base.Preconditions.checkNotNull(boundType) == com.google.common.collect.BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E e, com.google.common.collect.BoundType boundType) {
        return getSubMultiset(this.elementSet.tailIndex(e, com.google.common.base.Preconditions.checkNotNull(boundType) == com.google.common.collect.BoundType.CLOSED), this.length);
    }

    final com.google.common.collect.ImmutableSortedMultiset<E> getSubMultiset(int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, this.length);
        if (i == i2) {
            return emptyMultiset(comparator());
        }
        return (i == 0 && i2 == this.length) ? this : new com.google.common.collect.RegularImmutableSortedMultiset(this.elementSet.getSubSet(i, i2), this.cumulativeCounts, this.offset + i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return this.offset > 0 || this.length < this.cumulativeCounts.length - 1;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
