package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

/* loaded from: classes12.dex */
public final class CryptoGainLossFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighSpeedVideoSizes;

    private CryptoGainLossFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter(cryptoPriceFormatter);
    }
}
