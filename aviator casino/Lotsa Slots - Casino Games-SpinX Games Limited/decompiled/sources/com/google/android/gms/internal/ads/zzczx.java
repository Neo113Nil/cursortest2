package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzczx {
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.concurrent.ConcurrentHashMap zzb = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentHashMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentHashMap zzd = new java.util.concurrent.ConcurrentHashMap();

    public final void zza(java.lang.String str) {
        synchronized (this.zza) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzb;
            java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(str);
            concurrentHashMap.put(str, num == null ? 1 : java.lang.Integer.valueOf(num.intValue() + 1));
        }
    }

    public final int zzb(java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzc(java.lang.String str) {
        java.lang.Long l = (java.lang.Long) this.zzd.get(str);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final void zzd(java.lang.String str, long j) {
        this.zzc.put(str, java.lang.Long.valueOf(j));
    }

    public final void zze(java.lang.String str, java.lang.String str2, long j) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzc;
        java.lang.Long l = (java.lang.Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.zzd.put(str, java.lang.Long.valueOf(j - l.longValue()));
    }
}
