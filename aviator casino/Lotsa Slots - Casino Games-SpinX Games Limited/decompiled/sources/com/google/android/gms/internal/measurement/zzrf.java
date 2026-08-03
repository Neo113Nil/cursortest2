package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzrf implements com.google.android.gms.internal.measurement.zzre {
    public static final com.google.android.gms.internal.measurement.zzkl zza;
    public static final com.google.android.gms.internal.measurement.zzkl zzb;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb2 = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzb2.zzd("measurement.tcf.consent_fix", false);
        zzb2.zzd("measurement.tcf.client", true);
        zzb = zzb2.zzd("measurement.tcf.empty_pref_fix", true);
        zzb2.zzc("measurement.id.tcf", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zzb() {
        return ((java.lang.Boolean) zzb.zzd()).booleanValue();
    }
}
