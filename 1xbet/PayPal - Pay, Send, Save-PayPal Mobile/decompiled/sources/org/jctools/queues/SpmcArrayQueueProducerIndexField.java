package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class SpmcArrayQueueProducerIndexField<E> extends org.jctools.queues.SpmcArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.SpmcArrayQueueProducerIndexField.class, "producerIndex");
    private volatile long producerIndex;

    SpmcArrayQueueProducerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final long lpProducerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(this, P_INDEX_OFFSET);
    }

    final void soProducerIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }
}
