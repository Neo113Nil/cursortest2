package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class BaseLinkedQueueProducerNodeRef<E> extends rx.internal.util.unsafe.BaseLinkedQueuePad0<E> {
    protected static final long P_NODE_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef.class, "producerNode");
    protected rx.internal.util.atomic.LinkedQueueNode<E> producerNode;

    BaseLinkedQueueProducerNodeRef() {
    }

    protected final void spProducerNode(rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lvProducerNode() {
        return (rx.internal.util.atomic.LinkedQueueNode) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lpProducerNode() {
        return this.producerNode;
    }
}
