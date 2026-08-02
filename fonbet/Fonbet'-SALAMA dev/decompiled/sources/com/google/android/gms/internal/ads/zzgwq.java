package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgwq {
    static final zzgwq zza = new zzgwq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgwq zzd;
    private final Map zze;

    public zzgwq() {
        this.zze = new HashMap();
    }

    public static zzgwq zza() {
        int i7 = zzgzb.zza;
        return zza;
    }

    public static zzgwq zzb() {
        zzgwq zzgwqVar = zzd;
        if (zzgwqVar != null) {
            return zzgwqVar;
        }
        synchronized (zzgwq.class) {
            try {
                zzgwq zzgwqVar2 = zzd;
                if (zzgwqVar2 != null) {
                    return zzgwqVar2;
                }
                int i7 = zzgzb.zza;
                zzgwq zzb2 = zzgwy.zzb(zzgwq.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzgxe zzc(zzgyr zzgyrVar, int i7) {
        return (zzgxe) this.zze.get(new zzgwp(zzgyrVar, i7));
    }

    public zzgwq(boolean z4) {
        this.zze = Collections.emptyMap();
    }
}
