package io.appmetrica.analytics.coreutils.internal.executors;

/* loaded from: classes.dex */
public class BlockingExecutor implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
