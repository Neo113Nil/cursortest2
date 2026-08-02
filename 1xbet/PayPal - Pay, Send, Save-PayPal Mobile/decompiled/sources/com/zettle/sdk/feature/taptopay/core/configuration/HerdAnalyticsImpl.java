package com.zettle.sdk.feature.taptopay.core.configuration;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalyticsImpl;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "Lcom/zettle/sdk/analytics/Analytics;", "p0", "Lcom/zettle/sdk/analytics/Herd$Type;", "p1", "<init>", "(Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/analytics/Herd$Type;)V", "", "", "failed", "(Ljava/lang/String;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "success", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoSizes", "", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Lcom/zettle/sdk/analytics/Herd$Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class HerdAnalyticsImpl implements com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics {
    private final java.util.Map<java.lang.String, java.lang.Long> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Herd.Type getHighResolutionOutputSizeshNQ4ISI;

    public HerdAnalyticsImpl(com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.analytics.Herd.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.getHighSpeedVideoSizes = analytics;
        this.getHighResolutionOutputSizeshNQ4ISI = type;
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics
    public final void start() {
        java.lang.String obj = com.zettle.sdk.commons.UUIDFactory.createUUID1().toString();
        this.getHighSpeedVideoFpsRangesFor = obj;
        if (this.Camera2StreamConfigurationMap.containsKey(obj)) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.Long> map = this.Camera2StreamConfigurationMap;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        map.put(str, java.lang.Long.valueOf(com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime()));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics
    public final void success() {
        java.lang.Long l;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str == null || (l = (java.lang.Long) kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.Camera2StreamConfigurationMap).remove(str)) == null) {
            return;
        }
        this.getHighSpeedVideoSizes.dispatch(new com.zettle.sdk.analytics.Herd.Event(this.getHighResolutionOutputSizeshNQ4ISI, l.longValue(), com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime(), com.zettle.sdk.analytics.Herd.Result.Success.INSTANCE));
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics
    public final void failed(java.lang.String p0) {
        java.lang.Long l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str == null || (l = (java.lang.Long) kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.Camera2StreamConfigurationMap).remove(str)) == null) {
            return;
        }
        this.getHighSpeedVideoSizes.dispatch(new com.zettle.sdk.analytics.Herd.Event(this.getHighResolutionOutputSizeshNQ4ISI, l.longValue(), com.zettle.sdk.meta.Platform.INSTANCE.getClock().getCurrentWallTime(), new com.zettle.sdk.analytics.Herd.Result.Failure(p0)));
    }
}
