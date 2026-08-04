package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
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
        zzgzk zzgzkVarZza = (zzgzk) this.zzd.get(cls);
        if (zzgzkVarZza == null) {
            zzgzkVarZza = this.zzc.zza(cls);
            zzgxt.zzc(cls, "messageType");
            zzgzk zzgzkVar = (zzgzk) this.zzd.putIfAbsent(cls, zzgzkVarZza);
            if (zzgzkVar != null) {
                return zzgzkVar;
            }
        }
        return zzgzkVarZza;
    }
}
