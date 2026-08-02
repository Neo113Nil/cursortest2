package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedArrayQueueConsumerColdFields<E> extends org.jctools.queues.BaseSpscLinkedArrayQueuePrePad<E> {
    protected E[] consumerBuffer;
    protected long consumerMask;

    BaseSpscLinkedArrayQueueConsumerColdFields() {
    }
}
