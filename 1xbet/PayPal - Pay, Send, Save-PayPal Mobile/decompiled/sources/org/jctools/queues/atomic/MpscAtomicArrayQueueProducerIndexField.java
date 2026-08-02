package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class MpscAtomicArrayQueueProducerIndexField<E> extends org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField> P_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField.class, "producerIndex");
    private volatile long producerIndex;

    MpscAtomicArrayQueueProducerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final boolean casProducerIndex(long j, long j2) {
        return P_INDEX_UPDATER.compareAndSet(this, j, j2);
    }
}
