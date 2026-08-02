package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class SpscUnboundedAtomicArrayQueue<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue<E> {
    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return -1;
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentConsumerIndex() {
        return super.currentConsumerIndex();
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentProducerIndex() {
        return super.currentProducerIndex();
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer) {
        return super.drain(consumer);
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int fill(org.jctools.queues.MessagePassingQueue.Supplier supplier, int i) {
        return super.fill(supplier, i);
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void fill(org.jctools.queues.MessagePassingQueue.Supplier supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.fill(supplier, waitStrategy, exitCondition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean offer(java.lang.Object obj) {
        return super.offer(obj);
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object peek() {
        return super.peek();
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object poll() {
        return super.poll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(java.lang.Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPeek() {
        return super.relaxedPeek();
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPoll() {
        return super.relaxedPoll();
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public SpscUnboundedAtomicArrayQueue(int i) {
        int max = java.lang.Math.max(org.jctools.util.Pow2.roundToPowerOfTwo(i), 16);
        long j = max - 1;
        java.util.concurrent.atomic.AtomicReferenceArray<E> allocateRefArray = org.jctools.queues.atomic.AtomicQueueUtil.allocateRefArray(max + 1);
        this.producerBuffer = allocateRefArray;
        this.producerMask = j;
        this.consumerBuffer = allocateRefArray;
        this.consumerMask = j;
        this.producerBufferLimit = j - 1;
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue
    final boolean offerColdPath(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, long j, long j2, int i, E e, org.jctools.queues.MessagePassingQueue.Supplier<? extends E> supplier) {
        long j3 = ((j + 1) / 4) + j2;
        if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j3, j)) == null) {
            this.producerBufferLimit = j3 - 1;
            writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
            return true;
        }
        if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j2 + 1, j)) == null) {
            writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
            return true;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<E> allocateRefArray = org.jctools.queues.atomic.AtomicQueueUtil.allocateRefArray((int) (2 + j));
        this.producerBuffer = allocateRefArray;
        this.producerBufferLimit = (j + j2) - 1;
        linkOldToNew(j2, atomicReferenceArray, i, allocateRefArray, i, e == null ? supplier.get() : e);
        return true;
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return fill(supplier, (int) this.producerMask);
    }
}
