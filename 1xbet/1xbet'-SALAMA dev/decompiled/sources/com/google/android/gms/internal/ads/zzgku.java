package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgku extends zzgcs {
    private final zzgmw zza;
    private final zzgvd zzb;

    public zzgku(zzgmw zzgmwVar, zzgdj zzgdjVar) throws GeneralSecurityException {
        zzgvd zzgvdVarZza;
        zze(zzgmwVar, zzgdjVar);
        this.zza = zzgmwVar;
        if (zzgmwVar.zzc().equals(zzgte.RAW)) {
            zzgvdVarZza = zzgvd.zzb(new byte[0]);
        } else if (zzgmwVar.zzc().equals(zzgte.TINK)) {
            zzgvdVarZza = zzglv.zzb(zzgmwVar.zzf().intValue());
        } else {
            if (!zzgmwVar.zzc().equals(zzgte.LEGACY) && !zzgmwVar.zzc().equals(zzgte.CRUNCHY)) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            zzgvdVarZza = zzglv.zza(zzgmwVar.zzf().intValue());
        }
        this.zzb = zzgvdVarZza;
    }

    private static void zze(zzgmw zzgmwVar, zzgdj zzgdjVar) {
        int i7 = zzgkr.zzb[zzgmwVar.zzb().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final zzgdf zza() {
        zzgmw zzgmwVar = this.zza;
        return new zzgks(zzgmwVar.zzg(), zzgmwVar.zzc(), null);
    }

    public final zzgmw zzb(zzgdj zzgdjVar) {
        zze(this.zza, zzgdjVar);
        return this.zza;
    }

    public final zzgvd zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zza.zzf();
    }
}
