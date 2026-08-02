package com.google.android.gms.internal.ads;

import B2.g;
import com.google.ads.mediation.e;

/* loaded from: classes.dex */
final class zzbhh extends zzbgm {
    final /* synthetic */ zzbhk zza;

    public /* synthetic */ zzbhh(zzbhk zzbhkVar, zzbhj zzbhjVar) {
        this.zza = zzbhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zze(zzbgd zzbgdVar, String str) {
        g gVar;
        g gVar2;
        zzbge zzf;
        zzbhk zzbhkVar = this.zza;
        gVar = zzbhkVar.zzb;
        if (gVar == null) {
            return;
        }
        gVar2 = zzbhkVar.zzb;
        zzf = zzbhkVar.zzf(zzbgdVar);
        e eVar = (e) gVar2;
        eVar.f10511b.zze(eVar.f10510a, zzf, str);
    }
}
