package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class UnmodifiableIterator<E> implements java.util.Iterator<E> {
    protected UnmodifiableIterator() {
    }

    @Override // java.util.Iterator
    @java.lang.Deprecated
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
