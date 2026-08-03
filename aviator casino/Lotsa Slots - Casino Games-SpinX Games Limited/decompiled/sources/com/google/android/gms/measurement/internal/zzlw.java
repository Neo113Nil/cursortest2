package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzma zza;

    zzlw(com.google.android.gms.measurement.internal.zzma zzmaVar) {
        java.util.Objects.requireNonNull(zzmaVar);
        this.zza = zzmaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzma zzmaVar = this.zza;
        zzmaVar.zza = zzmaVar.zzw();
    }
}
