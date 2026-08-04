package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzfdf implements zzgay {
    final /* synthetic */ zzfdi zza;
    final /* synthetic */ zzfdj zzb;

    public zzfdf(zzfdj zzfdjVar, zzfdi zzfdiVar) {
        this.zza = zzfdiVar;
        this.zzb = zzfdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            try {
                this.zzb.zze = null;
                this.zzb.zzd.addFirst(this.zza);
                zzfdj zzfdjVar = this.zzb;
                if (zzfdjVar.zzf == 1) {
                    zzfdjVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
