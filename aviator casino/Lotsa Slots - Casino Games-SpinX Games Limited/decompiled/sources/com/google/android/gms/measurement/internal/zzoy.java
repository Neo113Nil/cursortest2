package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzoy implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zzb;

    zzoy(com.google.android.gms.measurement.internal.zzpf zzpfVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        java.util.Objects.requireNonNull(zzpfVar);
        this.zzb = zzpfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
        java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzb;
        com.google.android.gms.measurement.internal.zzjk zzB = zzpfVar.zzB(str);
        com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE;
        if (zzB.zzo(zzjjVar) && com.google.android.gms.measurement.internal.zzjk.zzf(zzrVar.zzs, 100).zzo(zzjjVar)) {
            return zzpfVar.zzan(zzrVar).zzd();
        }
        zzpfVar.zzaV().zzk().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
