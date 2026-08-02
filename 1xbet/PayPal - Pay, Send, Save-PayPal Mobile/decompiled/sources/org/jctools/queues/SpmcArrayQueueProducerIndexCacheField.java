package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class SpmcArrayQueueProducerIndexCacheField<E> extends org.jctools.queues.SpmcArrayQueueMidPad<E> {
    private volatile long producerIndexCache;

    SpmcArrayQueueProducerIndexCacheField(int i) {
        super(i);
    }

    protected final long lvProducerIndexCache() {
        return this.producerIndexCache;
    }

    protected final void svProducerIndexCache(long j) {
        this.producerIndexCache = j;
    }
}
