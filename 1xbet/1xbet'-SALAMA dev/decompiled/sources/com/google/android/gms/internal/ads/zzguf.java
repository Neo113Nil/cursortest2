package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzguf implements zzgci {
    private final zzguv zza;
    private final zzgde zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzguf(zzguv zzguvVar, zzgde zzgdeVar, int i7, byte[] bArr) {
        this.zza = zzguvVar;
        this.zzb = zzgdeVar;
        this.zzc = i7;
        this.zzd = bArr;
    }

    public static zzgci zzb(zzgef zzgefVar) {
        zzgty zzgtyVar = new zzgty(zzgefVar.zze().zzd(zzgcr.zza()), zzgefVar.zzd().zzd());
        String strValueOf = String.valueOf(zzgefVar.zzd().zzg());
        return new zzguf(zzgtyVar, new zzgva(new zzguz("HMAC".concat(strValueOf), new SecretKeySpec(zzgefVar.zzf().zzd(zzgcr.zza()), "HMAC")), zzgefVar.zzd().zze()), zzgefVar.zzd().zze(), zzgefVar.zzb().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i7 = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i7 + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzd;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, length2 - this.zzc);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((zzgva) this.zzb).zzc(zzgud.zzb(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
