package com.paypal.oslo.feature.balance.ui.balanceDashboard;

/* loaded from: classes11.dex */
public final class BalanceDashboardViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase> getOutputMinFrameDuration;

    private BalanceDashboardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer> provider10) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoSizesFor = provider6;
        this.Camera2StreamConfigurationMap = provider7;
        this.getHighSpeedVideoFpsRanges = provider8;
        this.getHighResolutionOutputSizeshNQ4ISI = provider9;
        this.getInputFormats = provider10;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get());
    }

    public static com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer> provider10) {
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel newInstance(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase getBalanceUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase getNbaDomainRecommendationsUseCase, com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase getTaxHoldPolicyUseCase, com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardReducer balanceDashboardReducer) {
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel(iActivityWidgetProvider, getBalanceUseCase, getAccountTypeUseCase, getAutoReloadInitialConfigUseCase, getNbaDomainRecommendationsUseCase, getTaxHoldPolicyUseCase, checkAccountRoutingEligibilityUseCase, balanceFeatureManager, formatCurrencyUseCase, balanceDashboardReducer);
    }
}
