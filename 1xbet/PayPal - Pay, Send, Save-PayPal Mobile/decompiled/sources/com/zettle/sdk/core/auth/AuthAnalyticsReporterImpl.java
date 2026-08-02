package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthAnalyticsReporterImpl;", "Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;", "Lcom/zettle/sdk/analytics/Analytics;", "p0", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;)V", "", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)V", "reportAuthStarted", "()V", "reportAuthSuccess", "reportVerifyStarted", "reportVerifySuccess", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/analytics/Analytics;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class AuthAnalyticsReporterImpl implements com.zettle.sdk.core.auth.AuthAnalyticsReporter {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRanges;

    public AuthAnalyticsReporterImpl(com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        this.getHighSpeedVideoFpsRanges = analytics;
    }

    @Override // com.zettle.sdk.core.auth.AuthAnalyticsReporter
    public final void reportAuthStarted() {
        getHighSpeedVideoFpsRanges("LoginStarted");
    }

    @Override // com.zettle.sdk.core.auth.AuthAnalyticsReporter
    public final void reportAuthSuccess() {
        getHighSpeedVideoFpsRanges("PerformedLogin");
    }

    @Override // com.zettle.sdk.core.auth.AuthAnalyticsReporter
    public final void reportVerifyStarted() {
        getHighSpeedVideoFpsRanges("VerificationStarted");
    }

    @Override // com.zettle.sdk.core.auth.AuthAnalyticsReporter
    public final void reportVerifySuccess() {
        getHighSpeedVideoFpsRanges("PerformedVerification");
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.String p0) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, "2.46.1");
        this.getHighSpeedVideoFpsRanges.dispatch(new com.zettle.sdk.analytics.Gdp.Event("Payments", "Authorization", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, p0, jSONObject));
    }
}
