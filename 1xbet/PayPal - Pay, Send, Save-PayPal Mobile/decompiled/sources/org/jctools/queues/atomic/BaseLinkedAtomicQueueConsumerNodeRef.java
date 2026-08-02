package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseLinkedAtomicQueueConsumerNodeRef<E> extends org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1<E> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef, org.jctools.queues.atomic.LinkedQueueAtomicNode> C_NODE_UPDATER = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef.class, org.jctools.queues.atomic.LinkedQueueAtomicNode.class, "consumerNode");
    private volatile org.jctools.queues.atomic.LinkedQueueAtomicNode<E> consumerNode;

    BaseLinkedAtomicQueueConsumerNodeRef() {
    }

    final void spConsumerNode(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        C_NODE_UPDATER.lazySet(this, linkedQueueAtomicNode);
    }

    final org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lvConsumerNode() {
        return this.consumerNode;
    }

    final org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lpConsumerNode() {
        return this.consumerNode;
    }
}
