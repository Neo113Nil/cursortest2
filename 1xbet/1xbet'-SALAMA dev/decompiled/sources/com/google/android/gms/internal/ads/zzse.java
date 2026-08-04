package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p122r.d;

/* JADX INFO: loaded from: classes.dex */
final class zzse extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzsn zzo;
    private final Object zza = new Object();
    private final d zzd = new d();
    private final d zze = new d();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzse(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzse zzseVar) {
        synchronized (zzseVar.zza) {
            try {
                if (zzseVar.zzm) {
                    return;
                }
                long j = zzseVar.zzl - 1;
                zzseVar.zzl = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    zzseVar.zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzseVar.zza) {
                    zzseVar.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzi(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        d dVar = this.zzd;
        dVar.f15986c = dVar.f15985b;
        d dVar2 = this.zze;
        dVar2.f15986c = dVar2.f15985b;
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    private final boolean zzl() {
        return this.zzl > 0 || this.zzm;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.zza) {
            try {
                this.zzd.a(i7);
                zzsn zzsnVar = this.zzo;
                if (zzsnVar != null) {
                    zzsy zzsyVar = ((zzsv) zzsnVar).zza;
                    if (zzsyVar.zzo != null) {
                        zzsyVar.zzo.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzi(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i7);
                this.zzf.add(bufferInfo);
                zzsn zzsnVar = this.zzo;
                if (zzsnVar != null) {
                    zzsy zzsyVar = ((zzsv) zzsnVar).zza;
                    if (zzsyVar.zzo != null) {
                        zzsyVar.zzo.zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            try {
                zzk();
                int i7 = -1;
                if (zzl()) {
                    return -1;
                }
                d dVar = this.zzd;
                int i8 = dVar.f15985b;
                int i9 = dVar.f15986c;
                if (!(i8 == i9)) {
                    if (i8 == i9) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i7 = dVar.f15984a[i8];
                    dVar.f15985b = (i8 + 1) & dVar.f15987d;
                }
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzk();
                if (zzl()) {
                    return -1;
                }
                d dVar = this.zze;
                int i7 = dVar.f15985b;
                int i8 = dVar.f15986c;
                if (i7 == i8) {
                    return -1;
                }
                if (i7 == i8) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i9 = dVar.f15984a[i7];
                dVar.f15985b = (i7 + 1) & dVar.f15987d;
                if (i9 >= 0) {
                    zzcv.zzb(this.zzh);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i9 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i9 = -2;
                }
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            int i7 = zzen.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsd
                @Override // java.lang.Runnable
                public final void run() {
                    zzse.zzd(this.zza);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzcv.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzsn zzsnVar) {
        synchronized (this.zza) {
            this.zzo = zzsnVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}
