package org.jctools.queues;

/* loaded from: classes18.dex */
public class MpscCompoundQueue<E> extends org.jctools.queues.MpscCompoundQueueConsumerQueueIndex<E> {
    public MpscCompoundQueue(int i) {
        this(i, org.jctools.util.PortableJvmInfo.CPUs);
    }

    public MpscCompoundQueue(int i, int i2) {
        super(i, i2);
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        int i = this.parallelQueuesMask;
        int id = (int) (java.lang.Thread.currentThread().getId() & i);
        org.jctools.queues.MpscArrayQueue<E>[] mpscArrayQueueArr = this.queues;
        if (mpscArrayQueueArr[id].offer(e)) {
            return true;
        }
        return slowOffer(mpscArrayQueueArr, i, id + 1, e);
    }

    private boolean slowOffer(org.jctools.queues.MpscArrayQueue<E>[] mpscArrayQueueArr, int i, int i2, E e) {
        int i3;
        int i4 = i + 1;
        do {
            i3 = 0;
            for (int i5 = i2; i5 < i2 + i4; i5++) {
                int failFastOffer = mpscArrayQueueArr[i5 & i].failFastOffer(e);
                if (failFastOffer == 0) {
                    return true;
                }
                i3 += failFastOffer;
            }
        } while (i3 != i4);
        return false;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        int i = this.consumerQueueIndex & this.parallelQueuesMask;
        int i2 = this.parallelQueues;
        E e = null;
        int i3 = i;
        while (i3 < i2 + i && (e = this.queues[this.parallelQueuesMask & i3].poll()) == null) {
            i3++;
        }
        this.consumerQueueIndex = i3;
        return e;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        int i = this.consumerQueueIndex & this.parallelQueuesMask;
        int i2 = this.parallelQueues;
        E e = null;
        int i3 = i;
        while (i3 < i2 + i && (e = this.queues[this.parallelQueuesMask & i3].peek()) == null) {
            i3++;
        }
        this.consumerQueueIndex = i3;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public int size() {
        int i = 0;
        for (org.jctools.queues.MpscArrayQueue<E> mpscArrayQueue : this.queues) {
            i += mpscArrayQueue.size();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return getClass().getName();
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        e.getClass();
        int i = this.parallelQueuesMask;
        int id = (int) (java.lang.Thread.currentThread().getId() & i);
        org.jctools.queues.MpscArrayQueue<E>[] mpscArrayQueueArr = this.queues;
        if (mpscArrayQueueArr[id].failFastOffer(e) == 0) {
            return true;
        }
        for (int i2 = id + 1; i2 < id + i + 1; i2++) {
            if (mpscArrayQueueArr[i2 & i].failFastOffer(e) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        int i = this.consumerQueueIndex & this.parallelQueuesMask;
        int i2 = this.parallelQueues;
        E e = null;
        int i3 = i;
        while (i3 < i2 + i && (e = this.queues[this.parallelQueuesMask & i3].relaxedPoll()) == null) {
            i3++;
        }
        this.consumerQueueIndex = i3;
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        int i = this.consumerQueueIndex & this.parallelQueuesMask;
        int i2 = this.parallelQueues;
        E e = null;
        int i3 = i;
        while (i3 < i2 + i && (e = this.queues[this.parallelQueuesMask & i3].relaxedPeek()) == null) {
            i3++;
        }
        this.consumerQueueIndex = i3;
        return e;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return this.queues.length * this.queues[0].capacity();
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
    public int drain(org.jctools.queues.MessagePassingQueue.Consumer<E> consumer, int i) {
        return org.jctools.queues.MessagePassingQueueUtil.drain(this, consumer, i);
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
        int i2 = this.parallelQueuesMask;
        int id = (int) (java.lang.Thread.currentThread().getId() & i2);
        org.jctools.queues.MpscArrayQueue<E>[] mpscArrayQueueArr = this.queues;
        int fill = mpscArrayQueueArr[id].fill(supplier, i);
        if (fill != i) {
            for (int i3 = id + 1; i3 < id + i2 + 1; i3++) {
                fill += mpscArrayQueueArr[i3 & i2].fill(supplier, i - fill);
                if (fill != i) {
                }
            }
            return fill;
        }
        return i;
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
