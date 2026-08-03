package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zziq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbg zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzc;

    zziq(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzbgVar;
        this.zzb = zzrVar;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzbg zzbgVar = this.zza;
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zzb;
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzc;
        zzjcVar.zzb(zzjcVar.zzc(zzbgVar, zzrVar), zzrVar);
    }
}
