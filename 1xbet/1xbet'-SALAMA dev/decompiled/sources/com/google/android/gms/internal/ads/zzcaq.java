package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.P;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzcaq {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzS)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcab zzcabVar) {
        if (zzcabVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcap
            @Override // java.lang.Runnable
            public final void run() {
                zzcabVar.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
