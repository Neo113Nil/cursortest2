package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzb {
    private final java.lang.Runnable zza = new com.google.android.gms.ads.internal.util.zza(this);
    private volatile java.lang.Thread zzb;

    public abstract void zza();

    public com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzcfr.zza.zza(this.zza);
    }

    final /* synthetic */ void zzc(java.lang.Thread thread) {
        this.zzb = thread;
    }
}
