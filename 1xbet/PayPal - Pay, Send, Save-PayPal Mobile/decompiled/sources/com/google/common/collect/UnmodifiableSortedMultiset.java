package com.google.common.collect;

/* loaded from: classes9.dex */
final class UnmodifiableSortedMultiset<E> extends com.google.common.collect.Multisets.UnmodifiableMultiset<E> implements com.google.common.collect.SortedMultiset<E> {
    private static final long serialVersionUID = 0;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.UnmodifiableSortedMultiset<E> descendingMultiset;

    UnmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
        super(sortedMultiset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final com.google.common.collect.SortedMultiset<E> delegate() {
        return (com.google.common.collect.SortedMultiset) super.delegate();
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final java.util.Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public final java.util.NavigableSet<E> createElementSet() {
        return com.google.common.collect.Sets.unmodifiableNavigableSet(delegate().elementSet());
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final java.util.NavigableSet<E> elementSet() {
        return (java.util.NavigableSet) super.elementSet();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.SortedMultiset<E> descendingMultiset() {
        com.google.common.collect.UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.descendingMultiset;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        com.google.common.collect.UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new com.google.common.collect.UnmodifiableSortedMultiset<>(delegate().descendingMultiset());
        unmodifiableSortedMultiset2.descendingMultiset = this;
        this.descendingMultiset = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.SortedMultiset<E> headMultiset(E e, com.google.common.collect.BoundType boundType) {
        return com.google.common.collect.Multisets.unmodifiableSortedMultiset(delegate().headMultiset(e, boundType));
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.SortedMultiset<E> subMultiset(E e, com.google.common.collect.BoundType boundType, E e2, com.google.common.collect.BoundType boundType2) {
        return com.google.common.collect.Multisets.unmodifiableSortedMultiset(delegate().subMultiset(e, boundType, e2, boundType2));
    }

    @Override // com.google.common.collect.SortedMultiset
    public final com.google.common.collect.SortedMultiset<E> tailMultiset(E e, com.google.common.collect.BoundType boundType) {
        return com.google.common.collect.Multisets.unmodifiableSortedMultiset(delegate().tailMultiset(e, boundType));
    }
}
