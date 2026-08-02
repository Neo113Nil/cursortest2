package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class SpmcAtomicArrayQueue<E> extends org.jctools.queues.atomic.SpmcAtomicArrayQueueL3Pad<E> {
    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public SpmcAtomicArrayQueue(int i) {
        super(i);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long lvProducerIndex = lvProducerIndex();
        long j = i;
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvProducerIndex, j);
        if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset) != null) {
            if (lvProducerIndex - lvConsumerIndex() > j) {
                return false;
            }
            while (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset) != null) {
            }
        }
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, e);
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

    private E removeElement(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray, long j, int i) {
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j, i);
        E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lpRefElement(atomicReferenceArray, calcCircularRefElementOffset);
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, null);
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
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
            E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvConsumerIndex, i));
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
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long lpProducerIndex = lpProducerIndex();
        int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpProducerIndex, i);
        if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset) != null) {
            return false;
        }
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, e);
        soProducerIndex(lpProducerIndex + 1);
        return true;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        return poll();
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvConsumerIndex, i));
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
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i2 = this.mask;
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
        for (int i3 = 0; i3 < min; i3++) {
            consumer.accept(removeElement(atomicReferenceArray, i3 + lvConsumerIndex, i2));
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
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i2 = this.mask;
        long lpProducerIndex = lpProducerIndex();
        for (int i3 = 0; i3 < i; i3++) {
            int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lpProducerIndex, i2);
            if (org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, calcCircularRefElementOffset) != null) {
                return i3;
            }
            lpProducerIndex++;
            org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray, calcCircularRefElementOffset, supplier.get());
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
