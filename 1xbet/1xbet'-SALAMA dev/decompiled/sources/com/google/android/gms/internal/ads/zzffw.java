package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzffw implements zzgay {
    final /* synthetic */ zzffy zza;
    final /* synthetic */ zzffn zzb;

    public zzffw(zzffy zzffyVar, zzffn zzffnVar) {
        this.zza = zzffyVar;
        this.zzb = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzffn zzffnVar = this.zzb;
        zzffnVar.zzh(th);
        zzffnVar.zzg(false);
        this.zza.zza(zzffnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
    }
}
