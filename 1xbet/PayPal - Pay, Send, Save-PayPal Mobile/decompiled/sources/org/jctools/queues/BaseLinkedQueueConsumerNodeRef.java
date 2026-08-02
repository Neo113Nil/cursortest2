package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseLinkedQueueConsumerNodeRef<E> extends org.jctools.queues.BaseLinkedQueuePad1<E> {
    private static final long C_NODE_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.BaseLinkedQueueConsumerNodeRef.class, "consumerNode");
    private org.jctools.queues.LinkedQueueNode<E> consumerNode;

    BaseLinkedQueueConsumerNodeRef() {
    }

    final void spConsumerNode(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }

    final org.jctools.queues.LinkedQueueNode<E> lvConsumerNode() {
        return (org.jctools.queues.LinkedQueueNode) org.jctools.util.UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
    }

    final org.jctools.queues.LinkedQueueNode<E> lpConsumerNode() {
        return this.consumerNode;
    }
}
