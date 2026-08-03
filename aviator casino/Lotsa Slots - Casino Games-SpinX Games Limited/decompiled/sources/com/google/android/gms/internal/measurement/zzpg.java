package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpg implements com.google.android.gms.internal.measurement.zzpf {
    public static final com.google.android.gms.internal.measurement.zzkl zza;
    public static final com.google.android.gms.internal.measurement.zzkl zzb;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb2 = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzb2.zzd("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zzb2.zzd("measurement.set_default_event_parameters_with_backfill.service", true);
        zzb2.zzc("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        zza = zzb2.zzd("measurement.set_default_event_parameters.fix_app_update_logging", true);
        zzb = zzb2.zzd("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        zzb2.zzd("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean zzb() {
        return ((java.lang.Boolean) zzb.zzd()).booleanValue();
    }
}
