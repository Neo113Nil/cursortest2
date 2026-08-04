package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzhw implements zzbg {
    private final byte[] zza;
    private final int zzb;
    private final zzrq zzc;

    private zzhw(byte[] bArr, zzzc zzzcVar, int i7) {
        this.zzc = new zzyv(bArr);
        this.zza = zzzcVar.zzb();
        this.zzb = i7;
    }

    public static zzbg zza(zzfp zzfpVar) throws GeneralSecurityException {
        if (zzfpVar.zzb().zzb() < 8 || zzfpVar.zzb().zzb() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new zzhw(zzfpVar.zzd().zza(zzbq.zza()), zzfpVar.zzc(), zzfpVar.zzb().zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrZza = zzpe.zza(this.zzb + 12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrZza, this.zzb);
        int i7 = this.zzb;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrZza, i7, i7 + 12);
        byte[] bArrZzb = new zzhj(zza(bArrCopyOf)).zzb(bArrCopyOfRange, bArr, this.zza.length + this.zzb + bArrCopyOfRange.length, bArr2);
        byte[] bArr3 = this.zza;
        System.arraycopy(bArr3, 0, bArrZzb, 0, bArr3.length);
        System.arraycopy(bArrZza, 0, bArrZzb, this.zza.length, bArrZza.length);
        return bArrZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zza;
            if (length >= bArr3.length + this.zzb + 28) {
                if (zzpr.zza(bArr3, bArr)) {
                    int length2 = this.zza.length + this.zzb;
                    int i7 = length2 + 12;
                    return new zzhj(zza(Arrays.copyOfRange(bArr, this.zza.length, length2))).zza(Arrays.copyOfRange(bArr, length2, i7), bArr, i7, bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }

    private final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length <= 12 && bArr.length >= 8) {
            System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
            System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
            byte[] bArr4 = new byte[32];
            System.arraycopy(this.zzc.zza(bArr2, 16), 0, bArr4, 0, 16);
            System.arraycopy(this.zzc.zza(bArr3, 16), 0, bArr4, 16, 16);
            return bArr4;
        }
        throw new GeneralSecurityException("invalid salt size");
    }
}
