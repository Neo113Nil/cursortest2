package androidx.collection;

/* loaded from: classes3.dex */
public class ArrayMap<K, V> extends androidx.collection.SimpleArrayMap<K, V> implements java.util.Map<K, V> {
    androidx.collection.ArrayMap<K, V>.KeySet Camera2StreamConfigurationMap;
    androidx.collection.ArrayMap<K, V>.ValueCollection getHighResolutionOutputSizeshNQ4ISI;
    androidx.collection.ArrayMap<K, V>.EntrySet getHighSpeedVideoFpsRangesFor;

    public ArrayMap() {
    }

    public ArrayMap(int i) {
        super(i);
    }

    public ArrayMap(androidx.collection.SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(java.lang.Object obj) {
        return (V) super.get(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(java.lang.Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        ensureCapacity(getCamera2StreamConfigurationMap() + map.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean removeAll(java.util.Collection<?> collection) {
        int camera2StreamConfigurationMap = getCamera2StreamConfigurationMap();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return camera2StreamConfigurationMap != getCamera2StreamConfigurationMap();
    }

    public boolean retainAll(java.util.Collection<?> collection) {
        int camera2StreamConfigurationMap = getCamera2StreamConfigurationMap();
        for (int camera2StreamConfigurationMap2 = getCamera2StreamConfigurationMap() - 1; camera2StreamConfigurationMap2 >= 0; camera2StreamConfigurationMap2--) {
            if (!collection.contains(keyAt(camera2StreamConfigurationMap2))) {
                removeAt(camera2StreamConfigurationMap2);
            }
        }
        return camera2StreamConfigurationMap != getCamera2StreamConfigurationMap();
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        androidx.collection.ArrayMap<K, V>.EntrySet entrySet = this.getHighSpeedVideoFpsRangesFor;
        if (entrySet != null) {
            return entrySet;
        }
        androidx.collection.ArrayMap<K, V>.EntrySet entrySet2 = new androidx.collection.ArrayMap.EntrySet();
        this.getHighSpeedVideoFpsRangesFor = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
        androidx.collection.ArrayMap<K, V>.KeySet keySet = this.Camera2StreamConfigurationMap;
        if (keySet != null) {
            return keySet;
        }
        androidx.collection.ArrayMap<K, V>.KeySet keySet2 = new androidx.collection.ArrayMap.KeySet();
        this.Camera2StreamConfigurationMap = keySet2;
        return keySet2;
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        androidx.collection.ArrayMap<K, V>.ValueCollection valueCollection = this.getHighResolutionOutputSizeshNQ4ISI;
        if (valueCollection != null) {
            return valueCollection;
        }
        androidx.collection.ArrayMap<K, V>.ValueCollection valueCollection2 = new androidx.collection.ArrayMap.ValueCollection();
        this.getHighResolutionOutputSizeshNQ4ISI = valueCollection2;
        return valueCollection2;
    }

    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new androidx.collection.ArrayMap.MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap();
        }
    }

    final class KeySet implements java.util.Set<K> {
        KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends K> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            androidx.collection.ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return androidx.collection.ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(java.util.Collection<?> collection) {
            return androidx.collection.ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return androidx.collection.ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<K> iterator() {
            return new androidx.collection.ArrayMap.KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(java.lang.Object obj) {
            int indexOfKey = androidx.collection.ArrayMap.this.indexOfKey(obj);
            if (indexOfKey < 0) {
                return false;
            }
            androidx.collection.ArrayMap.this.removeAt(indexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> collection) {
            return androidx.collection.ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(java.util.Collection<?> collection) {
            return androidx.collection.ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap();
        }

        @Override // java.util.Set, java.util.Collection
        public final java.lang.Object[] toArray() {
            int camera2StreamConfigurationMap = androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap();
            java.lang.Object[] objArr = new java.lang.Object[camera2StreamConfigurationMap];
            for (int i = 0; i < camera2StreamConfigurationMap; i++) {
                objArr[i] = androidx.collection.ArrayMap.this.keyAt(i);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = androidx.collection.ArrayMap.this.keyAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(java.lang.Object obj) {
            return androidx.collection.ArrayMap.Camera2StreamConfigurationMap(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int camera2StreamConfigurationMap = androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap() - 1; camera2StreamConfigurationMap >= 0; camera2StreamConfigurationMap--) {
                K keyAt = androidx.collection.ArrayMap.this.keyAt(camera2StreamConfigurationMap);
                i += keyAt == null ? 0 : keyAt.hashCode();
            }
            return i;
        }
    }

    final class ValueCollection implements java.util.Collection<V> {
        ValueCollection() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(java.util.Collection<? extends V> collection) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            androidx.collection.ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            return androidx.collection.ArrayMap.this.__restricted$indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(java.util.Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return androidx.collection.ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return new androidx.collection.ArrayMap.ValueIterator();
        }

        @Override // java.util.Collection
        public final boolean remove(java.lang.Object obj) {
            int __restricted$indexOfValue = androidx.collection.ArrayMap.this.__restricted$indexOfValue(obj);
            if (__restricted$indexOfValue < 0) {
                return false;
            }
            androidx.collection.ArrayMap.this.removeAt(__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(java.util.Collection<?> collection) {
            int camera2StreamConfigurationMap = androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap();
            int i = 0;
            boolean z = false;
            while (i < camera2StreamConfigurationMap) {
                if (collection.contains(androidx.collection.ArrayMap.this.valueAt(i))) {
                    androidx.collection.ArrayMap.this.removeAt(i);
                    i--;
                    camera2StreamConfigurationMap--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection<?> collection) {
            int camera2StreamConfigurationMap = androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap();
            int i = 0;
            boolean z = false;
            while (i < camera2StreamConfigurationMap) {
                if (!collection.contains(androidx.collection.ArrayMap.this.valueAt(i))) {
                    androidx.collection.ArrayMap.this.removeAt(i);
                    i--;
                    camera2StreamConfigurationMap--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap();
        }

        @Override // java.util.Collection
        public final java.lang.Object[] toArray() {
            int camera2StreamConfigurationMap = androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap();
            java.lang.Object[] objArr = new java.lang.Object[camera2StreamConfigurationMap];
            for (int i = 0; i < camera2StreamConfigurationMap; i++) {
                objArr[i] = androidx.collection.ArrayMap.this.valueAt(i);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = androidx.collection.ArrayMap.this.valueAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    final class KeyIterator extends androidx.collection.IndexBasedArrayIterator<K> {
        KeyIterator() {
            super(androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final K elementAt(int i) {
            return androidx.collection.ArrayMap.this.keyAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final void removeAt(int i) {
            androidx.collection.ArrayMap.this.removeAt(i);
        }
    }

    final class ValueIterator extends androidx.collection.IndexBasedArrayIterator<V> {
        ValueIterator() {
            super(androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final V elementAt(int i) {
            return androidx.collection.ArrayMap.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final void removeAt(int i) {
            androidx.collection.ArrayMap.this.removeAt(i);
        }
    }

    final class MapIterator implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges = -1;
        boolean getHighSpeedVideoSizes;

        MapIterator() {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.collection.ArrayMap.this.getCamera2StreamConfigurationMap() - 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoFpsRanges < this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException();
            }
            androidx.collection.ArrayMap.this.removeAt(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRanges--;
            this.getHighResolutionOutputSizeshNQ4ISI--;
            this.getHighSpeedVideoSizes = false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return androidx.collection.ArrayMap.this.keyAt(this.getHighSpeedVideoFpsRanges);
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return androidx.collection.ArrayMap.this.valueAt(this.getHighSpeedVideoFpsRanges);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return androidx.collection.ArrayMap.this.setValueAt(this.getHighSpeedVideoFpsRanges, v);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return androidx.collection.internal.ContainerHelpersKt.equal(entry.getKey(), androidx.collection.ArrayMap.this.keyAt(this.getHighSpeedVideoFpsRanges)) && androidx.collection.internal.ContainerHelpersKt.equal(entry.getValue(), androidx.collection.ArrayMap.this.valueAt(this.getHighSpeedVideoFpsRanges));
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K keyAt = androidx.collection.ArrayMap.this.keyAt(this.getHighSpeedVideoFpsRanges);
            V valueAt = androidx.collection.ArrayMap.this.valueAt(this.getHighSpeedVideoFpsRanges);
            return (keyAt == null ? 0 : keyAt.hashCode()) ^ (valueAt != null ? valueAt.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ java.lang.Object next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            this.getHighSpeedVideoFpsRanges++;
            this.getHighSpeedVideoSizes = true;
            return this;
        }
    }

    static <T> boolean Camera2StreamConfigurationMap(java.util.Set<T> set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }
}
