package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbs {
    private final java.util.logging.Logger zza;
    private final java.util.logging.Level zzb;

    zzcbs(java.util.logging.Level level, java.lang.Class cls) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(cls.getName());
        this.zzb = (java.util.logging.Level) com.google.common.base.Preconditions.checkNotNull(level, "level");
        this.zza = (java.util.logging.Logger) com.google.common.base.Preconditions.checkNotNull(logger, "logger");
    }

    private static java.lang.String zzk(com.google.android.libraries.places.internal.zzcff zzcffVar) {
        return zzcffVar.zzb() <= 64 ? zzcffVar.zzF().zzg() : java.lang.String.valueOf(zzcffVar.zzG((int) java.lang.Math.min(zzcffVar.zzb(), 64L)).zzg()).concat("...");
    }

    private final boolean zzl() {
        return this.zza.isLoggable(this.zzb);
    }

    final void zza(int i, int i2, com.google.android.libraries.places.internal.zzcff zzcffVar, int i3, boolean z) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcbq.zza(i);
            java.lang.String zzk = zzk(zzcffVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza.length() + 16 + java.lang.String.valueOf(i2).length() + 11 + java.lang.String.valueOf(z).length() + 8 + java.lang.String.valueOf(i3).length() + 7 + java.lang.String.valueOf(zzk).length());
            sb.append(zza);
            sb.append(" DATA: streamId=");
            sb.append(i2);
            sb.append(" endStream=");
            sb.append(z);
            sb.append(" length=");
            sb.append(i3);
            sb.append(" bytes=");
            sb.append(zzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb.toString());
        }
    }

    final void zzb(int i, int i2, java.util.List list, boolean z) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String obj = list.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 35 + obj.length() + 11 + java.lang.String.valueOf(z).length());
            sb.append("INBOUND HEADERS: streamId=");
            sb.append(i2);
            sb.append(" headers=");
            sb.append(obj);
            sb.append(" endStream=");
            sb.append(z);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", sb.toString());
        }
    }

    final void zzc(int i, int i2, com.google.android.libraries.places.internal.zzccv zzccvVar) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcbq.zza(i);
            java.lang.String valueOf = java.lang.String.valueOf(zzccvVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza.length() + 22 + java.lang.String.valueOf(i2).length() + 11 + java.lang.String.valueOf(valueOf).length());
            sb.append(zza);
            sb.append(" RST_STREAM: streamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb.toString());
        }
    }

    final void zzd(int i) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", com.google.android.libraries.places.internal.zzcbq.zza(2).concat(" SETTINGS: ack=true"));
        }
    }

    final void zze(int i, com.google.android.libraries.places.internal.zzcdk zzcdkVar) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcbq.zza(i);
            java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.libraries.places.internal.zzcbr.class);
            for (com.google.android.libraries.places.internal.zzcbr zzcbrVar : com.google.android.libraries.places.internal.zzcbr.values()) {
                if (zzcdkVar.zzb(zzcbrVar.zza())) {
                    enumMap.put((java.util.EnumMap) zzcbrVar, (com.google.android.libraries.places.internal.zzcbr) java.lang.Integer.valueOf(zzcdkVar.zzc(zzcbrVar.zza())));
                }
            }
            java.lang.String obj = enumMap.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza.length() + 30 + java.lang.String.valueOf(obj).length());
            sb.append(zza);
            sb.append(" SETTINGS: ack=false settings=");
            sb.append(obj);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", sb.toString());
        }
    }

    final void zzf(int i, long j) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcbq.zza(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza.length() + 23 + java.lang.String.valueOf(j).length());
            sb.append(zza);
            sb.append(" PING: ack=false bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb.toString());
        }
    }

    final void zzg(int i, long j) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcbq.zza(2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza.length() + 22 + java.lang.String.valueOf(j).length());
            sb.append(zza);
            sb.append(" PING: ack=true bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb.toString());
        }
    }

    final void zzh(int i, int i2, int i3, java.util.List list) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String obj = list.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 49 + java.lang.String.valueOf(i3).length() + 9 + obj.length());
            sb.append("INBOUND PUSH_PROMISE: streamId=");
            sb.append(i2);
            sb.append(" promisedStreamId=");
            sb.append(i3);
            sb.append(" headers=");
            sb.append(obj);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", sb.toString());
        }
    }

    final void zzi(int i, int i2, com.google.android.libraries.places.internal.zzccv zzccvVar, com.google.android.libraries.places.internal.zzcfj zzcfjVar) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcbq.zza(i);
            java.lang.String valueOf = java.lang.String.valueOf(zzccvVar);
            int zzj = zzcfjVar.zzj();
            com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
            zzcffVar.zzu(zzcfjVar);
            java.lang.String zzk = zzk(zzcffVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza.length() + 23 + java.lang.String.valueOf(i2).length() + 11 + java.lang.String.valueOf(valueOf).length() + 8 + java.lang.String.valueOf(zzj).length() + 7 + java.lang.String.valueOf(zzk).length());
            sb.append(zza);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            sb.append(" length=");
            sb.append(zzj);
            sb.append(" bytes=");
            sb.append(zzk);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb.toString());
        }
    }

    final void zzj(int i, int i2, long j) {
        if (zzl()) {
            java.util.logging.Logger logger = this.zza;
            java.util.logging.Level level = this.zzb;
            java.lang.String zza = com.google.android.libraries.places.internal.zzcbq.zza(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza.length() + 25 + java.lang.String.valueOf(i2).length() + 21 + java.lang.String.valueOf(j).length());
            sb.append(zza);
            sb.append(" WINDOW_UPDATE: streamId=");
            sb.append(i2);
            sb.append(" windowSizeIncrement=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb.toString());
        }
    }
}
