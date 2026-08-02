package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class SpscArrayQueueConsumerIndexField<E> extends org.jctools.queues.SpscArrayQueueL2Pad<E> {
    private static final long C_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.SpscArrayQueueConsumerIndexField.class, "consumerIndex");

    SpscArrayQueueConsumerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    final long lpConsumerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    final void soConsumerIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }
}
