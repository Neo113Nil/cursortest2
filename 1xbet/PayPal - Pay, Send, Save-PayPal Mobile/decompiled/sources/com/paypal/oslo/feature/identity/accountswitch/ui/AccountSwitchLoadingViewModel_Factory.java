package com.paypal.oslo.feature.identity.accountswitch.ui;

/* loaded from: classes12.dex */
public final class AccountSwitchLoadingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private AccountSwitchLoadingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider4) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase switchAccountUseCase, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase, com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase processStepupUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel(switchAccountUseCase, updateTokenUseCase, processStepupUseCase, appNavigator);
    }
}
