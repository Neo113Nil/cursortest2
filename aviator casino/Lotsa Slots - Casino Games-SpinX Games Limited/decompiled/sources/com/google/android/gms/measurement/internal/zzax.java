package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzax implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjf zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzay zzb;

    zzax(com.google.android.gms.measurement.internal.zzay zzayVar, com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        this.zza = zzjfVar;
        java.util.Objects.requireNonNull(zzayVar);
        this.zzb = zzayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjf zzjfVar = this.zza;
        zzjfVar.zzaU();
        if (com.google.android.gms.measurement.internal.zzae.zza()) {
            zzjfVar.zzaW().zzj(this);
            return;
        }
        com.google.android.gms.measurement.internal.zzay zzayVar = this.zzb;
        boolean zzc = zzayVar.zzc();
        zzayVar.zze(0L);
        if (zzc) {
            zzayVar.zza();
        }
    }
}
