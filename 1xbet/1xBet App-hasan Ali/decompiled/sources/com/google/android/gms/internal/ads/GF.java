package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class GF implements LF {

    /* renamed from: q, reason: collision with root package name */
    public static final ArrayDeque f9179q = new ArrayDeque();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f9180r = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final MediaCodec f9181k;

    /* renamed from: l, reason: collision with root package name */
    public final HandlerThread f9182l;

    /* renamed from: m, reason: collision with root package name */
    public EF f9183m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f9184n;

    /* renamed from: o, reason: collision with root package name */
    public final H2.j f9185o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9186p;

    public GF(MediaCodec mediaCodec, HandlerThread handlerThread) {
        H2.j jVar = new H2.j(2);
        this.f9181k = mediaCodec;
        this.f9182l = handlerThread;
        this.f9185o = jVar;
        this.f9184n = new AtomicReference();
    }

    public static FF a() {
        ArrayDeque arrayDeque = f9179q;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new FF();
                }
                return (FF) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void c(Bundle bundle) {
        i();
        EF ef = this.f9183m;
        int i = AbstractC1260lo.f14419a;
        ef.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.LF, com.google.android.gms.internal.ads.InterfaceC1452q
    public final void d() {
        H2.j jVar = this.f9185o;
        if (this.f9186p) {
            try {
                EF ef = this.f9183m;
                if (ef == null) {
                    throw null;
                }
                ef.removeCallbacksAndMessages(null);
                synchronized (jVar) {
                    jVar.f2300l = false;
                }
                EF ef2 = this.f9183m;
                if (ef2 == null) {
                    throw null;
                }
                ef2.obtainMessage(3).sendToTarget();
                jVar.c();
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void e(int i, int i5, int i6, long j5) {
        i();
        FF a5 = a();
        a5.f8944a = i;
        a5.f8945b = i5;
        a5.f8947d = j5;
        a5.f8948e = i6;
        EF ef = this.f9183m;
        int i7 = AbstractC1260lo.f14419a;
        ef.obtainMessage(1, a5).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void f() {
        if (this.f9186p) {
            d();
            this.f9182l.quit();
        }
        this.f9186p = false;
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void g() {
        if (this.f9186p) {
            return;
        }
        HandlerThread handlerThread = this.f9182l;
        handlerThread.start();
        this.f9183m = new EF(this, handlerThread.getLooper());
        this.f9186p = true;
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void i() {
        RuntimeException runtimeException = (RuntimeException) this.f9184n.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.LF
    public final void j(int i, C1645uD c1645uD, long j5) {
        int length;
        int length2;
        int length3;
        int length4;
        i();
        FF a5 = a();
        a5.f8944a = i;
        a5.f8945b = 0;
        a5.f8947d = j5;
        a5.f8948e = 0;
        int i5 = c1645uD.f;
        MediaCodec.CryptoInfo cryptoInfo = a5.f8946c;
        cryptoInfo.numSubSamples = i5;
        int[] iArr = c1645uD.f15811d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length4 = iArr.length)) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = c1645uD.f15812e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < (length3 = iArr3.length)) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = c1645uD.f15809b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < (length2 = bArr.length)) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = c1645uD.f15808a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < (length = bArr3.length)) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = c1645uD.f15810c;
        if (AbstractC1260lo.f14419a >= 24) {
            TC.k();
            cryptoInfo.setPattern(TC.d(c1645uD.f15813g, c1645uD.f15814h));
        }
        this.f9183m.obtainMessage(2, a5).sendToTarget();
    }
}
