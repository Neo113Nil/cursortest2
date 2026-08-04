package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzect implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;
    private final zzhep zzg;

    public zzect(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
        this.zze = zzhepVar5;
        this.zzf = zzhepVar6;
        this.zzg = zzhepVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecs zzb() {
        return new zzecs((zzcot) this.zza.zzb(), (Context) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzdnq) this.zzd.zzb(), ((zzcuh) this.zze).zza(), (zzfsw) this.zzf.zzb(), (zzdqk) this.zzg.zzb());
    }
}
