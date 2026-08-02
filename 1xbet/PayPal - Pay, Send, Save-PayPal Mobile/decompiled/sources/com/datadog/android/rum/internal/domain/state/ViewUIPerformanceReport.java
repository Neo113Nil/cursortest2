package com.datadog.android.rum.internal.domain.state;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002+,B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBI\b\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b*\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport;", "", "", "viewStartedTimeStamp", "", "maxSize", "minimumViewLifetimeThresholdNs", "<init>", "(JIJ)V", "p0", "Lcom/datadog/android/internal/collections/EvictingQueue;", "Lcom/datadog/android/rum/internal/domain/state/SlowFrameRecord;", "p1", "p2", "p3", "p4", "p5", "(JLcom/datadog/android/internal/collections/EvictingQueue;JJJJ)V", "Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;", "snapshot", "()Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;", "freezeFramesDuration", "J", "getFreezeFramesDuration", "()J", "setFreezeFramesDuration", "(J)V", "getLastSlowFrameRecord", "()Lcom/datadog/android/rum/internal/domain/state/SlowFrameRecord;", "lastSlowFrameRecord", "minViewLifetimeThresholdNs", "getMinViewLifetimeThresholdNs", "slowFramesDurationNs", "getSlowFramesDurationNs", "setSlowFramesDurationNs", "slowFramesRecords", "Lcom/datadog/android/internal/collections/EvictingQueue;", "getSlowFramesRecords", "()Lcom/datadog/android/internal/collections/EvictingQueue;", "totalFramesDurationNs", "getTotalFramesDurationNs", "setTotalFramesDurationNs", "getViewStartedTimeStamp", "Companion", "Snapshot"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewUIPerformanceReport {
    private volatile long freezeFramesDuration;
    private final long minViewLifetimeThresholdNs;
    private volatile long slowFramesDurationNs;
    private final com.datadog.android.internal.collections.EvictingQueue<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> slowFramesRecords;
    private volatile long totalFramesDurationNs;
    private final long viewStartedTimeStamp;

    private ViewUIPerformanceReport(long j, com.datadog.android.internal.collections.EvictingQueue<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> evictingQueue, long j2, long j3, long j4, long j5) {
        this.viewStartedTimeStamp = j;
        this.slowFramesRecords = evictingQueue;
        this.totalFramesDurationNs = j2;
        this.slowFramesDurationNs = j3;
        this.freezeFramesDuration = j4;
        this.minViewLifetimeThresholdNs = j5;
    }

    /* synthetic */ ViewUIPerformanceReport(long j, com.datadog.android.internal.collections.EvictingQueue evictingQueue, long j2, long j3, long j4, long j5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, evictingQueue, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? 0L : j4, (i & 32) != 0 ? 0L : j5);
    }

    public final long getViewStartedTimeStamp() {
        return this.viewStartedTimeStamp;
    }

    public final com.datadog.android.internal.collections.EvictingQueue<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> getSlowFramesRecords() {
        return this.slowFramesRecords;
    }

    public final long getTotalFramesDurationNs() {
        return this.totalFramesDurationNs;
    }

    public final void setTotalFramesDurationNs(long j) {
        this.totalFramesDurationNs = j;
    }

    public final long getSlowFramesDurationNs() {
        return this.slowFramesDurationNs;
    }

    public final void setSlowFramesDurationNs(long j) {
        this.slowFramesDurationNs = j;
    }

    public final long getFreezeFramesDuration() {
        return this.freezeFramesDuration;
    }

    public final void setFreezeFramesDuration(long j) {
        this.freezeFramesDuration = j;
    }

    public final long getMinViewLifetimeThresholdNs() {
        return this.minViewLifetimeThresholdNs;
    }

    public ViewUIPerformanceReport(long j, int i, long j2) {
        this(j, new com.datadog.android.internal.collections.EvictingQueue(i, new java.util.concurrent.ConcurrentLinkedDeque()), 0L, 0L, 0L, j2, 28, null);
    }

    public final com.datadog.android.rum.internal.domain.state.SlowFrameRecord getLastSlowFrameRecord() {
        return this.slowFramesRecords.lastOrNull();
    }

    public final com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot snapshot() {
        return new com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot(this.viewStartedTimeStamp, kotlin.collections.CollectionsKt.toList(this.slowFramesRecords), this.totalFramesDurationNs, this.slowFramesDurationNs, this.freezeFramesDuration, this.minViewLifetimeThresholdNs);
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJR\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b,\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b-\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;", "", "", "viewStartedTimeStamp", "", "Lcom/datadog/android/rum/internal/domain/state/SlowFrameRecord;", "slowFramesRecords", "totalFramesDurationNs", "slowFramesDurationNs", "freezeFramesDuration", "minViewLifetimeThresholdNs", "<init>", "(JLjava/util/List;JJJJ)V", "component1", "()J", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "copy", "(JLjava/util/List;JJJJ)Lcom/datadog/android/rum/internal/domain/state/ViewUIPerformanceReport$Snapshot;", "other", "", "equals", "(Ljava/lang/Object;)Z", "viewEndedTimeStamp", "", "freezeFramesRate", "(J)D", "", "hashCode", "()I", "slowFramesRate", "", "toString", "()Ljava/lang/String;", "J", "getFreezeFramesDuration", "getMinViewLifetimeThresholdNs", "getSlowFramesDurationNs", "Ljava/util/List;", "getSlowFramesRecords", "getTotalFramesDurationNs", "getViewStartedTimeStamp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        private final long freezeFramesDuration;
        private final long minViewLifetimeThresholdNs;
        private final long slowFramesDurationNs;
        private final java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> slowFramesRecords;
        private final long totalFramesDurationNs;
        private final long viewStartedTimeStamp;

        public Snapshot(long j, java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> list, long j2, long j3, long j4, long j5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.viewStartedTimeStamp = j;
            this.slowFramesRecords = list;
            this.totalFramesDurationNs = j2;
            this.slowFramesDurationNs = j3;
            this.freezeFramesDuration = j4;
            this.minViewLifetimeThresholdNs = j5;
        }

        public final long getViewStartedTimeStamp() {
            return this.viewStartedTimeStamp;
        }

        public final java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> getSlowFramesRecords() {
            return this.slowFramesRecords;
        }

        public final long getTotalFramesDurationNs() {
            return this.totalFramesDurationNs;
        }

        public final long getSlowFramesDurationNs() {
            return this.slowFramesDurationNs;
        }

        public final long getFreezeFramesDuration() {
            return this.freezeFramesDuration;
        }

        public final long getMinViewLifetimeThresholdNs() {
            return this.minViewLifetimeThresholdNs;
        }

        public final double slowFramesRate(long viewEndedTimeStamp) {
            if (viewEndedTimeStamp - this.viewStartedTimeStamp <= this.minViewLifetimeThresholdNs) {
                return 0.0d;
            }
            double d = this.totalFramesDurationNs;
            if (d > 0.0d) {
                return (this.slowFramesDurationNs / d) * 1000.0d;
            }
            return 0.0d;
        }

        public final double freezeFramesRate(long viewEndedTimeStamp) {
            long j = viewEndedTimeStamp - this.viewStartedTimeStamp;
            if (j <= this.minViewLifetimeThresholdNs) {
                return 0.0d;
            }
            return java.lang.Math.max(0.0d, (this.freezeFramesDuration / j) * 3600.0d);
        }

        public final java.lang.String toString() {
            long j = this.viewStartedTimeStamp;
            java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> list = this.slowFramesRecords;
            long j2 = this.totalFramesDurationNs;
            long j3 = this.slowFramesDurationNs;
            long j4 = this.freezeFramesDuration;
            long j5 = this.minViewLifetimeThresholdNs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Snapshot(viewStartedTimeStamp=");
            sb.append(j);
            sb.append(", slowFramesRecords=");
            sb.append(list);
            sb.append(", totalFramesDurationNs=");
            sb.append(j2);
            sb.append(", slowFramesDurationNs=");
            sb.append(j3);
            sb.append(", freezeFramesDuration=");
            sb.append(j4);
            sb.append(", minViewLifetimeThresholdNs=");
            sb.append(j5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((java.lang.Long.hashCode(this.viewStartedTimeStamp) * 31) + this.slowFramesRecords.hashCode()) * 31) + java.lang.Long.hashCode(this.totalFramesDurationNs)) * 31) + java.lang.Long.hashCode(this.slowFramesDurationNs)) * 31) + java.lang.Long.hashCode(this.freezeFramesDuration)) * 31) + java.lang.Long.hashCode(this.minViewLifetimeThresholdNs);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot)) {
                return false;
            }
            com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot snapshot = (com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot) other;
            return this.viewStartedTimeStamp == snapshot.viewStartedTimeStamp && kotlin.jvm.internal.Intrinsics.areEqual(this.slowFramesRecords, snapshot.slowFramesRecords) && this.totalFramesDurationNs == snapshot.totalFramesDurationNs && this.slowFramesDurationNs == snapshot.slowFramesDurationNs && this.freezeFramesDuration == snapshot.freezeFramesDuration && this.minViewLifetimeThresholdNs == snapshot.minViewLifetimeThresholdNs;
        }

        public final com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot copy(long viewStartedTimeStamp, java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> slowFramesRecords, long totalFramesDurationNs, long slowFramesDurationNs, long freezeFramesDuration, long minViewLifetimeThresholdNs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slowFramesRecords, "");
            return new com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport.Snapshot(viewStartedTimeStamp, slowFramesRecords, totalFramesDurationNs, slowFramesDurationNs, freezeFramesDuration, minViewLifetimeThresholdNs);
        }

        /* renamed from: component6, reason: from getter */
        public final long getMinViewLifetimeThresholdNs() {
            return this.minViewLifetimeThresholdNs;
        }

        /* renamed from: component5, reason: from getter */
        public final long getFreezeFramesDuration() {
            return this.freezeFramesDuration;
        }

        /* renamed from: component4, reason: from getter */
        public final long getSlowFramesDurationNs() {
            return this.slowFramesDurationNs;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTotalFramesDurationNs() {
            return this.totalFramesDurationNs;
        }

        public final java.util.List<com.datadog.android.rum.internal.domain.state.SlowFrameRecord> component2() {
            return this.slowFramesRecords;
        }

        /* renamed from: component1, reason: from getter */
        public final long getViewStartedTimeStamp() {
            return this.viewStartedTimeStamp;
        }
    }
}
