package androidx.work.impl.utils.futures;

/* loaded from: classes2.dex */
enum DirectExecutor implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        command.run();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "DirectExecutor";
    }
}
