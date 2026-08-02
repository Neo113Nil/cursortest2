package dagger.internal;

/* loaded from: classes17.dex */
public final class MapFactory<K, V> extends dagger.internal.AbstractMapFactory<K, V, V> {
    private static final dagger.internal.Provider<java.util.Map<java.lang.Object, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI = dagger.internal.InstanceFactory.create(java.util.Collections.emptyMap());

    /* synthetic */ MapFactory(java.util.Map map, byte b) {
        this(map);
    }

    public static <K, V> dagger.internal.MapFactory.Builder<K, V> builder(int i) {
        return new dagger.internal.MapFactory.Builder<>(i, (byte) 0);
    }

    public static <K, V> dagger.internal.Provider<java.util.Map<K, V>> emptyMapProvider() {
        return (dagger.internal.Provider<java.util.Map<K, V>>) getHighResolutionOutputSizeshNQ4ISI;
    }

    private MapFactory(java.util.Map<K, dagger.internal.Provider<V>> map) {
        super(map);
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.Map<K, V> get() {
        java.util.LinkedHashMap newLinkedHashMapWithExpectedSize = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(getHighSpeedVideoSizes().size());
        for (java.util.Map.Entry<K, dagger.internal.Provider<V>> entry : getHighSpeedVideoSizes().entrySet()) {
            newLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return java.util.Collections.unmodifiableMap(newLinkedHashMapWithExpectedSize);
    }

    public static final class Builder<K, V> extends dagger.internal.AbstractMapFactory.Builder<K, V, V> {
        /* synthetic */ Builder(int i, byte b) {
            this(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public final /* bridge */ /* synthetic */ dagger.internal.AbstractMapFactory.Builder put(java.lang.Object obj, dagger.internal.Provider provider) {
            return put((dagger.internal.MapFactory.Builder<K, V>) obj, provider);
        }

        private Builder(int i) {
            super(i);
        }

        @Override // dagger.internal.AbstractMapFactory.Builder
        public final dagger.internal.MapFactory.Builder<K, V> put(K k, dagger.internal.Provider<V> provider) {
            super.put((dagger.internal.MapFactory.Builder<K, V>) k, (dagger.internal.Provider) provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.MapFactory.Builder<K, V> put(K k, javax.inject.Provider<V> provider) {
            return put((dagger.internal.MapFactory.Builder<K, V>) k, (dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public final dagger.internal.MapFactory.Builder<K, V> putAll(dagger.internal.Provider<java.util.Map<K, V>> provider) {
            super.putAll((dagger.internal.Provider) provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.MapFactory.Builder<K, V> putAll(javax.inject.Provider<java.util.Map<K, V>> provider) {
            return putAll((dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
        }

        public final dagger.internal.MapFactory<K, V> build() {
            return new dagger.internal.MapFactory<>(this.getHighSpeedVideoSizes, (byte) 0);
        }
    }
}
