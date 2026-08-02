package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public final class MpscLinkedQueue<E> extends rx.internal.util.unsafe.BaseLinkedQueue<E> {
    public MpscLinkedQueue() {
        this.consumerNode = new rx.internal.util.atomic.LinkedQueueNode<>();
        xchgProducerNode(this.consumerNode);
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> xchgProducerNode(rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode) {
        rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode2;
        do {
            linkedQueueNode2 = this.producerNode;
        } while (!com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(rx.internal.util.unsafe.UnsafeAccess.UNSAFE, this, P_NODE_OFFSET, linkedQueueNode2, linkedQueueNode));
        return linkedQueueNode2;
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
        this.consumerNode = lvNext;
        return andNullValue2;
    }

    @Override // java.util.Queue
    public final E peek() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext;
        rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode = this.consumerNode;
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext2 = linkedQueueNode.lvNext();
        if (lvNext2 != null) {
            return lvNext2.lpValue();
        }
        if (linkedQueueNode == lvProducerNode()) {
            return null;
        }
        do {
            lvNext = linkedQueueNode.lvNext();
        } while (lvNext == null);
        return lvNext.lpValue();
    }
}
