package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzco {
    static {
        Logger.getLogger(zzco.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbg.class);
        hashSet.add(zzbl.class);
        hashSet.add(zzcq.class);
        hashSet.add(zzbn.class);
        hashSet.add(zzbo.class);
        hashSet.add(zzci.class);
        hashSet.add(zzrq.class);
        hashSet.add(zzcm.class);
        hashSet.add(zzcl.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzco() {
    }

    @Deprecated
    public static zzvq zza(String str, zzaip zzaipVar) {
        zzbs<?> zza = zzmt.zza().zza(str);
        if (zza instanceof zzcj) {
            return ((zzcj) zza).zzc(zzaipVar);
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static Class<?> zza(Class<?> cls) {
        try {
            return zzoc.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P zza(zzvq zzvqVar, Class<P> cls) {
        String zzf = zzvqVar.zzf();
        return zzmt.zza().zza(zzf, cls).zzb(zzvqVar.zze());
    }

    public static <B, P> P zza(zzoz<B> zzozVar, Class<P> cls) {
        return (P) zzoc.zza().zza(zzozVar, cls);
    }
}
