package com.paypal.oslo.core.session;

/* loaded from: classes10.dex */
public final class OkHttpCacheClearer_Factory implements dagger.internal.Factory<com.paypal.oslo.core.session.OkHttpCacheClearer> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRanges;

    private OkHttpCacheClearer_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.session.OkHttpCacheClearer get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.core.session.OkHttpCacheClearer_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider) {
        return new com.paypal.oslo.core.session.OkHttpCacheClearer_Factory(provider);
    }

    public static com.paypal.oslo.core.session.OkHttpCacheClearer newInstance(dagger.Lazy<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> lazy) {
        return new com.paypal.oslo.core.session.OkHttpCacheClearer(lazy);
    }
}
