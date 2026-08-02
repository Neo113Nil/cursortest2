package com.paypal.oslo.feature.inappcheckout.analytics.econsent;

/* loaded from: classes13.dex */
public final class EConsentAnalyticsTracker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper> getHighSpeedVideoFpsRanges;

    private EConsentAnalyticsTracker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper> provider) {
        return new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker newInstance(com.paypal.oslo.feature.inappcheckout.analytics.AnalyticsContextMapper analyticsContextMapper) {
        return new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker(analyticsContextMapper);
    }
}
