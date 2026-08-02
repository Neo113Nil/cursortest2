package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzgeo extends zzgdd implements RunnableFuture {
    private volatile zzgdv zza;

    zzgeo(zzgct zzgctVar) {
        this.zza = new zzgem(this, zzgctVar);
    }

    static zzgeo zze(Runnable runnable, Object obj) {
        return new zzgeo(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgdv zzgdvVar = this.zza;
        if (zzgdvVar != null) {
            zzgdvVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    protected final String zza() {
        zzgdv zzgdvVar = this.zza;
        if (zzgdvVar == null) {
            return super.zza();
        }
        return "task=[" + zzgdvVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    protected final void zzb() {
        zzgdv zzgdvVar;
        if (zzo() && (zzgdvVar = this.zza) != null) {
            zzgdvVar.zzh();
        }
        this.zza = null;
    }

    zzgeo(Callable callable) {
        this.zza = new zzgen(this, callable);
    }
}
