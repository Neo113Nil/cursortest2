package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgos implements zzgmv {
    private static final zzgos zza = new zzgos();
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgoo
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgpm.zza((zzgku) zzgcsVar);
        }
    }, zzgku.class, zzgde.class);

    public static void zzd() {
        zzglr.zza().zzd(zza);
        zzglr.zza().zzc(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Class zza() {
        return zzgde.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final Class zzb() {
        return zzgde.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final /* bridge */ /* synthetic */ Object zzc(zzgmu zzgmuVar) {
        zzgkz zzgkzVar;
        zzgkz zzgkzVar2;
        zzgmf zzgmfVar = new zzgmf();
        for (zzgms zzgmsVar : zzgmuVar.zzf()) {
            zzgmfVar.zza(zzgmsVar.zzd(), new zzgop((zzgde) zzgmsVar.zze(), zzgmsVar.zza()));
        }
        if (zzgmuVar.zza().zza()) {
            zzgkzVar = zzglh.zza;
            zzgkzVar2 = zzgkzVar;
        } else {
            zzgla zza2 = zzglp.zzb().zza();
            zzgle zza3 = zzglh.zza(zzgmuVar);
            zzgkz zza4 = zza2.zza(zza3, "mac", "compute");
            zzgkzVar2 = zza2.zza(zza3, "mac", "verify");
            zzgkzVar = zza4;
        }
        return new zzgoq(new zzgop((zzgde) zzgmuVar.zzc().zze(), zzgmuVar.zzc().zza()), zzgmfVar.zzb(), zzgkzVar, zzgkzVar2, null);
    }
}
