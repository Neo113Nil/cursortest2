package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "", "p0", "p1", "<init>", "(JJ)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "command", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class StartedWhileSubscribed implements kotlinx.coroutines.flow.SharingStarted {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoSizes;

    public StartedWhileSubscribed(long j, long j2) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = j2;
        if (j < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("stopTimeout(");
            sb.append(j);
            sb.append(" ms) cannot be negative");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (j2 >= 0) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("replayExpiration(");
        sb2.append(j2);
        sb2.append(" ms) cannot be negative");
        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> p0) {
        return kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.dropWhile(kotlinx.coroutines.flow.FlowKt.transformLatest(p0, new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1(this, null)), new kotlinx.coroutines.flow.StartedWhileSubscribed$command$2(null)));
    }

    public final java.lang.String toString() {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(2);
        if (this.getHighSpeedVideoSizes > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("stopTimeout=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("ms");
            createListBuilder.add(sb.toString());
        }
        if (this.getHighSpeedVideoFpsRanges < Long.MAX_VALUE) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("replayExpiration=");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append("ms");
            createListBuilder.add(sb2.toString());
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("SharingStarted.WhileSubscribed(");
        sb3.append(kotlin.collections.CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null));
        sb3.append(')');
        return sb3.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlinx.coroutines.flow.StartedWhileSubscribed)) {
            return false;
        }
        kotlinx.coroutines.flow.StartedWhileSubscribed startedWhileSubscribed = (kotlinx.coroutines.flow.StartedWhileSubscribed) p0;
        return this.getHighSpeedVideoSizes == startedWhileSubscribed.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == startedWhileSubscribed.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.getHighSpeedVideoSizes) * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRanges);
    }
}
