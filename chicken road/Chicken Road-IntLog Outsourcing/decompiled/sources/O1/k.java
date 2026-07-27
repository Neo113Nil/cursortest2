package O1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o1.u;

/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f2258f = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2259a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2260b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f2261c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f2262d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final A0.a f2263e = new A0.a(this);

    public k(Executor executor) {
        u.g(executor);
        this.f2259a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u.g(runnable);
        synchronized (this.f2260b) {
            int i2 = this.f2261c;
            if (i2 != 4 && i2 != 3) {
                long j2 = this.f2262d;
                j jVar = new j(runnable, 0);
                this.f2260b.add(jVar);
                this.f2261c = 2;
                try {
                    this.f2259a.execute(this.f2263e);
                    if (this.f2261c != 2) {
                        return;
                    }
                    synchronized (this.f2260b) {
                        try {
                            if (this.f2262d == j2 && this.f2261c == 2) {
                                this.f2261c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e3) {
                    synchronized (this.f2260b) {
                        try {
                            int i3 = this.f2261c;
                            boolean z = true;
                            if ((i3 != 1 && i3 != 2) || !this.f2260b.removeLastOccurrence(jVar)) {
                                z = false;
                            }
                            if (!(e3 instanceof RejectedExecutionException) || z) {
                                throw e3;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f2260b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f2259a + "}";
    }
}
