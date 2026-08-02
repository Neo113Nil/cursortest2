package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzdgj implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzdgj(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzaxt zzaxtVar = (zzaxt) this.zza.zzb();
        Executor executor = (Executor) this.zzb.zzb();
        Context context = (Context) this.zzc.zzb();
        return new zzcmu(executor, new zzcmg(context, zzaxtVar), (InterfaceC1436a) this.zzd.zzb());
    }
}
