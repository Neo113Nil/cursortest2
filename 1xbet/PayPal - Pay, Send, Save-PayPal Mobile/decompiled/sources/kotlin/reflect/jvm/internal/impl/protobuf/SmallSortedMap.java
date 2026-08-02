package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry> Camera2StreamConfigurationMap;
    private volatile kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.EntrySet getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    java.util.Map<K, V> getHighSpeedVideoSizes;

    /* synthetic */ SmallSortedMap(int i, byte b) {
        this(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>) obj, (java.lang.Comparable) obj2);
    }

    static <FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> getHighSpeedVideoSizes(int i) {
        return (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>(i) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.1
            {
                byte b = 0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
                return super.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.AnonymousClass1<FieldDescriptorType>) obj, (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) obj2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
            public final void getHighResolutionOutputSizeshNQ4ISI() {
                if (!getHighSpeedVideoFpsRanges()) {
                    for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap.size(); i2++) {
                        kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry entry = this.Camera2StreamConfigurationMap.get(i2);
                        if (((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                        }
                    }
                    for (java.util.Map.Entry entry2 : this.getHighSpeedVideoSizes.isEmpty() ? kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.getHighSpeedVideoSizes() : this.getHighSpeedVideoSizes.entrySet()) {
                        if (((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) entry2.getKey()).isRepeated()) {
                            entry2.setValue(java.util.Collections.unmodifiableList((java.util.List) entry2.getValue()));
                        }
                    }
                }
                super.getHighResolutionOutputSizeshNQ4ISI();
            }
        };
    }

    private SmallSortedMap(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = java.util.Collections.emptyList();
        this.getHighSpeedVideoSizes = java.util.Collections.emptyMap();
    }

    public void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = true;
    }

    public final boolean getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Camera2StreamConfigurationMap.size() + this.getHighSpeedVideoSizes.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>) comparable) >= 0 || this.getHighSpeedVideoSizes.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>) comparable);
        if (highSpeedVideoSizes >= 0) {
            return this.Camera2StreamConfigurationMap.get(highSpeedVideoSizes).getValue();
        }
        return this.getHighSpeedVideoSizes.get(comparable);
    }

    private int getHighSpeedVideoSizes(K k) {
        int size = this.Camera2StreamConfigurationMap.size();
        int i = size - 1;
        if (i >= 0) {
            int compareTo = k.compareTo(this.Camera2StreamConfigurationMap.get(i).getHighSpeedVideoFpsRangesFor);
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
            int compareTo2 = k.compareTo(this.Camera2StreamConfigurationMap.get(i2).getHighSpeedVideoFpsRangesFor);
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
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EntrySet(this, (byte) 0);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    class Entry implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry>, java.util.Map.Entry<K, V> {
        private V getHighSpeedVideoFpsRanges;
        final K getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
            return this.getHighSpeedVideoFpsRangesFor.compareTo(((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry) obj).getHighSpeedVideoFpsRangesFor);
        }

        Entry(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap smallSortedMap, java.util.Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        Entry(K k, V v) {
            this.getHighSpeedVideoFpsRangesFor = k;
            this.getHighSpeedVideoFpsRanges = v;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this);
            V v2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = v;
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
            K k = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object key = entry.getKey();
            if (k != null ? k.equals(key) : key == null) {
                V v = this.getHighSpeedVideoFpsRanges;
                java.lang.Object value = entry.getValue();
                if (v != null ? v.equals(value) : value == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.getHighSpeedVideoFpsRangesFor;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.getHighSpeedVideoFpsRanges;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor));
            java.lang.String valueOf2 = java.lang.String.valueOf(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getKey() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet() {
        }

        /* synthetic */ EntrySet(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap smallSortedMap, byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* synthetic */ boolean add(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap) entry.getKey(), (java.lang.Comparable) entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EntryIterator(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            V v = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.get(entry.getKey());
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
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.clear();
        }
    }

    class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private java.util.Iterator<java.util.Map.Entry<K, V>> getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;

        private EntryIterator() {
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
        }

        /* synthetic */ EntryIterator(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap smallSortedMap, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.getHighResolutionOutputSizeshNQ4ISI + 1 < kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.Camera2StreamConfigurationMap.size() || getHighSpeedVideoFpsRangesFor().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.getHighSpeedVideoSizes = false;
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this);
            if (this.getHighResolutionOutputSizeshNQ4ISI < kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.Camera2StreamConfigurationMap.size()) {
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap smallSortedMap = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this;
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = i - 1;
                smallSortedMap.getHighSpeedVideoFpsRangesFor(i);
                return;
            }
            getHighSpeedVideoFpsRangesFor().remove();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.getHighSpeedVideoSizes.entrySet().iterator();
            }
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.util.Iterator
        public /* synthetic */ java.lang.Object next() {
            this.getHighSpeedVideoSizes = true;
            int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            if (i < kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.Camera2StreamConfigurationMap.size()) {
                return (java.util.Map.Entry) kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.Camera2StreamConfigurationMap.get(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return getHighSpeedVideoFpsRangesFor().next();
        }
    }

    static class EmptySet {
        private static final java.util.Iterator<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new java.util.Iterator<java.lang.Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final java.lang.Object next() {
                throw new java.util.NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new java.lang.UnsupportedOperationException();
            }
        };
        private static final java.lang.Iterable<java.lang.Object> Camera2StreamConfigurationMap = new java.lang.Iterable<java.lang.Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public final java.util.Iterator<java.lang.Object> iterator() {
                return kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.getHighResolutionOutputSizeshNQ4ISI;
            }
        };

        static <T> java.lang.Iterable<T> getHighSpeedVideoSizes() {
            return (java.lang.Iterable<T>) Camera2StreamConfigurationMap;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap smallSortedMap) {
        if (smallSortedMap.getHighSpeedVideoFpsRanges) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private void getHighSpeedVideoSizes() {
        if (!this.getHighSpeedVideoFpsRanges) {
            if (!this.Camera2StreamConfigurationMap.isEmpty() || (this.Camera2StreamConfigurationMap instanceof java.util.ArrayList)) {
                return;
            }
            this.Camera2StreamConfigurationMap = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    private java.util.SortedMap<K, V> Camera2StreamConfigurationMap() {
        if (!this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoSizes.isEmpty() && !(this.getHighSpeedVideoSizes instanceof java.util.TreeMap)) {
                this.getHighSpeedVideoSizes = new java.util.TreeMap();
            }
            return (java.util.SortedMap) this.getHighSpeedVideoSizes;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V getHighSpeedVideoFpsRangesFor(int i) {
        if (!this.getHighSpeedVideoFpsRanges) {
            V value = this.Camera2StreamConfigurationMap.remove(i).getValue();
            if (!this.getHighSpeedVideoSizes.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<K, V>> it = Camera2StreamConfigurationMap().entrySet().iterator();
                this.Camera2StreamConfigurationMap.add(new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry(this, it.next()));
                it.remove();
            }
            return value;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.getHighSpeedVideoFpsRanges) {
            if (!this.Camera2StreamConfigurationMap.isEmpty()) {
                this.Camera2StreamConfigurationMap.clear();
            }
            if (this.getHighSpeedVideoSizes.isEmpty()) {
                return;
            }
            this.getHighSpeedVideoSizes.clear();
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public final V getHighSpeedVideoSizes(K k, V v) {
        if (!this.getHighSpeedVideoFpsRanges) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>) k);
            if (highSpeedVideoSizes >= 0) {
                return this.Camera2StreamConfigurationMap.get(highSpeedVideoSizes).setValue(v);
            }
            getHighSpeedVideoSizes();
            int i = -(highSpeedVideoSizes + 1);
            if (i >= this.getHighSpeedVideoFpsRangesFor) {
                return Camera2StreamConfigurationMap().put(k, v);
            }
            int size = this.Camera2StreamConfigurationMap.size();
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (size == i2) {
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry remove = this.Camera2StreamConfigurationMap.remove(i2 - 1);
                Camera2StreamConfigurationMap().put(remove.getHighSpeedVideoFpsRangesFor, remove.getValue());
            }
            this.Camera2StreamConfigurationMap.add(i, new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry(k, v));
            return null;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        if (!this.getHighSpeedVideoFpsRanges) {
            java.lang.Comparable comparable = (java.lang.Comparable) obj;
            int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>) comparable);
            if (highSpeedVideoSizes >= 0) {
                return (V) getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
            }
            if (this.getHighSpeedVideoSizes.isEmpty()) {
                return null;
            }
            return this.getHighSpeedVideoSizes.remove(comparable);
        }
        throw new java.lang.UnsupportedOperationException();
    }
}
