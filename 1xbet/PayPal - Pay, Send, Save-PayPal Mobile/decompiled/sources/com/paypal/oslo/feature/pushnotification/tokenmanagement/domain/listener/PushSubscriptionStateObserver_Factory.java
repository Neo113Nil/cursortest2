package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener;

/* loaded from: classes13.dex */
public final class PushSubscriptionStateObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> getHighSpeedVideoSizes;

    private PushSubscriptionStateObserver_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes), this.Camera2StreamConfigurationMap.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> provider5) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver newInstance(com.paypal.oslo.core.identity.AuthStateProvider authStateProvider, dagger.Lazy<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> lazy, kotlinx.coroutines.CoroutineScope coroutineScope, dagger.Lazy<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase> lazy2, dagger.Lazy<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> lazy3) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver(authStateProvider, lazy, coroutineScope, lazy2, lazy3);
    }
}
