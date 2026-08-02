package com.paypal.oslo.feature.identity.unifiedalert.ui;

/* loaded from: classes13.dex */
public final class UnifiedAlertViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getHighSpeedVideoSizes;

    private UnifiedAlertViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager> provider5) {
        return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel newInstance(com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase unifiedAlertUseCase, com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase fetchUnifiedAlertsUseCase, com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider pushNotificationTokenProvider, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager) {
        return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel(unifiedAlertUseCase, fetchUnifiedAlertsUseCase, pushNotificationTokenProvider, getRememberedUserUseCase, alertDeduplicationManager);
    }
}
