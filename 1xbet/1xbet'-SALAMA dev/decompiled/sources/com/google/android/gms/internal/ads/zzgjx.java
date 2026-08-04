package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzgjx implements zzgci {
    private static final byte[] zza = zzguu.zza("7a806c");
    private static final byte[] zzb = zzguu.zza("46bb91c3c5");
    private static final byte[] zzc = zzguu.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzguu.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzguu.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final ThreadLocal zzf = new zzgjw();
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzgjx(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.zzh = bArr2;
        zzgvb.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
    }

    public static zzgci zzb(zzgfm zzgfmVar) {
        return new zzgjx(zzgfmVar.zze().zzd(zzgcr.zza()), zzgfmVar.zzb().zzd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] zze(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) zzf.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.zzg, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzh;
        if (bArr3.length == 0) {
            return zze(bArr, bArr2);
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzh;
        return zze(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
