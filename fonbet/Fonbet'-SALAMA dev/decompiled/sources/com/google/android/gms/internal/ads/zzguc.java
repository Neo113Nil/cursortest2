package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public final class zzguc implements zzgci {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzguc(byte[] bArr, zzgvd zzgvdVar) {
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
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec zza = zzgij.zza(bArr, this.zzb.length, 12);
        SecretKey secretKey = this.zza;
        Cipher zzb = zzgij.zzb();
        zzb.init(2, secretKey, zza);
        if (bArr2 != null && bArr2.length != 0) {
            zzb.updateAAD(bArr2);
        }
        return zzb.doFinal(bArr, this.zzb.length + 12, (r1 - r7) - 12);
    }
}
