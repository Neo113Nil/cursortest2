package com.paypal.oslo.core.identity;

/* loaded from: classes10.dex */
public final class AccessTokenInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.core.identity.AccessTokenInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> getHighSpeedVideoSizes;

    private AccessTokenInterceptor_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.identity.AccessTokenInterceptor get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.identity.AccessTokenInterceptor_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> provider2) {
        return new com.paypal.oslo.core.identity.AccessTokenInterceptor_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.identity.AccessTokenInterceptor newInstance(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider, com.paypal.oslo.core.network.http.PayPalRequestFilter payPalRequestFilter) {
        return new com.paypal.oslo.core.identity.AccessTokenInterceptor(tokenProvider, payPalRequestFilter);
    }
}
