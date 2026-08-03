package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class AbstractSortedMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements com.google.common.collect.SortedMultiset<E> {

    @com.google.common.collect.GwtTransient
    final java.util.Comparator<? super E> comparator;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.SortedMultiset<E> descendingMultiset;

    abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator();

    AbstractSortedMultiset() {
        this(com.google.common.collect.Ordering.natural());
    }

    AbstractSortedMultiset(java.util.Comparator<? super E> comparator) {
        this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
        return (java.util.NavigableSet) super.elementSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultiset
    public java.util.NavigableSet<E> createElementSet() {
        return new com.google.common.collect.SortedMultisets.NavigableElementSet(this);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
        return this.comparator;
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator = entryIterator();
        if (entryIterator.hasNext()) {
            return entryIterator.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator = descendingEntryIterator();
        if (descendingEntryIterator.hasNext()) {
            return descendingEntryIterator.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator = entryIterator();
        if (!entryIterator.hasNext()) {
            return null;
        }
        com.google.common.collect.Multiset.Entry<E> next = entryIterator.next();
        com.google.common.collect.Multiset.Entry<E> immutableEntry = com.google.common.collect.Multisets.immutableEntry(next.getElement(), next.getCount());
        entryIterator.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator = descendingEntryIterator();
        if (!descendingEntryIterator.hasNext()) {
            return null;
        }
        com.google.common.collect.Multiset.Entry<E> next = descendingEntryIterator.next();
        com.google.common.collect.Multiset.Entry<E> immutableEntry = com.google.common.collect.Multisets.immutableEntry(next.getElement(), next.getCount());
        descendingEntryIterator.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(@com.google.common.collect.ParametricNullness E fromElement, com.google.common.collect.BoundType fromBoundType, @com.google.common.collect.ParametricNullness E toElement, com.google.common.collect.BoundType toBoundType) {
        com.google.common.base.Preconditions.checkNotNull(fromBoundType);
        com.google.common.base.Preconditions.checkNotNull(toBoundType);
        return tailMultiset(fromElement, fromBoundType).headMultiset(toElement, toBoundType);
    }

    java.util.Iterator<E> descendingIterator() {
        return com.google.common.collect.Multisets.iteratorImpl(descendingMultiset());
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
        com.google.common.collect.SortedMultiset<E> sortedMultiset = this.descendingMultiset;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        com.google.common.collect.SortedMultiset<E> createDescendingMultiset = createDescendingMultiset();
        this.descendingMultiset = createDescendingMultiset;
        return createDescendingMultiset;
    }

    com.google.common.collect.SortedMultiset<E> createDescendingMultiset() {
        return new com.google.common.collect.DescendingMultiset<E>() { // from class: com.google.common.collect.AbstractSortedMultiset.1DescendingMultisetImpl
            @Override // com.google.common.collect.DescendingMultiset
            com.google.common.collect.SortedMultiset<E> forwardMultiset() {
                return com.google.common.collect.AbstractSortedMultiset.this;
            }

            @Override // com.google.common.collect.DescendingMultiset
            java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
                return com.google.common.collect.AbstractSortedMultiset.this.descendingEntryIterator();
            }

            @Override // com.google.common.collect.DescendingMultiset, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<E> iterator() {
                return com.google.common.collect.AbstractSortedMultiset.this.descendingIterator();
            }
        };
    }
}
