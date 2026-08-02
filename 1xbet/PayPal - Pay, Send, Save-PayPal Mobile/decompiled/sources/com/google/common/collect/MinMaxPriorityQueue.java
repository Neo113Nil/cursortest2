package com.google.common.collect;

/* loaded from: classes9.dex */
public final class MinMaxPriorityQueue<E> extends java.util.AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final com.google.common.collect.MinMaxPriorityQueue<E>.Heap maxHeap;
    final int maximumSize;
    private final com.google.common.collect.MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private java.lang.Object[] queue;
    private int size;

    public static <E extends java.lang.Comparable<E>> com.google.common.collect.MinMaxPriorityQueue<E> create() {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).create();
    }

    public static <E extends java.lang.Comparable<E>> com.google.common.collect.MinMaxPriorityQueue<E> create(java.lang.Iterable<? extends E> iterable) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).create(iterable);
    }

    public static <B> com.google.common.collect.MinMaxPriorityQueue.Builder<B> orderedBy(java.util.Comparator<B> comparator) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder<>(comparator);
    }

    public static com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable> expectedSize(int i) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).expectedSize(i);
    }

    public static com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable> maximumSize(int i) {
        return new com.google.common.collect.MinMaxPriorityQueue.Builder(com.google.common.collect.Ordering.natural()).maximumSize(i);
    }

    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final java.util.Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        private Builder(java.util.Comparator<B> comparator) {
            this.expectedSize = -1;
            this.maximumSize = Integer.MAX_VALUE;
            this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
        }

        public final com.google.common.collect.MinMaxPriorityQueue.Builder<B> expectedSize(int i) {
            com.google.common.base.Preconditions.checkArgument(i >= 0);
            this.expectedSize = i;
            return this;
        }

        public final com.google.common.collect.MinMaxPriorityQueue.Builder<B> maximumSize(int i) {
            com.google.common.base.Preconditions.checkArgument(i > 0);
            this.maximumSize = i;
            return this;
        }

        public final <T extends B> com.google.common.collect.MinMaxPriorityQueue<T> create() {
            return create(java.util.Collections.emptySet());
        }

        public final <T extends B> com.google.common.collect.MinMaxPriorityQueue<T> create(java.lang.Iterable<? extends T> iterable) {
            com.google.common.collect.MinMaxPriorityQueue<T> minMaxPriorityQueue = new com.google.common.collect.MinMaxPriorityQueue<>(this, com.google.common.collect.MinMaxPriorityQueue.initialQueueSize(this.expectedSize, this.maximumSize, iterable));
            java.util.Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> com.google.common.collect.Ordering<T> ordering() {
            return com.google.common.collect.Ordering.from(this.comparator);
        }
    }

    private MinMaxPriorityQueue(com.google.common.collect.MinMaxPriorityQueue.Builder<? super E> builder, int i) {
        com.google.common.collect.Ordering ordering = builder.ordering();
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap heap = new com.google.common.collect.MinMaxPriorityQueue.Heap(ordering);
        this.minHeap = heap;
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap heap2 = new com.google.common.collect.MinMaxPriorityQueue.Heap(ordering.reverse());
        this.maxHeap = heap2;
        heap.otherHeap = heap2;
        heap2.otherHeap = heap;
        this.maximumSize = ((com.google.common.collect.MinMaxPriorityQueue.Builder) builder).maximumSize;
        this.queue = new java.lang.Object[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.size;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        offer(e);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        java.util.Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            offer(it.next());
            z = true;
        }
        return z;
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        com.google.common.base.Preconditions.checkNotNull(e);
        this.modCount++;
        int i = this.size;
        this.size = i + 1;
        growIfNeeded();
        heapForIndex(i).bubbleUp(i, e);
        return this.size <= this.maximumSize || pollLast() != e;
    }

    @Override // java.util.Queue
    public final E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    final E elementData(int i) {
        return (E) java.util.Objects.requireNonNull(this.queue[i]);
    }

    @Override // java.util.Queue
    public final E peek() {
        if (isEmpty()) {
            return null;
        }
        return elementData(0);
    }

    private int getMaxElementIndex() {
        int i = this.size;
        if (i != 1) {
            return (i == 2 || this.maxHeap.compareElements(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    public final E pollFirst() {
        return poll();
    }

    public final E removeFirst() {
        return remove();
    }

    public final E peekFirst() {
        return peek();
    }

    public final E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return removeAndGet(getMaxElementIndex());
    }

    public final E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementData(getMaxElementIndex());
    }

    final com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> removeAt(int i) {
        com.google.common.base.Preconditions.checkPositionIndex(i, this.size);
        this.modCount++;
        int i2 = this.size - 1;
        this.size = i2;
        if (i2 == i) {
            this.queue[i2] = null;
            return null;
        }
        E elementData = elementData(i2);
        int swapWithConceptuallyLastElement = heapForIndex(this.size).swapWithConceptuallyLastElement(elementData);
        if (swapWithConceptuallyLastElement == i) {
            this.queue[this.size] = null;
            return null;
        }
        E elementData2 = elementData(this.size);
        this.queue[this.size] = null;
        com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> fillHole = fillHole(i, elementData2);
        if (swapWithConceptuallyLastElement >= i) {
            return fillHole;
        }
        if (fillHole == null) {
            return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(elementData, elementData2);
        }
        return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(elementData, fillHole.replaced);
    }

    private com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> fillHole(int i, E e) {
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap heapForIndex = heapForIndex(i);
        int fillHoleAt = heapForIndex.fillHoleAt(i);
        int bubbleUpAlternatingLevels = heapForIndex.bubbleUpAlternatingLevels(fillHoleAt, e);
        if (bubbleUpAlternatingLevels == fillHoleAt) {
            return heapForIndex.tryCrossOverAndBubbleUp(i, fillHoleAt, e);
        }
        if (bubbleUpAlternatingLevels < i) {
            return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(e, elementData(i));
        }
        return null;
    }

    static final class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        MoveDesc(E e, E e2) {
            this.toTrickle = e;
            this.replaced = e2;
        }
    }

    private E removeAndGet(int i) {
        E elementData = elementData(i);
        removeAt(i);
        return elementData;
    }

    private com.google.common.collect.MinMaxPriorityQueue<E>.Heap heapForIndex(int i) {
        return isEvenLevel(i) ? this.minHeap : this.maxHeap;
    }

    static boolean isEvenLevel(int i) {
        int i2 = ~(~(i + 1));
        com.google.common.base.Preconditions.checkState(i2 > 0, "negative index");
        return (EVEN_POWERS_OF_TWO & i2) > (i2 & ODD_POWERS_OF_TWO);
    }

    final boolean isIntact() {
        for (int i = 1; i < this.size; i++) {
            if (!heapForIndex(i).verifyIndex(i)) {
                return false;
            }
        }
        return true;
    }

    final class Heap {
        final com.google.common.collect.Ordering<E> ordering;
        com.google.common.collect.MinMaxPriorityQueue<E>.Heap otherHeap;

        private int getLeftChildIndex(int i) {
            return (i * 2) + 1;
        }

        private int getRightChildIndex(int i) {
            return (i * 2) + 2;
        }

        Heap(com.google.common.collect.Ordering<E> ordering) {
            this.ordering = ordering;
        }

        final int compareElements(int i, int i2) {
            return this.ordering.compare(com.google.common.collect.MinMaxPriorityQueue.this.elementData(i), com.google.common.collect.MinMaxPriorityQueue.this.elementData(i2));
        }

        final com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> tryCrossOverAndBubbleUp(int i, int i2, E e) {
            java.lang.Object elementData;
            int crossOver = crossOver(i2, e);
            if (crossOver == i2) {
                return null;
            }
            if (crossOver < i) {
                elementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(i);
            } else {
                elementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(getParentIndex(i));
            }
            if (this.otherHeap.bubbleUpAlternatingLevels(crossOver, e) < i) {
                return new com.google.common.collect.MinMaxPriorityQueue.MoveDesc<>(e, elementData);
            }
            return null;
        }

        final void bubbleUp(int i, E e) {
            com.google.common.collect.MinMaxPriorityQueue.Heap heap;
            int crossOverUp = crossOverUp(i, e);
            if (crossOverUp == i) {
                crossOverUp = i;
                heap = this;
            } else {
                heap = this.otherHeap;
            }
            heap.bubbleUpAlternatingLevels(crossOverUp, e);
        }

        final int bubbleUpAlternatingLevels(int i, E e) {
            while (i > 2) {
                int grandparentIndex = getGrandparentIndex(i);
                java.lang.Object elementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(grandparentIndex);
                if (this.ordering.compare(elementData, e) <= 0) {
                    break;
                }
                com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = elementData;
                i = grandparentIndex;
            }
            com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = e;
            return i;
        }

        final int findMin(int i, int i2) {
            if (i >= com.google.common.collect.MinMaxPriorityQueue.this.size) {
                return -1;
            }
            com.google.common.base.Preconditions.checkState(i > 0);
            int min = java.lang.Math.min(i, com.google.common.collect.MinMaxPriorityQueue.this.size - i2);
            for (int i3 = i + 1; i3 < min + i2; i3++) {
                if (compareElements(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        final int findMinChild(int i) {
            return findMin(getLeftChildIndex(i), 2);
        }

        final int findMinGrandChild(int i) {
            int leftChildIndex = getLeftChildIndex(i);
            if (leftChildIndex < 0) {
                return -1;
            }
            return findMin(getLeftChildIndex(leftChildIndex), 4);
        }

        final int crossOverUp(int i, E e) {
            int rightChildIndex;
            if (i == 0) {
                com.google.common.collect.MinMaxPriorityQueue.this.queue[0] = e;
                return 0;
            }
            int parentIndex = getParentIndex(i);
            java.lang.Object elementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= com.google.common.collect.MinMaxPriorityQueue.this.size) {
                java.lang.Object elementData2 = com.google.common.collect.MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare(elementData2, elementData) < 0) {
                    parentIndex = rightChildIndex;
                    elementData = elementData2;
                }
            }
            if (this.ordering.compare(elementData, e) < 0) {
                com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = elementData;
                com.google.common.collect.MinMaxPriorityQueue.this.queue[parentIndex] = e;
                return parentIndex;
            }
            com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = e;
            return i;
        }

        final int swapWithConceptuallyLastElement(E e) {
            int rightChildIndex;
            int parentIndex = getParentIndex(com.google.common.collect.MinMaxPriorityQueue.this.size);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= com.google.common.collect.MinMaxPriorityQueue.this.size) {
                java.lang.Object elementData = com.google.common.collect.MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare(elementData, e) < 0) {
                    com.google.common.collect.MinMaxPriorityQueue.this.queue[rightChildIndex] = e;
                    com.google.common.collect.MinMaxPriorityQueue.this.queue[com.google.common.collect.MinMaxPriorityQueue.this.size] = elementData;
                    return rightChildIndex;
                }
            }
            return com.google.common.collect.MinMaxPriorityQueue.this.size;
        }

        final int crossOver(int i, E e) {
            int findMinChild = findMinChild(i);
            if (findMinChild > 0 && this.ordering.compare(com.google.common.collect.MinMaxPriorityQueue.this.elementData(findMinChild), e) < 0) {
                com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = com.google.common.collect.MinMaxPriorityQueue.this.elementData(findMinChild);
                com.google.common.collect.MinMaxPriorityQueue.this.queue[findMinChild] = e;
                return findMinChild;
            }
            return crossOverUp(i, e);
        }

        final int fillHoleAt(int i) {
            while (true) {
                int findMinGrandChild = findMinGrandChild(i);
                if (findMinGrandChild <= 0) {
                    return i;
                }
                com.google.common.collect.MinMaxPriorityQueue.this.queue[i] = com.google.common.collect.MinMaxPriorityQueue.this.elementData(findMinGrandChild);
                i = findMinGrandChild;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i) {
            if (getLeftChildIndex(i) < com.google.common.collect.MinMaxPriorityQueue.this.size && compareElements(i, getLeftChildIndex(i)) > 0) {
                return false;
            }
            if (getRightChildIndex(i) < com.google.common.collect.MinMaxPriorityQueue.this.size && compareElements(i, getRightChildIndex(i)) > 0) {
                return false;
            }
            if (i <= 0 || compareElements(i, getParentIndex(i)) <= 0) {
                return i <= 2 || compareElements(getGrandparentIndex(i), i) <= 0;
            }
            return false;
        }

        private int getParentIndex(int i) {
            return (i - 1) / 2;
        }

        private int getGrandparentIndex(int i) {
            return getParentIndex(getParentIndex(i));
        }
    }

    final class QueueIterator implements java.util.Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;
        private java.util.Queue<E> forgetMeNot;
        private E lastFromForgetMeNot;
        private int nextCursor;
        private java.util.List<E> skipMe;

        private QueueIterator() {
            this.cursor = -1;
            this.nextCursor = -1;
            this.expectedModCount = com.google.common.collect.MinMaxPriorityQueue.this.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            java.util.Queue<E> queue;
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            return this.nextCursor < com.google.common.collect.MinMaxPriorityQueue.this.size() || !((queue = this.forgetMeNot) == null || queue.isEmpty());
        }

        @Override // java.util.Iterator
        public final E next() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < com.google.common.collect.MinMaxPriorityQueue.this.size()) {
                int i = this.nextCursor;
                this.cursor = i;
                this.canRemove = true;
                return (E) com.google.common.collect.MinMaxPriorityQueue.this.elementData(i);
            }
            if (this.forgetMeNot != null) {
                this.cursor = com.google.common.collect.MinMaxPriorityQueue.this.size();
                E poll = this.forgetMeNot.poll();
                this.lastFromForgetMeNot = poll;
                if (poll != null) {
                    this.canRemove = true;
                    return poll;
                }
            }
            throw new java.util.NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.canRemove);
            checkModCount();
            this.canRemove = false;
            this.expectedModCount++;
            if (this.cursor < com.google.common.collect.MinMaxPriorityQueue.this.size()) {
                com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E> removeAt = com.google.common.collect.MinMaxPriorityQueue.this.removeAt(this.cursor);
                if (removeAt != null) {
                    if (this.forgetMeNot == null || this.skipMe == null) {
                        this.forgetMeNot = new java.util.ArrayDeque();
                        this.skipMe = new java.util.ArrayList(3);
                    }
                    if (!foundAndRemovedExactReference(this.skipMe, removeAt.toTrickle)) {
                        this.forgetMeNot.add(removeAt.toTrickle);
                    }
                    if (!foundAndRemovedExactReference(this.forgetMeNot, removeAt.replaced)) {
                        this.skipMe.add(removeAt.replaced);
                    }
                }
                this.cursor--;
                this.nextCursor--;
                return;
            }
            com.google.common.base.Preconditions.checkState(removeExact(java.util.Objects.requireNonNull(this.lastFromForgetMeNot)));
            this.lastFromForgetMeNot = null;
        }

        private boolean foundAndRemovedExactReference(java.lang.Iterable<E> iterable, E e) {
            java.util.Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        private boolean removeExact(java.lang.Object obj) {
            for (int i = 0; i < com.google.common.collect.MinMaxPriorityQueue.this.size; i++) {
                if (com.google.common.collect.MinMaxPriorityQueue.this.queue[i] == obj) {
                    com.google.common.collect.MinMaxPriorityQueue.this.removeAt(i);
                    return true;
                }
            }
            return false;
        }

        private void checkModCount() {
            if (com.google.common.collect.MinMaxPriorityQueue.this.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int i) {
            if (this.nextCursor < i) {
                if (this.skipMe != null) {
                    while (i < com.google.common.collect.MinMaxPriorityQueue.this.size() && foundAndRemovedExactReference(this.skipMe, com.google.common.collect.MinMaxPriorityQueue.this.elementData(i))) {
                        i++;
                    }
                }
                this.nextCursor = i;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new com.google.common.collect.MinMaxPriorityQueue.QueueIterator();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        for (int i = 0; i < this.size; i++) {
            this.queue[i] = null;
        }
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        int i = this.size;
        java.lang.Object[] objArr = new java.lang.Object[i];
        java.lang.System.arraycopy(this.queue, 0, objArr, 0, i);
        return objArr;
    }

    public final java.util.Comparator<? super E> comparator() {
        return this.minHeap.ordering;
    }

    final int capacity() {
        return this.queue.length;
    }

    static int initialQueueSize(int i, int i2, java.lang.Iterable<?> iterable) {
        if (i == -1) {
            i = 11;
        }
        if (iterable instanceof java.util.Collection) {
            i = java.lang.Math.max(i, ((java.util.Collection) iterable).size());
        }
        return capAtMaximumSize(i, i2);
    }

    private void growIfNeeded() {
        if (this.size > this.queue.length) {
            java.lang.Object[] objArr = new java.lang.Object[calculateNewCapacity()];
            java.lang.Object[] objArr2 = this.queue;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.queue = objArr;
        }
    }

    private int calculateNewCapacity() {
        int length = this.queue.length;
        return capAtMaximumSize(length < 64 ? (length + 1) * 2 : java.lang.Math.multiplyExact(length / 2, 3), this.maximumSize);
    }

    private static int capAtMaximumSize(int i, int i2) {
        return java.lang.Math.min(i - 1, i2) + 1;
    }
}
