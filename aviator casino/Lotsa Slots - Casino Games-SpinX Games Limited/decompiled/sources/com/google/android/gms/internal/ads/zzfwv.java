package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwv {
    private final java.util.concurrent.BlockingQueue zza;
    private final java.util.concurrent.ThreadPoolExecutor zzb;
    private final java.util.ArrayDeque zzc = new java.util.ArrayDeque();
    private com.google.android.gms.internal.ads.zzfwu zzd = null;

    public zzfwv() {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new java.util.concurrent.ThreadPoolExecutor(1, 1, 1L, java.util.concurrent.TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        com.google.android.gms.internal.ads.zzfwu zzfwuVar = (com.google.android.gms.internal.ads.zzfwu) this.zzc.poll();
        this.zzd = zzfwuVar;
        if (zzfwuVar != null) {
            zzfwuVar.executeOnExecutor(this.zzb, new java.lang.Object[0]);
        }
    }

    public final void zza(com.google.android.gms.internal.ads.zzfwu zzfwuVar) {
        zzfwuVar.zzb(this);
        this.zzc.add(zzfwuVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfwu zzfwuVar) {
        this.zzd = null;
        zzc();
    }
}
