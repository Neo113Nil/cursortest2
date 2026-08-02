package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ThalesAarDependenciesModule_Companion_ProvideFcmHandlerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> {
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private ThalesAarDependenciesModule_Companion_ProvideFcmHandlerFactory(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.fcm.FcmHandler get() {
        return provideFcmHandler(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideFcmHandlerFactory create(dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule_Companion_ProvideFcmHandlerFactory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.android.taptopay.data.thales.fcm.FcmHandler provideFcmHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler, android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.android.taptopay.data.thales.fcm.FcmHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.ThalesAarDependenciesModule.INSTANCE.provideFcmHandler(pushNotificationTokenHandler, context, pushNotificationDataSource, coroutineDispatcher));
    }
}
