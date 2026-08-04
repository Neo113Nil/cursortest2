package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgec implements zzgmv {
    private static final zzgec zza = new zzgec();
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgdy
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgji.zzb((zzgku) zzgcsVar);
        }
    }, zzgku.class, zzgci.class);

    public static void zzd() {
        zzglr.zza().zzd(zza);
        zzglr.zza().zzc(zzb);
    }

    public static void zze(zzgmn zzgmnVar) {
        zzgmnVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Class zza() {
        return zzgci.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Class zzb() {
        return zzgci.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final /* bridge */ /* synthetic */ Object zzc(zzgmu zzgmuVar) throws GeneralSecurityException {
        zzgkz zzgkzVar;
        zzgkz zzgkzVarZza;
        zzgvd zzgvdVarZzc;
        zzgmf zzgmfVar = new zzgmf();
        for (zzgms zzgmsVar : zzgmuVar.zzf()) {
            zzgcs zzgcsVarZzb = zzgmsVar.zzb();
            if (zzgcsVarZzb instanceof zzgdw) {
                zzgvdVarZzc = ((zzgdw) zzgcsVarZzb).zzb();
            } else {
                if (!(zzgcsVarZzb instanceof zzgku)) {
                    throw new GeneralSecurityException(p150v0.a.f("Cannot get output prefix for key of class ", zzgcsVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzgcsVarZzb.zza())));
                }
                zzgvdVarZzc = ((zzgku) zzgcsVarZzb).zzc();
            }
            zzgmfVar.zza(zzgvdVarZzc, new zzgdz((zzgci) zzgmsVar.zze(), zzgmsVar.zza()));
        }
        if (zzgmuVar.zza().zza()) {
            zzgkzVar = zzglh.zza;
            zzgkzVarZza = zzgkzVar;
        } else {
            zzgla zzglaVarZza = zzglp.zzb().zza();
            zzgle zzgleVarZza = zzglh.zza(zzgmuVar);
            zzgkz zzgkzVarZza2 = zzglaVarZza.zza(zzgleVarZza, "aead", "encrypt");
            zzgkzVarZza = zzglaVarZza.zza(zzgleVarZza, "aead", "decrypt");
            zzgkzVar = zzgkzVarZza2;
        }
        return new zzgea(new zzgdz((zzgci) zzgmuVar.zzc().zze(), zzgmuVar.zzc().zza()), zzgmfVar.zzb(), zzgkzVar, zzgkzVarZza, null);
    }
}
