package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfo implements com.google.android.libraries.places.internal.zzcfg {
    public final com.google.android.libraries.places.internal.zzcft zza;
    public final com.google.android.libraries.places.internal.zzcff zzb;
    public boolean zzc;

    public zzcfo(com.google.android.libraries.places.internal.zzcft zzcftVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcftVar, "");
        this.zza = zzcftVar;
        this.zzb = new com.google.android.libraries.places.internal.zzcff();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcft
    public final void close() {
        java.lang.Throwable th;
        if (this.zzc) {
            return;
        }
        try {
            com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
            th = null;
            if (zzcffVar.zzb() > 0) {
                this.zza.zzc(zzcffVar, zzcffVar.zzb());
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            this.zza.close();
        } catch (java.lang.Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.zzc = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcfg, com.google.android.libraries.places.internal.zzcft, java.io.Flushable
    public final void flush() {
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
        if (zzcffVar.zzb() > 0) {
            this.zza.zzc(zzcffVar, zzcffVar.zzb());
        }
        this.zza.flush();
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzcft zzcftVar = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzcftVar.toString().length() + 8);
        sb.append("buffer(");
        sb.append(zzcftVar);
        sb.append(")");
        return sb.toString();
    }

    public final com.google.android.libraries.places.internal.zzcfg zza() {
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
        long zzi = zzcffVar.zzi();
        if (zzi > 0) {
            this.zza.zzc(zzcffVar, zzi);
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        int write = this.zzb.write(byteBuffer);
        zza();
        return write;
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final com.google.android.libraries.places.internal.zzcfg zzH(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.zzb.zzv(str);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final com.google.android.libraries.places.internal.zzcfg zzI(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.zzb.zzy(bArr);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final com.google.android.libraries.places.internal.zzcfg zzJ(int i) {
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.zzb.zzA(i);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final com.google.android.libraries.places.internal.zzcfg zzK(int i) {
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.zzb.zzB(i);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final com.google.android.libraries.places.internal.zzcfg zzL(int i) {
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.zzb.zzC(i);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcft
    public final void zzc(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.zzb.zzc(zzcffVar, j);
        zza();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }
}
