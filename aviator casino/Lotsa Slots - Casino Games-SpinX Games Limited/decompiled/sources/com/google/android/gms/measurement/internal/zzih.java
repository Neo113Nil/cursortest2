package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzih implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzah zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzb;

    zzih(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzah zzahVar) {
        this.zza = zzahVar;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        com.google.android.gms.measurement.internal.zzah zzahVar = this.zza;
        if (zzahVar.zzc.zza() == null) {
            zzjcVar.zzL().zzak(zzahVar);
        } else {
            zzjcVar.zzL().zzai(zzahVar);
        }
    }
}
