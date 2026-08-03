package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzqh implements com.google.android.gms.internal.measurement.zzqg {
    public static final com.google.android.gms.internal.measurement.zzkl zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzb.zzd("measurement.sdk.collection.enable_extend_user_property_size", true);
        zza = zzb.zzd("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzb.zzc("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqg
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }
}
