package com.google.common.collect;

/* loaded from: classes4.dex */
abstract class TransformedIterator<F, T> implements java.util.Iterator<T> {
    final java.util.Iterator<? extends F> backingIterator;

    abstract T transform(F f);

    TransformedIterator(java.util.Iterator<? extends F> it) {
        this.backingIterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return transform(this.backingIterator.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.backingIterator.remove();
    }
}
