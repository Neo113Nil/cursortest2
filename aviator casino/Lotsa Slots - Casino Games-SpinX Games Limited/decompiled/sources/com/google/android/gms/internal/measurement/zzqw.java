package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzqw implements com.google.android.gms.internal.measurement.zzqv {
    public static final com.google.android.gms.internal.measurement.zzkl zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzb.zzd("measurement.session_stitching_token_enabled", false);
        zzb.zzd("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqv
    public final boolean zzb() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }
}
