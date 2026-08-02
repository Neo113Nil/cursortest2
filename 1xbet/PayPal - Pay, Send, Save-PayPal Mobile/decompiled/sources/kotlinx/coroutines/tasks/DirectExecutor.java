package kotlinx.coroutines.tasks;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/tasks/DirectExecutor;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "p0", "", "execute", "(Ljava/lang/Runnable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DirectExecutor implements java.util.concurrent.Executor {
    public static final kotlinx.coroutines.tasks.DirectExecutor INSTANCE = new kotlinx.coroutines.tasks.DirectExecutor();

    private DirectExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable p0) {
        p0.run();
    }
}
