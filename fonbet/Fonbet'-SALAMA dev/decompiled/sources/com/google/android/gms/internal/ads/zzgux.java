package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgux implements zzgpn {
    private static final ThreadLocal zza = new zzguw();
    private final SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public zzgux(byte[] bArr) {
        zzgvb.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza2 = zzgpe.zza(zzb.doFinal(new byte[16]));
        this.zzc = zza2;
        this.zzd = zzgpe.zza(zza2);
    }

    private static Cipher zzb() {
        if (zzgjy.zza(1)) {
            return (Cipher) zza.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3) {
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[i8] = (byte) (bArr[i8] ^ bArr2[i8 + i7]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpn
    public final byte[] zza(byte[] bArr, int i7) {
        byte[] zzc;
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zzb;
        Cipher zzb = zzb();
        zzb.init(1, secretKey);
        int length = bArr.length;
        int i8 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i9 = i8 - 1;
        int i10 = i9 * 16;
        if (i8 * 16 == length) {
            zzc = zzgud.zzc(bArr, i10, this.zzc, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = this.zzd;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            zzc = zzgud.zzc(copyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i11 = 0; i11 < i9; i11++) {
            zzc(bArr3, bArr, i11 * 16, bArr4);
            if (zzb.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zzc(bArr3, zzc, 0, bArr4);
        if (zzb.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i7 == 16 ? bArr3 : Arrays.copyOf(bArr3, i7);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
