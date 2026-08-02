package com.paypal.oslo.feature.businessprofile.ui.provider;

/* loaded from: classes11.dex */
public final class BusinessProfileTabContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> getHighSpeedVideoFpsRangesFor;

    private BusinessProfileTabContentProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider2) {
        return new com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider newInstance(com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager businessProfileFeatureGatesManager, com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        return new com.paypal.oslo.feature.businessprofile.ui.provider.BusinessProfileTabContentProvider(businessProfileFeatureGatesManager, businessInventoryFeatureGateManager);
    }
}
