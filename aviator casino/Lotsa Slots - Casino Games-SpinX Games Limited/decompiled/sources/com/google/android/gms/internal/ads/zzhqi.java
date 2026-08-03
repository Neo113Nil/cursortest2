package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqi implements com.google.android.gms.internal.ads.zzhqd {
    private final java.security.Key zza;
    private final java.security.Provider zzb;

    private zzhqi(byte[] bArr, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.zza = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.zzb = provider;
    }

    public static com.google.android.gms.internal.ads.zzhqd zzb(com.google.android.gms.internal.ads.zzhqb zzhqbVar) throws java.security.GeneralSecurityException {
        java.security.Provider zza = com.google.android.gms.internal.ads.zzhkv.zza();
        if (zza == null) {
            throw new java.security.GeneralSecurityException("Conscrypt not available");
        }
        javax.crypto.Mac.getInstance("AESCMAC", zza);
        return new com.google.android.gms.internal.ads.zzhqi(zzhqbVar.zzd().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqd
    public final byte[] zza(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (i > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        java.security.Provider provider = this.zzb;
        java.security.Key key = this.zza;
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] doFinal = mac.doFinal(bArr);
        return i == doFinal.length ? doFinal : java.util.Arrays.copyOf(doFinal, i);
    }
}
