package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzadf extends android.os.HandlerThread implements android.os.Handler.Callback {
    private com.google.android.gms.internal.ads.zzdv zza;
    private android.os.Handler zzb;
    private java.lang.Error zzc;
    private java.lang.RuntimeException zzd;
    private com.google.android.gms.internal.ads.zzadg zze;

    public zzadf() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        int i2 = message.arg1;
                        com.google.android.gms.internal.ads.zzdv zzdvVar = this.zza;
                        zzdvVar.getClass();
                        zzdvVar.zza(i2);
                        this.zze = new com.google.android.gms.internal.ads.zzadg(this, this.zza.zzc(), i2 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (com.google.android.gms.internal.ads.zzdw e) {
                        com.google.android.gms.internal.ads.zzeg.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.zzd = new java.lang.IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (java.lang.Error e2) {
                    com.google.android.gms.internal.ads.zzeg.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.RuntimeException e3) {
                    com.google.android.gms.internal.ads.zzeg.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzd = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    com.google.android.gms.internal.ads.zzdv zzdvVar2 = this.zza;
                    zzdvVar2.getClass();
                    zzdvVar2.zzb();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (java.lang.Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzadg zza(int i) {
        boolean z;
        start();
        this.zzb = new android.os.Handler(getLooper(), this);
        this.zza = new com.google.android.gms.internal.ads.zzdv(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        java.lang.RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        java.lang.Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        com.google.android.gms.internal.ads.zzadg zzadgVar = this.zze;
        zzadgVar.getClass();
        return zzadgVar;
    }

    public final void zzb() {
        android.os.Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
