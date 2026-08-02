package com.paypal.oslo.feature.balance.ui.onholddetails.router;

/* loaded from: classes11.dex */
public final class OnHoldDetailsRouterViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase> getHighSpeedVideoSizes;

    private OnHoldDetailsRouterViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider5) {
        return new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase getBalanceUseCase, com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase getTaxHoldPolicyUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        return new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel(localeInformation, getBalanceUseCase, getTaxHoldPolicyUseCase, formatCurrencyUseCase, dateTimeFormatUseCase);
    }
}
