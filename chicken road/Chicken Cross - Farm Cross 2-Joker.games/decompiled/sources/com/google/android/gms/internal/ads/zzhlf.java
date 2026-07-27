package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhlf implements zzhek {
    private final byte[] zza;
    private final int zzb;
    private final zzhrh zzc;

    private zzhlf(byte[] bArr, zzich zzichVar, int i) throws GeneralSecurityException {
        this.zzc = zzibu.zzb(zzhrf.zzc(zzhrg.zzb(bArr.length), zzicj.zza(bArr, zzheq.zza())));
        this.zza = zzichVar.zzc();
        this.zzb = i;
    }

    public static zzhek zzb(zzhjc zzhjcVar) throws GeneralSecurityException {
        zzhjcVar.zzf();
        zzhjcVar.zzf();
        return new zzhlf(zzhjcVar.zze().zzc(zzheq.zza()), zzhjcVar.zzc(), zzhjcVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i2 = i + length2;
        if (length < i2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhpd.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = copyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
        zzhrh zzhrhVar = this.zzc;
        byte[] bArr6 = new byte[32];
        System.arraycopy(zzhrhVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzhrhVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey zzb = zzhka.zzb(bArr6);
        int i3 = i2 + 12;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, i3);
        if (copyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec zzc = zzhka.zzc(copyOfRange2, 0, 12);
        Cipher zza = zzhka.zza();
        zza.init(2, zzb, zzc);
        if (bArr2 != null && bArr2.length != 0) {
            zza.updateAAD(bArr2);
        }
        return zza.doFinal(bArr, i3, length - i3);
    }
}
