package com.google.common.collect;

/* loaded from: classes9.dex */
class CompactHashMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final java.lang.Object NOT_FOUND = new java.lang.Object();
    transient int[] entries;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySetView;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySetView;
    transient java.lang.Object[] keys;
    private transient int metadata;
    private transient int size;
    private transient java.lang.Object table;
    transient java.lang.Object[] values;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Collection<V> valuesView;

    void accessEntry(int i) {
    }

    int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    static /* synthetic */ int access$1410(com.google.common.collect.CompactHashMap compactHashMap) {
        int i = compactHashMap.size;
        compactHashMap.size = i - 1;
        return i;
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> create() {
        return new com.google.common.collect.CompactHashMap<>();
    }

    public static <K, V> com.google.common.collect.CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new com.google.common.collect.CompactHashMap<>(i);
    }

    CompactHashMap() {
        init(3);
    }

    CompactHashMap(int i) {
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
        this.keys = new java.lang.Object[i];
        this.values = new java.lang.Object[i];
        return i;
    }

    java.util.Map<K, V> delegateOrNull() {
        java.lang.Object obj = this.table;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    java.util.Map<K, V> createHashFloodingResistantDelegate(int i) {
        return new java.util.LinkedHashMap(i, 1.0f);
    }

    java.util.Map<K, V> convertToHashFloodingResistantImplementation() {
        java.util.Map<K, V> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.put(key(firstEntryIndex), value(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    private void setHashTableMask(int i) {
        this.metadata = com.google.common.collect.CompactHashing.maskCombine(this.metadata, 32 - java.lang.Integer.numberOfLeadingZeros(i), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    void incrementModCount() {
        this.metadata += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        int resizeTable;
        int i;
        if (needsAllocArrays()) {
            allocArrays();
        }
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(k, v);
        }
        int[] requireEntries = requireEntries();
        java.lang.Object[] requireKeys = requireKeys();
        java.lang.Object[] requireValues = requireValues();
        int i2 = this.size;
        int i3 = i2 + 1;
        int smearedHash = com.google.common.collect.Hashing.smearedHash(k);
        int hashTableMask = hashTableMask();
        int i4 = smearedHash & hashTableMask;
        int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), i4);
        if (tableGet != 0) {
            int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(smearedHash, hashTableMask);
            int i5 = 0;
            while (true) {
                int i6 = tableGet - 1;
                int i7 = requireEntries[i6];
                if (com.google.common.collect.CompactHashing.getHashPrefix(i7, hashTableMask) == hashPrefix && java.util.Objects.equals(k, requireKeys[i6])) {
                    V v2 = (V) requireValues[i6];
                    requireValues[i6] = v;
                    accessEntry(i6);
                    return v2;
                }
                int next = com.google.common.collect.CompactHashing.getNext(i7, hashTableMask);
                i5++;
                if (next != 0) {
                    tableGet = next;
                } else {
                    if (i5 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k, v);
                    }
                    if (i3 > hashTableMask) {
                        resizeTable = resizeTable(hashTableMask, com.google.common.collect.CompactHashing.newCapacity(hashTableMask), smearedHash, i2);
                    } else {
                        requireEntries[i6] = com.google.common.collect.CompactHashing.maskCombine(i7, i3, hashTableMask);
                    }
                }
            }
        } else if (i3 > hashTableMask) {
            resizeTable = resizeTable(hashTableMask, com.google.common.collect.CompactHashing.newCapacity(hashTableMask), smearedHash, i2);
            i = resizeTable;
        } else {
            com.google.common.collect.CompactHashing.tableSet(requireTable(), i4, i3);
            i = hashTableMask;
        }
        resizeMeMaybe(i3);
        insertEntry(i2, k, v, smearedHash, i);
        this.size = i3;
        incrementModCount();
        return null;
    }

    void insertEntry(int i, K k, V v, int i2, int i3) {
        setEntry(i, com.google.common.collect.CompactHashing.maskCombine(i2, 0, i3));
        setKey(i, k);
        setValue(i, v);
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
        this.keys = java.util.Arrays.copyOf(requireKeys(), i);
        this.values = java.util.Arrays.copyOf(requireValues(), i);
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

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(java.lang.Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
        int hashTableMask = hashTableMask();
        int tableGet = com.google.common.collect.CompactHashing.tableGet(requireTable(), smearedHash & hashTableMask);
        if (tableGet == 0) {
            return -1;
        }
        int hashPrefix = com.google.common.collect.CompactHashing.getHashPrefix(smearedHash, hashTableMask);
        do {
            int i = tableGet - 1;
            int entry = entry(i);
            if (com.google.common.collect.CompactHashing.getHashPrefix(entry, hashTableMask) == hashPrefix && java.util.Objects.equals(obj, key(i))) {
                return i;
            }
            tableGet = com.google.common.collect.CompactHashing.getNext(entry, hashTableMask);
        } while (tableGet != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsKey(obj);
        }
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        accessEntry(indexOf);
        return value(indexOf);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        V v = (V) removeHelper(obj);
        if (v == NOT_FOUND) {
            return null;
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object removeHelper(java.lang.Object obj) {
        if (needsAllocArrays()) {
            return NOT_FOUND;
        }
        int hashTableMask = hashTableMask();
        int remove = com.google.common.collect.CompactHashing.remove(obj, null, hashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (remove == -1) {
            return NOT_FOUND;
        }
        V value = value(remove);
        moveLastEntry(remove, hashTableMask);
        this.size--;
        incrementModCount();
        return value;
    }

    void moveLastEntry(int i, int i2) {
        java.lang.Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        java.lang.Object[] requireKeys = requireKeys();
        java.lang.Object[] requireValues = requireValues();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            java.lang.Object obj = requireKeys[i3];
            requireKeys[i] = obj;
            requireValues[i] = requireValues[i3];
            requireKeys[i3] = null;
            requireValues[i3] = null;
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
            requireKeys[i] = null;
            requireValues[i] = null;
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

    abstract class Itr<T> implements java.util.Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;

        abstract T getOutput(int i);

        private Itr() {
            this.expectedMetadata = com.google.common.collect.CompactHashMap.this.metadata;
            this.currentIndex = com.google.common.collect.CompactHashMap.this.firstEntryIndex();
            this.indexToRemove = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            int i = this.currentIndex;
            this.indexToRemove = i;
            T output = getOutput(i);
            this.currentIndex = com.google.common.collect.CompactHashMap.this.getSuccessor(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            com.google.common.collect.CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            com.google.common.collect.CompactHashMap compactHashMap = com.google.common.collect.CompactHashMap.this;
            compactHashMap.remove(compactHashMap.key(this.indexToRemove));
            this.currentIndex = com.google.common.collect.CompactHashMap.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }

        void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        private void checkForConcurrentModification() {
            if (com.google.common.collect.CompactHashMap.this.metadata != this.expectedMetadata) {
                throw new java.util.ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        java.util.Set<K> createKeySet = createKeySet();
        this.keySetView = createKeySet;
        return createKeySet;
    }

    java.util.Set<K> createKeySet() {
        return new com.google.common.collect.CompactHashMap.KeySetView();
    }

    final class KeySetView extends java.util.AbstractSet<K> {
        private KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            java.util.Map<K, V> delegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.keySet().remove(obj);
            }
            return com.google.common.collect.CompactHashMap.this.removeHelper(obj) != com.google.common.collect.CompactHashMap.NOT_FOUND;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return com.google.common.collect.CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.google.common.collect.CompactHashMap.this.clear();
        }
    }

    java.util.Iterator<K> keySetIterator() {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.keySet().iterator();
        }
        return new com.google.common.collect.CompactHashMap<K, V>.Itr<K>() { // from class: com.google.common.collect.CompactHashMap.1
            @Override // com.google.common.collect.CompactHashMap.Itr
            K getOutput(int i) {
                return (K) com.google.common.collect.CompactHashMap.this.key(i);
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        java.util.Set<java.util.Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySetView = createEntrySet;
        return createEntrySet;
    }

    java.util.Set<java.util.Map.Entry<K, V>> createEntrySet() {
        return new com.google.common.collect.CompactHashMap.EntrySetView();
    }

    final class EntrySetView extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.google.common.collect.CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.google.common.collect.CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            java.util.Map<K, V> delegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.entrySet().contains(obj);
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int indexOf = com.google.common.collect.CompactHashMap.this.indexOf(entry.getKey());
            return indexOf != -1 && java.util.Objects.equals(com.google.common.collect.CompactHashMap.this.value(indexOf), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            java.util.Map<K, V> delegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (com.google.common.collect.CompactHashMap.this.needsAllocArrays()) {
                return false;
            }
            int hashTableMask = com.google.common.collect.CompactHashMap.this.hashTableMask();
            int remove = com.google.common.collect.CompactHashing.remove(entry.getKey(), entry.getValue(), hashTableMask, com.google.common.collect.CompactHashMap.this.requireTable(), com.google.common.collect.CompactHashMap.this.requireEntries(), com.google.common.collect.CompactHashMap.this.requireKeys(), com.google.common.collect.CompactHashMap.this.requireValues());
            if (remove == -1) {
                return false;
            }
            com.google.common.collect.CompactHashMap.this.moveLastEntry(remove, hashTableMask);
            com.google.common.collect.CompactHashMap.access$1410(com.google.common.collect.CompactHashMap.this);
            com.google.common.collect.CompactHashMap.this.incrementModCount();
            return true;
        }
    }

    java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().iterator();
        }
        return new com.google.common.collect.CompactHashMap<K, V>.Itr<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.CompactHashMap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.CompactHashMap.Itr
            public java.util.Map.Entry<K, V> getOutput(int i) {
                return new com.google.common.collect.CompactHashMap.MapEntry(i);
            }
        };
    }

    final class MapEntry extends com.google.common.collect.AbstractMapEntry<K, V> {
        private final K key;
        private int lastKnownIndex;

        MapEntry(int i) {
            this.key = (K) com.google.common.collect.CompactHashMap.this.key(i);
            this.lastKnownIndex = i;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final K getKey() {
            return this.key;
        }

        private void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= com.google.common.collect.CompactHashMap.this.size() || !java.util.Objects.equals(this.key, com.google.common.collect.CompactHashMap.this.key(this.lastKnownIndex))) {
                this.lastKnownIndex = com.google.common.collect.CompactHashMap.this.indexOf(this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final V getValue() {
            java.util.Map<K, V> delegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(delegateOrNull.get(this.key));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            return i == -1 ? (V) com.google.common.collect.NullnessCasts.unsafeNull() : (V) com.google.common.collect.CompactHashMap.this.value(i);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final V setValue(V v) {
            java.util.Map<K, V> delegateOrNull = com.google.common.collect.CompactHashMap.this.delegateOrNull();
            if (delegateOrNull != null) {
                return (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(delegateOrNull.put(this.key, v));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i != -1) {
                V v2 = (V) com.google.common.collect.CompactHashMap.this.value(i);
                com.google.common.collect.CompactHashMap.this.setValue(this.lastKnownIndex, v);
                return v2;
            }
            com.google.common.collect.CompactHashMap.this.put(this.key, v);
            return (V) com.google.common.collect.NullnessCasts.unsafeNull();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (java.util.Objects.equals(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> createValues = createValues();
        this.valuesView = createValues;
        return createValues;
    }

    java.util.Collection<V> createValues() {
        return new com.google.common.collect.CompactHashMap.ValuesView();
    }

    final class ValuesView extends java.util.AbstractCollection<V> {
        private ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return com.google.common.collect.CompactHashMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            com.google.common.collect.CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return com.google.common.collect.CompactHashMap.this.valuesIterator();
        }
    }

    java.util.Iterator<V> valuesIterator() {
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.values().iterator();
        }
        return new com.google.common.collect.CompactHashMap<K, V>.Itr<V>() { // from class: com.google.common.collect.CompactHashMap.3
            @Override // com.google.common.collect.CompactHashMap.Itr
            V getOutput(int i) {
                return (V) com.google.common.collect.CompactHashMap.this.value(i);
            }
        };
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            java.util.Map<K, V> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            createHashFloodingResistantDelegate.putAll(delegateOrNull);
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

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        java.util.Map<K, V> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            this.metadata = com.google.common.primitives.Ints.constrainToRange(size(), 3, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            delegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        java.util.Arrays.fill(requireKeys(), 0, this.size, (java.lang.Object) null);
        java.util.Arrays.fill(requireValues(), 0, this.size, (java.lang.Object) null);
        com.google.common.collect.CompactHashing.tableClear(requireTable());
        java.util.Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            java.util.Map.Entry<K, V> next = entrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
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
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object requireTable() {
        return java.util.Objects.requireNonNull(this.table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        return (int[]) java.util.Objects.requireNonNull(this.entries);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] requireKeys() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.keys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] requireValues() {
        return (java.lang.Object[]) java.util.Objects.requireNonNull(this.values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i) {
        return (K) requireKeys()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i) {
        return (V) requireValues()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private void setKey(int i, K k) {
        requireKeys()[i] = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, V v) {
        requireValues()[i] = v;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }
}
