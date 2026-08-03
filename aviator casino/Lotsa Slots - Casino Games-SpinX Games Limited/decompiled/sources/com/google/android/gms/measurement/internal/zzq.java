package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.5.0 */
/* loaded from: classes4.dex */
final class zzq implements com.google.android.gms.measurement.internal.zzjp {
    public final com.google.android.gms.internal.measurement.zzda zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzq(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzda zzdaVar) {
        java.util.Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzdaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjp
    public final void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        try {
            this.zza.zze(str, str2, bundle, j);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzb.zza;
            if (zzibVar != null) {
                zzibVar.zzaV().zze().zzb("Event listener threw exception", e);
            }
        }
    }
}
