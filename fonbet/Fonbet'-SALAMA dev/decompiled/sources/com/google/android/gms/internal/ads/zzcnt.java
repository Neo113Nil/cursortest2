package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcnt implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;
    private final zzhep zzg;
    private final zzhep zzh;
    private final zzhep zzi;
    private final zzhep zzj;

    public zzcnt(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7, zzhep zzhepVar8, zzhep zzhepVar9, zzhep zzhepVar10) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
        this.zze = zzhepVar5;
        this.zzf = zzhepVar6;
        this.zzg = zzhepVar7;
        this.zzh = zzhepVar8;
        this.zzi = zzhepVar9;
        this.zzj = zzhepVar10;
    }

    public static zzcns zzc(zzcpv zzcpvVar, Context context, zzfag zzfagVar, View view, zzceb zzcebVar, zzcpu zzcpuVar, zzdhn zzdhnVar, zzdcr zzdcrVar, zzhea zzheaVar, Executor executor) {
        return new zzcns(zzcpvVar, context, zzfagVar, view, zzcebVar, zzcpuVar, zzdhnVar, zzdcrVar, zzheaVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcns zzb() {
        return new zzcns(((zzcsc) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcnz) this.zzc).zza(), ((zzcny) this.zzd).zza(), ((zzcom) this.zze).zza(), ((zzcoa) this.zzf).zza(), ((zzdfl) this.zzg).zza(), (zzdcr) this.zzh.zzb(), zzhef.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
