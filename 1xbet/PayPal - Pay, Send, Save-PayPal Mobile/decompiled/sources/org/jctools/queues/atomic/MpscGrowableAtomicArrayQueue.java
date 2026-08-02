package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class MpscGrowableAtomicArrayQueue<E> extends org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue<E> {
    public MpscGrowableAtomicArrayQueue(int i) {
        super(java.lang.Math.max(2, org.jctools.util.Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    public MpscGrowableAtomicArrayQueue(int i, int i2) {
        super(i, i2);
    }

    @Override // org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected int getNextBufferSize(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray) {
        org.jctools.util.RangeUtil.checkLessThanOrEqual(org.jctools.queues.atomic.AtomicQueueUtil.length(atomicReferenceArray), this.maxQueueCapacity / 2, "buffer.length");
        return ((org.jctools.queues.atomic.AtomicQueueUtil.length(atomicReferenceArray) - 1) * 2) + 1;
    }

    @Override // org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected long getCurrentBufferCapacity(long j) {
        return 2 + j == this.maxQueueCapacity ? this.maxQueueCapacity : j;
    }
}
