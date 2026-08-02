package rx.internal.util.atomic;

/* loaded from: classes18.dex */
public final class MpscLinkedAtomicQueue<E> extends rx.internal.util.atomic.BaseLinkedAtomicQueue<E> {
    public MpscLinkedAtomicQueue() {
        rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode = new rx.internal.util.atomic.LinkedQueueNode<>();
        spConsumerNode(linkedQueueNode);
        xchgProducerNode(linkedQueueNode);
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode = new rx.internal.util.atomic.LinkedQueueNode<>(e);
        xchgProducerNode(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext;
        rx.internal.util.atomic.LinkedQueueNode<E> lpConsumerNode = lpConsumerNode();
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext2 = lpConsumerNode.lvNext();
        if (lvNext2 != null) {
            E andNullValue = lvNext2.getAndNullValue();
            spConsumerNode(lvNext2);
            return andNullValue;
        }
        if (lpConsumerNode == lvProducerNode()) {
            return null;
        }
        do {
            lvNext = lpConsumerNode.lvNext();
        } while (lvNext == null);
        E andNullValue2 = lvNext.getAndNullValue();
        spConsumerNode(lvNext);
        return andNullValue2;
    }

    @Override // java.util.Queue
    public final E peek() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext;
        rx.internal.util.atomic.LinkedQueueNode<E> lpConsumerNode = lpConsumerNode();
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext2 = lpConsumerNode.lvNext();
        if (lvNext2 != null) {
            return lvNext2.lpValue();
        }
        if (lpConsumerNode == lvProducerNode()) {
            return null;
        }
        do {
            lvNext = lpConsumerNode.lvNext();
        } while (lvNext == null);
        return lvNext.lpValue();
    }
}
