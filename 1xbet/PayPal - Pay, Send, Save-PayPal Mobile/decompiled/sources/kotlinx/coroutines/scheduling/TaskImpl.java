package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0014\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "p0", "", "p1", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "p2", "<init>", "(Ljava/lang/Runnable;JZ)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Runnable;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TaskImpl extends kotlinx.coroutines.scheduling.Task {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public final java.lang.Runnable getHighSpeedVideoFpsRanges;

    public TaskImpl(java.lang.Runnable runnable, long j, boolean z) {
        super(j, z);
        this.getHighSpeedVideoFpsRanges = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.getHighSpeedVideoFpsRanges.run();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this.getHighSpeedVideoFpsRanges));
        sb.append('@');
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this.getHighSpeedVideoFpsRanges));
        sb.append(", ");
        sb.append(this.submissionTime);
        sb.append(", ");
        sb.append(kotlinx.coroutines.scheduling.TasksKt.access$taskContextString(this.taskContext));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
