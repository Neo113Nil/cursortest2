package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyw implements com.google.android.gms.internal.ads.zzhek {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final java.security.interfaces.RSAPublicKey zzc;
    private final java.lang.String zzd;
    private final java.security.spec.PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final java.security.Provider zzh;

    private zzhyw(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.android.gms.internal.ads.zzhww zzhwwVar, com.google.android.gms.internal.ads.zzhww zzhwwVar2, int i, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!zzhwwVar.equals(zzhwwVar2)) {
            throw new java.security.GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        com.google.android.gms.internal.ads.zziax.zzc(rSAPublicKey.getModulus().bitLength());
        com.google.android.gms.internal.ads.zziax.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhwwVar);
        this.zze = zzd(zzhwwVar, zzhwwVar2, i);
        this.zzf = bArr;
        this.zzg = bArr2;
        this.zzh = provider;
    }

    @javax.annotation.Nullable
    static java.security.Provider zzb() {
        if (!com.google.android.gms.internal.ads.zzhnz.zzc() || com.google.android.gms.internal.ads.zzhnz.zzd().intValue() > 23) {
            return com.google.android.gms.internal.ads.zzhkv.zza();
        }
        return null;
    }

    static java.lang.String zzc(com.google.android.gms.internal.ads.zzhww zzhwwVar) {
        if (zzhwwVar == com.google.android.gms.internal.ads.zzhww.zza) {
            return "SHA256withRSA/PSS";
        }
        if (zzhwwVar == com.google.android.gms.internal.ads.zzhww.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzhwwVar == com.google.android.gms.internal.ads.zzhww.zzc) {
            return "SHA512withRSA/PSS";
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzhwwVar);
        java.lang.String.valueOf(valueOf);
        throw new java.lang.IllegalArgumentException("Unsupported hash: ".concat(java.lang.String.valueOf(valueOf)));
    }

    static java.security.spec.PSSParameterSpec zzd(com.google.android.gms.internal.ads.zzhww zzhwwVar, com.google.android.gms.internal.ads.zzhww zzhwwVar2, int i) {
        java.lang.String str;
        java.security.spec.MGF1ParameterSpec mGF1ParameterSpec;
        com.google.android.gms.internal.ads.zzhww zzhwwVar3 = com.google.android.gms.internal.ads.zzhww.zza;
        if (zzhwwVar == zzhwwVar3) {
            str = "SHA-256";
        } else if (zzhwwVar == com.google.android.gms.internal.ads.zzhww.zzb) {
            str = "SHA-384";
        } else {
            if (zzhwwVar != com.google.android.gms.internal.ads.zzhww.zzc) {
                java.lang.String valueOf = java.lang.String.valueOf(zzhwwVar);
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalArgumentException("Unsupported MD hash: ".concat(java.lang.String.valueOf(valueOf)));
            }
            str = "SHA-512";
        }
        java.lang.String str2 = str;
        if (zzhwwVar2 == zzhwwVar3) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA256;
        } else if (zzhwwVar2 == com.google.android.gms.internal.ads.zzhww.zzb) {
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA384;
        } else {
            if (zzhwwVar2 != com.google.android.gms.internal.ads.zzhww.zzc) {
                java.lang.String valueOf2 = java.lang.String.valueOf(zzhwwVar2);
                java.lang.String.valueOf(valueOf2);
                throw new java.lang.IllegalArgumentException("Unsupported MGF1 hash: ".concat(java.lang.String.valueOf(valueOf2)));
            }
            mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA512;
        }
        return new java.security.spec.PSSParameterSpec(str2, "MGF1", mGF1ParameterSpec, i, 1);
    }

    public static com.google.android.gms.internal.ads.zzhek zze(com.google.android.gms.internal.ads.zzhxc zzhxcVar) throws java.security.GeneralSecurityException {
        java.security.Provider zzb2 = zzb();
        if (zzb2 == null) {
            throw new java.security.NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA", zzb2).generatePublic(new java.security.spec.RSAPublicKeySpec(zzhxcVar.zzd(), zzhxcVar.zzf().zzd()));
        com.google.android.gms.internal.ads.zzhwy zzf = zzhxcVar.zzf();
        return new com.google.android.gms.internal.ads.zzhyw(rSAPublicKey, zzf.zzf(), zzf.zzg(), zzf.zzh(), zzhxcVar.zze().zzc(), zzhxcVar.zzf().zze().equals(com.google.android.gms.internal.ads.zzhwx.zzc) ? zzb : zza, zzb2);
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        java.lang.String str = this.zzd;
        java.security.Provider provider = this.zzh;
        java.security.interfaces.RSAPublicKey rSAPublicKey = this.zzc;
        java.security.Signature signature = java.security.Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new java.security.GeneralSecurityException("signature verification failed");
        }
    }
}
