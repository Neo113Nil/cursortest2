package com.google.common.collect;

/* loaded from: classes9.dex */
class CompactHashSet<E> extends java.util.AbstractSet<E> implements java.io.Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    transient java.lang.Object[] elements;
    private transient int[] entries;
    private transient int metadata;
    private transient int size;
    private transient java.lang.Object table;

    int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public static <E> com.google.common.collect.CompactHashSet<E> create() {
        return new com.google.common.collect.CompactHashSet<>();
    }

    public static <E> com.google.common.collect.CompactHashSet<E> create(java.util.Collection<? extends E> collection) {
        com.google.common.collect.CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    @java.lang.SafeVarargs
    public static <E> com.google.common.collect.CompactHashSet<E> create(E... eArr) {
        com.google.common.collect.CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        java.util.Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }

    public static <E> com.google.common.collect.CompactHashSet<E> createWithExpectedSize(int i) {
        return new com.google.common.collect.CompactHashSet<>(i);
    }

    CompactHashSet() {
        init(3);
    }

    CompactHashSet(int i) {
        init(i);
    }

    void init(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0, "Expected size must be >= 0");
        this.metadata = com.google.common.primitives.Ints.constrainToRange(i, 1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    boolean needsAllocArrays() {
        return this.table == null;
    }

    int allocArrays() {
        com.google.common.base.Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int tableSize = com.google.common.collect.CompactHashing.tableSize(i);
        this.table = com.google.common.collect.CompactHashing.createTable(tableSize);
        setHashTableMask(tableSize - 1);
        this.entries = new int[i];
        this.elements = new java.lang.Object[i];
        return i;
    }

    java.util.Set<E> delegateOrNull() {
        java.lang.Object obj = this.table;
        if (obj instanceof java.util.Set) {
            return (java.util.Set) obj;
        }
        return null;
    }

    private java.util.Set<E> createHashFloodingResistantDelegate(int i) {
        return new java.util.LinkedHashSet(i, 1.0f);
    }

    java.util.Set<E> convertToHashFloodingResistantImplementation() {
        java.util.Set<E> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.add(element(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    private void setHashTableMask(int i) {
        this.metadata = com.google.common.collect.CompactHashing.maskCombine(this.metadata, 32 - java.lang.Integer.numberOfLeadingZeros(i), 31);
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    void incrementModCount() {
        this.metadata += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.add(e);
        }
        int[] requireEntries = requireEntries();
        java.lang.Object[] requireElements = requireElements();
        int i = this.size;
        int i2 = i + 1;
        int smearedHash = com.google.common.collect.Hashing.smearedHash(e);
        int hashTableMask = hashTableMask();
        int i3 = smearedHash & hashTableMask;
        int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), i3);
        if (tableGet != 0) {
            int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(smearedHash, hashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = tableGet - 1;
                int i6 = requireEntries[i5];
                if (com.google.common.collect.CompactHashing.getHashPrefix(i6, hashTableMask) == hashPrefix && java.util.Objects.equals(e, requireElements[i5])) {
                    return false;
                }
                int next = com.google.common.collect.CompactHashing.getNext(i6, hashTableMask);
                i4++;
                if (next != 0) {
                    tableGet = next;
                } else {
                    if (i4 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e);
                    }
                    if (i2 > hashTableMask) {
                        hashTableMask = resizeTable(hashTableMask, com.google.common.collect.CompactHashing.newCapacity(hashTableMask), smearedHash, i);
                    } else {
                        requireEntries[i5] = com.google.common.collect.CompactHashing.maskCombine(i6, i2, hashTableMask);
                    }
                }
            }
        } else if (i2 > hashTableMask) {
            hashTableMask = resizeTable(hashTableMask, com.google.common.collect.CompactHashing.newCapacity(hashTableMask), smearedHash, i);
        } else {
            com.google.common.collect.CompactHashing.tableSet(requireTable(), i3, i2);
        }
        resizeMeMaybe(i2);
        insertEntry(i, e, smearedHash, hashTableMask);
        this.size = i2;
        incrementModCount();
        return true;
    }

    void insertEntry(int i, E e, int i2, int i3) {
        setEntry(i, com.google.common.collect.CompactHashing.maskCombine(i2, 0, i3));
        setElement(i, e);
    }

    private void resizeMeMaybe(int i) {
        int min;
        int length = requireEntries().length;
        if (i <= length || (min = java.lang.Math.min(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (java.lang.Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(min);
    }

    void resizeEntries(int i) {
        this.entries = java.util.Arrays.copyOf(requireEntries(), i);
        this.elements = java.util.Arrays.copyOf(requireElements(), i);
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        java.lang.Object createTable = com.google.common.collect.CompactHashing.createTable(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            com.google.common.collect.CompactHashing.tableSet(createTable, i3 & i5, i4 + 1);
        }
        java.lang.Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable, i6);
            while (tableGet != 0) {
                int i7 = tableGet - 1;
                int i8 = requireEntries[i7];
                int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(i8, i) | i6;
                int i9 = hashPrefix & i5;
                int tableGet2 = com.google.common.collect.CompactHashing.tableGet(createTable, i9);
                com.google.common.collect.CompactHashing.tableSet(createTable, i9, tableGet);
                requireEntries[i7] = com.google.common.collect.CompactHashing.maskCombine(hashPrefix, tableGet2, i5);
                tableGet = com.google.common.collect.CompactHashing.getNext(i8, i);
            }
        }
        this.table = createTable;
        setHashTableMask(i5);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.contains(obj);
        }
        int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
        int hashTableMask = hashTableMask();
        int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), smearedHash & hashTableMask);
        if (tableGet == 0) {
            return false;
        }
        int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(smearedHash, hashTableMask);
        do {
            int i = tableGet - 1;
            int entry = entry(i);
            if (com.google.common.collect.CompactHashing.getHashPrefix(entry, hashTableMask) == hashPrefix && java.util.Objects.equals(obj, element(i))) {
                return true;
            }
            tableGet = com.google.common.collect.CompactHashing.getNext(entry, hashTableMask);
        } while (tableGet != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        int hashTableMask = hashTableMask();
        int remove = com.google.common.collect.CompactHashing.remove(obj, null, hashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (remove == -1) {
            return false;
        }
        moveLastEntry(remove, hashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    void moveLastEntry(int i, int i2) {
        java.lang.Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        java.lang.Object[] requireElements = requireElements();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            java.lang.Object obj = requireElements[i3];
            requireElements[i] = obj;
            requireElements[i3] = null;
            requireEntries[i] = requireEntries[i3];
            requireEntries[i3] = 0;
            int smearedHash = com.google.common.collect.Hashing.smearedHash(obj) & i2;
            int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable, smearedHash);
            if (tableGet == size) {
                com.google.common.collect.CompactHashing.tableSet(requireTable, smearedHash, i + 1);
                return;
            }
            while (true) {
                int i4 = tableGet - 1;
                int i5 = requireEntries[i4];
                int next = com.google.common.collect.CompactHashing.getNext(i5, i2);
                if (next == size) {
                    requireEntries[i4] = com.google.common.collect.CompactHashing.maskCombine(i5, i + 1, i2);
                    return;
                }
                tableGet = next;
            }
        } else {
            requireElements[i] = null;
            requireEntries[i] = 0;
        }
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new java.util.Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1
            int currentIndex;
            int expectedMetadata;
            int indexToRemove = -1;

            {
                this.expectedMetadata = com.google.common.collect.CompactHashSet.this.metadata;
                this.currentIndex = com.google.common.collect.CompactHashSet.this.firstEntryIndex();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex >= 0;
            }

            @Override // java.util.Iterator
            public E next() {
                checkForConcurrentModification();
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int i = this.currentIndex;
                this.indexToRemove = i;
                E e = (E) com.google.common.collect.CompactHashSet.this.element(i);
                this.currentIndex = com.google.common.collect.CompactHashSet.this.getSuccessor(this.currentIndex);
                return e;
            }

            @Override // java.util.Iterator
            public void remove() {
                checkForConcurrentModification();
                com.google.common.collect.CollectPreconditions.checkRemove(this.indexToRemove >= 0);
                incrementExpectedModCount();
                com.google.common.collect.CompactHashSet compactHashSet = com.google.common.collect.CompactHashSet.this;
                compactHashSet.remove(compactHashSet.element(this.indexToRemove));
                this.currentIndex = com.google.common.collect.CompactHashSet.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
                this.indexToRemove = -1;
            }

            void incrementExpectedModCount() {
                this.expectedMetadata += 32;
            }

            private void checkForConcurrentModification() {
                if (com.google.common.collect.CompactHashSet.this.metadata != this.expectedMetadata) {
                    throw new java.util.ConcurrentModificationException();
                }
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        java.util.Set<E> delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
        if (needsAllocArrays()) {
            return new java.lang.Object[0];
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.toArray() : java.util.Arrays.copyOf(requireElements(), this.size);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return (T[]) delegateOrNull.toArray(tArr);
        }
        return (T[]) com.google.common.collect.ObjectArrays.toArrayImpl(requireElements(), 0, this.size, tArr);
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            java.util.Set<E> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            createHashFloodingResistantDelegate.addAll(delegateOrNull);
            this.table = createHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int tableSize = com.google.common.collect.CompactHashing.tableSize(i);
        int hashTableMask = hashTableMask();
        if (tableSize < hashTableMask) {
            resizeTable(hashTableMask, tableSize, 0, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            this.metadata = com.google.common.primitives.Ints.constrainToRange(size(), 3, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            delegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        java.util.Arrays.fill(requireElements(), 0, this.size, (java.lang.Object) null);
        com.google.common.collect.CompactHashing.tableClear(requireTable());
        java.util.Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new java.io.InvalidObjectException("Invalid size: ".concat(java.lang.String.valueOf(readInt)));
        }
        init(readInt);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private java.lang.Object requireTable() {
        return java.util.Objects.requireNonNull(this.table);
    }

    private int[] requireEntries() {
        return (int[]) java.util.Objects.requireNonNull(this.entries);
    }

    private java.lang.Object[] requireElements() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i) {
        return (E) requireElements()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private void setElement(int i, E e) {
        requireElements()[i] = e;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }
}
