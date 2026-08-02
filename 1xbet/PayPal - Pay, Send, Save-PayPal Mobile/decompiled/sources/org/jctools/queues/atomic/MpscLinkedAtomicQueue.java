package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class MpscLinkedAtomicQueue<E> extends org.jctools.queues.atomic.BaseLinkedAtomicQueue<E> {
    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer) {
        return super.drain(consumer);
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object peek() {
        return super.peek();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object poll() {
        return super.poll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(java.lang.Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPeek() {
        return super.relaxedPeek();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPoll() {
        return super.relaxedPoll();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public MpscLinkedAtomicQueue() {
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> newNode = newNode();
        spConsumerNode(newNode);
        xchgProducerNode(newNode);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> newNode = newNode(e);
        xchgProducerNode(newNode).soNext(newNode);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lpConsumerNode = lpConsumerNode();
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> nextConsumerNode = getNextConsumerNode(lpConsumerNode);
        while (true) {
            org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode = nextConsumerNode;
            org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode2 = lpConsumerNode;
            lpConsumerNode = linkedQueueAtomicNode;
            if (lpConsumerNode == null) {
                return false;
            }
            if (obj.equals(lpConsumerNode.lpValue())) {
                org.jctools.queues.atomic.LinkedQueueAtomicNode<E> nextConsumerNode2 = getNextConsumerNode(lpConsumerNode);
                if (nextConsumerNode2 != null) {
                    linkedQueueAtomicNode2.soNext(nextConsumerNode2);
                } else {
                    linkedQueueAtomicNode2.soNext(null);
                    if (!casProducerNode(lpConsumerNode, linkedQueueAtomicNode2)) {
                        linkedQueueAtomicNode2.soNext(spinWaitForNextNode(lpConsumerNode));
                    }
                }
                lpConsumerNode.soNext(null);
                lpConsumerNode.spValue(null);
                return true;
            }
            nextConsumerNode = getNextConsumerNode(lpConsumerNode);
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return org.jctools.queues.MessagePassingQueueUtil.fillUnbounded(this, supplier);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        if (supplier == null) {
            throw new java.lang.IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative:".concat(java.lang.String.valueOf(i)));
        }
        if (i == 0) {
            return 0;
        }
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> newNode = newNode(supplier.get());
        int i2 = 1;
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode = newNode;
        while (i2 < i) {
            org.jctools.queues.atomic.LinkedQueueAtomicNode<E> newNode2 = newNode(supplier.get());
            linkedQueueAtomicNode.spNext(newNode2);
            i2++;
            linkedQueueAtomicNode = newNode2;
        }
        xchgProducerNode(linkedQueueAtomicNode).soNext(newNode);
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    private org.jctools.queues.atomic.LinkedQueueAtomicNode<E> getNextConsumerNode(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lvNext = linkedQueueAtomicNode.lvNext();
        return (lvNext != null || linkedQueueAtomicNode == lvProducerNode()) ? lvNext : spinWaitForNextNode(linkedQueueAtomicNode);
    }
}
