package com.google.protobuf;

/* loaded from: classes4.dex */
public final class MapFieldLite<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.protobuf.MapFieldLite<?, ?> EMPTY_MAP_FIELD;
    private boolean isMutable;

    private MapFieldLite() {
        this.isMutable = true;
    }

    private MapFieldLite(java.util.Map<K, V> mapData) {
        super(mapData);
        this.isMutable = true;
    }

    static {
        com.google.protobuf.MapFieldLite<?, ?> mapFieldLite = new com.google.protobuf.MapFieldLite<>();
        EMPTY_MAP_FIELD = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    public static <K, V> com.google.protobuf.MapFieldLite<K, V> emptyMapField() {
        return (com.google.protobuf.MapFieldLite<K, V>) EMPTY_MAP_FIELD;
    }

    public void mergeFrom(com.google.protobuf.MapFieldLite<K, V> other) {
        ensureMutable();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        ensureMutable();
        com.google.protobuf.Internal.checkNotNull(k);
        com.google.protobuf.Internal.checkNotNull(v);
        return (V) super.put(k, v);
    }

    public V put(java.util.Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> m) {
        ensureMutable();
        checkForNullKeysAndValues(m);
        super.putAll(m);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    private static void checkForNullKeysAndValues(java.util.Map<?, ?> m) {
        for (java.lang.Object obj : m.keySet()) {
            com.google.protobuf.Internal.checkNotNull(obj);
            com.google.protobuf.Internal.checkNotNull(m.get(obj));
        }
    }

    private static boolean equals(java.lang.Object a2, java.lang.Object b) {
        if ((a2 instanceof byte[]) && (b instanceof byte[])) {
            return java.util.Arrays.equals((byte[]) a2, (byte[]) b);
        }
        return a2.equals(b);
    }

    static <K, V> boolean equals(java.util.Map<K, V> a2, java.util.Map<K, V> b) {
        if (a2 == b) {
            return true;
        }
        if (a2.size() != b.size()) {
            return false;
        }
        for (java.util.Map.Entry<K, V> entry : a2.entrySet()) {
            if (!b.containsKey(entry.getKey()) || !equals(entry.getValue(), b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object object) {
        return (object instanceof java.util.Map) && equals((java.util.Map) this, (java.util.Map) object);
    }

    private static int calculateHashCodeForObject(java.lang.Object a2) {
        if (a2 instanceof byte[]) {
            return com.google.protobuf.Internal.hashCode((byte[]) a2);
        }
        if (a2 instanceof com.google.protobuf.Internal.EnumLite) {
            throw new java.lang.UnsupportedOperationException();
        }
        return a2.hashCode();
    }

    static <K, V> int calculateHashCodeForMap(java.util.Map<K, V> a2) {
        int i = 0;
        for (java.util.Map.Entry<K, V> entry : a2.entrySet()) {
            i += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    private static java.lang.Object copy(java.lang.Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> java.util.Map<K, V> copy(java.util.Map<K, V> map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    public com.google.protobuf.MapFieldLite<K, V> mutableCopy() {
        return isEmpty() ? new com.google.protobuf.MapFieldLite<>() : new com.google.protobuf.MapFieldLite<>(this);
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    private void ensureMutable() {
        if (!isMutable()) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
