package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth;

/* loaded from: classes11.dex */
public final class ZettleTokenExchangeImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> Camera2StreamConfigurationMap;

    private ZettleTokenExchangeImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.TokenToCodeExchange> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl newInstance(com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl(tokenToCodeExchange);
    }
}
