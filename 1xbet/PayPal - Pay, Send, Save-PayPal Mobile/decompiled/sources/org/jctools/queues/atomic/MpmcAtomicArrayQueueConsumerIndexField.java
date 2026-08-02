package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class MpmcAtomicArrayQueueConsumerIndexField<E> extends org.jctools.queues.atomic.MpmcAtomicArrayQueueL2Pad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.MpmcAtomicArrayQueueConsumerIndexField> C_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.MpmcAtomicArrayQueueConsumerIndexField.class, "consumerIndex");
    private volatile long consumerIndex;

    MpmcAtomicArrayQueueConsumerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    final boolean casConsumerIndex(long j, long j2) {
        return C_INDEX_UPDATER.compareAndSet(this, j, j2);
    }
}
