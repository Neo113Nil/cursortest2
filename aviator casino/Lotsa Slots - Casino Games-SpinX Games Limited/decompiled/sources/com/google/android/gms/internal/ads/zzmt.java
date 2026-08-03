package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzmt {
    private final java.lang.Object zza;
    private android.os.Looper zzb;
    private android.os.HandlerThread zzc;
    private int zzd;

    public zzmt() {
        throw null;
    }

    public zzmt(android.os.Looper looper) {
        this.zza = new java.lang.Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }

    public final android.os.Looper zza() {
        android.os.Looper looper;
        synchronized (this.zza) {
            if (this.zzb == null) {
                boolean z = false;
                if (this.zzd == 0 && this.zzc == null) {
                    z = true;
                }
                com.google.android.gms.internal.ads.zzgtj.zzi(z);
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:Playback", -16);
                this.zzc = handlerThread;
                handlerThread.start();
                this.zzb = this.zzc.getLooper();
            }
            this.zzd++;
            looper = this.zzb;
        }
        return looper;
    }

    public final void zzb() {
        android.os.HandlerThread handlerThread;
        synchronized (this.zza) {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zzd > 0);
            int i = this.zzd - 1;
            this.zzd = i;
            if (i == 0 && (handlerThread = this.zzc) != null) {
                handlerThread.quit();
                this.zzc = null;
                this.zzb = null;
            }
        }
    }
}
