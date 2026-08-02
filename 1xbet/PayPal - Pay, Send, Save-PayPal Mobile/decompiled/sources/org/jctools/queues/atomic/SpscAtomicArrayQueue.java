package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class SpscAtomicArrayQueue<E> extends org.jctools.queues.atomic.SpscAtomicArrayQueueL3Pad<E> {
    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public SpscAtomicArrayQueue(int i) {
        super(java.lang.Math.max(i, 4));
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long lpProducerIndex = lpProducerIndex();
        if (lpProducerIndex >= this.producerLimit && !offerSlowPath(atomicReferenceArray, i, lpProducerIndex)) {
            return false;
        }
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpProducerIndex, i), e);
        soProducerIndex(lpProducerIndex + 1);
        return true;
    }

    private boolean offerSlowPath(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, int i, long j) {
        long j2 = this.lookAheadStep + j;
        long j3 = i;
        if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j2, j3)) != null) {
            return org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j, j3)) == null;
        }
        this.producerLimit = j2;
        return true;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        if (e == null) {
            return null;
        }
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        return (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex(), this.mask));
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
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i2 = this.mask;
        long lpConsumerIndex = lpConsumerIndex();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + lpConsumerIndex;
            int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j, i2);
            java.lang.Object lvRefElement = org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
            if (lvRefElement == null) {
                return i3;
            }
            org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
            soConsumerIndex(j + 1);
            consumer.accept(lvRefElement);
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        int i2;
        int i3;
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray;
        if (supplier == null) {
            throw new java.lang.IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative:".concat(java.lang.String.valueOf(i)));
        }
        int i4 = 0;
        if (i == 0) {
            return 0;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray2 = this.buffer;
        int i5 = this.mask;
        int i6 = this.lookAheadStep;
        long lpProducerIndex = lpProducerIndex();
        int i7 = 0;
        while (i7 < i) {
            long j = i7 + lpProducerIndex;
            long j2 = i5;
            if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray2, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(i6 + j, j2)) == null) {
                int min = java.lang.Math.min(i6, i - i7);
                int i8 = i4;
                while (i8 < min) {
                    java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray3 = atomicReferenceArray2;
                    long j3 = i8 + j;
                    org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray3, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j3, j2), supplier.get());
                    soProducerIndex(j3 + 1);
                    i8++;
                    atomicReferenceArray2 = atomicReferenceArray3;
                    i5 = i5;
                    i6 = i6;
                }
                i2 = i5;
                i3 = i6;
                atomicReferenceArray = atomicReferenceArray2;
                i7 += min - 1;
            } else {
                i2 = i5;
                i3 = i6;
                atomicReferenceArray = atomicReferenceArray2;
                int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j, j2);
                if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset) != null) {
                    return i7;
                }
                org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, supplier.get());
                soProducerIndex(j + 1);
            }
            i7++;
            atomicReferenceArray2 = atomicReferenceArray;
            i5 = i2;
            i6 = i3;
            i4 = 0;
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
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long lpConsumerIndex = lpConsumerIndex();
        int i2 = 0;
        while (exitCondition.keepRunning()) {
            for (int i3 = 0; i3 < 4096; i3++) {
                int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex, i);
                java.lang.Object lvRefElement = org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
                if (lvRefElement == null) {
                    i2 = waitStrategy.idle(i2);
                } else {
                    lpConsumerIndex++;
                    org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
                    soConsumerIndex(lpConsumerIndex);
                    consumer.accept(lvRefElement);
                    i2 = 0;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        int calcCircularRefElementOffset;
        if (waitStrategy == null) {
            throw new java.lang.IllegalArgumentException("waiter is null");
        }
        if (exitCondition == null) {
            throw new java.lang.IllegalArgumentException("exit condition is null");
        }
        if (supplier == null) {
            throw new java.lang.IllegalArgumentException("supplier is null");
        }
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        int i2 = this.lookAheadStep;
        long lpProducerIndex = lpProducerIndex();
        while (true) {
            int i3 = 0;
            while (exitCondition.keepRunning()) {
                long j = i;
                if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(i2 + lpProducerIndex, j)) == null) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        int calcCircularRefElementOffset2 = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpProducerIndex, j);
                        lpProducerIndex++;
                        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset2, supplier.get());
                        soProducerIndex(lpProducerIndex);
                    }
                } else {
                    calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpProducerIndex, j);
                    if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset) != null) {
                        i3 = waitStrategy.idle(i3);
                    }
                }
            }
            return;
            lpProducerIndex++;
            org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, supplier.get());
            soProducerIndex(lpProducerIndex);
        }
    }
}
