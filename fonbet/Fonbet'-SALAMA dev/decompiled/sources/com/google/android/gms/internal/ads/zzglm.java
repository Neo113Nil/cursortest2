package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzglm {
    private static final zzglm zza = new zzglm();
    private final Map zzb = new HashMap();

    public static zzglm zza() {
        return zza;
    }

    public final synchronized void zzb(zzgll zzgllVar, Class cls) {
        try {
            zzgll zzgllVar2 = (zzgll) this.zzb.get(cls);
            if (zzgllVar2 != null && !zzgllVar2.equals(zzgllVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zzgllVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
