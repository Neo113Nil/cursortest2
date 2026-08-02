package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class SpscGrowableAtomicArrayQueue<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue<E> {
    private long lookAheadStep;
    private final int maxQueueCapacity;

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

    public SpscGrowableAtomicArrayQueue(int i) {
        this(java.lang.Math.max(8, org.jctools.util.Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    public SpscGrowableAtomicArrayQueue(int i, int i2) {
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
        adjustLookAheadStep(roundToPowerOfTwo2);
    }

    @Override // org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueue
    final boolean offerColdPath(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, long j, long j2, int i, E e, org.jctools.queues.MessagePassingQueue.Supplier<? extends E> supplier) {
        long j3 = this.lookAheadStep;
        if (j3 > 0) {
            long j4 = j3 + j2;
            if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j4, j)) == null) {
                this.producerBufferLimit = j4 - 1;
                writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
                return true;
            }
            int i2 = this.maxQueueCapacity;
            long j5 = j + 1;
            long j6 = i2;
            if (j5 == j6) {
                if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, i) != null) {
                    return false;
                }
                writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
                return true;
            }
            if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j2 + 1, j)) == null) {
                writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
                return true;
            }
            java.util.concurrent.atomic.AtomicReferenceArray<E> allocateRefArray = org.jctools.queues.atomic.AtomicQueueUtil.allocateRefArray((int) ((j5 * 2) + 1));
            this.producerBuffer = allocateRefArray;
            this.producerMask = org.jctools.queues.atomic.AtomicQueueUtil.length(allocateRefArray) - 2;
            linkOldToNew(j2, atomicReferenceArray, i, allocateRefArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j2, this.producerMask), e == null ? supplier.get() : e);
            int i3 = (int) (this.producerMask + 1);
            if (i3 == i2) {
                long lvConsumerIndex = lvConsumerIndex();
                this.lookAheadStep = -(j2 - lvConsumerIndex);
                this.producerBufferLimit = lvConsumerIndex + j6;
                return true;
            }
            this.producerBufferLimit = (this.producerMask + j2) - 1;
            adjustLookAheadStep(i3);
            return true;
        }
        long j7 = -j3;
        long lvConsumerIndex2 = lvConsumerIndex();
        int i4 = ((int) j) + 1;
        if (((int) (j2 - lvConsumerIndex2)) == i4) {
            return false;
        }
        long j8 = i4;
        if (lvConsumerIndex2 >= (this.producerBufferLimit - j8) + j7) {
            adjustLookAheadStep(i4);
        } else {
            this.lookAheadStep = (int) (lvConsumerIndex2 - r1);
        }
        this.producerBufferLimit = lvConsumerIndex2 + j8;
        writeToQueue(atomicReferenceArray, e == null ? supplier.get() : e, j2, i);
        return true;
    }

    private void adjustLookAheadStep(int i) {
        this.lookAheadStep = java.lang.Math.min(i / 4, org.jctools.queues.atomic.SpscAtomicArrayQueue.MAX_LOOK_AHEAD_STEP);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return this.maxQueueCapacity;
    }
}
