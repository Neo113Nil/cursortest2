package com.paypal.oslo.feature.packagetracking.ui.settings;

/* loaded from: classes13.dex */
public final class PackageSettingsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeAllUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsReducer> getOutputStallDurationlomOqCM;

    private PackageSettingsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeAllUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider11, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsReducer> provider12) {
        this.getOutputMinFrameDuration = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoSizes = provider6;
        this.Camera2StreamConfigurationMap = provider7;
        this.getHighSpeedVideoSizesFor = provider8;
        this.getInputFormats = provider9;
        this.getOutputSizeshNQ4ISI = provider10;
        this.getInputSizeshNQ4ISI = provider11;
        this.getOutputStallDurationlomOqCM = provider12;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizesFor.get(), this.getInputFormats.get(), this.getOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputStallDurationlomOqCM.get());
    }

    public static com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeAllUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider11, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsReducer> provider12) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel newInstance(com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase getEmailLinkStatusUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeUseCase deAuthorizeUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase deleteImportedDataUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.DeAuthorizeAllUseCase deAuthorizeAllUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase getAuthorizationUrlUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase completeAuthorizationUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase clearUnlinkBannerSeenUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GetDeeplinkStateSettingsPageUseCase getDeeplinkStateSettingsPageUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase getAmazonTrackingPreferenceUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase saveAmazonTrackingPreferenceUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsReducer packageSettingsReducer) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel(getEmailLinkStatusUseCase, deAuthorizeUseCase, deleteImportedDataUseCase, deAuthorizeAllUseCase, getAuthorizationUrlUseCase, completeAuthorizationUseCase, clearUnlinkBannerSeenUseCase, getDeeplinkStateSettingsPageUseCase, getAmazonTrackingPreferenceUseCase, saveAmazonTrackingPreferenceUseCase, featureGate, packageSettingsReducer);
    }
}
