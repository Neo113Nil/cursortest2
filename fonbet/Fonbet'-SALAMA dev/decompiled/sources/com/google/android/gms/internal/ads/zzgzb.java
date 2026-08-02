package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzgzb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzb zzb = new zzgzb();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzgzl zzc = new zzgyj();

    private zzgzb() {
    }

    public static zzgzb zza() {
        return zzb;
    }

    public final zzgzk zzb(Class cls) {
        zzgxt.zzc(cls, "messageType");
        zzgzk zzgzkVar = (zzgzk) this.zzd.get(cls);
        if (zzgzkVar == null) {
            zzgzkVar = this.zzc.zza(cls);
            zzgxt.zzc(cls, "messageType");
            zzgzk zzgzkVar2 = (zzgzk) this.zzd.putIfAbsent(cls, zzgzkVar);
            if (zzgzkVar2 != null) {
                return zzgzkVar2;
            }
        }
        return zzgzkVar;
    }
}
