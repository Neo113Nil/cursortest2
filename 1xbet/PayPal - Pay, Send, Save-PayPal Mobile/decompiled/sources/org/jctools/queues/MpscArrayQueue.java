package org.jctools.queues;

/* loaded from: classes18.dex */
public class MpscArrayQueue<E> extends org.jctools.queues.MpscArrayQueueL3Pad<E> {
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

    public MpscArrayQueue(int i) {
        super(i);
    }

    public boolean offerIfBelowThreshold(E e, int i) {
        long lvProducerIndex;
        e.getClass();
        long j = this.mask;
        long j2 = j + 1;
        long lvProducerLimit = lvProducerLimit();
        do {
            lvProducerIndex = lvProducerIndex();
            long j3 = i;
            if (j2 - (lvProducerLimit - lvProducerIndex) >= j3) {
                long lvConsumerIndex = lvConsumerIndex();
                if (lvProducerIndex - lvConsumerIndex >= j3) {
                    return false;
                }
                lvProducerLimit = lvConsumerIndex + j2;
                soProducerLimit(lvProducerLimit);
            }
        } while (!casProducerIndex(lvProducerIndex, lvProducerIndex + 1));
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvProducerIndex, j), e);
        return true;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        long lvProducerIndex;
        e.getClass();
        long j = this.mask;
        long lvProducerLimit = lvProducerLimit();
        do {
            lvProducerIndex = lvProducerIndex();
            if (lvProducerIndex >= lvProducerLimit) {
                lvProducerLimit = lvConsumerIndex() + j + 1;
                if (lvProducerIndex >= lvProducerLimit) {
                    return false;
                }
                soProducerLimit(lvProducerLimit);
            }
        } while (!casProducerIndex(lvProducerIndex, 1 + lvProducerIndex));
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvProducerIndex, j), e);
        return true;
    }

    public final int failFastOffer(E e) {
        e.getClass();
        long j = this.mask;
        long lvProducerIndex = lvProducerIndex();
        if (lvProducerIndex >= lvProducerLimit()) {
            long lvConsumerIndex = lvConsumerIndex() + j + 1;
            if (lvProducerIndex >= lvConsumerIndex) {
                return 1;
            }
            soProducerLimit(lvConsumerIndex);
        }
        if (!casProducerIndex(lvProducerIndex, 1 + lvProducerIndex)) {
            return -1;
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvProducerIndex, j), e);
        return 0;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        E[] eArr = this.buffer;
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
        if (e == null) {
            if (lpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
            } while (e == null);
        }
        org.jctools.util.UnsafeRefArrayAccess.spRefElement(eArr, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        E e;
        E[] eArr = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        E e2 = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
        if (e2 != null) {
            return e2;
        }
        if (lpConsumerIndex == lvProducerIndex()) {
            return null;
        }
        do {
            e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
        } while (e == null);
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E[] eArr = this.buffer;
        long lpConsumerIndex = lpConsumerIndex();
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex, this.mask);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset);
        if (e == null) {
            return null;
        }
        org.jctools.util.UnsafeRefArrayAccess.spRefElement(eArr, calcCircularRefElementOffset, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        return (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpConsumerIndex(), this.mask));
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
            org.jctools.util.UnsafeRefArrayAccess.spRefElement(eArr, calcCircularRefElementOffset, null);
            soConsumerIndex(j2 + 1);
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
        long j = this.mask;
        long lvProducerLimit = lvProducerLimit();
        do {
            lvProducerIndex = lvProducerIndex();
            long j2 = lvProducerLimit - lvProducerIndex;
            if (j2 <= 0) {
                lvProducerLimit = lvConsumerIndex() + 1 + j;
                j2 = lvProducerLimit - lvProducerIndex;
                if (j2 <= 0) {
                    return 0;
                }
                soProducerLimit(lvProducerLimit);
            }
            min = java.lang.Math.min((int) j2, i);
        } while (!casProducerIndex(lvProducerIndex, min + lvProducerIndex));
        E[] eArr = this.buffer;
        for (int i2 = 0; i2 < min; i2++) {
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(i2 + lvProducerIndex, j), supplier.get());
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
}
