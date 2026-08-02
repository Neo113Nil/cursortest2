package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public final class MapFieldLite<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final androidx.content.preferences.protobuf.MapFieldLite<?, ?> getHighSpeedVideoSizes;
    private boolean Camera2StreamConfigurationMap;

    private MapFieldLite() {
        this.Camera2StreamConfigurationMap = true;
    }

    private MapFieldLite(java.util.Map<K, V> map) {
        super(map);
        this.Camera2StreamConfigurationMap = true;
    }

    static {
        androidx.content.preferences.protobuf.MapFieldLite<?, ?> mapFieldLite = new androidx.content.preferences.protobuf.MapFieldLite<>();
        getHighSpeedVideoSizes = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    public static <K, V> androidx.content.preferences.protobuf.MapFieldLite<K, V> emptyMapField() {
        return (androidx.content.preferences.protobuf.MapFieldLite<K, V>) getHighSpeedVideoSizes;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    public final V put(java.util.Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean equals;
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                equals = java.util.Arrays.equals((byte[]) value, (byte[]) obj2);
            } else {
                equals = value.equals(obj2);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    private static int Camera2StreamConfigurationMap(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return androidx.content.preferences.protobuf.Internal.hashCode((byte[]) obj);
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final androidx.content.preferences.protobuf.MapFieldLite<K, V> mutableCopy() {
        return isEmpty() ? new androidx.content.preferences.protobuf.MapFieldLite<>() : new androidx.content.preferences.protobuf.MapFieldLite<>(this);
    }

    public final void makeImmutable() {
        this.Camera2StreamConfigurationMap = false;
    }

    public final boolean isMutable() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (isMutable()) {
            super.clear();
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            i += Camera2StreamConfigurationMap(entry.getValue()) ^ Camera2StreamConfigurationMap(entry.getKey());
        }
        return i;
    }

    public final void mergeFrom(androidx.content.preferences.protobuf.MapFieldLite<K, V> mapFieldLite) {
        if (isMutable()) {
            if (mapFieldLite.isEmpty()) {
                return;
            }
            putAll(mapFieldLite);
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (isMutable()) {
            androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(k);
            androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(v);
            return (V) super.put(k, v);
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        if (!isMutable()) {
            throw new java.lang.UnsupportedOperationException();
        }
        for (K k : map.keySet()) {
            androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(k);
            androidx.content.preferences.protobuf.Internal.Camera2StreamConfigurationMap(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        if (isMutable()) {
            return (V) super.remove(obj);
        }
        throw new java.lang.UnsupportedOperationException();
    }
}
