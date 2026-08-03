package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkr implements java.lang.Runnable {
    final /* synthetic */ java.lang.Boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzkr(com.google.android.gms.measurement.internal.zzli zzliVar, java.lang.Boolean bool) {
        this.zza = bool;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzai(this.zza, true);
    }
}
