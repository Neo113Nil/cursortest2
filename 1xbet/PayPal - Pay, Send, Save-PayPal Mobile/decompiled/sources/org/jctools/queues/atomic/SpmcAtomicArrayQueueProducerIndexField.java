package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class SpmcAtomicArrayQueueProducerIndexField<E> extends org.jctools.queues.atomic.SpmcAtomicArrayQueueL1Pad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.SpmcAtomicArrayQueueProducerIndexField> P_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.SpmcAtomicArrayQueueProducerIndexField.class, "producerIndex");
    private volatile long producerIndex;

    SpmcAtomicArrayQueueProducerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final long lpProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j) {
        P_INDEX_UPDATER.lazySet(this, j);
    }
}
