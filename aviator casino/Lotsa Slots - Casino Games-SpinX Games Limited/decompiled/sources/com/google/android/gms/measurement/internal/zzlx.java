package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlx implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzma zzb;

    zzlx(com.google.android.gms.measurement.internal.zzma zzmaVar, long j) {
        this.zza = j;
        java.util.Objects.requireNonNull(zzmaVar);
        this.zzb = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzma zzmaVar = this.zzb;
        zzmaVar.zzu.zzw().zzc(this.zza);
        zzmaVar.zza = null;
    }
}
