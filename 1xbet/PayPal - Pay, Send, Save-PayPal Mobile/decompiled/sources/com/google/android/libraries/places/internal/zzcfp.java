package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfp implements com.google.android.libraries.places.internal.zzcfh {
    public final com.google.android.libraries.places.internal.zzcfv zza;
    public final com.google.android.libraries.places.internal.zzcff zzb;
    public boolean zzc;

    public zzcfp(com.google.android.libraries.places.internal.zzcfv zzcfvVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfvVar, "");
        this.zza = zzcfvVar;
        this.zzb = new com.google.android.libraries.places.internal.zzcff();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcfv
    public final void close() {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        this.zza.close();
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
        zzcffVar.zzt(zzcffVar.zzb());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
        if (zzcffVar.zzb() == 0 && this.zza.zza(zzcffVar, 8192L) == -1) {
            return -1;
        }
        return zzcffVar.read(byteBuffer);
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzcfv zzcfvVar = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzcfvVar.toString().length() + 8);
        sb.append("buffer(");
        sb.append(zzcfvVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcfv
    public final long zza(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        if (j < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 15);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        com.google.android.libraries.places.internal.zzcff zzcffVar2 = this.zzb;
        if (zzcffVar2.zzb() == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.zza.zza(zzcffVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return zzcffVar2.zza(zzcffVar, java.lang.Math.min(j, zzcffVar2.zzb()));
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final boolean zzf() {
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
        return zzcffVar.zzf() && this.zza.zza(zzcffVar, 8192L) == -1;
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final void zzg(long j) {
        com.google.android.libraries.places.internal.zzcff zzcffVar;
        if (j < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 15);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        do {
            zzcffVar = this.zzb;
            if (zzcffVar.zzb() >= j) {
                return;
            }
        } while (this.zza.zza(zzcffVar, 8192L) != -1);
        throw new java.io.EOFException();
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final byte zzj() {
        zzg(1L);
        return this.zzb.zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final short zzl() {
        zzg(2L);
        return this.zzb.zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final int zzm() {
        zzg(4L);
        return this.zzb.zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final com.google.android.libraries.places.internal.zzcfj zzn(long j) {
        zzg(j);
        return this.zzb.zzn(j);
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final byte[] zzr(long j) {
        zzg(j);
        return this.zzb.zzr(j);
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final void zzt(long j) {
        if (this.zzc) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        while (j > 0) {
            com.google.android.libraries.places.internal.zzcff zzcffVar = this.zzb;
            if (zzcffVar.zzb() == 0 && this.zza.zza(zzcffVar, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long min = java.lang.Math.min(j, zzcffVar.zzb());
            zzcffVar.zzt(min);
            j -= min;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final com.google.android.libraries.places.internal.zzcff zze() {
        return this.zzb;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }
}
