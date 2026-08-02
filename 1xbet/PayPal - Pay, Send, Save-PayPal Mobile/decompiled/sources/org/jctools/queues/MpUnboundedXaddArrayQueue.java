package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpUnboundedXaddArrayQueue<R extends org.jctools.queues.MpUnboundedXaddChunk<R, E>, E> extends org.jctools.queues.MpUnboundedXaddArrayQueuePad5<R, E> implements org.jctools.queues.MessagePassingQueue<E>, org.jctools.queues.QueueProgressIndicators {
    final int chunkMask;
    final int chunkShift;
    final org.jctools.queues.SpscArrayQueue<R> freeChunksPool;
    final int maxPooledChunks;

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return -1;
    }

    abstract R newChunk(long j, R r, int i, boolean z);

    MpUnboundedXaddArrayQueue(int i, int i2) {
        if (!org.jctools.util.UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
            throw new java.lang.IllegalStateException("Unsafe::getAndAddLong support (JDK 8+) is required for this queue to work");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Expecting a positive maxPooledChunks, but got:".concat(java.lang.String.valueOf(i2)));
        }
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        this.chunkMask = roundToPowerOfTwo - 1;
        this.chunkShift = java.lang.Integer.numberOfTrailingZeros(roundToPowerOfTwo);
        this.freeChunksPool = new org.jctools.queues.SpscArrayQueue<>(i2);
        R newChunk = newChunk(0L, null, roundToPowerOfTwo, i2 > 0);
        soProducerChunk(newChunk);
        soProducerChunkIndex(0L);
        soConsumerChunk(newChunk);
        for (int i3 = 1; i3 < i2; i3++) {
            this.freeChunksPool.offer(newChunk(-1L, null, roundToPowerOfTwo, true));
        }
        this.maxPooledChunks = i2;
    }

    public final int chunkSize() {
        return this.chunkMask + 1;
    }

    public final int maxPooledChunks() {
        return this.maxPooledChunks;
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    final R producerChunkForIndex(R r, long j) {
        R r2;
        long j2;
        long j3;
        while (true) {
            if (r == null) {
                r = lvProducerChunk();
            }
            r2 = r;
            long lvIndex = r2.lvIndex();
            j2 = lvIndex - j;
            if (j2 >= 0) {
                break;
            }
            r = lvProducerChunkIndex() == lvIndex ? appendNextChunks(r2, lvIndex, -j2) : null;
        }
        for (j3 = 0; j3 < j2; j3++) {
            r2 = (R) r2.lvPrev();
        }
        return r2;
    }

    protected final R appendNextChunks(R r, long j, long j2) {
        if (!casProducerChunkIndex(j, -2L)) {
            return null;
        }
        long j3 = 1;
        while (j3 <= j2) {
            R newOrPooledChunk = newOrPooledChunk(r, j + j3);
            soProducerChunk(newOrPooledChunk);
            r.soNext(newOrPooledChunk);
            j3++;
            r = newOrPooledChunk;
        }
        soProducerChunkIndex(j + j2);
        return r;
    }

    private R newOrPooledChunk(R r, long j) {
        R poll = this.freeChunksPool.poll();
        if (poll != null) {
            poll.soPrev(r);
            poll.soIndex(j);
            return poll;
        }
        return newChunk(j, r, this.chunkMask + 1, false);
    }

    final void moveToNextConsumerChunk(R r, R r2) {
        r.soNext(null);
        r2.soPrev(null);
        if (r.isPooled()) {
            this.freeChunksPool.offer(r);
        }
        soConsumerChunk(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public int size() {
        return org.jctools.queues.IndexedQueueSizeUtil.size(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public boolean isEmpty() {
        return org.jctools.queues.IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        int i = this.chunkMask + 1;
        return org.jctools.queues.MessagePassingQueueUtil.fillInBatchesToLimit(this, supplier, java.lang.Math.min(org.jctools.util.PortableJvmInfo.RECOMENDED_OFFER_BATCH, i), i);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, i);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        org.jctools.queues.MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return getClass().getName();
    }
}
