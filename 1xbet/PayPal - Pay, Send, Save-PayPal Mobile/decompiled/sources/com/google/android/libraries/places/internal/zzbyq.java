package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzd zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbyr zzb;

    zzbyq(com.google.android.libraries.places.internal.zzbyr zzbyrVar, com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        this.zza = zzbzdVar;
        java.util.Objects.requireNonNull(zzbyrVar);
        this.zzb = zzbyrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbyp zzbypVar;
        boolean z;
        com.google.android.libraries.places.internal.zzbyr zzbyrVar = this.zzb;
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = zzbyrVar.zzb;
        synchronized (zzbzfVar.zzK()) {
            zzbypVar = null;
            if (zzbyrVar.zza.zzc) {
                z = true;
            } else {
                zzbzfVar.zzR(zzbzfVar.zzQ().zzc(this.zza));
                if (zzbzfVar.zzz(zzbzfVar.zzQ()) && (zzbzfVar.zzO() == null || zzbzfVar.zzO().zza())) {
                    zzbypVar = new com.google.android.libraries.places.internal.zzbyp(zzbzfVar.zzK());
                    zzbzfVar.zzaa(zzbypVar);
                } else {
                    zzbzfVar.zzR(zzbzfVar.zzQ().zzb());
                    zzbzfVar.zzaa(null);
                }
                z = false;
            }
        }
        if (z) {
            com.google.android.libraries.places.internal.zzbzd zzbzdVar = this.zza;
            zzbzdVar.zza.zzf(new com.google.android.libraries.places.internal.zzbzc(this.zzb.zzb, zzbzdVar));
            zzbzdVar.zza.zzl(com.google.android.libraries.places.internal.zzbnp.zzb.zze("Unneeded hedging"));
            return;
        }
        if (zzbypVar != null) {
            com.google.android.libraries.places.internal.zzbzf zzbzfVar2 = this.zzb.zzb;
            zzbypVar.zza(zzbzfVar2.zzG().schedule(new com.google.android.libraries.places.internal.zzbyr(zzbzfVar2, zzbypVar), zzbzfVar2.zzI().zzb, java.util.concurrent.TimeUnit.NANOSECONDS));
        }
        com.google.android.libraries.places.internal.zzbyr zzbyrVar2 = this.zzb;
        zzbyrVar2.zzb.zzx(this.zza);
    }
}
