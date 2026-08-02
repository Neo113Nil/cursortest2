package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuo implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;

    zzbuo(com.google.android.libraries.places.internal.zzbvr zzbvrVar) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        java.util.logging.Logger logger = com.google.android.libraries.places.internal.zzbvr.zza;
        java.util.logging.Level level = java.util.logging.Level.SEVERE;
        java.lang.String valueOf = java.lang.String.valueOf(zzbvrVar.zzc());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 59);
        sb.append("[");
        sb.append(valueOf);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb.toString(), th);
        try {
            zzbvrVar.zzh(th);
        } catch (java.lang.Throwable th2) {
            com.google.android.libraries.places.internal.zzbvr zzbvrVar2 = this.zza;
            java.util.logging.Logger logger2 = com.google.android.libraries.places.internal.zzbvr.zza;
            java.util.logging.Level level2 = java.util.logging.Level.SEVERE;
            java.lang.String valueOf2 = java.lang.String.valueOf(zzbvrVar2.zzc());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 37);
            sb2.append("[");
            sb2.append(valueOf2);
            sb2.append("] Uncaught exception while panicking");
            logger2.logp(level2, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb2.toString(), th2);
        }
    }
}
