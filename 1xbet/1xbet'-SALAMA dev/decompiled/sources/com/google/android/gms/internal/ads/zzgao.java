package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzgao extends zzgbk {
    private final Executor zza;
    final /* synthetic */ zzgap zzb;

    public zzgao(zzgap zzgapVar, Executor executor) {
        this.zzb = zzgapVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final void zzd(Throwable th) {
        this.zzb.zzb = null;
        if (th instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final void zze(Object obj) {
        this.zzb.zzb = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e7) {
            this.zzb.zzd(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
