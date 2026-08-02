package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingMapEntry<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map.Entry<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public K getKey() {
        return delegate().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return delegate().getValue();
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        return delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    protected boolean standardEquals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return java.util.Objects.equals(getKey(), entry.getKey()) && java.util.Objects.equals(getValue(), entry.getValue());
    }

    protected int standardHashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    protected java.lang.String standardToString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
