package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

/* loaded from: classes12.dex */
public final class CryptoMarketPriceUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> getHighSpeedVideoSizes;

    private CryptoMarketPriceUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter cryptoPriceMovementFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper(cryptoPriceMovementFormatter, cryptoPriceFormatter);
    }
}
