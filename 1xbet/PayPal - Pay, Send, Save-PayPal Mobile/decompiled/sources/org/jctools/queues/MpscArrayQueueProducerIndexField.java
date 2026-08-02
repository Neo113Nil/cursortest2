package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpscArrayQueueProducerIndexField<E> extends org.jctools.queues.MpscArrayQueueL1Pad<E> {
    private static final long P_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpscArrayQueueProducerIndexField.class, "producerIndex");
    private volatile long producerIndex;

    MpscArrayQueueProducerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final boolean casProducerIndex(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j, j2);
    }
}
