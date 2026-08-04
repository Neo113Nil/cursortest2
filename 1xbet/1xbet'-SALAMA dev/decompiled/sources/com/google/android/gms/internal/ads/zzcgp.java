package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzcgp implements zzheg {
    private final zzhep zza;

    public zzcgp(zzhep zzhepVar, zzhep zzhepVar2) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        Set setSingleton = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbO)).booleanValue() ? Collections.singleton(new zzdch((zzdsw) this.zza.zzb(), zzfdy.zzc())) : Collections.emptySet();
        zzheo.zzb(setSingleton);
        return setSingleton;
    }
}
