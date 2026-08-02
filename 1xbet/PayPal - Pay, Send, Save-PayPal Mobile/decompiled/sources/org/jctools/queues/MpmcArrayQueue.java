package org.jctools.queues;

/* loaded from: classes18.dex */
public class MpmcArrayQueue<E> extends org.jctools.queues.MpmcArrayQueueL3Pad<E> {
    public static final int MAX_LOOK_AHEAD_STEP = java.lang.Integer.getInteger("jctools.mpmc.max.lookahead.step", 4096).intValue();
    private final int lookAheadStep;

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

    public MpmcArrayQueue(int i) {
        super(org.jctools.util.RangeUtil.checkGreaterThanOrEqual(i, 2, "capacity"));
        this.lookAheadStep = java.lang.Math.max(2, java.lang.Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP));
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        long j = this.mask;
        long[] jArr = this.sequenceBuffer;
        long j2 = Long.MIN_VALUE;
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvProducerIndex, j);
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset);
            if (lvLongElement < lvProducerIndex) {
                long j3 = lvProducerIndex - (j + 1);
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
                    org.jctools.util.UnsafeRefArrayAccess.spRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvProducerIndex, j), e);
                    org.jctools.util.UnsafeLongArrayAccess.soLongElement(jArr, calcCircularLongElementOffset, j4);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        long j2 = -1;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvConsumerIndex, j);
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset);
            long j3 = lvConsumerIndex + 1;
            if (lvLongElement < j3) {
                if (lvConsumerIndex >= j2) {
                    j2 = lvProducerIndex();
                    if (lvConsumerIndex == j2) {
                        return null;
                    }
                }
                lvLongElement = 2 + lvConsumerIndex;
            }
            if (lvLongElement <= j3 && casConsumerIndex(lvConsumerIndex, j3)) {
                long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvConsumerIndex, j);
                E e = (E) org.jctools.util.UnsafeRefArrayAccess.lpRefElement(this.buffer, calcCircularRefElementOffset);
                org.jctools.util.UnsafeRefArrayAccess.spRefElement(this.buffer, calcCircularRefElementOffset, null);
                org.jctools.util.UnsafeLongArrayAccess.soLongElement(jArr, calcCircularLongElementOffset, lvConsumerIndex + j + 1);
                return e;
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        long j2 = -1;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvConsumerIndex, j));
            long j3 = 1 + lvConsumerIndex;
            if (lvLongElement < j3) {
                if (lvConsumerIndex >= j2) {
                    j2 = lvProducerIndex();
                    if (lvConsumerIndex == j2) {
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (lvLongElement == j3) {
                E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvConsumerIndex, j));
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
        long j = this.mask;
        long[] jArr = this.sequenceBuffer;
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvProducerIndex, j);
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset);
            if (lvLongElement < lvProducerIndex) {
                return false;
            }
            if (lvLongElement <= lvProducerIndex) {
                long j2 = 1 + lvProducerIndex;
                if (casProducerIndex(lvProducerIndex, j2)) {
                    org.jctools.util.UnsafeRefArrayAccess.spRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvProducerIndex, j), e);
                    org.jctools.util.UnsafeLongArrayAccess.soLongElement(jArr, calcCircularLongElementOffset, j2);
                    return true;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvConsumerIndex, j);
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset);
            long j2 = lvConsumerIndex + 1;
            if (lvLongElement < j2) {
                return null;
            }
            if (lvLongElement <= j2 && casConsumerIndex(lvConsumerIndex, j2)) {
                long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvConsumerIndex, j);
                E e = (E) org.jctools.util.UnsafeRefArrayAccess.lpRefElement(this.buffer, calcCircularRefElementOffset);
                org.jctools.util.UnsafeRefArrayAccess.spRefElement(this.buffer, calcCircularRefElementOffset, null);
                org.jctools.util.UnsafeLongArrayAccess.soLongElement(jArr, calcCircularLongElementOffset, lvConsumerIndex + j + 1);
                return e;
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvConsumerIndex, j));
            long j2 = 1 + lvConsumerIndex;
            if (lvLongElement < j2) {
                return null;
            }
            if (lvLongElement == j2) {
                E e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(lvConsumerIndex, j));
                if (lvConsumerIndex() == lvConsumerIndex) {
                    return e;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        org.jctools.queues.MpmcArrayQueue<E> mpmcArrayQueue = this;
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
        long[] jArr = mpmcArrayQueue.sequenceBuffer;
        long j = mpmcArrayQueue.mask;
        E[] eArr = mpmcArrayQueue.buffer;
        int min = java.lang.Math.min(mpmcArrayQueue.lookAheadStep, i2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i2 - i3;
            int min2 = java.lang.Math.min(i4, min);
            long lvConsumerIndex = lvConsumerIndex();
            long j2 = min2 + lvConsumerIndex;
            E[] eArr2 = eArr;
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(j2 - 1, j));
            if (lvLongElement != j2 || !mpmcArrayQueue.casConsumerIndex(lvConsumerIndex, j2)) {
                return (lvLongElement >= j2 || !notAvailable(lvConsumerIndex, j, jArr, lvConsumerIndex + 1)) ? i3 + drainOneByOne(consumer, i4) : i3;
            }
            int i5 = 0;
            while (i5 < min2) {
                long j3 = i5 + lvConsumerIndex;
                long j4 = lvConsumerIndex;
                long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(j3, j);
                int i6 = min;
                int i7 = min2;
                long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j3, j);
                while (org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset) != j3 + 1) {
                }
                java.lang.Object lpRefElement = org.jctools.util.UnsafeRefArrayAccess.lpRefElement(eArr2, calcCircularRefElementOffset);
                org.jctools.util.UnsafeRefArrayAccess.spRefElement(eArr2, calcCircularRefElementOffset, null);
                org.jctools.util.UnsafeLongArrayAccess.soLongElement(jArr, calcCircularLongElementOffset, j3 + j + 1);
                consumer.accept(lpRefElement);
                i5++;
                min2 = i7;
                lvConsumerIndex = j4;
                min = i6;
            }
            eArr = eArr2;
            i3 += min2;
            mpmcArrayQueue = this;
            i2 = i;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(r7, r3);
        r11 = org.jctools.util.UnsafeRefArrayAccess.lpRefElement(r5, r1);
        org.jctools.util.UnsafeRefArrayAccess.spRefElement(r5, r1, null);
        org.jctools.util.UnsafeLongArrayAccess.soLongElement(r15, r9, (r7 + r3) + 1);
        r17.accept(r11);
        r6 = r6 + 1;
        r2 = r15;
        r1 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int drainOneByOne(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        int i2 = i;
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        E[] eArr = this.buffer;
        int i3 = 0;
        while (i3 < i2) {
            while (true) {
                long lvConsumerIndex = lvConsumerIndex();
                long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvConsumerIndex, j);
                long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset);
                long[] jArr2 = jArr;
                long j2 = lvConsumerIndex + 1;
                if (lvLongElement < j2) {
                    return i3;
                }
                if (lvLongElement > j2 || !casConsumerIndex(lvConsumerIndex, j2)) {
                    jArr = jArr2;
                }
            }
        }
        return i;
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
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        E[] eArr = this.buffer;
        int min = java.lang.Math.min(this.lookAheadStep, i);
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int min2 = java.lang.Math.min(i3, min);
            long lvProducerIndex = lvProducerIndex();
            long j2 = min2 + lvProducerIndex;
            E[] eArr2 = eArr;
            long j3 = j2 - 1;
            int i4 = i2;
            long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(j3, j));
            if (lvLongElement != j3 || !casProducerIndex(lvProducerIndex, j2)) {
                return (lvLongElement >= j3 || !notAvailable(lvProducerIndex, j, jArr, lvProducerIndex)) ? i4 + fillOneByOne(supplier, i3) : i4;
            }
            int i5 = 0;
            while (i5 < min2) {
                long j4 = i5 + lvProducerIndex;
                long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(j4, j);
                long j5 = lvProducerIndex;
                long calcCircularRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j4, j);
                while (org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset) != j4) {
                }
                org.jctools.util.UnsafeRefArrayAccess.soRefElement(eArr2, calcCircularRefElementOffset, supplier.get());
                org.jctools.util.UnsafeLongArrayAccess.soLongElement(jArr, calcCircularLongElementOffset, j4 + 1);
                i5++;
                lvProducerIndex = j5;
            }
            i2 = i4 + min2;
            eArr = eArr2;
        }
        return i;
    }

    private boolean notAvailable(long j, long j2, long[] jArr, long j3) {
        return org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(j, j2)) < j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(r3, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(r5, r1), r13.get());
        org.jctools.util.UnsafeLongArrayAccess.soLongElement(r0, r7, r9);
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int fillOneByOne(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, int i) {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        E[] eArr = this.buffer;
        int i2 = 0;
        while (i2 < i) {
            while (true) {
                long lvProducerIndex = lvProducerIndex();
                long calcCircularLongElementOffset = org.jctools.util.UnsafeLongArrayAccess.calcCircularLongElementOffset(lvProducerIndex, j);
                long lvLongElement = org.jctools.util.UnsafeLongArrayAccess.lvLongElement(jArr, calcCircularLongElementOffset);
                if (lvLongElement < lvProducerIndex) {
                    return i2;
                }
                if (lvLongElement <= lvProducerIndex) {
                    long j2 = 1 + lvProducerIndex;
                    if (casProducerIndex(lvProducerIndex, j2)) {
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
