package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzim implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzb;

    zzim(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        com.google.android.gms.measurement.internal.zzpf zzL = zzjcVar.zzL();
        zzL.zzaW().zzg();
        zzL.zzu();
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        zzL.zzan(zzrVar);
    }
}
