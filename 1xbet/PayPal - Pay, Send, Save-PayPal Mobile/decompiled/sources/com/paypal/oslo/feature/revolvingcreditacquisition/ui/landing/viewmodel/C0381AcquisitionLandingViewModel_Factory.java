package com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0381AcquisitionLandingViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingReducer> getHighSpeedVideoSizes;

    private C0381AcquisitionLandingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingReducer> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel get(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs) {
        return newInstance(acquisitionLandingNavigationArgs, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.C0381AcquisitionLandingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingReducer> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.C0381AcquisitionLandingViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel newInstance(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs, com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingReducer acquisitionLandingReducer) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel(acquisitionLandingNavigationArgs, featureGateManager, acquisitionLandingReducer);
    }
}
