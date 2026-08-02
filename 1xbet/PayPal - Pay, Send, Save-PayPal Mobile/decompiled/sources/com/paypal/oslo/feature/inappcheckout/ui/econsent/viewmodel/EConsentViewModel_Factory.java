package com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel;

/* loaded from: classes13.dex */
public final class EConsentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase> getHighSpeedVideoSizes;

    private EConsentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker> provider5) {
        return new com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer eConsentReducer, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase eConsentUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase, com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker eConsentAnalyticsTracker) {
        return new com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel(eConsentReducer, appSwitchSession, eConsentUseCase, handleInAppLinkUseCase, eConsentAnalyticsTracker);
    }
}
