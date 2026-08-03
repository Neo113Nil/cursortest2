package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzma zza;

    zzlz(com.google.android.gms.measurement.internal.zzma zzmaVar) {
        java.util.Objects.requireNonNull(zzmaVar);
        this.zza = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzx(null);
    }
}
