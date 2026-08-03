package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzq implements java.util.concurrent.Callable {
    private final long zza;

    zzq(long j) {
        this.zza = j;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        long j = this.zza;
        concurrentHashMap = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzz;
        if (concurrentHashMap.remove(java.lang.Long.valueOf(j)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzg(new java.lang.Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
