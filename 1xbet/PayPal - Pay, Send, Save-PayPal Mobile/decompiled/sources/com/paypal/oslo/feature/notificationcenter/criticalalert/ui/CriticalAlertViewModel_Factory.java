package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

/* loaded from: classes13.dex */
public final class CriticalAlertViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getInputSizeshNQ4ISI;

    private CriticalAlertViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider3, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> provider4, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider3, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> provider4, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider6) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel newInstance(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.GetCriticalAlertUseCase getCriticalAlertUseCase, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase trackCriticalAlertUseCase, com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver, com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer openWebDeeplinkNormalizer, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel(getCriticalAlertUseCase, trackCriticalAlertUseCase, deeplinkResolver, openWebDeeplinkNormalizer, userStore, featureGate);
    }
}
