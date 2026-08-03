package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzox implements com.google.android.gms.internal.measurement.zzow {
    public static final com.google.android.gms.internal.measurement.zzkl zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzb.zzd("measurement.service.ad_impression.convert_value_to_double", true);
        zzb.zzd("measurement.service.separate_public_internal_event_blacklisting", true);
        zzb.zzd("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzow
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }
}
