package com.paypal.oslo.core.pushnotification.di;

/* loaded from: classes5.dex */
public final class PushNotificationPermissionModule_Companion_ProvideAppStorageFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.AppStorage> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private PushNotificationPermissionModule_Companion_ProvideAppStorageFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage get() {
        return provideAppStorage(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule_Companion_ProvideAppStorageFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule_Companion_ProvideAppStorageFactory(provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(android.content.Context context) {
        return (com.paypal.oslo.core.persistence.appstorage.AppStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule.INSTANCE.provideAppStorage(context));
    }
}
