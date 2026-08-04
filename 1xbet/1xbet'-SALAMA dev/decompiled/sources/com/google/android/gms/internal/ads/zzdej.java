package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdej implements zzheg {
    private final zzhep zza;

    public zzdej(zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdch((zzdfc) this.zza.zzb(), zzbza.zzg));
        zzheo.zzb(setSingleton);
        return setSingleton;
    }
}
