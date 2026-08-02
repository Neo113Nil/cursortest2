package com.paypal.oslo.feature.cryptocurrency.ui.buy.success;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0339BuySuccessViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoSizes;

    private C0339BuySuccessViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel get(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessArgs buySuccessArgs) {
        return newInstance(buySuccessArgs, this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.success.C0339BuySuccessViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.success.C0339BuySuccessViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessArgs buySuccessArgs, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel(buySuccessArgs, featureGateManager);
    }
}
