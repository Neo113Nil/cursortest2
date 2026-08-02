package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpv implements com.google.android.libraries.places.internal.zzpu {
    private final com.google.android.libraries.places.internal.zznf zza;
    private final com.google.android.libraries.places.internal.zzmz zzb;

    @Override // com.google.android.libraries.places.internal.zzpu
    public final void zza(com.google.android.libraries.places.internal.zzom zzomVar) {
        int i;
        com.google.android.libraries.places.internal.zzans zza = com.google.android.libraries.places.internal.zzanw.zza();
        zza.zza(zzomVar.zzh());
        zza.zzb(zzomVar.zzi());
        zza.zzc(zzomVar.zzj());
        zza.zzd(zzomVar.zzk());
        zza.zze(zzomVar.zzl());
        zza.zzf(zzomVar.zzm());
        zza.zzn(zzomVar.zzn());
        zza.zzg(zzomVar.zzo());
        zza.zzh(zzomVar.zzp().length());
        zza.zzi(zzomVar.zzq());
        zza.zzj(zzomVar.zzr());
        zza.zzk(zzomVar.zzs());
        zza.zzl(zzomVar.zzt());
        int ordinal = zzomVar.zza().ordinal();
        if (ordinal == 0) {
            i = 2;
        } else if (ordinal == 1) {
            i = 3;
        } else {
            if (ordinal != 2) {
                throw new java.lang.RuntimeException(null, null);
            }
            i = 4;
        }
        zza.zzq(i);
        com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzb = zzomVar.zzb();
        if (zzb != null) {
            com.google.android.libraries.places.internal.zzok zzc = zzomVar.zzc();
            com.google.android.libraries.places.internal.zzaoz zzg = com.google.android.libraries.places.internal.zzapa.zzg();
            if (zzc != null) {
                zzg.zza(zzc.zza());
                zzg.zzb(zzc.zzb());
                zzg.zzc(zzc.zzc());
                zzg.zzd(zzc.zzd());
                zzg.zze(zzc.zze());
            }
            com.google.android.libraries.places.internal.zzanq zza2 = com.google.android.libraries.places.internal.zzanr.zza();
            zza2.zzb(zzb.getZza() == com.google.android.libraries.places.widget.model.AutocompleteListDensity.MULTI_LINE ? 3 : 2);
            zza2.zza((com.google.android.libraries.places.internal.zzapa) zzg.zzG());
            zza.zzm((com.google.android.libraries.places.internal.zzanr) zza2.zzG());
        }
        if (zzomVar.zze() == com.google.android.libraries.places.internal.zzor.FRAGMENT) {
            zza.zzo(2);
        } else if (zzomVar.zze() == com.google.android.libraries.places.internal.zzor.INTENT) {
            zza.zzo(3);
        } else {
            zza.zzo(1);
        }
        if (zzomVar.zzf() == com.google.android.libraries.places.widget.model.AutocompleteActivityMode.FULLSCREEN) {
            zza.zzp(2);
        } else if (zzomVar.zzf() == com.google.android.libraries.places.widget.model.AutocompleteActivityMode.OVERLAY) {
            zza.zzp(1);
        }
        com.google.android.libraries.places.internal.zzanw zzanwVar = (com.google.android.libraries.places.internal.zzanw) zza.zzG();
        com.google.android.libraries.places.internal.zzmz zzmzVar = this.zzb;
        com.google.android.libraries.places.internal.zzaoc zza3 = com.google.android.libraries.places.internal.zzng.zza(zzmzVar, zzmzVar.zzc());
        zza3.zzp(10);
        zza3.zze(zzanwVar);
        this.zza.zzb(zza3);
    }

    @Override // com.google.android.libraries.places.internal.zzpu
    public final void zzb(com.google.android.libraries.places.internal.zzamm zzammVar) {
        com.google.android.libraries.places.internal.zzmz zzmzVar = this.zzb;
        com.google.android.libraries.places.internal.zzaoc zza = com.google.android.libraries.places.internal.zzng.zza(zzmzVar, zzmzVar.zzc());
        zza.zzp(19);
        zza.zzn(zzammVar);
        this.zza.zzb(zza);
    }

    @Override // com.google.android.libraries.places.internal.zzpu
    public final void zzc(com.google.android.libraries.places.internal.zzanh zzanhVar) {
        com.google.android.libraries.places.internal.zzmz zzmzVar = this.zzb;
        com.google.android.libraries.places.internal.zzaoc zza = com.google.android.libraries.places.internal.zzng.zza(zzmzVar, zzmzVar.zzc());
        zza.zzp(20);
        zza.zzo(zzanhVar);
        this.zza.zzb(zza);
    }

    public zzpv(com.google.android.libraries.places.internal.zznf zznfVar, com.google.android.libraries.places.internal.zzmz zzmzVar) {
        this.zza = zznfVar;
        this.zzb = zzmzVar;
    }
}
