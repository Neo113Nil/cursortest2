package com.google.android.gms.common;

/* loaded from: classes8.dex */
public class zzy {
    private static final com.google.android.gms.common.zzy zze = new com.google.android.gms.common.zzy(true, 3, 1, null, null, -1);
    final boolean zza;

    @javax.annotation.Nullable
    final java.lang.String zzb;

    @javax.annotation.Nullable
    final java.lang.Throwable zzc;
    final int zzd;

    final void zze() {
        if (this.zza || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        java.lang.Throwable th = this.zzc;
        if (th != null) {
            android.util.Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            android.util.Log.d("GoogleCertificatesRslt", zza());
        }
    }

    @javax.annotation.Nullable
    java.lang.String zza() {
        return this.zzb;
    }

    static com.google.android.gms.common.zzy zzg(int i, int i2, java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        return new com.google.android.gms.common.zzy(false, i, i2, str, th, -1L);
    }

    public static com.google.android.gms.common.zzy zzf(int i, long j) {
        return new com.google.android.gms.common.zzy(true, i, 1, null, null, j);
    }

    static com.google.android.gms.common.zzy zzd(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.common.zzy(false, 1, 5, str, th, -1L);
    }

    static com.google.android.gms.common.zzy zzc(java.lang.String str) {
        return new com.google.android.gms.common.zzy(false, 1, 5, str, null, -1L);
    }

    @java.lang.Deprecated
    static com.google.android.gms.common.zzy zzb() {
        return zze;
    }

    /* synthetic */ zzy(boolean z, int i, int i2, java.lang.String str, java.lang.Throwable th, long j, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }

    private zzy(boolean z, int i, int i2, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th, long j) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }
}
