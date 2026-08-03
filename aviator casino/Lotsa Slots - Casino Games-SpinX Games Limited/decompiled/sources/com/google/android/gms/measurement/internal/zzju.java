package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzju implements java.util.concurrent.Executor {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zza;

    zzju(com.google.android.gms.measurement.internal.zzli zzliVar) {
        java.util.Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.zzu.zzaW().zzj(runnable);
    }
}
