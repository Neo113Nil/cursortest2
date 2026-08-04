package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
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

    public final zzgct zza(String str, Class cls) throws GeneralSecurityException {
        zzgct zzgctVarZzg = zzg(str);
        if (zzgctVarZzg.zzb().equals(cls)) {
            return zzgctVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgctVarZzg.getClass());
        String string = zzgctVarZzg.zzb().toString();
        StringBuilder sbL = k.l("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbL.append(string);
        throw new GeneralSecurityException(sbL.toString());
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
