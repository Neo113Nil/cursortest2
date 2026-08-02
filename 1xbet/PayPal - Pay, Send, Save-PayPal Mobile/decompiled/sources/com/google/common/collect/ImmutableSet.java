package com.google.common.collect;

/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends com.google.common.collect.ImmutableCollection<E> implements java.util.Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableList<E> asList;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract com.google.common.collect.UnmodifiableIterator<E> iterator();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    public static <E> java.util.stream.Collector<E, ?, com.google.common.collect.ImmutableSet<E>> toImmutableSet() {
        return com.google.common.collect.CollectCollectors.toImmutableSet();
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of() {
        return com.google.common.collect.RegularImmutableSet.EMPTY;
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e) {
        return new com.google.common.collect.SingletonImmutableSet(e);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.ImmutableSet<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        com.google.common.base.Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        java.lang.Object[] objArr = new java.lang.Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        java.lang.System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> com.google.common.collect.ImmutableSet<E> construct(int i, java.lang.Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return of(java.util.Objects.requireNonNull(objArr[0]));
            }
            int chooseTableSize = chooseTableSize(i);
            java.lang.Object[] objArr2 = new java.lang.Object[chooseTableSize];
            int i2 = chooseTableSize - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                java.lang.Object checkElementNotNull = com.google.common.collect.ObjectArrays.checkElementNotNull(objArr[i5], i5);
                int hashCode = checkElementNotNull.hashCode();
                int smear = com.google.common.collect.Hashing.smear(hashCode);
                while (true) {
                    int i6 = smear & i2;
                    java.lang.Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = checkElementNotNull;
                        objArr2[i6] = checkElementNotNull;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (obj.equals(checkElementNotNull)) {
                        break;
                    }
                    smear++;
                }
            }
            java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
            if (i4 == 1) {
                return new com.google.common.collect.SingletonImmutableSet(java.util.Objects.requireNonNull(objArr[0]));
            }
            if (chooseTableSize(i4) >= chooseTableSize / 2) {
                if (shouldTrim(i4, objArr.length)) {
                    objArr = java.util.Arrays.copyOf(objArr, i4);
                }
                return new com.google.common.collect.RegularImmutableSet(objArr, i3, objArr2, i2, i4);
            }
            i = i4;
        }
        return of();
    }

    static int chooseTableSize(int i) {
        int max = java.lang.Math.max(i, 2);
        if (max < CUTOFF) {
            int highestOneBit = java.lang.Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * DESIRED_LOAD_FACTOR < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        com.google.common.base.Preconditions.checkArgument(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Collection<? extends E> collection) {
        if ((collection instanceof com.google.common.collect.ImmutableSet) && !(collection instanceof java.util.SortedSet)) {
            com.google.common.collect.ImmutableSet<E> immutableSet = (com.google.common.collect.ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.lang.Iterable<? extends E> iterable) {
        if (iterable instanceof java.util.Collection) {
            return copyOf((java.util.Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(java.util.Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((java.lang.Object) next);
        }
        return new com.google.common.collect.ImmutableSet.Builder().add((com.google.common.collect.ImmutableSet.Builder) next).addAll((java.util.Iterator) it).build();
    }

    public static <E> com.google.common.collect.ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length == 1) {
            return of((java.lang.Object) eArr[0]);
        }
        return construct(eArr.length, (java.lang.Object[]) eArr.clone());
    }

    ImmutableSet() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.common.collect.ImmutableSet) && isHashCodeFast() && ((com.google.common.collect.ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return com.google.common.collect.Sets.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public com.google.common.collect.ImmutableList<E> asList() {
        com.google.common.collect.ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        com.google.common.collect.ImmutableList<E> createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    com.google.common.collect.ImmutableList<E> createAsList() {
        return com.google.common.collect.ImmutableList.asImmutableList(toArray());
    }

    /* loaded from: classes9.dex */
    static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.lang.Object[] elements;

        SerializedForm(java.lang.Object[] objArr) {
            this.elements = objArr;
        }

        final java.lang.Object readResolve() {
            return com.google.common.collect.ImmutableSet.copyOf(this.elements);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableSet.SerializedForm(toArray());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static <E> com.google.common.collect.ImmutableSet.Builder<E> builder() {
        return new com.google.common.collect.ImmutableSet.Builder<>();
    }

    public static <E> com.google.common.collect.ImmutableSet.Builder<E> builderWithExpectedSize(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "expectedSize");
        return new com.google.common.collect.ImmutableSet.Builder<>(i, true);
    }

    /* loaded from: classes9.dex */
    public static class Builder<E> extends com.google.common.collect.ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;
        java.lang.Object[] hashTable;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.ArrayBasedBuilder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableSet.Builder<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableCollection.Builder add(java.lang.Object obj) {
            return add((com.google.common.collect.ImmutableSet.Builder<E>) obj);
        }

        public Builder() {
            super(4);
        }

        Builder(int i, boolean z) {
            super(i);
            if (z) {
                this.hashTable = new java.lang.Object[com.google.common.collect.ImmutableSet.chooseTableSize(i)];
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> add(E e) {
            com.google.common.base.Preconditions.checkNotNull(e);
            if (this.hashTable != null && com.google.common.collect.ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(e);
                return this;
            }
            this.hashTable = null;
            super.add((com.google.common.collect.ImmutableSet.Builder<E>) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> add(E... eArr) {
            if (this.hashTable != null) {
                for (E e : eArr) {
                    add((com.google.common.collect.ImmutableSet.Builder<E>) e);
                }
                return this;
            }
            super.add((java.lang.Object[]) eArr);
            return this;
        }

        private void addDeduping(E e) {
            java.util.Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length;
            int hashCode = e.hashCode();
            int smear = com.google.common.collect.Hashing.smear(hashCode);
            while (true) {
                int i = smear & (length - 1);
                java.lang.Object[] objArr = this.hashTable;
                java.lang.Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.hashCode += hashCode;
                    super.add((com.google.common.collect.ImmutableSet.Builder<E>) e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    smear = i + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> addAll(java.lang.Iterable<? extends E> iterable) {
            com.google.common.base.Preconditions.checkNotNull(iterable);
            if (this.hashTable != null) {
                java.util.Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((com.google.common.collect.ImmutableSet.Builder<E>) it.next());
                }
                return this;
            }
            super.addAll((java.lang.Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet.Builder<E> addAll(java.util.Iterator<? extends E> it) {
            com.google.common.base.Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add((com.google.common.collect.ImmutableSet.Builder<E>) it.next());
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        com.google.common.collect.ImmutableSet.Builder<E> combine(com.google.common.collect.ImmutableSet.Builder<E> builder) {
            if (this.hashTable != null) {
                for (int i = 0; i < builder.size; i++) {
                    add((com.google.common.collect.ImmutableSet.Builder<E>) java.util.Objects.requireNonNull(builder.contents[i]));
                }
                return this;
            }
            addAll(builder.contents, builder.size);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public com.google.common.collect.ImmutableSet<E> build() {
            com.google.common.collect.ImmutableSet<E> construct;
            int i = this.size;
            if (i == 0) {
                return com.google.common.collect.ImmutableSet.of();
            }
            if (i == 1) {
                return com.google.common.collect.ImmutableSet.of(java.util.Objects.requireNonNull(this.contents[0]));
            }
            if (this.hashTable == null || com.google.common.collect.ImmutableSet.chooseTableSize(this.size) != this.hashTable.length) {
                construct = com.google.common.collect.ImmutableSet.construct(this.size, this.contents);
                this.size = construct.size();
            } else {
                java.lang.Object[] copyOf = com.google.common.collect.ImmutableSet.shouldTrim(this.size, this.contents.length) ? java.util.Arrays.copyOf(this.contents, this.size) : this.contents;
                construct = new com.google.common.collect.RegularImmutableSet<>(copyOf, this.hashCode, this.hashTable, r5.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return construct;
        }
    }
}
