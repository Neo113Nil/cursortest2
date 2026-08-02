package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

/* loaded from: classes14.dex */
public final class CloseAccountWebViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider> getHighResolutionOutputSizeshNQ4ISI;

    private CloseAccountWebViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider> provider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel newInstance(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel(closeAccountUseCasesProvider);
    }
}
