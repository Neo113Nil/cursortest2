package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhyc implements com.google.android.gms.internal.ads.zzhek {
    private static final byte[] zza = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private final java.security.PublicKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final java.security.Provider zze;

    private zzhyc(byte[] bArr, byte[] bArr2, byte[] bArr3, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Given public key's length is not %s.", 32));
        }
        this.zzb = java.security.KeyFactory.getInstance("Ed25519", provider).generatePublic(new java.security.spec.X509EncodedKeySpec(com.google.android.gms.internal.ads.zzhzl.zza(zza, bArr)));
        this.zzc = bArr2;
        this.zzd = bArr3;
        this.zze = provider;
    }

    public static com.google.android.gms.internal.ads.zzhek zzb(com.google.android.gms.internal.ads.zzhvl zzhvlVar) throws java.security.GeneralSecurityException {
        java.security.Provider zza2 = com.google.android.gms.internal.ads.zzhkv.zza();
        if (zza2 == null) {
            throw new java.security.NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            return new com.google.android.gms.internal.ads.zzhyc(zzhvlVar.zzd().zzc(), zzhvlVar.zze().zzc(), zzhvlVar.zzf().zzc().equals(com.google.android.gms.internal.ads.zzhvd.zzc) ? new byte[]{0} : new byte[0], zza2);
        }
        throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid signature length: %s", 64));
        }
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        java.security.Provider provider = this.zze;
        java.security.PublicKey publicKey = this.zzb;
        java.security.Signature signature = java.security.Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.zzd);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (java.lang.RuntimeException unused) {
        }
        throw new java.security.GeneralSecurityException("Signature check failed.");
    }
}
