package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzbdi {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbdi(String str, Object obj, int i7) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i7;
    }

    public static zzbdi zza(String str, double d7) {
        return new zzbdi(str, Double.valueOf(d7), 3);
    }

    public static zzbdi zzb(String str, long j) {
        return new zzbdi(str, Long.valueOf(j), 2);
    }

    public static zzbdi zzc(String str, String str2) {
        return new zzbdi("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbdi zzd(String str, boolean z4) {
        return new zzbdi(str, Boolean.valueOf(z4), 1);
    }

    public final Object zze() {
        zzben zzbenVarZza = zzbep.zza();
        if (zzbenVarZza == null) {
            if (zzbep.zzb() != null) {
                zzbep.zzb().zza();
            }
            return this.zzb;
        }
        int i7 = this.zzc - 1;
        if (i7 == 0) {
            return zzbenVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i7 != 1) {
            return i7 != 2 ? zzbenVarZza.zzd(this.zza, (String) this.zzb) : zzbenVarZza.zzb(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbenVarZza.zzc(this.zza, ((Long) this.zzb).longValue());
    }
}
