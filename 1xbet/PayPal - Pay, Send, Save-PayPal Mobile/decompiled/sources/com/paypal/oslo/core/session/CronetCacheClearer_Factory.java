package com.paypal.oslo.core.session;

/* loaded from: classes10.dex */
public final class CronetCacheClearer_Factory implements dagger.internal.Factory<com.paypal.oslo.core.session.CronetCacheClearer> {
    private final dagger.internal.Provider<java.io.File> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> getHighSpeedVideoFpsRangesFor;

    private CronetCacheClearer_Factory(dagger.internal.Provider<java.io.File> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.session.CronetCacheClearer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.core.session.CronetCacheClearer_Factory create(dagger.internal.Provider<java.io.File> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> provider2) {
        return new com.paypal.oslo.core.session.CronetCacheClearer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.session.CronetCacheClearer newInstance(java.io.File file, dagger.Lazy<com.paypal.oslo.core.network.http.config.HttpConfig> lazy) {
        return new com.paypal.oslo.core.session.CronetCacheClearer(file, lazy);
    }
}
