package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class SpscAtomicArrayQueueProducerIndexFields<E> extends org.jctools.queues.atomic.SpscAtomicArrayQueueL1Pad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.SpscAtomicArrayQueueProducerIndexFields> P_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.SpscAtomicArrayQueueProducerIndexFields.class, "producerIndex");
    private volatile long producerIndex;
    protected long producerLimit;

    SpscAtomicArrayQueueProducerIndexFields(int i) {
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
