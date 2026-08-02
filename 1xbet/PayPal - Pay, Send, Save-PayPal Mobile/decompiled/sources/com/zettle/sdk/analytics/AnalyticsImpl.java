package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/analytics/AnalyticsImpl;", "Lcom/zettle/sdk/analytics/Analytics;", "Lcom/zettle/sdk/analytics/AnalyticsManager;", "manager", "Lcom/zettle/sdk/analytics/Scheduler;", "scheduler", "", "Lcom/zettle/sdk/analytics/Analytics$Adapter;", "adapters", "<init>", "(Lcom/zettle/sdk/analytics/AnalyticsManager;Lcom/zettle/sdk/analytics/Scheduler;Ljava/util/Set;)V", "Lcom/zettle/sdk/analytics/Analytics$Event;", "event", "", "dispatch", "(Lcom/zettle/sdk/analytics/Analytics$Event;)V", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/AnalyticsManager;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/analytics/Scheduler;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsImpl implements com.zettle.sdk.analytics.Analytics {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<com.zettle.sdk.analytics.Analytics.Adapter> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.AnalyticsManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Scheduler Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsImpl(com.zettle.sdk.analytics.AnalyticsManager analyticsManager, com.zettle.sdk.analytics.Scheduler scheduler, java.util.Set<? extends com.zettle.sdk.analytics.Analytics.Adapter> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoSizes = analyticsManager;
        this.Camera2StreamConfigurationMap = scheduler;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
    }

    @Override // com.zettle.sdk.analytics.Analytics
    public final void dispatch(com.zettle.sdk.analytics.Analytics.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        for (com.zettle.sdk.analytics.Analytics.Adapter adapter : this.getHighResolutionOutputSizeshNQ4ISI) {
            org.json.JSONObject onCreateJson = adapter.onCreateJson(event);
            if (onCreateJson != null) {
                this.getHighSpeedVideoSizes.dispatch(adapter.getTag(), onCreateJson, this.Camera2StreamConfigurationMap);
                return;
            }
        }
        throw new java.lang.AssertionError("No adapter for event ".concat(java.lang.String.valueOf(event)));
    }
}
