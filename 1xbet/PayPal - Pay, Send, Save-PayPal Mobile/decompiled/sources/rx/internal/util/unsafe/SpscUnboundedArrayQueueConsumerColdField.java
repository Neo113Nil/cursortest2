package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpscUnboundedArrayQueueConsumerColdField<E> extends rx.internal.util.unsafe.SpscUnboundedArrayQueueL2Pad<E> {
    protected E[] consumerBuffer;
    protected long consumerMask;

    SpscUnboundedArrayQueueConsumerColdField() {
    }
}
