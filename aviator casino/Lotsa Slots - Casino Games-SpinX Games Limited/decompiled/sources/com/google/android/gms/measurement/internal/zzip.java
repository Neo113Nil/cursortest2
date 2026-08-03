package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzip implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzb;

    zzip(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        return new com.google.android.gms.measurement.internal.zzao(zzjcVar.zzL().zzy(this.zza.zza));
    }
}
