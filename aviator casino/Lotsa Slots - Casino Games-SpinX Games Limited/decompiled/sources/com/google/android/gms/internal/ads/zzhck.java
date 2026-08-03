package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhck extends com.google.android.gms.internal.ads.zzhbr implements com.google.android.gms.internal.ads.zzhcf {
    private final java.util.concurrent.ScheduledFuture zza;

    zzhck(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(listenableFuture);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhbq, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = zza().cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
