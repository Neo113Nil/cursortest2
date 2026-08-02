package com.paypal.oslo.feature.packagetracking.ui.detail;

/* loaded from: classes13.dex */
public final class PackageDetailViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetUserEmailProviderUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.MarkPackageAsDeliveredUseCase> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailReducer> getOutputSizes;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.UpdatePackageNicknameUseCase> getOutputStallDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase> getOutputStallDurationlomOqCM;

    private PackageDetailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.UpdatePackageNicknameUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.MarkPackageAsDeliveredUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetUserEmailProviderUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase> provider11, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase> provider12, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailReducer> provider13, dagger.internal.Provider<androidx.view.SavedStateHandle> provider14, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider15) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getOutputStallDurationlomOqCM = provider3;
        this.getOutputStallDuration = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getHighSpeedVideoSizesFor = provider7;
        this.Camera2StreamConfigurationMap = provider8;
        this.getOutputFormats = provider9;
        this.getInputSizeshNQ4ISI = provider10;
        this.getHighResolutionOutputSizeshNQ4ISI = provider11;
        this.getOutputMinFrameDurationlomOqCM = provider12;
        this.getOutputSizes = provider13;
        this.getOutputSizeshNQ4ISI = provider14;
        this.getHighSpeedVideoFpsRanges = provider15;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getOutputStallDurationlomOqCM.get(), this.getOutputStallDuration.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputFormats.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDurationlomOqCM.get(), this.getOutputSizes.get(), this.getOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.UpdatePackageNicknameUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.MarkPackageAsDeliveredUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetUserEmailProviderUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase> provider11, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase> provider12, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailReducer> provider13, dagger.internal.Provider<androidx.view.SavedStateHandle> provider14, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider15) {
        return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel newInstance(com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase getPackageDetailPageContentUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.ComputePackageDisplayDataUseCase computePackageDisplayDataUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase removePackageUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.UpdatePackageNicknameUseCase updatePackageNicknameUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.MarkPackageAsDeliveredUseCase markPackageAsDeliveredUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCase geoCoderUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GetUserEmailProviderUseCase getUserEmailProviderUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase getEmailLinkStatusUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase markUnlinkBannerSeenUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase getUnlinkBannerSeenUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.GetAmazonTrackingPreferenceUseCase getAmazonTrackingPreferenceUseCase, com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase saveAmazonTrackingPreferenceUseCase, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailReducer packageDetailReducer, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel(getPackageDetailPageContentUseCase, computePackageDisplayDataUseCase, removePackageUseCase, updatePackageNicknameUseCase, markPackageAsDeliveredUseCase, geoCoderUseCase, getUserEmailProviderUseCase, getEmailLinkStatusUseCase, markUnlinkBannerSeenUseCase, getUnlinkBannerSeenUseCase, getAmazonTrackingPreferenceUseCase, saveAmazonTrackingPreferenceUseCase, packageDetailReducer, savedStateHandle, featureGate);
    }
}
