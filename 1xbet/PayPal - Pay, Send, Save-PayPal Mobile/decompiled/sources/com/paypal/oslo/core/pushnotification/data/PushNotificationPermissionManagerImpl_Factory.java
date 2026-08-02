package com.paypal.oslo.core.pushnotification.data;

/* loaded from: classes10.dex */
public final class PushNotificationPermissionManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoSizes;

    private PushNotificationPermissionManagerImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider2, dagger.internal.Provider<java.lang.Integer> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get().intValue(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider2, dagger.internal.Provider<java.lang.Integer> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl newInstance(android.content.Context context, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, int i, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl(context, appStorage, i, coroutineDispatcher);
    }
}
