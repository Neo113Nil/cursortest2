package com.google.common.collect;

/* loaded from: classes9.dex */
final class EmptyContiguousSet<C extends java.lang.Comparable> extends com.google.common.collect.ContiguousSet<C> {
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ContiguousSet<C> headSetImpl(C c, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final int indexOf(java.lang.Object obj) {
        return -1;
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.ContiguousSet<C> intersection(com.google.common.collect.ContiguousSet<C> contiguousSet) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet
    final boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final com.google.common.collect.ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    EmptyContiguousSet(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final C first() {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final C last() {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.Range<C> range() {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public final com.google.common.collect.Range<C> range(com.google.common.collect.BoundType boundType, com.google.common.collect.BoundType boundType2) {
        throw new java.util.NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<C> iterator() {
        return com.google.common.collect.Iterators.emptyIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final com.google.common.collect.UnmodifiableIterator<C> descendingIterator() {
        return com.google.common.collect.Iterators.emptyIterator();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final com.google.common.collect.ImmutableList<C> asList() {
        return com.google.common.collect.ImmutableList.of();
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public final java.lang.String toString() {
        return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Set) {
            return ((java.util.Set) obj).isEmpty();
        }
        return false;
    }

    static final class SerializedForm<C extends java.lang.Comparable> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.collect.DiscreteDomain<C> domain;

        private SerializedForm(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            this.domain = discreteDomain;
        }

        private java.lang.Object readResolve() {
            return new com.google.common.collect.EmptyContiguousSet(this.domain);
        }
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.EmptyContiguousSet.SerializedForm(this.domain);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<C> createDescendingSet() {
        return com.google.common.collect.ImmutableSortedSet.emptySet(com.google.common.collect.Ordering.natural().reverse());
    }
}
