package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpscArrayQueueConsumerIndexField<E> extends org.jctools.queues.MpscArrayQueueL2Pad<E> {
    private static final long C_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpscArrayQueueConsumerIndexField.class, "consumerIndex");
    private volatile long consumerIndex;

    MpscArrayQueueConsumerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    final long lpConsumerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    final void soConsumerIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }
}
