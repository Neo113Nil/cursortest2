package com.google.common.collect;

/* loaded from: classes9.dex */
final class SortedMultisets {
    private SortedMultisets() {
    }

    static class ElementSet<E> extends com.google.common.collect.Multisets.ElementSet<E> implements java.util.SortedSet<E> {
        private final com.google.common.collect.SortedMultiset<E> multiset;

        ElementSet(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
            this.multiset = sortedMultiset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets.ElementSet
        public final com.google.common.collect.SortedMultiset<E> multiset() {
            return this.multiset;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Multisets.elementIterator(multiset().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
            return multiset().comparator();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> subSet(E e, E e2) {
            return multiset().subMultiset(e, com.google.common.collect.BoundType.CLOSED, e2, com.google.common.collect.BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> headSet(E e) {
            return multiset().headMultiset(e, com.google.common.collect.BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> tailSet(E e) {
            return multiset().tailMultiset(e, com.google.common.collect.BoundType.CLOSED).elementSet();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrThrow(multiset().firstEntry());
        }

        @Override // java.util.SortedSet
        public E last() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrThrow(multiset().lastEntry());
        }
    }

    static class NavigableElementSet<E> extends com.google.common.collect.SortedMultisets.ElementSet<E> implements java.util.NavigableSet<E> {
        NavigableElementSet(com.google.common.collect.SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().headMultiset(e, com.google.common.collect.BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().headMultiset(e, com.google.common.collect.BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().tailMultiset(e, com.google.common.collect.BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().tailMultiset(e, com.google.common.collect.BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> descendingSet() {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) com.google.common.collect.SortedMultisets.getElementOrNull(multiset().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().subMultiset(e, com.google.common.collect.BoundType.forBoolean(z), e2, com.google.common.collect.BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> headSet(E e, boolean z) {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().headMultiset(e, com.google.common.collect.BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<E> tailSet(E e, boolean z) {
            return new com.google.common.collect.SortedMultisets.NavigableElementSet(multiset().tailMultiset(e, com.google.common.collect.BoundType.forBoolean(z)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E getElementOrThrow(com.google.common.collect.Multiset.Entry<E> entry) {
        if (entry == null) {
            throw new java.util.NoSuchElementException();
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E getElementOrNull(com.google.common.collect.Multiset.Entry<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }
}
