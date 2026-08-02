package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0010¢\u0006\u0004\b\b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f"}, d2 = {"Lkotlinx/coroutines/scheduling/Task;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "", "submissionTime", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "<init>", "(JZ)V", "()V", "J", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Task implements java.lang.Runnable {
    public long submissionTime;
    public boolean taskContext;

    public Task(long j, boolean z) {
        this.submissionTime = j;
        this.taskContext = z;
    }

    public Task() {
        this(0L, false);
    }
}
