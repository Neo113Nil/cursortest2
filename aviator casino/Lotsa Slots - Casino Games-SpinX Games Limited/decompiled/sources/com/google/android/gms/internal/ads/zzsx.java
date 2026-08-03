package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzsx {
    final /* synthetic */ com.google.android.gms.internal.ads.zzsy zza;
    private final android.os.Handler zzb;
    private final android.media.AudioTrack.StreamEventCallback zzc;

    /* synthetic */ zzsx(com.google.android.gms.internal.ads.zzsy zzsyVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzsyVar);
        this.zza = zzsyVar;
        final android.os.Handler zzd = com.google.android.gms.internal.ads.zzfl.zzd(null);
        this.zzb = zzd;
        com.google.android.gms.internal.ads.zzsv zzsvVar = new com.google.android.gms.internal.ads.zzsv(this);
        this.zzc = zzsvVar;
        java.util.Objects.requireNonNull(zzd);
        zzsyVar.zzt().registerStreamEventCallback(new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzsw
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(java.lang.Runnable runnable) {
                zzd.post(runnable);
            }
        }, zzsvVar);
    }

    final /* synthetic */ void zza() {
        this.zza.zzt().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
