package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R$\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\""}, d2 = {"Landroidx/metrics/performance/FrameDataApi31;", "Landroidx/metrics/performance/FrameDataApi24;", "", "frameStartNanos", "frameDurationUiNanos", "frameDurationCpuNanos", "frameDurationTotalNanos", "frameOverrunNanos", "", "isJank", "", "Landroidx/metrics/performance/StateInfo;", "states", "<init>", "(JJJJJZLjava/util/List;)V", "Landroidx/metrics/performance/FrameData;", "copy", "()Landroidx/metrics/performance/FrameData;", "", "update$metrics_performance_release", "(JJJJJZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p0", "J", "getFrameDurationTotalNanos", "()J", "getFrameOverrunNanos"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FrameDataApi31 extends androidx.metrics.performance.FrameDataApi24 {
    private long frameDurationTotalNanos;
    private long frameOverrunNanos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameDataApi31(long j, long j2, long j3, long j4, long j5, boolean z, java.util.List<androidx.metrics.performance.StateInfo> list) {
        super(j, j2, j3, z, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.frameDurationTotalNanos = j4;
        this.frameOverrunNanos = j5;
    }

    public final long getFrameDurationTotalNanos() {
        return this.frameDurationTotalNanos;
    }

    public final long getFrameOverrunNanos() {
        return this.frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final androidx.metrics.performance.FrameData copy() {
        return new androidx.metrics.performance.FrameDataApi31(getFrameStartNanos(), getFrameDurationUiNanos(), getFrameDurationCpuNanos(), this.frameDurationTotalNanos, this.frameOverrunNanos, getIsJank(), new java.util.ArrayList(getStates()));
    }

    public final void update$metrics_performance_release(long frameStartNanos, long frameDurationUiNanos, long frameDurationCpuNanos, long frameDurationTotalNanos, long frameOverrunNanos, boolean isJank) {
        super.update$metrics_performance_release(frameStartNanos, frameDurationUiNanos, frameDurationCpuNanos, isJank);
        this.frameDurationTotalNanos = frameDurationTotalNanos;
        this.frameOverrunNanos = frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.metrics.performance.FrameDataApi31) || !super.equals(other)) {
            return false;
        }
        androidx.metrics.performance.FrameDataApi31 frameDataApi31 = (androidx.metrics.performance.FrameDataApi31) other;
        return this.frameDurationTotalNanos == frameDataApi31.frameDurationTotalNanos && this.frameOverrunNanos == frameDataApi31.frameOverrunNanos;
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final int hashCode() {
        return (super.hashCode() * 31) + (java.lang.Long.hashCode(this.frameDurationTotalNanos) * 31) + java.lang.Long.hashCode(this.frameOverrunNanos);
    }

    @Override // androidx.metrics.performance.FrameDataApi24, androidx.metrics.performance.FrameData
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameData(frameStartNanos=");
        sb.append(getFrameStartNanos());
        sb.append(", frameDurationUiNanos=");
        sb.append(getFrameDurationUiNanos());
        sb.append(", frameDurationCpuNanos=");
        sb.append(getFrameDurationCpuNanos());
        sb.append(", frameDurationTotalNanos=");
        sb.append(this.frameDurationTotalNanos);
        sb.append(", frameOverrunNanos=");
        sb.append(this.frameOverrunNanos);
        sb.append(", isJank=");
        sb.append(getIsJank());
        sb.append(", states=");
        sb.append(getStates());
        sb.append(')');
        return sb.toString();
    }
}
