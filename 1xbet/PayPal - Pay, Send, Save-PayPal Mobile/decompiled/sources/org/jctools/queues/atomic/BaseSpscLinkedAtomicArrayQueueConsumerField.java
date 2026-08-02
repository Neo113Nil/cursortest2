package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedAtomicArrayQueueConsumerField<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueConsumerColdFields<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueConsumerField> C_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    BaseSpscLinkedAtomicArrayQueueConsumerField() {
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
