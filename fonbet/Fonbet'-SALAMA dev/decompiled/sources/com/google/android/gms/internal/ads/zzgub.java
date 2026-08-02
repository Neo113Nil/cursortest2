package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgub implements zzgci {
    private static final ThreadLocal zza = new zzgtz();
    private static final ThreadLocal zzb = new zzgua();
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final SecretKeySpec zzf;
    private final int zzg;

    private zzgub(byte[] bArr, int i7, byte[] bArr2) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzg = i7;
        zzgvb.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzf = secretKeySpec;
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, secretKeySpec);
        byte[] zzd = zzd(cipher.doFinal(new byte[16]));
        this.zzc = zzd;
        this.zzd = zzd(zzd);
        this.zze = bArr2;
    }

    public static zzgci zzb(zzger zzgerVar) {
        if (zzgjy.zza(1)) {
            return new zzgub(zzgerVar.zze().zzd(zzgcr.zza()), zzgerVar.zzd().zzb(), zzgerVar.zzb().zzd());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
    }

    private static byte[] zzd(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            byte b7 = bArr[i7];
            int i8 = i7 + 1;
            bArr2[i7] = (byte) (((b7 + b7) ^ ((bArr[i8] & 255) >>> 7)) & 255);
            i7 = i8;
        }
        byte b8 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b8 + b8));
        return bArr2;
    }

    private final byte[] zze(Cipher cipher, int i7, byte[] bArr, int i8, int i9) {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i7;
        if (i9 == 0) {
            zzc(bArr2, this.zzc);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i10 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i9 - i10 <= 16) {
                break;
            }
            for (int i11 = 0; i11 < 16; i11++) {
                bArr2[i11] = (byte) (bArr[(i8 + i10) + i11] ^ bArr2[i11]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i10 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10 + i8, i8 + i9);
        if (copyOfRange.length == 16) {
            zzc(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            int i12 = 0;
            while (true) {
                length = copyOfRange.length;
                if (i12 >= length) {
                    break;
                }
                copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
                i12++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            copyOfRange = copyOf;
        }
        zzc(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zze;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.zzg) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzf);
        byte[] zze = zze(cipher, 0, bArr, this.zze.length, this.zzg);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] zze2 = zze(cipher, 1, bArr4, 0, bArr4.length);
        byte[] zze3 = zze(cipher, 2, bArr, this.zze.length + this.zzg, length2);
        int i7 = length - 16;
        byte b7 = 0;
        for (int i8 = 0; i8 < 16; i8++) {
            b7 = (byte) (b7 | (((bArr[i7 + i8] ^ zze2[i8]) ^ zze[i8]) ^ zze3[i8]));
        }
        if (b7 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) zzb.get();
        cipher2.init(1, this.zzf, new IvParameterSpec(zze));
        return cipher2.doFinal(bArr, this.zze.length + this.zzg, length2);
    }
}
