package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzcof implements zzheg {
    private final zzcnw zza;
    private final zzhep zzb;

    public zzcof(zzcnw zzcnwVar, zzhep zzhepVar) {
        this.zza = zzcnwVar;
        this.zzb = zzhepVar;
    }

    public static Set zza(zzcnw zzcnwVar, zzcpl zzcplVar) {
        Set setSingleton = Collections.singleton(new zzdch(zzcplVar, zzbza.zzg));
        zzheo.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcpl) this.zzb.zzb());
    }
}
