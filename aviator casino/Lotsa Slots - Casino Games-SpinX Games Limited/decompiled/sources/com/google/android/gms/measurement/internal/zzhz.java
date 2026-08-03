package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzib zzb;

    zzhz(com.google.android.gms.measurement.internal.zzib zzibVar, com.google.android.gms.measurement.internal.zzjr zzjrVar) {
        this.zza = zzjrVar;
        java.util.Objects.requireNonNull(zzibVar);
        this.zzb = zzibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzb;
        com.google.android.gms.measurement.internal.zzjr zzjrVar = this.zza;
        zzibVar.zzK(zzjrVar);
        zzibVar.zza(zzjrVar.zzd);
    }
}
