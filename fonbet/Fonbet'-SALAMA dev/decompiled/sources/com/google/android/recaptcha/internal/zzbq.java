package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzbq {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i7, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i7);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzbp();
        }
        zzbp zzbpVar = (zzbp) obj;
        zzbpVar.zzg(zzbpVar.zzb() + 1);
        zzbpVar.zzf(zzbpVar.zzd() + j);
        zzbpVar.zze(Math.max(j, zzbpVar.zzc()));
        concurrentHashMap.put(valueOf, zzbpVar);
    }
}
