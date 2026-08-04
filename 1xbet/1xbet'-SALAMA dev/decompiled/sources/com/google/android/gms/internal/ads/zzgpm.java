package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgpm implements zzgde {
    private zzgpm(zzgde zzgdeVar, zzgte zzgteVar, byte[] bArr) {
    }

    public static zzgde zza(zzgku zzgkuVar) throws GeneralSecurityException {
        byte[] bArrZzd;
        zzgmw zzgmwVarZzb = zzgkuVar.zzb(zzgcr.zza());
        zzgrx zzgrxVarZza = zzgsa.zza();
        zzgrxVarZza.zzb(zzgmwVarZzb.zzg());
        zzgrxVarZza.zzc(zzgmwVarZzb.zze());
        zzgrxVarZza.zza(zzgmwVarZzb.zzb());
        zzgde zzgdeVar = (zzgde) zzgdi.zza((zzgsa) zzgrxVarZza.zzbr(), zzgde.class);
        zzgte zzgteVarZzc = zzgmwVarZzb.zzc();
        int iOrdinal = zzgteVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzd = zzglv.zzb(zzgkuVar.zzd().intValue()).zzd();
        } else if (iOrdinal == 2) {
            bArrZzd = zzglv.zza(zzgkuVar.zzd().intValue()).zzd();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzd = zzglv.zza(zzgkuVar.zzd().intValue()).zzd();
        } else {
            bArrZzd = zzglv.zza.zzd();
        }
        return new zzgpm(zzgdeVar, zzgteVarZzc, bArrZzd);
    }
}
