package com.datadog.android.rum.internal.metric.networksettled;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/datadog/android/rum/internal/metric/networksettled/InternalResourceContext;", "", "", "resourceId", "", "eventCreatedAtNanos", "<init>", "(Ljava/lang/String;J)V", "component1$dd_sdk_android_rum_release", "()Ljava/lang/String;", "component2$dd_sdk_android_rum_release", "()J", "copy", "(Ljava/lang/String;J)Lcom/datadog/android/rum/internal/metric/networksettled/InternalResourceContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getEventCreatedAtNanos$dd_sdk_android_rum_release", "Ljava/lang/String;", "getResourceId$dd_sdk_android_rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalResourceContext {
    private final long eventCreatedAtNanos;
    private final java.lang.String resourceId;

    public InternalResourceContext(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.resourceId = str;
        this.eventCreatedAtNanos = j;
    }

    public final java.lang.String getResourceId$dd_sdk_android_rum_release() {
        return this.resourceId;
    }

    public final long getEventCreatedAtNanos$dd_sdk_android_rum_release() {
        return this.eventCreatedAtNanos;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.resourceId;
        long j = this.eventCreatedAtNanos;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InternalResourceContext(resourceId=");
        sb.append(str);
        sb.append(", eventCreatedAtNanos=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.resourceId.hashCode() * 31) + java.lang.Long.hashCode(this.eventCreatedAtNanos);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext)) {
            return false;
        }
        com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext internalResourceContext = (com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, internalResourceContext.resourceId) && this.eventCreatedAtNanos == internalResourceContext.eventCreatedAtNanos;
    }

    public final com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext copy(java.lang.String resourceId, long eventCreatedAtNanos) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
        return new com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext(resourceId, eventCreatedAtNanos);
    }

    /* renamed from: component2$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventCreatedAtNanos() {
        return this.eventCreatedAtNanos;
    }

    /* renamed from: component1$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getResourceId() {
        return this.resourceId;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext copy$default(com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext internalResourceContext, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = internalResourceContext.resourceId;
        }
        if ((i & 2) != 0) {
            j = internalResourceContext.eventCreatedAtNanos;
        }
        return internalResourceContext.copy(str, j);
    }
}
