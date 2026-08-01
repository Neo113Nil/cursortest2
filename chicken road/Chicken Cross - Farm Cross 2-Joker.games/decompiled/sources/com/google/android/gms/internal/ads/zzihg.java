package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzihg {
    private static final zzihg zza = new zzihg();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzign zzb = new zzign();

    private zzihg() {
    }

    static zzihg zza() {
        return zza;
    }

    private <T> zziho<T> zzc(Class<T> cls) {
        ConcurrentMap concurrentMap = this.zzc;
        zziho<T> zza2 = this.zzb.zza(cls);
        zziho<T> zzihoVar = (zziho) concurrentMap.putIfAbsent(cls, zza2);
        return zzihoVar != null ? zzihoVar : zza2;
    }

    final zziho zzb(Class cls) {
        Object obj = this.zzc.get(cls);
        return obj == null ? zzc(cls) : (zziho) obj;
    }
}
