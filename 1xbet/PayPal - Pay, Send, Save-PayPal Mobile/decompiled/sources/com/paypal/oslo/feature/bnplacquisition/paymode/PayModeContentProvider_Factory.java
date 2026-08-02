package com.paypal.oslo.feature.bnplacquisition.paymode;

/* loaded from: classes11.dex */
public final class PayModeContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private PayModeContentProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider(context);
    }
}
