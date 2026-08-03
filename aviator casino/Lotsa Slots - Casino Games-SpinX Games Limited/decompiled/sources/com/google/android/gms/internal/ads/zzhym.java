package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhym implements com.google.android.gms.internal.ads.zzhej {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};

    @javax.annotation.Nullable
    java.security.Provider zza;
    private final java.security.interfaces.RSAPrivateCrtKey zze;
    private final java.lang.String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final com.google.android.gms.internal.ads.zzhek zzi;

    private zzhym(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.android.gms.internal.ads.zzhwk zzhwkVar, byte[] bArr, byte[] bArr2, com.google.android.gms.internal.ads.zzhek zzhekVar, @javax.annotation.Nullable java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhwkVar != com.google.android.gms.internal.ads.zzhwk.zza && zzhwkVar != com.google.android.gms.internal.ads.zzhwk.zzb && zzhwkVar != com.google.android.gms.internal.ads.zzhwk.zzc) {
            java.lang.String valueOf = java.lang.String.valueOf(zzhwkVar);
            java.lang.String.valueOf(valueOf);
            throw new java.security.GeneralSecurityException("Unsupported hash: ".concat(java.lang.String.valueOf(valueOf)));
        }
        com.google.android.gms.internal.ads.zziax.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        com.google.android.gms.internal.ads.zziax.zzd(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = com.google.android.gms.internal.ads.zzhyn.zzc(zzhwkVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzhekVar;
        this.zza = provider;
    }

    public static com.google.android.gms.internal.ads.zzhej zzb(com.google.android.gms.internal.ads.zzhwo zzhwoVar) throws java.security.GeneralSecurityException {
        java.security.Provider zzb2 = com.google.android.gms.internal.ads.zzhyn.zzb();
        com.google.android.gms.internal.ads.zzhym zzhymVar = new com.google.android.gms.internal.ads.zzhym((java.security.interfaces.RSAPrivateCrtKey) (zzb2 != null ? java.security.KeyFactory.getInstance("RSA", zzb2) : (java.security.KeyFactory) com.google.android.gms.internal.ads.zzhzz.zzf.zzb("RSA")).generatePrivate(new java.security.spec.RSAPrivateCrtKeySpec(zzhwoVar.zze().zzd(), zzhwoVar.zzd().zzd(), zzhwoVar.zzi().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhwoVar.zzf().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhwoVar.zzh().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhwoVar.zzj().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhwoVar.zzk().zzb(com.google.android.gms.internal.ads.zzhdo.zza()), zzhwoVar.zzl().zzb(com.google.android.gms.internal.ads.zzhdo.zza()))), zzhwoVar.zzd().zzf(), zzhwoVar.zze().zze().zzc(), zzhwoVar.zzd().zze().equals(com.google.android.gms.internal.ads.zzhwl.zzc) ? zzc : zzb, zzb2 != null ? com.google.android.gms.internal.ads.zzhyn.zze(zzhwoVar.zze(), zzb2) : com.google.android.gms.internal.ads.zziar.zzb(zzhwoVar.zze()), zzb2);
        zzhymVar.zza(zzd);
        return zzhymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        java.security.Provider provider = this.zza;
        java.security.Signature signature = provider != null ? java.security.Signature.getInstance(this.zzf, provider) : (java.security.Signature) com.google.android.gms.internal.ads.zzhzz.zzc.zzb(this.zzf);
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            sign = com.google.android.gms.internal.ads.zzhzl.zza(bArr3, sign);
        }
        try {
            this.zzi.zza(sign, bArr);
            return sign;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException("RSA signature computation error", e);
        }
    }
}
