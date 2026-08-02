package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/ui/ZettleActivityReporterImpl;", "Lcom/zettle/sdk/ui/ZettleActivityReporter;", "Lcom/zettle/sdk/analytics/Analytics;", "p0", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;)V", "", "", "reportUnexpectedActivityFinish", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/analytics/Analytics;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ZettleActivityReporterImpl implements com.zettle.sdk.ui.ZettleActivityReporter {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics Camera2StreamConfigurationMap;

    public ZettleActivityReporterImpl(com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        this.Camera2StreamConfigurationMap = analytics;
    }

    @Override // com.zettle.sdk.ui.ZettleActivityReporter
    public final void reportUnexpectedActivityFinish(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, "2.46.1");
        if (p0 != null) {
            jSONObject.put("failureReason", p0);
        }
        this.Camera2StreamConfigurationMap.dispatch(new com.zettle.sdk.analytics.Gdp.Event("Payments", "SDK", "ZettleActivity", "FinishedActivity", jSONObject));
    }
}
