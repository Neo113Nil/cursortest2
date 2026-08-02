package androidx.work.impl.utils;

/* loaded from: classes7.dex */
public class SynchronousExecutor implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
