package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzflx {
    private final java.util.Deque zza = new java.util.concurrent.LinkedBlockingDeque();
    private final java.util.concurrent.Callable zzb;
    private final com.google.android.gms.internal.ads.zzhcg zzc;

    public zzflx(java.util.concurrent.Callable callable, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zzb = callable;
        this.zzc = zzhcgVar;
    }

    public final synchronized void zza(int i) {
        java.util.Deque deque = this.zza;
        int size = i - deque.size();
        for (int i2 = 0; i2 < size; i2++) {
            deque.add(this.zzc.zzc(this.zzb));
        }
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb() {
        zza(1);
        return (com.google.common.util.concurrent.ListenableFuture) this.zza.poll();
    }

    public final synchronized void zzc(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza.addFirst(listenableFuture);
    }
}
