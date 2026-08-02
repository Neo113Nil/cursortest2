package com.paypal.oslo.feature.cryptocurrency.ui.details.factory;

/* loaded from: classes12.dex */
public final class CryptoAssetDescriptionUiFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;

    private CryptoAssetDescriptionUiFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory newInstance(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory(featureGateManager);
    }
}
