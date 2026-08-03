package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzchh {
    private long zzb;
    private final long zza = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzar)).longValue());
    private boolean zzc = true;

    zzchh() {
    }

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(android.graphics.SurfaceTexture surfaceTexture, final com.google.android.gms.internal.ads.zzcgs zzcgsVar) {
        if (zzcgsVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (java.lang.Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
        java.util.Objects.requireNonNull(zzcgsVar);
        zzgamVar.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcgs.this.zzi();
            }
        });
    }
}
