package com.google.common.collect;

/* loaded from: classes9.dex */
final class DescendingImmutableSortedSet<E> extends com.google.common.collect.ImmutableSortedSet<E> {
    private final com.google.common.collect.ImmutableSortedSet<E> forward;

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ java.util.NavigableSet descendingSet() {
        return descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    DescendingImmutableSortedSet(com.google.common.collect.ImmutableSortedSet<E> immutableSortedSet) {
        super(com.google.common.collect.Ordering.from(immutableSortedSet.comparator()).reverse());
        this.forward = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.forward.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public final com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return this.forward.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return this.forward.tailSet((com.google.common.collect.ImmutableSortedSet<E>) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return this.forward.subSet((boolean) e2, z2, (boolean) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return this.forward.headSet((com.google.common.collect.ImmutableSortedSet<E>) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final com.google.common.collect.ImmutableSortedSet<E> descendingSet() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final com.google.common.collect.UnmodifiableIterator<E> descendingIterator() {
        return this.forward.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final com.google.common.collect.ImmutableSortedSet<E> createDescendingSet() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E lower(E e) {
        return this.forward.higher(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E floor(E e) {
        return this.forward.ceiling(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E ceiling(E e) {
        return this.forward.floor(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E higher(E e) {
        return this.forward.lower(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final int indexOf(java.lang.Object obj) {
        int indexOf = this.forward.indexOf(obj);
        return indexOf == -1 ? indexOf : (size() - 1) - indexOf;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
