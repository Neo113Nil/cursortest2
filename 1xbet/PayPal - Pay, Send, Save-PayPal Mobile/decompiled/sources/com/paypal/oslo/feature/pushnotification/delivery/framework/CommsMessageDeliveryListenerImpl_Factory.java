package com.paypal.oslo.feature.pushnotification.delivery.framework;

/* loaded from: classes13.dex */
public final class CommsMessageDeliveryListenerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.framework.CommsMessageDeliveryListenerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase> getHighSpeedVideoSizes;

    private CommsMessageDeliveryListenerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.framework.CommsMessageDeliveryListenerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.framework.CommsMessageDeliveryListenerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase> provider2) {
        return new com.paypal.oslo.feature.pushnotification.delivery.framework.CommsMessageDeliveryListenerImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.framework.CommsMessageDeliveryListenerImpl newInstance(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase handleCommsPushNotificationUseCase, com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase handleSilentPushUseCase) {
        return new com.paypal.oslo.feature.pushnotification.delivery.framework.CommsMessageDeliveryListenerImpl(handleCommsPushNotificationUseCase, handleSilentPushUseCase);
    }
}
