package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider;

/* loaded from: classes13.dex */
public final class PushConsentProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> getHighSpeedVideoSizes;

    private PushConsentProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProviderImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> provider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProviderImpl newInstance(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProviderImpl(pushNotificationPermissionManager);
    }
}
