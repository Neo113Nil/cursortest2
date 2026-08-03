package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbh extends com.google.android.gms.internal.measurement.zzav {
    protected zzbh() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.ADD);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.DIVIDE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.MODULUS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.MULTIPLY);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.NEGATE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.POST_DECREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.POST_INCREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.PRE_DECREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.PRE_INCREMENT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbk zzbkVar = com.google.android.gms.internal.measurement.zzbk.ADD;
        int ordinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (ordinal == 0) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.ADD.name(), 2, list);
            com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
            com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
            if (!(zza instanceof com.google.android.gms.internal.measurement.zzak) && !(zza instanceof com.google.android.gms.internal.measurement.zzas) && !(zza2 instanceof com.google.android.gms.internal.measurement.zzak) && !(zza2 instanceof com.google.android.gms.internal.measurement.zzas)) {
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zza.zzd().doubleValue() + zza2.zzd().doubleValue()));
            }
            java.lang.String zzc = zza.zzc();
            java.lang.String zzc2 = zza2.zzc();
            java.lang.String.valueOf(zzc);
            java.lang.String.valueOf(zzc2);
            return new com.google.android.gms.internal.measurement.zzas(java.lang.String.valueOf(zzc).concat(java.lang.String.valueOf(zzc2)));
        }
        if (ordinal == 21) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.DIVIDE.name(), 2, list);
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue() / zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()));
        }
        if (ordinal == 59) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.SUBTRACT.name(), 2, list);
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue() + new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            com.google.android.gms.internal.measurement.zzh.zza(str, 2, list);
            com.google.android.gms.internal.measurement.zzao zza3 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
            zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
            return zza3;
        }
        if (ordinal == 55 || ordinal == 56) {
            com.google.android.gms.internal.measurement.zzh.zza(str, 1, list);
            return zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        }
        switch (ordinal) {
            case 44:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.MODULUS.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue() % zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()));
            case 45:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.MULTIPLY.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue() * zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()));
            case 46:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.NEGATE.name(), 1, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()));
            default:
                return super.zzb(str);
        }
    }
}
