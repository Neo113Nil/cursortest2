package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseMpscLinkedArrayQueueColdProducerFields<E> extends org.jctools.queues.BaseMpscLinkedArrayQueuePad3<E> {
    private static final long P_LIMIT_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.BaseMpscLinkedArrayQueueColdProducerFields.class, "producerLimit");
    protected E[] producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    BaseMpscLinkedArrayQueueColdProducerFields() {
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
