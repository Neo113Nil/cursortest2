package org.jctools.queues;

/* loaded from: classes18.dex */
public class MpscGrowableArrayQueue<E> extends org.jctools.queues.MpscChunkedArrayQueue<E> {
    public MpscGrowableArrayQueue(int i) {
        super(java.lang.Math.max(2, org.jctools.util.Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    public MpscGrowableArrayQueue(int i, int i2) {
        super(i, i2);
    }

    @Override // org.jctools.queues.MpscChunkedArrayQueue, org.jctools.queues.BaseMpscLinkedArrayQueue
    protected int getNextBufferSize(E[] eArr) {
        org.jctools.util.RangeUtil.checkLessThanOrEqual(org.jctools.queues.LinkedArrayQueueUtil.length(eArr), this.maxQueueCapacity / 2, "buffer.length");
        return ((org.jctools.queues.LinkedArrayQueueUtil.length(eArr) - 1) * 2) + 1;
    }

    @Override // org.jctools.queues.MpscChunkedArrayQueue, org.jctools.queues.BaseMpscLinkedArrayQueue
    protected long getCurrentBufferCapacity(long j) {
        return 2 + j == this.maxQueueCapacity ? this.maxQueueCapacity : j;
    }
}
