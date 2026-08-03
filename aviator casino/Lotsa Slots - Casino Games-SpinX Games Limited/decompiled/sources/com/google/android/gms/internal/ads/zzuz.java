package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzuz extends android.media.MediaCodec.Callback {
    private final android.os.HandlerThread zzb;
    private android.os.Handler zzc;
    private android.media.MediaFormat zzh;
    private android.media.MediaFormat zzi;
    private android.media.MediaCodec.CodecException zzj;
    private android.media.MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private java.lang.IllegalStateException zzn;
    private com.google.android.gms.internal.ads.zzvi zzo;
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzdn zzd = new com.google.android.gms.internal.ads.zzdn();
    private final com.google.android.gms.internal.ads.zzdn zze = new com.google.android.gms.internal.ads.zzdn();
    private final java.util.ArrayDeque zzf = new java.util.ArrayDeque();
    private final java.util.ArrayDeque zzg = new java.util.ArrayDeque();

    zzuz(android.os.HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzj() {
        java.util.ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (android.media.MediaFormat) arrayDeque.getLast();
        }
        this.zzd.zzc();
        this.zze.zzc();
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzl(android.media.MediaFormat mediaFormat) {
        this.zze.zza(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzm() {
        java.lang.IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        android.media.MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        android.media.MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.zza(i);
            com.google.android.gms.internal.ads.zzvi zzviVar = this.zzo;
            if (zzviVar != null) {
                com.google.android.gms.internal.ads.zzvt zzvtVar = ((com.google.android.gms.internal.ads.zzvr) zzviVar).zza;
                if (zzvtVar.zzbl() != null) {
                    zzvtVar.zzbl().zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            android.media.MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzl(mediaFormat);
                this.zzi = null;
            }
            this.zze.zza(i);
            this.zzf.add(bufferInfo);
            com.google.android.gms.internal.ads.zzvi zzviVar = this.zzo;
            if (zzviVar != null) {
                com.google.android.gms.internal.ads.zzvt zzvtVar = ((com.google.android.gms.internal.ads.zzvr) zzviVar).zza;
                if (zzvtVar.zzbl() != null) {
                    zzvtVar.zzbl().zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(android.media.MediaCodec mediaCodec) {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzc == null);
        android.os.HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(java.lang.Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            zzm();
            int i = -1;
            if (zzk()) {
                return -1;
            }
            com.google.android.gms.internal.ads.zzdn zzdnVar = this.zzd;
            if (!zzdnVar.zzd()) {
                i = zzdnVar.zzb();
            }
            return i;
        }
    }

    public final int zze(android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            zzm();
            if (zzk()) {
                return -1;
            }
            com.google.android.gms.internal.ads.zzdn zzdnVar = this.zze;
            if (zzdnVar.zzd()) {
                return -1;
            }
            int zzb = zzdnVar.zzb();
            if (zzb >= 0) {
                this.zzh.getClass();
                android.media.MediaCodec.BufferInfo bufferInfo2 = (android.media.MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (zzb == -2) {
                this.zzh = (android.media.MediaFormat) this.zzg.remove();
                zzb = -2;
            }
            return zzb;
        }
    }

    public final android.media.MediaFormat zzf() {
        android.media.MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new java.lang.IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            android.os.Handler handler = this.zzc;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            android.os.Handler handler2 = handler;
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzuy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzuz.this.zzi();
                }
            });
        }
    }

    public final void zzh(com.google.android.gms.internal.ads.zzvi zzviVar) {
        synchronized (this.zza) {
            this.zzo = zzviVar;
        }
    }

    final /* synthetic */ void zzi() {
        java.lang.Object obj = this.zza;
        synchronized (obj) {
            if (this.zzm) {
                return;
            }
            long j = this.zzl - 1;
            this.zzl = j;
            if (j > 0) {
                return;
            }
            if (j >= 0) {
                zzj();
                return;
            }
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException();
            synchronized (obj) {
                this.zzn = illegalStateException;
            }
        }
    }
}
