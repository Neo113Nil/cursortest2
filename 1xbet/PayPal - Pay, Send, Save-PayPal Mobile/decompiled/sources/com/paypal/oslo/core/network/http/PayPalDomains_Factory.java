package com.paypal.oslo.core.network.http;

/* loaded from: classes10.dex */
public final class PayPalDomains_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.PayPalDomains> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.PayPalDomains get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.network.http.PayPalDomains_Factory create() {
        return com.paypal.oslo.core.network.http.PayPalDomains_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.network.http.PayPalDomains newInstance() {
        return new com.paypal.oslo.core.network.http.PayPalDomains();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.network.http.PayPalDomains_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.network.http.PayPalDomains_Factory();

        private InstanceHolder() {
        }
    }
}
