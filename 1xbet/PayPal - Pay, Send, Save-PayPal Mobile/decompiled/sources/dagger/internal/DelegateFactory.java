package dagger.internal;

/* loaded from: classes5.dex */
public final class DelegateFactory<T> implements dagger.internal.Factory<T> {
    dagger.internal.Provider<T> getHighResolutionOutputSizeshNQ4ISI;

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final T get() {
        dagger.internal.Provider<T> provider = this.getHighResolutionOutputSizeshNQ4ISI;
        if (provider == null) {
            throw new java.lang.IllegalStateException();
        }
        return provider.get();
    }

    @java.lang.Deprecated
    public final void setDelegatedProvider(dagger.internal.Provider<T> provider) {
        setDelegate((dagger.internal.Provider) this, (dagger.internal.Provider) provider);
    }

    @java.lang.Deprecated
    public final void setDelegatedProvider(javax.inject.Provider<T> provider) {
        setDelegatedProvider((dagger.internal.Provider) dagger.internal.Providers.asDaggerProvider(provider));
    }

    public static <T> void setDelegate(dagger.internal.Provider<T> provider, dagger.internal.Provider<T> provider2) {
        dagger.internal.DelegateFactory delegateFactory = (dagger.internal.DelegateFactory) provider;
        dagger.internal.Preconditions.checkNotNull(provider2);
        if (delegateFactory.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException();
        }
        delegateFactory.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @java.lang.Deprecated
    public static <T> void setDelegate(javax.inject.Provider<T> provider, javax.inject.Provider<T> provider2) {
        dagger.internal.DelegateFactory delegateFactory = (dagger.internal.DelegateFactory) provider;
        dagger.internal.Provider<T> asDaggerProvider = dagger.internal.Providers.asDaggerProvider(provider2);
        dagger.internal.Preconditions.checkNotNull(asDaggerProvider);
        if (delegateFactory.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException();
        }
        delegateFactory.getHighResolutionOutputSizeshNQ4ISI = asDaggerProvider;
    }
}
