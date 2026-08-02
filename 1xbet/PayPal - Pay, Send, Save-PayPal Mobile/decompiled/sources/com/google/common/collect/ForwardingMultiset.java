package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingMultiset<E> extends com.google.common.collect.ForwardingCollection<E> implements com.google.common.collect.Multiset<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Multiset<E> delegate();

    protected ForwardingMultiset() {
    }

    @Override // com.google.common.collect.Multiset
    public int count(java.lang.Object obj) {
        return delegate().count(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    @Override // com.google.common.collect.Multiset
    public int remove(java.lang.Object obj, int i) {
        return delegate().remove(obj, i);
    }

    public java.util.Set<E> elementSet() {
        return delegate().elementSet();
    }

    public java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(java.lang.Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.Multiset
    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    @Override // com.google.common.collect.Multiset
    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardContains(java.lang.Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected void standardClear() {
        com.google.common.collect.Iterators.clear(entrySet().iterator());
    }

    protected int standardCount(java.lang.Object obj) {
        for (com.google.common.collect.Multiset.Entry<E> entry : entrySet()) {
            if (java.util.Objects.equals(entry.getElement(), obj)) {
                return entry.getCount();
            }
        }
        return 0;
    }

    protected boolean standardAdd(E e) {
        add(e, 1);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardAddAll(java.util.Collection<? extends E> collection) {
        return com.google.common.collect.Multisets.addAllImpl(this, collection);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemove(java.lang.Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemoveAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Multisets.removeAllImpl(this, collection);
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRetainAll(java.util.Collection<?> collection) {
        return com.google.common.collect.Multisets.retainAllImpl(this, collection);
    }

    protected int standardSetCount(E e, int i) {
        return com.google.common.collect.Multisets.setCountImpl(this, e, i);
    }

    protected boolean standardSetCount(E e, int i, int i2) {
        return com.google.common.collect.Multisets.setCountImpl(this, e, i, i2);
    }

    protected class StandardElementSet extends com.google.common.collect.Multisets.ElementSet<E> {
        public StandardElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        com.google.common.collect.Multiset<E> multiset() {
            return com.google.common.collect.ForwardingMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Multisets.elementIterator(multiset().entrySet().iterator());
        }
    }

    protected java.util.Iterator<E> standardIterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    protected int standardSize() {
        return com.google.common.collect.Multisets.linearTimeSizeImpl(this);
    }

    protected boolean standardEquals(java.lang.Object obj) {
        return com.google.common.collect.Multisets.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return entrySet().hashCode();
    }

    @Override // com.google.common.collect.ForwardingCollection
    protected java.lang.String standardToString() {
        return entrySet().toString();
    }
}
