package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzik implements zzbg {
    private static final byte[] zza = zzyt.zza("7a806c");
    private static final byte[] zzb = zzyt.zza("46bb91c3c5");
    private static final byte[] zzc = zzyt.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzyt.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzyt.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final ThreadLocal<Cipher> zzf = new zzij();
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzik(byte[] bArr, byte[] bArr2) {
        this.zzh = bArr2;
        zzzb.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), zza(bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) {
        Cipher zza2 = zza();
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        zza2.init(2, this.zzg, zza(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            zza2.updateAAD(bArr2);
        }
        return zza2.doFinal(bArr, 12, bArr.length - 12);
    }

    public static zzbg zza(zzdx zzdxVar) {
        return new zzik(zzdxVar.zze().zza(zzbq.zza()), zzdxVar.zzd().zzb());
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i7, int i8) {
        return new GCMParameterSpec(128, bArr, 0, i8);
    }

    private static Cipher zza() {
        Cipher cipher = zzf.get();
        if (cipher != null) {
            return cipher;
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzh;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzpr.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzh.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        Cipher zza2 = zza();
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            byte[] zza3 = zzpe.zza(12);
            System.arraycopy(zza3, 0, bArr3, 0, 12);
            zza2.init(1, this.zzg, zza(zza3, 0, zza3.length));
            if (bArr2 != null && bArr2.length != 0) {
                zza2.updateAAD(bArr2);
            }
            int doFinal = zza2.doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                byte[] bArr4 = this.zzh;
                return bArr4.length == 0 ? bArr3 : zzxv.zza(bArr4, bArr3);
            }
            throw new GeneralSecurityException(AbstractC0486a1.f(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
