package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzly implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlt zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzma zzc;

    zzly(com.google.android.gms.measurement.internal.zzma zzmaVar, com.google.android.gms.measurement.internal.zzlt zzltVar, long j) {
        this.zza = zzltVar;
        this.zzb = j;
        java.util.Objects.requireNonNull(zzmaVar);
        this.zzc = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzma zzmaVar = this.zzc;
        zzmaVar.zzv(this.zza, false, this.zzb);
        zzmaVar.zza = null;
        zzmaVar.zzu.zzt().zzG(null);
    }
}
