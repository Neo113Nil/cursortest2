package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

/* loaded from: classes12.dex */
public final class CryptoHoldingsTotalReturnUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter> getHighSpeedVideoSizes;

    private CryptoHoldingsTotalReturnUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter cryptoGainLossFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper(cryptoGainLossFormatter);
    }
}
