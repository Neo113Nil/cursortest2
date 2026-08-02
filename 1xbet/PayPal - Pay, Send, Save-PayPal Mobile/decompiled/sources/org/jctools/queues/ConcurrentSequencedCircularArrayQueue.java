package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class ConcurrentSequencedCircularArrayQueue<E> extends org.jctools.queues.ConcurrentCircularArrayQueue<E> {
    protected final long[] sequenceBuffer;

    public ConcurrentSequencedCircularArrayQueue(int i) {
        super(i);
        int i2 = (int) (this.mask + 1);
        this.sequenceBuffer = org.jctools.util.UnsafeLongArrayAccess.allocateLongArray(i2);
        for (long j = 0; j < i2; j++) {
            org.jctools.util.UnsafeLongArrayAccess.soLongElement(this.sequenceBuffer, org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(j, this.mask), j);
        }
    }
}
