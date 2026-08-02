package com.paypal.oslo.core.security;

/* loaded from: classes10.dex */
public final class MagnesRiskDataProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.security.MagnesRiskDataProvider> {
    private final dagger.internal.Provider<java.util.concurrent.CountDownLatch> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<lib.android.paypal.com.magnessdk.MagnesSDK> getHighSpeedVideoSizes;

    private MagnesRiskDataProvider_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<lib.android.paypal.com.magnessdk.MagnesSDK> provider2, dagger.internal.Provider<java.util.concurrent.CountDownLatch> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.security.MagnesRiskDataProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.security.MagnesRiskDataProvider_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<lib.android.paypal.com.magnessdk.MagnesSDK> provider2, dagger.internal.Provider<java.util.concurrent.CountDownLatch> provider3) {
        return new com.paypal.oslo.core.security.MagnesRiskDataProvider_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.security.MagnesRiskDataProvider newInstance(android.content.Context context, lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK, java.util.concurrent.CountDownLatch countDownLatch) {
        return new com.paypal.oslo.core.security.MagnesRiskDataProvider(context, magnesSDK, countDownLatch);
    }
}
