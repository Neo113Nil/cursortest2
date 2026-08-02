package dagger.internal;

/* loaded from: classes17.dex */
public final class LazyClassKeyMap<V> implements java.util.Map<java.lang.Class<?>, V> {
    private final java.util.Map<java.lang.String, V> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Class<?> cls, java.lang.Object obj) {
        return put2(cls, (java.lang.Class<?>) obj);
    }

    public static <V> java.util.Map<java.lang.Class<?>, V> of(java.util.Map<java.lang.String, V> map) {
        return new dagger.internal.LazyClassKeyMap(map);
    }

    private LazyClassKeyMap(java.util.Map<java.lang.String, V> map) {
        this.getHighSpeedVideoSizes = map;
    }

    @Override // java.util.Map
    public final V get(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalArgumentException("Key must be a class");
        }
        return this.getHighSpeedVideoSizes.get(((java.lang.Class) obj).getName());
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.Class<?>> keySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return this.getHighSpeedVideoSizes.values();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalArgumentException("Key must be a class");
        }
        return this.getHighSpeedVideoSizes.containsKey(((java.lang.Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.getHighSpeedVideoSizes.containsValue(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.Class<?>, V>> entrySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public final V put2(java.lang.Class<?> cls, V v) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.Class<?>, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public static class MapFactory<V> implements dagger.internal.Factory<java.util.Map<java.lang.Class<?>, V>> {
        dagger.internal.Factory<java.util.Map<java.lang.String, V>> getHighResolutionOutputSizeshNQ4ISI;

        public static <V> dagger.internal.LazyClassKeyMap.MapFactory<V> of(dagger.internal.Factory<java.util.Map<java.lang.String, V>> factory) {
            return new dagger.internal.LazyClassKeyMap.MapFactory<>(factory);
        }

        private MapFactory(dagger.internal.Factory<java.util.Map<java.lang.String, V>> factory) {
            this.getHighResolutionOutputSizeshNQ4ISI = factory;
        }

        @Override // javax.inject.Provider, jakarta.inject.Provider
        public java.util.Map<java.lang.Class<?>, V> get() {
            return dagger.internal.LazyClassKeyMap.of(this.getHighResolutionOutputSizeshNQ4ISI.get());
        }
    }

    public static class MapProviderFactory<V> implements dagger.internal.Factory<java.util.Map<java.lang.Class<?>, dagger.internal.Provider<V>>> {
        dagger.internal.Factory<java.util.Map<java.lang.String, dagger.internal.Provider<V>>> getHighSpeedVideoFpsRanges;

        public static <V> dagger.internal.LazyClassKeyMap.MapProviderFactory<V> of(dagger.internal.Factory<java.util.Map<java.lang.String, dagger.internal.Provider<V>>> factory) {
            return new dagger.internal.LazyClassKeyMap.MapProviderFactory<>(factory);
        }

        private MapProviderFactory(dagger.internal.Factory<java.util.Map<java.lang.String, dagger.internal.Provider<V>>> factory) {
            this.getHighSpeedVideoFpsRanges = factory;
        }

        @Override // javax.inject.Provider, jakarta.inject.Provider
        public java.util.Map<java.lang.Class<?>, dagger.internal.Provider<V>> get() {
            return dagger.internal.LazyClassKeyMap.of(this.getHighSpeedVideoFpsRanges.get());
        }
    }
}
