package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcoi implements zzheg {
    private final zzhep zza;

    public zzcoi(zzcnw zzcnwVar, zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdch((zzcpl) this.zza.zzb(), zzbza.zzg));
        zzheo.zzb(singleton);
        return singleton;
    }
}
