package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzffv implements zzgay {
    final /* synthetic */ zzffy zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ boolean zzc;

    public zzffv(zzffy zzffyVar, zzffn zzffnVar, boolean z4) {
        this.zza = zzffyVar;
        this.zzb = zzffnVar;
        this.zzc = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzffn zzffnVar = this.zzb;
        if (zzffnVar.zzk()) {
            zzffy zzffyVar = this.zza;
            zzffnVar.zzh(th);
            zzffnVar.zzg(false);
            zzffyVar.zza(zzffnVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        zzffn zzffnVar = this.zzb;
        zzffnVar.zzg(true);
        this.zza.zza(zzffnVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
