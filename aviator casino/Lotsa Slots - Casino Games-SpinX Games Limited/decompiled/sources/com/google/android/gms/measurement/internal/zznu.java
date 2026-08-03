package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zznu implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzob zzb;

    zznu(com.google.android.gms.measurement.internal.zzob zzobVar, long j) {
        this.zza = j;
        java.util.Objects.requireNonNull(zzobVar);
        this.zzb = zzobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzl(this.zza);
    }
}
