package p2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: p2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2251i implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public final ExecutorService f18705l;

    /* renamed from: n, reason: collision with root package name */
    public volatile Runnable f18707n;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f18704k = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final Object f18706m = new Object();

    public ExecutorC2251i(ExecutorService executorService) {
        this.f18705l = executorService;
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.f18706m) {
            z3 = !this.f18704k.isEmpty();
        }
        return z3;
    }

    public final void b() {
        synchronized (this.f18706m) {
            try {
                Runnable runnable = (Runnable) this.f18704k.poll();
                this.f18707n = runnable;
                if (runnable != null) {
                    this.f18705l.execute(this.f18707n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f18706m) {
            try {
                this.f18704k.add(new D3.h(23, this, runnable, false));
                if (this.f18707n == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
