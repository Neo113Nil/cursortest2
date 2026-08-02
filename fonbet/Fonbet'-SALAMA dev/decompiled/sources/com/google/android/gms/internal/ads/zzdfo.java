package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdfo implements zzheg {
    private final zzhep zza;

    public zzdfo(zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdfl) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzheo.zzb(singleton);
        return singleton;
    }
}
