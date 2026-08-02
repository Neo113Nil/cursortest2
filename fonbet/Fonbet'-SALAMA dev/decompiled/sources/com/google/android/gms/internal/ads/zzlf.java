package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzlf {
    private final Object zza;
    private Looper zzb;
    private HandlerThread zzc;
    private int zzd;

    public zzlf() {
        throw null;
    }

    public final Looper zza() {
        Looper looper;
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    boolean z4 = false;
                    if (this.zzd == 0 && this.zzc == null) {
                        z4 = true;
                    }
                    zzcv.zzf(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.zzc = handlerThread;
                    handlerThread.start();
                    this.zzb = this.zzc.getLooper();
                }
                this.zzd++;
                looper = this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void zzb() {
        HandlerThread handlerThread;
        synchronized (this.zza) {
            try {
                zzcv.zzf(this.zzd > 0);
                int i7 = this.zzd - 1;
                this.zzd = i7;
                if (i7 == 0 && (handlerThread = this.zzc) != null) {
                    handlerThread.quit();
                    this.zzc = null;
                    this.zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzlf(Looper looper) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }
}
