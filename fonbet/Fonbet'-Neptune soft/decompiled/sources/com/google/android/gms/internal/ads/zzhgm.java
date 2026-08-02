package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public class zzhgm {
    final LinkedHashMap zza;

    zzhgm(int i) {
        this.zza = zzhgo.zzb(i);
    }

    final zzhgm zza(Object obj, zzhha zzhhaVar) {
        zzhgz.zza(obj, "key");
        zzhgz.zza(zzhhaVar, "provider");
        this.zza.put(obj, zzhhaVar);
        return this;
    }
}
