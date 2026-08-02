package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzglq {
    private static final zzglq zza = new zzglq();
    private final Map zzb = new HashMap();

    public static zzglq zzb() {
        return zza;
    }

    public final synchronized zzgdf zza(String str) {
        if (!this.zzb.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgdf) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzgdf zzgdfVar) {
        try {
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, zzgdfVar);
                return;
            }
            if (((zzgdf) this.zzb.get(str)).equals(zzgdfVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzgdfVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzgdf) entry.getValue());
        }
    }
}
