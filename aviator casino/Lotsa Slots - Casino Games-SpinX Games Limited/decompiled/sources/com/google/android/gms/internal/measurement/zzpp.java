package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzpp implements com.google.android.gms.internal.measurement.zzpo {
    public static final com.google.android.gms.internal.measurement.zzkl zza;
    public static final com.google.android.gms.internal.measurement.zzkl zzb;

    static {
        com.google.android.gms.internal.measurement.zzkf zzb2 = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzb2.zzd("measurement.collection.event_safelist", true);
        zza = zzb2.zzd("measurement.service.store_null_safelist", true);
        zzb = zzb2.zzd("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzb() {
        return ((java.lang.Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzc() {
        return ((java.lang.Boolean) zzb.zzd()).booleanValue();
    }
}
