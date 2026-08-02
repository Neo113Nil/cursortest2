package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class MpmcArrayQueueConsumerField<E> extends rx.internal.util.unsafe.MpmcArrayQueueL2Pad<E> {
    private static final long getHighSpeedVideoSizes = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.MpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public MpmcArrayQueueConsumerField(int i) {
        super(i);
    }

    protected final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    protected final boolean casConsumerIndex(long j, long j2) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.compareAndSwapLong(this, getHighSpeedVideoSizes, j, j2);
    }
}
