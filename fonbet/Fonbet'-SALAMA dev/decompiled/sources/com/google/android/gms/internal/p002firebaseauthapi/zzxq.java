package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import e1.k;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public final class zzxq implements zzbg {
    private static final zzil.zza zza = zzil.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    private zzxq(byte[] bArr, zzzc zzzcVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgo.zzb(bArr);
        this.zzc = zzzcVar.zzb();
    }

    public static zzbg zza(zzdo zzdoVar) {
        if (zzdoVar.zzc().zzb() != 12) {
            throw new GeneralSecurityException(k.d(zzdoVar.zzc().zzb(), "Expected IV Size 12, got "));
        }
        if (zzdoVar.zzc().zzd() == 16) {
            return new zzxq(zzdoVar.zze().zza(zzbq.zza()), zzdoVar.zzd());
        }
        throw new GeneralSecurityException(k.d(zzdoVar.zzc().zzd(), "Expected tag Size 16, got "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza2 = zzpe.zza(12);
        AlgorithmParameterSpec zza3 = zzgo.zza(zza2);
        Cipher zza4 = zzgo.zza();
        zza4.init(1, this.zzb, zza3);
        if (bArr2 != null && bArr2.length != 0) {
            zza4.updateAAD(bArr2);
        }
        int outputSize = zza4.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(zza2, 0, copyOf, this.zzc.length, 12);
        if (zza4.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zzc;
            if (length >= bArr3.length + 28) {
                if (zzpr.zza(bArr3, bArr)) {
                    AlgorithmParameterSpec zza2 = zzgo.zza(bArr, this.zzc.length, 12);
                    Cipher zza3 = zzgo.zza();
                    zza3.init(2, this.zzb, zza2);
                    if (bArr2 != null && bArr2.length != 0) {
                        zza3.updateAAD(bArr2);
                    }
                    byte[] bArr4 = this.zzc;
                    return zza3.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
