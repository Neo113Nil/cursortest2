package i;

import java.util.concurrent.Executor;

/* renamed from: i.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1216C implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
