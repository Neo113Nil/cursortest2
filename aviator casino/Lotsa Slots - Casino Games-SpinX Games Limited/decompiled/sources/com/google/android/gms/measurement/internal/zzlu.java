package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlu implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlt zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlt zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzma zze;

    zzlu(com.google.android.gms.measurement.internal.zzma zzmaVar, android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzlt zzltVar, com.google.android.gms.measurement.internal.zzlt zzltVar2, long j) {
        this.zza = bundle;
        this.zzb = zzltVar;
        this.zzc = zzltVar2;
        this.zzd = j;
        java.util.Objects.requireNonNull(zzmaVar);
        this.zze = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzt(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
