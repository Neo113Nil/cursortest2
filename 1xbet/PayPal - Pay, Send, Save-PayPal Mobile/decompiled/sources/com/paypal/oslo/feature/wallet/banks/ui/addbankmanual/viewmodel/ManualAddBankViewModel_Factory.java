package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

/* loaded from: classes15.dex */
public final class ManualAddBankViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase> getHighSpeedVideoSizes;

    private ManualAddBankViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel newInstance(com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase getBankDefinitionsUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase addBankManualUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase getBankDetailsUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel(getBankDefinitionsUseCase, addBankManualUseCase, getBankDetailsUseCase, userStore);
    }
}
