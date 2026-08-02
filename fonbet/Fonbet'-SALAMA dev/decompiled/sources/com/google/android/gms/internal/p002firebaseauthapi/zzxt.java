package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxt implements zzbl {
    private static final zzil.zza zza = zzil.zza.zza;
    private static final Collection<Integer> zzb = Arrays.asList(64);
    private static final byte[] zzc = new byte[16];
    private static final ThreadLocal<Cipher> zzd = new zzxs();
    private final zzyv zze;
    private final byte[] zzf;
    private final byte[] zzg;

    private zzxt(byte[] bArr, zzzc zzzcVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!zzb.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(AbstractC0486a1.f(bArr.length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.zze = new zzyv(copyOfRange);
        this.zzg = zzzcVar.zzb();
    }

    public static zzbl zza(zzio zzioVar) {
        return new zzxt(zzioVar.zze().zza(zzbq.zza()), zzioVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] zza2;
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        if (length >= bArr3.length + 16) {
            if (zzpr.zza(bArr3, bArr)) {
                Cipher cipher = zzd.get();
                byte[] bArr4 = this.zzg;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
                byte[] bArr5 = (byte[]) copyOfRange.clone();
                bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
                bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
                cipher.init(2, new SecretKeySpec(this.zzf, "AES"), new IvParameterSpec(bArr5));
                int length2 = this.zzg.length + 16;
                int length3 = bArr.length - length2;
                byte[] doFinal = cipher.doFinal(bArr, length2, length3);
                if (length3 == 0 && doFinal == null && zzyy.zza()) {
                    doFinal = new byte[0];
                }
                byte[][] bArr6 = {bArr2, doFinal};
                byte[] zza3 = this.zze.zza(zzc, 16);
                for (int i7 = 0; i7 <= 0; i7++) {
                    byte[] bArr7 = bArr6[i7];
                    if (bArr7 == null) {
                        bArr7 = new byte[0];
                    }
                    zza3 = zzxv.zza(zzrg.zzb(zza3), this.zze.zza(bArr7, 16));
                }
                byte[] bArr8 = bArr6[1];
                if (bArr8.length >= 16) {
                    if (bArr8.length >= zza3.length) {
                        int length4 = bArr8.length - zza3.length;
                        zza2 = Arrays.copyOf(bArr8, bArr8.length);
                        for (int i8 = 0; i8 < zza3.length; i8++) {
                            int i9 = length4 + i8;
                            zza2[i9] = (byte) (zza2[i9] ^ zza3[i8]);
                        }
                    } else {
                        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                    }
                } else {
                    zza2 = zzxv.zza(zzrg.zza(bArr8), zzrg.zzb(zza3));
                }
                if (MessageDigest.isEqual(copyOfRange, this.zze.zza(zza2, 16))) {
                    return doFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
