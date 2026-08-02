package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

/* loaded from: classes11.dex */
public final class UprInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> getHighSpeedVideoSizes;

    private UprInterceptor_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor newInstance(com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor(tokenToCodeExchange);
    }
}
