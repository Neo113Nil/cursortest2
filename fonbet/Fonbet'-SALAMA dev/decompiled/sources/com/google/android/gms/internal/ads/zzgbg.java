package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
final class zzgbg implements I3.b {
    static final I3.b zza = new zzgbg(null);
    private static final zzgbl zzb = new zzgbl(zzgbg.class);
    private final Object zzc;

    public zzgbg(Object obj) {
        this.zzc = obj;
    }

    @Override // I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        zzfth.zzc(runnable, "Runnable was null.");
        zzfth.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", AbstractC1663a.f("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
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
        return AbstractC1663a.o(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.zzc), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzc;
    }
}
