package com.google.common.collect;

/* loaded from: classes9.dex */
public final class LinkedHashMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    private static final long serialVersionUID = 1;
    private transient com.google.common.collect.LinkedHashMultimap.MultimapIterationChain<K, V> multimapIterationChain;
    transient int valueSetCapacity;

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean containsKey(java.lang.Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean containsValue(java.lang.Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object obj) {
        return super.get((com.google.common.collect.LinkedHashMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean put(java.lang.Object obj, java.lang.Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean putAll(java.lang.Object obj, java.lang.Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Set removeAll(java.lang.Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Collection replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return replaceValues((com.google.common.collect.LinkedHashMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create() {
        return new com.google.common.collect.LinkedHashMultimap<>(16, 2);
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create(int i, int i2) {
        return new com.google.common.collect.LinkedHashMultimap<>(com.google.common.collect.Maps.capacity(i), com.google.common.collect.Maps.capacity(i2));
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        com.google.common.collect.LinkedHashMultimap<K, V> create = create(multimap.keySet().size(), 2);
        create.putAll(multimap);
        return create;
    }

    static final class ValueEntry<K, V> extends java.util.AbstractMap.SimpleImmutableEntry<K, V> {
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextInValueBucket;
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> predecessorInMultimap;
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> predecessorInValueSet;
        final int smearedValueHash;
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> successorInMultimap;
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> successorInValueSet;

        ValueEntry(K k, V v, int i, com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry) {
            super(k, v);
            this.smearedValueHash = i;
            this.nextInValueBucket = valueEntry;
        }

        final boolean matchesValue(java.lang.Object obj, int i) {
            return this.smearedValueHash == i && java.util.Objects.equals(getValue(), obj);
        }
    }

    private LinkedHashMultimap(int i, int i2) {
        super(com.google.common.collect.Platform.newLinkedHashMapWithExpectedSize(i));
        this.multimapIterationChain = new com.google.common.collect.LinkedHashMultimap.MultimapIterationChain<>();
        com.google.common.collect.CollectPreconditions.checkNonnegative(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Set<V> createCollection() {
        return com.google.common.collect.Platform.newLinkedHashSetWithExpectedSize(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    final java.util.Collection<V> createCollection(K k) {
        return new com.google.common.collect.LinkedHashMultimap.ValueSet(k, this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final java.util.Set<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        return super.replaceValues((com.google.common.collect.LinkedHashMultimap<K, V>) k, (java.lang.Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final java.util.Set<java.util.Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final java.util.Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final java.util.Collection<V> values() {
        return super.values();
    }

    final class ValueSet extends com.google.common.collect.Sets.ImprovedAbstractSet<V> {
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> firstEntry;
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V>[] hashTable;
        private final K key;
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> lastEntry;
        private int size = 0;
        private int modCount = 0;

        ValueSet(K k, int i) {
            this.key = k;
            this.hashTable = new com.google.common.collect.LinkedHashMultimap.ValueEntry[com.google.common.collect.Hashing.closedTableSize(i, 1.0d)];
        }

        private void succeedsInValueSet(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry, com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry2) {
            if (valueEntry != null) {
                ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInValueSet = valueEntry2;
            } else {
                this.firstEntry = valueEntry2;
            }
            if (valueEntry2 != null) {
                ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry2).predecessorInValueSet = valueEntry;
            } else {
                this.lastEntry = valueEntry;
            }
        }

        private void deleteFromValueSet(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry) {
            succeedsInValueSet(((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).predecessorInValueSet, ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInValueSet);
        }

        private void appendToValueSet(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry) {
            succeedsInValueSet(this.lastEntry, valueEntry);
            this.lastEntry = valueEntry;
        }

        private int mask() {
            return this.hashTable.length - 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<V> iterator() {
            return new java.util.Iterator<V>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1
                int expectedModCount;
                com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextEntry;
                com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> toRemove;

                {
                    this.nextEntry = com.google.common.collect.LinkedHashMultimap.ValueSet.this.firstEntry;
                    this.expectedModCount = com.google.common.collect.LinkedHashMultimap.ValueSet.this.modCount;
                }

                private void checkForComodification() {
                    if (com.google.common.collect.LinkedHashMultimap.ValueSet.this.modCount != this.expectedModCount) {
                        throw new java.util.ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.nextEntry != null;
                }

                @Override // java.util.Iterator
                public V next() {
                    checkForComodification();
                    com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.nextEntry;
                    if (valueEntry == null) {
                        throw new java.util.NoSuchElementException();
                    }
                    V value = valueEntry.getValue();
                    this.toRemove = valueEntry;
                    this.nextEntry = ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInValueSet;
                    return value;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    com.google.common.base.Preconditions.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                    com.google.common.collect.LinkedHashMultimap.ValueSet.this.remove(this.toRemove.getValue());
                    this.expectedModCount = com.google.common.collect.LinkedHashMultimap.ValueSet.this.modCount;
                    this.toRemove = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
            for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.hashTable[mask() & smearedHash]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(obj, smearedHash)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(V v) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(v);
            int mask = mask() & smearedHash;
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.hashTable[mask];
            for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(v, smearedHash)) {
                    return false;
                }
            }
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry3 = new com.google.common.collect.LinkedHashMultimap.ValueEntry<>(this.key, v, smearedHash, valueEntry);
            appendToValueSet(valueEntry3);
            com.google.common.collect.LinkedHashMultimap.this.multimapIterationChain.append(valueEntry3);
            this.hashTable[mask] = valueEntry3;
            this.size++;
            this.modCount++;
            rehashIfNecessary();
            return true;
        }

        private void rehashIfNecessary() {
            if (com.google.common.collect.Hashing.needsResizing(this.size, this.hashTable.length, 1.0d)) {
                int length = this.hashTable.length * 2;
                com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V>[] valueEntryArr = new com.google.common.collect.LinkedHashMultimap.ValueEntry[length];
                this.hashTable = valueEntryArr;
                for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.firstEntry; valueEntry != null; valueEntry = ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInValueSet) {
                    int i = valueEntry.smearedValueHash & (length - 1);
                    valueEntry.nextInValueBucket = valueEntryArr[i];
                    valueEntryArr[i] = valueEntry;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(obj);
            int mask = mask() & smearedHash;
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = null;
            for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry2 = this.hashTable[mask]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (!valueEntry2.matchesValue(obj, smearedHash)) {
                    valueEntry = valueEntry2;
                } else {
                    if (valueEntry == null) {
                        this.hashTable[mask] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    deleteFromValueSet(valueEntry2);
                    com.google.common.collect.LinkedHashMultimap.this.multimapIterationChain.delete(valueEntry2);
                    this.size--;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            java.util.Arrays.fill(this.hashTable, (java.lang.Object) null);
            this.size = 0;
            for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.firstEntry; valueEntry != null; valueEntry = ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInValueSet) {
                com.google.common.collect.LinkedHashMultimap.this.multimapIterationChain.delete(valueEntry);
            }
            this.firstEntry = null;
            this.lastEntry = null;
            this.modCount++;
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    final java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        return new java.util.Iterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedHashMultimap.1
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextEntry;
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> toRemove;

            {
                this.nextEntry = com.google.common.collect.LinkedHashMultimap.this.multimapIterationChain.firstEntry;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.nextEntry != null;
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.nextEntry;
                if (valueEntry == null) {
                    throw new java.util.NoSuchElementException();
                }
                this.toRemove = valueEntry;
                this.nextEntry = ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInMultimap;
                return valueEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                com.google.common.collect.LinkedHashMultimap.this.remove(this.toRemove.getKey(), this.toRemove.getValue());
                this.toRemove = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    final java.util.Iterator<V> valueIterator() {
        return com.google.common.collect.Maps.valueIterator(entryIterator());
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        java.util.Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(size());
        for (java.util.Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.multimapIterationChain = new com.google.common.collect.LinkedHashMultimap.MultimapIterationChain<>();
        this.valueSetCapacity = 2;
        int readInt = objectInputStream.readInt();
        java.util.Map newLinkedHashMapWithExpectedSize = com.google.common.collect.Platform.newLinkedHashMapWithExpectedSize(12);
        for (int i = 0; i < readInt; i++) {
            java.lang.Object readObject = objectInputStream.readObject();
            newLinkedHashMapWithExpectedSize.put(readObject, createCollection(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            ((java.util.Collection) java.util.Objects.requireNonNull((java.util.Collection) newLinkedHashMapWithExpectedSize.get(objectInputStream.readObject()))).add(objectInputStream.readObject());
        }
        setMap(newLinkedHashMapWithExpectedSize);
    }

    static final class MultimapIterationChain<K, V> {
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> firstEntry;
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> lastEntry;

        private MultimapIterationChain() {
        }

        final void succeeds(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry, com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry2) {
            if (valueEntry != null) {
                ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInMultimap = valueEntry2;
            } else {
                this.firstEntry = valueEntry2;
            }
            if (valueEntry2 != null) {
                ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry2).predecessorInMultimap = valueEntry;
            } else {
                this.lastEntry = valueEntry;
            }
        }

        final void delete(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry) {
            succeeds(((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).predecessorInMultimap, ((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueEntry).successorInMultimap);
        }

        final void append(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry) {
            succeeds(this.lastEntry, valueEntry);
            this.lastEntry = valueEntry;
        }
    }
}
