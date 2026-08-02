package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class SpmcAtomicArrayQueueProducerIndexCacheField<E> extends org.jctools.queues.atomic.SpmcAtomicArrayQueueMidPad<E> {
    private volatile long producerIndexCache;

    SpmcAtomicArrayQueueProducerIndexCacheField(int i) {
        super(i);
    }

    protected final long lvProducerIndexCache() {
        return this.producerIndexCache;
    }

    protected final void svProducerIndexCache(long j) {
        this.producerIndexCache = j;
    }
}
