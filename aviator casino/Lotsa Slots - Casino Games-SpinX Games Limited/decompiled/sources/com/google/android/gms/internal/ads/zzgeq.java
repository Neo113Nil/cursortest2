package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgeq implements com.google.android.gms.internal.ads.zzgel {
    private final java.util.concurrent.ScheduledExecutorService zza = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();

    zzgeq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zza(java.lang.Runnable runnable, long j) {
        this.zza.schedule(runnable, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final void zzb() {
    }
}
