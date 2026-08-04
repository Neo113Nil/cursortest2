package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzefa extends zzeev {
    private final zzcgb zza;
    private final zzctx zzb;
    private final zzehm zzc;
    private final zzdaj zzd;
    private final zzefg zze;
    private final zzebw zzf;

    public zzefa(zzcgb zzcgbVar, zzctx zzctxVar, zzehm zzehmVar, zzdaj zzdajVar, zzefg zzefgVar, zzebw zzebwVar) {
        this.zza = zzcgbVar;
        this.zzb = zzctxVar;
        this.zzc = zzehmVar;
        this.zzd = zzdajVar;
        this.zze = zzefgVar;
        this.zzf = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    public final I3.b zzc(zzfba zzfbaVar, Bundle bundle, zzfaf zzfafVar, zzfar zzfarVar) {
        zzctx zzctxVar = this.zzb;
        zzctxVar.zzk(zzfbaVar);
        zzctxVar.zzg(bundle);
        zzctxVar.zzh(new zzctq(zzfarVar, zzfafVar, this.zze));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdM)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcgb zzcgbVar = this.zza;
        zzctx zzctxVar2 = this.zzb;
        zzdeq zzdeqVarZzf = zzcgbVar.zzf();
        zzdeqVarZzf.zze(zzctxVar2.zzl());
        zzdeqVarZzf.zzd(this.zzd);
        zzdeqVarZzf.zzc(this.zzc);
        zzcra zzcraVarZza = zzdeqVarZzf.zzf().zza();
        return zzcraVarZza.zzh(zzcraVarZza.zzi());
    }
}
