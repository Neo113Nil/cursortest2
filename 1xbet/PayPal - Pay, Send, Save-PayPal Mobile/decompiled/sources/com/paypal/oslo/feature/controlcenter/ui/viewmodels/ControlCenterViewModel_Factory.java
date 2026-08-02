package com.paypal.oslo.feature.controlcenter.ui.viewmodels;

/* loaded from: classes12.dex */
public final class ControlCenterViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase> getHighSpeedVideoSizes;

    private ControlCenterViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase> provider5) {
        return new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel newInstance(com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase refreshUserProfileUseCase, com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase getTabContentUseCase, com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager controlCenterFeatureManager, com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase formatUserDisplayNameUseCase) {
        return new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel(getUserProfileUseCase, refreshUserProfileUseCase, getTabContentUseCase, controlCenterFeatureManager, formatUserDisplayNameUseCase);
    }
}
