package com.google.android.gms.internal.ads;

import B2.g;
import com.google.ads.mediation.e;

/* JADX INFO: loaded from: classes.dex */
final class zzbhh extends zzbgm {
    final /* synthetic */ zzbhk zza;

    public /* synthetic */ zzbhh(zzbhk zzbhkVar, zzbhj zzbhjVar) {
        this.zza = zzbhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zze(zzbgd zzbgdVar, String str) {
        zzbhk zzbhkVar = this.zza;
        if (zzbhkVar.zzb == null) {
            return;
        }
        g gVar = zzbhkVar.zzb;
        e eVar = (e) gVar;
        eVar.f10511b.zze(eVar.f10510a, zzbhkVar.zzf(zzbgdVar), str);
    }
}
