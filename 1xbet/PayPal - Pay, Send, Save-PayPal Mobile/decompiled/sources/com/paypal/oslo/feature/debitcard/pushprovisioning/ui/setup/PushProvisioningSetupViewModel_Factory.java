package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup;

/* loaded from: classes12.dex */
public final class PushProvisioningSetupViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase> getHighSpeedVideoFpsRanges;

    private PushProvisioningSetupViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase> provider3) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel newInstance(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupReducer pushProvisioningSetupReducer, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupViewModel(pushProvisioningSetupReducer, getWalletStatusUseCase, initiatePushProvisioningUseCase);
    }
}
