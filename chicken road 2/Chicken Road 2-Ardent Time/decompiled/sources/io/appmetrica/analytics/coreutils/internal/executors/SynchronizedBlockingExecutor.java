package io.appmetrica.analytics.coreutils.internal.executors;

/* loaded from: classes.dex */
public class SynchronizedBlockingExecutor extends io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor {
    @Override // io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor, java.util.concurrent.Executor
    public synchronized void execute(java.lang.Runnable runnable) {
        super.execute(runnable);
    }
}
