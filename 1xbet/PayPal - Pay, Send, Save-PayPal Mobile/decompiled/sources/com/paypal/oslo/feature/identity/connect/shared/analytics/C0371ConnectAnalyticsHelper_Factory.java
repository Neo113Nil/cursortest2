package com.paypal.oslo.feature.identity.connect.shared.analytics;

/* renamed from: com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0371ConnectAnalyticsHelper_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory> getHighSpeedVideoSizes;

    private C0371ConnectAnalyticsHelper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    public final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper get(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return newInstance(this.getHighSpeedVideoSizes.get(), str, str2, str3);
    }

    public static com.paypal.oslo.feature.identity.connect.shared.analytics.C0371ConnectAnalyticsHelper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory> provider) {
        return new com.paypal.oslo.feature.identity.connect.shared.analytics.C0371ConnectAnalyticsHelper_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper newInstance(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsTracker.Factory factory, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectAnalyticsHelper(factory, str, str2, str3);
    }
}
