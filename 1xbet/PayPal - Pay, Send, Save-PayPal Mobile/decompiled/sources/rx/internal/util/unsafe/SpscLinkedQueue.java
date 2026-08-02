package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public final class SpscLinkedQueue<E> extends rx.internal.util.unsafe.BaseLinkedQueue<E> {
    public SpscLinkedQueue() {
        spProducerNode(new rx.internal.util.atomic.LinkedQueueNode<>());
        spConsumerNode(this.producerNode);
        this.consumerNode.soNext(null);
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode = new rx.internal.util.atomic.LinkedQueueNode<>(e);
        this.producerNode.soNext(linkedQueueNode);
        this.producerNode = linkedQueueNode;
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext = this.consumerNode.lvNext();
        if (lvNext == null) {
            return null;
        }
        E andNullValue = lvNext.getAndNullValue();
        this.consumerNode = lvNext;
        return andNullValue;
    }

    @Override // java.util.Queue
    public final E peek() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext = this.consumerNode.lvNext();
        if (lvNext != null) {
            return lvNext.lpValue();
        }
        return null;
    }
}
