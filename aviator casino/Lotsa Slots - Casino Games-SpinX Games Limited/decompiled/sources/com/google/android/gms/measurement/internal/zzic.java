package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzic implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzb;

    zzic(com.google.android.gms.measurement.internal.zzjc zzjcVar, java.lang.String str) {
        this.zza = str;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        return zzjcVar.zzL().zzj().zzn(this.zza);
    }
}
