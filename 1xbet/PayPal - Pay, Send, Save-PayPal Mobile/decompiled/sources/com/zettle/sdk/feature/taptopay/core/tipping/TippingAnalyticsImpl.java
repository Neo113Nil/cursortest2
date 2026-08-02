package com.zettle.sdk.feature.taptopay.core.tipping;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalyticsImpl;", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "Lcom/zettle/sdk/analytics/Analytics;", "p0", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;)V", "", "p1", "", "trackCustomTipAdded", "(Ljava/lang/String;Ljava/lang/String;)V", "trackCustomTipScreenViewed", "()V", "p2", "p3", "trackPresetScreenViewed", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trackPresetSelected", "trackTipSkipped", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/analytics/Analytics;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TippingAnalyticsImpl implements com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics Camera2StreamConfigurationMap;

    public TippingAnalyticsImpl(com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        this.Camera2StreamConfigurationMap = analytics;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics
    public final void trackPresetScreenViewed(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("amount", p0);
        jSONObject.putOpt("preset1", p1);
        jSONObject.putOpt("preset2", p2);
        jSONObject.putOpt("preset3", p3);
        this.Camera2StreamConfigurationMap.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "Tipping", "PresetScreenViewed", jSONObject));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics
    public final void trackPresetSelected(java.lang.String p0, java.lang.String p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("percentage", p0);
        jSONObject.putOpt(com.daon.sdk.face.license.License.FEATURE_POSITION, p1);
        this.Camera2StreamConfigurationMap.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "Tipping", "PresetSelected", jSONObject));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics
    public final void trackTipSkipped() {
        getHighSpeedVideoFpsRangesFor(this, "TipSkipped");
    }

    @Override // com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics
    public final void trackCustomTipScreenViewed() {
        getHighSpeedVideoFpsRangesFor(this, "CustomTipScreenViewed");
    }

    @Override // com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics
    public final void trackCustomTipAdded(java.lang.String p0, java.lang.String p1) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (p0 != null) {
            jSONObject.putOpt("percentage", p0);
        }
        if (p1 != null) {
            jSONObject.putOpt(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, p1);
        }
        this.Camera2StreamConfigurationMap.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "Tipping", "CustomTipAdded", jSONObject));
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalyticsImpl tippingAnalyticsImpl, java.lang.String str) {
        tippingAnalyticsImpl.Camera2StreamConfigurationMap.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", "Tipping", str, new org.json.JSONObject()));
    }
}
