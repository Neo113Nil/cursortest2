package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
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
        zzctx zzctxVarZza = ((zzcui) this.zzb).zza();
        zzdaj zzdajVarZza = ((zzdbd) this.zzc).zza();
        zzdfi zzdfiVarZza = ((zzdfk) this.zzd).zza();
        zzcxi zzcxiVarZzb = ((zzcno) this.zze).zzb();
        zzefg zzefgVar = (zzefg) this.zzf.zzb();
        zzcos zzcosVarZzd = zzcgbVar.zzd();
        zzcosVarZzd.zzi(zzctxVarZza.zzl());
        zzcosVarZzd.zzf(zzdajVarZza);
        zzcosVarZzd.zzd(zzdfiVarZza);
        zzcosVarZzd.zze(new zzehm(null));
        zzcosVarZzd.zzg(new zzcpo(zzcxiVarZzb, null));
        zzcosVarZzd.zzc(new zzcnm(null));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdP)).booleanValue()) {
            zzcosVarZzd.zzj(zzefp.zzb(zzefgVar));
        }
        zzcpz zzcpzVarZzb = zzcosVarZzd.zzh().zzb();
        zzheo.zzb(zzcpzVarZzb);
        return zzcpzVarZzb;
    }
}
