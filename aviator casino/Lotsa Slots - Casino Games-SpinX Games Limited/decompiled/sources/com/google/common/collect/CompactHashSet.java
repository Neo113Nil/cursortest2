package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
class CompactHashSet<E> extends java.util.AbstractSet<E> implements java.io.Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @javax.annotation.CheckForNull
    transient java.lang.Object[] elements;

    @javax.annotation.CheckForNull
    private transient int[] entries;
    private transient int metadata;
    private transient int size;

    @javax.annotation.CheckForNull
    private transient java.lang.Object table;

    int adjustAfterRemove(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
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
    public static <E> com.google.common.collect.CompactHashSet<E> create(E... elements) {
        com.google.common.collect.CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(elements.length);
        java.util.Collections.addAll(createWithExpectedSize, elements);
        return createWithExpectedSize;
    }

    public static <E> com.google.common.collect.CompactHashSet<E> createWithExpectedSize(int expectedSize) {
        return new com.google.common.collect.CompactHashSet<>(expectedSize);
    }

    CompactHashSet() {
        init(3);
    }

    CompactHashSet(int expectedSize) {
        init(expectedSize);
    }

    void init(int expectedSize) {
        com.google.common.base.Preconditions.checkArgument(expectedSize >= 0, "Expected size must be >= 0");
        this.metadata = com.google.common.primitives.Ints.constrainToRange(expectedSize, 1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
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

    @javax.annotation.CheckForNull
    java.util.Set<E> delegateOrNull() {
        java.lang.Object obj = this.table;
        if (obj instanceof java.util.Set) {
            return (java.util.Set) obj;
        }
        return null;
    }

    private java.util.Set<E> createHashFloodingResistantDelegate(int tableSize) {
        return new java.util.LinkedHashSet(tableSize, 1.0f);
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

    private void setHashTableMask(int mask) {
        this.metadata = com.google.common.collect.CompactHashing.maskCombine(this.metadata, 32 - java.lang.Integer.numberOfLeadingZeros(mask), 31);
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    void incrementModCount() {
        this.metadata += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@com.google.common.collect.ParametricNullness E object) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.add(object);
        }
        int[] requireEntries = requireEntries();
        java.lang.Object[] requireElements = requireElements();
        int i = this.size;
        int i2 = i + 1;
        int smearedHash = com.google.common.collect.Hashing.smearedHash(object);
        int hashTableMask = hashTableMask();
        int i3 = smearedHash & hashTableMask;
        int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), i3);
        if (tableGet != 0) {
            int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(smearedHash, hashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = tableGet - 1;
                int i6 = requireEntries[i5];
                if (com.google.common.collect.CompactHashing.getHashPrefix(i6, hashTableMask) == hashPrefix && com.google.common.base.Objects.equal(object, requireElements[i5])) {
                    return false;
                }
                int next = com.google.common.collect.CompactHashing.getNext(i6, hashTableMask);
                i4++;
                if (next != 0) {
                    tableGet = next;
                } else {
                    if (i4 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(object);
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
        insertEntry(i, object, smearedHash, hashTableMask);
        this.size = i2;
        incrementModCount();
        return true;
    }

    void insertEntry(int entryIndex, @com.google.common.collect.ParametricNullness E object, int hash, int mask) {
        setEntry(entryIndex, com.google.common.collect.CompactHashing.maskCombine(hash, 0, mask));
        setElement(entryIndex, object);
    }

    private void resizeMeMaybe(int newSize) {
        int min;
        int length = requireEntries().length;
        if (newSize <= length || (min = java.lang.Math.min(kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (java.lang.Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(min);
    }

    void resizeEntries(int newCapacity) {
        this.entries = java.util.Arrays.copyOf(requireEntries(), newCapacity);
        this.elements = java.util.Arrays.copyOf(requireElements(), newCapacity);
    }

    private int resizeTable(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        java.lang.Object createTable = com.google.common.collect.CompactHashing.createTable(newCapacity);
        int i = newCapacity - 1;
        if (targetEntryIndex != 0) {
            com.google.common.collect.CompactHashing.tableSet(createTable, targetHash & i, targetEntryIndex + 1);
        }
        java.lang.Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i2 = 0; i2 <= oldMask; i2++) {
            int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable, i2);
            while (tableGet != 0) {
                int i3 = tableGet - 1;
                int i4 = requireEntries[i3];
                int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(i4, oldMask) | i2;
                int i5 = hashPrefix & i;
                int tableGet2 = com.google.common.collect.CompactHashing.tableGet(createTable, i5);
                com.google.common.collect.CompactHashing.tableSet(createTable, i5, tableGet);
                requireEntries[i3] = com.google.common.collect.CompactHashing.maskCombine(hashPrefix, tableGet2, i);
                tableGet = com.google.common.collect.CompactHashing.getNext(i4, oldMask);
            }
        }
        this.table = createTable;
        setHashTableMask(i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        if (needsAllocArrays()) {
            return false;
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.contains(object);
        }
        int smearedHash = com.google.common.collect.Hashing.smearedHash(object);
        int hashTableMask = hashTableMask();
        int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), smearedHash & hashTableMask);
        if (tableGet == 0) {
            return false;
        }
        int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(smearedHash, hashTableMask);
        do {
            int i = tableGet - 1;
            int entry = entry(i);
            if (com.google.common.collect.CompactHashing.getHashPrefix(entry, hashTableMask) == hashPrefix && com.google.common.base.Objects.equal(object, element(i))) {
                return true;
            }
            tableGet = com.google.common.collect.CompactHashing.getNext(entry, hashTableMask);
        } while (tableGet != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@javax.annotation.CheckForNull java.lang.Object object) {
        if (needsAllocArrays()) {
            return false;
        }
        java.util.Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(object);
        }
        int hashTableMask = hashTableMask();
        int remove = com.google.common.collect.CompactHashing.remove(object, null, hashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (remove == -1) {
            return false;
        }
        moveLastEntry(remove, hashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    void moveLastEntry(int dstIndex, int mask) {
        java.lang.Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        java.lang.Object[] requireElements = requireElements();
        int size = size();
        int i = size - 1;
        if (dstIndex < i) {
            java.lang.Object obj = requireElements[i];
            requireElements[dstIndex] = obj;
            requireElements[i] = null;
            requireEntries[dstIndex] = requireEntries[i];
            requireEntries[i] = 0;
            int smearedHash = com.google.common.collect.Hashing.smearedHash(obj) & mask;
            int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable, smearedHash);
            if (tableGet == size) {
                com.google.common.collect.CompactHashing.tableSet(requireTable, smearedHash, dstIndex + 1);
                return;
            }
            while (true) {
                int i2 = tableGet - 1;
                int i3 = requireEntries[i2];
                int next = com.google.common.collect.CompactHashing.getNext(i3, mask);
                if (next == size) {
                    requireEntries[i2] = com.google.common.collect.CompactHashing.maskCombine(i3, dstIndex + 1, mask);
                    return;
                }
                tableGet = next;
            }
        } else {
            requireElements[dstIndex] = null;
            requireEntries[dstIndex] = 0;
        }
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    int getSuccessor(int entryIndex) {
        int i = entryIndex + 1;
        if (i < this.size) {
            return i;
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
            @com.google.common.collect.ParametricNullness
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

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        if (readInt < 0) {
            throw new java.io.InvalidObjectException("Invalid size: " + readInt);
        }
        init(readInt);
        for (int i = 0; i < readInt; i++) {
            add(stream.readObject());
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

    private void setElement(int i, E value) {
        requireElements()[i] = value;
    }

    private void setEntry(int i, int value) {
        requireEntries()[i] = value;
    }
}
