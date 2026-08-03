package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class AbstractMapBasedMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    transient com.google.common.collect.ObjectCountHashMap<E> backingMap;
    transient long size;

    abstract com.google.common.collect.ObjectCountHashMap<E> newBackingMap(int distinctElements);

    AbstractMapBasedMultiset(int distinctElements) {
        this.backingMap = newBackingMap(distinctElements);
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@javax.annotation.CheckForNull java.lang.Object element) {
        return this.backingMap.get(element);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(@com.google.common.collect.ParametricNullness E element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        com.google.common.base.Preconditions.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int indexOf = this.backingMap.indexOf(element);
        if (indexOf == -1) {
            this.backingMap.put(element, occurrences);
            this.size += occurrences;
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        long j = occurrences;
        long j2 = value + j;
        com.google.common.base.Preconditions.checkArgument(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.backingMap.setValue(indexOf, (int) j2);
        this.size += j;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        com.google.common.base.Preconditions.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int indexOf = this.backingMap.indexOf(element);
        if (indexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        if (value > occurrences) {
            this.backingMap.setValue(indexOf, value - occurrences);
        } else {
            this.backingMap.removeEntry(indexOf);
            occurrences = value;
        }
        this.size -= occurrences;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int setCount(@com.google.common.collect.ParametricNullness E element, int count) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(count, com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT);
        com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        int remove = count == 0 ? objectCountHashMap.remove(element) : objectCountHashMap.put(element, count);
        this.size += count - remove;
        return remove;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(oldCount, "oldCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(newCount, "newCount");
        int indexOf = this.backingMap.indexOf(element);
        if (indexOf == -1) {
            if (oldCount != 0) {
                return false;
            }
            if (newCount > 0) {
                this.backingMap.put(element, newCount);
                this.size += newCount;
            }
            return true;
        }
        if (this.backingMap.getValue(indexOf) != oldCount) {
            return false;
        }
        if (newCount == 0) {
            this.backingMap.removeEntry(indexOf);
            this.size -= oldCount;
        } else {
            this.backingMap.setValue(indexOf, newCount);
            this.size += newCount - oldCount;
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    abstract class Itr<T> implements java.util.Iterator<T> {
        int entryIndex;
        int expectedModCount;
        int toRemove = -1;

        @com.google.common.collect.ParametricNullness
        abstract T result(int entryIndex);

        Itr() {
            this.entryIndex = com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.firstIndex();
            this.expectedModCount = com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        private void checkForConcurrentModification() {
            if (com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.modCount != this.expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.entryIndex >= 0;
        }

        @Override // java.util.Iterator
        @com.google.common.collect.ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T result = result(this.entryIndex);
            this.toRemove = this.entryIndex;
            this.entryIndex = com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.nextIndex(this.entryIndex);
            return result;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            com.google.common.collect.CollectPreconditions.checkRemove(this.toRemove != -1);
            com.google.common.collect.AbstractMapBasedMultiset.this.size -= com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.removeEntry(this.toRemove);
            this.entryIndex = com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.modCount;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<E> elementIterator() {
        return new com.google.common.collect.AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @com.google.common.collect.ParametricNullness
            E result(int entryIndex) {
                return com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.getKey(entryIndex);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        return new com.google.common.collect.AbstractMapBasedMultiset<E>.Itr<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public com.google.common.collect.Multiset.Entry<E> result(int entryIndex) {
                return com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.getEntry(entryIndex);
            }
        };
    }

    void addTo(com.google.common.collect.Multiset<? super E> multiset) {
        com.google.common.base.Preconditions.checkNotNull(multiset);
        int firstIndex = this.backingMap.firstIndex();
        while (firstIndex >= 0) {
            multiset.add(this.backingMap.getKey(firstIndex), this.backingMap.getValue(firstIndex));
            firstIndex = this.backingMap.nextIndex(firstIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int distinctElements() {
        return this.backingMap.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return com.google.common.primitives.Ints.saturatedCast(this.size);
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        com.google.common.collect.Serialization.writeMultiset(this, stream);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        stream.defaultReadObject();
        int readCount = com.google.common.collect.Serialization.readCount(stream);
        this.backingMap = newBackingMap(3);
        com.google.common.collect.Serialization.populateMultiset(this, stream, readCount);
    }
}
