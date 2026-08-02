package com.google.common.base;

/* loaded from: classes4.dex */
abstract class AbstractIterator<T> implements java.util.Iterator<T> {
    private T next;
    private com.google.common.base.AbstractIterator.State state = com.google.common.base.AbstractIterator.State.NOT_READY;

    enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T computeNext();

    protected AbstractIterator() {
    }

    protected final T endOfData() {
        this.state = com.google.common.base.AbstractIterator.State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.common.base.Preconditions.checkState(this.state != com.google.common.base.AbstractIterator.State.FAILED);
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
        this.state = com.google.common.base.AbstractIterator.State.FAILED;
        this.next = computeNext();
        if (this.state == com.google.common.base.AbstractIterator.State.DONE) {
            return false;
        }
        this.state = com.google.common.base.AbstractIterator.State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.state = com.google.common.base.AbstractIterator.State.NOT_READY;
        T t = (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.next);
        this.next = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
