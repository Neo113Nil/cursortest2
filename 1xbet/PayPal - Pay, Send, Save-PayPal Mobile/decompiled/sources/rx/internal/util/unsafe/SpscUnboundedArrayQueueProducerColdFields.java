package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpscUnboundedArrayQueueProducerColdFields<E> extends rx.internal.util.unsafe.SpscUnboundedArrayQueueProducerFields<E> {
    protected E[] producerBuffer;
    protected long producerLookAhead;
    protected int producerLookAheadStep;
    protected long producerMask;

    SpscUnboundedArrayQueueProducerColdFields() {
    }
}
