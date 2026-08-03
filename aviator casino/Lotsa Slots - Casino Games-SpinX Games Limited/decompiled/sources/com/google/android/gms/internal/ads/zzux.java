package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzux implements com.google.android.gms.internal.ads.zzvk {
    private static final java.util.ArrayDeque zza = new java.util.ArrayDeque();
    private static final java.lang.Object zzb = new java.lang.Object();
    private final android.media.MediaCodec zzc;
    private final android.os.HandlerThread zzd;
    private android.os.Handler zze;
    private final java.util.concurrent.atomic.AtomicReference zzf;
    private final com.google.android.gms.internal.ads.zzds zzg;
    private boolean zzh;

    public zzux(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread) {
        com.google.android.gms.internal.ads.zzds zzdsVar = new com.google.android.gms.internal.ads.zzds(com.google.android.gms.internal.ads.zzdo.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdsVar;
        this.zzf = new java.util.concurrent.atomic.AtomicReference();
    }

    private static com.google.android.gms.internal.ads.zzuw zzi() {
        java.util.ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new com.google.android.gms.internal.ads.zzuw();
            }
            return (com.google.android.gms.internal.ads.zzuw) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zza() {
        if (this.zzh) {
            return;
        }
        android.os.HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new com.google.android.gms.internal.ads.zzuv(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzb(int i, int i2, int i3, long j, int i4) {
        zzg();
        com.google.android.gms.internal.ads.zzuw zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        android.os.Handler handler = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzc(int i, int i2, com.google.android.gms.internal.ads.zzis zzisVar, long j, int i3) {
        zzg();
        com.google.android.gms.internal.ads.zzuw zzi = zzi();
        zzi.zza(i, 0, 0, j, i3);
        android.media.MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzisVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzisVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzisVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzk = zzk(zzisVar.zzb, cryptoInfo.key);
        zzk.getClass();
        cryptoInfo.key = zzk;
        byte[] zzk2 = zzk(zzisVar.zza, cryptoInfo.iv);
        zzk2.getClass();
        cryptoInfo.iv = zzk2;
        cryptoInfo.mode = zzisVar.zzc;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(zzisVar.zzg, zzisVar.zzh));
        }
        android.os.Handler handler = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        handler.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzd(android.os.Bundle bundle) {
        zzg();
        android.os.Handler handler = this.zze;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zze() {
        if (this.zzh) {
            try {
                android.os.Handler handler = this.zze;
                handler.getClass();
                android.os.Handler handler2 = handler;
                handler.removeCallbacksAndMessages(null);
                com.google.android.gms.internal.ads.zzds zzdsVar = this.zzg;
                zzdsVar.zzb();
                android.os.Handler handler3 = this.zze;
                handler3.getClass();
                android.os.Handler handler4 = handler3;
                handler3.obtainMessage(3).sendToTarget();
                zzdsVar.zzc();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final void zzg() {
        java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzh(android.os.Message message) {
        com.google.android.gms.internal.ads.zzuw zzuwVar;
        int i = message.what;
        com.google.android.gms.internal.ads.zzuw zzuwVar2 = null;
        if (i == 1) {
            zzuwVar = (com.google.android.gms.internal.ads.zzuw) message.obj;
            int i2 = zzuwVar.zza;
            int i3 = zzuwVar.zzb;
            try {
                this.zzc.queueInputBuffer(i2, 0, zzuwVar.zzc, zzuwVar.zze, zzuwVar.zzf);
            } catch (java.lang.RuntimeException e) {
                androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.zzf, null, e);
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    this.zzg.zza();
                } else if (i != 4) {
                    androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.zzf, null, new java.lang.IllegalStateException(java.lang.String.valueOf(message.what)));
                } else {
                    try {
                        this.zzc.setParameters((android.os.Bundle) message.obj);
                    } catch (java.lang.RuntimeException e2) {
                        androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.zzf, null, e2);
                    }
                }
                if (zzuwVar2 == null) {
                    java.util.ArrayDeque arrayDeque = zza;
                    synchronized (arrayDeque) {
                        arrayDeque.add(zzuwVar2);
                    }
                    return;
                }
                return;
            }
            zzuwVar = (com.google.android.gms.internal.ads.zzuw) message.obj;
            int i4 = zzuwVar.zza;
            int i5 = zzuwVar.zzb;
            android.media.MediaCodec.CryptoInfo cryptoInfo = zzuwVar.zzd;
            long j = zzuwVar.zze;
            int i6 = zzuwVar.zzf;
            try {
                synchronized (zzb) {
                    this.zzc.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (java.lang.RuntimeException e3) {
                androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.zzf, null, e3);
            }
        }
        zzuwVar2 = zzuwVar;
        if (zzuwVar2 == null) {
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return java.util.Arrays.copyOf(iArr, iArr.length);
        }
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return java.util.Arrays.copyOf(bArr, bArr.length);
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
