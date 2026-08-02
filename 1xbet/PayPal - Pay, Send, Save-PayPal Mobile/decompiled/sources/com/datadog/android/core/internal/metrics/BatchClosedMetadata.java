package com.datadog.android.core.internal.metrics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "", "", "lastTimeWasUsedInMs", "eventsCount", "<init>", "(JJ)V", "component1$dd_sdk_android_core_release", "()J", "component2$dd_sdk_android_core_release", "copy", "(JJ)Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getEventsCount$dd_sdk_android_core_release", "getLastTimeWasUsedInMs$dd_sdk_android_core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BatchClosedMetadata {
    private final long eventsCount;
    private final long lastTimeWasUsedInMs;

    public BatchClosedMetadata(long j, long j2) {
        this.lastTimeWasUsedInMs = j;
        this.eventsCount = j2;
    }

    public final long getLastTimeWasUsedInMs$dd_sdk_android_core_release() {
        return this.lastTimeWasUsedInMs;
    }

    public final long getEventsCount$dd_sdk_android_core_release() {
        return this.eventsCount;
    }

    public final java.lang.String toString() {
        long j = this.lastTimeWasUsedInMs;
        long j2 = this.eventsCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatchClosedMetadata(lastTimeWasUsedInMs=");
        sb.append(j);
        sb.append(", eventsCount=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.lastTimeWasUsedInMs) * 31) + java.lang.Long.hashCode(this.eventsCount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.internal.metrics.BatchClosedMetadata)) {
            return false;
        }
        com.datadog.android.core.internal.metrics.BatchClosedMetadata batchClosedMetadata = (com.datadog.android.core.internal.metrics.BatchClosedMetadata) other;
        return this.lastTimeWasUsedInMs == batchClosedMetadata.lastTimeWasUsedInMs && this.eventsCount == batchClosedMetadata.eventsCount;
    }

    public final com.datadog.android.core.internal.metrics.BatchClosedMetadata copy(long lastTimeWasUsedInMs, long eventsCount) {
        return new com.datadog.android.core.internal.metrics.BatchClosedMetadata(lastTimeWasUsedInMs, eventsCount);
    }

    /* renamed from: component2$dd_sdk_android_core_release, reason: from getter */
    public final long getEventsCount() {
        return this.eventsCount;
    }

    /* renamed from: component1$dd_sdk_android_core_release, reason: from getter */
    public final long getLastTimeWasUsedInMs() {
        return this.lastTimeWasUsedInMs;
    }

    public static /* synthetic */ com.datadog.android.core.internal.metrics.BatchClosedMetadata copy$default(com.datadog.android.core.internal.metrics.BatchClosedMetadata batchClosedMetadata, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = batchClosedMetadata.lastTimeWasUsedInMs;
        }
        if ((i & 2) != 0) {
            j2 = batchClosedMetadata.eventsCount;
        }
        return batchClosedMetadata.copy(j, j2);
    }
}
