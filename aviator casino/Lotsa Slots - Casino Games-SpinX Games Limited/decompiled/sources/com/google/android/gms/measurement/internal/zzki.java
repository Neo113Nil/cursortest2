package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzki implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzki(com.google.android.gms.measurement.internal.zzli zzliVar, android.os.Bundle bundle) {
        this.zza = bundle;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
        zzliVar.zzg();
        zzliVar.zzb();
        android.os.Bundle bundle = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        java.lang.String checkNotEmpty = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzliVar.zzu.zzB()) {
            zzliVar.zzu.zzaV().zzk().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzliVar.zzu.zzt().zzp(new com.google.android.gms.measurement.internal.zzah(bundle.getString("app_id"), "", new com.google.android.gms.measurement.internal.zzpk(checkNotEmpty, 0L, null, ""), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzliVar.zzu.zzk().zzac(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }
}
