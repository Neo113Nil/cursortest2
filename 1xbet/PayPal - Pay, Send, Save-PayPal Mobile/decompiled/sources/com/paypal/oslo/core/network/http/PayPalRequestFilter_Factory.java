package com.paypal.oslo.core.network.http;

/* loaded from: classes10.dex */
public final class PayPalRequestFilter_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.PayPalRequestFilter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalDomainValidator> getHighResolutionOutputSizeshNQ4ISI;

    private PayPalRequestFilter_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalDomainValidator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.PayPalRequestFilter get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.network.http.PayPalRequestFilter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.PayPalDomainValidator> provider) {
        return new com.paypal.oslo.core.network.http.PayPalRequestFilter_Factory(provider);
    }

    public static com.paypal.oslo.core.network.http.PayPalRequestFilter newInstance(com.paypal.oslo.core.network.http.PayPalDomainValidator payPalDomainValidator) {
        return new com.paypal.oslo.core.network.http.PayPalRequestFilter(payPalDomainValidator);
    }
}
