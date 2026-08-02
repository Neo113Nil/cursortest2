package com.google.android.gms.internal.ads;

import F2.C0254t;

/* loaded from: classes.dex */
public final class zzdft implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;

    public zzdft(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
        this.zze = zzhepVar5;
        this.zzf = zzhepVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzcgb zzcgbVar = (zzcgb) this.zza.zzb();
        zzctx zza = ((zzcui) this.zzb).zza();
        zzdaj zza2 = ((zzdbd) this.zzc).zza();
        zzdfi zza3 = ((zzdfk) this.zzd).zza();
        zzcxi zzb = ((zzcno) this.zze).zzb();
        zzefg zzefgVar = (zzefg) this.zzf.zzb();
        zzcos zzd = zzcgbVar.zzd();
        zzd.zzi(zza.zzl());
        zzd.zzf(zza2);
        zzd.zzd(zza3);
        zzd.zze(new zzehm(null));
        zzd.zzg(new zzcpo(zzb, null));
        zzd.zzc(new zzcnm(null));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdP)).booleanValue()) {
            zzd.zzj(zzefp.zzb(zzefgVar));
        }
        zzcpz zzb2 = zzd.zzh().zzb();
        zzheo.zzb(zzb2);
        return zzb2;
    }
}
