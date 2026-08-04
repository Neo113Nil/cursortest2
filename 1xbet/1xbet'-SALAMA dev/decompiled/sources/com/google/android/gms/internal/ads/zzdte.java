package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdte implements zzheg {
    private final zzhep zza;

    public zzdte(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
    }

    public static zzdch zza(zzdtd zzdtdVar, Executor executor) {
        return new zzdch(zzdtdVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzdtd) this.zza.zzb(), zzfdy.zzc());
    }
}
