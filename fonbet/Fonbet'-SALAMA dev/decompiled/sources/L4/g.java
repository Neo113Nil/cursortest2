package L4;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Semaphore f4362a = new Semaphore(0);

    /* renamed from: b, reason: collision with root package name */
    public int f4363b = 0;

    public final void a() {
        try {
            this.f4362a.acquire(this.f4363b);
            this.f4363b = 0;
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            p3.f.F("Interrupted while waiting for background task", e7);
            throw null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4363b++;
        l.f4378c.execute(new K5.a(2, this, runnable));
    }
}
