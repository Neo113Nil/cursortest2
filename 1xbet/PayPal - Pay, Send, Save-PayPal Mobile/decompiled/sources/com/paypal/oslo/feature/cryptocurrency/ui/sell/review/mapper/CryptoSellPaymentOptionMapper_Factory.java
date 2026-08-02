package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper;

/* loaded from: classes12.dex */
public final class CryptoSellPaymentOptionMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> Camera2StreamConfigurationMap;

    private CryptoSellPaymentOptionMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper(cryptoPriceFormatter);
    }
}
