package dagger.internal;

/* loaded from: classes17.dex */
abstract class AbstractMapFactory<K, V, V2> implements dagger.internal.Factory<java.util.Map<K, V2>> {
    private final java.util.Map<K, dagger.internal.Provider<V>> getHighResolutionOutputSizeshNQ4ISI;

    AbstractMapFactory(java.util.Map<K, dagger.internal.Provider<V>> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableMap(map);
    }

    final java.util.Map<K, dagger.internal.Provider<V>> getHighSpeedVideoSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static abstract class Builder<K, V, V2> {
        final java.util.LinkedHashMap<K, dagger.internal.Provider<V>> getHighSpeedVideoSizes;

        Builder(int i) {
            this.getHighSpeedVideoSizes = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        dagger.internal.AbstractMapFactory.Builder<K, V, V2> put(K k, dagger.internal.Provider<V> provider) {
            this.getHighSpeedVideoSizes.put(dagger.internal.Preconditions.checkNotNull(k, "key"), (dagger.internal.Provider) dagger.internal.Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        dagger.internal.AbstractMapFactory.Builder<K, V, V2> putAll(dagger.internal.Provider<java.util.Map<K, V2>> provider) {
            if (!(provider instanceof dagger.internal.DelegateFactory)) {
                this.getHighSpeedVideoSizes.putAll(((dagger.internal.AbstractMapFactory) provider).getHighResolutionOutputSizeshNQ4ISI);
                return this;
            }
            return putAll((dagger.internal.Provider) dagger.internal.Preconditions.checkNotNull(((dagger.internal.DelegateFactory) provider).getHighResolutionOutputSizeshNQ4ISI));
        }
    }
}
