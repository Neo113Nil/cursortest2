package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzl extends com.google.android.gms.internal.measurement.zzal {
    private final com.google.android.gms.internal.measurement.zzab zzb;

    public zzl(com.google.android.gms.internal.measurement.zzab zzabVar) {
        this.zzb = zzabVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            com.google.android.gms.internal.measurement.zzh.zza("getEventName", 0, list);
            return new com.google.android.gms.internal.measurement.zzas(this.zzb.zzc().zzb());
        }
        if (c == 1) {
            com.google.android.gms.internal.measurement.zzh.zza("getParamValue", 1, list);
            return com.google.android.gms.internal.measurement.zzi.zza(this.zzb.zzc().zze(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc()));
        }
        if (c == 2) {
            com.google.android.gms.internal.measurement.zzh.zza("getParams", 0, list);
            java.util.Map zzf = this.zzb.zzc().zzf();
            com.google.android.gms.internal.measurement.zzal zzalVar = new com.google.android.gms.internal.measurement.zzal();
            for (java.lang.String str2 : zzf.keySet()) {
                zzalVar.zzm(str2, com.google.android.gms.internal.measurement.zzi.zza(zzf.get(str2)));
            }
            return zzalVar;
        }
        if (c == 3) {
            com.google.android.gms.internal.measurement.zzh.zza("getTimestamp", 0, list);
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(this.zzb.zzc().zza()));
        }
        if (c != 4) {
            if (c != 5) {
                return super.zzcA(str, zzgVar, list);
            }
            com.google.android.gms.internal.measurement.zzh.zza("setParamValue", 2, list);
            java.lang.String zzc = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
            com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
            this.zzb.zzc().zzd(zzc, com.google.android.gms.internal.measurement.zzh.zzj(zza));
            return zza;
        }
        com.google.android.gms.internal.measurement.zzh.zza("setEventName", 1, list);
        com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        if (zzf.equals(zza2) || zzg.equals(zza2)) {
            throw new java.lang.IllegalArgumentException("Illegal event name");
        }
        this.zzb.zzc().zzc(zza2.zzc());
        return new com.google.android.gms.internal.measurement.zzas(zza2.zzc());
    }
}
