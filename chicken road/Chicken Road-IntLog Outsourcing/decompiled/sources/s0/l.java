package s0;

import D4.a0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements J1.a {

    /* renamed from: a, reason: collision with root package name */
    public final D0.k f11785a = new D0.k();

    public l(a0 a0Var) {
        a0Var.H(false, true, new F4.o(7, this));
    }

    @Override // J1.a
    public final void a(Runnable runnable, Executor executor) {
        this.f11785a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f11785a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11785a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11785a.f428a instanceof D0.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11785a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f11785a.get(j2, timeUnit);
    }
}
