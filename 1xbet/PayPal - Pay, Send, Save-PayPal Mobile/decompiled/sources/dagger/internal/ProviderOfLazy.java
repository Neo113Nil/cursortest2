package dagger.internal;

/* loaded from: classes17.dex */
public final class ProviderOfLazy<T> implements dagger.internal.Provider<dagger.Lazy<T>> {
    private final dagger.internal.Provider<T> getHighSpeedVideoSizes;

    private ProviderOfLazy(dagger.internal.Provider<T> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final dagger.Lazy<T> get() {
        return dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes);
    }

    public static <T> dagger.internal.Provider<dagger.Lazy<T>> create(dagger.internal.Provider<T> provider) {
        return new dagger.internal.ProviderOfLazy((dagger.internal.Provider) dagger.internal.Preconditions.checkNotNull(provider));
    }

    @java.lang.Deprecated
    public static <T> dagger.internal.Provider<dagger.Lazy<T>> create(javax.inject.Provider<T> provider) {
        return create(dagger.internal.Providers.asDaggerProvider(provider));
    }
}
