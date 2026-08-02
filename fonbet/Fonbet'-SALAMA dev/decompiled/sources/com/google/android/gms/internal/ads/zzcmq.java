package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcmq implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;

    public zzcmq(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet = ((JSONObject) this.zzb.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdch((zzcmk) this.zza.zzb(), zzfdy.zzc()));
        zzheo.zzb(emptySet);
        return emptySet;
    }
}
