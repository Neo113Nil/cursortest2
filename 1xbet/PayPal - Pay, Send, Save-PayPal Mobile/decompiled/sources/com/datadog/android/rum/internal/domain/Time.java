package com.datadog.android.rum.internal.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/Time;", "", "", "timestamp", "nanoTime", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/internal/domain/Time;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getNanoTime", "getTimestamp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Time {
    private final long nanoTime;
    private final long timestamp;

    public Time(long j, long j2) {
        this.timestamp = j;
        this.nanoTime = j2;
    }

    public /* synthetic */ Time(long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? java.lang.System.currentTimeMillis() : j, (i & 2) != 0 ? java.lang.System.nanoTime() : j2);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getNanoTime() {
        return this.nanoTime;
    }

    public final java.lang.String toString() {
        long j = this.timestamp;
        long j2 = this.nanoTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Time(timestamp=");
        sb.append(j);
        sb.append(", nanoTime=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.timestamp) * 31) + java.lang.Long.hashCode(this.nanoTime);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.Time)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.Time time = (com.datadog.android.rum.internal.domain.Time) other;
        return this.timestamp == time.timestamp && this.nanoTime == time.nanoTime;
    }

    public final com.datadog.android.rum.internal.domain.Time copy(long timestamp, long nanoTime) {
        return new com.datadog.android.rum.internal.domain.Time(timestamp, nanoTime);
    }

    /* renamed from: component2, reason: from getter */
    public final long getNanoTime() {
        return this.nanoTime;
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.domain.Time copy$default(com.datadog.android.rum.internal.domain.Time time, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = time.timestamp;
        }
        if ((i & 2) != 0) {
            j2 = time.nanoTime;
        }
        return time.copy(j, j2);
    }

    public Time() {
        this(0L, 0L, 3, null);
    }
}
