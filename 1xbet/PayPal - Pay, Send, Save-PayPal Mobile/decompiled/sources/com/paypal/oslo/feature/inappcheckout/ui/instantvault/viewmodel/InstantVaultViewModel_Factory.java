package com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel;

/* loaded from: classes13.dex */
public final class InstantVaultViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase> getHighSpeedVideoFpsRangesFor;

    private InstantVaultViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer.InstantVaultReducer instantVaultReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase authorizeBillingAgreementUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel(instantVaultReducer, authorizeBillingAgreementUseCase);
    }
}
