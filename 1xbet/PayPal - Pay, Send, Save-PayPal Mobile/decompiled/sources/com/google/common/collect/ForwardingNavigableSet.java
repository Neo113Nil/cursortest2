package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingNavigableSet<E> extends com.google.common.collect.ForwardingSortedSet<E> implements java.util.NavigableSet<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.NavigableSet<E> delegate();

    protected ForwardingNavigableSet() {
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return delegate().lower(e);
    }

    protected E standardLower(E e) {
        return (E) com.google.common.collect.Iterators.getNext(headSet(e, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return delegate().floor(e);
    }

    protected E standardFloor(E e) {
        return (E) com.google.common.collect.Iterators.getNext(headSet(e, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return delegate().ceiling(e);
    }

    protected E standardCeiling(E e) {
        return (E) com.google.common.collect.Iterators.getNext(tailSet(e, true).iterator(), null);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return delegate().higher(e);
    }

    protected E standardHigher(E e) {
        return (E) com.google.common.collect.Iterators.getNext(tailSet(e, false).iterator(), null);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return delegate().pollFirst();
    }

    protected E standardPollFirst() {
        return (E) com.google.common.collect.Iterators.pollNext(iterator());
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return delegate().pollLast();
    }

    protected E standardPollLast() {
        return (E) com.google.common.collect.Iterators.pollNext(descendingIterator());
    }

    protected E standardFirst() {
        return iterator().next();
    }

    protected E standardLast() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    protected class StandardDescendingSet extends com.google.common.collect.Sets.DescendingSet<E> {
        public StandardDescendingSet() {
            super(com.google.common.collect.ForwardingNavigableSet.this);
        }
    }

    @Override // java.util.NavigableSet
    public java.util.Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return delegate().subSet(e, z, e2, z2);
    }

    protected java.util.NavigableSet<E> standardSubSet(E e, boolean z, E e2, boolean z2) {
        return tailSet(e, z).headSet(e2, z2);
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    protected java.util.SortedSet<E> standardSubSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> headSet(E e, boolean z) {
        return delegate().headSet(e, z);
    }

    protected java.util.SortedSet<E> standardHeadSet(E e) {
        return headSet(e, false);
    }

    @Override // java.util.NavigableSet
    public java.util.NavigableSet<E> tailSet(E e, boolean z) {
        return delegate().tailSet(e, z);
    }

    protected java.util.SortedSet<E> standardTailSet(E e) {
        return tailSet(e, true);
    }
}
