package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableList.of or another implementation")
/* loaded from: classes4.dex */
public abstract class ImmutableCollection<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private static final java.lang.Object[] EMPTY_ARRAY = new java.lang.Object[0];
    static final int SPLITERATOR_CHARACTERISTICS = 1296;
    private static final long serialVersionUID = 912559;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(java.lang.Object obj);

    java.lang.Object[] internalArray() {
        return null;
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    ImmutableCollection() {
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Spliterator<E> spliterator() {
        return java.util.Spliterators.spliterator(this, SPLITERATOR_CHARACTERISTICS);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.google.common.base.Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            java.lang.Object[] internalArray = internalArray();
            if (internalArray != null) {
                return (T[]) com.google.common.collect.Platform.copy(internalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) com.google.common.collect.ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }

    int internalArrayStart() {
        throw new java.lang.UnsupportedOperationException();
    }

    int internalArrayEnd() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public com.google.common.collect.ImmutableList<E> asList() {
        return isEmpty() ? com.google.common.collect.ImmutableList.of() : com.google.common.collect.ImmutableList.asImmutableList(toArray());
    }

    int copyIntoArray(java.lang.Object[] objArr, int i) {
        com.google.common.collect.UnmodifiableIterator<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableList.SerializedForm(toArray());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @com.google.errorprone.annotations.DoNotMock
    public static abstract class Builder<E> {
        static final int DEFAULT_INITIAL_CAPACITY = 4;

        public abstract com.google.common.collect.ImmutableCollection.Builder<E> add(E e);

        public abstract com.google.common.collect.ImmutableCollection<E> build();

        static int expandedCapacity(int i, int i2) {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
            }
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = java.lang.Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        Builder() {
        }

        public com.google.common.collect.ImmutableCollection.Builder<E> add(E... eArr) {
            for (E e : eArr) {
                add((com.google.common.collect.ImmutableCollection.Builder<E>) e);
            }
            return this;
        }

        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.lang.Iterable<? extends E> iterable) {
            java.util.Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                add((com.google.common.collect.ImmutableCollection.Builder<E>) it.next());
            }
            return this;
        }

        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.util.Iterator<? extends E> it) {
            while (it.hasNext()) {
                add((com.google.common.collect.ImmutableCollection.Builder<E>) it.next());
            }
            return this;
        }
    }

    static abstract class ArrayBasedBuilder<E> extends com.google.common.collect.ImmutableCollection.Builder<E> {
        java.lang.Object[] contents;
        boolean forceCopy;
        int size;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E>) obj);
        }

        ArrayBasedBuilder(int i) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(i, "initialCapacity");
            this.contents = new java.lang.Object[i];
            this.size = 0;
        }

        private void ensureRoomFor(int i) {
            java.lang.Object[] objArr = this.contents;
            int expandedCapacity = expandedCapacity(objArr.length, this.size + i);
            if (expandedCapacity > objArr.length || this.forceCopy) {
                this.contents = java.util.Arrays.copyOf(this.contents, expandedCapacity);
                this.forceCopy = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> add(E e) {
            com.google.common.base.Preconditions.checkNotNull(e);
            ensureRoomFor(1);
            java.lang.Object[] objArr = this.contents;
            int i = this.size;
            this.size = i + 1;
            objArr[i] = e;
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableCollection.Builder<E> add(E... eArr) {
            addAll(eArr, eArr.length);
            return this;
        }

        final void addAll(java.lang.Object[] objArr, int i) {
            com.google.common.collect.ObjectArrays.checkElementsNotNull(objArr, i);
            ensureRoomFor(i);
            java.lang.System.arraycopy(objArr, 0, this.contents, this.size, i);
            this.size += i;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableCollection.Builder<E> addAll(java.lang.Iterable<? extends E> iterable) {
            if (iterable instanceof java.util.Collection) {
                java.util.Collection collection = (java.util.Collection) iterable;
                ensureRoomFor(collection.size());
                if (collection instanceof com.google.common.collect.ImmutableCollection) {
                    this.size = ((com.google.common.collect.ImmutableCollection) collection).copyIntoArray(this.contents, this.size);
                    return this;
                }
            }
            super.addAll(iterable);
            return this;
        }
    }
}
