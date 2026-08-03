package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhlo {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzhlo.class.getName());
    private static final com.google.android.gms.internal.ads.zzhlo zzd = new com.google.android.gms.internal.ads.zzhlo();
    private final java.util.concurrent.ConcurrentMap zzb = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();

    public static com.google.android.gms.internal.ads.zzhlo zza() {
        return zzd;
    }

    private final synchronized com.google.android.gms.internal.ads.zzhdr zzg(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.concurrent.ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return (com.google.android.gms.internal.ads.zzhdr) concurrentMap.get(str);
    }

    private final synchronized void zzh(com.google.android.gms.internal.ads.zzhdr zzhdrVar, boolean z, boolean z2) throws java.security.GeneralSecurityException {
        java.lang.String zzb = zzhdrVar.zzb();
        if (z2) {
            java.util.concurrent.ConcurrentMap concurrentMap = this.zzc;
            if (concurrentMap.containsKey(zzb) && !((java.lang.Boolean) concurrentMap.get(zzb)).booleanValue()) {
                throw new java.security.GeneralSecurityException("New keys are already disallowed for key type ".concat(zzb));
            }
        }
        java.util.concurrent.ConcurrentMap concurrentMap2 = this.zzb;
        com.google.android.gms.internal.ads.zzhdr zzhdrVar2 = (com.google.android.gms.internal.ads.zzhdr) concurrentMap2.get(zzb);
        if (zzhdrVar2 != null && !zzhdrVar2.getClass().equals(zzhdrVar.getClass())) {
            zza.logp(java.util.logging.Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(zzb));
            throw new java.security.GeneralSecurityException(java.lang.String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzb, zzhdrVar2.getClass().getName(), zzhdrVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(zzb, zzhdrVar);
        this.zzc.put(zzb, java.lang.Boolean.valueOf(z2));
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzhdr zzhdrVar, boolean z) throws java.security.GeneralSecurityException {
        zzf(zzhdrVar, 1, z);
    }

    public final com.google.android.gms.internal.ads.zzhdr zzc(java.lang.String str, java.lang.Class cls) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhdr zzg = zzg(str);
        if (zzg.zzc().equals(cls)) {
            return zzg;
        }
        java.lang.String name = cls.getName();
        java.lang.String valueOf = java.lang.String.valueOf(zzg.getClass());
        java.lang.String obj = zzg.zzc().toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 53 + java.lang.String.valueOf(valueOf).length() + 23 + obj.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(valueOf);
        sb.append(", which only supports: ");
        sb.append(obj);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public final com.google.android.gms.internal.ads.zzhdr zzd(java.lang.String str) throws java.security.GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(java.lang.String str) {
        return ((java.lang.Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzhdr zzhdrVar, int i, boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(i)) {
            throw new java.security.GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhdrVar, false, z);
    }
}
