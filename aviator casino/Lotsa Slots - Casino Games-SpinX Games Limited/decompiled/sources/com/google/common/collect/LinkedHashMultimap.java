package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class LinkedHashMultimap<K, V> extends com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    private static final long serialVersionUID = 1;
    private transient com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> multimapHeaderEntry;
    transient int valueSetCapacity;

    private interface ValueSetLink<K, V> {
        com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getPredecessorInValueSet();

        com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> entry);

        void setSuccessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> entry);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return super.containsKey(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set get(@com.google.common.collect.ParametricNullness java.lang.Object key) {
        return super.get(key);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean put(@com.google.common.collect.ParametricNullness java.lang.Object key, @com.google.common.collect.ParametricNullness java.lang.Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return super.putAll(key, values);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean remove(@javax.annotation.CheckForNull java.lang.Object key, @javax.annotation.CheckForNull java.lang.Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set removeAll(@javax.annotation.CheckForNull java.lang.Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection replaceValues(@com.google.common.collect.ParametricNullness java.lang.Object key, java.lang.Iterable values) {
        return replaceValues((com.google.common.collect.LinkedHashMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create() {
        return new com.google.common.collect.LinkedHashMultimap<>(16, 2);
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new com.google.common.collect.LinkedHashMultimap<>(com.google.common.collect.Maps.capacity(expectedKeys), com.google.common.collect.Maps.capacity(expectedValuesPerKey));
    }

    public static <K, V> com.google.common.collect.LinkedHashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        com.google.common.collect.LinkedHashMultimap<K, V> create = create(multimap.keySet().size(), 2);
        create.putAll(multimap);
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> pred, com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> succ) {
        pred.setSuccessorInValueSet(succ);
        succ.setPredecessorInValueSet(pred);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> pred, com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> succ) {
        pred.setSuccessorInMultimap(succ);
        succ.setPredecessorInMultimap(pred);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> entry) {
        succeedsInValueSet(entry.getPredecessorInValueSet(), entry.getSuccessorInValueSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> entry) {
        succeedsInMultimap(entry.getPredecessorInMultimap(), entry.getSuccessorInMultimap());
    }

    static final class ValueEntry<K, V> extends com.google.common.collect.ImmutableEntry<K, V> implements com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> {

        @javax.annotation.CheckForNull
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextInValueBucket;

        @javax.annotation.CheckForNull
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> predecessorInMultimap;

        @javax.annotation.CheckForNull
        private com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> predecessorInValueSet;
        final int smearedValueHash;

        @javax.annotation.CheckForNull
        private com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> successorInMultimap;

        @javax.annotation.CheckForNull
        private com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> successorInValueSet;

        ValueEntry(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value, int smearedValueHash, @javax.annotation.CheckForNull com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextInValueBucket) {
            super(key, value);
            this.smearedValueHash = smearedValueHash;
            this.nextInValueBucket = nextInValueBucket;
        }

        static <K, V> com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> newHeader() {
            return new com.google.common.collect.LinkedHashMultimap.ValueEntry<>(null, null, 0, null);
        }

        boolean matchesValue(@javax.annotation.CheckForNull java.lang.Object v, int smearedVHash) {
            return this.smearedValueHash == smearedVHash && com.google.common.base.Objects.equal(getValue(), v);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getPredecessorInValueSet() {
            return (com.google.common.collect.LinkedHashMultimap.ValueSetLink) java.util.Objects.requireNonNull(this.predecessorInValueSet);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getSuccessorInValueSet() {
            return (com.google.common.collect.LinkedHashMultimap.ValueSetLink) java.util.Objects.requireNonNull(this.successorInValueSet);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> entry) {
            this.predecessorInValueSet = entry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> entry) {
            this.successorInValueSet = entry;
        }

        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> getPredecessorInMultimap() {
            return (com.google.common.collect.LinkedHashMultimap.ValueEntry) java.util.Objects.requireNonNull(this.predecessorInMultimap);
        }

        public com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> getSuccessorInMultimap() {
            return (com.google.common.collect.LinkedHashMultimap.ValueEntry) java.util.Objects.requireNonNull(this.successorInMultimap);
        }

        public void setSuccessorInMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> multimapSuccessor) {
            this.successorInMultimap = multimapSuccessor;
        }

        public void setPredecessorInMultimap(com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> multimapPredecessor) {
            this.predecessorInMultimap = multimapPredecessor;
        }
    }

    private LinkedHashMultimap(int keyCapacity, int valueSetCapacity) {
        super(com.google.common.collect.Platform.newLinkedHashMapWithExpectedSize(keyCapacity));
        this.valueSetCapacity = 2;
        com.google.common.collect.CollectPreconditions.checkNonnegative(valueSetCapacity, "expectedValuesPerKey");
        this.valueSetCapacity = valueSetCapacity;
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> newHeader = com.google.common.collect.LinkedHashMultimap.ValueEntry.newHeader();
        this.multimapHeaderEntry = newHeader;
        succeedsInMultimap(newHeader, newHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public java.util.Set<V> createCollection() {
        return com.google.common.collect.Platform.newLinkedHashSetWithExpectedSize(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> createCollection(@com.google.common.collect.ParametricNullness K key) {
        return new com.google.common.collect.LinkedHashMultimap.ValueSet(key, this.valueSetCapacity);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<V> replaceValues(@com.google.common.collect.ParametricNullness K key, java.lang.Iterable<? extends V> values) {
        return super.replaceValues((java.lang.Object) key, (java.lang.Iterable) values);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<java.util.Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        return super.values();
    }

    final class ValueSet extends com.google.common.collect.Sets.ImprovedAbstractSet<V> implements com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> {
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V>[] hashTable;

        @com.google.common.collect.ParametricNullness
        private final K key;
        private int size = 0;
        private int modCount = 0;
        private com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> firstEntry = this;
        private com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> lastEntry = this;

        ValueSet(@com.google.common.collect.ParametricNullness K key, int expectedValues) {
            this.key = key;
            this.hashTable = new com.google.common.collect.LinkedHashMultimap.ValueEntry[com.google.common.collect.Hashing.closedTableSize(expectedValues, 1.0d)];
        }

        private int mask() {
            return this.hashTable.length - 1;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getPredecessorInValueSet() {
            return this.lastEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> getSuccessorInValueSet() {
            return this.firstEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> entry) {
            this.lastEntry = entry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> entry) {
            this.firstEntry = entry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<V> iterator() {
            return new java.util.Iterator<V>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1
                int expectedModCount;
                com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> nextEntry;

                @javax.annotation.CheckForNull
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
                    return this.nextEntry != com.google.common.collect.LinkedHashMultimap.ValueSet.this;
                }

                @Override // java.util.Iterator
                @com.google.common.collect.ParametricNullness
                public V next() {
                    if (!hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }
                    com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = (com.google.common.collect.LinkedHashMultimap.ValueEntry) this.nextEntry;
                    V value = valueEntry.getValue();
                    this.toRemove = valueEntry;
                    this.nextEntry = valueEntry.getSuccessorInValueSet();
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
        public int size() {
            return this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(o);
            for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.hashTable[mask() & smearedHash]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
                if (valueEntry.matchesValue(o, smearedHash)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@com.google.common.collect.ParametricNullness V value) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(value);
            int mask = mask() & smearedHash;
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.hashTable[mask];
            for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(value, smearedHash)) {
                    return false;
                }
            }
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry3 = new com.google.common.collect.LinkedHashMultimap.ValueEntry<>(this.key, value, smearedHash, valueEntry);
            com.google.common.collect.LinkedHashMultimap.succeedsInValueSet(this.lastEntry, valueEntry3);
            com.google.common.collect.LinkedHashMultimap.succeedsInValueSet(valueEntry3, this);
            com.google.common.collect.LinkedHashMultimap.succeedsInMultimap(com.google.common.collect.LinkedHashMultimap.this.multimapHeaderEntry.getPredecessorInMultimap(), valueEntry3);
            com.google.common.collect.LinkedHashMultimap.succeedsInMultimap(valueEntry3, com.google.common.collect.LinkedHashMultimap.this.multimapHeaderEntry);
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
                int i = length - 1;
                for (com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> valueSetLink = this.firstEntry; valueSetLink != this; valueSetLink = valueSetLink.getSuccessorInValueSet()) {
                    com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = (com.google.common.collect.LinkedHashMultimap.ValueEntry) valueSetLink;
                    int i2 = valueEntry.smearedValueHash & i;
                    valueEntry.nextInValueBucket = valueEntryArr[i2];
                    valueEntryArr[i2] = valueEntry;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
            int smearedHash = com.google.common.collect.Hashing.smearedHash(o);
            int mask = mask() & smearedHash;
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = null;
            for (com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry2 = this.hashTable[mask]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
                if (valueEntry2.matchesValue(o, smearedHash)) {
                    if (valueEntry == null) {
                        this.hashTable[mask] = valueEntry2.nextInValueBucket;
                    } else {
                        valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                    }
                    com.google.common.collect.LinkedHashMultimap.deleteFromValueSet(valueEntry2);
                    com.google.common.collect.LinkedHashMultimap.deleteFromMultimap(valueEntry2);
                    this.size--;
                    this.modCount++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            java.util.Arrays.fill(this.hashTable, (java.lang.Object) null);
            this.size = 0;
            for (com.google.common.collect.LinkedHashMultimap.ValueSetLink<K, V> valueSetLink = this.firstEntry; valueSetLink != this; valueSetLink = valueSetLink.getSuccessorInValueSet()) {
                com.google.common.collect.LinkedHashMultimap.deleteFromMultimap((com.google.common.collect.LinkedHashMultimap.ValueEntry) valueSetLink);
            }
            com.google.common.collect.LinkedHashMultimap.succeedsInValueSet(this, this);
            this.modCount++;
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator() {
        return new java.util.Iterator<java.util.Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedHashMultimap.1
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> nextEntry;

            @javax.annotation.CheckForNull
            com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> toRemove;

            {
                this.nextEntry = com.google.common.collect.LinkedHashMultimap.this.multimapHeaderEntry.getSuccessorInMultimap();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.nextEntry != com.google.common.collect.LinkedHashMultimap.this.multimapHeaderEntry;
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.nextEntry;
                this.toRemove = valueEntry;
                this.nextEntry = valueEntry.getSuccessorInMultimap();
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
    java.util.Iterator<V> valueIterator() {
        return com.google.common.collect.Maps.valueIterator(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> valueEntry = this.multimapHeaderEntry;
        succeedsInMultimap(valueEntry, valueEntry);
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeInt(keySet().size());
        java.util.Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
        stream.writeInt(size());
        for (java.util.Map.Entry<K, V> entry : entries()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        stream.defaultReadObject();
        com.google.common.collect.LinkedHashMultimap.ValueEntry<K, V> newHeader = com.google.common.collect.LinkedHashMultimap.ValueEntry.newHeader();
        this.multimapHeaderEntry = newHeader;
        succeedsInMultimap(newHeader, newHeader);
        this.valueSetCapacity = 2;
        int readInt = stream.readInt();
        java.util.Map newLinkedHashMapWithExpectedSize = com.google.common.collect.Platform.newLinkedHashMapWithExpectedSize(12);
        for (int i = 0; i < readInt; i++) {
            java.lang.Object readObject = stream.readObject();
            newLinkedHashMapWithExpectedSize.put(readObject, createCollection(readObject));
        }
        int readInt2 = stream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            java.lang.Object readObject2 = stream.readObject();
            ((java.util.Collection) java.util.Objects.requireNonNull((java.util.Collection) newLinkedHashMapWithExpectedSize.get(readObject2))).add(stream.readObject());
        }
        setMap(newLinkedHashMapWithExpectedSize);
    }
}
