package org.jctools.queues;

/* loaded from: classes18.dex */
public class SpscGrowableArrayQueue<E> extends org.jctools.queues.BaseSpscLinkedArrayQueue<E> {
    private long lookAheadStep;
    private final int maxQueueCapacity;

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentConsumerIndex() {
        return super.currentConsumerIndex();
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentProducerIndex() {
        return super.currentProducerIndex();
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer) {
        return super.drain(consumer);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int fill(org.jctools.queues.MessagePassingQueue.Supplier supplier) {
        return super.fill(supplier);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int fill(org.jctools.queues.MessagePassingQueue.Supplier supplier, int i) {
        return super.fill(supplier, i);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void fill(org.jctools.queues.MessagePassingQueue.Supplier supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.fill(supplier, waitStrategy, exitCondition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean offer(java.lang.Object obj) {
        return super.offer(obj);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object peek() {
        return super.peek();
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object poll() {
        return super.poll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(java.lang.Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPeek() {
        return super.relaxedPeek();
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPoll() {
        return super.relaxedPoll();
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public SpscGrowableArrayQueue(int i) {
        this(java.lang.Math.max(8, org.jctools.util.Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    public SpscGrowableArrayQueue(int i, int i2) {
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i2, 16, "capacity");
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i, 8, "chunkSize");
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i2);
        this.maxQueueCapacity = roundToPowerOfTwo;
        int roundToPowerOfTwo2 = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        org.jctools.util.RangeUtil.checkLessThan(roundToPowerOfTwo2, roundToPowerOfTwo, "chunkCapacity");
        long j = roundToPowerOfTwo2 - 1;
        E[] eArr = (E[]) org.jctools.util.UnsafeRefArrayAccess.allocateRefArray(roundToPowerOfTwo2 + 1);
        this.producerBuffer = eArr;
        this.producerMask = j;
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        this.producerBufferLimit = j - 1;
        adjustLookAheadStep(roundToPowerOfTwo2);
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue
    final boolean offerColdPath(E[] eArr, long j, long j2, long j3, E e, org.jctools.queues.MessagePassingQueue.Supplier<? extends E> supplier) {
        long j4 = this.lookAheadStep;
        if (j4 > 0) {
            long j5 = j4 + j2;
            if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j5, j)) == null) {
                this.producerBufferLimit = j5 - 1;
                writeToQueue(eArr, e == null ? supplier.get() : e, j2, j3);
                return true;
            }
            int i = this.maxQueueCapacity;
            long j6 = j + 1;
            long j7 = i;
            if (j6 == j7) {
                if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, j3) != null) {
                    return false;
                }
                writeToQueue(eArr, e == null ? supplier.get() : e, j2, j3);
                return true;
            }
            if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j2 + 1, j)) == null) {
                writeToQueue(eArr, e == null ? supplier.get() : e, j2, j3);
                return true;
            }
            E[] eArr2 = (E[]) org.jctools.util.UnsafeRefArrayAccess.allocateRefArray((int) ((j6 * 2) + 1));
            this.producerBuffer = eArr2;
            this.producerMask = org.jctools.queues.LinkedArrayQueueUtil.length(eArr2) - 2;
            linkOldToNew(j2, eArr, j3, eArr2, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j2, this.producerMask), e == null ? supplier.get() : e);
            int i2 = (int) (this.producerMask + 1);
            if (i2 == i) {
                long lvConsumerIndex = lvConsumerIndex();
                this.lookAheadStep = -(j2 - lvConsumerIndex);
                this.producerBufferLimit = lvConsumerIndex + j7;
                return true;
            }
            this.producerBufferLimit = (this.producerMask + j2) - 1;
            adjustLookAheadStep(i2);
            return true;
        }
        long j8 = -j4;
        long lvConsumerIndex2 = lvConsumerIndex();
        int i3 = ((int) j) + 1;
        if (((int) (j2 - lvConsumerIndex2)) == i3) {
            return false;
        }
        long j9 = i3;
        if (lvConsumerIndex2 >= (this.producerBufferLimit - j9) + j8) {
            adjustLookAheadStep(i3);
        } else {
            this.lookAheadStep = (int) (lvConsumerIndex2 - r1);
        }
        this.producerBufferLimit = lvConsumerIndex2 + j9;
        writeToQueue(eArr, e == null ? supplier.get() : e, j2, j3);
        return true;
    }

    private void adjustLookAheadStep(int i) {
        this.lookAheadStep = java.lang.Math.min(i / 4, org.jctools.queues.SpscArrayQueue.MAX_LOOK_AHEAD_STEP);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return this.maxQueueCapacity;
    }
}
