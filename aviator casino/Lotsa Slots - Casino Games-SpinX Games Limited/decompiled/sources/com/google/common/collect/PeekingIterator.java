package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use Iterators.peekingIterator")
@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface PeekingIterator<E> extends java.util.Iterator<E> {
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    E next();

    @com.google.common.collect.ParametricNullness
    E peek();

    @Override // java.util.Iterator
    void remove();
}
