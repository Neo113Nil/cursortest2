package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhv implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhy zza;
    private final java.lang.String zzb;

    public zzhv(com.google.android.gms.measurement.internal.zzhy zzhyVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzhyVar);
        this.zza = zzhyVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.zza.zzu.zzaV().zzb().zzb(this.zzb, th);
    }
}
