package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class AbstractMapEntry<K, V> implements java.util.Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    AbstractMapEntry() {
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return java.util.Objects.equals(getKey(), entry.getKey()) && java.util.Objects.equals(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
