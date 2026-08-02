package dagger.internal;

/* loaded from: classes5.dex */
public final class DoubleCheck<T> implements dagger.internal.Provider<T>, dagger.Lazy<T> {
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private volatile dagger.internal.Provider<T> Camera2StreamConfigurationMap;
    private volatile java.lang.Object getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges;

    private DoubleCheck(dagger.internal.Provider<T> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final T get() {
        T t = (T) this.getHighResolutionOutputSizeshNQ4ISI;
        return t == getHighSpeedVideoFpsRanges ? (T) getHighSpeedVideoFpsRangesFor() : t;
    }

    private java.lang.Object getHighSpeedVideoFpsRangesFor() {
        java.lang.Object obj;
        synchronized (this) {
            obj = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj2 = getHighSpeedVideoFpsRanges;
            if (obj == obj2) {
                obj = this.Camera2StreamConfigurationMap.get();
                java.lang.Object obj3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (obj3 != obj2 && obj3 != obj) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj3);
                    sb.append(" & ");
                    sb.append(obj);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                this.getHighResolutionOutputSizeshNQ4ISI = obj;
                this.Camera2StreamConfigurationMap = null;
            }
        }
        return obj;
    }

    public static <T> dagger.internal.Provider<T> provider(dagger.internal.Provider<T> provider) {
        dagger.internal.Preconditions.checkNotNull(provider);
        return provider instanceof dagger.internal.DoubleCheck ? provider : new dagger.internal.DoubleCheck(provider);
    }

    @java.lang.Deprecated
    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P p) {
        return provider(dagger.internal.Providers.asDaggerProvider(p));
    }

    public static <T> dagger.Lazy<T> lazy(dagger.internal.Provider<T> provider) {
        if (provider instanceof dagger.Lazy) {
            return (dagger.Lazy) provider;
        }
        return new dagger.internal.DoubleCheck((dagger.internal.Provider) dagger.internal.Preconditions.checkNotNull(provider));
    }

    public static <P extends javax.inject.Provider<T>, T> dagger.Lazy<T> lazy(P p) {
        return lazy(dagger.internal.Providers.asDaggerProvider(p));
    }
}
