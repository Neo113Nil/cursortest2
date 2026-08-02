package org.jctools.queues;

/* loaded from: classes18.dex */
public class SpscArrayQueue<E> extends org.jctools.queues.SpscArrayQueueL3Pad<E> {
    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentConsumerIndex() {
        return super.currentConsumerIndex();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentProducerIndex() {
        return super.currentProducerIndex();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return super.iterator();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public SpscArrayQueue(int i) {
        super(java.lang.Math.max(i, 4));
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        E[] eArr = this.buffer;
        long j = this.mask;
        long lpProducerIndex = lpProducerIndex();
        if (lpProducerIndex >= this.producerLimit && !offerSlowPath(eArr, j, lpProducerIndex)) {
            return false;
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpProducerIndex, j), e);
        soProducerIndex(lpProducerIndex + 1);
        return true;
    }

    private boolean offerSlowPath(E[] eArr, long j, long j2) {
        long j3 = this.lookAheadStep + j2;
        if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j3, j)) != null) {
            return org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j2, j)) == null;
        }
        this.producerLimit = j3;
        return true;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        E[] eArr = this.buffer;
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
        if (e == null) {
            return null;
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        return (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex(), this.mask));
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
        return drain(consumer, capacity());
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return fill(supplier, capacity());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        if (consumer == 0) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative: ".concat(java.lang.String.valueOf(i)));
        }
        if (i == 0) {
            return 0;
        }
        E[] eArr = this.buffer;
        long j = this.mask;
        long lpConsumerIndex = lpConsumerIndex();
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = i2 + lpConsumerIndex;
            long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j2, j);
            java.lang.Object lvRefElement = org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
            if (lvRefElement == null) {
                return i2;
            }
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, null);
            soConsumerIndex(j2 + 1);
            consumer.accept(lvRefElement);
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        int i2;
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
        E[] eArr = this.buffer;
        long j2 = this.mask;
        int i3 = this.lookAheadStep;
        long lpProducerIndex = lpProducerIndex();
        int i4 = 0;
        while (i4 < i) {
            long j3 = i4 + lpProducerIndex;
            if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(i3 + j3, j2)) == null) {
                int min = java.lang.Math.min(i3, i - i4);
                int i5 = 0;
                while (i5 < min) {
                    long j4 = i5 + j3;
                    org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j4, j2), supplier.get());
                    soProducerIndex(j4 + 1);
                    i5++;
                    i3 = i3;
                    lpProducerIndex = lpProducerIndex;
                }
                i2 = i3;
                j = lpProducerIndex;
                i4 += min - 1;
            } else {
                i2 = i3;
                j = lpProducerIndex;
                long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j3, j2);
                if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset) != null) {
                    return i4;
                }
                org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, supplier.get());
                soProducerIndex(j3 + 1);
            }
            i4++;
            i3 = i2;
            lpProducerIndex = j;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public void drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        if (consumer == 0) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        if (waitStrategy == null) {
            throw new java.lang.IllegalArgumentException("wait is null");
        }
        if (exitCondition == null) {
            throw new java.lang.IllegalArgumentException("exit condition is null");
        }
        E[] eArr = this.buffer;
        long j = this.mask;
        long lpConsumerIndex = lpConsumerIndex();
        int i = 0;
        while (exitCondition.keepRunning()) {
            for (int i2 = 0; i2 < 4096; i2++) {
                long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex, j);
                java.lang.Object lvRefElement = org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
                if (lvRefElement == null) {
                    i = waitStrategy.idle(i);
                } else {
                    lpConsumerIndex++;
                    org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, null);
                    soConsumerIndex(lpConsumerIndex);
                    consumer.accept(lvRefElement);
                    i = 0;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        long calcCircularRefElementOffset;
        if (waitStrategy == null) {
            throw new java.lang.IllegalArgumentException("waiter is null");
        }
        if (exitCondition == null) {
            throw new java.lang.IllegalArgumentException("exit condition is null");
        }
        if (supplier == null) {
            throw new java.lang.IllegalArgumentException("supplier is null");
        }
        E[] eArr = this.buffer;
        long j = this.mask;
        int i = this.lookAheadStep;
        long lpProducerIndex = lpProducerIndex();
        while (true) {
            int i2 = 0;
            while (exitCondition.keepRunning()) {
                if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(i + lpProducerIndex, j)) == null) {
                    for (int i3 = 0; i3 < i; i3++) {
                        long calcCircularRefElementOffset2 = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpProducerIndex, j);
                        lpProducerIndex++;
                        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset2, supplier.get());
                        soProducerIndex(lpProducerIndex);
                    }
                } else {
                    calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpProducerIndex, j);
                    if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset) != null) {
                        i2 = waitStrategy.idle(i2);
                    }
                }
            }
            return;
            lpProducerIndex++;
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, supplier.get());
            soProducerIndex(lpProducerIndex);
        }
    }
}
