package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedAtomicArrayQueueProducerColdFields<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueProducerFields<E> {
    protected java.util.concurrent.atomic.AtomicReferenceArray<E> producerBuffer;
    protected long producerBufferLimit;
    protected long producerMask;

    BaseSpscLinkedAtomicArrayQueueProducerColdFields() {
    }
}
