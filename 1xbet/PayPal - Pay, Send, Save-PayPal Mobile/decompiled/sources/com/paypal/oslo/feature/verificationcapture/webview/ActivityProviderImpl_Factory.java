package com.paypal.oslo.feature.verificationcapture.webview;

/* loaded from: classes15.dex */
public final class ActivityProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.webview.ActivityProviderImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private ActivityProviderImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.webview.ActivityProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.webview.ActivityProviderImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.verificationcapture.webview.ActivityProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.webview.ActivityProviderImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.verificationcapture.webview.ActivityProviderImpl(context);
    }
}
