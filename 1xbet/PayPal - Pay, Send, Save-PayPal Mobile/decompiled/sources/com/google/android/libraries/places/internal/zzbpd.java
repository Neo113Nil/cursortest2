package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpd {
    static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbiv.class.getName());
    private final java.lang.Object zzb = new java.lang.Object();
    private final com.google.android.libraries.places.internal.zzbku zzc;

    zzbpd(com.google.android.libraries.places.internal.zzbku zzbkuVar, int i, long j, java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
        this.zzc = (com.google.android.libraries.places.internal.zzbku) com.google.common.base.Preconditions.checkNotNull(zzbkuVar, "logId");
        com.google.android.libraries.places.internal.zzbkj zzbkjVar = new com.google.android.libraries.places.internal.zzbkj();
        zzbkjVar.zza(str.concat(" created"));
        zzbkjVar.zzc(com.google.android.libraries.places.internal.zzbkk.CT_INFO);
        zzbkjVar.zzb(j);
        zza(zzbkjVar.zze());
    }

    static void zzc(com.google.android.libraries.places.internal.zzbku zzbkuVar, java.util.logging.Level level, java.lang.String str) {
        java.util.logging.Logger logger = zza;
        if (logger.isLoggable(level)) {
            java.lang.String valueOf = java.lang.String.valueOf(zzbkuVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 3 + java.lang.String.valueOf(str).length());
            sb.append("[");
            sb.append(valueOf);
            sb.append("] ");
            sb.append(str);
            java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, sb.toString());
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void zza(com.google.android.libraries.places.internal.zzbkl zzbklVar) {
        int ordinal = zzbklVar.zzb.ordinal();
        java.util.logging.Level level = ordinal != 2 ? ordinal != 3 ? java.util.logging.Level.FINEST : java.util.logging.Level.FINE : java.util.logging.Level.FINER;
        synchronized (this.zzb) {
        }
        zzc(this.zzc, level, zzbklVar.zza);
    }

    final boolean zzb() {
        synchronized (this.zzb) {
        }
        return false;
    }

    final com.google.android.libraries.places.internal.zzbku zzd() {
        return this.zzc;
    }
}
