package com.paypal.oslo.feature.starpay.ui;

/* loaded from: classes15.dex */
public final class GooglePayClient_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.starpay.ui.GooglePayClient> {
    private final dagger.internal.Provider<com.google.android.gms.tapandpay.TapAndPayClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.app.Activity> getHighSpeedVideoSizes;

    private GooglePayClient_Factory(dagger.internal.Provider<android.app.Activity> provider, dagger.internal.Provider<com.google.android.gms.tapandpay.TapAndPayClient> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.starpay.ui.GooglePayClient get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.starpay.ui.GooglePayClient_Factory create(dagger.internal.Provider<android.app.Activity> provider, dagger.internal.Provider<com.google.android.gms.tapandpay.TapAndPayClient> provider2) {
        return new com.paypal.oslo.feature.starpay.ui.GooglePayClient_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.starpay.ui.GooglePayClient newInstance(android.app.Activity activity, com.google.android.gms.tapandpay.TapAndPayClient tapAndPayClient) {
        return new com.paypal.oslo.feature.starpay.ui.GooglePayClient(activity, tapAndPayClient);
    }
}
