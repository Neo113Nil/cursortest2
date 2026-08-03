package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaea extends com.google.android.gms.internal.ads.zzadx implements android.view.Choreographer.VsyncCallback {
    private final android.os.Handler zzf;

    /* synthetic */ zzaea(android.view.Choreographer choreographer, android.hardware.display.DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = com.google.android.gms.internal.ads.zzfl.zzd(null);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.zza.postVsyncCallback(this);
        }
    }

    @Override // android.view.Choreographer.VsyncCallback
    public final void onVsync(android.view.Choreographer.FrameData frameData) {
        this.zzc = frameData.getFrameTimeNanos();
        android.view.Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.zzd = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.zzd = -9223372036854775807L;
        }
        this.zzf.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzadz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzaea zzaeaVar = com.google.android.gms.internal.ads.zzaea.this;
                zzaeaVar.zza.postVsyncCallback(zzaeaVar);
            }
        }, 500L);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    final void zza() {
        super.zza();
        this.zza.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages(null);
        this.zza.removeVsyncCallback(this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }
}
