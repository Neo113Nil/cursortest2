package com.paypal.oslo.feature.xoom.ui.activitydetails;

/* loaded from: classes16.dex */
public final class ActivityDetailsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase> getHighSpeedVideoSizes;

    private ActivityDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase> provider5) {
        return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel newInstance(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsReducer activityDetailsReducer, com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase validateUserUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase createActivityDetailsInitialUrlUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase, com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase setUserAgreementAcceptedUseCase) {
        return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel(activityDetailsReducer, validateUserUseCase, createActivityDetailsInitialUrlUseCase, createWebViewHeadersUseCase, setUserAgreementAcceptedUseCase);
    }
}
