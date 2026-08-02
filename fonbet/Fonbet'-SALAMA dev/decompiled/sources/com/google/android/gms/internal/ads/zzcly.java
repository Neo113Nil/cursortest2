package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzcly implements zzgay {
    final /* synthetic */ String zza;
    final /* synthetic */ zzclz zzb;

    public zzcly(zzclz zzclzVar, String str) {
        this.zza = str;
        this.zzb = zzclzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzfbm zzfbmVar;
        zzfhv zzfhvVar;
        zzfar zzfarVar;
        zzfaf zzfafVar;
        List zzu;
        zzclz zzclzVar = this.zzb;
        zzfbmVar = zzclzVar.zzh;
        zzfhvVar = zzclzVar.zzg;
        zzfarVar = zzclzVar.zze;
        zzfafVar = zzclzVar.zzf;
        zzu = zzclzVar.zzu();
        zzfbmVar.zza(zzfhvVar.zze(zzfarVar, zzfafVar, false, this.zza, null, zzu));
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbm zzfbmVar;
        zzfhv zzfhvVar;
        zzfar zzfarVar;
        zzfaf zzfafVar;
        List zzu;
        zzclz zzclzVar = this.zzb;
        String str = this.zza;
        String str2 = (String) obj;
        zzfbmVar = zzclzVar.zzh;
        zzfhvVar = zzclzVar.zzg;
        zzfarVar = zzclzVar.zze;
        zzfafVar = zzclzVar.zzf;
        zzu = zzclzVar.zzu();
        zzfbmVar.zza(zzfhvVar.zze(zzfarVar, zzfafVar, false, str, str2, zzu));
    }
}
