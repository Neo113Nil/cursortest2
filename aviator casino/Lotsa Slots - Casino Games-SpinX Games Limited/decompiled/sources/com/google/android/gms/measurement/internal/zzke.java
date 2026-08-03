package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzke implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzc;

    zzke(com.google.android.gms.measurement.internal.zzli zzliVar, java.util.concurrent.atomic.AtomicReference atomicReference, boolean z) {
        this.zza = atomicReference;
        this.zzb = z;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzc = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzu.zzt().zzv(this.zza, this.zzb);
    }
}
