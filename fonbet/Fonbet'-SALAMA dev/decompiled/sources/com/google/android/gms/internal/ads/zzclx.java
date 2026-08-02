package com.google.android.gms.internal.ads;

import E2.o;
import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
final class zzclx implements zzgay {
    final /* synthetic */ zzclz zza;

    public zzclx(zzclz zzclzVar) {
        this.zza = zzclzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        zzfbm zzfbmVar;
        zzfhv zzfhvVar;
        zzfar zzfarVar;
        zzfaf zzfafVar;
        zzfaf zzfafVar2;
        Context context;
        zzclz zzclzVar = this.zza;
        String str = (String) obj;
        zzfbmVar = zzclzVar.zzh;
        zzfhvVar = zzclzVar.zzg;
        zzfarVar = zzclzVar.zze;
        zzfafVar = zzclzVar.zzf;
        zzfafVar2 = zzclzVar.zzf;
        List zze = zzfhvVar.zze(zzfarVar, zzfafVar, false, "", str, zzfafVar2.zzc);
        zzclz zzclzVar2 = this.zza;
        zzbyq zzbyqVar = o.f1952C.f1961g;
        context = zzclzVar2.zza;
        zzfbmVar.zzc(zze, true == zzbyqVar.zzA(context) ? 2 : 1);
    }
}
