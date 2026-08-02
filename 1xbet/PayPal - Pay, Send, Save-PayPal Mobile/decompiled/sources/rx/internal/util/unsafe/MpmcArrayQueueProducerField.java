package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class MpmcArrayQueueProducerField<E> extends rx.internal.util.unsafe.MpmcArrayQueueL1Pad<E> {
    private static final long getHighSpeedVideoFpsRanges = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.MpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public MpmcArrayQueueProducerField(int i) {
        super(i);
    }

    protected final long lvProducerIndex() {
        return this.producerIndex;
    }

    protected final boolean casProducerIndex(long j, long j2) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.compareAndSwapLong(this, getHighSpeedVideoFpsRanges, j, j2);
    }
}
