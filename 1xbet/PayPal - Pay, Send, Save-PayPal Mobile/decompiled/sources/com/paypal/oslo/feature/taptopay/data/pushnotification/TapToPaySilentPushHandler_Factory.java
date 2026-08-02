package com.paypal.oslo.feature.taptopay.data.pushnotification;

/* loaded from: classes15.dex */
public final class TapToPaySilentPushHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> getHighSpeedVideoFpsRangesFor;

    private TapToPaySilentPushHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler newInstance(com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder payairSdkPushForwarder) {
        return new com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler(cardDataSource, payairSdkPushForwarder);
    }
}
