package org.jctools.queues;

/* loaded from: classes5.dex */
public class MpscBlockingConsumerArrayQueue<E> extends org.jctools.queues.MpscBlockingConsumerArrayQueueConsumerFields<E> implements org.jctools.queues.MessagePassingQueue<E>, org.jctools.queues.QueueProgressIndicators, java.util.concurrent.BlockingQueue<E> {
    public MpscBlockingConsumerArrayQueue(int i) {
        super((org.jctools.util.Pow2.roundToPowerOfTwo(i) - 1) << 1, org.jctools.util.UnsafeRefArrayAccess.allocateRefArray(org.jctools.util.Pow2.roundToPowerOfTwo(i)));
        org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i, 1, "capacity");
        soProducerLimit((org.jctools.util.Pow2.roundToPowerOfTwo(i) - 1) << 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public final int size() {
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
    public final boolean isEmpty() {
        return lvConsumerIndex() / 2 == lvProducerIndex() / 2;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return getClass().getName();
    }

    public boolean offerIfBelowThreshold(E e, int i) {
        long j;
        long j2;
        E[] eArr;
        e.getClass();
        long j3 = this.producerMask;
        long j4 = j3 + 2;
        E[] eArr2 = this.producerBuffer;
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            if ((lvProducerIndex & 1) == 1) {
                if (offerAndWakeup(eArr2, j3, lvProducerIndex, e)) {
                    return true;
                }
            } else {
                long lvProducerLimit = lvProducerLimit();
                long j5 = i << 1;
                if (j4 - (lvProducerLimit - lvProducerIndex) >= j5 || lvProducerLimit <= lvProducerIndex) {
                    j = j3;
                    j2 = lvProducerIndex;
                    eArr = eArr2;
                    if (!recalculateProducerLimit(lvProducerIndex, lvProducerLimit, lvConsumerIndex(), j4, j5)) {
                        return false;
                    }
                } else {
                    eArr = eArr2;
                    j = j3;
                    j2 = lvProducerIndex;
                }
                if (casProducerIndex(j2, j2 + 2)) {
                    org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, j), e);
                    return true;
                }
                j3 = j;
                eArr2 = eArr;
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        long j = this.producerMask;
        E[] eArr = this.producerBuffer;
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            if ((lvProducerIndex & 1) == 1) {
                if (offerAndWakeup(eArr, j, lvProducerIndex, e)) {
                    return true;
                }
            } else {
                long lvProducerLimit = lvProducerLimit();
                if (lvProducerLimit <= lvProducerIndex && !recalculateProducerLimit(j, lvProducerIndex, lvProducerLimit)) {
                    return false;
                }
                if (casProducerIndex(lvProducerIndex, 2 + lvProducerIndex)) {
                    org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lvProducerIndex, j), e);
                    return true;
                }
            }
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) throws java.lang.InterruptedException {
        if (!offer(e)) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        if (offer(e)) {
            return true;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    private boolean offerAndWakeup(E[] eArr, long j, long j2, E e) {
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, j);
        java.lang.Thread lvBlocked = lvBlocked();
        if (lvBlocked == null || !casProducerIndex(j2, 1 + j2)) {
            return false;
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, e);
        java.util.concurrent.locks.LockSupport.unpark(lvBlocked);
        return true;
    }

    private boolean recalculateProducerLimit(long j, long j2, long j3) {
        long j4 = j + 2;
        return recalculateProducerLimit(j2, j3, lvConsumerIndex(), j4, j4);
    }

    private boolean recalculateProducerLimit(long j, long j2, long j3, long j4, long j5) {
        long j6 = j3 + j4;
        if (j6 > j) {
            casProducerLimit(j2, j6);
        }
        long j7 = j - j3;
        return j7 < j5 && j7 < j4;
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws java.lang.InterruptedException {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            return parkUntilNext(eArr, lpConsumerIndex, modifiedCalcCircularRefElementOffset, Long.MAX_VALUE);
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return e;
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        E[] eArr = this.consumerBuffer;
        long j2 = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j2);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            long nanos = timeUnit.toNanos(j);
            if (nanos <= 0) {
                return null;
            }
            return parkUntilNext(eArr, lpConsumerIndex, modifiedCalcCircularRefElementOffset, nanos);
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return e;
    }

    private E parkUntilNext(E[] eArr, long j, long j2, long j3) throws java.lang.InterruptedException {
        long lvProducerIndex = lvProducerIndex();
        if (j == lvProducerIndex) {
            long j4 = lvProducerIndex + 1;
            if (casProducerIndex(lvProducerIndex, j4)) {
                soBlocked(java.lang.Thread.currentThread());
                long nanoTime = j3 == Long.MAX_VALUE ? 0L : java.lang.System.nanoTime() + j3;
                long j5 = j3;
                while (true) {
                    try {
                        java.util.concurrent.locks.LockSupport.parkNanos(this, j5);
                        if (!java.lang.Thread.interrupted()) {
                            if ((lvProducerIndex() & 1) == 0) {
                                break;
                            }
                            j5 = j5 == Long.MAX_VALUE ? Long.MAX_VALUE : nanoTime - java.lang.System.nanoTime();
                            if (j5 <= 0) {
                                if (casProducerIndex(j4, lvProducerIndex)) {
                                    return null;
                                }
                            }
                        } else {
                            casProducerIndex(j4, lvProducerIndex);
                            throw new java.lang.InterruptedException();
                        }
                    } finally {
                        soBlocked(null);
                    }
                }
            }
        }
        E e = (E) spinWaitForElement(eArr, j2);
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, j2, null);
        soConsumerIndex(j + 2);
        return e;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return capacity() - size();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> collection, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            e = (E) spinWaitForElement(eArr, modifiedCalcCircularRefElementOffset);
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return e;
    }

    private static <E> E spinWaitForElement(E[] eArr, long j) {
        E e;
        do {
            e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, j);
        } while (e == null);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerMask;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, j);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        return (e != null || lpConsumerIndex == lvProducerIndex()) ? e : (E) spinWaitForElement(eArr, modifiedCalcCircularRefElementOffset);
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex() / 2;
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex() / 2;
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return (int) ((this.consumerMask + 2) >> 1);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E[] eArr = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        long modifiedCalcCircularRefElementOffset = org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex, this.consumerMask);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, modifiedCalcCircularRefElementOffset);
        if (e == null) {
            return null;
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, modifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 2);
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        return (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.consumerBuffer, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(lpConsumerIndex(), this.consumerMask));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0029, code lost:
    
        r2 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002f, code lost:
    
        if (casProducerIndex(r14, r2) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        r14 = r14 - 1;
     */
    @Override // org.jctools.queues.MessagePassingQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        java.lang.Thread thread;
        long lvProducerIndex;
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
        long j2 = this.producerMask;
        long j3 = i;
        loop0: while (true) {
            thread = null;
            while (true) {
                lvProducerIndex = lvProducerIndex();
                long lvProducerLimit = lvProducerLimit();
                if ((lvProducerIndex & 1) == 1) {
                    thread = lvBlocked();
                    if (thread != null) {
                        break;
                    }
                } else {
                    long j4 = lvProducerIndex + (j3 * 2);
                    long min = java.lang.Math.min(lvProducerLimit, j4);
                    if (lvProducerIndex >= lvProducerLimit) {
                        if (!recalculateProducerLimit(j2, lvProducerIndex, lvProducerLimit)) {
                            return 0;
                        }
                        min = java.lang.Math.min(lvProducerLimit(), j4);
                    }
                    j = min;
                    if (casProducerIndex(lvProducerIndex, j)) {
                        break loop0;
                    }
                }
            }
        }
        int i2 = (int) ((j - lvProducerIndex) / 2);
        E[] eArr = this.producerBuffer;
        for (int i3 = 0; i3 < i2; i3++) {
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.queues.LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset((i3 * 2) + lvProducerIndex, j2), supplier.get());
        }
        if (thread != null && lvBlocked() == thread) {
            java.util.concurrent.locks.LockSupport.unpark(thread);
        }
        return i2;
    }

    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        if (i == 0) {
            return 0;
        }
        int drain = drain(consumer, i);
        if (drain != 0) {
            return drain;
        }
        E poll = poll(j, timeUnit);
        if (poll == null) {
            return 0;
        }
        consumer.accept(poll);
        return drain(consumer, i - 1) + 1;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return org.jctools.queues.MessagePassingQueueUtil.fillBounded(this, supplier);
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
}
