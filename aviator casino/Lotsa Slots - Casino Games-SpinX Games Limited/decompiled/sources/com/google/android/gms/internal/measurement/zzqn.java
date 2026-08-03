package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzqn implements com.google.android.gms.internal.measurement.zzqm {
    public static final com.google.android.gms.internal.measurement.zzkl zza;
    public static final com.google.android.gms.internal.measurement.zzkl zzb;
    public static final com.google.android.gms.internal.measurement.zzkl zzc;
    public static final com.google.android.gms.internal.measurement.zzkl zzd;
    public static final com.google.android.gms.internal.measurement.zzkl zze;
    public static final com.google.android.gms.internal.measurement.zzkl zzf;
    public static final com.google.android.gms.internal.measurement.zzkl zzg;
    public static final com.google.android.gms.internal.measurement.zzkl zzh;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb2 = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzb2.zzd("measurement.rb.attribution.ad_campaign_info", true);
        zzb2.zzd("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        zza = zzb2.zzd("measurement.rb.attribution.client2", true);
        zzb = zzb2.zzd("measurement.rb.attribution.followup1.service", false);
        zzb2.zzd("measurement.rb.attribution.client.get_trigger_uris_async", true);
        zzc = zzb2.zzd("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        zzb2.zzd("measurement.rb.attribution.index_out_of_bounds_fix", true);
        zzd = zzb2.zzd("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        zze = zzb2.zzd("measurement.rb.attribution.retry_disposition", false);
        zzf = zzb2.zzd("measurement.rb.attribution.service", true);
        zzg = zzb2.zzd("measurement.rb.attribution.enable_trigger_redaction", true);
        zzh = zzb2.zzd("measurement.rb.attribution.uuid_generation", true);
        zzb2.zzc("measurement.id.rb.attribution.retry_disposition", 0L);
        zzb2.zzd("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zzb() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zzc() {
        return ((java.lang.Boolean) zzb.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zzd() {
        return ((java.lang.Boolean) zzc.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zze() {
        return ((java.lang.Boolean) zzd.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zzf() {
        return ((java.lang.Boolean) zze.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zzg() {
        return ((java.lang.Boolean) zzf.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zzh() {
        return ((java.lang.Boolean) zzg.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final boolean zzi() {
        return ((java.lang.Boolean) zzh.zzd()).booleanValue();
    }
}
