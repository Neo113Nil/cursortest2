package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class MpmcAtomicArrayQueue<E> extends org.jctools.queues.atomic.MpmcAtomicArrayQueueL3Pad<E> {
    public static final int MAX_LOOK_AHEAD_STEP = java.lang.Integer.getInteger("jctools.mpmc.max.lookahead.step", 4096).intValue();
    private final int lookAheadStep;

    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public MpmcAtomicArrayQueue(int i) {
        super(org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i, 2, "capacity"));
        this.lookAheadStep = java.lang.Math.max(2, java.lang.Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP));
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        int i = this.mask;
        long j = i + 1;
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        long j2 = Long.MIN_VALUE;
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvProducerIndex, i);
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset);
            if (lvLongElement < lvProducerIndex) {
                long j3 = lvProducerIndex - j;
                if (j3 >= j2) {
                    j2 = lvConsumerIndex();
                    if (j3 >= j2) {
                        return false;
                    }
                }
                lvLongElement = lvProducerIndex + 1;
            }
            if (lvLongElement <= lvProducerIndex) {
                long j4 = 1 + lvProducerIndex;
                if (casProducerIndex(lvProducerIndex, j4)) {
                    org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvProducerIndex, i), e);
                    org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(atomicLongArray, calcCircularLongElementOffset, j4);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        long j = -1;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvConsumerIndex, i);
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset);
            long j2 = lvConsumerIndex + 1;
            if (lvLongElement < j2) {
                if (lvConsumerIndex >= j) {
                    j = lvProducerIndex();
                    if (lvConsumerIndex == j) {
                        return null;
                    }
                }
                lvLongElement = 2 + lvConsumerIndex;
            }
            if (lvLongElement <= j2 && casConsumerIndex(lvConsumerIndex, j2)) {
                long j3 = i;
                int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvConsumerIndex, j3);
                E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lpRefElement(this.buffer, calcCircularRefElementOffset);
                org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(this.buffer, calcCircularRefElementOffset, null);
                org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(atomicLongArray, calcCircularLongElementOffset, lvConsumerIndex + j3 + 1);
                return e;
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        long j = -1;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvConsumerIndex, i));
            long j2 = 1 + lvConsumerIndex;
            if (lvLongElement < j2) {
                if (lvConsumerIndex >= j) {
                    j = lvProducerIndex();
                    if (lvConsumerIndex == j) {
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (lvLongElement == j2) {
                E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvConsumerIndex, i));
                if (lvConsumerIndex() == lvConsumerIndex) {
                    return e;
                }
            } else {
                continue;
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        e.getClass();
        int i = this.mask;
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvProducerIndex, i);
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset);
            if (lvLongElement < lvProducerIndex) {
                return false;
            }
            if (lvLongElement <= lvProducerIndex) {
                long j = 1 + lvProducerIndex;
                if (casProducerIndex(lvProducerIndex, j)) {
                    org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvProducerIndex, i), e);
                    org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(atomicLongArray, calcCircularLongElementOffset, j);
                    return true;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvConsumerIndex, i);
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset);
            long j = lvConsumerIndex + 1;
            if (lvLongElement < j) {
                return null;
            }
            if (lvLongElement <= j && casConsumerIndex(lvConsumerIndex, j)) {
                long j2 = i;
                int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvConsumerIndex, j2);
                E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lpRefElement(this.buffer, calcCircularRefElementOffset);
                org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(this.buffer, calcCircularRefElementOffset, null);
                org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(atomicLongArray, calcCircularLongElementOffset, lvConsumerIndex + j2 + 1);
                return e;
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvConsumerIndex, i));
            long j = 1 + lvConsumerIndex;
            if (lvLongElement < j) {
                return null;
            }
            if (lvLongElement == j) {
                E e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(this.buffer, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(lvConsumerIndex, i));
                if (lvConsumerIndex() == lvConsumerIndex) {
                    return e;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        int i2 = i;
        if (consumer == 0) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative: ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 == 0) {
            return 0;
        }
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i3 = this.mask;
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int min = java.lang.Math.min(this.lookAheadStep, i2);
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i2 - i4;
            int min2 = java.lang.Math.min(i5, min);
            long lvConsumerIndex = lvConsumerIndex();
            long j = min2 + lvConsumerIndex;
            long j2 = 1;
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray2 = atomicReferenceArray;
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(j - 1, i3));
            if (lvLongElement != j || !casConsumerIndex(lvConsumerIndex, j)) {
                return (lvLongElement >= j || !notAvailable(lvConsumerIndex, i3, atomicLongArray, lvConsumerIndex + 1)) ? i4 + drainOneByOne(consumer, i5) : i4;
            }
            int i6 = 0;
            while (i6 < min2) {
                long j3 = i6 + lvConsumerIndex;
                int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(j3, i3);
                long j4 = lvConsumerIndex;
                long j5 = i3;
                int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j3, j5);
                while (org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset) != j3 + j2) {
                    j2 = 1;
                }
                int i7 = min;
                java.lang.Object lpRefElement = org.jctools.queues.atomic.AtomicQueueUtil.lpRefElement(atomicReferenceArray2, calcCircularRefElementOffset);
                org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(atomicReferenceArray2, calcCircularRefElementOffset, null);
                org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(atomicLongArray, calcCircularLongElementOffset, j3 + j5 + 1);
                consumer.accept(lpRefElement);
                i6++;
                min = i7;
                lvConsumerIndex = j4;
                j2 = 1;
            }
            i4 += min2;
            i2 = i;
            atomicReferenceArray = atomicReferenceArray2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r9 = r3;
        r13 = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(r6, r9);
        r14 = org.jctools.queues.atomic.AtomicQueueUtil.lpRefElement(r4, r13);
        org.jctools.queues.atomic.AtomicQueueUtil.spRefElement(r4, r13, null);
        org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(r2, r8, (r6 + r9) + 1);
        r17.accept(r14);
        r5 = r5 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int drainOneByOne(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i2 = this.mask;
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i3 = 0;
        while (i3 < i) {
            while (true) {
                long lvConsumerIndex = lvConsumerIndex();
                int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvConsumerIndex, i2);
                long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset);
                long j = lvConsumerIndex + 1;
                if (lvLongElement < j) {
                    return i3;
                }
                if (lvLongElement > j || !casConsumerIndex(lvConsumerIndex, j)) {
                }
            }
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        org.jctools.queues.atomic.MpmcAtomicArrayQueue<E> mpmcAtomicArrayQueue = this;
        if (supplier == null) {
            throw new java.lang.IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative:".concat(java.lang.String.valueOf(i)));
        }
        if (i == 0) {
            return 0;
        }
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = mpmcAtomicArrayQueue.sequenceBuffer;
        int i2 = mpmcAtomicArrayQueue.mask;
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = mpmcAtomicArrayQueue.buffer;
        int min = java.lang.Math.min(mpmcAtomicArrayQueue.lookAheadStep, i);
        int i3 = 0;
        while (i3 < i) {
            int i4 = i - i3;
            int min2 = java.lang.Math.min(i4, min);
            long lvProducerIndex = lvProducerIndex();
            long j = min2 + lvProducerIndex;
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray2 = atomicReferenceArray;
            long j2 = j - 1;
            long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(j2, i2));
            if (lvLongElement != j2 || !mpmcAtomicArrayQueue.casProducerIndex(lvProducerIndex, j)) {
                return (lvLongElement >= j2 || !notAvailable(lvProducerIndex, i2, atomicLongArray, lvProducerIndex)) ? i3 + fillOneByOne(supplier, i4) : i3;
            }
            int i5 = 0;
            while (i5 < min2) {
                long j3 = i5 + lvProducerIndex;
                int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(j3, i2);
                int calcCircularRefElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j3, i2);
                while (org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset) != j3) {
                    atomicReferenceArray2 = atomicReferenceArray2;
                }
                java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray3 = atomicReferenceArray2;
                org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(atomicReferenceArray3, calcCircularRefElementOffset, supplier.get());
                org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(atomicLongArray, calcCircularLongElementOffset, j3 + 1);
                i5++;
                atomicReferenceArray2 = atomicReferenceArray3;
            }
            i3 += min2;
            mpmcAtomicArrayQueue = this;
            atomicReferenceArray = atomicReferenceArray2;
        }
        return i;
    }

    private boolean notAvailable(long j, int i, java.util.concurrent.atomic.AtomicLongArray atomicLongArray, long j2) {
        return org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(j, i)) < j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        org.jctools.queues.atomic.AtomicQueueUtil.soRefElement(r2, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(r4, r1), r12.get());
        org.jctools.queues.atomic.AtomicQueueUtil.soLongElement(r0, r6, r7);
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int fillOneByOne(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i2 = this.mask;
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i3 = 0;
        while (i3 < i) {
            while (true) {
                long lvProducerIndex = lvProducerIndex();
                int calcCircularLongElementOffset = org.jctools.queues.atomic.AtomicQueueUtil.calcCircularLongElementOffset(lvProducerIndex, i2);
                long lvLongElement = org.jctools.queues.atomic.AtomicQueueUtil.lvLongElement(atomicLongArray, calcCircularLongElementOffset);
                if (lvLongElement < lvProducerIndex) {
                    return i3;
                }
                if (lvLongElement <= lvProducerIndex) {
                    long j = 1 + lvProducerIndex;
                    if (casProducerIndex(lvProducerIndex, j)) {
                        break;
                    }
                }
            }
        }
        return i;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer);
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
