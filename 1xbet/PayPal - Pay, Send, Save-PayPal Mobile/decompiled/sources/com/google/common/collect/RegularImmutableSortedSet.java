package com.google.common.collect;

/* loaded from: classes9.dex */
final class RegularImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSet<E> {
    static final com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable> NATURAL_EMPTY_SET = new com.google.common.collect.RegularImmutableSortedSet<>(com.google.common.collect.ImmutableList.of(), com.google.common.collect.Ordering.natural());
    final transient com.google.common.collect.ImmutableList<E> elements;

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    RegularImmutableSortedSet(com.google.common.collect.ImmutableList<E> immutableList, java.util.Comparator<? super E> comparator) {
        super(comparator);
        this.elements = immutableList;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final java.lang.Object[] internalArray() {
        return this.elements.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return this.elements.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final com.google.common.collect.UnmodifiableIterator<E> descendingIterator() {
        return this.elements.reverse().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.elements.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return unsafeBinarySearch(obj) >= 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection<?> collection) {
        if (collection instanceof com.google.common.collect.Multiset) {
            collection = ((com.google.common.collect.Multiset) collection).elementSet();
        }
        if (!com.google.common.collect.SortedIterables.hasSameComparator(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        com.google.common.collect.UnmodifiableIterator<E> it = iterator();
        java.util.Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        java.lang.Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int unsafeCompare = unsafeCompare(next2, next);
                if (unsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (unsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (unsafeCompare > 0) {
                    break;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    private int unsafeBinarySearch(java.lang.Object obj) throws java.lang.ClassCastException {
        return java.util.Collections.binarySearch(this.elements, obj, unsafeComparator());
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return this.elements.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int copyIntoArray(java.lang.Object[] objArr, int i) {
        return this.elements.copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (com.google.common.collect.SortedIterables.hasSameComparator(this.comparator, set)) {
            java.util.Iterator<E> it = set.iterator();
            try {
                com.google.common.collect.UnmodifiableIterator<E> it2 = iterator();
                while (it2.hasNext()) {
                    E next = it2.next();
                    E next2 = it.next();
                    if (next2 == null || unsafeCompare(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (java.lang.ClassCastException | java.util.NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final E first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.elements.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.elements.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E lower(E e) {
        int headIndex = headIndex(e, false) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E floor(E e) {
        int headIndex = headIndex(e, true) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E ceiling(E e) {
        int tailIndex = tailIndex(e, true);
        if (tailIndex == size()) {
            return null;
        }
        return this.elements.get(tailIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E higher(E e) {
        int tailIndex = tailIndex(e, false);
        if (tailIndex == size()) {
            return null;
        }
        return this.elements.get(tailIndex);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return getSubSet(0, headIndex(e, z));
    }

    final int headIndex(E e, boolean z) {
        int binarySearch = java.util.Collections.binarySearch(this.elements, com.google.common.base.Preconditions.checkNotNull(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return tailSetImpl(e, z).headSetImpl(e2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return getSubSet(tailIndex(e, z), size());
    }

    final int tailIndex(E e, boolean z) {
        int binarySearch = java.util.Collections.binarySearch(this.elements, com.google.common.base.Preconditions.checkNotNull(e), comparator());
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    final java.util.Comparator<java.lang.Object> unsafeComparator() {
        return this.comparator;
    }

    final com.google.common.collect.RegularImmutableSortedSet<E> getSubSet(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new com.google.common.collect.RegularImmutableSortedSet<>(this.elements.subList(i, i2), this.comparator);
        }
        return emptySet(this.comparator);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final int indexOf(java.lang.Object obj) {
        int binarySearch;
        if (obj == null) {
            return -1;
        }
        try {
            binarySearch = java.util.Collections.binarySearch(this.elements, obj, unsafeComparator());
        } catch (java.lang.ClassCastException unused) {
        }
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final com.google.common.collect.ImmutableList<E> asList() {
        return this.elements;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
        java.util.Comparator reverseOrder = java.util.Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return emptySet(reverseOrder);
        }
        return new com.google.common.collect.RegularImmutableSortedSet(this.elements.reverse(), reverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
