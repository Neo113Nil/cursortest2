package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class AbstractSequentialIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {
    private T nextOrNull;

    protected abstract T computeNext(T t);

    public AbstractSequentialIterator(T t) {
        this.nextOrNull = t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.nextOrNull;
        if (t == null) {
            throw new java.util.NoSuchElementException();
        }
        this.nextOrNull = computeNext(t);
        return t;
    }
}
