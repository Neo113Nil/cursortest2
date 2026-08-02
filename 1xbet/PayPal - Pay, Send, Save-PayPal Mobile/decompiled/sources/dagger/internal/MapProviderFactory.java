package dagger.internal;

/* loaded from: classes17.dex */
public final class MapProviderFactory<K, V> extends dagger.internal.AbstractMapFactory<K, V, dagger.internal.Provider<V>> implements dagger.Lazy<java.util.Map<K, dagger.internal.Provider<V>>> {
    /* synthetic */ MapProviderFactory(java.util.Map map, byte b) {
        this(map);
    }

    public static <K, V> dagger.internal.MapProviderFactory.Builder<K, V> builder(int i) {
        return new dagger.internal.MapProviderFactory.Builder<>(i, (byte) 0);
    }

    private MapProviderFactory(java.util.Map<K, dagger.internal.Provider<V>> map) {
        super(map);
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.Map<K, dagger.internal.Provider<V>> get() {
        return getHighSpeedVideoSizes();
    }

    public static final class Builder<K, V> extends dagger.internal.AbstractMapFactory.Builder<K, V, dagger.internal.Provider<V>> {
        /* synthetic */ Builder(int i, byte b) {
            this(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public final /* bridge */ /* synthetic */ dagger.internal.AbstractMapFactory.Builder put(java.lang.Object obj, dagger.internal.Provider provider) {
            return put((dagger.internal.MapProviderFactory.Builder<K, V>) obj, provider);
        }

        private Builder(int i) {
            super(i);
        }

        @Override // dagger.internal.AbstractMapFactory.Builder
        public final dagger.internal.MapProviderFactory.Builder<K, V> put(K k, dagger.internal.Provider<V> provider) {
            super.put((dagger.internal.MapProviderFactory.Builder<K, V>) k, (dagger.internal.Provider) provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.MapProviderFactory.Builder<K, V> put(K k, javax.inject.Provider<V> provider) {
            return put((dagger.internal.MapProviderFactory.Builder<K, V>) k, (dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public final dagger.internal.MapProviderFactory.Builder<K, V> putAll(dagger.internal.Provider<java.util.Map<K, dagger.internal.Provider<V>>> provider) {
            super.putAll((dagger.internal.Provider) provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.MapProviderFactory.Builder<K, V> putAll(final javax.inject.Provider<java.util.Map<K, javax.inject.Provider<V>>> provider) {
            return putAll((dagger.internal.Provider) new dagger.internal.Provider<java.util.Map<K, dagger.internal.Provider<V>>>() { // from class: dagger.internal.MapProviderFactory.Builder.1
                @Override // javax.inject.Provider, jakarta.inject.Provider
                public /* synthetic */ java.lang.Object get() {
                    java.util.Map map = (java.util.Map) provider.get();
                    if (map.isEmpty()) {
                        return java.util.Collections.emptyMap();
                    }
                    java.util.LinkedHashMap newLinkedHashMapWithExpectedSize = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(map.size());
                    for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                        newLinkedHashMapWithExpectedSize.put(entry.getKey(), dagger.internal.Providers.asDaggerProvider((javax.inject.Provider) entry.getValue()));
                    }
                    return java.util.Collections.unmodifiableMap(newLinkedHashMapWithExpectedSize);
                }
            });
        }

        public final dagger.internal.MapProviderFactory<K, V> build() {
            return new dagger.internal.MapProviderFactory<>(this.getHighSpeedVideoSizes, (byte) 0);
        }
    }
}
