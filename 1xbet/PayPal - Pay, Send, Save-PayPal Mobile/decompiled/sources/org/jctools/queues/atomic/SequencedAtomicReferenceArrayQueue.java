package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class SequencedAtomicReferenceArrayQueue<E> extends org.jctools.queues.atomic.AtomicReferenceArrayQueue<E> {
    protected final java.util.concurrent.atomic.AtomicLongArray sequenceBuffer;

    protected static int calcSequenceOffset(long j, int i) {
        return ((int) j) & i;
    }

    public SequencedAtomicReferenceArrayQueue(int i) {
        super(i);
        int i2 = this.mask + 1;
        this.sequenceBuffer = new java.util.concurrent.atomic.AtomicLongArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            soSequence(this.sequenceBuffer, i3, i3);
        }
    }

    protected final long calcSequenceOffset(long j) {
        return calcSequenceOffset(j, this.mask);
    }

    protected final void soSequence(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i, long j) {
        atomicLongArray.lazySet(i, j);
    }

    protected final long lvSequence(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i) {
        return atomicLongArray.get(i);
    }
}
