package com.paypal.oslo.feature.taptopay.navigation;

/* loaded from: classes15.dex */
public final class PayModeLauncherImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.navigation.PayModeLauncherImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private PayModeLauncherImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.navigation.PayModeLauncherImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.navigation.PayModeLauncherImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.navigation.PayModeLauncherImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.navigation.PayModeLauncherImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.navigation.PayModeLauncherImpl(context);
    }
}
