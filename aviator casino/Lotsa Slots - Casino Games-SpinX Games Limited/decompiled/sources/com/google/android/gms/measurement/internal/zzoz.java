package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzoz implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.os.Bundle zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpa zzd;

    zzoz(com.google.android.gms.measurement.internal.zzpa zzpaVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        java.util.Objects.requireNonNull(zzpaVar);
        this.zzd = zzpaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzd.zza;
        com.google.android.gms.measurement.internal.zzpo zzt = zzpfVar.zzt();
        long currentTimeMillis = zzpfVar.zzaZ().currentTimeMillis();
        java.lang.String str = this.zza;
        zzpfVar.zzD((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzt.zzac(str, this.zzb, this.zzc, "auto", currentTimeMillis, false, true)), str);
    }
}
