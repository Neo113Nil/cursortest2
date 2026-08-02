package com.paypal.oslo.feature.pushnotification.di;

/* loaded from: classes5.dex */
public final class PushProviderModule_ProvideDeviceIdProvider$push_notification_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl> getHighSpeedVideoSizes;

    private PushProviderModule_ProvideDeviceIdProvider$push_notification_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider get() {
        return provideDeviceIdProvider$push_notification_prodRelease(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pushnotification.di.PushProviderModule_ProvideDeviceIdProvider$push_notification_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl> provider) {
        return new com.paypal.oslo.feature.pushnotification.di.PushProviderModule_ProvideDeviceIdProvider$push_notification_prodReleaseFactory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider provideDeviceIdProvider$push_notification_prodRelease(com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl deviceIdProviderImpl) {
        return (com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.pushnotification.di.PushProviderModule.INSTANCE.provideDeviceIdProvider$push_notification_prodRelease(deviceIdProviderImpl));
    }
}
