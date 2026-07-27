package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhmu {
    private static final Logger zza = Logger.getLogger(zzhmu.class.getName());
    private static final zzhmu zzd = new zzhmu();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhmu zza() {
        return zzd;
    }

    private final synchronized zzhet zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhet) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhet zzhetVar, boolean z, boolean z2) throws GeneralSecurityException {
        String zzb = zzhetVar.zzb();
        if (z2) {
            ConcurrentMap concurrentMap = this.zzc;
            if (concurrentMap.containsKey(zzb) && !((Boolean) concurrentMap.get(zzb)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(zzb));
            }
        }
        ConcurrentMap concurrentMap2 = this.zzb;
        zzhet zzhetVar2 = (zzhet) concurrentMap2.get(zzb);
        if (zzhetVar2 != null && !zzhetVar2.getClass().equals(zzhetVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(zzb));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzb, zzhetVar2.getClass().getName(), zzhetVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(zzb, zzhetVar);
        this.zzc.put(zzb, Boolean.valueOf(z2));
    }

    public final synchronized void zzb(zzhet zzhetVar, boolean z) throws GeneralSecurityException {
        zzf(zzhetVar, 1, z);
    }

    public final zzhet zzc(String str, Class cls) throws GeneralSecurityException {
        zzhet zzg = zzg(str);
        if (zzg.zzc().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzc().toString();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 53 + String.valueOf(valueOf).length() + 23 + obj.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(valueOf);
        sb.append(", which only supports: ");
        sb.append(obj);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhet zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhet zzhetVar, int i, boolean z) throws GeneralSecurityException {
        if (!zzhlx.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhetVar, false, z);
    }
}
