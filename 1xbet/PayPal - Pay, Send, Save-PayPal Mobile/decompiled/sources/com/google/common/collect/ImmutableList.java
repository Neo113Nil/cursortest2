package com.google.common.collect;

/* loaded from: classes4.dex */
public abstract class ImmutableList<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.List<E>, java.util.RandomAccess {
    private static final com.google.common.collect.UnmodifiableListIterator<java.lang.Object> EMPTY_ITR = new com.google.common.collect.ImmutableList.Itr(com.google.common.collect.RegularImmutableList.EMPTY, 0);
    private static final long serialVersionUID = -889275714;

    @Override // com.google.common.collect.ImmutableCollection
    @java.lang.Deprecated
    public final com.google.common.collect.ImmutableList<E> asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableList<E>> toImmutableList() {
        return com.google.common.collect.CollectCollectors.toImmutableList();
    }

    public static <E> com.google.common.collect.ImmutableList<E> of() {
        return (com.google.common.collect.ImmutableList<E>) com.google.common.collect.RegularImmutableList.EMPTY;
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e) {
        return construct(e);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2) {
        return construct(e, e2);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3) {
        return construct(e, e2, e3);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4) {
        return construct(e, e2, e3, e4);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(e, e2, e3, e4, e5);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5, E e6) {
        return construct(e, e2, e3, e4, e5, e6);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e, e2, e3, e4, e5, e6, e7);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableList<E> of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        com.google.common.base.Preconditions.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        java.lang.Object[] objArr = new java.lang.Object[eArr.length + 12];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        java.lang.System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return construct(objArr);
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.lang.Iterable<? extends E> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        if (iterable instanceof java.util.Collection) {
            return copyOf((java.util.Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Collection<? extends E> collection) {
        if (collection instanceof com.google.common.collect.ImmutableCollection) {
            com.google.common.collect.ImmutableList<E> asList = ((com.google.common.collect.ImmutableCollection) collection).asList();
            return asList.isPartialView() ? asImmutableList(asList.toArray()) : asList;
        }
        return construct(collection.toArray());
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(java.util.Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((java.lang.Object) next);
        }
        return new com.google.common.collect.ImmutableList.Builder().add((com.google.common.collect.ImmutableList.Builder) next).addAll((java.util.Iterator) it).build();
    }

    public static <E> com.google.common.collect.ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return construct((java.lang.Object[]) eArr.clone());
    }

    public static <E extends java.lang.Comparable<? super E>> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.lang.Iterable<? extends E> iterable) {
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) com.google.common.collect.Iterables.toArray(iterable, new java.lang.Comparable[0]);
        com.google.common.collect.ObjectArrays.checkElementsNotNull(comparableArr);
        java.util.Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    public static <E> com.google.common.collect.ImmutableList<E> sortedCopyOf(java.util.Comparator<? super E> comparator, java.lang.Iterable<? extends E> iterable) {
        com.google.common.base.Preconditions.checkNotNull(comparator);
        java.lang.Object[] array = com.google.common.collect.Iterables.toArray(iterable);
        com.google.common.collect.ObjectArrays.checkElementsNotNull(array);
        java.util.Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    private static <E> com.google.common.collect.ImmutableList<E> construct(java.lang.Object... objArr) {
        return asImmutableList(com.google.common.collect.ObjectArrays.checkElementsNotNull(objArr));
    }

    static <E> com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    static <E> com.google.common.collect.ImmutableList<E> asImmutableList(java.lang.Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        return new com.google.common.collect.RegularImmutableList(objArr, i);
    }

    ImmutableList() {
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public com.google.common.collect.UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int i) {
        com.google.common.base.Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return (com.google.common.collect.UnmodifiableListIterator<E>) EMPTY_ITR;
        }
        return new com.google.common.collect.ImmutableList.Itr(this, i);
    }

    static final class Itr<E> extends com.google.common.collect.AbstractIndexedListIterator<E> {
        private final com.google.common.collect.ImmutableList<E> list;

