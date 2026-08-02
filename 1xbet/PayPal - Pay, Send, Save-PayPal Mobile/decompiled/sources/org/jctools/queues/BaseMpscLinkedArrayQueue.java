package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseMpscLinkedArrayQueue<E> extends org.jctools.queues.BaseMpscLinkedArrayQueueColdProducerFields<E> implements org.jctools.queues.MessagePassingQueue<E>, org.jctools.queues.QueueProgressIndicators {
    private static final java.lang.Object JUMP = new java.lang.Object();
    private static final java.lang.Object BUFFER_CONSUMED = new java.lang.Object();

    protected abstract long availableInQueue(long j, long j2);

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public abstract int capacity();

    protected abstract long getCurrentBufferCapacity(long j);

    protected abstract int getNextBufferSize(E[] eArr);

    public BaseMpscLinkedArrayQueue(int i) {
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i, 2, "initialCapacity");
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        long j = (roundToPowerOfTwo - 1) << 1;
        E[] eArr = (E[]) org.jctools.util.UnsafeRefArrayAccess.allocateRefArray(roundToPowerOfTwo + 1);
        this.producerBuffer = eArr;
        this.producerMask = j;
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        soProducerLimit(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public int size() {
        long lvProducerIndex;
        long lvConsumerIndex;
        long lvConsumerIndex2 = lvConsumerIndex();
        while (true) {
            lvProducerIndex = lvProducerIndex();
            lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                break;
            }
            lvConsumerIndex2 = lvConsumerIndex;
        }
        long j = (lvProducerIndex - lvConsumerIndex) >> 1;
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return getClass().getName();
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        while (true) {
            long lvProducerLimit = lvProducerLimit();
            long lvProducerIndex = lvProducerIndex();
            if ((lvProducerIndex & 1) != 1) {
                long j = this.producerMask;
                E[] eArr = this.producerBuffer;
                if (lvProducerLimit <= lvProducerIndex) {
                    int offerSlowPath = offerSlowPath(j, lvProducerIndex, lvProducerLimit);
                    if (offerSlowPath == 1) {
                        continue;
                    } else {
                        if (offerSlowPath == 2) {
                            return false;
                        }
                        if (offerSlowPath == 3) {
                            resize(j, eArr, lvProducerIndex, e, null);
                            return true;
                        }
                    }
                }
                if (casProducerIndex(lvProducerIndex, 2 + lvProducerIndex)) {
                    org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lvProducerIndex, j), e);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
            } while (e == null);
        }
        if (e == JUMP) {
            return newBufferPoll(nextBuffer(eArr, j), lpConsumerIndex);
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null && lpConsumerIndex != lvProducerIndex()) {
            do {
                e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
            } while (e == null);
        }
        return e == JUMP ? newBufferPeek(nextBuffer(eArr, j), lpConsumerIndex) : e;
    }

    private int offerSlowPath(long j, long j2, long j3) {
        long lvConsumerIndex = lvConsumerIndex();
        long currentBufferCapacity = getCurrentBufferCapacity(j) + lvConsumerIndex;
        if (currentBufferCapacity > j2) {
            return !casProducerLimit(j3, currentBufferCapacity) ? 1 : 0;
        }
        if (availableInQueue(j2, lvConsumerIndex) <= 0) {
            return 2;
        }
        return casProducerIndex(j2, 1 + j2) ? 3 : 1;
    }

    private E[] nextBuffer(E[] eArr, long j) {
        long nextArrayOffset = nextArrayOffset(j);
        E[] eArr2 = (E[]) ((java.lang.Object[]) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, nextArrayOffset));
        this.consumerBuffer = eArr2;
        this.consumerMask = (org.jctools.queues.LinkedArrayQueueUtil.length(eArr2) - 2) << 1;
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, nextArrayOffset, BUFFER_CONSUMED);
        return eArr2;
    }

    private static long nextArrayOffset(long j) {
        return org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j + 2, Long.MAX_VALUE);
    }

    private E newBufferPoll(E[] eArr, long j) {
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j, this.consumerMask);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            throw new java.lang.IllegalStateException("new buffer must have at least one element");
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(j + 2);
        return e;
    }

    private E newBufferPeek(E[] eArr, long j) {
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j, this.consumerMask));
        if (e != null) {
            return e;
        }
        throw new java.lang.IllegalStateException("new buffer must have at least one element");
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex() / 2;
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex() / 2;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            return null;
        }
        if (e == JUMP) {
            return newBufferPoll(nextBuffer(eArr, j), lpConsumerIndex);
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long j = this.consumerMask;
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j));
        return e == JUMP ? newBufferPeek(nextBuffer(eArr, j), lpConsumerIndex) : e;
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
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        long j;
        if (supplier == null) {
            throw new java.lang.IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative:".concat(java.lang.String.valueOf(i)));
        }
        if (i == 0) {
            return 0;
        }
        while (true) {
            long lvProducerLimit = lvProducerLimit();
            long lvProducerIndex = lvProducerIndex();
            if ((lvProducerIndex & 1) != 1) {
                long j2 = this.producerMask;
                E[] eArr = this.producerBuffer;
                long min = java.lang.Math.min(lvProducerLimit, (i * 2) + lvProducerIndex);
                if (lvProducerIndex >= lvProducerLimit) {
                    int offerSlowPath = offerSlowPath(j2, lvProducerIndex, lvProducerLimit);
                    if (offerSlowPath != 0 && offerSlowPath != 1) {
                        if (offerSlowPath == 2) {
                            return 0;
                        }
                        if (offerSlowPath == 3) {
                            resize(j2, eArr, lvProducerIndex, null, supplier);
                            return 1;
                        }
                        j = min;
                    }
                } else {
                    j = min;
                }
                if (casProducerIndex(lvProducerIndex, j)) {
                    int i2 = (int) ((j - lvProducerIndex) / 2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset((i3 * 2) + lvProducerIndex, j2), supplier.get());
                    }
                    return i2;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, i);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new org.jctools.queues.BaseMpscLinkedArrayQueue.WeakIterator(this.consumerBuffer, lvConsumerIndex(), lvProducerIndex());
    }

    static class WeakIterator<E> implements java.util.Iterator<E> {
        private E[] currentBuffer;
        private int mask;
        private E nextElement;
        private long nextIndex;
        private final long pIndex;

        WeakIterator(E[] eArr, long j, long j2) {
            this.pIndex = j2 >> 1;
            this.nextIndex = j >> 1;
            setBuffer(eArr);
            this.nextElement = getNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("remove");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextElement != null;
        }

        @Override // java.util.Iterator
        public E next() {
            E e = this.nextElement;
            if (e == null) {
                throw new java.util.NoSuchElementException();
            }
            this.nextElement = getNext();
            return e;
        }

        private void setBuffer(E[] eArr) {
            this.currentBuffer = eArr;
            this.mask = org.jctools.queues.LinkedArrayQueueUtil.length(eArr) - 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private E getNext() {
            while (true) {
                long j = this.nextIndex;
                if (j >= this.pIndex) {
                    return null;
                }
                this.nextIndex = 1 + j;
                E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j, this.mask));
                if (e != null) {
                    if (e != org.jctools.queues.BaseMpscLinkedArrayQueue.JUMP) {
                        return e;
                    }
                    java.lang.Object lvRefElement = org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, org.jctools.util.UnsafeRefArrayAccess.calcRefElementOffset(this.mask + 1));
                    if (lvRefElement == org.jctools.queues.BaseMpscLinkedArrayQueue.BUFFER_CONSUMED || lvRefElement == null) {
                        return null;
                    }
                    setBuffer((java.lang.Object[]) lvRefElement);
                    E e2 = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j, this.mask));
                    if (e2 != null) {
                        return e2;
                    }
                }
            }
        }
    }

    private void resize(long j, E[] eArr, long j2, E e, org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        int nextBufferSize = getNextBufferSize(eArr);
        try {
            E[] eArr2 = (E[]) org.jctools.util.UnsafeRefArrayAccess.allocateRefArray(nextBufferSize);
            this.producerBuffer = eArr2;
            long j3 = (nextBufferSize - 2) << 1;
            this.producerMask = j3;
            long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, j);
            long modifiedCalcCircularRefElementOffset2 = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, j3);
            if (e == null) {
                e = supplier.get();
            }
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr2, modifiedCalcCircularRefElementOffset2, e);
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, nextArrayOffset(j), eArr2);
            long availableInQueue = availableInQueue(j2, lvConsumerIndex());
            org.jctools.util.RangeUtil.checkPositive(availableInQueue, "availableInQueue");
            soProducerLimit(java.lang.Math.min(j3, availableInQueue) + j2);
            soProducerIndex(j2 + 2);
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, JUMP);
        } catch (java.lang.OutOfMemoryError e2) {
            soProducerIndex(j2);
            throw e2;
        }
    }
}
