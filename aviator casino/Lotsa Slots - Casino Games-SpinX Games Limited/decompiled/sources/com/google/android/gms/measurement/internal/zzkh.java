package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkh implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzkh(com.google.android.gms.measurement.internal.zzli zzliVar, android.os.Bundle bundle) {
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
        java.lang.String string = bundle.getString("name");
        java.lang.String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(string);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(string2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle.get("value"));
        if (!zzliVar.zzu.zzB()) {
            zzliVar.zzu.zzaV().zzk().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        com.google.android.gms.measurement.internal.zzpk zzpkVar = new com.google.android.gms.measurement.internal.zzpk(string, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), string2);
        try {
            com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu;
            com.google.android.gms.measurement.internal.zzbg zzac = zzibVar.zzk().zzac(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true, true);
            zzliVar.zzu.zzt().zzp(new com.google.android.gms.measurement.internal.zzah(bundle.getString("app_id"), string2, zzpkVar, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzibVar.zzk().zzac(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true, true), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzac, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzibVar.zzk().zzac(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true, true)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }
}
