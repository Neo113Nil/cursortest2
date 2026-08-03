package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhpo implements com.google.android.gms.internal.ads.zzhoj {
    public zzhpo(com.google.android.gms.internal.ads.zzhob zzhobVar) {
    }

    public static com.google.android.gms.internal.ads.zzhoj zza(com.google.android.gms.internal.ads.zzhob zzhobVar) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        java.security.Provider zza = com.google.android.gms.internal.ads.zzhkv.zza();
        if (zza != null) {
            try {
                return com.google.android.gms.internal.ads.zzhpn.zza(zzhobVar, zza);
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        return new com.google.android.gms.internal.ads.zzhpo(zzhobVar);
    }
}
