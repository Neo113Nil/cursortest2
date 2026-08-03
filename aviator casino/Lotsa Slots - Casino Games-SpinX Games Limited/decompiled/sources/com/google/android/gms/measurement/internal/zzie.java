package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzie implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzb;

    zzie(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzb = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzb;
        zzjcVar.zzL().zzY();
        zzjcVar.zzL().zzah(this.zza);
    }
}
