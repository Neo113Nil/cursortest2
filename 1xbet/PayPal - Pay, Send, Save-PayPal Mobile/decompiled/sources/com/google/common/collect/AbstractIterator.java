package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class AbstractIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {
    private T next;
    private com.google.common.collect.AbstractIterator.State state = com.google.common.collect.AbstractIterator.State.NOT_READY;

    enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T computeNext();

    protected final T endOfData() {
        this.state = com.google.common.collect.AbstractIterator.State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.common.base.Preconditions.checkState(this.state != com.google.common.collect.AbstractIterator.State.FAILED);
        int ordinal = this.state.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return tryToComputeNext();
        }
        return false;
    }

    private boolean tryToComputeNext() {
        this.state = com.google.common.collect.AbstractIterator.State.FAILED;
        this.next = computeNext();
        if (this.state == com.google.common.collect.AbstractIterator.State.DONE) {
            return false;
        }
        this.state = com.google.common.collect.AbstractIterator.State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.state = com.google.common.collect.AbstractIterator.State.NOT_READY;
        T t = (T) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.next);
        this.next = null;
        return t;
    }

    public final T peek() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return (T) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.next);
    }
}
