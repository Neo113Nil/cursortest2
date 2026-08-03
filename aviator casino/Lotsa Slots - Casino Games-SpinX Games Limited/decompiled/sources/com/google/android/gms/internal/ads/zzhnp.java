package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnp {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzhno();

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        ((java.security.SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    static /* synthetic */ java.security.SecureRandom zzb() {
        java.security.SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    private static java.security.SecureRandom zzc() {
        java.security.Provider zza2 = com.google.android.gms.internal.ads.zzhkv.zza();
        if (zza2 != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", zza2);
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        java.security.Provider provider = null;
        try {
            provider = (java.security.Provider) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused2) {
        }
        if (provider != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (java.security.GeneralSecurityException unused3) {
            }
        }
        return new java.security.SecureRandom();
    }
}
