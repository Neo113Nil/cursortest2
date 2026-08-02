package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpmcArrayQueueProducerField<E> extends rx.internal.util.unsafe.SpmcArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.SpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    protected final long lvProducerIndex() {
        return this.producerIndex;
    }

    protected final void soTail(long j) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }

    public SpmcArrayQueueProducerField(int i) {
        super(i);
    }
}
