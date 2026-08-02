package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

/* loaded from: classes14.dex */
public final class CloseAccountUseCasesProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase> getHighSpeedVideoSizes;

    private CloseAccountUseCasesProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase> provider5) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider newInstance(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase getCloseAccountEligibilityUseCase, com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getCloseAccountUserProfileUseCase, com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase closeAccountUseCase, com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CreateAccountActivityLogUseCase createAccountActivityLogUseCase, com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logoutUseCase) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider(getCloseAccountEligibilityUseCase, getCloseAccountUserProfileUseCase, closeAccountUseCase, createAccountActivityLogUseCase, logoutUseCase);
    }
}
