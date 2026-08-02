package com.nimbusds.jose.shaded.gson.internal;

/* loaded from: classes10.dex */
public class NonNullElementWrapperList<E> extends java.util.AbstractList<E> implements java.util.RandomAccess {
    private final java.util.ArrayList<E> delegate;

    public NonNullElementWrapperList(java.util.ArrayList<E> arrayList) {
        this.delegate = (java.util.ArrayList) java.util.Objects.requireNonNull(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        return this.delegate.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.delegate.size();
    }

    private E nonNull(E e) {
        if (e != null) {
            return e;
        }
        throw new java.lang.NullPointerException("Element must be non-null");
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        return this.delegate.set(i, nonNull(e));
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        this.delegate.add(i, nonNull(e));
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        return this.delegate.remove(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        return this.delegate.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<?> collection) {
        return this.delegate.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<?> collection) {
        return this.delegate.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return this.delegate.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        return this.delegate.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return this.delegate.lastIndexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return this.delegate.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.delegate.toArray(tArr);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        return this.delegate.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.delegate.hashCode();
    }
}
