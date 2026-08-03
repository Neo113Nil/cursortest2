package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhbj extends com.google.android.gms.internal.ads.zzhcd {
    private final java.util.concurrent.Executor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzhbk zzb;

    zzhbj(com.google.android.gms.internal.ads.zzhbk zzhbkVar, java.util.concurrent.Executor executor) {
        java.util.Objects.requireNonNull(zzhbkVar);
        this.zzb = zzhbkVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzb(java.lang.Object obj);

    @Override // com.google.android.gms.internal.ads.zzhcd
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzf(java.lang.Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzg(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzhbk zzhbkVar = this.zzb;
        zzhbkVar.zzD(null);
        if (th instanceof java.util.concurrent.ExecutionException) {
            zzhbkVar.zzb(((java.util.concurrent.ExecutionException) th).getCause());
        } else if (th instanceof java.util.concurrent.CancellationException) {
            zzhbkVar.cancel(false);
        } else {
            zzhbkVar.zzb(th);
        }
    }
}
