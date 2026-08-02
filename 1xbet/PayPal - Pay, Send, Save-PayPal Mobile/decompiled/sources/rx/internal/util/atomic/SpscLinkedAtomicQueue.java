package rx.internal.util.atomic;

/* loaded from: classes18.dex */
public final class SpscLinkedAtomicQueue<E> extends rx.internal.util.atomic.BaseLinkedAtomicQueue<E> {
    public SpscLinkedAtomicQueue() {
        rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode = new rx.internal.util.atomic.LinkedQueueNode<>();
        spProducerNode(linkedQueueNode);
        spConsumerNode(linkedQueueNode);
        linkedQueueNode.soNext(null);
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode = new rx.internal.util.atomic.LinkedQueueNode<>(e);
        lpProducerNode().soNext(linkedQueueNode);
        spProducerNode(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext = lpConsumerNode().lvNext();
        if (lvNext == null) {
            return null;
        }
        E andNullValue = lvNext.getAndNullValue();
        spConsumerNode(lvNext);
        return andNullValue;
    }

    @Override // java.util.Queue
    public final E peek() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext = lpConsumerNode().lvNext();
        if (lvNext != null) {
            return lvNext.lpValue();
        }
        return null;
    }
}
