package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpscArrayQueueProducerLimitField<E> extends org.jctools.queues.MpscArrayQueueMidPad<E> {
    private static final long P_LIMIT_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpscArrayQueueProducerLimitField.class, "producerLimit");
    private volatile long producerLimit;

    MpscArrayQueueProducerLimitField(int i) {
        super(i);
        this.producerLimit = i;
    }

    final long lvProducerLimit() {
        return this.producerLimit;
    }

    final void soProducerLimit(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j);
    }
}
