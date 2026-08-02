package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzetj implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;
    private final zzhep zze;

    public zzetj(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5, zzhep zzhepVar6, zzhep zzhepVar7) {
        this.zza = zzhepVar2;
        this.zzb = zzhepVar3;
        this.zzc = zzhepVar5;
        this.zzd = zzhepVar6;
        this.zze = zzhepVar7;
    }

    public static zzeth zza(zzbyh zzbyhVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i7, boolean z4, boolean z7) {
        return new zzeth(zzbyhVar, context, scheduledExecutorService, executor, i7, z4, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeth(zzcjw.zza(), ((zzcgi) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfdy.zzc(), ((zzeup) this.zzc).zzb().intValue(), ((zzeuq) this.zzd).zzb().booleanValue(), ((zzeus) this.zze).zzb().booleanValue());
    }
}
