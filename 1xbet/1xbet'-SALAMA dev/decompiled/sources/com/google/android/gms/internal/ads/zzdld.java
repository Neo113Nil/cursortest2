package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdld implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;
    private final zzhep zzg;
    private final zzhep zzh;

    public zzdld(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7, zzhep zzhepVar8) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
        this.zze = zzhepVar5;
        this.zzf = zzhepVar6;
        this.zzg = zzhepVar7;
        this.zzh = zzhepVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlb(((zzcuh) this.zza).zza(), (Executor) this.zzb.zzb(), (zzdnq) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzdqq) this.zze.zzb(), (zzfia) this.zzf.zzb(), (zzeaf) this.zzg.zzb(), (zzdml) this.zzh.zzb());
    }
}
