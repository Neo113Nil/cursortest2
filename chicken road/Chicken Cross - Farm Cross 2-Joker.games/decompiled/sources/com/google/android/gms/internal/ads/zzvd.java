package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzvd implements zzvq {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf = new AtomicReference();
    private final zzdt zzg;
    private boolean zzh;

    zzvd(MediaCodec mediaCodec, HandlerThread handlerThread, zzdt zzdtVar, boolean z) {
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdtVar;
    }

    private static zzvc zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzvc();
            }
            return (zzvc) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzvb(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        zzg();
        zzvc zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzc(int i, int i2, zziv zzivVar, long j, int i3) {
        zzg();
        zzvc zzi = zzi();
        zzi.zza(i, 0, 0, j, i3);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzivVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzivVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzivVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzk = zzk(zzivVar.zzb, cryptoInfo.key);
        zzk.getClass();
        cryptoInfo.key = zzk;
        byte[] zzk2 = zzk(zzivVar.zza, cryptoInfo.iv);
        zzk2.getClass();
        cryptoInfo.iv = zzk2;
        cryptoInfo.mode = zzivVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzivVar.zzg, zzivVar.zzh));
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                Handler handler2 = handler;
                handler.removeCallbacksAndMessages(null);
                zzdt zzdtVar = this.zzg;
                zzdtVar.zzb();
                Handler handler3 = this.zze;
                if (handler3 == null) {
                    throw null;
                }
                Handler handler4 = handler3;
                handler3.obtainMessage(3).sendToTarget();
                zzdtVar.zzc();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzh(Message message) {
        zzvc zzvcVar;
        int i = message.what;
        zzvc zzvcVar2 = null;
        if (i == 1) {
            zzvcVar = (zzvc) message.obj;
            int i2 = zzvcVar.zza;
            int i3 = zzvcVar.zzb;
            try {
                this.zzc.queueInputBuffer(i2, 0, zzvcVar.zzc, zzvcVar.zze, zzvcVar.zzf);
            } catch (RuntimeException e) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e);
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    this.zzg.zza();
                } else if (i != 4) {
                    MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    try {
                        this.zzc.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e2) {
                        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e2);
                    }
                }
                if (zzvcVar2 == null) {
                    ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzvcVar2);
                    }
                    return;
                }
                return;
            }
            zzvcVar = (zzvc) message.obj;
            int i4 = zzvcVar.zza;
            int i5 = zzvcVar.zzb;
            MediaCodec.CryptoInfo cryptoInfo = zzvcVar.zzd;
            long j = zzvcVar.zze;
            int i6 = zzvcVar.zzf;
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                } else {
                    synchronized (zzb) {
                        this.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                    }
                }
            } catch (RuntimeException e3) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.zzf, null, e3);
            }
        }
        zzvcVar2 = zzvcVar;
        if (zzvcVar2 == null) {
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
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

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
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
}
