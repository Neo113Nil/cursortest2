package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzax extends com.google.android.gms.internal.measurement.zzav {
    public zzax() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.GREATER_THAN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.GREATER_THAN_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.IDENTITY_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.IDENTITY_NOT_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.LESS_THAN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.LESS_THAN_EQUALS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.NOT_EQUALS);
    }

    private static boolean zzc(com.google.android.gms.internal.measurement.zzao zzaoVar, com.google.android.gms.internal.measurement.zzao zzaoVar2) {
        if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzak) {
            zzaoVar = new com.google.android.gms.internal.measurement.zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzak) {
            zzaoVar2 = new com.google.android.gms.internal.measurement.zzas(zzaoVar2.zzc());
        }
        if ((zzaoVar instanceof com.google.android.gms.internal.measurement.zzas) && (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzas)) {
            return zzaoVar.zzc().compareTo(zzaoVar2.zzc()) < 0;
        }
        double doubleValue = zzaoVar.zzd().doubleValue();
        double doubleValue2 = zzaoVar2.zzd().doubleValue();
        return (java.lang.Double.isNaN(doubleValue) || java.lang.Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || java.lang.Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean zzd(com.google.android.gms.internal.measurement.zzao zzaoVar, com.google.android.gms.internal.measurement.zzao zzaoVar2) {
        if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            if ((zzaoVar instanceof com.google.android.gms.internal.measurement.zzat) || (zzaoVar instanceof com.google.android.gms.internal.measurement.zzam)) {
                return true;
            }
            return zzaoVar instanceof com.google.android.gms.internal.measurement.zzah ? (java.lang.Double.isNaN(zzaoVar.zzd().doubleValue()) || java.lang.Double.isNaN(zzaoVar2.zzd().doubleValue()) || zzaoVar.zzd().doubleValue() != zzaoVar2.zzd().doubleValue()) ? false : true : zzaoVar instanceof com.google.android.gms.internal.measurement.zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof com.google.android.gms.internal.measurement.zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (((zzaoVar instanceof com.google.android.gms.internal.measurement.zzat) || (zzaoVar instanceof com.google.android.gms.internal.measurement.zzam)) && ((zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzat) || (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzam))) {
            return true;
        }
        boolean z = zzaoVar instanceof com.google.android.gms.internal.measurement.zzah;
        if (z && (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzas)) {
            return zzd(zzaoVar, new com.google.android.gms.internal.measurement.zzah(zzaoVar2.zzd()));
        }
        boolean z2 = zzaoVar instanceof com.google.android.gms.internal.measurement.zzas;
        if (z2 && (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzah)) {
            return zzd(new com.google.android.gms.internal.measurement.zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzaf) {
            return zzd(new com.google.android.gms.internal.measurement.zzah(zzaoVar.zzd()), zzaoVar2);
        }
        if (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzaf) {
            return zzd(zzaoVar, new com.google.android.gms.internal.measurement.zzah(zzaoVar2.zzd()));
        }
        if ((z2 || z) && (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzak)) {
            return zzd(zzaoVar, new com.google.android.gms.internal.measurement.zzas(zzaoVar2.zzc()));
        }
        if ((zzaoVar instanceof com.google.android.gms.internal.measurement.zzak) && ((zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzas) || (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzah))) {
            return zzd(new com.google.android.gms.internal.measurement.zzas(zzaoVar.zzc()), zzaoVar2);
        }
        return false;
    }

    private static boolean zze(com.google.android.gms.internal.measurement.zzao zzaoVar, com.google.android.gms.internal.measurement.zzao zzaoVar2) {
        if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzak) {
            zzaoVar = new com.google.android.gms.internal.measurement.zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzak) {
            zzaoVar2 = new com.google.android.gms.internal.measurement.zzas(zzaoVar2.zzc());
        }
        return (((zzaoVar instanceof com.google.android.gms.internal.measurement.zzas) && (zzaoVar2 instanceof com.google.android.gms.internal.measurement.zzas)) || !(java.lang.Double.isNaN(zzaoVar.zzd().doubleValue()) || java.lang.Double.isNaN(zzaoVar2.zzd().doubleValue()))) && !zzc(zzaoVar2, zzaoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        boolean zzd;
        boolean zzd2;
        com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzh.zze(str).name(), 2, list);
        com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
        int ordinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                zzd2 = zzd(zza, zza2);
            } else if (ordinal == 42) {
                zzd = zzc(zza, zza2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        zzd = zzc(zza2, zza);
                        break;
                    case 38:
                        zzd = zze(zza2, zza);
                        break;
                    case 39:
                        zzd = com.google.android.gms.internal.measurement.zzh.zzf(zza, zza2);
                        break;
                    case 40:
                        zzd2 = com.google.android.gms.internal.measurement.zzh.zzf(zza, zza2);
                        break;
                    default:
                        return super.zzb(str);
                }
            } else {
                zzd = zze(zza, zza2);
            }
            zzd = !zzd2;
        } else {
            zzd = zzd(zza, zza2);
        }
        return zzd ? com.google.android.gms.internal.measurement.zzao.zzk : com.google.android.gms.internal.measurement.zzao.zzl;
    }
}
