package okhttp3.internal.concurrent;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u000fR\"\u0010\u001b\u001a\u00020\b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "", "name", "", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "", "runOnce", "()J", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "", "initQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "Z", "getCancelable", "()Z", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "nextExecuteNanoTime", "J", "getNextExecuteNanoTime$okhttp", "setNextExecuteNanoTime$okhttp", "(J)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Task {
    private final boolean cancelable;
    private final java.lang.String name;
    private long nextExecuteNanoTime;
    private okhttp3.internal.concurrent.TaskQueue queue;

    public abstract long runOnce();

    public Task(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public /* synthetic */ Task(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    /* renamed from: getQueue$okhttp, reason: from getter */
    public final okhttp3.internal.concurrent.TaskQueue getQueue() {
        return this.queue;
    }

    public final void setQueue$okhttp(okhttp3.internal.concurrent.TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    /* renamed from: getNextExecuteNanoTime$okhttp, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    public final void setNextExecuteNanoTime$okhttp(long j) {
        this.nextExecuteNanoTime = j;
    }

    public final void initQueue$okhttp(okhttp3.internal.concurrent.TaskQueue queue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "");
        okhttp3.internal.concurrent.TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue != null) {
            throw new java.lang.IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = queue;
    }

    public java.lang.String toString() {
        return this.name;
    }
}
