package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgji implements zzgci {
    private final zzgci zza;
    private final byte[] zzb;

    private zzgji(zzgci zzgciVar, byte[] bArr) {
        this.zza = zzgciVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgci zzb(zzgku zzgkuVar) throws GeneralSecurityException {
        byte[] bArrZzd;
        zzgmw zzgmwVarZzb = zzgkuVar.zzb(zzgcr.zza());
        zzgrx zzgrxVarZza = zzgsa.zza();
        zzgrxVarZza.zzb(zzgmwVarZzb.zzg());
        zzgrxVarZza.zzc(zzgmwVarZzb.zze());
        zzgrxVarZza.zza(zzgmwVarZzb.zzb());
        zzgci zzgciVar = (zzgci) zzgdi.zza((zzgsa) zzgrxVarZza.zzbr(), zzgci.class);
        zzgte zzgteVarZzc = zzgmwVarZzb.zzc();
        int iOrdinal = zzgteVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzd = zzglv.zzb(zzgkuVar.zzd().intValue()).zzd();
        } else if (iOrdinal == 2) {
            bArrZzd = zzglv.zza(zzgkuVar.zzd().intValue()).zzd();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzgteVarZzc)));
            }
            bArrZzd = zzglv.zza(zzgkuVar.zzd().intValue()).zzd();
        } else {
            bArrZzd = zzglv.zza.zzd();
        }
        return new zzgji(zzgciVar, bArrZzd);
    }

    public static zzgci zzc(zzgci zzgciVar, zzgvd zzgvdVar) {
        return new zzgji(zzgciVar, zzgvdVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgni.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
