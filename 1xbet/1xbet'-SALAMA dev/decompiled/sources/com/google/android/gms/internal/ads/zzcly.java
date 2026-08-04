package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzcly implements zzgay {
    final /* synthetic */ String zza;
    final /* synthetic */ zzclz zzb;

    public zzcly(zzclz zzclzVar, String str) {
        this.zza = str;
        this.zzb = zzclzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzclz zzclzVar = this.zzb;
        zzclzVar.zzh.zza(zzclzVar.zzg.zze(zzclzVar.zze, zzclzVar.zzf, false, this.zza, null, zzclzVar.zzu()));
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzclz zzclzVar = this.zzb;
        zzclzVar.zzh.zza(zzclzVar.zzg.zze(zzclzVar.zze, zzclzVar.zzf, false, this.zza, (String) obj, zzclzVar.zzu()));
    }
}
