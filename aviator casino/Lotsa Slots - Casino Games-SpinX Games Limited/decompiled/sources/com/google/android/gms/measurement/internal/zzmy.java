package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmy implements java.lang.Runnable {
    final /* synthetic */ android.content.ComponentName zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzne zzb;

    zzmy(com.google.android.gms.measurement.internal.zzne zzneVar, android.content.ComponentName componentName) {
        this.zza = componentName;
        java.util.Objects.requireNonNull(zzneVar);
        this.zzb = zzneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzW(this.zza);
    }
}
