package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzgty implements zzguv {
    private static final ThreadLocal zza = new zzgtx();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzgty(byte[] bArr, int i7) throws GeneralSecurityException {
        if (!zzgjy.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgvb.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) zza.get()).getBlockSize();
        this.zzd = blockSize;
        if (i7 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzguv
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i7 = this.zzc;
        if (length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        int i8 = this.zzc;
        int i9 = length - i8;
        byte[] bArr3 = new byte[i9];
        Cipher cipher = (Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        System.arraycopy(bArr2, 0, bArr4, 0, this.zzc);
        cipher.init(2, this.zzb, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i8, i9, bArr3, 0) == i9) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
