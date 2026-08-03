package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zziu implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzc;

    zziu(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = bundle;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        return zzjcVar.zzL().zzap(this.zza, this.zzb);
    }
}
