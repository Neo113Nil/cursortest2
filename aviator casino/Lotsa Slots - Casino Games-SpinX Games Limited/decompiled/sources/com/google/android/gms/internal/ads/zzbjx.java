package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbjx {
    private android.view.MotionEvent zza = android.view.MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private android.view.MotionEvent zzb = android.view.MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final java.util.concurrent.ScheduledExecutorService zzc;

    public zzbjx(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzbjz zzbjzVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar) {
        this.zzc = scheduledExecutorService;
    }

    public final void zza(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = android.view.MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = android.view.MotionEvent.obtain(motionEvent);
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzhbw.zza(null)), ((java.lang.Long) com.google.android.gms.internal.ads.zzbkp.zzc.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzc);
    }
}
