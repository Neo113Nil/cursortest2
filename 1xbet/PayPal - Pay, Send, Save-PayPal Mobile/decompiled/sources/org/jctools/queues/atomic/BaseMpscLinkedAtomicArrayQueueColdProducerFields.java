package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseMpscLinkedAtomicArrayQueueColdProducerFields<E> extends org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad3<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields> P_LIMIT_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueColdProducerFields.class, "producerLimit");
    protected java.util.concurrent.atomic.AtomicReferenceArray<E> producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    BaseMpscLinkedAtomicArrayQueueColdProducerFields() {
    }

    final long lvProducerLimit() {
        return this.producerLimit;
    }

    final boolean casProducerLimit(long j, long j2) {
        return P_LIMIT_UPDATER.compareAndSet(this, j, j2);
    }

    final void soProducerLimit(long j) {
        P_LIMIT_UPDATER.lazySet(this, j);
    }
}
