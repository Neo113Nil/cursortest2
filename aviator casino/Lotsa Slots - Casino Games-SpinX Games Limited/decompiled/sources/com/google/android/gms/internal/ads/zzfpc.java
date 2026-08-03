package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzfpc {
    private static final com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzfpd zzd;

    public zzfpc(com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfpd zzfpdVar) {
        this.zzb = zzhcgVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfpdVar;
    }

    public final com.google.android.gms.internal.ads.zzfpb zza(java.lang.Object obj, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        return new com.google.android.gms.internal.ads.zzfpb(this, obj, null, listenableFuture, java.util.Collections.singletonList(listenableFuture), listenableFuture, null);
    }

    public final com.google.android.gms.internal.ads.zzfot zzb(java.lang.Object obj, com.google.common.util.concurrent.ListenableFuture... listenableFutureArr) {
        return new com.google.android.gms.internal.ads.zzfot(this, obj, java.util.Arrays.asList(listenableFutureArr), null);
    }

    protected abstract java.lang.String zzc(java.lang.Object obj);

    final /* synthetic */ com.google.android.gms.internal.ads.zzhcg zze() {
        return this.zzb;
    }

    final /* synthetic */ java.util.concurrent.ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfpd zzg() {
        return this.zzd;
    }
}
