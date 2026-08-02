package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractMultiset<E> extends java.util.AbstractCollection<E> implements com.google.common.collect.Multiset<E> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<E> elementSet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet;

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    abstract int distinctElements();

    abstract java.util.Iterator<E> elementIterator();

    abstract java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator();

    AbstractMultiset() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(java.lang.Object obj) {
        return count(obj) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public int add(E e, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean remove(java.lang.Object obj) {
        return remove(obj, 1) > 0;
    }

    public int remove(java.lang.Object obj, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        return com.google.common.collect.Multisets.setCountImpl(this, e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return com.google.common.collect.Multisets.setCountImpl(this, e, i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        return com.google.common.collect.Multisets.addAllImpl(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean removeAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Multisets.removeAllImpl(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final boolean retainAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Multisets.retainAllImpl(this, collection);
    }

    @Override // com.google.common.collect.Multiset
    public java.util.Set<E> elementSet() {
        java.util.Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        java.util.Set<E> createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    java.util.Set<E> createElementSet() {
        return new com.google.common.collect.AbstractMultiset.ElementSet();
    }

    final class ElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        final com.google.common.collect.Multiset<E> multiset() {
            return com.google.common.collect.AbstractMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<E> iterator() {
            return com.google.common.collect.AbstractMultiset.this.elementIterator();
        }
    }

    @Override // com.google.common.collect.Multiset
    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
        java.util.Set<com.google.common.collect.Multiset.Entry<E>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    class EntrySet extends com.google.common.collect.Multisets.EntrySet<E> {
        EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        com.google.common.collect.Multiset<E> multiset() {
            return com.google.common.collect.AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> iterator() {
            return com.google.common.collect.AbstractMultiset.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.collect.AbstractMultiset.this.distinctElements();
        }
    }

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> createEntrySet() {
        return new com.google.common.collect.AbstractMultiset.EntrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(java.lang.Object obj) {
        return com.google.common.collect.Multisets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final java.lang.String toString() {
        return entrySet().toString();
    }
}
