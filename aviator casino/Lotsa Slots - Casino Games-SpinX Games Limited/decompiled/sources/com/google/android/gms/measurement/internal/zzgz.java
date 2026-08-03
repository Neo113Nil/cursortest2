package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzgz implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzha zzb;

    zzgz(com.google.android.gms.measurement.internal.zzha zzhaVar, boolean z) {
        this.zza = z;
        java.util.Objects.requireNonNull(zzhaVar);
        this.zzb = zzhaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zzar(this.zza);
    }
}
