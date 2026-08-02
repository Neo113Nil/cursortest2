package com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel;

/* loaded from: classes13.dex */
public final class ProfileViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase> getHighSpeedVideoSizes;

    private ProfileViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.profile.reducer.ProfileReducer profileReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase logoutUseCase, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel(profileReducer, logoutUseCase, inAppCheckoutStringsProvider, handleInAppLinkUseCase);
    }
}
