package b1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements E3.a {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f7212k;

    /* renamed from: l, reason: collision with root package name */
    public final j f7213l = new j(this);

    public k(C0508i c0508i) {
        this.f7212k = new WeakReference(c0508i);
    }

    @Override // E3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f7213l.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        C0508i c0508i = (C0508i) this.f7212k.get();
        boolean cancel = this.f7213l.cancel(z3);
        if (cancel && c0508i != null) {
            c0508i.f7207a = null;
            c0508i.f7208b = null;
            c0508i.f7209c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f7213l.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7213l.f7204k instanceof C0500a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7213l.isDone();
    }

    public final String toString() {
        return this.f7213l.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.f7213l.get(j5, timeUnit);
    }
}
