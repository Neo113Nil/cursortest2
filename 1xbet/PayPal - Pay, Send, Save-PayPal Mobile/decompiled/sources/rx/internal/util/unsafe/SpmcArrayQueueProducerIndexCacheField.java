package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpmcArrayQueueProducerIndexCacheField<E> extends rx.internal.util.unsafe.SpmcArrayQueueMidPad<E> {
    private volatile long getHighSpeedVideoSizes;

    public SpmcArrayQueueProducerIndexCacheField(int i) {
        super(i);
    }

    protected final long lvProducerIndexCache() {
        return this.getHighSpeedVideoSizes;
    }

    protected final void svProducerIndexCache(long j) {
        this.getHighSpeedVideoSizes = j;
    }
}
