package com.google.android.gms.internal.fido;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzdx extends zzea {
    private final Map zza;
    private final Map zzb;
    private final zzdz zzc;
    private final zzdy zzd;

    public /* synthetic */ zzdx(zzdv zzdvVar, zzdw zzdwVar) {
        Map map;
        Map map2;
        zzdz zzdzVar;
        zzdy zzdyVar;
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        HashMap hashMap2 = new HashMap();
        this.zzb = hashMap2;
        map = zzdvVar.zzc;
        hashMap.putAll(map);
        map2 = zzdvVar.zzd;
        hashMap2.putAll(map2);
        zzdzVar = zzdvVar.zze;
        this.zzc = zzdzVar;
        zzdyVar = zzdvVar.zzf;
        this.zzd = zzdyVar;
    }
}
