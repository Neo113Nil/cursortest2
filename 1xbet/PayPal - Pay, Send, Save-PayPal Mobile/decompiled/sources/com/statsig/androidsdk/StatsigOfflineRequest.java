package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/statsig/androidsdk/StatsigOfflineRequest;", "", "", "timestamp", "", "requestBody", "", "retryCount", "eventCount", "<init>", "(JLjava/lang/String;ILjava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "copy", "(JLjava/lang/String;ILjava/lang/String;)Lcom/statsig/androidsdk/StatsigOfflineRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getEventCount", "getRequestBody", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "J", "getTimestamp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsigOfflineRequest {

    @com.google.gson.annotations.SerializedName("eventCount")
    public java.lang.String eventCount;

    @com.google.gson.annotations.SerializedName("requestBody")
    public java.lang.String requestBody;

    @com.google.gson.annotations.SerializedName("retryCount")
    public int retryCount;

    @com.google.gson.annotations.SerializedName("timestamp")
    public long timestamp;

    public StatsigOfflineRequest(long j, java.lang.String str, int i, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.timestamp = j;
        this.requestBody = str;
        this.retryCount = i;
        this.eventCount = str2;
    }

    public /* synthetic */ StatsigOfflineRequest(long j, java.lang.String str, int i, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final java.lang.String getRequestBody() {
        return this.requestBody;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final java.lang.String getEventCount() {
        return this.eventCount;
    }

    public /* synthetic */ StatsigOfflineRequest() {
    }

    public final java.lang.String toString() {
        long j = this.timestamp;
        java.lang.String str = this.requestBody;
        int i = this.retryCount;
        java.lang.String str2 = this.eventCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatsigOfflineRequest(timestamp=");
        sb.append(j);
        sb.append(", requestBody=");
        sb.append(str);
        sb.append(", retryCount=");
        sb.append(i);
        sb.append(", eventCount=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.timestamp);
        int hashCode2 = this.requestBody.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.retryCount);
        java.lang.String str = this.eventCount;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.StatsigOfflineRequest)) {
            return false;
        }
        com.statsig.androidsdk.StatsigOfflineRequest statsigOfflineRequest = (com.statsig.androidsdk.StatsigOfflineRequest) other;
        return this.timestamp == statsigOfflineRequest.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.requestBody, statsigOfflineRequest.requestBody) && this.retryCount == statsigOfflineRequest.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.eventCount, statsigOfflineRequest.eventCount);
    }

    public final com.statsig.androidsdk.StatsigOfflineRequest copy(long timestamp, java.lang.String requestBody, int retryCount, java.lang.String eventCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBody, "");
        return new com.statsig.androidsdk.StatsigOfflineRequest(timestamp, requestBody, retryCount, eventCount);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEventCount() {
        return this.eventCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRequestBody() {
        return this.requestBody;
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public static /* synthetic */ com.statsig.androidsdk.StatsigOfflineRequest copy$default(com.statsig.androidsdk.StatsigOfflineRequest statsigOfflineRequest, long j, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = statsigOfflineRequest.timestamp;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = statsigOfflineRequest.requestBody;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            i = statsigOfflineRequest.retryCount;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = statsigOfflineRequest.eventCount;
        }
        return statsigOfflineRequest.copy(j2, str3, i3, str2);
    }
}
