package com.datadog.android.rum.internal.domain.state;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/state/SlowFrameRecord;", "", "", "startTimestampNs", "durationNs", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/internal/domain/state/SlowFrameRecord;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDurationNs", "setDurationNs", "(J)V", "getStartTimestampNs", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SlowFrameRecord {
    private long durationNs;
    private final long startTimestampNs;

    public SlowFrameRecord(long j, long j2) {
        this.startTimestampNs = j;
        this.durationNs = j2;
    }

    public final long getStartTimestampNs() {
        return this.startTimestampNs;
    }

    public final long getDurationNs() {
        return this.durationNs;
    }

    public final void setDurationNs(long j) {
        this.durationNs = j;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.durationNs / 1000000.0d);
        sb.append("ms");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.startTimestampNs) * 31) + java.lang.Long.hashCode(this.durationNs);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.state.SlowFrameRecord)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.state.SlowFrameRecord slowFrameRecord = (com.datadog.android.rum.internal.domain.state.SlowFrameRecord) other;
        return this.startTimestampNs == slowFrameRecord.startTimestampNs && this.durationNs == slowFrameRecord.durationNs;
    }

    public final com.datadog.android.rum.internal.domain.state.SlowFrameRecord copy(long startTimestampNs, long durationNs) {
        return new com.datadog.android.rum.internal.domain.state.SlowFrameRecord(startTimestampNs, durationNs);
    }

    /* renamed from: component2, reason: from getter */
    public final long getDurationNs() {
        return this.durationNs;
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTimestampNs() {
        return this.startTimestampNs;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.domain.state.SlowFrameRecord copy$default(com.datadog.android.rum.internal.domain.state.SlowFrameRecord slowFrameRecord, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = slowFrameRecord.startTimestampNs;
        }
        if ((i & 2) != 0) {
            j2 = slowFrameRecord.durationNs;
        }
        return slowFrameRecord.copy(j, j2);
    }
}
