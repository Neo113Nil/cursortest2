package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class DescendingMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements com.google.common.collect.SortedMultiset<E> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Comparator<? super E> comparator;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.NavigableSet<E> elementSet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

    abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator();

    abstract com.google.common.collect.SortedMultiset<E> forwardMultiset();

    DescendingMultiset() {
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
        java.util.Comparator<? super E> comparator = this.comparator;
        if (comparator != null) {
            return comparator;
        }
        com.google.common.collect.Ordering reverse = com.google.common.collect.Ordering.from(forwardMultiset().comparator()).reverse();
        this.comparator = reverse;
        return reverse;
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
        java.util.NavigableSet<E> navigableSet = this.elementSet;
        if (navigableSet != null) {
            return navigableSet;
        }
        com.google.common.collect.SortedMultisets.NavigableElementSet navigableElementSet = new com.google.common.collect.SortedMultisets.NavigableElementSet(this);
        this.elementSet = navigableElementSet;
        return navigableElementSet;
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
        return forwardMultiset().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
        return forwardMultiset().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(E e, com.google.common.collect.BoundType boundType) {
        return forwardMultiset().tailMultiset(e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(E e, com.google.common.collect.BoundType boundType, E e2, com.google.common.collect.BoundType boundType2) {
        return forwardMultiset().subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(E e, com.google.common.collect.BoundType boundType) {
        return forwardMultiset().headMultiset(e, boundType).descendingMultiset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public com.google.common.collect.Multiset<E> delegate() {
        return forwardMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
        return forwardMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
        return forwardMultiset().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
        return forwardMultiset().firstEntry();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
        java.util.Set<com.google.common.collect.Multiset.Entry<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
        return new com.google.common.collect.Multisets.EntrySet<E>() { // from class: com.google.common.collect.DescendingMultiset.1EntrySetImpl
            @Override // com.google.common.collect.Multisets.EntrySet
            final com.google.common.collect.Multiset<E> multiset() {
                return com.google.common.collect.DescendingMultiset.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> iterator() {
                return com.google.common.collect.DescendingMultiset.this.entryIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return com.google.common.collect.DescendingMultiset.this.forwardMultiset().entrySet().size();
            }
        };
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
        return standardToArray();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    @Override // com.google.common.collect.ForwardingObject
    public java.lang.String toString() {
        return entrySet().toString();
    }
}
