package L4;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Semaphore f4388b = new Semaphore(4);

    public q(Executor executor) {
        this.f4387a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.f4388b.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f4387a.execute(new K5.a(4, this, runnable));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
