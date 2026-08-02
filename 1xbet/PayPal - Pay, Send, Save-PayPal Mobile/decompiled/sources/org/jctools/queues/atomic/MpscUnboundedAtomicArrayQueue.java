package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public class MpscUnboundedAtomicArrayQueue<E> extends org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue<E> {
    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected long availableInQueue(long j, long j2) {
        return androidx.collection.SieveCacheKt.NodeLinkMask;
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return -1;
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected long getCurrentBufferCapacity(long j) {
        return j;
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentConsumerIndex() {
        return super.currentConsumerIndex();
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentProducerIndex() {
        return super.currentProducerIndex();
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(org.jctools.queues.MessagePassingQueue.Consumer consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int fill(org.jctools.queues.MessagePassingQueue.Supplier supplier, int i) {
        return super.fill(supplier, i);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void fill(org.jctools.queues.MessagePassingQueue.Supplier supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition) {
        super.fill(supplier, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return super.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean offer(java.lang.Object obj) {
        return super.offer(obj);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object peek() {
        return super.peek();
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object poll() {
        return super.poll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(java.lang.Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPeek() {
        return super.relaxedPeek();
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ java.lang.Object relaxedPoll() {
        return super.relaxedPoll();
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public MpscUnboundedAtomicArrayQueue(int i) {
        super(i);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, 4096);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue, org.jctools.queues.MessagePassingQueue
    public int fill(org.jctools.queues.MessagePassingQueue.Supplier<E> supplier) {
        return org.jctools.queues.MessagePassingQueueUtil.fillUnbounded(this, supplier);
    }

    @Override // org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    protected int getNextBufferSize(java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray) {
        return org.jctools.queues.atomic.AtomicQueueUtil.length(atomicReferenceArray);
    }
}
