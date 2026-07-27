package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u2 implements InterfaceFutureC0386y0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5268a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f5269b = new t2(this);

    public u2(s2 s2Var) {
        this.f5268a = new WeakReference(s2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0386y0
    public final void b(Runnable runnable, Executor executor) {
        this.f5269b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        s2 s2Var = (s2) this.f5268a.get();
        boolean cancel = this.f5269b.cancel(z);
        if (!cancel || s2Var == null) {
            return cancel;
        }
        s2Var.f5253a = null;
        s2Var.f5254b = null;
        s2Var.f5255c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5269b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5269b.f5247a instanceof W0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5269b.isDone();
    }

    public final String toString() {
        return this.f5269b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f5269b.get(j2, timeUnit);
    }
}
