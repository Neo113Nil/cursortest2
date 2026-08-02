package com.google.android.gms.internal.ads;

import e1.k;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzgkh {
    private static final Logger zza = Logger.getLogger(zzgkh.class.getName());
    private static final zzgkh zzb = new zzgkh();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgkh zzc() {
        return zzb;
    }

    private final synchronized zzgct zzg(String str) {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgct) this.zzc.get(str);
    }

    private final synchronized void zzh(zzgct zzgctVar, boolean z4, boolean z7) {
        try {
            String str = ((zzgkq) zzgctVar).zza;
            if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            zzgct zzgctVar2 = (zzgct) this.zzc.get(str);
            if (zzgctVar2 != null && !zzgctVar2.getClass().equals(zzgctVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + zzgctVar2.getClass().getName() + ", cannot be re-registered with " + zzgctVar.getClass().getName());
            }
            this.zzc.putIfAbsent(str, zzgctVar);
            this.zzd.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzgct zza(String str, Class cls) {
        zzgct zzg = zzg(str);
        if (zzg.zzb().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzb().toString();
        StringBuilder l7 = k.l("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        l7.append(obj);
        throw new GeneralSecurityException(l7.toString());
    }

    public final zzgct zzb(String str) {
        return zzg(str);
    }

    public final synchronized void zzd(zzgct zzgctVar, boolean z4) {
        zzf(zzgctVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgct zzgctVar, int i7, boolean z4) {
        if (!zzgjy.zza(i7)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgctVar, false, true);
    }
}
