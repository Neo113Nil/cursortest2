package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzna implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzne zza;

    zzna(com.google.android.gms.measurement.internal.zzne zzneVar) {
        java.util.Objects.requireNonNull(zzneVar);
        this.zza = zzneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zza.zza;
        com.google.android.gms.measurement.internal.zzib zzibVar = zznkVar.zzu;
        android.content.Context zzaY = zzibVar.zzaY();
        zzibVar.zzaU();
        zznkVar.zzW(new android.content.ComponentName(zzaY, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
