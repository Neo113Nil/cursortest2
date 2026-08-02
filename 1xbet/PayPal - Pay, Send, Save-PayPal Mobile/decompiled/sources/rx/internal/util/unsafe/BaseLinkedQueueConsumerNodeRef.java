package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class BaseLinkedQueueConsumerNodeRef<E> extends rx.internal.util.unsafe.BaseLinkedQueuePad1<E> {
    protected static final long C_NODE_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef.class, "consumerNode");
    protected rx.internal.util.atomic.LinkedQueueNode<E> consumerNode;

    BaseLinkedQueueConsumerNodeRef() {
    }

    protected final void spConsumerNode(rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lvConsumerNode() {
        return (rx.internal.util.atomic.LinkedQueueNode) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lpConsumerNode() {
        return this.consumerNode;
    }
}
