package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzeew extends zzeev {
    private final zzcgb zza;
    private final zzctx zzb;
    private final zzdaj zzc;
    private final zzefg zzd;
    private final zzebw zze;

    public zzeew(zzcgb zzcgbVar, zzctx zzctxVar, zzdaj zzdajVar, zzefg zzefgVar, zzebw zzebwVar) {
        this.zza = zzcgbVar;
        this.zzb = zzctxVar;
        this.zzc = zzdajVar;
        this.zzd = zzefgVar;
        this.zze = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    public final I3.b zzc(zzfba zzfbaVar, Bundle bundle, zzfaf zzfafVar, zzfar zzfarVar) {
        zzctx zzctxVar = this.zzb;
        zzctxVar.zzk(zzfbaVar);
        zzctxVar.zzg(bundle);
        zzctxVar.zzh(new zzctq(zzfarVar, zzfafVar, this.zzd));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdM)).booleanValue()) {
            this.zzb.zze(this.zze);
        }
        zzcgb zzcgbVar = this.zza;
        zzctx zzctxVar2 = this.zzb;
        zzcnc zzcncVarZzc = zzcgbVar.zzc();
        zzcncVarZzc.zzd(zzctxVar2.zzl());
        zzcncVarZzc.zzc(this.zzc);
        zzcra zzcraVarZzb = zzcncVarZzc.zze().zzb();
        return zzcraVarZzb.zzh(zzcraVarZzb.zzi());
    }
}
