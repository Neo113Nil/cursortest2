package org.jctools.queues;

/* loaded from: classes18.dex */
public class MpscLinkedQueue<E> extends org.jctools.queues.BaseLinkedQueue<E> {
    @Override // org.jctools.queues.BaseLinkedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    @Override // org.jctools.queues.BaseLinkedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer) {
        return super.drain(consumer);
    }

    @Override // org.jctools.queues.BaseLinkedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // org.jctools.queues.BaseLinkedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.BaseLinkedQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // org.jctools.queues.BaseLinkedQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object peek() {
        return super.peek();
    }

    @Override // org.jctools.queues.BaseLinkedQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object poll() {
        return super.poll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.BaseLinkedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(java.lang.Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // org.jctools.queues.BaseLinkedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPeek() {
        return super.relaxedPeek();
    }

    @Override // org.jctools.queues.BaseLinkedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPoll() {
        return super.relaxedPoll();
    }

    @Override // org.jctools.queues.BaseLinkedQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public MpscLinkedQueue() {
        org.jctools.queues.LinkedQueueNode<E> newNode = newNode();
        spConsumerNode(newNode);
        xchgProducerNode(newNode);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        org.jctools.queues.LinkedQueueNode<E> newNode = newNode(e);
        xchgProducerNode(newNode).soNext(newNode);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        org.jctools.queues.LinkedQueueNode<E> lpConsumerNode = lpConsumerNode();
        org.jctools.queues.LinkedQueueNode<E> nextConsumerNode = getNextConsumerNode(lpConsumerNode);
        while (true) {
            org.jctools.queues.LinkedQueueNode<E> linkedQueueNode = nextConsumerNode;
            org.jctools.queues.LinkedQueueNode<E> linkedQueueNode2 = lpConsumerNode;
            lpConsumerNode = linkedQueueNode;
            if (lpConsumerNode == null) {
                return false;
            }
            if (obj.equals(lpConsumerNode.lpValue())) {
                org.jctools.queues.LinkedQueueNode<E> nextConsumerNode2 = getNextConsumerNode(lpConsumerNode);
                if (nextConsumerNode2 != null) {
                    linkedQueueNode2.soNext(nextConsumerNode2);
                } else {
                    linkedQueueNode2.soNext(null);
                    if (!casProducerNode(lpConsumerNode, linkedQueueNode2)) {
                        linkedQueueNode2.soNext(spinWaitForNextNode(lpConsumerNode));
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
        org.jctools.queues.LinkedQueueNode<E> newNode = newNode(supplier.get());
        int i2 = 1;
        org.jctools.queues.LinkedQueueNode<E> linkedQueueNode = newNode;
        while (i2 < i) {
            org.jctools.queues.LinkedQueueNode<E> newNode2 = newNode(supplier.get());
            linkedQueueNode.spNext(newNode2);
            i2++;
            linkedQueueNode = newNode2;
        }
        xchgProducerNode(linkedQueueNode).soNext(newNode);
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    private org.jctools.queues.LinkedQueueNode<E> xchgProducerNode(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        org.jctools.queues.LinkedQueueNode<E> lvProducerNode;
        if (org.jctools.util.UnsafeAccess.SUPPORTS_GET_AND_SET_REF) {
            return (org.jctools.queues.LinkedQueueNode) org.jctools.util.UnsafeAccess.UNSAFE.getAndSetObject(this, P_NODE_OFFSET, linkedQueueNode);
        }
        do {
            lvProducerNode = lvProducerNode();
        } while (!com.google.android.gms.internal.mlkit_vision_barcode.zzec$$ExternalSyntheticBackportWithForwarding0.m(org.jctools.util.UnsafeAccess.UNSAFE, this, P_NODE_OFFSET, lvProducerNode, linkedQueueNode));
        return lvProducerNode;
    }

    private org.jctools.queues.LinkedQueueNode<E> getNextConsumerNode(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        org.jctools.queues.LinkedQueueNode<E> lvNext = linkedQueueNode.lvNext();
        return (lvNext != null || linkedQueueNode == lvProducerNode()) ? lvNext : spinWaitForNextNode(linkedQueueNode);
    }
}
