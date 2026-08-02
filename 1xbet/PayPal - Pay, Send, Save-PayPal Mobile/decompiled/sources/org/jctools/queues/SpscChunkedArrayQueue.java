package org.jctools.queues;

/* loaded from: classes18.dex */
public class SpscChunkedArrayQueue<E> extends org.jctools.queues.BaseSpscLinkedArrayQueue<E> {
    private final int maxQueueCapacity;
    private long producerQueueLimit;

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

    public SpscChunkedArrayQueue(int i) {
        this(java.lang.Math.max(8, org.jctools.util.Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    public SpscChunkedArrayQueue(int i, int i2) {
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
        this.producerQueueLimit = roundToPowerOfTwo;
    }

    @Override // org.jctools.queues.BaseSpscLinkedArrayQueue
    final boolean offerColdPath(E[] eArr, long j, long j2, long j3, E e, org.jctools.queues.MessagePassingQueue.Supplier<? extends E> supplier) {
        long j4 = j2 + ((j + 1) / 4);
        long j5 = this.producerQueueLimit;
        if (j2 >= j5) {
            j5 = lvConsumerIndex() + this.maxQueueCapacity;
            this.producerQueueLimit = j5;
            if (j2 >= j5) {
                return false;
            }
        }
        if (j4 - j5 > 0) {
            j4 = j5;
        }
        long j6 = j2 + 1;
        if (j4 > j6 && org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j4, j)) == null) {
            this.producerBufferLimit = j4 - 1;
            writeToQueue(eArr, e == null ? supplier.get() : e, j2, j3);
            return true;
        }
        if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j6, j)) == null) {
            writeToQueue(eArr, e == null ? supplier.get() : e, j2, j3);
            return true;
        }
        E[] eArr2 = (E[]) org.jctools.util.UnsafeRefArrayAccess.allocateRefArray((int) (j + 2));
        this.producerBuffer = eArr2;
        linkOldToNew(j2, eArr, j3, eArr2, j3, e == null ? supplier.get() : e);
        return true;
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return this.maxQueueCapacity;
    }
}
