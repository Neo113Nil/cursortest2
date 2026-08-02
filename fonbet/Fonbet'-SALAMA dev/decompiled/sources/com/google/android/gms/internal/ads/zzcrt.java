package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcrt implements zzheg {
    private final zzhep zza;

    public zzcrt(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
    }

    public static zzdch zza(zzclz zzclzVar, Executor executor) {
        return new zzdch(zzclzVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzclz) this.zza.zzb(), zzfdy.zzc());
    }
}
