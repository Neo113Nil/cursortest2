package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzewg implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;
    private final zzhep zzf;

    public zzewg(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
        this.zze = zzhepVar5;
        this.zzf = zzhepVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewf((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzcgb) this.zzc.zzb(), ((zzexy) this.zzd).zzb(), (zzewd) this.zze.zzb(), new zzfay(), ((zzcgw) this.zzf).zza());
    }
}
