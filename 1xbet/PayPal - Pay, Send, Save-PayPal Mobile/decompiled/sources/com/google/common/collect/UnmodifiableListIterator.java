package com.google.common.collect;

/* loaded from: classes4.dex */
public abstract class UnmodifiableListIterator<E> extends com.google.common.collect.UnmodifiableIterator<E> implements java.util.ListIterator<E> {
    protected UnmodifiableListIterator() {
    }

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void add(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void set(E e) {
        throw new java.lang.UnsupportedOperationException();
    }
}
