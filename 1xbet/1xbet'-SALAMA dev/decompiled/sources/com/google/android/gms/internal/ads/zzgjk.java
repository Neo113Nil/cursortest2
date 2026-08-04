package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public final class zzgjk implements zzgci {
    private final byte[] zza;
    private final int zzb;
    private final zzgpn zzc;

    private zzgjk(byte[] bArr, zzgvd zzgvdVar, int i7) {
        this.zzc = new zzgux(bArr);
        this.zza = zzgvdVar.zzd();
        this.zzb = i7;
    }

    public static zzgci zzb(zzghl zzghlVar) {
        return new zzgjk(zzghlVar.zze().zzd(zzgcr.zza()), zzghlVar.zzb(), zzghlVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i7 = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + i7 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zza;
        int i8 = this.zzb;
        int length2 = bArr4.length;
        int i9 = i8 + length2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i9);
        byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 4, length3);
        byte[] bArr7 = new byte[32];
        System.arraycopy(this.zzc.zza(bArr5, 16), 0, bArr7, 0, 16);
        System.arraycopy(this.zzc.zza(bArr6, 16), 0, bArr7, 16, 16);
        if (!zzgjy.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzc = zzgij.zzc(bArr7);
        int i10 = i9 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i9, i10);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i9 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgij.zza(bArrCopyOfRange2, 0, 12);
        Cipher cipherZzb = zzgij.zzb();
        cipherZzb.init(2, secretKeyZzc, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzb.updateAAD(bArr2);
        }
        return cipherZzb.doFinal(bArr, i10, length - i10);
    }
}
