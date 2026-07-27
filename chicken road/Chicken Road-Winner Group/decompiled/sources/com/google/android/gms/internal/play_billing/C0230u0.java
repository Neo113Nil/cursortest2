package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.play_billing.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230u0 implements InterfaceFutureC0242y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0239x0 f2831a = new C0239x0(C0230u0.class);

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0242y0
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f2831a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e3);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return 0;
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
        Integer num = 0;
        return super.toString() + "[status=SUCCESS, result=[" + num.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return 0;
    }
}
