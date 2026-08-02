package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class ConcurrentCircularArrayQueue<E> extends org.jctools.queues.ConcurrentCircularArrayQueueL0Pad<E> implements org.jctools.queues.MessagePassingQueue<E>, org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.QueueProgressIndicators, org.jctools.queues.SupportsIterator {
    protected final E[] buffer;
    protected final long mask;

    ConcurrentCircularArrayQueue(int i) {
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        this.mask = roundToPowerOfTwo - 1;
        this.buffer = (E[]) org.jctools.util.UnsafeRefArrayAccess.allocateRefArray(roundToPowerOfTwo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public int size() {
        return org.jctools.queues.IndexedQueueSizeUtil.size(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public boolean isEmpty() {
        return org.jctools.queues.IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return getClass().getName();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public void clear() {
        while (poll() != null) {
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return (int) (this.mask + 1);
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new org.jctools.queues.ConcurrentCircularArrayQueue.WeakIterator(lvConsumerIndex(), lvProducerIndex(), this.mask, this.buffer);
    }

    static class WeakIterator<E> implements java.util.Iterator<E> {
        private final E[] buffer;
        private final long mask;
        private E nextElement = getNext();
        private long nextIndex;
        private final long pIndex;

        WeakIterator(long j, long j2, long j3, E[] eArr) {
            this.nextIndex = j;
            this.pIndex = j2;
            this.mask = j3;
            this.buffer = eArr;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("remove");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextElement != null;
        }

        @Override // java.util.Iterator
        public E next() {
            E e = this.nextElement;
            if (e == null) {
                throw new java.util.NoSuchElementException();
            }
            this.nextElement = getNext();
            return e;
        }

        private E getNext() {
            E e;
            do {
                long j = this.nextIndex;
                if (j >= this.pIndex) {
                    return null;
                }
                this.nextIndex = 1 + j;
                e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcCircularRefElementOffset(j, this.mask));
            } while (e == null);
            return e;
        }
    }
}
