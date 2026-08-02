package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider;

/* loaded from: classes13.dex */
public final class PushTokenProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> getHighSpeedVideoFpsRanges;

    private PushTokenProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider> provider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl newInstance(com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider pushNotificationTokenProvider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushTokenProviderImpl(pushNotificationTokenProvider);
    }
}
