package p129s;

import I3.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f16096b = new i(this);

    public j(h hVar) {
        this.f16095a = new WeakReference(hVar);
    }

    @Override // I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.f16096b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        h hVar = (h) this.f16095a.get();
        boolean zCancel = this.f16096b.cancel(z4);
        if (zCancel && hVar != null) {
            hVar.f16090a = null;
            hVar.f16091b = null;
            hVar.f16092c.p(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f16096b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16096b.f16087a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16096b.isDone();
    }

    public final String toString() {
        return this.f16096b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f16096b.get(j, timeUnit);
    }
}
