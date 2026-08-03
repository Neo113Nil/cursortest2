package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhpn implements com.google.android.gms.internal.ads.zzhoj {
    private zzhpn(com.google.android.gms.internal.ads.zzhob zzhobVar, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            javax.crypto.Mac.getInstance("AESCMAC", provider);
            zzhobVar.zze().zzc();
            zzhobVar.zzf();
            new javax.crypto.spec.SecretKeySpec(zzhobVar.zzd().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), "AES");
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.security.GeneralSecurityException("AES-CMAC not available.", e);
        }
    }

    public static com.google.android.gms.internal.ads.zzhoj zza(com.google.android.gms.internal.ads.zzhob zzhobVar, java.security.Provider provider) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhpn(zzhobVar, provider);
    }
}
