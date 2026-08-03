package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "submissionTime", "", "taskContext", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "<init>", "(Ljava/lang/Runnable;JZ)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TaskImpl extends kotlinx.coroutines.scheduling.Task {
    public final java.lang.Runnable block;

    public TaskImpl(java.lang.Runnable runnable, long j, boolean z) {
        super(j, z);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.block.run();
    }

    public java.lang.String toString() {
        java.lang.String taskContextString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this.block));
        sb.append('@');
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this.block));
        sb.append(", ");
        sb.append(this.submissionTime);
        sb.append(", ");
        taskContextString = kotlinx.coroutines.scheduling.TasksKt.taskContextString(this.taskContext);
        sb.append(taskContextString);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
