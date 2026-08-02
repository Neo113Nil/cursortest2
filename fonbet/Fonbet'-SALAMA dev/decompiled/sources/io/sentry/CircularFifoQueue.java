package io.sentry;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes2.dex */
final class CircularFifoQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    private transient E[] elements;
    private transient int end;
    private transient boolean full;
    private final int maxElements;
    private transient int start;

    public CircularFifoQueue() {
        this(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int decrement(int i7) {
        int i8 = i7 - 1;
        return i8 < 0 ? this.maxElements - 1 : i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int increment(int i7) {
        int i8 = i7 + 1;
        if (i8 >= this.maxElements) {
            return 0;
        }
        return i8;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elements = (E[]) new Object[this.maxElements];
        int readInt = objectInputStream.readInt();
        for (int i7 = 0; i7 < readInt; i7++) {
            ((E[]) this.elements)[i7] = objectInputStream.readObject();
        }
        this.start = 0;
        boolean z4 = readInt == this.maxElements;
        this.full = z4;
        if (z4) {
            this.end = 0;
        } else {
            this.end = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e7) {
        if (e7 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (isAtFullCapacity()) {
            remove();
        }
        E[] eArr = this.elements;
        int i7 = this.end;
        int i8 = i7 + 1;
        this.end = i8;
        eArr[i7] = e7;
        if (i8 >= this.maxElements) {
            this.end = 0;
        }
        if (this.end == this.start) {
            this.full = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.full = false;
        this.start = 0;
        this.end = 0;
        Arrays.fill(this.elements, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    public E get(int i7) {
        int size = size();
        if (i7 < 0 || i7 >= size) {
            throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", Integer.valueOf(i7), Integer.valueOf(size)));
        }
        return this.elements[(this.start + i7) % this.maxElements];
    }

    public boolean isAtFullCapacity() {
        return size() == this.maxElements;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new Iterator<E>() { // from class: io.sentry.CircularFifoQueue.1
            private int index;
            private boolean isFirst;
            private int lastReturnedIndex = -1;

            {
                this.index = CircularFifoQueue.this.start;
                this.isFirst = CircularFifoQueue.this.full;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.isFirst || this.index != CircularFifoQueue.this.end;
            }

            @Override // java.util.Iterator
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.isFirst = false;
                int i7 = this.index;
                this.lastReturnedIndex = i7;
                this.index = CircularFifoQueue.this.increment(i7);
                return (E) CircularFifoQueue.this.elements[this.lastReturnedIndex];
            }

            @Override // java.util.Iterator
            public void remove() {
                int i7 = this.lastReturnedIndex;
                if (i7 == -1) {
                    throw new IllegalStateException();
                }
                if (i7 == CircularFifoQueue.this.start) {
                    CircularFifoQueue.this.remove();
                    this.lastReturnedIndex = -1;
                    return;
                }
                int i8 = this.lastReturnedIndex + 1;
                if (CircularFifoQueue.this.start >= this.lastReturnedIndex || i8 >= CircularFifoQueue.this.end) {
                    while (i8 != CircularFifoQueue.this.end) {
                        if (i8 >= CircularFifoQueue.this.maxElements) {
                            CircularFifoQueue.this.elements[i8 - 1] = CircularFifoQueue.this.elements[0];
                            i8 = 0;
                        } else {
                            CircularFifoQueue.this.elements[CircularFifoQueue.this.decrement(i8)] = CircularFifoQueue.this.elements[i8];
                            i8 = CircularFifoQueue.this.increment(i8);
                        }
                    }
                } else {
                    System.arraycopy(CircularFifoQueue.this.elements, i8, CircularFifoQueue.this.elements, this.lastReturnedIndex, CircularFifoQueue.this.end - i8);
                }
                this.lastReturnedIndex = -1;
                CircularFifoQueue circularFifoQueue = CircularFifoQueue.this;
                circularFifoQueue.end = circularFifoQueue.decrement(circularFifoQueue.end);
                CircularFifoQueue.this.elements[CircularFifoQueue.this.end] = null;
                CircularFifoQueue.this.full = false;
                this.index = CircularFifoQueue.this.decrement(this.index);
            }
        };
    }

    public int maxSize() {
        return this.maxElements;
    }

    @Override // java.util.Queue
    public boolean offer(E e7) {
        return add(e7);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.elements[this.start];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.elements;
        int i7 = this.start;
        E e7 = eArr[i7];
        if (e7 != null) {
            int i8 = i7 + 1;
            this.start = i8;
            eArr[i7] = null;
            if (i8 >= this.maxElements) {
                this.start = 0;
            }
            this.full = false;
        }
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i7 = this.end;
        int i8 = this.start;
        if (i7 < i8) {
            return (this.maxElements - i8) + i7;
        }
        if (i7 == i8) {
            return this.full ? this.maxElements : 0;
        }
        return i7 - i8;
    }

    public CircularFifoQueue(int i7) {
        this.start = 0;
        this.end = 0;
        this.full = false;
        if (i7 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i7];
        this.elements = eArr;
        this.maxElements = eArr.length;
    }

    public CircularFifoQueue(Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }
}
