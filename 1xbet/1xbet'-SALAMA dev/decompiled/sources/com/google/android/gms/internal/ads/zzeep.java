package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzeep implements zzgay {
    final /* synthetic */ zzfaf zza;
    final /* synthetic */ zzeeq zzb;

    public zzeep(zzeeq zzeeqVar, zzfaf zzfafVar) {
        this.zza = zzfafVar;
        this.zzb = zzeeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            try {
                this.zzb.zzh.zzb(th, this.zza);
                zzfaf zzfafVarZza = this.zzb.zzh.zza();
                if (this.zza.zzav) {
                    while (zzfafVarZza != null) {
                        this.zzb.zze(zzfafVarZza);
                        zzfafVarZza = this.zzb.zzh.zza();
                    }
                } else if (zzfafVarZza != null) {
                    this.zzb.zze(zzfafVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzefh zzefhVar = (zzefh) obj;
        synchronized (this.zzb) {
            try {
                this.zzb.zzh.zzc(zzefhVar, this.zza);
                zzfaf zzfafVarZza = this.zzb.zzh.zza();
                if (zzfafVarZza != null) {
                    this.zzb.zze(zzfafVarZza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
