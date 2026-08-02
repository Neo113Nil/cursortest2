package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class zzeey extends zzeev {
    private final zzcgb zza;
    private final zzctx zzb;
    private final zzehm zzc;
    private final zzdaj zzd;
    private final zzdfi zze;
    private final zzcxi zzf;
    private final ViewGroup zzg;
    private final zzczo zzh;
    private final zzefg zzi;
    private final zzebw zzj;

    public zzeey(zzcgb zzcgbVar, zzctx zzctxVar, zzehm zzehmVar, zzdaj zzdajVar, zzdfi zzdfiVar, zzcxi zzcxiVar, ViewGroup viewGroup, zzczo zzczoVar, zzefg zzefgVar, zzebw zzebwVar) {
        this.zza = zzcgbVar;
        this.zzb = zzctxVar;
        this.zzc = zzehmVar;
        this.zzd = zzdajVar;
        this.zze = zzdfiVar;
        this.zzf = zzcxiVar;
        this.zzg = viewGroup;
        this.zzh = zzczoVar;
        this.zzi = zzefgVar;
        this.zzj = zzebwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    public final I3.b zzc(zzfba zzfbaVar, Bundle bundle, zzfaf zzfafVar, zzfar zzfarVar) {
        zzctx zzctxVar = this.zzb;
        zzctxVar.zzk(zzfbaVar);
        zzctxVar.zzg(bundle);
        zzctxVar.zzh(new zzctq(zzfarVar, zzfafVar, this.zzi));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdM)).booleanValue()) {
            this.zzb.zze(this.zzj);
        }
        zzcgb zzcgbVar = this.zza;
        zzctx zzctxVar2 = this.zzb;
        zzcos zzd = zzcgbVar.zzd();
        zzd.zzi(zzctxVar2.zzl());
        zzd.zzf(this.zzd);
        zzd.zze(this.zzc);
        zzd.zzd(this.zze);
        zzd.zzg(new zzcpo(this.zzf, this.zzh));
        zzd.zzc(new zzcnm(this.zzg));
        zzcra zzc = zzd.zzk().zzc();
        return zzc.zzh(zzc.zzi());
    }
}
