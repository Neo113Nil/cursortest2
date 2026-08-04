package com.google.android.gms.internal.ads;

import E2.o;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class zzbzf implements I3.b {
    private final zzgbw zza = zzgbw.zze();

    @Override // I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return this.zza.cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public void zza(Object obj) {
        zzc(obj);
    }

    public final boolean zzc(Object obj) {
        boolean zZzc = this.zza.zzc(obj);
        zza(zZzc);
        return zZzc;
    }

    public final boolean zzd(Throwable th) {
        boolean zZzd = this.zza.zzd(th);
        zza(zZzd);
        return zZzd;
    }

    private static final boolean zza(boolean z4) {
        if (!z4) {
            o.f1952C.f1961g.zzv(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z4;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.zza.get(j, timeUnit);
    }
}
