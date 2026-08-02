package s;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j implements I3.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f16089a;

    /* renamed from: b, reason: collision with root package name */
    public final i f16090b = new i(this);

    public j(h hVar) {
        this.f16089a = new WeakReference(hVar);
    }

    @Override // I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.f16090b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        h hVar = (h) this.f16089a.get();
        boolean cancel = this.f16090b.cancel(z4);
        if (cancel && hVar != null) {
            hVar.f16084a = null;
            hVar.f16085b = null;
            hVar.f16086c.p(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f16090b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16090b.f16081a instanceof C1583a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16090b.isDone();
    }

    public final String toString() {
        return this.f16090b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f16090b.get(j, timeUnit);
    }
}
