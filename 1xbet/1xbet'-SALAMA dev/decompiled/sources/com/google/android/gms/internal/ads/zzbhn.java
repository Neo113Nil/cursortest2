package com.google.android.gms.internal.ads;

import B2.i;
import android.os.Bundle;
import com.google.ads.mediation.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhn extends zzbgw {
    private final i zza;

    public zzbhn(i iVar) {
        this.zza = iVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze(zzbhd zzbhdVar) {
        zzbhe zzbheVar = new zzbhe(zzbhdVar);
        e eVar = (e) this.zza;
        eVar.getClass();
        com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
        aVar.f4325l = new Bundle();
        aVar.f4315a = zzbheVar.zzh();
        aVar.f4316b = zzbheVar.zzk();
        aVar.f4317c = zzbheVar.zzf();
        aVar.f4318d = zzbheVar.zzb();
        aVar.f4319e = zzbheVar.zzg();
        aVar.f4320f = zzbheVar.zze();
        aVar.f4321g = zzbheVar.zzc();
        aVar.f4322h = zzbheVar.zzj();
        aVar.f4323i = zzbheVar.zzi();
        aVar.f4324k = zzbheVar.zzd();
        aVar.f4326m = true;
        aVar.f4327n = true;
        aVar.j = zzbheVar.zza();
        eVar.f10511b.onAdLoaded(eVar.f10510a, aVar);
    }
}
