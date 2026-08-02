package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzsc implements zzsp {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdc zzg;
    private boolean zzh;

    public zzsc(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdc zzdcVar = new zzdc(zzcz.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdcVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void zza(zzsc zzscVar, Message message) {
        zzsb zzsbVar;
        int i7 = message.what;
        zzsb zzsbVar2 = null;
        if (i7 == 1) {
            zzsbVar = (zzsb) message.obj;
            try {
                zzscVar.zzc.queueInputBuffer(zzsbVar.zza, 0, zzsbVar.zzc, zzsbVar.zze, zzsbVar.zzf);
            } catch (RuntimeException e7) {
                zzrz.zza(zzscVar.zzf, null, e7);
            }
        } else {
            if (i7 != 2) {
                if (i7 == 3) {
                    zzscVar.zzg.zze();
                } else if (i7 != 4) {
                    zzrz.zza(zzscVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    try {
                        zzscVar.zzc.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e8) {
                        zzrz.zza(zzscVar.zzf, null, e8);
                    }
                }
                if (zzsbVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzsbVar2);
                    }
                    return;
                }
                return;
            }
            zzsbVar = (zzsb) message.obj;
            int i8 = zzsbVar.zza;
            MediaCodec.CryptoInfo cryptoInfo = zzsbVar.zzd;
            long j = zzsbVar.zze;
            int i9 = zzsbVar.zzf;
            try {
                synchronized (zzb) {
                    zzscVar.zzc.queueSecureInputBuffer(i8, 0, cryptoInfo, j, i9);
                }
            } catch (RuntimeException e9) {
                zzrz.zza(zzscVar.zzf, null, e9);
            }
        }
        zzsbVar2 = zzsbVar;
        if (zzsbVar2 == null) {
        }
    }

    private static zzsb zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzsb();
                }
                return (zzsb) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzd(int i7, int i8, int i9, long j, int i10) {
        zzc();
        zzsb zzi = zzi();
        zzi.zza(i7, 0, i9, j, i10);
        Handler handler = this.zze;
        int i11 = zzen.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zze(int i7, int i8, zzhd zzhdVar, long j, int i9) {
        zzc();
        zzsb zzi = zzi();
        zzi.zza(i7, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzhdVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzhdVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzhdVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzhdVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzhdVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzhdVar.zzc;
        if (zzen.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhdVar.zzg, zzhdVar.zzh));
        }
        this.zze.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i7 = zzen.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzsa(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
