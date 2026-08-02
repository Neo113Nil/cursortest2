package com.paypal.android.taptopay.data.thales.fcm;

/* loaded from: classes10.dex */
public final class FcmHandler_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler> getHighSpeedVideoSizes;

    public FcmHandler_Factory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler> provider2, javax.inject.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.fcm.FcmHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.data.thales.fcm.FcmHandler_Factory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler> provider2, javax.inject.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.android.taptopay.data.thales.fcm.FcmHandler_Factory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.data.thales.fcm.FcmHandler newInstance(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler, com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler pushNotificationHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.android.taptopay.data.thales.fcm.FcmHandler(pushNotificationTokenHandler, pushNotificationHandler, coroutineDispatcher);
    }
}
