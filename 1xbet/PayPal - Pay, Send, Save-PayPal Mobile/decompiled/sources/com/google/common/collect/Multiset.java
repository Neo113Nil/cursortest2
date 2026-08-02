package com.google.common.collect;

/* loaded from: classes9.dex */
public interface Multiset<E> extends java.util.Collection<E> {

    public interface Entry<E> {
        boolean equals(java.lang.Object obj);

        int getCount();

        E getElement();

        int hashCode();

        java.lang.String toString();
    }

    int add(E e, int i);

    boolean add(E e);

    boolean contains(java.lang.Object obj);

    @Override // java.util.Collection
    boolean containsAll(java.util.Collection<?> collection);

    int count(java.lang.Object obj);

    java.util.Set<E> elementSet();

    java.util.Set<com.google.common.collect.Multiset.Entry<E>> entrySet();

    boolean equals(java.lang.Object obj);

    int hashCode();

    java.util.Iterator<E> iterator();

    int remove(java.lang.Object obj, int i);

    boolean remove(java.lang.Object obj);

    boolean removeAll(java.util.Collection<?> collection);

    boolean retainAll(java.util.Collection<?> collection);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();

    java.lang.String toString();
}
