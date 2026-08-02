package com.paypal.oslo.feature.balance.ui.autoReload.amount;

/* loaded from: classes11.dex */
public final class AmountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private AmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel(formatCurrencyUseCase);
    }
}
