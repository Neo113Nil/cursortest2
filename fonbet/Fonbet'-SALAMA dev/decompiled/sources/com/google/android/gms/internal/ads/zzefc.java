package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzefc extends zzeev {
    private final zzcgb zza;
    private final zzctx zzb;
    private final zzdaj zzc;
    private final zzefg zzd;
    private final zzfas zze;
    private final zzebw zzf;

    public zzefc(zzcgb zzcgbVar, zzctx zzctxVar, zzdaj zzdajVar, zzfas zzfasVar, zzefg zzefgVar, zzebw zzebwVar) {
        this.zza = zzcgbVar;
        this.zzb = zzctxVar;
        this.zzc = zzdajVar;
        this.zze = zzfasVar;
        this.zzd = zzefgVar;
        this.zzf = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    public final I3.b zzc(zzfba zzfbaVar, Bundle bundle, zzfaf zzfafVar, zzfar zzfarVar) {
        zzfas zzfasVar;
        zzctx zzctxVar = this.zzb;
        zzctxVar.zzk(zzfbaVar);
        zzctxVar.zzg(bundle);
        zzctxVar.zzh(new zzctq(zzfarVar, zzfafVar, this.zzd));
        zzbbp zzbbpVar = zzbby.zzdL;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && (zzfasVar = this.zze) != null) {
            this.zzb.zzj(zzfasVar);
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdM)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcgb zzcgbVar = this.zza;
        zzctx zzctxVar2 = this.zzb;
        zzdmy zzh = zzcgbVar.zzh();
        zzh.zzd(zzctxVar2.zzl());
        zzh.zzc(this.zzc);
        zzcra zzb = zzh.zze().zzb();
        return zzb.zzh(zzb.zzi());
    }
}
