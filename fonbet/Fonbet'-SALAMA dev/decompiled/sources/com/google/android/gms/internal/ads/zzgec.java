package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
    public final /* bridge */ /* synthetic */ Object zzc(zzgmu zzgmuVar) {
        zzgkz zzgkzVar;
        zzgkz zzgkzVar2;
        zzgvd zzc;
        zzgmf zzgmfVar = new zzgmf();
        for (zzgms zzgmsVar : zzgmuVar.zzf()) {
            zzgcs zzb2 = zzgmsVar.zzb();
            if (zzb2 instanceof zzgdw) {
                zzc = ((zzgdw) zzb2).zzb();
            } else {
                if (!(zzb2 instanceof zzgku)) {
                    throw new GeneralSecurityException(AbstractC1663a.f("Cannot get output prefix for key of class ", zzb2.getClass().getName(), " with parameters ", String.valueOf(zzb2.zza())));
                }
                zzc = ((zzgku) zzb2).zzc();
            }
            zzgmfVar.zza(zzc, new zzgdz((zzgci) zzgmsVar.zze(), zzgmsVar.zza()));
        }
        if (zzgmuVar.zza().zza()) {
            zzgkzVar = zzglh.zza;
            zzgkzVar2 = zzgkzVar;
        } else {
            zzgla zza2 = zzglp.zzb().zza();
            zzgle zza3 = zzglh.zza(zzgmuVar);
            zzgkz zza4 = zza2.zza(zza3, "aead", "encrypt");
            zzgkzVar2 = zza2.zza(zza3, "aead", "decrypt");
            zzgkzVar = zza4;
        }
        return new zzgea(new zzgdz((zzgci) zzgmuVar.zzc().zze(), zzgmuVar.zzc().zza()), zzgmfVar.zzb(), zzgkzVar, zzgkzVar2, null);
    }
}
