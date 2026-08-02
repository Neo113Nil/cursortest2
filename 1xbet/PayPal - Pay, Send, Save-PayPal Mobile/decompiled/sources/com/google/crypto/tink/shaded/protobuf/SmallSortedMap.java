package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.DescendingEntrySet lazyDescendingEntrySet;
    private volatile com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private java.util.Map<K, V> overflowEntries;
    private java.util.Map<K, V> overflowEntriesDescending;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>) obj, (java.lang.Comparable) obj2);
    }

    static <FieldDescriptorType extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap() {
        return (com.google.crypto.tink.shaded.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) new com.google.crypto.tink.shaded.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>() { // from class: com.google.crypto.tink.shaded.protobuf.SmallSortedMap.1
            @Override // com.google.crypto.tink.shaded.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
                return super.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1<FieldDescriptorType>) obj, (java.lang.Comparable) obj2);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i = 0; i < getNumArrayEntries(); i++) {
                        java.util.Map.Entry<FieldDescriptorType, java.lang.Object> arrayEntryAt = getArrayEntryAt(i);
                        if (((com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(java.util.Collections.unmodifiableList((java.util.List) arrayEntryAt.getValue()));
                        }
                    }
                    for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : getOverflowEntries()) {
                        if (((com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }
        };
    }

    static <K extends java.lang.Comparable<K>, V> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V> newInstanceForTest() {
        return new com.google.crypto.tink.shaded.protobuf.SmallSortedMap<>();
    }

    private SmallSortedMap() {
        this.entryList = java.util.Collections.emptyList();
        this.overflowEntries = java.util.Collections.emptyMap();
        this.overflowEntriesDescending = java.util.Collections.emptyMap();
    }

    public void makeImmutable() {
        java.util.Map<K, V> unmodifiableMap;
        java.util.Map<K, V> unmodifiableMap2;
        if (this.isImmutable) {
            return;
        }
        if (this.overflowEntries.isEmpty()) {
            unmodifiableMap = java.util.Collections.emptyMap();
        } else {
            unmodifiableMap = java.util.Collections.unmodifiableMap(this.overflowEntries);
        }
        this.overflowEntries = unmodifiableMap;
        if (this.overflowEntriesDescending.isEmpty()) {
            unmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            unmodifiableMap2 = java.util.Collections.unmodifiableMap(this.overflowEntriesDescending);
        }
        this.overflowEntriesDescending = unmodifiableMap2;
        this.isImmutable = true;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public java.util.Map.Entry<K, V> getArrayEntryAt(int i) {
        return this.entryList.get(i);
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() {
        if (this.overflowEntries.isEmpty()) {
            return java.util.Collections.emptySet();
        }
        return this.overflowEntries.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    public V put(K k, V v) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(k);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).setValue(v);
        }
        ensureEntryArrayMutable();
        int i = -(binarySearchInArray + 1);
        if (i >= 16) {
            return getOverflowEntriesMutable().put(k, v);
        }
        if (this.entryList.size() == 16) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry remove = this.entryList.remove(15);
            getOverflowEntriesMutable().put(remove.getKey(), remove.getValue());
        }
        this.entryList.add(i, new com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        checkMutable();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return (V) removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i) {
        checkMutable();
        V value = this.entryList.remove(i).getValue();
        if (!this.overflowEntries.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    private int binarySearchInArray(K k) {
        int size = this.entryList.size();
        int i = size - 1;
        if (i >= 0) {
            int compareTo = k.compareTo(this.entryList.get(i).getKey());
            if (compareTo <= 0) {
                if (compareTo == 0) {
                    return i;
                }
            }
            return -(size + 1);
        }
        size = 0;
        while (size <= i) {
            int i2 = (size + i) / 2;
            int compareTo2 = k.compareTo(this.entryList.get(i2).getKey());
            if (compareTo2 < 0) {
                i = i2 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i2;
                }
                size = i2 + 1;
            }
        }
        return -(size + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EntrySet();
        }
        return this.lazyEntrySet;
    }

    java.util.Set<java.util.Map.Entry<K, V>> descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap.DescendingEntrySet();
        }
        return this.lazyDescendingEntrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private java.util.SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.overflowEntries;
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.entryList.isEmpty() || (this.entryList instanceof java.util.ArrayList)) {
            return;
        }
        this.entryList = new java.util.ArrayList(16);
    }

    class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry> {
        private final K key;
        private V value;

        Entry(com.google.crypto.tink.shaded.protobuf.SmallSortedMap smallSortedMap, java.util.Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.checkMutable();
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.key;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.key);
            sb.append("=");
            sb.append(this.value);
            return sb.toString();
        }

        private boolean equals(java.lang.Object obj, java.lang.Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            V v = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            if (v != value) {
                return v != null && v.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(java.util.Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.put((com.google.crypto.tink.shaded.protobuf.SmallSortedMap) entry.getKey(), (K) entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.clear();
        }
    }

    class DescendingEntrySet extends com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.google.crypto.tink.shaded.protobuf.SmallSortedMap.DescendingEntryIterator();
        }
    }

    class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.entryList.size() || (!com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext());
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            if (i < com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.entryList.size()) {
                return (java.util.Map.Entry) com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.entryList.get(this.pos);
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.checkMutable();
            if (this.pos < com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.entryList.size()) {
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap smallSortedMap = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this;
                int i = this.pos;
                this.pos = i - 1;
                smallSortedMap.removeArrayEntryAt(i);
                return;
            }
            getOverflowIterator().remove();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;

        private DescendingEntryIterator() {
            this.pos = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.entryList.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.pos;
            return (i > 0 && i <= com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.entryList.size()) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            if (!getOverflowIterator().hasNext()) {
                java.util.List list = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.entryList;
                int i = this.pos - 1;
                this.pos = i;
                return (java.util.Map.Entry) list.get(i);
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.SmallSortedMap)) {
            return super.equals(obj);
        }
        com.google.crypto.tink.shaded.protobuf.SmallSortedMap smallSortedMap = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != smallSortedMap.getNumArrayEntries()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(smallSortedMap.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.overflowEntries.equals(smallSortedMap.overflowEntries);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int i = 0;
        for (int i2 = 0; i2 < numArrayEntries; i2++) {
            i += this.entryList.get(i2).hashCode();
        }
        return getNumOverflowEntries() > 0 ? i + this.overflowEntries.hashCode() : i;
    }
}
