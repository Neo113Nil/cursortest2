package dagger.internal;

/* loaded from: classes17.dex */
public final class MapBuilder<K, V> {
    private final java.util.Map<K, V> Camera2StreamConfigurationMap;

    private MapBuilder(int i) {
        this.Camera2StreamConfigurationMap = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(i);
    }

    public static <K, V> dagger.internal.MapBuilder<K, V> newMapBuilder(int i) {
        return new dagger.internal.MapBuilder<>(i);
    }

    public final dagger.internal.MapBuilder<K, V> put(K k, V v) {
        this.Camera2StreamConfigurationMap.put(k, v);
        return this;
    }

    public final dagger.internal.MapBuilder<K, V> putAll(java.util.Map<K, V> map) {
        this.Camera2StreamConfigurationMap.putAll(map);
        return this;
    }

    public final java.util.Map<K, V> build() {
        if (this.Camera2StreamConfigurationMap.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        return java.util.Collections.unmodifiableMap(this.Camera2StreamConfigurationMap);
    }
}
