package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import e1.k;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzmt {
    private static final Logger zza = Logger.getLogger(zzmt.class.getName());
    private static final zzmt zzb = new zzmt();
    private ConcurrentMap<String, zzbs<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbs<?> zzc(String str) {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final <P> zzbs<P> zza(String str, Class<P> cls) {
        zzbs<P> zzbsVar = (zzbs<P>) zzc(str);
        if (zzbsVar.zza().equals(cls)) {
            return zzbsVar;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzbsVar.getClass());
        String valueOf2 = String.valueOf(zzbsVar.zza());
        StringBuilder l7 = k.l("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        l7.append(valueOf2);
        throw new GeneralSecurityException(l7.toString());
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbs<?> zza(String str) {
        return zzc(str);
    }

    public static zzmt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbs<?> zzbsVar, boolean z4, boolean z7) {
        try {
            String zzb2 = zzbsVar.zzb();
            if (z7 && this.zzd.containsKey(zzb2) && !this.zzd.get(zzb2).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
            }
            zzbs<?> zzbsVar2 = this.zzc.get(zzb2);
            if (zzbsVar2 != null && !zzbsVar2.getClass().equals(zzbsVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
                throw new GeneralSecurityException("typeUrl (" + zzb2 + ") is already registered with " + zzbsVar2.getClass().getName() + ", cannot be re-registered with " + zzbsVar.getClass().getName());
            }
            this.zzc.putIfAbsent(zzb2, zzbsVar);
            this.zzd.put(zzb2, Boolean.valueOf(z7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, boolean z4) {
        zza(zzbsVar, zzil.zza.zza, z4);
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, zzil.zza zzaVar, boolean z4) {
        if (zzaVar.zza()) {
            zza((zzbs<?>) zzbsVar, false, z4);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
