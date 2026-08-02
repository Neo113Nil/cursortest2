package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
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
        String valueOf = String.valueOf(zzgefVar.zzd().zzg());
        return new zzguf(zzgtyVar, new zzgva(new zzguz("HMAC".concat(valueOf), new SecretKeySpec(zzgefVar.zzf().zzd(zzgcr.zza()), "HMAC")), zzgefVar.zzd().zze()), zzgefVar.zzd().zze(), zzgefVar.zzb().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
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
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzgva) this.zzb).zzc(zzgud.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
