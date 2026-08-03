package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhcs extends com.google.android.gms.internal.ads.zzhbn {
    private com.google.common.util.concurrent.ListenableFuture zza;
    private java.util.concurrent.ScheduledFuture zzb;

    static com.google.common.util.concurrent.ListenableFuture zze(com.google.common.util.concurrent.ListenableFuture listenableFuture, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.internal.ads.zzhcs zzhcsVar = new com.google.android.gms.internal.ads.zzhcs(listenableFuture);
        com.google.android.gms.internal.ads.zzhcq zzhcqVar = new com.google.android.gms.internal.ads.zzhcq(zzhcsVar);
        zzhcsVar.zzb = scheduledExecutorService.schedule(zzhcqVar, j, timeUnit);
        listenableFuture.addListener(zzhcqVar, com.google.android.gms.internal.ads.zzhbl.INSTANCE);
        return zzhcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzc() {
        zzm(this.zza);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final java.lang.String zzd() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        java.lang.String obj = listenableFuture.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append(com.ironsource.X3.j.e);
        java.lang.String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.length() + 19 + java.lang.String.valueOf(delay).length() + 4);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf() {
        return this.zza;
    }

    final /* synthetic */ java.util.concurrent.ScheduledFuture zzx() {
        return this.zzb;
    }

    final /* synthetic */ void zzy(java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }

    private zzhcs(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }
}
