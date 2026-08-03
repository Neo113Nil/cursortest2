package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class AbstractSequentialIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {

    @javax.annotation.CheckForNull
    private T nextOrNull;

    @javax.annotation.CheckForNull
    protected abstract T computeNext(T previous);

    protected AbstractSequentialIterator(@javax.annotation.CheckForNull T firstOrNull) {
        this.nextOrNull = firstOrNull;
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
