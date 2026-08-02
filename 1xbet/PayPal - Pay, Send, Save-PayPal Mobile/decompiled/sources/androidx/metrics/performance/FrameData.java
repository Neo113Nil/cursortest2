package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00058\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b\u0006\u0010#"}, d2 = {"Landroidx/metrics/performance/FrameData;", "", "", "frameStartNanos", "frameDurationUiNanos", "", "isJank", "", "Landroidx/metrics/performance/StateInfo;", "states", "<init>", "(JJZLjava/util/List;)V", "copy", "()Landroidx/metrics/performance/FrameData;", "", "update$metrics_performance_release", "(JJZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getStates", "()Ljava/util/List;", "p0", "J", "getFrameStartNanos", "()J", "getFrameDurationUiNanos", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class FrameData {
    private long frameDurationUiNanos;
    private long frameStartNanos;
    private boolean isJank;
    private final java.util.List<androidx.metrics.performance.StateInfo> states;

    public FrameData(long j, long j2, boolean z, java.util.List<androidx.metrics.performance.StateInfo> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.states = list;
        this.frameStartNanos = j;
        this.frameDurationUiNanos = j2;
        this.isJank = z;
    }

    public final java.util.List<androidx.metrics.performance.StateInfo> getStates() {
        return this.states;
    }

    public final long getFrameStartNanos() {
        return this.frameStartNanos;
    }

    public final long getFrameDurationUiNanos() {
        return this.frameDurationUiNanos;
    }

    /* renamed from: isJank, reason: from getter */
    public final boolean getIsJank() {
        return this.isJank;
    }

    public androidx.metrics.performance.FrameData copy() {
        return new androidx.metrics.performance.FrameData(this.frameStartNanos, this.frameDurationUiNanos, this.isJank, new java.util.ArrayList(this.states));
    }

    public final void update$metrics_performance_release(long frameStartNanos, long frameDurationUiNanos, boolean isJank) {
        this.frameStartNanos = frameStartNanos;
        this.frameDurationUiNanos = frameDurationUiNanos;
        this.isJank = isJank;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.metrics.performance.FrameData frameData = (androidx.metrics.performance.FrameData) other;
        return this.frameStartNanos == frameData.frameStartNanos && this.frameDurationUiNanos == frameData.frameDurationUiNanos && this.isJank == frameData.isJank && kotlin.jvm.internal.Intrinsics.areEqual(this.states, frameData.states);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.frameStartNanos);
        return (((((hashCode * 31) + java.lang.Long.hashCode(this.frameDurationUiNanos)) * 31) + java.lang.Boolean.hashCode(this.isJank)) * 31) + this.states.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.frameStartNanos);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.frameDurationUiNanos);
        sb.append(", isJank=");
        sb.append(this.isJank);
        sb.append(", states=");
        sb.append(this.states);
        sb.append(')');
        return sb.toString();
    }
}
