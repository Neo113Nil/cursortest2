package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzeet extends zzeev {
    private final zzcgb zza;
    private final zzdfi zzb;
    private final zzctx zzc;
    private final zzdaj zzd;
    private final zzefg zze;
    private final zzebw zzf;

    public zzeet(zzcgb zzcgbVar, zzdfi zzdfiVar, zzctx zzctxVar, zzdaj zzdajVar, zzefg zzefgVar, zzebw zzebwVar) {
        this.zza = zzcgbVar;
        this.zzb = zzdfiVar;
        this.zzc = zzctxVar;
        this.zzd = zzdajVar;
        this.zze = zzefgVar;
        this.zzf = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    public final I3.b zzc(zzfba zzfbaVar, Bundle bundle, zzfaf zzfafVar, zzfar zzfarVar) {
        zzctx zzctxVar = this.zzc;
        zzctxVar.zzk(zzfbaVar);
        zzctxVar.zzg(bundle);
        zzctxVar.zzh(new zzctq(zzfarVar, zzfafVar, this.zze));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdM)).booleanValue()) {
            this.zzc.zze(this.zzf);
        }
        zzcgb zzcgbVar = this.zza;
        zzctx zzctxVar2 = this.zzc;
        zzdfm zzdfmVarZzg = zzcgbVar.zzg();
        zzdfmVarZzg.zzf(zzctxVar2.zzl());
        zzdfmVarZzg.zze(this.zzd);
        zzdfmVarZzg.zzd(this.zzb);
        zzdfmVarZzg.zzc(new zzcnm(null));
        zzcra zzcraVarZza = zzdfmVarZzg.zzg().zza();
        return zzcraVarZza.zzh(zzcraVarZza.zzi());
    }
}
