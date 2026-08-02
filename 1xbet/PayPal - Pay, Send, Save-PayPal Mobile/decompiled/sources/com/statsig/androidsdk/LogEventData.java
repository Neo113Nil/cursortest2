package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/statsig/androidsdk/LogEventData;", "", "Ljava/util/ArrayList;", "Lcom/statsig/androidsdk/LogEvent;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "events", "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "<init>", "(Ljava/util/ArrayList;Lcom/statsig/androidsdk/StatsigMetadata;)V", "component1", "()Ljava/util/ArrayList;", "component2", "()Lcom/statsig/androidsdk/StatsigMetadata;", "copy", "(Ljava/util/ArrayList;Lcom/statsig/androidsdk/StatsigMetadata;)Lcom/statsig/androidsdk/LogEventData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "getEvents", "Lcom/statsig/androidsdk/StatsigMetadata;", "getStatsigMetadata"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LogEventData {

    @com.google.gson.annotations.SerializedName("events")
    public java.util.ArrayList<com.statsig.androidsdk.LogEvent> events;

    @com.google.gson.annotations.SerializedName("statsigMetadata")
    public com.statsig.androidsdk.StatsigMetadata statsigMetadata;

    public LogEventData(java.util.ArrayList<com.statsig.androidsdk.LogEvent> arrayList, com.statsig.androidsdk.StatsigMetadata statsigMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigMetadata, "");
        this.events = arrayList;
        this.statsigMetadata = statsigMetadata;
    }

    public final java.util.ArrayList<com.statsig.androidsdk.LogEvent> getEvents() {
        return this.events;
    }

    public final com.statsig.androidsdk.StatsigMetadata getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public /* synthetic */ LogEventData() {
    }

    public final java.lang.String toString() {
        java.util.ArrayList<com.statsig.androidsdk.LogEvent> arrayList = this.events;
        com.statsig.androidsdk.StatsigMetadata statsigMetadata = this.statsigMetadata;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogEventData(events=");
        sb.append(arrayList);
        sb.append(", statsigMetadata=");
        sb.append(statsigMetadata);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.events.hashCode() * 31) + this.statsigMetadata.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.LogEventData)) {
            return false;
        }
        com.statsig.androidsdk.LogEventData logEventData = (com.statsig.androidsdk.LogEventData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.events, logEventData.events) && kotlin.jvm.internal.Intrinsics.areEqual(this.statsigMetadata, logEventData.statsigMetadata);
    }

    public final com.statsig.androidsdk.LogEventData copy(java.util.ArrayList<com.statsig.androidsdk.LogEvent> events, com.statsig.androidsdk.StatsigMetadata statsigMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(events, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigMetadata, "");
        return new com.statsig.androidsdk.LogEventData(events, statsigMetadata);
    }

    /* renamed from: component2, reason: from getter */
    public final com.statsig.androidsdk.StatsigMetadata getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public final java.util.ArrayList<com.statsig.androidsdk.LogEvent> component1() {
        return this.events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.LogEventData copy$default(com.statsig.androidsdk.LogEventData logEventData, java.util.ArrayList arrayList, com.statsig.androidsdk.StatsigMetadata statsigMetadata, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = logEventData.events;
        }
        if ((i & 2) != 0) {
            statsigMetadata = logEventData.statsigMetadata;
        }
        return logEventData.copy(arrayList, statsigMetadata);
    }
}
