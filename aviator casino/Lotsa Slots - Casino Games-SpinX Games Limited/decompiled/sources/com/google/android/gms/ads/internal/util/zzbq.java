package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbq {
    private android.os.HandlerThread zza = null;
    private android.os.Handler zzb = null;
    private int zzc = 0;
    private final java.lang.Object zzd = new java.lang.Object();

    public final android.os.Looper zza() {
        android.os.Looper looper;
        java.lang.Object obj = this.zzd;
        synchronized (obj) {
            if (this.zzc != 0) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza, "Invalid state: handlerThread should already been initialized.");
            } else if (this.zza == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Starting the looper thread.");
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("LooperProvider");
                this.zza = handlerThread;
                handlerThread.start();
                this.zzb = new com.google.android.gms.internal.ads.zzgam(this.zza.getLooper());
                com.google.android.gms.ads.internal.util.zze.zza("Looper thread started.");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Resuming the looper thread");
                obj.notifyAll();
            }
            this.zzc++;
            looper = this.zza.getLooper();
        }
        return looper;
    }

    public final android.os.Handler zzb() {
        return this.zzb;
    }
}
