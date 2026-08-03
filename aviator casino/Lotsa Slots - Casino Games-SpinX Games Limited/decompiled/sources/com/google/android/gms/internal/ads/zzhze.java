package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhze implements com.google.android.gms.internal.ads.zziak {
    private static final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzhzd();
    private final javax.crypto.spec.SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzhze(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(2)) {
            throw new java.security.GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.android.gms.internal.ads.zziax.zza(bArr.length);
        this.zzb = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        int blockSize = ((javax.crypto.Cipher) zza.get()).getBlockSize();
        this.zzd = blockSize;
        if (i > blockSize) {
            throw new java.security.GeneralSecurityException("invalid IV size");
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zziak
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length < i) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        int i2 = length - i;
        byte[] bArr3 = new byte[i2];
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        java.lang.System.arraycopy(bArr2, 0, bArr4, 0, i);
        cipher.init(2, this.zzb, new javax.crypto.spec.IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i, i2, bArr3, 0) == i2) {
            return bArr3;
        }
        throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
    }
}
