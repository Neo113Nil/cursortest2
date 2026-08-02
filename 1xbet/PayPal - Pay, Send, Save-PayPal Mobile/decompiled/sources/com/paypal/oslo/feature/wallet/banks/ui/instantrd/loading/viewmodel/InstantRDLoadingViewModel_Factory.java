package com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel;

/* loaded from: classes15.dex */
public final class InstantRDLoadingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase> getHighSpeedVideoFpsRangesFor;

    private InstantRDLoadingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase> provider) {
        return new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel newInstance(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase getBankAccountDetailsUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel(getBankAccountDetailsUseCase);
    }
}
