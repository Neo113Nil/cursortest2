package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes.dex */
public class zzlx implements java.io.Closeable {
    private static final java.util.Map zza = new java.util.HashMap();
    private final java.lang.String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public static com.google.android.gms.internal.mlkit_vision_common.zzlx zze(java.lang.String str) {
        com.google.android.gms.internal.mlkit_vision_common.zzlv zzlvVar;
        com.google.android.gms.internal.mlkit_vision_common.zzmw.zza();
        if (!com.google.android.gms.internal.mlkit_vision_common.zzmw.zzb()) {
            zzlvVar = com.google.android.gms.internal.mlkit_vision_common.zzlv.zza;
            return zzlvVar;
        }
        java.util.Map map = zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new com.google.android.gms.internal.mlkit_vision_common.zzlx("detectorTaskWithResource#run"));
        }
        return (com.google.android.gms.internal.mlkit_vision_common.zzlx) map.get("detectorTaskWithResource#run");
    }

    public com.google.android.gms.internal.mlkit_vision_common.zzlx zzb() {
        this.zze = android.os.SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j) {
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.zzf;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            zza();
        }
        this.zzf = elapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j;
        this.zzg = java.lang.Math.min(this.zzg, j);
        this.zzh = java.lang.Math.max(this.zzh, j);
        if (this.zzc % 50 == 0) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.String str = this.zzb;
            int i = this.zzc;
            java.lang.String.format(locale, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i), java.lang.Long.valueOf(this.zzg), java.lang.Long.valueOf(this.zzh), java.lang.Integer.valueOf((int) (this.zzd / i)));
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j) {
        zzc((android.os.SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.zze;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Did you forget to call start()?");
        }
        zzd(j);
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zze = 0L;
        this.zzg = androidx.collection.SieveCacheKt.NodeLinkMask;
        this.zzh = androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask;
    }

    private zzlx(java.lang.String str) {
        this.zzg = androidx.collection.SieveCacheKt.NodeLinkMask;
        this.zzh = androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask;
        this.zzb = str;
    }
}
