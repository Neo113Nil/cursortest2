package com.paypal.oslo.app.contextheader;

/* loaded from: classes10.dex */
public final class ContextHeadersInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.app.contextheader.ContextHeadersInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.app.contextheader.ContextHeadersProvider> getHighSpeedVideoFpsRangesFor;

    private ContextHeadersInterceptor_Factory(dagger.internal.Provider<com.paypal.oslo.app.contextheader.ContextHeadersProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.contextheader.ContextHeadersInterceptor get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.app.contextheader.ContextHeadersInterceptor_Factory create(dagger.internal.Provider<com.paypal.oslo.app.contextheader.ContextHeadersProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> provider2) {
        return new com.paypal.oslo.app.contextheader.ContextHeadersInterceptor_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.contextheader.ContextHeadersInterceptor newInstance(com.paypal.oslo.app.contextheader.ContextHeadersProvider contextHeadersProvider, com.paypal.oslo.core.network.http.PayPalRequestFilter payPalRequestFilter) {
        return new com.paypal.oslo.app.contextheader.ContextHeadersInterceptor(contextHeadersProvider, payPalRequestFilter);
    }
}
