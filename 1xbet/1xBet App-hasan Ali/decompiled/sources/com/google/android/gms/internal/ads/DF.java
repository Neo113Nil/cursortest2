package com.google.android.gms.internal.ads;

import I.C0160m;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class DF implements KF {

    /* renamed from: k, reason: collision with root package name */
    public int f8184k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8185l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8186m;

    /* renamed from: n, reason: collision with root package name */
    public Object f8187n;

    /* renamed from: o, reason: collision with root package name */
    public Object f8188o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f8189p;

    public /* synthetic */ DF(MediaCodec mediaCodec, HandlerThread handlerThread, LF lf, C1667ur c1667ur) {
        this.f8186m = mediaCodec;
        this.f8187n = new HF(handlerThread);
        this.f8188o = lf;
        this.f8189p = c1667ur;
        this.f8184k = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r6 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(DF df, MediaFormat mediaFormat, Surface surface, int i) {
        C1667ur c1667ur;
        boolean addMediaCodec;
        HF hf = (HF) df.f8187n;
        AbstractC1668us.a0(hf.f9345c == null);
        HandlerThread handlerThread = hf.f9344b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) df.f8186m;
        mediaCodec.setCallback(hf, handler);
        hf.f9345c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        ((LF) df.f8188o).g();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (AbstractC1260lo.f14419a >= 35 && (c1667ur = (C1667ur) df.f8189p) != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1667ur.f15915m;
            if (loudnessCodecController != null) {
                addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            }
            AbstractC1668us.a0(((HashSet) c1667ur.f15914l).add(mediaCodec));
        }
        df.f8184k = 1;
    }

    public static String r(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.KF
    public ByteBuffer B(int i) {
        return ((MediaCodec) this.f8186m).getOutputBuffer(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.KF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a() {
        boolean z3;
        ((LF) this.f8188o).i();
        HF hf = (HF) this.f8187n;
        synchronized (hf.f9343a) {
            try {
                IllegalStateException illegalStateException = hf.f9354n;
                if (illegalStateException != null) {
                    hf.f9354n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = hf.f9350j;
                if (codecException != null) {
                    hf.f9350j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = hf.f9351k;
                if (cryptoException != null) {
                    hf.f9351k = null;
                    throw cryptoException;
                }
                if (hf.f9352l <= 0 && !hf.f9353m) {
                    z3 = false;
                    int i = -1;
                    if (!z3) {
                        return -1;
                    }
                    C0160m c0160m = hf.f9346d;
                    int i5 = c0160m.f2498b;
                    int i6 = c0160m.f2499c;
                    if (!(i5 == i6)) {
                        if (i5 == i6) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = ((int[]) c0160m.f2501e)[i5];
                        c0160m.f2498b = (i5 + 1) & c0160m.f2500d;
                    }
                    return i;
                }
                z3 = true;
                int i7 = -1;
                if (!z3) {
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KF
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f8186m).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void c(int i, C1645uD c1645uD, long j5) {
        ((LF) this.f8188o).j(i, c1645uD, j5);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void d(int i, long j5) {
        ((MediaCodec) this.f8186m).releaseOutputBuffer(i, j5);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void e() {
        ((MediaCodec) this.f8186m).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void f(int i, int i5, int i6, long j5) {
        ((LF) this.f8188o).e(i, i5, i6, j5);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void g(int i) {
        ((MediaCodec) this.f8186m).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void h() {
        ((LF) this.f8188o).d();
        ((MediaCodec) this.f8186m).flush();
        HF hf = (HF) this.f8187n;
        synchronized (hf.f9343a) {
            hf.f9352l++;
            Handler handler = hf.f9345c;
            int i = AbstractC1260lo.f14419a;
            handler.post(new RunnableC1303mm(21, hf));
        }
        ((MediaCodec) this.f8186m).start();
    }

    @Override // com.google.android.gms.internal.ads.KF
    public MediaFormat i() {
        MediaFormat mediaFormat;
        HF hf = (HF) this.f8187n;
        synchronized (hf.f9343a) {
            try {
                mediaFormat = hf.f9349h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0040, B:28:0x0044, B:30:0x0052, B:31:0x007a, B:35:0x006f, B:36:0x007c, B:37:0x0081, B:39:0x0082, B:40:0x0084, B:41:0x0085, B:42:0x0087, B:43:0x0088, B:44:0x008a), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0040, B:28:0x0044, B:30:0x0052, B:31:0x007a, B:35:0x006f, B:36:0x007c, B:37:0x0081, B:39:0x0082, B:40:0x0084, B:41:0x0085, B:42:0x0087, B:43:0x0088, B:44:0x008a), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.KF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int j(MediaCodec.BufferInfo bufferInfo) {
        boolean z3;
        ((LF) this.f8188o).i();
        HF hf = (HF) this.f8187n;
        synchronized (hf.f9343a) {
            try {
                IllegalStateException illegalStateException = hf.f9354n;
                if (illegalStateException != null) {
                    hf.f9354n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = hf.f9350j;
                if (codecException != null) {
                    hf.f9350j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = hf.f9351k;
                if (cryptoException != null) {
                    hf.f9351k = null;
                    throw cryptoException;
                }
                if (hf.f9352l <= 0 && !hf.f9353m) {
                    z3 = false;
                    if (!z3) {
                        return -1;
                    }
                    C0160m c0160m = hf.f9347e;
                    int i = c0160m.f2498b;
                    int i5 = c0160m.f2499c;
                    if (i == i5) {
                        return -1;
                    }
                    if (i == i5) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i6 = ((int[]) c0160m.f2501e)[i];
                    c0160m.f2498b = c0160m.f2500d & (i + 1);
                    if (i6 >= 0) {
                        AbstractC1668us.F(hf.f9349h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) hf.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i6 == -2) {
                        hf.f9349h = (MediaFormat) hf.f9348g.remove();
                        i6 = -2;
                    }
                    return i6;
                }
                z3 = true;
                if (!z3) {
                }
            } finally {
            }
        }
    }

    public boolean k(int i, int i5) {
        R.e eVar = (R.e) this.f8187n;
        int i6 = this.f8184k;
        b0.n nVar = (b0.n) eVar.f5106k[i + i6];
        b0.n nVar2 = (b0.n) ((R.e) this.f8188o).f5106k[i6 + i5];
        return kotlin.jvm.internal.l.a(nVar, nVar2) || nVar.getClass() == nVar2.getClass();
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void l() {
        C1667ur c1667ur;
        C1667ur c1667ur2;
        C1667ur c1667ur3;
        try {
            try {
                if (this.f8184k == 1) {
                    ((LF) this.f8188o).f();
                    HF hf = (HF) this.f8187n;
                    synchronized (hf.f9343a) {
                        hf.f9353m = true;
                        hf.f9344b.quit();
                        hf.a();
                    }
                }
                this.f8184k = 2;
                if (this.f8185l) {
                    return;
                }
                int i = AbstractC1260lo.f14419a;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.f8186m).stop();
                }
                if (i >= 35 && (c1667ur3 = (C1667ur) this.f8189p) != null) {
                    c1667ur3.f((MediaCodec) this.f8186m);
                }
                ((MediaCodec) this.f8186m).release();
                this.f8185l = true;
            } catch (Throwable th) {
                if (!this.f8185l) {
                    int i5 = AbstractC1260lo.f14419a;
                    if (i5 >= 30 && i5 < 33) {
                        ((MediaCodec) this.f8186m).stop();
                    }
                    if (i5 >= 35 && (c1667ur2 = (C1667ur) this.f8189p) != null) {
                        c1667ur2.f((MediaCodec) this.f8186m);
                    }
                    ((MediaCodec) this.f8186m).release();
                    this.f8185l = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (AbstractC1260lo.f14419a >= 35 && (c1667ur = (C1667ur) this.f8189p) != null) {
                c1667ur.f((MediaCodec) this.f8186m);
            }
            ((MediaCodec) this.f8186m).release();
            this.f8185l = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void m(int i) {
        ((MediaCodec) this.f8186m).releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void n(Surface surface) {
        ((MediaCodec) this.f8186m).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.KF
    public boolean o(Qs qs) {
        HF hf = (HF) this.f8187n;
        synchronized (hf.f9343a) {
            hf.f9355o = qs;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.KF
    public void p(Bundle bundle) {
        ((LF) this.f8188o).c(bundle);
    }

    public DF(z0.c0 c0Var, b0.o oVar, int i, R.e eVar, R.e eVar2, boolean z3) {
        this.f8189p = c0Var;
        this.f8186m = oVar;
        this.f8184k = i;
        this.f8187n = eVar;
        this.f8188o = eVar2;
        this.f8185l = z3;
    }
}
