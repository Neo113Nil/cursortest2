package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcdg implements com.google.android.libraries.places.internal.zzccy {
    private final com.google.android.libraries.places.internal.zzcfg zza;
    private final com.google.android.libraries.places.internal.zzcff zzb;
    private final com.google.android.libraries.places.internal.zzcdb zzc;
    private int zzd;
    private boolean zze;

    zzcdg(com.google.android.libraries.places.internal.zzcfg zzcfgVar, boolean z) {
        this.zza = zzcfgVar;
        com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
        this.zzb = zzcffVar;
        this.zzc = new com.google.android.libraries.places.internal.zzcdb(4096, false, zzcffVar);
        this.zzd = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.zze = true;
            this.zza.close();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zza(com.google.android.libraries.places.internal.zzcdk zzcdkVar) throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.zzd = zzcdkVar.zzf(this.zzd);
            zzl(0, 0, (byte) 4, (byte) 1);
            this.zza.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzb(int i, com.google.android.libraries.places.internal.zzccv zzccvVar) throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            int i2 = zzccvVar.zzs;
            if (i2 == -1) {
                throw new java.lang.IllegalArgumentException();
            }
            zzl(i, 4, (byte) 3, (byte) 0);
            com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
            zzcfgVar.zzL(i2);
            zzcfgVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzc(boolean z, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            zzl(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
            zzcfgVar.zzL(i);
            zzcfgVar.zzL(i2);
            zzcfgVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzd() throws java.io.IOException {
        java.util.logging.Logger logger;
        com.google.android.libraries.places.internal.zzcfj zzcfjVar;
        com.google.android.libraries.places.internal.zzcfj zzcfjVar2;
        java.util.logging.Logger logger2;
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            logger = com.google.android.libraries.places.internal.zzcdh.zza;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                java.util.logging.Level level = java.util.logging.Level.FINE;
                zzcfjVar2 = com.google.android.libraries.places.internal.zzcdh.zzb;
                java.lang.String format = java.lang.String.format(">> CONNECTION %s", zzcfjVar2.zzg());
                logger2 = com.google.android.libraries.places.internal.zzcdh.zza;
                logger2.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", format);
            }
            com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
            zzcfjVar = com.google.android.libraries.places.internal.zzcdh.zzb;
            zzcfgVar.zzI(zzcfjVar.zzk());
            zzcfgVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zze() throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.zza.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzf(boolean z, boolean z2, int i, int i2, java.util.List list) throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.zzc.zza(list);
            com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
            long zzb = zzcffVar.zzb();
            int min = (int) java.lang.Math.min(this.zzd, zzb);
            long j = min;
            zzl(i, min, (byte) 1, zzb == j ? (byte) 4 : (byte) 0);
            com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
            zzcfgVar.zzc(zzcffVar, j);
            if (zzb > j) {
                long j2 = zzb - j;
                while (j2 > 0) {
                    int min2 = (int) java.lang.Math.min(this.zzd, j2);
                    long j3 = min2;
                    j2 -= j3;
                    zzl(i, min2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                    zzcfgVar.zzc(zzcffVar, j3);
                }
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzh(boolean z, int i, com.google.android.libraries.places.internal.zzcff zzcffVar, int i2) throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            zzl(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.zza.zzc(zzcffVar, i2);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzi(com.google.android.libraries.places.internal.zzcdk zzcdkVar) throws java.io.IOException {
        int i;
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            int i2 = 0;
            zzl(0, zzcdkVar.zzd() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (zzcdkVar.zzb(i2)) {
                    if (i2 == 4) {
                        int i3 = i2;
                        i2 = 3;
                        i = i3;
                    } else {
                        i = 7;
                        if (i2 == 7) {
                            i2 = 4;
                        } else {
                            i = i2;
                        }
                    }
                    com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
                    zzcfgVar.zzK(i2);
                    zzcfgVar.zzL(zzcdkVar.zzc(i));
                    i2 = i;
                }
                i2++;
            }
            this.zza.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzj(int i, com.google.android.libraries.places.internal.zzccv zzccvVar, byte[] bArr) throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            int i2 = zzccvVar.zzs;
            if (i2 == -1) {
                throw com.google.android.libraries.places.internal.zzcdh.zzc("errorCode.httpCode == -1", new java.lang.Object[0]);
            }
            zzl(0, 8, (byte) 7, (byte) 0);
            com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
            zzcfgVar.zzL(0);
            zzcfgVar.zzL(i2);
            zzcfgVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzk(int i, long j) throws java.io.IOException {
        synchronized (this) {
            if (this.zze) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (j == 0) {
                throw com.google.android.libraries.places.internal.zzcdh.zzc("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new java.lang.Object[]{0L});
            }
            zzl(i, 4, (byte) 8, (byte) 0);
            com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
            zzcfgVar.zzL((int) j);
            zzcfgVar.flush();
        }
    }

    final void zzl(int i, int i2, byte b, byte b2) throws java.io.IOException {
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        logger = com.google.android.libraries.places.internal.zzcdh.zza;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            java.util.logging.Level level = java.util.logging.Level.FINE;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcde.zza(false, i, i2, b, b2);
            logger2 = com.google.android.libraries.places.internal.zzcdh.zza;
            logger2.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", zza);
        }
        int i3 = this.zzd;
        if (i2 > i3) {
            throw com.google.android.libraries.places.internal.zzcdh.zzc("FRAME_SIZE_ERROR length > %d: %d", new java.lang.Object[]{java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2)});
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw com.google.android.libraries.places.internal.zzcdh.zzc("reserved bit set: %s", new java.lang.Object[]{java.lang.Integer.valueOf(i)});
        }
        com.google.android.libraries.places.internal.zzcfg zzcfgVar = this.zza;
        zzcfgVar.zzJ((i2 >>> 16) & 255);
        zzcfgVar.zzJ((i2 >>> 8) & 255);
        zzcfgVar.zzJ(i2 & 255);
        zzcfgVar.zzJ(b);
        zzcfgVar.zzJ(b2);
        zzcfgVar.zzL(i & Integer.MAX_VALUE);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final int zzg() {
        return this.zzd;
    }
}
