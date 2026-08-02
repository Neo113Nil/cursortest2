package com.datadog.android.rum.metric.networksettled;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/metric/networksettled/NetworkSettledResourceContext;", "", "", "resourceId", "", "eventCreatedAtNanos", "viewCreatedTimestamp", "<init>", "(Ljava/lang/String;JLjava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;JLjava/lang/Long;)Lcom/datadog/android/rum/metric/networksettled/NetworkSettledResourceContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getEventCreatedAtNanos", "Ljava/lang/String;", "getResourceId", "Ljava/lang/Long;", "getViewCreatedTimestamp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class NetworkSettledResourceContext {
    private final long eventCreatedAtNanos;
    private final java.lang.String resourceId;
    private final java.lang.Long viewCreatedTimestamp;

    public NetworkSettledResourceContext(java.lang.String str, long j, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.resourceId = str;
        this.eventCreatedAtNanos = j;
        this.viewCreatedTimestamp = l;
    }

    public final java.lang.String getResourceId() {
        return this.resourceId;
    }

    public final long getEventCreatedAtNanos() {
        return this.eventCreatedAtNanos;
    }

    public final java.lang.Long getViewCreatedTimestamp() {
        return this.viewCreatedTimestamp;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.resourceId;
        long j = this.eventCreatedAtNanos;
        java.lang.Long l = this.viewCreatedTimestamp;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkSettledResourceContext(resourceId=");
        sb.append(str);
        sb.append(", eventCreatedAtNanos=");
        sb.append(j);
        sb.append(", viewCreatedTimestamp=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.resourceId.hashCode();
        int hashCode2 = java.lang.Long.hashCode(this.eventCreatedAtNanos);
        java.lang.Long l = this.viewCreatedTimestamp;
        return (((hashCode * 31) + hashCode2) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext)) {
            return false;
        }
        com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext networkSettledResourceContext = (com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, networkSettledResourceContext.resourceId) && this.eventCreatedAtNanos == networkSettledResourceContext.eventCreatedAtNanos && kotlin.jvm.internal.Intrinsics.areEqual(this.viewCreatedTimestamp, networkSettledResourceContext.viewCreatedTimestamp);
    }

    public final com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext copy(java.lang.String resourceId, long eventCreatedAtNanos, java.lang.Long viewCreatedTimestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
        return new com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext(resourceId, eventCreatedAtNanos, viewCreatedTimestamp);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getViewCreatedTimestamp() {
        return this.viewCreatedTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEventCreatedAtNanos() {
        return this.eventCreatedAtNanos;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getResourceId() {
        return this.resourceId;
    }

    public static /* synthetic */ com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext copy$default(com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext networkSettledResourceContext, java.lang.String str, long j, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = networkSettledResourceContext.resourceId;
        }
        if ((i & 2) != 0) {
            j = networkSettledResourceContext.eventCreatedAtNanos;
        }
        if ((i & 4) != 0) {
            l = networkSettledResourceContext.viewCreatedTimestamp;
        }
        return networkSettledResourceContext.copy(str, j, l);
    }
}
