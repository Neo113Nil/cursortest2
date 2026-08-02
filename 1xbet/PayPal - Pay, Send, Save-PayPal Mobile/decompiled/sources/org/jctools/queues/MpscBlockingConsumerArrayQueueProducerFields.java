package org.jctools.queues;

/* loaded from: classes5.dex */
abstract class MpscBlockingConsumerArrayQueueProducerFields<E> extends org.jctools.queues.MpscBlockingConsumerArrayQueuePad2<E> {
    private static final long P_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpscBlockingConsumerArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    MpscBlockingConsumerArrayQueueProducerFields(long j, E[] eArr) {
        super(j, eArr);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final boolean casProducerIndex(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j, j2);
    }
}
