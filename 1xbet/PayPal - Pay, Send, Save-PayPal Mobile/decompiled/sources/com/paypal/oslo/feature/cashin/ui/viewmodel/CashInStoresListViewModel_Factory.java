package com.paypal.oslo.feature.cashin.ui.viewmodel;

/* loaded from: classes11.dex */
public final class CashInStoresListViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoFpsRangesFor;

    private CashInStoresListViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel newInstance(com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase getCashInRetailersUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel(getCashInRetailersUseCase, formatCurrencyUseCase, localeInformation);
    }
}
