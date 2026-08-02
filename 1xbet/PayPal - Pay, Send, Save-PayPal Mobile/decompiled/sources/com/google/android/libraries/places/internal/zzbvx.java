package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvx extends java.lang.ref.WeakReference {
    private static final boolean zza = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final java.lang.RuntimeException zzb;
    private final java.lang.ref.ReferenceQueue zzc;
    private final java.util.concurrent.ConcurrentMap zzd;
    private final java.lang.String zze;
    private final java.lang.ref.Reference zzf;
    private final java.util.concurrent.atomic.AtomicBoolean zzg;

    static {
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new java.lang.StackTraceElement[0]);
        zzb = runtimeException;
    }

    zzbvx(com.google.android.libraries.places.internal.zzbvy zzbvyVar, com.google.android.libraries.places.internal.zzblw zzblwVar, java.lang.ref.ReferenceQueue referenceQueue, java.util.concurrent.ConcurrentMap concurrentMap) {
        super(zzbvyVar, referenceQueue);
        this.zzg = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzf = new java.lang.ref.SoftReference(zza ? new java.lang.RuntimeException("ManagedChannel allocation site") : zzb);
        this.zze = zzblwVar.toString();
        this.zzc = referenceQueue;
        this.zzd = concurrentMap;
        concurrentMap.put(this, this);
        zza(referenceQueue);
    }

    static int zza(java.lang.ref.ReferenceQueue referenceQueue) {
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        java.util.logging.Logger logger3;
        int i = 0;
        while (true) {
            com.google.android.libraries.places.internal.zzbvx zzbvxVar = (com.google.android.libraries.places.internal.zzbvx) referenceQueue.poll();
            if (zzbvxVar == null) {
                return i;
            }
            java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) zzbvxVar.zzf.get();
            zzbvxVar.zzc();
            if (!zzbvxVar.zzg.get()) {
                i++;
                java.util.logging.Level level = java.util.logging.Level.SEVERE;
                logger = com.google.android.libraries.places.internal.zzbvy.zzc;
                if (logger.isLoggable(level)) {
                    java.lang.String property = java.lang.System.getProperty("line.separator");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(property).length() + 127);
                    sb.append("*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*");
                    sb.append(property);
                    sb.append("    Make sure to call shutdown()/shutdownNow()");
                    java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, sb.toString());
                    logger2 = com.google.android.libraries.places.internal.zzbvy.zzc;
                    logRecord.setLoggerName(logger2.getName());
                    logRecord.setParameters(new java.lang.Object[]{zzbvxVar.zze});
                    logRecord.setThrown(runtimeException);
                    logger3 = com.google.android.libraries.places.internal.zzbvy.zzc;
                    logger3.log(logRecord);
                }
            }
        }
    }

    private final void zzc() {
        super.clear();
        this.zzd.remove(this);
        this.zzf.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        zzc();
        zza(this.zzc);
    }

    final /* synthetic */ void zzb() {
        if (this.zzg.getAndSet(true)) {
            return;
        }
        clear();
    }
}
