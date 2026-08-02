package dagger.internal;

/* loaded from: classes17.dex */
public final class MapLazyFactory<K, V> extends dagger.internal.AbstractMapFactory<K, V, dagger.Lazy<V>> {
    private static final dagger.internal.Provider<java.util.Map<java.lang.Object, java.lang.Object>> getHighSpeedVideoFpsRangesFor = dagger.internal.InstanceFactory.create(java.util.Collections.emptyMap());

    /* synthetic */ MapLazyFactory(java.util.Map map, byte b) {
        this(map);
    }

    public static <K, V> dagger.internal.MapLazyFactory.Builder<K, V> builder(int i) {
        return new dagger.internal.MapLazyFactory.Builder<>(i, (byte) 0);
    }

    public static <K, V> dagger.internal.Provider<java.util.Map<K, dagger.Lazy<V>>> emptyMapProvider() {
        return (dagger.internal.Provider<java.util.Map<K, dagger.Lazy<V>>>) getHighSpeedVideoFpsRangesFor;
    }

    private MapLazyFactory(java.util.Map<K, dagger.internal.Provider<V>> map) {
        super(map);
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.Map<K, dagger.Lazy<V>> get() {
        java.util.LinkedHashMap newLinkedHashMapWithExpectedSize = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(getHighSpeedVideoSizes().size());
        for (java.util.Map.Entry<K, dagger.internal.Provider<V>> entry : getHighSpeedVideoSizes().entrySet()) {
            newLinkedHashMapWithExpectedSize.put(entry.getKey(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) entry.getValue()));
        }
        return java.util.Collections.unmodifiableMap(newLinkedHashMapWithExpectedSize);
    }

    public static final class Builder<K, V> extends dagger.internal.AbstractMapFactory.Builder<K, V, dagger.Lazy<V>> {
        /* synthetic */ Builder(int i, byte b) {
            this(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public final /* bridge */ /* synthetic */ dagger.internal.AbstractMapFactory.Builder put(java.lang.Object obj, dagger.internal.Provider provider) {
            return put((dagger.internal.MapLazyFactory.Builder<K, V>) obj, provider);
        }

        private Builder(int i) {
            super(i);
        }

        @Override // dagger.internal.AbstractMapFactory.Builder
        public final dagger.internal.MapLazyFactory.Builder<K, V> put(K k, dagger.internal.Provider<V> provider) {
            super.put((dagger.internal.MapLazyFactory.Builder<K, V>) k, (dagger.internal.Provider) provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.MapLazyFactory.Builder<K, V> put(K k, javax.inject.Provider<V> provider) {
            return put((dagger.internal.MapLazyFactory.Builder<K, V>) k, (dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public final dagger.internal.MapLazyFactory.Builder<K, V> putAll(dagger.internal.Provider<java.util.Map<K, dagger.Lazy<V>>> provider) {
            super.putAll((dagger.internal.Provider) provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.MapLazyFactory.Builder<K, V> putAll(javax.inject.Provider<java.util.Map<K, dagger.Lazy<V>>> provider) {
            return putAll((dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
        }

        public final dagger.internal.MapLazyFactory<K, V> build() {
            return new dagger.internal.MapLazyFactory<>(this.getHighSpeedVideoSizes, (byte) 0);
        }
    }
}
