package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzqe implements com.google.android.gms.internal.measurement.zzqd {
    public static final com.google.android.gms.internal.measurement.zzkl zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzb.zzd("measurement.gmscore_feature_tracking", true);
        zza = zzb.zzd("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqd
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }
}
