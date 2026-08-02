package com.google.common.collect;

/* loaded from: classes9.dex */
final class DescendingImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultiset<E> {
    private final transient com.google.common.collect.ImmutableSortedMultiset<E> forward;

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset descendingMultiset() {
        return descendingMultiset();
    }

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
        return headMultiset((com.google.common.collect.DescendingImmutableSortedMultiset<E>) obj, boundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset tailMultiset(java.lang.Object obj, com.google.common.collect.BoundType boundType) {
        return tailMultiset((com.google.common.collect.DescendingImmutableSortedMultiset<E>) obj, boundType);
    }

    DescendingImmutableSortedMultiset(com.google.common.collect.ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.forward = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(java.lang.Object obj) {
        return this.forward.count(obj);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> firstEntry() {
        return this.forward.lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> lastEntry() {
        return this.forward.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final com.google.common.collect.ImmutableSortedSet<E> elementSet() {
        return this.forward.elementSet().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    final com.google.common.collect.Multiset.Entry<E> getEntry(int i) {
        return this.forward.entrySet().asList().reverse().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E e, com.google.common.collect.BoundType boundType) {
        return this.forward.tailMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E e, com.google.common.collect.BoundType boundType) {
        return this.forward.headMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
