package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedAtomicArrayQueue<E> extends org.jctools.queues.atomic.BaseSpscLinkedAtomicArrayQueueProducerColdFields<E> implements org.jctools.queues.MessagePassingQueue<E>, org.jctools.queues.QueueProgressIndicators {
    private static final java.lang.Object JUMP = new java.lang.Object();

    abstract boolean offerColdPath(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, long j, long j2, int i, E e, org.jctools.queues.MessagePassingQueue.Supplier<? extends E> supplier);

    BaseSpscLinkedAtomicArrayQueue() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public final int size() {
        return org.jctools.queues.IndexedQueueSizeUtil.size(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
        return org.jctools.queues.IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return getClass().getName();
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    protected final void soNext(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray2) {
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.nextArrayOffset(atomicReferenceArray), atomicReferenceArray2);
    }

    protected final java.util.concurrent.atomic.AtomicReferenceArray<E> lvNextArrayAndUnlink(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray) {
        int nextArrayOffset = org.jctools.queues.atomic.AtomicQueueUtil.nextArrayOffset(atomicReferenceArray);
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, nextArrayOffset);
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, nextArrayOffset, null);
        return atomicReferenceArray2;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        return poll();
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        return peek();
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        int capacity = capacity();
        long j = 0;
        do {
            int fill = fill(supplier, org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH);
            if (fill == 0) {
                return (int) j;
            }
            j += fill;
        } while (j <= capacity);
        return (int) j;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, i);
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
        for (int i2 = 0; i2 < i; i2++) {
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.producerBuffer;
            long lpProducerIndex = lpProducerIndex();
            long j = this.producerMask;
            int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpProducerIndex, j);
            if (lpProducerIndex < this.producerBufferLimit) {
                writeToQueue(atomicReferenceArray, supplier.get(), lpProducerIndex, calcCircularRefElementOffset);
            } else if (!offerColdPath(atomicReferenceArray, j, lpProducerIndex, calcCircularRefElementOffset, null, supplier)) {
                return i2;
            }
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.producerBuffer;
        long lpProducerIndex = lpProducerIndex();
        long j = this.producerMask;
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpProducerIndex, j);
        if (lpProducerIndex < this.producerBufferLimit) {
            writeToQueue(atomicReferenceArray, e, lpProducerIndex, calcCircularRefElementOffset);
            return true;
        }
        return offerColdPath(atomicReferenceArray, j, lpProducerIndex, calcCircularRefElementOffset, e, null);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex, this.consumerMask);
        E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        boolean z = e == JUMP;
        if (e == null || z) {
            if (z) {
                return newBufferPoll(atomicReferenceArray, lpConsumerIndex);
            }
            return null;
        }
        soConsumerIndex(lpConsumerIndex + 1);
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex, this.consumerMask));
        return e == JUMP ? newBufferPeek(atomicReferenceArray, lpConsumerIndex) : e;
    }

    final void linkOldToNew(long j, java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i, java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray2, int i2, E e) {
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray2, i2, e);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, i, JUMP);
        soProducerIndex(j + 1);
    }

    final void writeToQueue(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, E e, long j, int i) {
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, i, e);
        soProducerIndex(j + 1);
    }

    private E newBufferPeek(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, long j) {
        java.util.concurrent.atomic.AtomicReferenceArray<E> lvNextArrayAndUnlink = lvNextArrayAndUnlink(atomicReferenceArray);
        this.consumerBuffer = lvNextArrayAndUnlink;
        long length = org.jctools.queues.atomic.AtomicQueueUtil.length(lvNextArrayAndUnlink) - 2;
        this.consumerMask = length;
        return (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(lvNextArrayAndUnlink, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j, length));
    }

    private E newBufferPoll(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, long j) {
        java.util.concurrent.atomic.AtomicReferenceArray<E> lvNextArrayAndUnlink = lvNextArrayAndUnlink(atomicReferenceArray);
        this.consumerBuffer = lvNextArrayAndUnlink;
        long length = org.jctools.queues.atomic.AtomicQueueUtil.length(lvNextArrayAndUnlink) - 2;
        this.consumerMask = length;
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j, length);
        E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(lvNextArrayAndUnlink, calcCircularRefElementOffset);
        if (e == null) {
            throw new java.lang.IllegalStateException("new buffer must have at least one element");
        }
        soConsumerIndex(j + 1);
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(lvNextArrayAndUnlink, calcCircularRefElementOffset, null);
        return e;
    }
}
