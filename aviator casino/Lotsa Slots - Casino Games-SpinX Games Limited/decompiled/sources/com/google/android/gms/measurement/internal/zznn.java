package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zznn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zza;
    final /* synthetic */ java.lang.Runnable zzb;

    zznn(com.google.android.gms.measurement.internal.zzns zznsVar, com.google.android.gms.measurement.internal.zzpf zzpfVar, java.lang.Runnable runnable) {
        this.zza = zzpfVar;
        this.zzb = runnable;
        java.util.Objects.requireNonNull(zznsVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzX(this.zzb);
        zzpfVar.zzM();
    }
}
