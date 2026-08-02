package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingMap<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Map<K, V> delegate();

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public V remove(java.lang.Object obj) {
        return delegate().remove(obj);
    }

    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(java.lang.Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
        return delegate().get(obj);
    }

    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public java.util.Set<K> keySet() {
        return delegate().keySet();
    }

    public java.util.Collection<V> values() {
        return delegate().values();
    }

    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return delegate().hashCode();
    }

    protected void standardPutAll(java.util.Map<? extends K, ? extends V> map) {
        com.google.common.collect.Maps.putAllImpl(this, map);
    }

    protected V standardRemove(java.lang.Object obj) {
        java.util.Iterator<java.util.Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (java.util.Objects.equals(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected void standardClear() {
        com.google.common.collect.Iterators.clear(entrySet().iterator());
    }

    protected class StandardKeySet extends com.google.common.collect.Maps.KeySet<K, V> {
        public StandardKeySet() {
            super(com.google.common.collect.ForwardingMap.this);
        }
    }

    protected boolean standardContainsKey(java.lang.Object obj) {
        return com.google.common.collect.Maps.containsKeyImpl(this, obj);
    }

    protected class StandardValues extends com.google.common.collect.Maps.Values<K, V> {
        public StandardValues() {
            super(com.google.common.collect.ForwardingMap.this);
        }
    }

    protected boolean standardContainsValue(java.lang.Object obj) {
        return com.google.common.collect.Maps.containsValueImpl(this, obj);
    }

    protected abstract class StandardEntrySet extends com.google.common.collect.Maps.EntrySet<K, V> {
        protected StandardEntrySet() {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        java.util.Map<K, V> map() {
            return com.google.common.collect.ForwardingMap.this;
        }
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected boolean standardEquals(java.lang.Object obj) {
        return com.google.common.collect.Maps.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return com.google.common.collect.Sets.hashCodeImpl(entrySet());
    }

    protected java.lang.String standardToString() {
        return com.google.common.collect.Maps.toStringImpl(this);
    }
}
