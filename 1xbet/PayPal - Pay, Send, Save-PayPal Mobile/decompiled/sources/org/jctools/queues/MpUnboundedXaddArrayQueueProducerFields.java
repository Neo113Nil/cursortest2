package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpUnboundedXaddArrayQueueProducerFields<E> extends org.jctools.queues.MpUnboundedXaddArrayQueuePad1<E> {
    private static final long P_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    MpUnboundedXaddArrayQueueProducerFields() {
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final long getAndIncrementProducerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getAndAddLong(this, P_INDEX_OFFSET, 1L);
    }

    final long getAndAddProducerIndex(long j) {
        return org.jctools.util.UnsafeAccess.UNSAFE.getAndAddLong(this, P_INDEX_OFFSET, j);
    }
}
