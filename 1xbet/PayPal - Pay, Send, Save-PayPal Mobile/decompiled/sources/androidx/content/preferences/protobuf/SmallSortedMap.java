package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private boolean Camera2StreamConfigurationMap;
    java.util.List<androidx.content.preferences.protobuf.SmallSortedMap<K, V>.Entry> getHighResolutionOutputSizeshNQ4ISI;
    private volatile androidx.content.preferences.protobuf.SmallSortedMap<K, V>.EntrySet getHighSpeedVideoFpsRanges;
    volatile androidx.content.preferences.protobuf.SmallSortedMap<K, V>.DescendingEntrySet getHighSpeedVideoFpsRangesFor;
    java.util.Map<K, V> getHighSpeedVideoSizes;
    private java.util.Map<K, V> getInputFormats;

    /* synthetic */ SmallSortedMap(byte b) {
        this();
    }

    static <FieldDescriptorType extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> androidx.content.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> getHighSpeedVideoFpsRangesFor() {
        return (androidx.content.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) new androidx.content.preferences.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>() { // from class: androidx.datastore.preferences.protobuf.SmallSortedMap.1
            @Override // androidx.content.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
                return super.put((java.lang.Comparable) obj, obj2);
            }

            @Override // androidx.content.preferences.protobuf.SmallSortedMap
            public final void Camera2StreamConfigurationMap() {
                java.util.Set<java.util.Map.Entry<K, V>> entrySet;
                if (!getHighSpeedVideoSizes()) {
                    for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                        androidx.content.preferences.protobuf.SmallSortedMap<K, V>.Entry entry = this.getHighResolutionOutputSizeshNQ4ISI.get(i);
                        if (((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                        }
                    }
                    if (this.getHighSpeedVideoSizes.isEmpty()) {
                        entrySet = java.util.Collections.emptySet();
                    } else {
                        entrySet = this.getHighSpeedVideoSizes.entrySet();
                    }
                    java.util.Iterator<T> it = entrySet.iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                        if (((androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) entry2.getKey()).isRepeated()) {
                            entry2.setValue(java.util.Collections.unmodifiableList((java.util.List) entry2.getValue()));
                        }
                    }
                }
                super.Camera2StreamConfigurationMap();
            }
        };
    }

    private SmallSortedMap() {
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.emptyList();
        this.getHighSpeedVideoSizes = java.util.Collections.emptyMap();
        this.getInputFormats = java.util.Collections.emptyMap();
    }

    public void Camera2StreamConfigurationMap() {
        java.util.Map<K, V> unmodifiableMap;
        java.util.Map<K, V> unmodifiableMap2;
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            unmodifiableMap = java.util.Collections.emptyMap();
        } else {
            unmodifiableMap = java.util.Collections.unmodifiableMap(this.getHighSpeedVideoSizes);
        }
        this.getHighSpeedVideoSizes = unmodifiableMap;
        if (this.getInputFormats.isEmpty()) {
            unmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            unmodifiableMap2 = java.util.Collections.unmodifiableMap(this.getInputFormats);
        }
        this.getInputFormats = unmodifiableMap2;
        this.Camera2StreamConfigurationMap = true;
    }

    public final boolean getHighSpeedVideoSizes() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size() + this.getHighSpeedVideoSizes.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return getHighSpeedVideoSizes((androidx.content.preferences.protobuf.SmallSortedMap<K, V>) comparable) >= 0 || this.getHighSpeedVideoSizes.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int highSpeedVideoSizes = getHighSpeedVideoSizes((androidx.content.preferences.protobuf.SmallSortedMap<K, V>) comparable);
        if (highSpeedVideoSizes >= 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(highSpeedVideoSizes).getValue();
        }
        return this.getHighSpeedVideoSizes.get(comparable);
    }

    private int getHighSpeedVideoSizes(K k) {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        int i = size - 1;
        if (i >= 0) {
            int compareTo = k.compareTo(this.getHighResolutionOutputSizeshNQ4ISI.get(i).getHighResolutionOutputSizeshNQ4ISI);
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
            int compareTo2 = k.compareTo(this.getHighResolutionOutputSizeshNQ4ISI.get(i2).getHighResolutionOutputSizeshNQ4ISI);
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
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet(this, (byte) 0);
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<androidx.content.preferences.protobuf.SmallSortedMap<K, V>.Entry> {
        private V Camera2StreamConfigurationMap;
        final K getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
            return this.getHighResolutionOutputSizeshNQ4ISI.compareTo(((androidx.datastore.preferences.protobuf.SmallSortedMap.Entry) obj).getHighResolutionOutputSizeshNQ4ISI);
        }

        Entry(androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap, java.util.Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        Entry(K k, V v) {
            this.getHighResolutionOutputSizeshNQ4ISI = k;
            this.Camera2StreamConfigurationMap = v;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            androidx.content.preferences.protobuf.SmallSortedMap.getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.SmallSortedMap.this);
            V v2 = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = v;
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
            K k = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object key = entry.getKey();
            if (k != null ? k.equals(key) : key == null) {
                V v = this.Camera2StreamConfigurationMap;
                java.lang.Object value = entry.getValue();
                if (v != null ? v.equals(value) : value == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.getHighResolutionOutputSizeshNQ4ISI;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.Camera2StreamConfigurationMap;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("=");
            sb.append(this.Camera2StreamConfigurationMap);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getKey() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet() {
        }

        /* synthetic */ EntrySet(androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap, byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* synthetic */ boolean add(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            androidx.content.preferences.protobuf.SmallSortedMap.this.put((java.lang.Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.datastore.preferences.protobuf.SmallSortedMap.EntryIterator(androidx.content.preferences.protobuf.SmallSortedMap.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return androidx.content.preferences.protobuf.SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            V v = androidx.content.preferences.protobuf.SmallSortedMap.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            if (v != value) {
                return v != null && v.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            androidx.content.preferences.protobuf.SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            androidx.content.preferences.protobuf.SmallSortedMap.this.clear();
        }
    }

    class DescendingEntrySet extends androidx.content.preferences.protobuf.SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super(androidx.content.preferences.protobuf.SmallSortedMap.this, (byte) 0);
        }

        /* synthetic */ DescendingEntrySet(androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap, byte b) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.datastore.preferences.protobuf.SmallSortedMap.DescendingEntryIterator(androidx.content.preferences.protobuf.SmallSortedMap.this, (byte) 0);
        }
    }

    class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private boolean getHighSpeedVideoFpsRanges;
        private java.util.Iterator<java.util.Map.Entry<K, V>> getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        private EntryIterator() {
            this.getHighSpeedVideoSizes = -1;
        }

        /* synthetic */ EntryIterator(androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.getHighSpeedVideoSizes + 1 < androidx.content.preferences.protobuf.SmallSortedMap.this.getHighResolutionOutputSizeshNQ4ISI.size() || (!androidx.content.preferences.protobuf.SmallSortedMap.this.getHighSpeedVideoSizes.isEmpty() && getHighSpeedVideoSizes().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.getHighSpeedVideoFpsRanges = false;
            androidx.content.preferences.protobuf.SmallSortedMap.getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.SmallSortedMap.this);
            if (this.getHighSpeedVideoSizes < androidx.content.preferences.protobuf.SmallSortedMap.this.getHighResolutionOutputSizeshNQ4ISI.size()) {
                androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap = androidx.content.preferences.protobuf.SmallSortedMap.this;
                int i = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i - 1;
                smallSortedMap.Camera2StreamConfigurationMap(i);
                return;
            }
            getHighSpeedVideoSizes().remove();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getHighSpeedVideoSizes() {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.SmallSortedMap.this.getHighSpeedVideoSizes.entrySet().iterator();
            }
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Object next() {
            this.getHighSpeedVideoFpsRanges = true;
            int i = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = i;
            if (i < androidx.content.preferences.protobuf.SmallSortedMap.this.getHighResolutionOutputSizeshNQ4ISI.size()) {
                return (java.util.Map.Entry) androidx.content.preferences.protobuf.SmallSortedMap.this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoSizes);
            }
            return getHighSpeedVideoSizes().next();
        }
    }

    class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor;

        private DescendingEntryIterator() {
            this.getHighSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.SmallSortedMap.this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        /* synthetic */ DescendingEntryIterator(androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            return (i > 0 && i <= androidx.content.preferences.protobuf.SmallSortedMap.this.getHighResolutionOutputSizeshNQ4ISI.size()) || getHighResolutionOutputSizeshNQ4ISI().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.SmallSortedMap.this.getInputFormats.entrySet().iterator();
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Object next() {
            if (!getHighResolutionOutputSizeshNQ4ISI().hasNext()) {
                java.util.List list = androidx.content.preferences.protobuf.SmallSortedMap.this.getHighResolutionOutputSizeshNQ4ISI;
                int i = this.getHighSpeedVideoFpsRangesFor - 1;
                this.getHighSpeedVideoFpsRangesFor = i;
                return (java.util.Map.Entry) list.get(i);
            }
            return getHighResolutionOutputSizeshNQ4ISI().next();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.content.preferences.protobuf.SmallSortedMap)) {
            return super.equals(obj);
        }
        androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap = (androidx.content.preferences.protobuf.SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int size2 = this.getHighResolutionOutputSizeshNQ4ISI.size();
        if (size2 != smallSortedMap.getHighResolutionOutputSizeshNQ4ISI.size()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.get(i).equals(smallSortedMap.getHighResolutionOutputSizeshNQ4ISI.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.getHighSpeedVideoSizes.equals(smallSortedMap.getHighSpeedVideoSizes);
        }
        return true;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.SmallSortedMap smallSortedMap) {
        if (smallSortedMap.Camera2StreamConfigurationMap) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (!this.Camera2StreamConfigurationMap) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() || (this.getHighResolutionOutputSizeshNQ4ISI instanceof java.util.ArrayList)) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(16);
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    private java.util.SortedMap<K, V> getHighSpeedVideoFpsRanges() {
        if (!this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes.isEmpty() && !(this.getHighSpeedVideoSizes instanceof java.util.TreeMap)) {
                java.util.TreeMap treeMap = new java.util.TreeMap();
                this.getHighSpeedVideoSizes = treeMap;
                this.getInputFormats = treeMap.descendingMap();
            }
            return (java.util.SortedMap) this.getHighSpeedVideoSizes;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V Camera2StreamConfigurationMap(int i) {
        if (!this.Camera2StreamConfigurationMap) {
            V value = this.getHighResolutionOutputSizeshNQ4ISI.remove(i).getValue();
            if (!this.getHighSpeedVideoSizes.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<K, V>> it = getHighSpeedVideoFpsRanges().entrySet().iterator();
                this.getHighResolutionOutputSizeshNQ4ISI.add(new androidx.datastore.preferences.protobuf.SmallSortedMap.Entry(this, it.next()));
                it.remove();
            }
            return value;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.Camera2StreamConfigurationMap) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
            }
            if (this.getHighSpeedVideoSizes.isEmpty()) {
                return;
            }
            this.getHighSpeedVideoSizes.clear();
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.getHighResolutionOutputSizeshNQ4ISI.get(i2).hashCode();
        }
        return this.getHighSpeedVideoSizes.size() > 0 ? i + this.getHighSpeedVideoSizes.hashCode() : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        if (!this.Camera2StreamConfigurationMap) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes((androidx.content.preferences.protobuf.SmallSortedMap<K, V>) k);
            if (highSpeedVideoSizes >= 0) {
                return this.getHighResolutionOutputSizeshNQ4ISI.get(highSpeedVideoSizes).setValue(v);
            }
            getHighResolutionOutputSizeshNQ4ISI();
            int i = -(highSpeedVideoSizes + 1);
            if (i >= 16) {
                return getHighSpeedVideoFpsRanges().put(k, v);
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.size() == 16) {
                androidx.content.preferences.protobuf.SmallSortedMap<K, V>.Entry remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(15);
                getHighSpeedVideoFpsRanges().put(remove.getHighResolutionOutputSizeshNQ4ISI, remove.getValue());
            }
            this.getHighResolutionOutputSizeshNQ4ISI.add(i, new androidx.datastore.preferences.protobuf.SmallSortedMap.Entry(k, v));
            return null;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        if (!this.Camera2StreamConfigurationMap) {
            java.lang.Comparable comparable = (java.lang.Comparable) obj;
            int highSpeedVideoSizes = getHighSpeedVideoSizes((androidx.content.preferences.protobuf.SmallSortedMap<K, V>) comparable);
            if (highSpeedVideoSizes >= 0) {
                return (V) Camera2StreamConfigurationMap(highSpeedVideoSizes);
            }
            if (this.getHighSpeedVideoSizes.isEmpty()) {
                return null;
            }
            return this.getHighSpeedVideoSizes.remove(comparable);
        }
        throw new java.lang.UnsupportedOperationException();
    }
}
