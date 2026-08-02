package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxy implements java.lang.Runnable {
    final /* synthetic */ java.util.Collection zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzd zzb;
    final /* synthetic */ java.util.concurrent.Future zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ java.util.concurrent.Future zze;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzf zzf;

    zzbxy(com.google.android.libraries.places.internal.zzbzf zzbzfVar, java.util.Collection collection, com.google.android.libraries.places.internal.zzbzd zzbzdVar, java.util.concurrent.Future future, boolean z, java.util.concurrent.Future future2) {
        this.zza = collection;
        this.zzb = zzbzdVar;
        this.zzc = future;
        this.zzd = z;
        this.zze = future2;
        java.util.Objects.requireNonNull(zzbzfVar);
        this.zzf = zzbzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar;
        for (com.google.android.libraries.places.internal.zzbzd zzbzdVar : this.zza) {
            if (zzbzdVar != this.zzb) {
                com.google.android.libraries.places.internal.zzbpl zzbplVar = zzbzdVar.zza;
                zzbnpVar = com.google.android.libraries.places.internal.zzbzf.zza;
                zzbplVar.zzl(zzbnpVar);
            }
        }
        java.util.concurrent.Future future = this.zzc;
        if (future != null) {
            future.cancel(false);
            if (!this.zzd) {
                com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zzf;
                if (zzbzfVar.zzU().decrementAndGet() == Integer.MIN_VALUE) {
                    com.google.android.libraries.places.internal.zzbnx zzbnxVar = (com.google.android.libraries.places.internal.zzbnx) zzbzfVar.zzF();
                    zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbxx(this));
                    zzbnxVar.zza();
                }
            }
        }
        java.util.concurrent.Future future2 = this.zze;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.zzf.zzg();
    }
}
