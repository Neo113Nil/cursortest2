package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpmcArrayQueueProducerIndexField<E> extends org.jctools.queues.MpmcArrayQueueL1Pad<E> {
    private static final long P_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpmcArrayQueueProducerIndexField.class, "producerIndex");
    private volatile long producerIndex;

    MpmcArrayQueueProducerIndexField(int i) {
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
