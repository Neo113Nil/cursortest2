package com.paypal.oslo.core.session;

/* loaded from: classes10.dex */
public final class NetworkCacheClearerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.session.NetworkCacheClearerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.session.ApolloCacheClearer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.session.CronetCacheClearer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.session.OkHttpCacheClearer> getHighSpeedVideoFpsRangesFor;

    private NetworkCacheClearerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.session.ApolloCacheClearer> provider, dagger.internal.Provider<com.paypal.oslo.core.session.OkHttpCacheClearer> provider2, dagger.internal.Provider<com.paypal.oslo.core.session.CronetCacheClearer> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.session.NetworkCacheClearerImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.session.NetworkCacheClearerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.session.ApolloCacheClearer> provider, dagger.internal.Provider<com.paypal.oslo.core.session.OkHttpCacheClearer> provider2, dagger.internal.Provider<com.paypal.oslo.core.session.CronetCacheClearer> provider3) {
        return new com.paypal.oslo.core.session.NetworkCacheClearerImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.session.NetworkCacheClearerImpl newInstance(com.paypal.oslo.core.session.ApolloCacheClearer apolloCacheClearer, com.paypal.oslo.core.session.OkHttpCacheClearer okHttpCacheClearer, com.paypal.oslo.core.session.CronetCacheClearer cronetCacheClearer) {
        return new com.paypal.oslo.core.session.NetworkCacheClearerImpl(apolloCacheClearer, okHttpCacheClearer, cronetCacheClearer);
    }
}
