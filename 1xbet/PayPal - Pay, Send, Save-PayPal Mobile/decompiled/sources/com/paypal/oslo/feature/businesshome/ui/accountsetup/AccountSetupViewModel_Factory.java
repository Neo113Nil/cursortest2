package com.paypal.oslo.feature.businesshome.ui.accountsetup;

/* loaded from: classes11.dex */
public final class AccountSetupViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase> getHighSpeedVideoSizes;

    private AccountSetupViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider4) {
        return new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel newInstance(com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase getAccountSetupStatusUseCase, com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase isMandatoryAccountSetupCompleteUseCase, com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase completeDemoAccountSetupStepUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel(getAccountSetupStatusUseCase, isMandatoryAccountSetupCompleteUseCase, completeDemoAccountSetupStepUseCase, featureGate);
    }
}
