package com.paypal.oslo.app.network;

/* loaded from: classes10.dex */
public final class RequestIdInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.app.network.RequestIdInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> getHighResolutionOutputSizeshNQ4ISI;

    private RequestIdInterceptor_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.network.RequestIdInterceptor get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.network.RequestIdInterceptor_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalRequestFilter> provider) {
        return new com.paypal.oslo.app.network.RequestIdInterceptor_Factory(provider);
    }

    public static com.paypal.oslo.app.network.RequestIdInterceptor newInstance(com.paypal.oslo.core.network.http.PayPalRequestFilter payPalRequestFilter) {
        return new com.paypal.oslo.app.network.RequestIdInterceptor(payPalRequestFilter);
    }
}
