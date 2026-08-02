package com.paypal.oslo.feature.identity.accountswitch.ui;

/* loaded from: classes12.dex */
public final class AddUserAccountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase> getHighSpeedVideoFpsRangesFor;

    private AddUserAccountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase> provider2) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase getAddUserAccountOptionsUseCase, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase generateMerchantOnboardingUrlUseCase) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel(getAddUserAccountOptionsUseCase, generateMerchantOnboardingUrlUseCase);
    }
}
