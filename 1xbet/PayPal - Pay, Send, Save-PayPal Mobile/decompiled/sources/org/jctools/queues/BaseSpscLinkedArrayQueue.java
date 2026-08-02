package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedArrayQueue<E> extends org.jctools.queues.BaseSpscLinkedArrayQueueProducerColdFields<E> implements org.jctools.queues.MessagePassingQueue<E>, org.jctools.queues.QueueProgressIndicators {
    private static final java.lang.Object JUMP = new java.lang.Object();

    abstract boolean offerColdPath(E[] eArr, long j, long j2, long j3, E e, org.jctools.queues.MessagePassingQueue.Supplier<? extends E> supplier);

    BaseSpscLinkedArrayQueue() {
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

    protected final void soNext(E[] eArr, E[] eArr2) {
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.nextArrayOffset(eArr), eArr2);
    }

    protected final E[] lvNextArrayAndUnlink(E[] eArr) {
        long nextArrayOffset = org.jctools.queues.LinkedArrayQueueUtil.nextArrayOffset(eArr);
        E[] eArr2 = (E[]) ((java.lang.Object[]) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, nextArrayOffset));
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, nextArrayOffset, null);
        return eArr2;
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
            E[] eArr = this.producerBuffer;
            long lpProducerIndex = lpProducerIndex();
            long j = this.producerMask;
            long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpProducerIndex, j);
            if (lpProducerIndex < this.producerBufferLimit) {
                writeToQueue(eArr, supplier.get(), lpProducerIndex, calcCircularRefElementOffset);
            } else if (!offerColdPath(eArr, j, lpProducerIndex, calcCircularRefElementOffset, null, supplier)) {
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
        E[] eArr = this.producerBuffer;
        long lpProducerIndex = lpProducerIndex();
        long j = this.producerMask;
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpProducerIndex, j);
        if (lpProducerIndex < this.producerBufferLimit) {
            writeToQueue(eArr, e, lpProducerIndex, calcCircularRefElementOffset);
            return true;
        }
        return offerColdPath(eArr, j, lpProducerIndex, calcCircularRefElementOffset, e, null);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex, this.consumerMask);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
        boolean z = e == JUMP;
        if (e == null || z) {
            if (z) {
                return newBufferPoll(eArr, lpConsumerIndex);
            }
            return null;
        }
        soConsumerIndex(lpConsumerIndex + 1);
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, null);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex, this.consumerMask));
        return e == JUMP ? newBufferPeek(eArr, lpConsumerIndex) : e;
    }

    final void linkOldToNew(long j, E[] eArr, long j2, E[] eArr2, long j3, E e) {
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr2, j3, e);
        soNext(eArr, eArr2);
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, j2, JUMP);
        soProducerIndex(j + 1);
    }

    final void writeToQueue(E[] eArr, E e, long j, long j2) {
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, j2, e);
        soProducerIndex(j + 1);
    }

    private E newBufferPeek(E[] eArr, long j) {
        E[] lvNextArrayAndUnlink = lvNextArrayAndUnlink(eArr);
        this.consumerBuffer = lvNextArrayAndUnlink;
        long length = org.jctools.queues.LinkedArrayQueueUtil.length(lvNextArrayAndUnlink) - 2;
        this.consumerMask = length;
        return (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(lvNextArrayAndUnlink, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j, length));
    }

    private E newBufferPoll(E[] eArr, long j) {
        E[] lvNextArrayAndUnlink = lvNextArrayAndUnlink(eArr);
        this.consumerBuffer = lvNextArrayAndUnlink;
        long length = org.jctools.queues.LinkedArrayQueueUtil.length(lvNextArrayAndUnlink) - 2;
        this.consumerMask = length;
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j, length);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(lvNextArrayAndUnlink, calcCircularRefElementOffset);
        if (e == null) {
            throw new java.lang.IllegalStateException("new buffer must have at least one element");
        }
        soConsumerIndex(j + 1);
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(lvNextArrayAndUnlink, calcCircularRefElementOffset, null);
        return e;
    }
}
