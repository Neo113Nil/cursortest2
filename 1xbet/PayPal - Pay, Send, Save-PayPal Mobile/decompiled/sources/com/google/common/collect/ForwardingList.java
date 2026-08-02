package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingList<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.List<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.List<E> delegate();

    protected ForwardingList() {
    }

    public void add(int i, E e) {
        delegate().add(i, e);
    }

    public boolean addAll(int i, java.util.Collection<? extends E> collection) {
        return delegate().addAll(i, collection);
    }

    @Override // java.util.List
    public E get(int i) {
        return delegate().get(i);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        return delegate().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return delegate().lastIndexOf(obj);
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int i) {
        return delegate().listIterator(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        return delegate().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return delegate().set(i, e);
    }

    @Override // java.util.List
    public java.util.List<E> subList(int i, int i2) {
        return delegate().subList(i, i2);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    protected boolean standardAdd(E e) {
        add(size(), e);
        return true;
    }

    protected boolean standardAddAll(int i, java.lang.Iterable<? extends E> iterable) {
        return com.google.common.collect.Lists.addAllImpl(this, i, iterable);
    }

    protected int standardIndexOf(java.lang.Object obj) {
        return com.google.common.collect.Lists.indexOfImpl(this, obj);
    }

    protected int standardLastIndexOf(java.lang.Object obj) {
        return com.google.common.collect.Lists.lastIndexOfImpl(this, obj);
    }

    protected java.util.Iterator<E> standardIterator() {
        return listIterator();
    }

    protected java.util.ListIterator<E> standardListIterator() {
        return listIterator(0);
    }

    protected java.util.ListIterator<E> standardListIterator(int i) {
        return com.google.common.collect.Lists.listIteratorImpl(this, i);
    }

    protected java.util.List<E> standardSubList(int i, int i2) {
        return com.google.common.collect.Lists.subListImpl(this, i, i2);
    }

    protected boolean standardEquals(java.lang.Object obj) {
        return com.google.common.collect.Lists.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return com.google.common.collect.Lists.hashCodeImpl(this);
    }
}
