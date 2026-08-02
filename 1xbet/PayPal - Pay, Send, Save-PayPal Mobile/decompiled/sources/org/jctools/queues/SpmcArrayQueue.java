package org.jctools.queues;

/* loaded from: classes18.dex */
public class SpmcArrayQueue<E> extends org.jctools.queues.SpmcArrayQueueL3Pad<E> {
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

    public SpmcArrayQueue(int i) {
        super(i);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        E[] eArr = this.buffer;
        long j = this.mask;
        long lvProducerIndex = lvProducerIndex();
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvProducerIndex, j);
        if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset) != null) {
            if (lvProducerIndex - lvConsumerIndex() > j) {
                return false;
            }
            while (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset) != null) {
            }
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, e);
        soProducerIndex(lvProducerIndex + 1);
        return true;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        long lvConsumerIndex;
        long lvProducerIndexCache = lvProducerIndexCache();
        do {
            lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex >= lvProducerIndexCache) {
                lvProducerIndexCache = lvProducerIndex();
                if (lvConsumerIndex >= lvProducerIndexCache) {
                    return null;
                }
                svProducerIndexCache(lvProducerIndexCache);
            }
        } while (!casConsumerIndex(lvConsumerIndex, 1 + lvConsumerIndex));
        return removeElement(this.buffer, lvConsumerIndex, this.mask);
    }

    private E removeElement(E[] eArr, long j, long j2) {
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j, j2);
        E e = (E) org.jctools.util.UnsafeRefArrayAccess.lpRefElement(eArr, calcCircularRefElementOffset);
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, null);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        E[] eArr = this.buffer;
        long j = this.mask;
        long lvProducerIndexCache = lvProducerIndexCache();
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            if (lvConsumerIndex >= lvProducerIndexCache) {
                lvProducerIndexCache = lvProducerIndex();
                if (lvConsumerIndex >= lvProducerIndexCache) {
                    return null;
                }
                svProducerIndexCache(lvProducerIndexCache);
            }
            E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvConsumerIndex, j));
            long lvConsumerIndex2 = lvConsumerIndex();
            if (e != null && lvConsumerIndex2 == lvConsumerIndex) {
                return e;
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.buffer;
        long j = this.mask;
        long lpProducerIndex = lpProducerIndex();
        long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpProducerIndex, j);
        if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset) != null) {
            return false;
        }
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, e);
        soProducerIndex(lpProducerIndex + 1);
        return true;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        return poll();
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        E[] eArr = this.buffer;
        long j = this.mask;
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvConsumerIndex, j));
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                return e;
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        long lvConsumerIndex;
        int min;
        if (consumer == null) {
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
        long lvProducerIndexCache = lvProducerIndexCache();
        do {
            lvConsumerIndex = lvConsumerIndex();
            if (lvConsumerIndex >= lvProducerIndexCache) {
                lvProducerIndexCache = lvProducerIndex();
                if (lvConsumerIndex >= lvProducerIndexCache) {
                    return 0;
                }
                svProducerIndexCache(lvProducerIndexCache);
            }
            min = java.lang.Math.min((int) (lvProducerIndexCache - lvConsumerIndex), i);
        } while (!casConsumerIndex(lvConsumerIndex, min + lvConsumerIndex));
        for (int i2 = 0; i2 < min; i2++) {
            consumer.accept(removeElement(eArr, i2 + lvConsumerIndex, j));
        }
        return min;
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
        E[] eArr = this.buffer;
        long j = this.mask;
        long lpProducerIndex = lpProducerIndex();
        for (int i2 = 0; i2 < i; i2++) {
            long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lpProducerIndex, j);
            if (org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcCircularRefElementOffset) != null) {
                return i2;
            }
            lpProducerIndex++;
            org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr, calcCircularRefElementOffset, supplier.get());
            soProducerIndex(lpProducerIndex);
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return fill(supplier, capacity());
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
