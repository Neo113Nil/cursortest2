package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgpm implements zzgde {
    private zzgpm(zzgde zzgdeVar, zzgte zzgteVar, byte[] bArr) {
    }

    public static zzgde zza(zzgku zzgkuVar) {
        byte[] zzd;
        zzgmw zzb = zzgkuVar.zzb(zzgcr.zza());
        zzgrx zza = zzgsa.zza();
        zza.zzb(zzb.zzg());
        zza.zzc(zzb.zze());
        zza.zza(zzb.zzb());
        zzgde zzgdeVar = (zzgde) zzgdi.zza((zzgsa) zza.zzbr(), zzgde.class);
        zzgte zzc = zzb.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzd = zzglv.zza.zzd();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            zzd = zzglv.zza(zzgkuVar.zzd().intValue()).zzd();
        } else {
            zzd = zzglv.zzb(zzgkuVar.zzd().intValue()).zzd();
        }
        return new zzgpm(zzgdeVar, zzc, zzd);
    }
}
