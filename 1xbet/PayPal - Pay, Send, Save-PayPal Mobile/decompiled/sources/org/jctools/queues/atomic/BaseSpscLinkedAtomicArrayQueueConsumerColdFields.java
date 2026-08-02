package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedAtomicArrayQueueConsumerColdFields<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueuePrePad<E> {
    protected java.util.concurrent.atomic.AtomicReferenceArray<E> consumerBuffer;
    protected long consumerMask;

    BaseSpscLinkedAtomicArrayQueueConsumerColdFields() {
    }
}
