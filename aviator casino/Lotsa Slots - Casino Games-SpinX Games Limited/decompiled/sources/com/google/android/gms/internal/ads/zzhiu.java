package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhiu {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzhit();

    public static javax.crypto.Cipher zza() {
        return (javax.crypto.Cipher) zza.get();
    }

    public static javax.crypto.SecretKey zzb(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziax.zza(bArr.length);
        return new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static java.security.spec.AlgorithmParameterSpec zzc(byte[] bArr, int i, int i2) {
        java.lang.Integer zzd = com.google.android.gms.internal.ads.zzhnz.zzd();
        if (zzd != null) {
            zzd.intValue();
        }
        return new javax.crypto.spec.GCMParameterSpec(128, bArr, i, 12);
    }
}
