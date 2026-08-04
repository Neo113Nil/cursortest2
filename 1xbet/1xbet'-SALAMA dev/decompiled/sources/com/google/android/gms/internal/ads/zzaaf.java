package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class zzaaf extends HandlerThread implements Handler.Callback {
    private zzdf zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaah zze;

    public zzaaf() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 == 1) {
                try {
                    try {
                        int i8 = message.arg1;
                        zzdf zzdfVar = this.zza;
                        if (zzdfVar == null) {
                            throw null;
                        }
                        zzdfVar.zzb(i8);
                        this.zze = new zzaah(this, this.zza.zza(), i8 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdg e7) {
                        zzdq.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                        this.zzd = new IllegalStateException(e7);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e8) {
                    zzdq.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.zzc = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    zzdq.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.zzd = e9;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i7 == 2) {
                try {
                    zzdf zzdfVar2 = this.zza;
                    if (zzdfVar2 == null) {
                        throw null;
                    }
                    zzdfVar2.zzc();
                    return true;
                } catch (Throwable th) {
                    try {
                        zzdq.zzd("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaah zza(int i7) {
        boolean z4;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdf(handler, null);
        synchronized (this) {
            z4 = false;
            this.zzb.obtainMessage(1, i7, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaah zzaahVar = this.zze;
        zzaahVar.getClass();
        return zzaahVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
