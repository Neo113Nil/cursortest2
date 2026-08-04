package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzejn implements zzejs {
    final /* synthetic */ zzejo zza;

    public zzejn(zzejo zzejoVar) {
        this.zza = zzejoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpw zzcpwVar = (zzcpw) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcpwVar.zzl();
            zzcpwVar.zzk();
        }
    }
}
