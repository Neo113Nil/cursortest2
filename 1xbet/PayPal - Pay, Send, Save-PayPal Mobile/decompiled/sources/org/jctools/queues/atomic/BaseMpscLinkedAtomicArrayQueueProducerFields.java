package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseMpscLinkedAtomicArrayQueueProducerFields<E> extends org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad1<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields> P_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    BaseMpscLinkedAtomicArrayQueueProducerFields() {
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j) {
        P_INDEX_UPDATER.lazySet(this, j);
    }

    final boolean casProducerIndex(long j, long j2) {
        return P_INDEX_UPDATER.compareAndSet(this, j, j2);
    }
}
