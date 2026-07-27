package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u2 implements InterfaceFutureC0242y0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2832a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f2833b = new t2(this);

    public u2(s2 s2Var) {
        this.f2832a = new WeakReference(s2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0242y0
    public final void a(Runnable runnable, Executor executor) {
        this.f2833b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        s2 s2Var = (s2) this.f2832a.get();
        boolean cancel = this.f2833b.cancel(z3);
        if (!cancel || s2Var == null) {
            return cancel;
        }
        s2Var.f2817a = null;
        s2Var.f2818b = null;
        s2Var.f2819c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f2833b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2833b.f2811a instanceof W0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2833b.isDone();
    }

    public final String toString() {
        return this.f2833b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f2833b.get(j3, timeUnit);
    }
}