        Itr(com.google.common.collect.ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.list = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected final E get(int i) {
            return this.list.get(i);
        }
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return com.google.common.collect.Lists.indexOfImpl(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return com.google.common.collect.Lists.lastIndexOfImpl(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public com.google.common.collect.ImmutableList<E> subList(int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return subListUnchecked(i, i2);
    }

    com.google.common.collect.ImmutableList<E> subListUnchecked(int i, int i2) {
        return new com.google.common.collect.ImmutableList.SubList(i, i2 - i);
    }

    final class SubList extends com.google.common.collect.ImmutableList<E> {
        final transient int length;
        final transient int offset;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
            return subList(i, i2);
        }

        SubList(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.length;
        }

        @Override // com.google.common.collect.ImmutableCollection
        final java.lang.Object[] internalArray() {
            return com.google.common.collect.ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int internalArrayStart() {
            return com.google.common.collect.ImmutableList.this.internalArrayStart() + this.offset;
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int internalArrayEnd() {
            return com.google.common.collect.ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        @Override // java.util.List
        public final E get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, this.length);
            return com.google.common.collect.ImmutableList.this.get(i + this.offset);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final com.google.common.collect.ImmutableList<E> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, this.length);
            com.google.common.collect.ImmutableList immutableList = com.google.common.collect.ImmutableList.this;
            int i3 = this.offset;
            return immutableList.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int copyIntoArray(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public com.google.common.collect.ImmutableList<E> reverse() {
        return size() <= 1 ? this : new com.google.common.collect.ImmutableList.ReverseImmutableList(this);
    }

    static final class ReverseImmutableList<E> extends com.google.common.collect.ImmutableList<E> {
        private final transient com.google.common.collect.ImmutableList<E> forwardList;

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
            return subList(i, i2);
        }

        ReverseImmutableList(com.google.common.collect.ImmutableList<E> immutableList) {
            this.forwardList = immutableList;
        }

        private int reverseIndex(int i) {
            return (size() - 1) - i;
        }

        private int reversePosition(int i) {
            return size() - i;
        }

        @Override // com.google.common.collect.ImmutableList
        public final com.google.common.collect.ImmutableList<E> reverse() {
            return this.forwardList;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return this.forwardList.contains(obj);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            int lastIndexOf = this.forwardList.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return reverseIndex(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            int indexOf = this.forwardList.indexOf(obj);
            if (indexOf >= 0) {
                return reverseIndex(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final com.google.common.collect.ImmutableList<E> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            return this.forwardList.subList(reversePosition(i2), reversePosition(i)).reverse();
        }

        @Override // java.util.List
        public final E get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return this.forwardList.get(reverseIndex(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.forwardList.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return this.forwardList.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        return com.google.common.collect.Lists.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    /* loaded from: classes9.dex */
    static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.lang.Object[] elements;

        SerializedForm(java.lang.Object[] objArr) {
            this.elements = objArr;
        }

        final java.lang.Object readResolve() {
            return com.google.common.collect.ImmutableList.copyOf(this.elements);
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableList.SerializedForm(toArray());
    }

    public static <E> com.google.common.collect.ImmutableList.Builder<E> builder() {
        return new com.google.common.collect.ImmutableList.Builder<>();
    }

    public static <E> com.google.common.collect.ImmutableList.Builder<E> builderWithExpectedSize(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new com.google.common.collect.ImmutableList.Builder<>(i);
    }

    public static final class Builder<E> extends com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.ArrayBasedBuilder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableList.Builder<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableList.Builder<E>) obj);
        }

        public Builder() {
            this(4);
        }

        Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public final com.google.common.collect.ImmutableList.Builder<E> add(E e) {
            super.add((com.google.common.collect.ImmutableList.Builder<E>) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public final com.google.common.collect.ImmutableList.Builder<E> add(E... eArr) {
            super.add((java.lang.Object[]) eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public final com.google.common.collect.ImmutableList.Builder<E> addAll(java.lang.Iterable<? extends E> iterable) {
            super.addAll((java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public final com.google.common.collect.ImmutableList.Builder<E> addAll(java.util.Iterator<? extends E> it) {
            super.addAll((java.util.Iterator) it);
            return this;
        }

        final com.google.common.collect.ImmutableList.Builder<E> combine(com.google.common.collect.ImmutableList.Builder<E> builder) {
            addAll(builder.contents, builder.size);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public final com.google.common.collect.ImmutableList<E> build() {
            this.forceCopy = true;
            return com.google.common.collect.ImmutableList.asImmutableList(this.contents, this.size);
        }

        final com.google.common.collect.ImmutableList<E> buildSorted(java.util.Comparator<? super E> comparator) {
            this.forceCopy = true;
            java.util.Arrays.sort(this.contents, 0, this.size, comparator);
            return com.google.common.collect.ImmutableList.asImmutableList(this.contents, this.size);
        }
    }
}
