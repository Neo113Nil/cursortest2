package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzku implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjk zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzd;

    zzku(com.google.android.gms.measurement.internal.zzli zzliVar, com.google.android.gms.measurement.internal.zzjk zzjkVar, long j, boolean z) {
        this.zza = zzjkVar;
        this.zzb = j;
        this.zzc = z;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzd = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzd;
        com.google.android.gms.measurement.internal.zzjk zzjkVar = this.zza;
        zzliVar.zzA(zzjkVar);
        zzliVar.zzaj(zzjkVar, this.zzb, false, this.zzc);
    }
}
