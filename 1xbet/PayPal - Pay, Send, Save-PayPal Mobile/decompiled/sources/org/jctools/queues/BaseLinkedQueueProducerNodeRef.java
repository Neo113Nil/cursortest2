package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseLinkedQueueProducerNodeRef<E> extends org.jctools.queues.BaseLinkedQueuePad0<E> {
    static final long P_NODE_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.BaseLinkedQueueProducerNodeRef.class, "producerNode");
    private volatile org.jctools.queues.LinkedQueueNode<E> producerNode;

    BaseLinkedQueueProducerNodeRef() {
    }

    final void spProducerNode(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        org.jctools.util.UnsafeAccess.UNSAFE.putObject(this, P_NODE_OFFSET, linkedQueueNode);
    }

    final void soProducerNode(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedObject(this, P_NODE_OFFSET, linkedQueueNode);
    }

    final org.jctools.queues.LinkedQueueNode<E> lvProducerNode() {
        return this.producerNode;
    }

    final boolean casProducerNode(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode, org.jctools.queues.LinkedQueueNode<E> linkedQueueNode2) {
        return com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, this, P_NODE_OFFSET, linkedQueueNode, linkedQueueNode2);
    }

    final org.jctools.queues.LinkedQueueNode<E> lpProducerNode() {
        return this.producerNode;
    }
}
