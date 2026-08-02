package com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview;

/* loaded from: classes13.dex */
public final class NativeInAppWebViewAnalyticsTracker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper> getHighSpeedVideoFpsRanges;

    private NativeInAppWebViewAnalyticsTracker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper> provider) {
        return new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker newInstance(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper analyticsContextMapper) {
        return new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker(analyticsContextMapper);
    }
}
