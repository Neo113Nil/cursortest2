package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdpa implements zzheg {
    private final zzhep zza;

    public zzdpa(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        zzgbn zzc = zzfdy.zzc();
        Set singleton = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfe)).booleanValue() ? Collections.singleton(new zzdch(((zzdpt) this.zza).zzb(), zzc)) : Collections.emptySet();
        zzheo.zzb(singleton);
        return singleton;
    }
}
