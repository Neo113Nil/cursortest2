package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class MpscAtomicArrayQueueConsumerIndexField<E> extends org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField> C_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField.class, "consumerIndex");
    private volatile long consumerIndex;

    MpscAtomicArrayQueueConsumerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    final long lpConsumerIndex() {
        return this.consumerIndex;
    }

    final void soConsumerIndex(long j) {
        C_INDEX_UPDATER.lazySet(this, j);
    }
}
