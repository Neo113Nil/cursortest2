package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use Iterators.peekingIterator")
/* loaded from: classes9.dex */
public interface PeekingIterator<E> extends java.util.Iterator<E> {
    @Override // java.util.Iterator
    E next();

    E peek();

    @Override // java.util.Iterator
    void remove();
}
