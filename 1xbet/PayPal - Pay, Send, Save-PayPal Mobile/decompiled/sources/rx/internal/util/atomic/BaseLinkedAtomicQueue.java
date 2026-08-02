package rx.internal.util.atomic;

/* loaded from: classes18.dex */
abstract class BaseLinkedAtomicQueue<E> extends java.util.AbstractQueue<E> {
    private final java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
    private final java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lvProducerNode() {
        return this.getHighSpeedVideoSizes.get();
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lpProducerNode() {
        return this.getHighSpeedVideoSizes.get();
    }

    protected final void spProducerNode(rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode) {
        this.getHighSpeedVideoSizes.lazySet(linkedQueueNode);
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> xchgProducerNode(rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode) {
        return this.getHighSpeedVideoSizes.getAndSet(linkedQueueNode);
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lvConsumerNode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get();
    }

    protected final rx.internal.util.atomic.LinkedQueueNode<E> lpConsumerNode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get();
    }

    protected final void spConsumerNode(rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode) {
        this.getHighResolutionOutputSizeshNQ4ISI.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        rx.internal.util.atomic.LinkedQueueNode<E> lvNext;
        rx.internal.util.atomic.LinkedQueueNode<E> lvConsumerNode = lvConsumerNode();
        rx.internal.util.atomic.LinkedQueueNode<E> lvProducerNode = lvProducerNode();
        int i = 0;
        while (lvConsumerNode != lvProducerNode && i < Integer.MAX_VALUE) {
            do {
                lvNext = lvConsumerNode.lvNext();
            } while (lvNext == null);
            i++;
            lvConsumerNode = lvNext;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }
}
