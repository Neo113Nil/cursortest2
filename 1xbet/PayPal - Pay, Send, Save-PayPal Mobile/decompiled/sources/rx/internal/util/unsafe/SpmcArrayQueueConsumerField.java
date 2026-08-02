package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpmcArrayQueueConsumerField<E> extends rx.internal.util.unsafe.SpmcArrayQueueL2Pad<E> {
    protected static final long C_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.SpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public SpmcArrayQueueConsumerField(int i) {
        super(i);
    }

    protected final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    protected final boolean casHead(long j, long j2) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }
}
