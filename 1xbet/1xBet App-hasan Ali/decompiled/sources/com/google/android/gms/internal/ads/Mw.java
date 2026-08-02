package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class Mw implements E3.a {

    /* renamed from: l, reason: collision with root package name */
    public static final Mw f10750l = new Mw(null);

    /* renamed from: m, reason: collision with root package name */
    public static final Pw f10751m = new Pw(Mw.class);

    /* renamed from: k, reason: collision with root package name */
    public final Object f10752k;

    public Mw(Object obj) {
        this.f10752k = obj;
    }

    @Override // E3.a
    public final void a(Runnable runnable, Executor executor) {
        AbstractC1400ot.M("Executor was null.", executor);
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f10751m.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f10752k;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.f10752k) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f10752k;
    }
}
