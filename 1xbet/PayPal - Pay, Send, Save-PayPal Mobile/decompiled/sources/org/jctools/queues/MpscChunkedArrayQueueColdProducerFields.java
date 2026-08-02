package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpscChunkedArrayQueueColdProducerFields<E> extends org.jctools.queues.BaseMpscLinkedArrayQueue<E> {
    protected final long maxQueueCapacity;

    MpscChunkedArrayQueueColdProducerFields(int i, int i2) {
        super(i);
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i2, 4, "maxCapacity");
        org.jctools.util.RangeUtil.checkLessThan(org.jctools.util.Pow2.roundToPowerOfTwo(i), org.jctools.util.Pow2.roundToPowerOfTwo(i2), "initialCapacity");
        this.maxQueueCapacity = org.jctools.util.Pow2.roundToPowerOfTwo(i2) << 1;
    }
}
