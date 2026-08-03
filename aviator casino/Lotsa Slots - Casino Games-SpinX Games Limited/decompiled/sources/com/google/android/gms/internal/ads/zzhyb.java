package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyb implements com.google.android.gms.internal.ads.zzhej {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    private zzhyb(byte[] bArr, byte[] bArr2, byte[] bArr3, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Given private key's length is not %s", 32));
        }
        java.security.KeyFactory.getInstance("Ed25519", provider).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(com.google.android.gms.internal.ads.zzhzl.zza(zza, bArr)));
    }

    public static com.google.android.gms.internal.ads.zzhej zzb(com.google.android.gms.internal.ads.zzhvf zzhvfVar) throws java.security.GeneralSecurityException {
        java.security.Provider zza2 = com.google.android.gms.internal.ads.zzhkv.zza();
        if (zza2 != null) {
            return new com.google.android.gms.internal.ads.zzhyb(zzhvfVar.zzf().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhvfVar.zze().zze().zzc(), zzhvfVar.zzd().zzc().equals(com.google.android.gms.internal.ads.zzhvd.zzc) ? new byte[]{0} : new byte[0], zza2);
        }
        throw new java.security.NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        throw null;
    }
}
