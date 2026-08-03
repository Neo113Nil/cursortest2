package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhw extends java.util.concurrent.FutureTask implements java.lang.Comparable {
    final boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhy zzb;
    private final long zzc;
    private final java.lang.String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhw(com.google.android.gms.measurement.internal.zzhy zzhyVar, java.lang.Runnable runnable, boolean z, java.lang.String str) {
        super(runnable, null);
        java.util.concurrent.atomic.AtomicLong atomicLong;
        java.util.Objects.requireNonNull(zzhyVar);
        this.zzb = zzhyVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        atomicLong = com.google.android.gms.measurement.internal.zzhy.zzj;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzhyVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.measurement.internal.zzhw zzhwVar = (com.google.android.gms.measurement.internal.zzhw) obj;
        boolean z = zzhwVar.zza;
        boolean z2 = this.zza;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = this.zzc;
        long j2 = zzhwVar.zzc;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzb.zzu.zzaV().zzc().zzb("Two tasks share the same index. index", java.lang.Long.valueOf(j));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(java.lang.Throwable th) {
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzu.zzaV().zzb().zzb(this.zzd, th);
        if ((th instanceof com.google.android.gms.measurement.internal.zzhu) && (defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhw(com.google.android.gms.measurement.internal.zzhy zzhyVar, java.util.concurrent.Callable callable, boolean z, java.lang.String str) {
        super(callable);
        java.util.concurrent.atomic.AtomicLong atomicLong;
        java.util.Objects.requireNonNull(zzhyVar);
        this.zzb = zzhyVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = com.google.android.gms.measurement.internal.zzhy.zzj;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzhyVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }
}
