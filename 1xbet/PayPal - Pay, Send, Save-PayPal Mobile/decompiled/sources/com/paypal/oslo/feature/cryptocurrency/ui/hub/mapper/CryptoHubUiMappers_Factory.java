package com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper;

/* loaded from: classes12.dex */
public final class CryptoHubUiMappers_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper> getHighSpeedVideoSizes;

    private CryptoHubUiMappers_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper> provider4) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers newInstance(com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingUiMapper cryptoHoldingUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoMarketPriceUiMapper cryptoMarketPriceUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHoldingsTotalReturnUiMapper cryptoHoldingsTotalReturnUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.HoldingsCardActionsUiMapper holdingsCardActionsUiMapper) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers(cryptoHoldingUiMapper, cryptoMarketPriceUiMapper, cryptoHoldingsTotalReturnUiMapper, holdingsCardActionsUiMapper);
    }
}
