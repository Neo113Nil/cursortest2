package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzeep implements zzgay {
    final /* synthetic */ zzfaf zza;
    final /* synthetic */ zzeeq zzb;

    public zzeep(zzeeq zzeeqVar, zzfaf zzfafVar) {
        this.zza = zzfafVar;
        this.zzb = zzeeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzeer zzeerVar;
        zzeer zzeerVar2;
        zzeer zzeerVar3;
        synchronized (this.zzb) {
            try {
                zzeerVar = this.zzb.zzh;
                zzeerVar.zzb(th, this.zza);
                zzeerVar2 = this.zzb.zzh;
                zzfaf zza = zzeerVar2.zza();
                if (this.zza.zzav) {
                    while (zza != null) {
                        this.zzb.zze(zza);
                        zzeerVar3 = this.zzb.zzh;
                        zza = zzeerVar3.zza();
                    }
                } else if (zza != null) {
                    this.zzb.zze(zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeer zzeerVar;
        zzeer zzeerVar2;
        zzefh zzefhVar = (zzefh) obj;
        synchronized (this.zzb) {
            try {
                zzeerVar = this.zzb.zzh;
                zzeerVar.zzc(zzefhVar, this.zza);
                zzeerVar2 = this.zzb.zzh;
                zzfaf zza = zzeerVar2.zza();
                if (zza != null) {
                    this.zzb.zze(zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
