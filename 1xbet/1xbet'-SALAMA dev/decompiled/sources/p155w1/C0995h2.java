package p155w1;

import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: w1.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0995h2 extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1027p2 f17736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17737b;

    public C0995h2(AbstractC1027p2 abstractC1027p2, Runnable runnable) {
        super(runnable, null);
        this.f17736a = abstractC1027p2;
        if (runnable == AbstractC1027p2.f17827f) {
            this.f17737b = 0;
        } else {
            this.f17737b = 1;
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z4) {
        super.cancel(z4);
        return true;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final synchronized void run() {
        try {
            if (this.f17737b != 1) {
                super.run();
                return;
            }
            this.f17737b = 2;
            if (!this.f17736a.g(this)) {
                this.f17736a.f(this);
            }
            this.f17737b = 1;
        } catch (Throwable th) {
            throw th;
        }
    }
}
