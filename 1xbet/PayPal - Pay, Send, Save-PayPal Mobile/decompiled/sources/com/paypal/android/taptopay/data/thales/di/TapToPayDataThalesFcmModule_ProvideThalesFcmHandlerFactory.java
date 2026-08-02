package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes10.dex */
public final class TapToPayDataThalesFcmModule_ProvideThalesFcmHandlerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.fcm.FcmHandler> {
    private final com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesFcmModule Camera2StreamConfigurationMap;
    private final javax.inject.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> getHighSpeedVideoFpsRangesFor;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> getHighSpeedVideoSizes;

    public TapToPayDataThalesFcmModule_ProvideThalesFcmHandlerFactory(com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesFcmModule tapToPayDataThalesFcmModule, javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider3) {
        this.Camera2StreamConfigurationMap = tapToPayDataThalesFcmModule;
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.fcm.FcmHandler get() {
        return provideThalesFcmHandler(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesFcmModule_ProvideThalesFcmHandlerFactory create(com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesFcmModule tapToPayDataThalesFcmModule, javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider3) {
        return new com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesFcmModule_ProvideThalesFcmHandlerFactory(tapToPayDataThalesFcmModule, provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.data.thales.fcm.FcmHandler provideThalesFcmHandler(com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesFcmModule tapToPayDataThalesFcmModule, android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource) {
        return (com.paypal.android.taptopay.data.thales.fcm.FcmHandler) dagger.internal.Preconditions.checkNotNullFromProvides(tapToPayDataThalesFcmModule.provideThalesFcmHandler(context, pushNotificationTokenDataSource, pushNotificationDataSource));
    }
}
