package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdrj implements zzheg {
    private final zzdrf zza;
    private final zzhep zzb;

    public zzdrj(zzdrf zzdrfVar, zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzdrfVar;
        this.zzb = zzhepVar;
    }

    public static Set zza(zzdrf zzdrfVar, zzdrp zzdrpVar, Executor executor) {
        Set setZzd = zzdrf.zzd(zzdrpVar, executor);
        zzheo.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzdrp) this.zzb.zzb(), zzfdy.zzc());
    }
}
