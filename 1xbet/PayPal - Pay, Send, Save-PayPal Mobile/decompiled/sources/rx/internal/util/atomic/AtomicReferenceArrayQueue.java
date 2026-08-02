package rx.internal.util.atomic;

/* loaded from: classes18.dex */
abstract class AtomicReferenceArrayQueue<E> extends java.util.AbstractQueue<E> {
    protected final java.util.concurrent.atomic.AtomicReferenceArray<E> buffer;
    protected final int mask;

    protected final int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    public AtomicReferenceArrayQueue(int i) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i);
        this.mask = roundToPowerOfTwo - 1;
        this.buffer = new java.util.concurrent.atomic.AtomicReferenceArray<>(roundToPowerOfTwo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    protected final int calcElementOffset(long j) {
        return ((int) j) & this.mask;
    }

    protected final E lvElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    protected final E lpElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    protected final E lpElement(int i) {
        return this.buffer.get(i);
    }

    protected final void spElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    protected final void spElement(int i, E e) {
        this.buffer.lazySet(i, e);
    }

    protected final void soElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    protected final void soElement(int i, E e) {
        this.buffer.lazySet(i, e);
    }

    protected final void svElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.set(i, e);
    }

    protected final E lvElement(int i) {
        return lvElement(this.buffer, i);
    }
}
