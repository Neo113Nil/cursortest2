package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R2\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR6\u0010\u001c\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014\u0018\u00010\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R2\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010&\u001a\u00020%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R.\u0010,\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010+\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106"}, d2 = {"Lcom/statsig/androidsdk/LogEvent;", "", "", "eventName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/statsig/androidsdk/LogEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEventName", "", "metadata", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "", "secondaryExposures", "[Ljava/util/Map;", "getSecondaryExposures", "()[Ljava/util/Map;", "setSecondaryExposures", "([Ljava/util/Map;)V", "statsigMetadata", "getStatsigMetadata", "setStatsigMetadata", "", "time", "J", "getTime", "()J", "Lcom/statsig/androidsdk/StatsigUser;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "user", "Lcom/statsig/androidsdk/StatsigUser;", "getUser", "()Lcom/statsig/androidsdk/StatsigUser;", "setUser", "(Lcom/statsig/androidsdk/StatsigUser;)V", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LogEvent {

    @com.google.gson.annotations.SerializedName("eventName")
    private final java.lang.String eventName;

    @com.google.gson.annotations.SerializedName("metadata")
    private java.util.Map<java.lang.String, ? extends java.lang.Object> metadata;

    @com.google.gson.annotations.SerializedName("secondaryExposures")
    private java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures;

    @com.google.gson.annotations.SerializedName("statsigMetadata")
    private java.util.Map<java.lang.String, java.lang.String> statsigMetadata;

    @com.google.gson.annotations.SerializedName("time")
    private final long time;

    @com.google.gson.annotations.SerializedName("user")
    private com.statsig.androidsdk.StatsigUser user;

    @com.google.gson.annotations.SerializedName(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE)
    private java.lang.Object value;

    public LogEvent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.eventName = str;
        this.time = java.lang.System.currentTimeMillis();
    }

    public final java.lang.String getEventName() {
        return this.eventName;
    }

    public final java.lang.Object getValue() {
        return this.value;
    }

    public final void setValue(java.lang.Object obj) {
        this.value = obj;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        return this.metadata;
    }

    public final void setMetadata(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.metadata = map;
    }

    public final com.statsig.androidsdk.StatsigUser getUser() {
        return this.user;
    }

    public final void setUser(com.statsig.androidsdk.StatsigUser statsigUser) {
        this.user = statsigUser != null ? statsigUser.getCopyForLogging$android_sdk_release() : null;
    }

    public final long getTime() {
        return this.time;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public final void setStatsigMetadata(java.util.Map<java.lang.String, java.lang.String> map) {
        this.statsigMetadata = map;
    }

    public final java.util.Map<java.lang.String, java.lang.String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final void setSecondaryExposures(java.util.Map<java.lang.String, java.lang.String>[] mapArr) {
        this.secondaryExposures = mapArr;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.eventName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogEvent(eventName=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.eventName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.statsig.androidsdk.LogEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventName, ((com.statsig.androidsdk.LogEvent) other).eventName);
    }

    public final com.statsig.androidsdk.LogEvent copy(java.lang.String eventName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        return new com.statsig.androidsdk.LogEvent(eventName);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEventName() {
        return this.eventName;
    }

    public static /* synthetic */ com.statsig.androidsdk.LogEvent copy$default(com.statsig.androidsdk.LogEvent logEvent, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = logEvent.eventName;
        }
        return logEvent.copy(str);
    }
}
