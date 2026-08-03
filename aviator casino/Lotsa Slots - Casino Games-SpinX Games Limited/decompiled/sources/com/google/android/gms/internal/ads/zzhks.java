package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhks {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzhks.class.getName());
    private static final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);

    private zzhks() {
    }

    public static boolean zza() {
        return zzb.get();
    }

    static java.lang.Boolean zzb() {
        try {
            return (java.lang.Boolean) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zza.logp(java.util.logging.Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return false;
        }
    }
}
