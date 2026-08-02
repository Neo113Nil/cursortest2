package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseLinkedAtomicQueueProducerNodeRef<E> extends org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0<E> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef, org.jctools.queues.atomic.LinkedQueueAtomicNode> P_NODE_UPDATER = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef.class, org.jctools.queues.atomic.LinkedQueueAtomicNode.class, "producerNode");
    private volatile org.jctools.queues.atomic.LinkedQueueAtomicNode<E> producerNode;

    BaseLinkedAtomicQueueProducerNodeRef() {
    }

    final void spProducerNode(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        P_NODE_UPDATER.lazySet(this, linkedQueueAtomicNode);
    }

    final void soProducerNode(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        P_NODE_UPDATER.lazySet(this, linkedQueueAtomicNode);
    }

    final org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lvProducerNode() {
        return this.producerNode;
    }

    final boolean casProducerNode(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode, org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode2) {
        return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(P_NODE_UPDATER, this, linkedQueueAtomicNode, linkedQueueAtomicNode2);
    }

    final org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lpProducerNode() {
        return this.producerNode;
    }

    protected final org.jctools.queues.atomic.LinkedQueueAtomicNode<E> xchgProducerNode(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        return P_NODE_UPDATER.getAndSet(this, linkedQueueAtomicNode);
    }
}
