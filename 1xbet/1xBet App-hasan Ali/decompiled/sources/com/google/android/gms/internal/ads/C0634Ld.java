package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0634Ld implements E3.a {

    /* renamed from: k, reason: collision with root package name */
    public final Xw f10334k = new Xw();

    @Override // E3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f10334k.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean f = this.f10334k.f(obj);
        if (!f) {
            P2.o.f4767B.f4774g.h("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return f;
    }

    public final boolean c(Throwable th) {
        boolean g5 = this.f10334k.g(th);
        if (!g5) {
            P2.o.f4767B.f4774g.h("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return g5;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        return this.f10334k.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f10334k.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10334k.f14874k instanceof C0910dw;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10334k.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.f10334k.get(j5, timeUnit);
    }
}
