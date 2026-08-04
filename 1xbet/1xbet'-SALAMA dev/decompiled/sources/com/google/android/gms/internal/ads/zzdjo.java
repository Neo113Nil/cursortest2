package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdjo implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzdjo(zzdjh zzdjhVar, zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdch(((zzdmq) this.zza).zzb(), (Executor) this.zzb.zzb());
    }
}
