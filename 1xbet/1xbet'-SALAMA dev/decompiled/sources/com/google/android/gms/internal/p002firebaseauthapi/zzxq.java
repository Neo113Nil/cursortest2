package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzxq implements zzbg {
    private static final zzil.zza zza = zzil.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    private zzxq(byte[] bArr, zzzc zzzcVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgo.zzb(bArr);
        this.zzc = zzzcVar.zzb();
    }

    public static zzbg zza(zzdo zzdoVar) throws GeneralSecurityException {
        if (zzdoVar.zzc().zzb() != 12) {
            throw new GeneralSecurityException(k.d(zzdoVar.zzc().zzb(), "Expected IV Size 12, got "));
        }
        if (zzdoVar.zzc().zzd() == 16) {
            return new zzxq(zzdoVar.zze().zza(zzbq.zza()), zzdoVar.zzd());
        }
        throw new GeneralSecurityException(k.d(zzdoVar.zzc().zzd(), "Expected tag Size 16, got "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrZza = zzpe.zza(12);
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgo.zza(bArrZza);
        Cipher cipherZza = zzgo.zza();
        cipherZza.init(1, this.zzb, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int outputSize = cipherZza.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzc.length, 12);
        if (cipherZza.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzc.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zzc;
            if (length >= bArr3.length + 28) {
                if (zzpr.zza(bArr3, bArr)) {
                    AlgorithmParameterSpec algorithmParameterSpecZza = zzgo.zza(bArr, this.zzc.length, 12);
                    Cipher cipherZza = zzgo.zza();
                    cipherZza.init(2, this.zzb, algorithmParameterSpecZza);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipherZza.updateAAD(bArr2);
                    }
                    byte[] bArr4 = this.zzc;
                    return cipherZza.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
