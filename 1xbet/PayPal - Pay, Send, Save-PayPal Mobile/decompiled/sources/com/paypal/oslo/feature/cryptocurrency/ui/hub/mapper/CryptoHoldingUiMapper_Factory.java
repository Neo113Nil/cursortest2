package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

/* loaded from: classes12.dex */
public final class CryptoHoldingUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> getHighSpeedVideoFpsRangesFor;

    private CryptoHoldingUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter cryptoPriceMovementFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper(cryptoPriceFormatter, cryptoPriceMovementFormatter);
    }
}
