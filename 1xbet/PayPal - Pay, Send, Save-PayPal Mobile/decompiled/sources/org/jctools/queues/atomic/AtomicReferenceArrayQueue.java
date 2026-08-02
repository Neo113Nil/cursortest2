package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
abstract class AtomicReferenceArrayQueue<E> extends java.util.AbstractQueue<E> implements org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.QueueProgressIndicators, org.jctools.queues.MessagePassingQueue<E>, org.jctools.queues.SupportsIterator {
    protected final java.util.concurrent.atomic.AtomicReferenceArray<E> buffer;
    protected final int mask;

    public AtomicReferenceArrayQueue(int i) {
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        this.mask = roundToPowerOfTwo - 1;
        this.buffer = new java.util.concurrent.atomic.AtomicReferenceArray<>(roundToPowerOfTwo);
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

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, org.jctools.queues.MessagePassingQueue
    public final int capacity() {
        return this.mask + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public final int size() {
        return org.jctools.queues.IndexedQueueSizeUtil.size(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
        return org.jctools.queues.IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public final long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // org.jctools.queues.QueueProgressIndicators
    public final long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new org.jctools.queues.atomic.AtomicReferenceArrayQueue.WeakIterator(lvConsumerIndex(), lvProducerIndex(), this.mask, this.buffer);
    }

    static class WeakIterator<E> implements java.util.Iterator<E> {
        private final java.util.concurrent.atomic.AtomicReferenceArray<E> buffer;
        private final int mask;
        private E nextElement = getNext();
        private long nextIndex;
        private final long pIndex;

        WeakIterator(long j, long j2, int i, java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray) {
            this.nextIndex = j;
            this.pIndex = j2;
            this.mask = i;
            this.buffer = atomicReferenceArray;
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
            int i = this.mask;
            java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
            do {
                long j = this.nextIndex;
                if (j >= this.pIndex) {
                    return null;
                }
                this.nextIndex = 1 + j;
                e = (E) org.jctools.queues.atomic.AtomicQueueUtil.lvRefElement(atomicReferenceArray, org.jctools.queues.atomic.AtomicQueueUtil.calcCircularRefElementOffset(j, i));
            } while (e == null);
            return e;
        }
    }
}
