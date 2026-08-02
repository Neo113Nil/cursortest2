package dagger.internal;

/* loaded from: classes17.dex */
public final class SetFactory<T> implements dagger.internal.Factory<java.util.Set<T>> {
    private static final dagger.internal.Factory<java.util.Set<java.lang.Object>> getHighSpeedVideoFpsRangesFor = dagger.internal.InstanceFactory.create(java.util.Collections.emptySet());
    private final java.util.List<dagger.internal.Provider<java.util.Collection<T>>> Camera2StreamConfigurationMap;
    private final java.util.List<dagger.internal.Provider<T>> getHighSpeedVideoFpsRanges;

    /* synthetic */ SetFactory(java.util.List list, java.util.List list2, byte b) {
        this(list, list2);
    }

    public static <T> dagger.internal.Factory<java.util.Set<T>> empty() {
        return (dagger.internal.Factory<java.util.Set<T>>) getHighSpeedVideoFpsRangesFor;
    }

    public static <T> dagger.internal.SetFactory.Builder<T> builder(int i, int i2) {
        return new dagger.internal.SetFactory.Builder<>(i, i2, (byte) 0);
    }

    public static final class Builder<T> {
        private final java.util.List<dagger.internal.Provider<java.util.Collection<T>>> getHighSpeedVideoFpsRanges;
        private final java.util.List<dagger.internal.Provider<T>> getHighSpeedVideoFpsRangesFor;

        /* synthetic */ Builder(int i, int i2, byte b) {
            this(i, i2);
        }

        private Builder(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor = dagger.internal.DaggerCollections.presizedList(i);
            this.getHighSpeedVideoFpsRanges = dagger.internal.DaggerCollections.presizedList(i2);
        }

        public final dagger.internal.SetFactory.Builder<T> addProvider(dagger.internal.Provider<? extends T> provider) {
            this.getHighSpeedVideoFpsRangesFor.add(provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.SetFactory.Builder<T> addProvider(javax.inject.Provider<? extends T> provider) {
            return addProvider((dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
        }

        public final dagger.internal.SetFactory.Builder<T> addCollectionProvider(dagger.internal.Provider<? extends java.util.Collection<? extends T>> provider) {
            this.getHighSpeedVideoFpsRanges.add(provider);
            return this;
        }

        @java.lang.Deprecated
        public final dagger.internal.SetFactory.Builder<T> addCollectionProvider(javax.inject.Provider<? extends java.util.Collection<? extends T>> provider) {
            return addCollectionProvider((dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
        }

        public final dagger.internal.SetFactory<T> build() {
            return new dagger.internal.SetFactory<>(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }

    private SetFactory(java.util.List<dagger.internal.Provider<T>> list, java.util.List<dagger.internal.Provider<java.util.Collection<T>>> list2) {
        this.getHighSpeedVideoFpsRanges = list;
        this.Camera2StreamConfigurationMap = list2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.util.Set<T> get() {
        int size = this.getHighSpeedVideoFpsRanges.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.Camera2StreamConfigurationMap.size());
        int size2 = this.Camera2StreamConfigurationMap.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection<T> collection = this.Camera2StreamConfigurationMap.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet highSpeedVideoSizes = dagger.internal.DaggerCollections.getHighSpeedVideoSizes(size);
        int size3 = this.getHighSpeedVideoFpsRanges.size();
        for (int i2 = 0; i2 < size3; i2++) {
            highSpeedVideoSizes.add(dagger.internal.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRanges.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            java.util.Iterator it = ((java.util.Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                highSpeedVideoSizes.add(dagger.internal.Preconditions.checkNotNull(it.next()));
            }
        }
        return java.util.Collections.unmodifiableSet(highSpeedVideoSizes);
    }
}
