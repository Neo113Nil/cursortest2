package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzgau extends zzgat {
    private final I3.b zza;

    public zzgau(I3.b bVar) {
        bVar.getClass();
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return this.zza.cancel(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.zza.get(j, timeUnit);
    }
}
