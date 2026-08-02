package w1;

import java.util.concurrent.FutureTask;

/* renamed from: w1.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1704h2 extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1736p2 f17730a;

    /* renamed from: b, reason: collision with root package name */
    public int f17731b;

    public C1704h2(AbstractC1736p2 abstractC1736p2, Runnable runnable) {
        super(runnable, null);
        this.f17730a = abstractC1736p2;
        if (runnable == AbstractC1736p2.f17821f) {
            this.f17731b = 0;
        } else {
            this.f17731b = 1;
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
            if (this.f17731b != 1) {
                super.run();
                return;
            }
            this.f17731b = 2;
            if (!this.f17730a.g(this)) {
                this.f17730a.f(this);
            }
            this.f17731b = 1;
        } catch (Throwable th) {
            throw th;
        }
    }
}
