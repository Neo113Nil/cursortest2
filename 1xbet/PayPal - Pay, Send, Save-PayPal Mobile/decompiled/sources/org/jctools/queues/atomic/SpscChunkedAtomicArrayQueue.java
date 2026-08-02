package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class SpscChunkedAtomicArrayQueue<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue<E> {
    private final int maxQueueCapacity;
    private long producerQueueLimit;

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
    public /* bridge */ /* synthetic */ int fill(org.jctools.queues.MessagePassingQueue.Supplier supplier) {
        return super.fill(supplier);
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

    public SpscChunkedAtomicArrayQueue(int i) {
        this(java.lang.Math.max(8, org.jctools.util.Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    public SpscChunkedAtomicArrayQueue(int i, int i2) {
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i2, 16, "capacity");
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i, 8, "chunkSize");
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i2);
        this.maxQueueCapacity = roundToPowerOfTwo;
        int roundToPowerOfTwo2 = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        org.jctools.util.RangeUtil.checkLessThan(roundToPowerOfTwo2, roundToPowerOfTwo, "chunkCapacity");
        long j = roundToPowerOfTwo2 - 1;
        java.util.concurrent.atomic.AtomicReferenceArray<E> allocateRefArray = org.jctools.queues.atomic.AtomicQueueUtil.allocateRefArray(roundToPowerOfTwo2 + 1);
        this.producerBuffer = allocateRefArray;
        this.producerMask = j;
        this.consumerBuffer = allocateRefArray;
        this.consumerMask = j;
        this.producerBufferLimit = j - 1;
        this.producerQueueLimit = roundToPowerOfTwo;
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue
    final boolean offerColdPath(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, long j, long j2, int i, E e, org.jctools.queues.MessagePassingQueue.Supplier<? extends E> supplier) {
        long j3 = j2 + ((j + 1) / 4);
        long j4 = this.producerQueueLimit;
        if (j2 >= j4) {
            j4 = lvConsumerIndex() + this.maxQueueCapacity;
            this.producerQueueLimit = j4;
            if (j2 >= j4) {
                return false;
            }
        }
        if (j3 - j4 > 0) {
            j3 = j4;
        }
        long j5 = j2 + 1;
        if (j3 > j5 && org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j3, j)) == null) {
            this.producerBufferLimit = j3 - 1;
            writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
            return true;
        }
        if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j5, j)) == null) {
            writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
            return true;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<E> allocateRefArray = org.jctools.queues.atomic.AtomicQueueUtil.allocateRefArray((int) (j + 2));
        this.producerBuffer = allocateRefArray;
        linkOldToNew(j2, atomicReferenceArray, i, allocateRefArray, i, e == null ? supplier.get() : e);
        return true;
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return this.maxQueueCapacity;
    }
}
