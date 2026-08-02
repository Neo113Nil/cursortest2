package com.paypal.oslo.feature.starpay.di;

/* loaded from: classes15.dex */
public final class GooglePayModule_ProvideTapAndPayFactory implements dagger.internal.Factory<com.google.android.gms.tapandpay.TapAndPayClient> {
    private final dagger.internal.Provider<android.app.Activity> Camera2StreamConfigurationMap;

    private GooglePayModule_ProvideTapAndPayFactory(dagger.internal.Provider<android.app.Activity> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.google.android.gms.tapandpay.TapAndPayClient get() {
        return provideTapAndPay(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.starpay.di.GooglePayModule_ProvideTapAndPayFactory create(dagger.internal.Provider<android.app.Activity> provider) {
        return new com.paypal.oslo.feature.starpay.di.GooglePayModule_ProvideTapAndPayFactory(provider);
    }

    public static com.google.android.gms.tapandpay.TapAndPayClient provideTapAndPay(android.app.Activity activity) {
        return (com.google.android.gms.tapandpay.TapAndPayClient) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.starpay.di.GooglePayModule.INSTANCE.provideTapAndPay(activity));
    }
}
