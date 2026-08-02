package dagger.internal;

/* loaded from: classes5.dex */
public final class SingleCheck<T> implements dagger.internal.Provider<T> {
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private volatile java.lang.Object getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor;
    private volatile dagger.internal.Provider<T> getHighSpeedVideoSizes;

    private SingleCheck(dagger.internal.Provider<T> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final T get() {
        T t = (T) this.getHighSpeedVideoFpsRanges;
        if (t != getHighSpeedVideoFpsRangesFor) {
            return t;
        }
        dagger.internal.Provider<T> provider = this.getHighSpeedVideoSizes;
        if (provider == null) {
            return (T) this.getHighSpeedVideoFpsRanges;
        }
        T t2 = provider.get();
        this.getHighSpeedVideoFpsRanges = t2;
        this.getHighSpeedVideoSizes = null;
        return t2;
    }

    public static <T> dagger.internal.Provider<T> provider(dagger.internal.Provider<T> provider) {
        return ((provider instanceof dagger.internal.SingleCheck) || (provider instanceof dagger.internal.DoubleCheck)) ? provider : new dagger.internal.SingleCheck((dagger.internal.Provider) dagger.internal.Preconditions.checkNotNull(provider));
    }

    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P p) {
        return provider(dagger.internal.Providers.asDaggerProvider(p));
    }
}
