package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
public final class zzg implements com.google.firebase.analytics.connector.internal.zza {
    private final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zzb;
    private final com.google.firebase.analytics.connector.internal.zzf zzc;

    public zzg(com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = appMeasurementSdk;
        com.google.firebase.analytics.connector.internal.zzf zzfVar = new com.google.firebase.analytics.connector.internal.zzf(this);
        this.zzc = zzfVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzfVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(java.util.Set set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }

    final /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzd() {
        return this.zza;
    }
}
