package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedArrayQueueProducerColdFields<E> extends org.jctools.queues.BaseSpscLinkedArrayQueueProducerFields<E> {
    protected E[] producerBuffer;
    protected long producerBufferLimit;
    protected long producerMask;

    BaseSpscLinkedArrayQueueProducerColdFields() {
    }
}
