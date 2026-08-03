package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzig implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzah zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzc;

    zzig(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzah zzahVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzahVar;
        this.zzb = zzrVar;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        com.google.android.gms.measurement.internal.zzah zzahVar = this.zza;
        if (zzahVar.zzc.zza() == null) {
            zzjcVar.zzL().zzal(zzahVar, this.zzb);
        } else {
            zzjcVar.zzL().zzaj(zzahVar, this.zzb);
        }
    }
}
