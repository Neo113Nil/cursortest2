package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingMultimap<K, V> extends com.google.common.collect.ForwardingObject implements com.google.common.collect.Multimap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.Multimap<K, V> delegate();

    protected ForwardingMultimap() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.Map<K, java.util.Collection<V>> asMap() {
        return delegate().asMap();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(java.lang.Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(java.lang.Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<java.util.Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    public java.util.Collection<V> get(K k) {
        return delegate().get(k);
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public com.google.common.collect.Multiset<K> keys() {
        return delegate().keys();
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(K k, V v) {
        return delegate().put(k, v);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(K k, java.lang.Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }

    @Override // com.google.common.collect.Multimap
    public boolean putAll(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return delegate().putAll(multimap);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public java.util.Collection<V> removeAll(java.lang.Object obj) {
        return delegate().removeAll(obj);
    }

    public java.util.Collection<V> replaceValues(K k, java.lang.Iterable<? extends V> iterable) {
        return delegate().replaceValues(k, iterable);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return delegate().size();
    }

    @Override // com.google.common.collect.Multimap
    public java.util.Collection<V> values() {
        return delegate().values();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(java.lang.Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return delegate().hashCode();
    }
}
