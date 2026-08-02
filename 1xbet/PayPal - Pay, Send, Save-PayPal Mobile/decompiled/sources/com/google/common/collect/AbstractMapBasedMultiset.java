package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractMapBasedMultiset<E> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    transient com.google.common.collect.ObjectCountHashMap<E> backingMap;
    transient long size;

    abstract com.google.common.collect.ObjectCountHashMap<E> newBackingMap(int i);

    AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    @Override // com.google.common.collect.Multiset
    public final int count(java.lang.Object obj) {
        return this.backingMap.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        com.google.common.base.Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int indexOf = this.backingMap.indexOf(e);
        if (indexOf == -1) {
            this.backingMap.put(e, i);
            this.size += i;
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        long j = i;
        long j2 = value + j;
        com.google.common.base.Preconditions.checkArgument(j2 <= androidx.collection.SieveCacheKt.NodeLinkMask, "too many occurrences: %s", j2);
        this.backingMap.setValue(indexOf, (int) j2);
        this.size += j;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int remove(java.lang.Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        com.google.common.base.Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int indexOf = this.backingMap.indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        if (value > i) {
            this.backingMap.setValue(indexOf, value - i);
        } else {
            this.backingMap.removeEntry(indexOf);
            i = value;
        }
        this.size -= i;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int setCount(E e, int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
        com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        int remove = i == 0 ? objectCountHashMap.remove(e) : objectCountHashMap.put(e, i);
        this.size += i - remove;
        return remove;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(E e, int i, int i2) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "oldCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(i2, "newCount");
        int indexOf = this.backingMap.indexOf(e);
        if (indexOf == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.put(e, i2);
                this.size += i2;
            }
            return true;
        }
        if (this.backingMap.getValue(indexOf) != i) {
            return false;
        }
        if (i2 == 0) {
            this.backingMap.removeEntry(indexOf);
            this.size -= i;
        } else {
            this.backingMap.setValue(indexOf, i2);
            this.size += i2 - i;
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

        abstract T result(int i);

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
            E result(int i) {
                return com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.getKey(i);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        return new com.google.common.collect.AbstractMapBasedMultiset<E>.Itr<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public com.google.common.collect.Multiset.Entry<E> result(int i) {
                return com.google.common.collect.AbstractMapBasedMultiset.this.backingMap.getEntry(i);
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

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        com.google.common.collect.Serialization.writeMultiset(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readCount = com.google.common.collect.Serialization.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        com.google.common.collect.Serialization.populateMultiset(this, objectInputStream, readCount);
    }
}
