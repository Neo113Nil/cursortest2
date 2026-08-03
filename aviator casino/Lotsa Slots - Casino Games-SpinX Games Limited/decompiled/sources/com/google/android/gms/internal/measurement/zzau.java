package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzau extends com.google.android.gms.internal.measurement.zzav {
    public zzau() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BITWISE_AND);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BITWISE_LEFT_SHIFT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BITWISE_NOT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BITWISE_OR);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BITWISE_RIGHT_SHIFT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbk zzbkVar = com.google.android.gms.internal.measurement.zzbk.ADD;
        switch (com.google.android.gms.internal.measurement.zzh.zze(str).ordinal()) {
            case 4:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BITWISE_AND.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()) & com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue())));
            case 5:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()) << ((int) (com.google.android.gms.internal.measurement.zzh.zzh(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BITWISE_NOT.name(), 1, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(~com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue())));
            case 7:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BITWISE_OR.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()) | com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue())));
            case 8:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()) >> ((int) (com.google.android.gms.internal.measurement.zzh.zzh(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzh(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()) >>> ((int) (com.google.android.gms.internal.measurement.zzh.zzh(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.BITWISE_XOR.name(), 2, list);
                return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()) ^ com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue())));
            default:
                return super.zzb(str);
        }
    }
}
