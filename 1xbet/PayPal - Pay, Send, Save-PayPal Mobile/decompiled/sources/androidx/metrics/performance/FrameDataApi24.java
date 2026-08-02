package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/metrics/performance/FrameDataApi24;", "Landroidx/metrics/performance/FrameData;", "", "frameStartNanos", "frameDurationUiNanos", "frameDurationCpuNanos", "", "isJank", "", "Landroidx/metrics/performance/StateInfo;", "states", "<init>", "(JJJZLjava/util/List;)V", "copy", "()Landroidx/metrics/performance/FrameData;", "", "update$metrics_performance_release", "(JJJZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p0", "J", "getFrameDurationCpuNanos", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class FrameDataApi24 extends androidx.metrics.performance.FrameData {
    private long frameDurationCpuNanos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameDataApi24(long j, long j2, long j3, boolean z, java.util.List<androidx.metrics.performance.StateInfo> list) {
        super(j, j2, z, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.frameDurationCpuNanos = j3;
    }

    public final long getFrameDurationCpuNanos() {
        return this.frameDurationCpuNanos;
    }

    @Override // androidx.metrics.performance.FrameData
    public androidx.metrics.performance.FrameData copy() {
        return new androidx.metrics.performance.FrameDataApi24(getFrameStartNanos(), getFrameDurationUiNanos(), this.frameDurationCpuNanos, getIsJank(), new java.util.ArrayList(getStates()));
    }

    public final void update$metrics_performance_release(long frameStartNanos, long frameDurationUiNanos, long frameDurationCpuNanos, boolean isJank) {
        super.update$metrics_performance_release(frameStartNanos, frameDurationUiNanos, isJank);
        this.frameDurationCpuNanos = frameDurationCpuNanos;
    }

    @Override // androidx.metrics.performance.FrameData
    public boolean equals(java.lang.Object other) {
        return (other instanceof androidx.metrics.performance.FrameDataApi24) && super.equals(other) && this.frameDurationCpuNanos == ((androidx.metrics.performance.FrameDataApi24) other).frameDurationCpuNanos;
    }

    @Override // androidx.metrics.performance.FrameData
    public int hashCode() {
        return (super.hashCode() * 31) + java.lang.Long.hashCode(this.frameDurationCpuNanos);
    }

    @Override // androidx.metrics.performance.FrameData
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameData(frameStartNanos=");
        sb.append(getFrameStartNanos());
        sb.append(", frameDurationUiNanos=");
        sb.append(getFrameDurationUiNanos());
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.frameDurationCpuNanos);
        sb.append(", isJank=");
        sb.append(getIsJank());
        sb.append(", states=");
        sb.append(getStates());
        sb.append(')');
        return sb.toString();
    }
}
