package androidx.work.impl.utils.futures;

/* loaded from: classes7.dex */
enum DirectExecutor implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "DirectExecutor";
    }
}
