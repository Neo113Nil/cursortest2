package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedAtomicArrayQueueProducerFields<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueL2Pad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueProducerFields> P_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    BaseSpscLinkedAtomicArrayQueueProducerFields() {
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j) {
        P_INDEX_UPDATER.lazySet(this, j);
    }

    final long lpProducerIndex() {
        return this.producerIndex;
    }
}
