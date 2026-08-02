package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseMpscLinkedAtomicArrayQueueConsumerFields<E> extends org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueuePad2<E> {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields> C_INDEX_UPDATER = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueueConsumerFields.class, "consumerIndex");
    protected java.util.concurrent.atomic.AtomicReferenceArray<E> consumerBuffer;
    private volatile long consumerIndex;
    protected long consumerMask;

    BaseMpscLinkedAtomicArrayQueueConsumerFields() {
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
