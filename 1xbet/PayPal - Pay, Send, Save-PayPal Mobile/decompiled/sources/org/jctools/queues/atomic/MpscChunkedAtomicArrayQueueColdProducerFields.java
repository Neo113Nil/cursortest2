package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class MpscChunkedAtomicArrayQueueColdProducerFields<E> extends org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue<E> {
    protected final long maxQueueCapacity;

    MpscChunkedAtomicArrayQueueColdProducerFields(int i, int i2) {
        super(i);
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i2, 4, "maxCapacity");
        org.jctools.util.RangeUtil.checkLessThan(org.jctools.util.Pow2.roundToPowerOfTwo(i), org.jctools.util.Pow2.roundToPowerOfTwo(i2), "initialCapacity");
        this.maxQueueCapacity = org.jctools.util.Pow2.roundToPowerOfTwo(i2) << 1;
    }
}
