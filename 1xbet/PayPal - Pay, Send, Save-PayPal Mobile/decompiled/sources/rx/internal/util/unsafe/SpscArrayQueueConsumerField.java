package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpscArrayQueueConsumerField<E> extends rx.internal.util.unsafe.SpscArrayQueueL2Pad<E> {
    protected static final long C_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.SpscArrayQueueConsumerField.class, "consumerIndex");
    protected long consumerIndex;

    public SpscArrayQueueConsumerField(int i) {
        super(i);
    }
}
