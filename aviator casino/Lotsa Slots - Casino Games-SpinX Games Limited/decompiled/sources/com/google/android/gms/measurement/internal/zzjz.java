package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjz implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzjz(com.google.android.gms.measurement.internal.zzli zzliVar, long j) {
        this.zza = j;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzb.zzu;
        com.google.android.gms.measurement.internal.zzhd zzhdVar = zzibVar.zzd().zzf;
        long j = this.zza;
        zzhdVar.zzb(j);
        zzibVar.zzaV().zzj().zzb("Session timeout duration set", java.lang.Long.valueOf(j));
    }
}
