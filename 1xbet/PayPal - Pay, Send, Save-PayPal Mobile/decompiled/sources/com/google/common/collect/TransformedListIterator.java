package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class TransformedListIterator<F, T> extends com.google.common.collect.TransformedIterator<F, T> implements java.util.ListIterator<T> {
    TransformedListIterator(java.util.ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private java.util.ListIterator<? extends F> backingIterator() {
        return (java.util.ListIterator) this.backingIterator;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return backingIterator().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return transform(backingIterator().previous());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return backingIterator().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return backingIterator().previousIndex();
    }

    public void set(T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new java.lang.UnsupportedOperationException();
    }
}
