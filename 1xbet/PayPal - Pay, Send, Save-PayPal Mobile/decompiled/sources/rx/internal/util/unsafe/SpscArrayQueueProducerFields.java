package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpscArrayQueueProducerFields<E> extends rx.internal.util.unsafe.SpscArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.SpscArrayQueueProducerFields.class, "producerIndex");
    protected long producerIndex;
    protected long producerLookAhead;

    public SpscArrayQueueProducerFields(int i) {
        super(i);
    }
}
