package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzqk implements com.google.android.gms.internal.measurement.zzqj {
    public static final com.google.android.gms.internal.measurement.zzkl zza;
    public static final com.google.android.gms.internal.measurement.zzkl zzb;
    public static final com.google.android.gms.internal.measurement.zzkl zzc;
    public static final com.google.android.gms.internal.measurement.zzkl zzd;
    public static final com.google.android.gms.internal.measurement.zzkl zze;
    public static final com.google.android.gms.internal.measurement.zzkl zzf;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb2 = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzb2.zzd("measurement.test.boolean_flag", false);
        zzb = zzb2.zzc("measurement.test.cached_long_flag", -1L);
        zzc = zzb2.zze("measurement.test.double_flag", -3.0d);
        zzd = zzb2.zzc("measurement.test.int_flag", -2L);
        zze = zzb2.zzc("measurement.test.long_flag", -1L);
        zzf = zzb2.zzf("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final long zzb() {
        return ((java.lang.Long) zzb.zzd()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final double zzc() {
        return ((java.lang.Double) zzc.zzd()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final long zzd() {
        return ((java.lang.Long) zzd.zzd()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final long zze() {
        return ((java.lang.Long) zze.zzd()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final java.lang.String zzf() {
        return (java.lang.String) zzf.zzd();
    }
}
