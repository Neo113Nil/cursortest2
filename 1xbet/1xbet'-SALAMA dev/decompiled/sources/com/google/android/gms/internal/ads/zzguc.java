package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public final class zzguc implements zzgci {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzguc(byte[] bArr, zzgvd zzgvdVar) throws GeneralSecurityException {
        if (!zzgjy.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgij.zzc(bArr);
        this.zzb = zzgvdVar.zzd();
    }

    public static zzgci zzb(zzgfb zzgfbVar) {
        return new zzguc(zzgfbVar.zze().zzd(zzgcr.zza()), zzgfbVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgij.zza(bArr, this.zzb.length, 12);
        SecretKey secretKey = this.zza;
        Cipher cipherZzb = zzgij.zzb();
        cipherZzb.init(2, secretKey, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzb.updateAAD(bArr2);
        }
        int length2 = this.zzb.length;
        return cipherZzb.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
