package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzxn implements zzys {
    private static final zzil.zza zza = zzil.zza.zzb;
    private static final ThreadLocal<Cipher> zzb = new zzxm();
    private final SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    public zzxn(byte[] bArr, int i7) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzzb.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
        int blockSize = zzb.get().getBlockSize();
        this.zze = blockSize;
        if (i7 < 12 || i7 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzd = i7;
    }

    private final void zza(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, byte[] bArr3, boolean z4) throws GeneralSecurityException {
        Cipher cipher = zzb.get();
        byte[] bArr4 = new byte[this.zze];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzd);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z4) {
            cipher.init(1, this.zzc, ivParameterSpec);
        } else {
            cipher.init(2, this.zzc, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i7, i8, bArr2, i9) != i8) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i7 = this.zzd;
        if (length > f.API_PRIORITY_OTHER - i7) {
            throw new GeneralSecurityException(k.d(f.API_PRIORITY_OTHER - this.zzd, "plaintext length can not exceed "));
        }
        byte[] bArr2 = new byte[bArr.length + i7];
        byte[] bArrZza = zzpe.zza(i7);
        System.arraycopy(bArrZza, 0, bArr2, 0, this.zzd);
        zza(bArr, 0, bArr.length, bArr2, this.zzd, bArrZza, true);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i7 = this.zzd;
        if (length >= i7) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, i7);
            int length2 = bArr.length;
            int i8 = this.zzd;
            byte[] bArr3 = new byte[length2 - i8];
            zza(bArr, i8, bArr.length - i8, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
