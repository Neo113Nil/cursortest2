package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhkf implements com.google.android.gms.internal.ads.zzhdi {
    private final byte[] zza;
    private final byte[] zzb;
    private final java.security.Provider zzc;

    private zzhkf(byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = provider;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhic zzhicVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhkf(zzhicVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzhicVar.zzc().zzc(), com.google.android.gms.internal.ads.zzhjh.zzc().getProvider());
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        java.lang.System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] zze = com.google.android.gms.internal.ads.zzhjn.zze(com.google.android.gms.internal.ads.zzhjn.zzd(this.zza), com.google.android.gms.internal.ads.zzhjn.zzd(bArr4));
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(zze.length * 4).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zze);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        java.lang.System.arraycopy(bArr4, 16, bArr5, 4, 8);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr5);
        java.security.Provider provider = this.zzc;
        int i = com.google.android.gms.internal.ads.zzhjh.zza;
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
