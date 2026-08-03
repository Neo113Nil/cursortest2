package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhjh implements com.google.android.gms.internal.ads.zzhdi {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = com.google.android.gms.internal.ads.zziaj.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] zzc = com.google.android.gms.internal.ads.zziaj.zza("070000004041424344454647");
    private static final byte[] zzd = com.google.android.gms.internal.ads.zziaj.zza("a0784d7a4716f3feb4f64e7f4b39bf04");
    private final javax.crypto.SecretKey zze;
    private final byte[] zzf;
    private final java.security.Provider zzg;

    private zzhjh(byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zze = new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20");
        this.zzf = bArr2;
        this.zzg = provider;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhgh zzhghVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhjh(zzhghVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhghVar.zzc().zzc(), zzc().getProvider());
    }

    static javax.crypto.Cipher zzc() throws java.security.GeneralSecurityException {
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) com.google.android.gms.internal.ads.zzhzz.zza.zzb("ChaCha20-Poly1305");
        if (zze(cipher)) {
            return cipher;
        }
        throw new java.security.GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    public static boolean zzd() {
        try {
            zzc();
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    private static boolean zze(javax.crypto.Cipher cipher) {
        try {
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(zzc);
            byte[] bArr = zzb;
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = zzd;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzf;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        java.lang.System.arraycopy(bArr, length2, bArr4, 0, 12);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr4);
        java.security.Provider provider = this.zzg;
        javax.crypto.SecretKey secretKey = this.zze;
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKey, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
