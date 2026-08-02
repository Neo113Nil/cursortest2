package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseLinkedQueue<E> extends org.jctools.queues.BaseLinkedQueuePad2<E> {
    @Override // org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return -1;
    }

    BaseLinkedQueue() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return getClass().getName();
    }

    protected final org.jctools.queues.LinkedQueueNode<E> newNode() {
        return new org.jctools.queues.LinkedQueueNode<>();
    }

    protected final org.jctools.queues.LinkedQueueNode<E> newNode(E e) {
        return new org.jctools.queues.LinkedQueueNode<>(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public final int size() {
        org.jctools.queues.LinkedQueueNode<E> lvConsumerNode = lvConsumerNode();
        org.jctools.queues.LinkedQueueNode<E> lvProducerNode = lvProducerNode();
        int i = 0;
        while (lvConsumerNode != lvProducerNode && lvConsumerNode != null && i < Integer.MAX_VALUE) {
            org.jctools.queues.LinkedQueueNode<E> lvNext = lvConsumerNode.lvNext();
            if (lvNext == lvConsumerNode) {
                break;
            }
            i++;
            lvConsumerNode = lvNext;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }

    protected E getSingleConsumerNodeValue(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode, org.jctools.queues.LinkedQueueNode<E> linkedQueueNode2) {
        E andNullValue = linkedQueueNode2.getAndNullValue();
        linkedQueueNode.soNext(linkedQueueNode);
        spConsumerNode(linkedQueueNode2);
        return andNullValue;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        org.jctools.queues.LinkedQueueNode<E> lpConsumerNode = lpConsumerNode();
        org.jctools.queues.LinkedQueueNode<E> lvNext = lpConsumerNode.lvNext();
        if (lvNext != null) {
            return getSingleConsumerNodeValue(lpConsumerNode, lvNext);
        }
        if (lpConsumerNode != lvProducerNode()) {
            return getSingleConsumerNodeValue(lpConsumerNode, spinWaitForNextNode(lpConsumerNode));
        }
        return null;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        org.jctools.queues.LinkedQueueNode<E> lpConsumerNode = lpConsumerNode();
        org.jctools.queues.LinkedQueueNode<E> lvNext = lpConsumerNode.lvNext();
        if (lvNext != null) {
            return lvNext.lpValue();
        }
        if (lpConsumerNode != lvProducerNode()) {
            return spinWaitForNextNode(lpConsumerNode).lpValue();
        }
        return null;
    }

    org.jctools.queues.LinkedQueueNode<E> spinWaitForNextNode(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        org.jctools.queues.LinkedQueueNode<E> lvNext;
        do {
            lvNext = linkedQueueNode.lvNext();
        } while (lvNext == null);
        return lvNext;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        org.jctools.queues.LinkedQueueNode<E> lpConsumerNode = lpConsumerNode();
        org.jctools.queues.LinkedQueueNode<E> lvNext = lpConsumerNode.lvNext();
        if (lvNext != null) {
            return getSingleConsumerNodeValue(lpConsumerNode, lvNext);
        }
        return null;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        org.jctools.queues.LinkedQueueNode<E> lvNext = lpConsumerNode().lvNext();
        if (lvNext != null) {
            return lvNext.lpValue();
        }
        return null;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        if (consumer == null) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        org.jctools.queues.LinkedQueueNode<E> lpConsumerNode = lpConsumerNode();
        while (i2 < i) {
            org.jctools.queues.LinkedQueueNode<E> lvNext = lpConsumerNode.lvNext();
            if (lvNext == null) {
                return i2;
            }
            consumer.accept(getSingleConsumerNodeValue(lpConsumerNode, lvNext));
            i2++;
            lpConsumerNode = lvNext;
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }
}
