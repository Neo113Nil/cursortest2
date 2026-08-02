package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/ZettleSDkReporterImpl;", "Lcom/zettle/sdk/ZettleSDkReporter;", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;)V", "", "action", "", "features", "", "report", "(Ljava/lang/String;Ljava/util/Set;)V", "Lcom/zettle/sdk/Configuration;", "config", "reportConfiguredFeatures", "(Lcom/zettle/sdk/Configuration;)V", "storedFeatures", "trackFeaturesChanges", "(Ljava/util/Set;Ljava/util/Set;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/analytics/Analytics;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ZettleSDkReporterImpl implements com.zettle.sdk.ZettleSDkReporter {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighResolutionOutputSizeshNQ4ISI;

    public ZettleSDkReporterImpl(com.zettle.sdk.analytics.Analytics analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        this.getHighResolutionOutputSizeshNQ4ISI = analytics;
    }

    @Override // com.zettle.sdk.ZettleSDkReporter
    public final void reportConfiguredFeatures(com.zettle.sdk.Configuration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.zettle.sdk.core.ZettleScope.scope$default(com.zettle.sdk.core.ZettleScope.INSTANCE, "sdkReporterScope", null, null, 6, null), null, null, new com.zettle.sdk.ZettleSDkReporterImpl$reportConfiguredFeatures$1(config, this, null), 3, null);
    }

    public final void trackFeaturesChanges(java.util.Set<java.lang.String> storedFeatures, java.util.Set<java.lang.String> features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storedFeatures, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "");
        java.util.Set<java.lang.String> minus = kotlin.collections.SetsKt.minus((java.util.Set) storedFeatures, (java.lang.Iterable) features);
        if (!minus.isEmpty()) {
            report(com.zettle.sdk.ZettleSDkReporterKt.ACTION_REMOVE_FEATURES, minus);
        }
        java.util.Set<java.lang.String> minus2 = kotlin.collections.SetsKt.minus((java.util.Set) features, (java.lang.Iterable) storedFeatures);
        if (minus2.isEmpty()) {
            return;
        }
        report(com.zettle.sdk.ZettleSDkReporterKt.ACTION_ADD_FEATURES, minus2);
    }

    public final void report(java.lang.String action, java.util.Set<java.lang.String> features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, "2.46.1");
        if (features != null) {
            jSONObject.put("sdkFeatures", kotlin.collections.CollectionsKt.joinToString$default(features, null, null, null, 0, null, null, 63, null));
        }
        this.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.zettle.sdk.analytics.Gdp.Event("Payments", "SDK", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, action, jSONObject));
    }
}
