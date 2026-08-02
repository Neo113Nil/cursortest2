package dagger.internal;

/* loaded from: classes17.dex */
public final class Providers {
    public static <T> dagger.internal.Provider<T> asDaggerProvider(final javax.inject.Provider<T> provider) {
        dagger.internal.Preconditions.checkNotNull(provider);
        if (provider instanceof dagger.internal.Provider) {
            return (dagger.internal.Provider) provider;
        }
        return new dagger.internal.Provider<T>() { // from class: dagger.internal.Providers.1
            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                return (T) javax.inject.Provider.this.get();
            }
        };
    }

    private Providers() {
    }
}
