package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzhcl extends zzhdf {
    private final Executor zza;
    final /* synthetic */ zzhcm zzb;

    zzhcl(zzhcm zzhcmVar, Executor executor) {
        Objects.requireNonNull(zzhcmVar);
        this.zzb = zzhcmVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzhdf
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final void zzg(Throwable th) {
        zzhcm zzhcmVar = this.zzb;
        zzhcmVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzhcmVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzhcmVar.cancel(false);
        } else {
            zzhcmVar.zzb(th);
        }
    }
}
