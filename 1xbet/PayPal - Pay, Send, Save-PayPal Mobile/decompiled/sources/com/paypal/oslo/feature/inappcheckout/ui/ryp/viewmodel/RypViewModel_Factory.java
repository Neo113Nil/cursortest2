package com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel;

/* loaded from: classes13.dex */
public final class RypViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer> getOutputFormats;

    private RypViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker> provider7) {
        this.getOutputFormats = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel get() {
        return newInstance(this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker> provider7) {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer rypReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase authorizeBillingAgreementUseCase, com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInputFactory contingencyInputFactory, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase routeContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase, com.paypal.oslo.feature.inappcheckout.analytics.ryp.RypAnalyticsTracker rypAnalyticsTracker) {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel(rypReducer, authorizeBillingAgreementUseCase, contingencyInputFactory, routeContingencyUseCase, fundingSelectionUseCase, handleInAppLinkUseCase, rypAnalyticsTracker);
    }
}
