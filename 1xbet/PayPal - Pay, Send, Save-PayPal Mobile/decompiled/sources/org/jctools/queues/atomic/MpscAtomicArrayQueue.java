package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class MpscAtomicArrayQueue<E> extends org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad<E> {
    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public MpscAtomicArrayQueue(int i) {
        super(i);
    }

    public boolean offerIfBelowThreshold(E e, int i) {
        long lvProducerIndex;
        e.getClass();
        int i2 = this.mask;
        long j = i2 + 1;
        long lvProducerLimit = lvProducerLimit();
        do {
            lvProducerIndex = lvProducerIndex();
            long j2 = i;
            if (j - (lvProducerLimit - lvProducerIndex) >= j2) {
                long lvConsumerIndex = lvConsumerIndex();
                if (lvProducerIndex - lvConsumerIndex >= j2) {
                    return false;
                }
                lvProducerLimit = lvConsumerIndex + j;
                soProducerLimit(lvProducerLimit);
            }
        } while (!casProducerIndex(lvProducerIndex, 1 + lvProducerIndex));
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvProducerIndex, i2), e);
        return true;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        long lvProducerIndex;
        e.getClass();
        int i = this.mask;
        long lvProducerLimit = lvProducerLimit();
        do {
            lvProducerIndex = lvProducerIndex();
            if (lvProducerIndex >= lvProducerLimit) {
                lvProducerLimit = lvConsumerIndex() + i + 1;
                if (lvProducerIndex >= lvProducerLimit) {
                    return false;
                }
                soProducerLimit(lvProducerLimit);
            }
        } while (!casProducerIndex(lvProducerIndex, 1 + lvProducerIndex));
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvProducerIndex, i), e);
        return true;
    }

    public final int failFastOffer(E e) {
        e.getClass();
        int i = this.mask;
        long j = i + 1;
        long lvProducerIndex = lvProducerIndex();
        if (lvProducerIndex >= lvProducerLimit()) {
            long lvConsumerIndex = lvConsumerIndex() + j;
            if (lvProducerIndex >= lvConsumerIndex) {
                return 1;
            }
            soProducerLimit(lvConsumerIndex);
        }
        if (!casProducerIndex(lvProducerIndex, 1 + lvProducerIndex)) {
            return -1;
        }
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvProducerIndex, i), e);
        return 0;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        if (e == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
            } while (e == null);
        }
        org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        E e;
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        E e2 = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        if (e2 != null) {
            return e2;
        }
        if (lpConsumerIndex == lvProducerIndex()) {
            return null;
        }
        do {
            e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        } while (e == null);
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        if (e == null) {
            return null;
        }
        org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        return (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex(), this.mask));
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
            org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
            soConsumerIndex(j + 1);
            consumer.accept(lvRefElement);
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        long lvProducerIndex;
        int min;
        if (supplier == null) {
            throw new java.lang.IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative:".concat(java.lang.String.valueOf(i)));
        }
        if (i == 0) {
            return 0;
        }
        int i2 = this.mask;
        long j = i2 + 1;
        long lvProducerLimit = lvProducerLimit();
        do {
            lvProducerIndex = lvProducerIndex();
            long j2 = lvProducerLimit - lvProducerIndex;
            if (j2 <= 0) {
                lvProducerLimit = lvConsumerIndex() + j;
                j2 = lvProducerLimit - lvProducerIndex;
                if (j2 <= 0) {
                    return 0;
                }
                soProducerLimit(lvProducerLimit);
            }
            min = java.lang.Math.min((int) j2, i);
        } while (!casProducerIndex(lvProducerIndex, min + lvProducerIndex));
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        for (int i3 = 0; i3 < min; i3++) {
            org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(i3 + lvProducerIndex, i2), supplier.get());
        }
        return min;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return org.jctools.queues.MessagePassingQueueUtil.fillBounded(this, supplier);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    @java.lang.Deprecated
    public int weakOffer(E e) {
        return failFastOffer(e);
    }
}
