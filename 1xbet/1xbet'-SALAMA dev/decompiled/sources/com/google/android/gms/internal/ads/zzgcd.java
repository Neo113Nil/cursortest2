package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes.dex */
final class zzgcd extends zzgas implements RunnableFuture {
    private volatile zzgbk zza;

    public zzgcd(zzgai zzgaiVar) {
        this.zza = new zzgcb(this, zzgaiVar);
    }

    public static zzgcd zze(Runnable runnable, Object obj) {
        return new zzgcd(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgbk zzgbkVar = this.zza;
        if (zzgbkVar != null) {
            zzgbkVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String zza() {
        zzgbk zzgbkVar = this.zza;
        return zzgbkVar != null ? AbstractC0486a1.h("task=[", zzgbkVar.toString(), "]") : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final void zzb() {
        zzgbk zzgbkVar;
        if (zzt() && (zzgbkVar = this.zza) != null) {
            zzgbkVar.zzh();
        }
        this.zza = null;
    }

    public zzgcd(Callable callable) {
        this.zza = new zzgcc(this, callable);
    }
}
