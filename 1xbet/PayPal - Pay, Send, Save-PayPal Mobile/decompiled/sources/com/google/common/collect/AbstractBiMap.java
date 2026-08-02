package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractBiMap<K, V> extends com.google.common.collect.ForwardingMap<K, V> implements com.google.common.collect.BiMap<K, V>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient java.util.Map<K, V> delegate;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<java.util.Map.Entry<K, V>> entrySet;
    transient com.google.common.collect.AbstractBiMap<V, K> inverse;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<K> keySet;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient java.util.Set<V> valueSet;

    K checkKey(K k) {
        return k;
    }

    V checkValue(V v) {
        return v;
    }

    AbstractBiMap(java.util.Map<K, V> map, java.util.Map<V, K> map2) {
        setDelegates(map, map2);
    }

    private AbstractBiMap(java.util.Map<K, V> map, com.google.common.collect.AbstractBiMap<V, K> abstractBiMap) {
        this.delegate = map;
        this.inverse = abstractBiMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public java.util.Map<K, V> delegate() {
        return this.delegate;
    }

    void setDelegates(java.util.Map<K, V> map, java.util.Map<V, K> map2) {
        com.google.common.base.Preconditions.checkState(this.delegate == null);
        com.google.common.base.Preconditions.checkState(this.inverse == null);
        com.google.common.base.Preconditions.checkArgument(map.isEmpty());
        com.google.common.base.Preconditions.checkArgument(map2.isEmpty());
        com.google.common.base.Preconditions.checkArgument(map != map2);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    com.google.common.collect.AbstractBiMap<V, K> makeInverse(java.util.Map<V, K> map) {
        return new com.google.common.collect.AbstractBiMap.Inverse(map, this);
    }

    void setInverse(com.google.common.collect.AbstractBiMap<V, K> abstractBiMap) {
        this.inverse = abstractBiMap;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public V put(K k, V v) {
        return putInBothMaps(k, v, false);
    }

    @Override // com.google.common.collect.BiMap
    public V forcePut(K k, V v) {
        return putInBothMaps(k, v, true);
    }

    private V putInBothMaps(K k, V v, boolean z) {
        checkKey(k);
        checkValue(v);
        boolean containsKey = containsKey(k);
        if (containsKey && java.util.Objects.equals(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            com.google.common.base.Preconditions.checkArgument(!containsValue(v), "value already present: %s", v);
        }
        V put = this.delegate.put(k, v);
        updateInverseMap(k, containsKey, put, v);
        return put;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateInverseMap(K k, boolean z, V v, V v2) {
        if (z) {
            removeFromInverseMap(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(v));
        }
        this.inverse.delegate.put(v2, k);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public V remove(java.lang.Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeFromBothMaps(java.lang.Object obj) {
        V v = (V) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.delegate.remove(obj));
        removeFromInverseMap(v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInverseMap(V v) {
        this.inverse.delegate.remove(v);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        for (java.util.Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // com.google.common.collect.BiMap
    public com.google.common.collect.BiMap<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<K> keySet() {
        java.util.Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.AbstractBiMap.KeySet keySet = new com.google.common.collect.AbstractBiMap.KeySet();
        this.keySet = keySet;
        return keySet;
    }

    final class KeySet extends com.google.common.collect.ForwardingSet<K> {
        private KeySet() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<K> delegate() {
            return com.google.common.collect.AbstractBiMap.this.delegate.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.google.common.collect.AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            if (!contains(obj)) {
                return false;
            }
            com.google.common.collect.AbstractBiMap.this.removeFromBothMaps(obj);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(java.util.Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(java.util.Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return com.google.common.collect.Maps.keyIterator(com.google.common.collect.AbstractBiMap.this.entrySet().iterator());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public java.util.Set<V> values() {
        java.util.Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.AbstractBiMap.ValueSet valueSet = new com.google.common.collect.AbstractBiMap.ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    final class ValueSet extends com.google.common.collect.ForwardingSet<V> {
        final java.util.Set<V> valuesDelegate;

        private ValueSet() {
            this.valuesDelegate = com.google.common.collect.AbstractBiMap.this.inverse.keySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<V> delegate() {
            return this.valuesDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<V> iterator() {
            return com.google.common.collect.Maps.valueIterator(com.google.common.collect.AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public final java.lang.String toString() {
            return standardToString();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        java.util.Set<java.util.Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        com.google.common.collect.AbstractBiMap.EntrySet entrySet = new com.google.common.collect.AbstractBiMap.EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    final class BiMapEntry extends com.google.common.collect.ForwardingMapEntry<K, V> {
        private final java.util.Map.Entry<K, V> delegate;

        BiMapEntry(java.util.Map.Entry<K, V> entry) {
            this.delegate = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public final java.util.Map.Entry<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public final V setValue(V v) {
            com.google.common.collect.AbstractBiMap.this.checkValue(v);
            com.google.common.base.Preconditions.checkState(com.google.common.collect.AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (java.util.Objects.equals(v, getValue())) {
                return v;
            }
            com.google.common.base.Preconditions.checkArgument(!com.google.common.collect.AbstractBiMap.this.containsValue(v), "value already present: %s", v);
            V value = this.delegate.setValue(v);
            com.google.common.base.Preconditions.checkState(java.util.Objects.equals(v, com.google.common.collect.AbstractBiMap.this.get(getKey())), "entry no longer in map");
            com.google.common.collect.AbstractBiMap.this.updateInverseMap(getKey(), true, value, v);
            return value;
        }
    }

    java.util.Iterator<java.util.Map.Entry<K, V>> entrySetIterator() {
        final java.util.Iterator<java.util.Map.Entry<K, V>> it = this.delegate.entrySet().iterator();
        return new java.util.Iterator<java.util.Map.Entry<K, V>>(this) { // from class: com.google.common.collect.AbstractBiMap.1
            java.util.Map.Entry<K, V> entry;
            final /* synthetic */ com.google.common.collect.AbstractBiMap this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public java.util.Map.Entry<K, V> next() {
                this.entry = (java.util.Map.Entry) it.next();
                return new com.google.common.collect.AbstractBiMap.BiMapEntry(this.entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                java.util.Map.Entry<K, V> entry = this.entry;
                if (entry == null) {
                    throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
                }
                V value = entry.getValue();
                it.remove();
                this.this$0.removeFromInverseMap(value);
                this.entry = null;
            }
        };
    }

    final class EntrySet extends com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>> {
        final java.util.Set<java.util.Map.Entry<K, V>> esDelegate;

        private EntrySet() {
            this.esDelegate = com.google.common.collect.AbstractBiMap.this.delegate.entrySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final java.util.Set<java.util.Map.Entry<K, V>> delegate() {
            return this.esDelegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.google.common.collect.AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            if (!this.esDelegate.contains(obj) || !(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            ((com.google.common.collect.AbstractBiMap) com.google.common.collect.AbstractBiMap.this.inverse).delegate.remove(entry.getValue());
            this.esDelegate.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return com.google.common.collect.AbstractBiMap.this.entrySetIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final java.lang.Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.google.common.collect.Maps.containsEntryImpl(delegate(), obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(java.util.Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(java.util.Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(java.util.Collection<?> collection) {
            return standardRetainAll(collection);
        }
    }

    static final class Inverse<K, V> extends com.google.common.collect.AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected final /* bridge */ /* synthetic */ java.lang.Object delegate() {
            return super.delegate();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final /* bridge */ /* synthetic */ java.util.Collection values() {
            return super.values();
        }

        Inverse(java.util.Map<K, V> map, com.google.common.collect.AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap);
        }

        @Override // com.google.common.collect.AbstractBiMap
        final K checkKey(K k) {
            return this.inverse.checkValue(k);
        }

        @Override // com.google.common.collect.AbstractBiMap
        final V checkValue(V v) {
            return this.inverse.checkKey(v);
        }

        private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
            objectInputStream.defaultReadObject();
            setInverse((com.google.common.collect.AbstractBiMap) java.util.Objects.requireNonNull(objectInputStream.readObject()));
        }

        final java.lang.Object readResolve() {
            return inverse().inverse();
        }
    }
}
