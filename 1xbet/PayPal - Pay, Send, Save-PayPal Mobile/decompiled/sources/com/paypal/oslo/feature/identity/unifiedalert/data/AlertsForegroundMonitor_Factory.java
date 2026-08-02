package com.paypal.oslo.feature.identity.unifiedalert.data;

/* loaded from: classes13.dex */
public final class AlertsForegroundMonitor_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.view.Lifecycle> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> getOutputMinFrameDuration;

    private AlertsForegroundMonitor_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager> provider5, dagger.internal.Provider<androidx.view.Lifecycle> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider7) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getInputFormats = provider6;
        this.Camera2StreamConfigurationMap = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager> provider5, dagger.internal.Provider<androidx.view.Lifecycle> provider6, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider7) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor newInstance(com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase fetchUnifiedAlertsUseCase, com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider pushNotificationTokenProvider, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager, androidx.view.Lifecycle lifecycle, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor(fetchUnifiedAlertsUseCase, pushNotificationTokenProvider, getRememberedUserUseCase, appNavigator, alertDeduplicationManager, lifecycle, coroutineDispatcher);
    }
}
