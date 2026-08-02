package W5;

import java.util.concurrent.Executor;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class H0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final C1761y0 f6814a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f6815b;

    public H0(C1761y0 c1761y0) {
        p3.f.k(c1761y0, "executorPool");
        this.f6814a = c1761y0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.f6815b == null) {
                    Executor executor2 = (Executor) c2.a((b2) this.f6814a.f17932b);
                    Executor executor3 = this.f6815b;
                    if (executor2 == null) {
                        throw new NullPointerException(P6.b.z("%s.getObject()", executor3));
                    }
                    this.f6815b = executor2;
                }
                executor = this.f6815b;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
