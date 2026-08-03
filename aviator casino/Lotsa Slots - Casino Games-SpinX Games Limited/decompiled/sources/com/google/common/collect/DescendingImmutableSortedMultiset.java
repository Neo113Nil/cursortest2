package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class DescendingImmutableSortedMultiset<E> extends com.google.common.collect.ImmutableSortedMultiset<E> {
    private final transient com.google.common.collect.ImmutableSortedMultiset<E> forward;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset headMultiset(java.lang.Object upperBound, com.google.common.collect.BoundType boundType) {
        return headMultiset((com.google.common.collect.DescendingImmutableSortedMultiset<E>) upperBound, boundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset tailMultiset(java.lang.Object lowerBound, com.google.common.collect.BoundType boundType) {
        return tailMultiset((com.google.common.collect.DescendingImmutableSortedMultiset<E>) lowerBound, boundType);
    }

    DescendingImmutableSortedMultiset(com.google.common.collect.ImmutableSortedMultiset<E> forward) {
        this.forward = forward;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object element) {
        return this.forward.count(element);
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
        return this.forward.lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
        return this.forward.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSortedSet<E> elementSet() {
        return this.forward.elementSet().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    com.google.common.collect.Multiset.Entry<E> getEntry(int index) {
        return this.forward.entrySet().asList().reverse().get(index);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> descendingMultiset() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> headMultiset(E upperBound, com.google.common.collect.BoundType boundType) {
        return this.forward.tailMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) upperBound, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public com.google.common.collect.ImmutableSortedMultiset<E> tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType) {
        return this.forward.headMultiset((com.google.common.collect.ImmutableSortedMultiset<E>) lowerBound, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
