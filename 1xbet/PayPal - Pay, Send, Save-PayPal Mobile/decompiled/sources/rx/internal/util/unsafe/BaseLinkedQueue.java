package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class BaseLinkedQueue<E> extends rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef<E> {
    BaseLinkedQueue() {
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
