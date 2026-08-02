package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u0007\b\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/Analytics;", "", "Lcom/zettle/sdk/analytics/Analytics$Event;", "event", "", "dispatch", "(Lcom/zettle/sdk/analytics/Analytics$Event;)V", "Adapter", "Builder", "Event"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Analytics {

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/analytics/Analytics$Adapter;", "", "Lcom/zettle/sdk/analytics/Analytics$Event;", "event", "Lorg/json/JSONObject;", "onCreateJson", "(Lcom/zettle/sdk/analytics/Analytics$Event;)Lorg/json/JSONObject;", "", "getTag", "()Ljava/lang/String;", "tag"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Adapter {
        java.lang.String getTag();

        org.json.JSONObject onCreateJson(com.zettle.sdk.analytics.Analytics.Event event);
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/zettle/sdk/analytics/Analytics$Event;", ""}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Event {
    }

    void dispatch(com.zettle.sdk.analytics.Analytics.Event event);

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001f"}, d2 = {"Lcom/zettle/sdk/analytics/Analytics$Builder;", "", "Landroid/content/Context;", "context", "", "isDebug", "<init>", "(Landroid/content/Context;Z)V", "Lcom/zettle/sdk/analytics/Analytics$Adapter;", "adapter", "(Lcom/zettle/sdk/analytics/Analytics$Adapter;)Lcom/zettle/sdk/analytics/Analytics$Builder;", "allowRoaming", "()Lcom/zettle/sdk/analytics/Analytics$Builder;", "Lcom/zettle/sdk/analytics/Analytics;", "build", "()Lcom/zettle/sdk/analytics/Analytics;", "", "interval", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lcom/zettle/sdk/analytics/Analytics$Builder;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "J", "Ljava/util/concurrent/TimeUnit;", "Z", "getInputFormats", "getHighSpeedVideoSizesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final android.content.Context Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.util.Set<com.zettle.sdk.analytics.Analytics.Adapter> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private long getHighSpeedVideoFpsRanges;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizesFor;

        public Builder(android.content.Context context, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            this.Camera2StreamConfigurationMap = context;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashSet();
            this.getHighSpeedVideoFpsRanges = 30L;
            this.getHighSpeedVideoSizes = java.util.concurrent.TimeUnit.MINUTES;
            this.getHighSpeedVideoSizesFor = true;
        }

        public final com.zettle.sdk.analytics.Analytics.Builder adapter(com.zettle.sdk.analytics.Analytics.Adapter adapter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
            this.getHighSpeedVideoFpsRangesFor.add(adapter);
            return this;
        }

        public final com.zettle.sdk.analytics.Analytics.Builder interval(long interval, java.util.concurrent.TimeUnit unit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            this.getHighSpeedVideoFpsRanges = interval;
            this.getHighSpeedVideoSizes = unit;
            return this;
        }

        public final com.zettle.sdk.analytics.Analytics.Builder allowRoaming() {
            this.getHighSpeedVideoSizesFor = false;
            return this;
        }

        public final com.zettle.sdk.analytics.Analytics build() {
            return new com.zettle.sdk.analytics.AnalyticsImpl(com.zettle.sdk.analytics.AnalyticsManager.INSTANCE.getInstance(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI), com.zettle.sdk.analytics.Scheduler.INSTANCE.create(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
