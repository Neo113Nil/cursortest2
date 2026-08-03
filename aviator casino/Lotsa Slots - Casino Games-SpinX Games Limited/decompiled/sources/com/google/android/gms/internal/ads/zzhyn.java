package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyn implements com.google.android.gms.internal.ads.zzhek {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final java.security.interfaces.RSAPublicKey zzc;
    private final java.lang.String zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final java.security.Provider zzg;

    private zzhyn(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.android.gms.internal.ads.zzhwk zzhwkVar, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.android.gms.internal.ads.zziax.zzc(rSAPublicKey.getModulus().bitLength());
        com.google.android.gms.internal.ads.zziax.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhwkVar);
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = provider;
    }

    @javax.annotation.Nullable
    static java.security.Provider zzb() {
        if (com.google.android.gms.internal.ads.zzhnz.zzc()) {
            com.google.android.gms.internal.ads.zzhnz.zzd().intValue();
        }
        return com.google.android.gms.internal.ads.zzhkv.zza();
    }

    public static java.lang.String zzc(com.google.android.gms.internal.ads.zzhwk zzhwkVar) throws java.security.GeneralSecurityException {
        if (zzhwkVar == com.google.android.gms.internal.ads.zzhwk.zza) {
            return com.facebook.internal.security.OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256;
        }
        if (zzhwkVar == com.google.android.gms.internal.ads.zzhwk.zzb) {
            return "SHA384withRSA";
        }
        if (zzhwkVar == com.google.android.gms.internal.ads.zzhwk.zzc) {
            return "SHA512withRSA";
        }
        throw new java.security.GeneralSecurityException("unknown hash type");
    }

    public static com.google.android.gms.internal.ads.zzhek zzd(com.google.android.gms.internal.ads.zzhwq zzhwqVar) throws java.security.GeneralSecurityException {
        java.security.Provider zzb2 = zzb();
        if (zzb2 != null) {
            return zze(zzhwqVar, zzb2);
        }
        throw new java.security.NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static com.google.android.gms.internal.ads.zzhek zze(com.google.android.gms.internal.ads.zzhwq zzhwqVar, java.security.Provider provider) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhyn((java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA", provider).generatePublic(new java.security.spec.RSAPublicKeySpec(zzhwqVar.zzd(), zzhwqVar.zzf().zzd())), zzhwqVar.zzf().zzf(), zzhwqVar.zze().zzc(), zzhwqVar.zzf().zze().equals(com.google.android.gms.internal.ads.zzhwl.zzc) ? zzb : zza, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        java.lang.String str = this.zzd;
        java.security.Provider provider = this.zzg;
        java.security.interfaces.RSAPublicKey rSAPublicKey = this.zzc;
        java.security.Signature signature = java.security.Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.zzf;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(java.util.Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (java.lang.RuntimeException unused) {
        }
        throw new java.security.GeneralSecurityException("Invalid signature");
    }
}
