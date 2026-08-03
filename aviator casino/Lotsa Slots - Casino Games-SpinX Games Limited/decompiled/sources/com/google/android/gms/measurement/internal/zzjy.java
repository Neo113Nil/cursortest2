package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zza;

    zzjy(com.google.android.gms.measurement.internal.zzli zzliVar) {
        java.util.Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }
}
