package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlv implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlt zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlt zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzma zze;

    zzlv(com.google.android.gms.measurement.internal.zzma zzmaVar, com.google.android.gms.measurement.internal.zzlt zzltVar, com.google.android.gms.measurement.internal.zzlt zzltVar2, long j, boolean z) {
        this.zza = zzltVar;
        this.zzb = zzltVar2;
        this.zzc = j;
        this.zzd = z;
        java.util.Objects.requireNonNull(zzmaVar);
        this.zze = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
