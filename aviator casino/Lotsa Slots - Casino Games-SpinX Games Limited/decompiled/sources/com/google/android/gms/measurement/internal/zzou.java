package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzou implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpg zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zzb;

    zzou(com.google.android.gms.measurement.internal.zzpf zzpfVar, com.google.android.gms.measurement.internal.zzpg zzpgVar) {
        this.zza = zzpgVar;
        java.util.Objects.requireNonNull(zzpfVar);
        this.zzb = zzpfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzb;
        zzpfVar.zzat(this.zza);
        zzpfVar.zzc();
    }
}
