package org.jctools.queues;

/* loaded from: classes5.dex */
abstract class MpscBlockingConsumerArrayQueueColdProducerFields<E> extends org.jctools.queues.MpscBlockingConsumerArrayQueuePad1<E> {
    private static final long P_LIMIT_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpscBlockingConsumerArrayQueueColdProducerFields.class, "producerLimit");
    protected final E[] producerBuffer;
    private volatile long producerLimit;
    protected final long producerMask;

    MpscBlockingConsumerArrayQueueColdProducerFields(long j, E[] eArr) {
        this.producerMask = j;
        this.producerBuffer = eArr;
    }

    final long lvProducerLimit() {
        return this.producerLimit;
    }

    final boolean casProducerLimit(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, j, j2);
    }

    final void soProducerLimit(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j);
    }
}
