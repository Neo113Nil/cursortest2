package com.paypal.oslo.feature.cryptocurrency.ui.details.mapper;

/* loaded from: classes12.dex */
public final class AssetPriceDetailsCardActionsUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> Camera2StreamConfigurationMap;

    private AssetPriceDetailsCardActionsUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper newInstance(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper(featureGateManager);
    }
}
