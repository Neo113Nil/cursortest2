package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class MpscAtomicArrayQueueProducerLimitField<E> extends org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField> P_LIMIT_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField.class, "producerLimit");
    private volatile long producerLimit;

    MpscAtomicArrayQueueProducerLimitField(int i) {
        super(i);
        this.producerLimit = i;
    }

    final long lvProducerLimit() {
        return this.producerLimit;
    }

    final void soProducerLimit(long j) {
        P_LIMIT_UPDATER.lazySet(this, j);
    }
}
