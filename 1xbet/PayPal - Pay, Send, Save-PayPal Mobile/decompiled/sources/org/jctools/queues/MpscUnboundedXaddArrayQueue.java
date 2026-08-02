package org.jctools.queues;

/* loaded from: classes18.dex */
public class MpscUnboundedXaddArrayQueue<E> extends org.jctools.queues.MpUnboundedXaddArrayQueue<org.jctools.queues.MpscUnboundedXaddChunk<E>, E> {
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
    public /* bridge */ /* synthetic */ void drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
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

    public MpscUnboundedXaddArrayQueue(int i, int i2) {
        super(i, i2);
    }

    public MpscUnboundedXaddArrayQueue(int i) {
        this(i, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue
    public final org.jctools.queues.MpscUnboundedXaddChunk<E> newChunk(long j, org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk, int i, boolean z) {
        return new org.jctools.queues.MpscUnboundedXaddChunk<>(j, mpscUnboundedXaddChunk, i, z);
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
        org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk = (org.jctools.queues.MpscUnboundedXaddChunk) lvProducerChunk();
        if (mpscUnboundedXaddChunk.lvIndex() != j) {
            mpscUnboundedXaddChunk = producerChunkForIndex(mpscUnboundedXaddChunk, j);
        }
        mpscUnboundedXaddChunk.soElement(i3, e);
        return true;
    }

    private org.jctools.queues.MpscUnboundedXaddChunk<E> pollNextBuffer(org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk, long j) {
        org.jctools.queues.MpscUnboundedXaddChunk<E> spinForNextIfNotEmpty = spinForNextIfNotEmpty(mpscUnboundedXaddChunk, j);
        if (spinForNextIfNotEmpty == null) {
            return null;
        }
        moveToNextConsumerChunk(mpscUnboundedXaddChunk, spinForNextIfNotEmpty);
        return spinForNextIfNotEmpty;
    }

    private org.jctools.queues.MpscUnboundedXaddChunk<E> spinForNextIfNotEmpty(org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk, long j) {
        org.jctools.queues.MpscUnboundedXaddChunk<E> lvNext = mpscUnboundedXaddChunk.lvNext();
        if (lvNext == null) {
            if (lvProducerIndex() == j) {
                return null;
            }
            long lvIndex = mpscUnboundedXaddChunk.lvIndex();
            if (lvProducerChunkIndex() == lvIndex) {
                lvNext = appendNextChunks(mpscUnboundedXaddChunk, lvIndex, 1L);
            }
            while (lvNext == null) {
                lvNext = mpscUnboundedXaddChunk.lvNext();
            }
        }
        return lvNext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        int i = this.chunkMask;
        long lpConsumerIndex = lpConsumerIndex();
        int i2 = (int) (i & lpConsumerIndex);
        org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk = (org.jctools.queues.MpscUnboundedXaddChunk) lvConsumerChunk();
        if (i2 == 0 && lpConsumerIndex != 0 && (mpscUnboundedXaddChunk = pollNextBuffer(mpscUnboundedXaddChunk, lpConsumerIndex)) == null) {
            return null;
        }
        E lvElement = mpscUnboundedXaddChunk.lvElement(i2);
        if (lvElement == null) {
            if (lvProducerIndex() == lpConsumerIndex) {
                return null;
            }
            lvElement = mpscUnboundedXaddChunk.spinForElement(i2, false);
        }
        mpscUnboundedXaddChunk.soElement(i2, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return lvElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        int i = this.chunkMask;
        long lpConsumerIndex = lpConsumerIndex();
        int i2 = (int) (i & lpConsumerIndex);
        org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk = (org.jctools.queues.MpscUnboundedXaddChunk) lpConsumerChunk();
        if (i2 == 0 && lpConsumerIndex != 0 && (mpscUnboundedXaddChunk = spinForNextIfNotEmpty(mpscUnboundedXaddChunk, lpConsumerIndex)) == null) {
            return null;
        }
        E lvElement = mpscUnboundedXaddChunk.lvElement(i2);
        if (lvElement != null) {
            return lvElement;
        }
        if (lvProducerIndex() == lpConsumerIndex) {
            return null;
        }
        return mpscUnboundedXaddChunk.spinForElement(i2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E lvElement;
        int i = this.chunkMask;
        long lpConsumerIndex = lpConsumerIndex();
        int i2 = (int) (i & lpConsumerIndex);
        org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk = (org.jctools.queues.MpscUnboundedXaddChunk) lpConsumerChunk();
        if (i2 == 0 && lpConsumerIndex != 0) {
            org.jctools.queues.MpscUnboundedXaddChunk<E> lvNext = mpscUnboundedXaddChunk.lvNext();
            if (lvNext == null || (lvElement = lvNext.lvElement(0)) == null) {
                return null;
            }
            moveToNextConsumerChunk(mpscUnboundedXaddChunk, lvNext);
            mpscUnboundedXaddChunk = lvNext;
        } else {
            lvElement = mpscUnboundedXaddChunk.lvElement(i2);
            if (lvElement == null) {
                return null;
            }
        }
        mpscUnboundedXaddChunk.soElement(i2, null);
        soConsumerIndex(lpConsumerIndex + 1);
        return lvElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        int i = this.chunkMask;
        long lpConsumerIndex = lpConsumerIndex();
        int i2 = (int) (i & lpConsumerIndex);
        org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk = (org.jctools.queues.MpscUnboundedXaddChunk) lpConsumerChunk();
        if (i2 == 0 && lpConsumerIndex != 0 && (mpscUnboundedXaddChunk = mpscUnboundedXaddChunk.lvNext()) == null) {
            return null;
        }
        return mpscUnboundedXaddChunk.lvElement(i2);
    }

    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        int i = this.chunkMask + 1;
        int min = java.lang.Math.min(org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH, i);
        long j = 0;
        do {
            int fill = fill(supplier, min);
            if (fill == 0) {
                return (int) j;
            }
            j += fill;
        } while (j <= i);
        return (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MpUnboundedXaddArrayQueue, org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        E lvElement;
        if (consumer == null) {
            throw new java.lang.IllegalArgumentException("c is null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit is negative: ".concat(java.lang.String.valueOf(i)));
        }
        if (i == 0) {
            return 0;
        }
        int i2 = this.chunkMask;
        long lpConsumerIndex = lpConsumerIndex();
        org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk = (org.jctools.queues.MpscUnboundedXaddChunk) lpConsumerChunk();
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = (int) (i2 & lpConsumerIndex);
            if (i4 == 0 && lpConsumerIndex != 0) {
                org.jctools.queues.MpscUnboundedXaddChunk<E> lvNext = mpscUnboundedXaddChunk.lvNext();
                if (lvNext != null && (lvElement = lvNext.lvElement(0)) != null) {
                    moveToNextConsumerChunk(mpscUnboundedXaddChunk, lvNext);
                    mpscUnboundedXaddChunk = lvNext;
                    mpscUnboundedXaddChunk.soElement(i4, null);
                    lpConsumerIndex++;
                    soConsumerIndex(lpConsumerIndex);
                    consumer.accept(lvElement);
                }
                return i3;
            }
            lvElement = mpscUnboundedXaddChunk.lvElement(i4);
            if (lvElement == null) {
                return i3;
            }
            mpscUnboundedXaddChunk.soElement(i4, null);
            lpConsumerIndex++;
            soConsumerIndex(lpConsumerIndex);
            consumer.accept(lvElement);
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
        int i2 = this.chunkShift;
        int i3 = this.chunkMask;
        long andAddProducerIndex = getAndAddProducerIndex(i);
        org.jctools.queues.MpscUnboundedXaddChunk<E> mpscUnboundedXaddChunk = null;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = (int) (i3 & andAddProducerIndex);
            long j = andAddProducerIndex >> i2;
            if (mpscUnboundedXaddChunk == null || mpscUnboundedXaddChunk.lvIndex() != j) {
                mpscUnboundedXaddChunk = producerChunkForIndex(mpscUnboundedXaddChunk, j);
            }
            mpscUnboundedXaddChunk.soElement(i5, supplier.get());
            andAddProducerIndex++;
        }
        return i;
    }
}
