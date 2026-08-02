package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
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
        Context zza = ((zzcgi) this.zza).zza();
        final String zzb = ((zzdvn) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcgw) this.zzc).zza();
        final zzbbd.zza.EnumC0000zza enumC0000zza = (zzbbd.zza.EnumC0000zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbaw zzbawVar = new zzbaw(new zzbbc(zza));
        zzbbd.zzar.zza zzd = zzbbd.zzar.zzd();
        zzd.zzg(zza2.f10835b);
        zzd.zzi(zza2.f10836c);
        zzd.zzh(true != zza2.f10837d ? 2 : 0);
        final zzbbd.zzar zzbr = zzd.zzbr();
        zzbawVar.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzbav
            public final void zza(zzbbd.zzt.zza zzaVar) {
                zzbbd.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbM.zzH(zzbbd.zza.EnumC0000zza.this);
                zzaVar.zzG(zzbM);
                zzbbd.zzm.zza zzbM2 = zzaVar.zzg().zzbM();
                zzbM2.zzm(zzb);
                zzbM2.zzw(zzbr);
                zzaVar.zzK(zzbM2);
                zzaVar.zzO(str);
            }
        });
        return zzbawVar;
    }
}
