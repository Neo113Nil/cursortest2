package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private java.util.List<androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.DescendingEntrySet lazyDescendingEntrySet;
    private volatile androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private java.util.Map<K, V> overflowEntries;
    private java.util.Map<K, V> overflowEntriesDescending;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object key, java.lang.Object value) {
        return put((androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>) key, (java.lang.Comparable) value);
    }

    static <FieldDescriptorType extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> androidx.datastore.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap() {
        return (androidx.datastore.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) new androidx.datastore.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>() { // from class: androidx.datastore.preferences.protobuf.SmallSortedMap.1
            @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object key, java.lang.Object value) {
                return super.put((androidx.datastore.preferences.protobuf.SmallSortedMap.AnonymousClass1<FieldDescriptorType>) key, (java.lang.Comparable) value);
            }

            @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i = 0; i < getNumArrayEntries(); i++) {
                        java.util.Map.Entry<FieldDescriptorType, java.lang.Object> arrayEntryAt = getArrayEntryAt(i);
                        if (((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(java.util.Collections.unmodifiableList((java.util.List) arrayEntryAt.getValue()));
                        }
                    }
                    for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : getOverflowEntries()) {
                        if (((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }
        };
    }

    static <K extends java.lang.Comparable<K>, V> androidx.datastore.preferences.protobuf.SmallSortedMap<K, V> newInstanceForTest() {
        return new androidx.datastore.preferences.protobuf.SmallSortedMap<>();
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

    public java.util.Map.Entry<K, V> getArrayEntryAt(int index) {
        return this.entryList.get(index);
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
    public boolean containsKey(java.lang.Object o) {
        java.lang.Comparable comparable = (java.lang.Comparable) o;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object o) {
        java.lang.Comparable comparable = (java.lang.Comparable) o;
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
            androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry remove = this.entryList.remove(15);
            getOverflowEntriesMutable().put(remove.getKey(), remove.getValue());
        }
        this.entryList.add(i, new androidx.datastore.preferences.protobuf.SmallSortedMap.Entry(k, v));
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
    public V removeArrayEntryAt(int index) {
        checkMutable();
        V value = this.entryList.remove(index).getValue();
        if (!this.overflowEntries.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new androidx.datastore.preferences.protobuf.SmallSortedMap.Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    private int binarySearchInArray(K key) {
        int i;
        int size = this.entryList.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = key.compareTo(this.entryList.get(i2).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = key.compareTo(this.entryList.get(i4).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet();
        }
        return this.lazyEntrySet;
    }

    java.util.Set<java.util.Map.Entry<K, V>> descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new androidx.datastore.preferences.protobuf.SmallSortedMap.DescendingEntrySet();
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

    private class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry> {
        private final K key;
        private V value;

        Entry(final androidx.datastore.preferences.protobuf.SmallSortedMap this$0, java.util.Map.Entry<K, V> copy) {
            this(copy.getKey(), copy.getValue());
        }

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
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
        public int compareTo(androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.Entry other) {
            return getKey().compareTo(other.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.checkMutable();
            V v = this.value;
            this.value = newValue;
            return v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
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
            return this.key + com.ironsource.X3.j.b + this.value;
        }

        private boolean equals(java.lang.Object o1, java.lang.Object o2) {
            if (o1 == null) {
                return o2 == null;
            }
            return o1.equals(o2);
        }
    }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.datastore.preferences.protobuf.SmallSortedMap.EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return androidx.datastore.preferences.protobuf.SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object o) {
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            java.lang.Object obj = androidx.datastore.preferences.protobuf.SmallSortedMap.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            return obj == value || (obj != null && obj.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(java.util.Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.put((androidx.datastore.preferences.protobuf.SmallSortedMap) entry.getKey(), (K) entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object o) {
            java.util.Map.Entry entry = (java.util.Map.Entry) o;
            if (!contains(entry)) {
                return false;
            }
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.clear();
        }
    }

    private class DescendingEntrySet extends androidx.datastore.preferences.protobuf.SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.datastore.preferences.protobuf.SmallSortedMap.DescendingEntryIterator();
        }
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.pos + 1 >= androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) {
                return !androidx.datastore.preferences.protobuf.SmallSortedMap.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            if (i < androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) {
                return (java.util.Map.Entry) androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.get(this.pos);
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            androidx.datastore.preferences.protobuf.SmallSortedMap.this.checkMutable();
            if (this.pos < androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) {
                androidx.datastore.preferences.protobuf.SmallSortedMap smallSortedMap = androidx.datastore.preferences.protobuf.SmallSortedMap.this;
                int i = this.pos;
                this.pos = i - 1;
                smallSortedMap.removeArrayEntryAt(i);
                return;
            }
            getOverflowIterator().remove();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = androidx.datastore.preferences.protobuf.SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    private class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;

        private DescendingEntryIterator() {
            this.pos = androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.pos;
            return (i > 0 && i <= androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList.size()) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            if (!getOverflowIterator().hasNext()) {
                java.util.List list = androidx.datastore.preferences.protobuf.SmallSortedMap.this.entryList;
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
                this.lazyOverflowIterator = androidx.datastore.preferences.protobuf.SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.datastore.preferences.protobuf.SmallSortedMap)) {
            return super.equals(o);
        }
        androidx.datastore.preferences.protobuf.SmallSortedMap smallSortedMap = (androidx.datastore.preferences.protobuf.SmallSortedMap) o;
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
