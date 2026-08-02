package org.jctools.queues;

/* loaded from: classes18.dex */
public class MpmcUnboundedXaddArrayQueue<E> extends org.jctools.queues.MpUnboundedXaddArrayQueue<org.jctools.queues.MpmcUnboundedXaddChunk<E>, E> {
    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentConsumerIndex() {
        return super.currentConsumerIndex();
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentProducerIndex() {
        return super.currentProducerIndex();
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer) {
        return super.drain(consumer);
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int fill(org.jctools.queues.MessagePassingQueue.Supplier supplier) {
        return super.fill(supplier);
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void fill(org.jctools.queues.MessagePassingQueue.Supplier supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.fill(supplier, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return super.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(java.lang.Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public MpmcUnboundedXaddArrayQueue(int i, int i2) {
        super(i, i2);
    }

    public MpmcUnboundedXaddArrayQueue(int i) {
        this(i, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue
    public final org.jctools.queues.MpmcUnboundedXaddChunk<E> newChunk(long j, org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk, int i, boolean z) {
        return new org.jctools.queues.MpmcUnboundedXaddChunk<>(j, mpmcUnboundedXaddChunk, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        int i = this.chunkMask;
        int i2 = this.chunkShift;
        long andIncrementProducerIndex = getAndIncrementProducerIndex();
        int i3 = (int) (i & andIncrementProducerIndex);
        long j = andIncrementProducerIndex >> i2;
        org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk = (org.jctools.queues.MpmcUnboundedXaddChunk) lvProducerChunk();
        if (mpmcUnboundedXaddChunk.lvIndex() != j) {
            mpmcUnboundedXaddChunk = producerChunkForIndex(mpmcUnboundedXaddChunk, j);
        }
        boolean isPooled = mpmcUnboundedXaddChunk.isPooled();
        if (isPooled) {
            mpmcUnboundedXaddChunk.spinForElement(i3, true);
        }
        mpmcUnboundedXaddChunk.soElement(i3, e);
        if (isPooled) {
            mpmcUnboundedXaddChunk.soSequence(i3, j);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk;
        int i;
        long j;
        boolean z;
        int i2 = this.chunkMask;
        int i3 = this.chunkShift;
        long j2 = -1;
        E e = null;
        org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk2 = null;
        E e2 = null;
        boolean z2 = false;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            mpmcUnboundedXaddChunk = (org.jctools.queues.MpmcUnboundedXaddChunk) lvConsumerChunk();
            i = (int) (i2 & lvConsumerIndex);
            j = lvConsumerIndex >> i3;
            long lvIndex = mpmcUnboundedXaddChunk.lvIndex();
            if (i != 0 || lvConsumerIndex == 0) {
                if (lvIndex > j) {
                    continue;
                } else {
                    z2 = mpmcUnboundedXaddChunk.isPooled();
                    if (lvIndex == j) {
                        if (z2) {
                            long lvSequence = mpmcUnboundedXaddChunk.lvSequence(i);
                            if (lvSequence == j) {
                                if (casConsumerIndex(lvConsumerIndex, lvConsumerIndex + 1)) {
                                    break;
                                }
                            } else if (lvSequence > j) {
                                continue;
                            }
                        } else {
                            e2 = mpmcUnboundedXaddChunk.lvElement(i);
                            if (e2 != null) {
                                if (casConsumerIndex(lvConsumerIndex, lvConsumerIndex + 1)) {
                                    break;
                                }
                            }
                        }
                    }
                    if (lvConsumerIndex >= j2) {
                        j2 = lvProducerIndex();
                        if (lvConsumerIndex == j2) {
                            return null;
                        }
                    } else {
                        continue;
                    }
                }
                e = null;
            } else {
                if (j - lvIndex == 1) {
                    org.jctools.queues.MpmcUnboundedXaddChunk<E> lvNext = mpmcUnboundedXaddChunk.lvNext();
                    if (lvNext == null && lvConsumerIndex >= j2) {
                        j2 = lvProducerIndex();
                        if (lvConsumerIndex == j2) {
                            return e;
                        }
                    }
                    if (casConsumerIndex(lvConsumerIndex, lvConsumerIndex + 1)) {
                        z = true;
                        mpmcUnboundedXaddChunk2 = lvNext;
                        break;
                    }
                    mpmcUnboundedXaddChunk2 = lvNext;
                } else {
                    continue;
                }
                e = null;
            }
        }
        z = false;
        if (z) {
            return switchToNextConsumerChunkAndPoll(mpmcUnboundedXaddChunk, mpmcUnboundedXaddChunk2, j);
        }
        if (z2) {
            e2 = mpmcUnboundedXaddChunk.lvElement(i);
        }
        mpmcUnboundedXaddChunk.soElement(i, null);
        return e2;
    }

    private E switchToNextConsumerChunkAndPoll(org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk, org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk2, long j) {
        if (mpmcUnboundedXaddChunk2 == null) {
            long j2 = j - 1;
            if (lvProducerChunkIndex() == j2) {
                mpmcUnboundedXaddChunk2 = appendNextChunks(mpmcUnboundedXaddChunk, j2, 1L);
            }
        }
        while (mpmcUnboundedXaddChunk2 == null) {
            mpmcUnboundedXaddChunk2 = mpmcUnboundedXaddChunk.lvNext();
        }
        E spinForElement = mpmcUnboundedXaddChunk2.spinForElement(0, false);
        if (mpmcUnboundedXaddChunk2.isPooled()) {
            mpmcUnboundedXaddChunk2.spinForSequence(0, j);
        }
        mpmcUnboundedXaddChunk2.soElement(0, null);
        moveToNextConsumerChunk(mpmcUnboundedXaddChunk, mpmcUnboundedXaddChunk2);
        return spinForElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        E lvElement;
        int i = this.chunkMask;
        int i2 = this.chunkShift;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk = (org.jctools.queues.MpmcUnboundedXaddChunk) lvConsumerChunk();
            int i3 = (int) (i & lvConsumerIndex);
            long j = lvConsumerIndex >> i2;
            lvElement = ((i3 != 0 || lvConsumerIndex == 0 || (j - 1 == mpmcUnboundedXaddChunk.lvIndex() && (mpmcUnboundedXaddChunk = mpmcUnboundedXaddChunk.lvNext()) != null)) && (!mpmcUnboundedXaddChunk.isPooled() ? mpmcUnboundedXaddChunk.lvIndex() != j : mpmcUnboundedXaddChunk.lvSequence(i3) != j)) ? mpmcUnboundedXaddChunk.lvElement(i3) : null;
            if (lvElement != null || lvConsumerIndex == lvProducerIndex()) {
                if (lvElement == null || lvConsumerIndex == lvConsumerIndex()) {
                    break;
                }
            }
        }
        return lvElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E lvElement;
        org.jctools.queues.MpmcUnboundedXaddChunk<E> lvNext;
        E lvElement2;
        int i = this.chunkMask;
        int i2 = this.chunkShift;
        long lvConsumerIndex = lvConsumerIndex();
        org.jctools.queues.MpmcUnboundedXaddChunk mpmcUnboundedXaddChunk = (org.jctools.queues.MpmcUnboundedXaddChunk) lvConsumerChunk();
        int i3 = (int) (i & lvConsumerIndex);
        long j = lvConsumerIndex >> i2;
        if (i3 != 0 || lvConsumerIndex == 0) {
            boolean isPooled = mpmcUnboundedXaddChunk.isPooled();
            if (isPooled) {
                if (mpmcUnboundedXaddChunk.lvSequence(i3) != j) {
                    return null;
                }
                lvElement = null;
            } else if (mpmcUnboundedXaddChunk.lvIndex() != j || (lvElement = mpmcUnboundedXaddChunk.lvElement(i3)) == null) {
                return null;
            }
            if (!casConsumerIndex(lvConsumerIndex, 1 + lvConsumerIndex)) {
                return null;
            }
            if (isPooled) {
                lvElement = mpmcUnboundedXaddChunk.lvElement(i3);
            }
            mpmcUnboundedXaddChunk.soElement(i3, null);
            return lvElement;
        }
        if (j - 1 != mpmcUnboundedXaddChunk.lvIndex() || (lvNext = mpmcUnboundedXaddChunk.lvNext()) == null) {
            return null;
        }
        boolean isPooled2 = lvNext.isPooled();
        if (!isPooled2) {
            lvElement2 = lvNext.lvElement(0);
            if (lvElement2 == null) {
                return null;
            }
        } else {
            if (lvNext.lvSequence(0) != j) {
                return null;
            }
            lvElement2 = null;
        }
        if (!casConsumerIndex(lvConsumerIndex, 1 + lvConsumerIndex)) {
            return null;
        }
        if (isPooled2) {
            lvElement2 = lvNext.lvElement(0);
        }
        lvNext.soElement(0, null);
        moveToNextConsumerChunk(mpmcUnboundedXaddChunk, lvNext);
        return lvElement2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        int i = this.chunkMask;
        int i2 = this.chunkShift;
        long lvConsumerIndex = lvConsumerIndex();
        int i3 = (int) (i & lvConsumerIndex);
        long j = lvConsumerIndex >> i2;
        org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk = (org.jctools.queues.MpmcUnboundedXaddChunk) lvConsumerChunk();
        if (i3 == 0 && lvConsumerIndex >= i + 1 && (j - 1 != mpmcUnboundedXaddChunk.lvIndex() || (mpmcUnboundedXaddChunk = mpmcUnboundedXaddChunk.lvNext()) == null)) {
            return null;
        }
        if (mpmcUnboundedXaddChunk.isPooled()) {
            if (mpmcUnboundedXaddChunk.lvSequence(i3) != j) {
                return null;
            }
        } else if (mpmcUnboundedXaddChunk.lvIndex() != j) {
            return null;
        }
        E lvElement = mpmcUnboundedXaddChunk.lvElement(i3);
        if (lvConsumerIndex != lvConsumerIndex()) {
            return null;
        }
        return lvElement;
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
        int i2 = this.chunkShift;
        int i3 = this.chunkMask;
        long andAddProducerIndex = getAndAddProducerIndex(i);
        org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk = null;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = (int) (i3 & andAddProducerIndex);
            long j = andAddProducerIndex >> i2;
            if (mpmcUnboundedXaddChunk == null || mpmcUnboundedXaddChunk.lvIndex() != j) {
                mpmcUnboundedXaddChunk = producerChunkForIndex(mpmcUnboundedXaddChunk, j);
                if (mpmcUnboundedXaddChunk.isPooled()) {
                    j = mpmcUnboundedXaddChunk.lvIndex();
                }
            }
            if (mpmcUnboundedXaddChunk.isPooled()) {
                while (mpmcUnboundedXaddChunk.lvElement(i5) != null) {
                }
            }
            mpmcUnboundedXaddChunk.soElement(i5, supplier.get());
            if (mpmcUnboundedXaddChunk.isPooled()) {
                mpmcUnboundedXaddChunk.soSequence(i5, j);
            }
            andAddProducerIndex++;
        }
        return i;
    }
}
