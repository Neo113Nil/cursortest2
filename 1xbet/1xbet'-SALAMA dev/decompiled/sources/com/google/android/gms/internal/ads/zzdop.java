package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzdop implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;

    public zzdop(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
        this.zze = zzhepVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcgi) this.zza).zza();
        final String strZzb = ((zzdvn) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcgw) this.zzc).zza();
        final zzbbd.zza.EnumC0000zza enumC0000zza = (zzbbd.zza.EnumC0000zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbaw zzbawVar = new zzbaw(new zzbbc(contextZza));
        zzbbd.zzar.zza zzaVarZzd = zzbbd.zzar.zzd();
        zzaVarZzd.zzg(versionInfoParcelZza.f10835b);
        zzaVarZzd.zzi(versionInfoParcelZza.f10836c);
        zzaVarZzd.zzh(true != versionInfoParcelZza.f10837d ? 2 : 0);
        final zzbbd.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbawVar.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzbav
            public final void zza(zzbbd.zzt.zza zzaVar) {
                zzbbd.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbVarZzbM.zzH(enumC0000zza);
                zzaVar.zzG(zzbVarZzbM);
                zzbbd.zzm.zza zzaVarZzbM = zzaVar.zzg().zzbM();
                zzaVarZzbM.zzm(strZzb);
                zzaVarZzbM.zzw(zzarVarZzbr);
                zzaVar.zzK(zzaVarZzbM);
                zzaVar.zzO(str);
            }
        });
        return zzbawVar;
    }
}
