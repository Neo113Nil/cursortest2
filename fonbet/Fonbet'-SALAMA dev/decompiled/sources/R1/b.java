package R1;

import A1.K0;
import E3.L;
import Y4.D;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import u2.C1642t;
import v2.AbstractC1664a;
import w2.C1772g;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public int f5881a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5882b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5883c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5884d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5885e;

    public b(Context context) {
        String b02;
        TelephonyManager telephonyManager;
        this.f5883c = context == null ? null : context.getApplicationContext();
        int i7 = v2.t.f17153a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                b02 = D.b0(networkCountryIso);
                int[] a2 = C1642t.a(b02);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                L l7 = C1642t.f16823n;
                hashMap.put(2, (Long) l7.get(a2[0]));
                hashMap.put(3, (Long) C1642t.f16824o.get(a2[1]));
                hashMap.put(4, (Long) C1642t.f16825p.get(a2[2]));
                hashMap.put(5, (Long) C1642t.f16826q.get(a2[3]));
                hashMap.put(10, (Long) C1642t.f16827r.get(a2[4]));
                hashMap.put(9, (Long) C1642t.f16828s.get(a2[5]));
                hashMap.put(7, (Long) l7.get(a2[0]));
                this.f5884d = hashMap;
                this.f5881a = 2000;
                this.f5885e = v2.p.f17145a;
                this.f5882b = true;
            }
        }
        b02 = D.b0(Locale.getDefault().getCountry());
        int[] a22 = C1642t.a(b02);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        L l72 = C1642t.f16823n;
        hashMap2.put(2, (Long) l72.get(a22[0]));
        hashMap2.put(3, (Long) C1642t.f16824o.get(a22[1]));
        hashMap2.put(4, (Long) C1642t.f16825p.get(a22[2]));
        hashMap2.put(5, (Long) C1642t.f16826q.get(a22[3]));
        hashMap2.put(10, (Long) C1642t.f16827r.get(a22[4]));
        hashMap2.put(9, (Long) C1642t.f16828s.get(a22[5]));
        hashMap2.put(7, (Long) l72.get(a22[0]));
        this.f5884d = hashMap2;
        this.f5881a = 2000;
        this.f5885e = v2.p.f17145a;
        this.f5882b = true;
    }

    public static void a(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = (f) bVar.f5884d;
        AbstractC1664a.h(fVar.f5903c == null);
        HandlerThread handlerThread = fVar.f5902b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) bVar.f5883c;
        mediaCodec.setCallback(fVar, handler);
        fVar.f5903c = handler;
        AbstractC1664a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        AbstractC1664a.m();
        e eVar = (e) bVar.f5885e;
        if (!eVar.f5900f) {
            HandlerThread handlerThread2 = eVar.f5896b;
            handlerThread2.start();
            eVar.f5897c = new c(eVar, handlerThread2.getLooper(), 0);
            eVar.f5900f = true;
        }
        AbstractC1664a.c("startCodec");
        mediaCodec.start();
        AbstractC1664a.m();
        bVar.f5881a = 1;
    }

    public static String b(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // R1.k
    public ByteBuffer C(int i7) {
        return ((MediaCodec) this.f5883c).getInputBuffer(i7);
    }

    @Override // R1.k
    public void E(Surface surface) {
        ((MediaCodec) this.f5883c).setOutputSurface(surface);
    }

    @Override // R1.k
    public ByteBuffer I(int i7) {
        return ((MediaCodec) this.f5883c).getOutputBuffer(i7);
    }

    @Override // R1.k
    public void N(int i7, D1.c cVar, long j) {
        e eVar = (e) this.f5885e;
        RuntimeException runtimeException = (RuntimeException) eVar.f5898d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d b7 = e.b();
        b7.f5888a = i7;
        b7.f5889b = 0;
        b7.f5891d = j;
        b7.f5892e = 0;
        int i8 = cVar.f1681f;
        MediaCodec.CryptoInfo cryptoInfo = b7.f5890c;
        cryptoInfo.numSubSamples = i8;
        int[] iArr = cVar.f1679d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = cVar.f1680e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cVar.f1677b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = cVar.f1676a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = cVar.f1678c;
        if (v2.t.f17153a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f1682g, cVar.f1683h));
        }
        eVar.f5897c.obtainMessage(1, b7).sendToTarget();
    }

    @Override // R1.k
    public void P(int i7, int i8, long j, int i9) {
        e eVar = (e) this.f5885e;
        RuntimeException runtimeException = (RuntimeException) eVar.f5898d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d b7 = e.b();
        b7.f5888a = i7;
        b7.f5889b = i8;
        b7.f5891d = j;
        b7.f5892e = i9;
        c cVar = eVar.f5897c;
        int i10 = v2.t.f17153a;
        cVar.obtainMessage(0, b7).sendToTarget();
    }

    @Override // R1.k
    public void flush() {
        ((e) this.f5885e).a();
        ((MediaCodec) this.f5883c).flush();
        f fVar = (f) this.f5884d;
        synchronized (fVar.f5901a) {
            fVar.f5910k++;
            Handler handler = fVar.f5903c;
            int i7 = v2.t.f17153a;
            handler.post(new K0(fVar, 13));
        }
        ((MediaCodec) this.f5883c).start();
    }

    @Override // R1.k
    public MediaFormat k() {
        MediaFormat mediaFormat;
        f fVar = (f) this.f5884d;
        synchronized (fVar.f5901a) {
            try {
                mediaFormat = fVar.f5908h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // R1.k
    public void l(Bundle bundle) {
        ((MediaCodec) this.f5883c).setParameters(bundle);
    }

    @Override // R1.k
    public void n(int i7, long j) {
        ((MediaCodec) this.f5883c).releaseOutputBuffer(i7, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x001e, DONT_GENERATE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:25:0x0038, B:26:0x0034, B:28:0x003a, B:29:0x003c, B:30:0x003d, B:31:0x003f), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:25:0x0038, B:26:0x0034, B:28:0x003a, B:29:0x003c, B:30:0x003d, B:31:0x003f), top: B:3:0x0007 }] */
    @Override // R1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int o() {
        boolean z4;
        int i7;
        f fVar = (f) this.f5884d;
        synchronized (fVar.f5901a) {
            try {
                boolean z7 = true;
                if (fVar.f5910k <= 0 && !fVar.f5911l) {
                    z4 = false;
                    i7 = -1;
                    if (z4) {
                        IllegalStateException illegalStateException = fVar.f5912m;
                        if (illegalStateException != null) {
                            fVar.f5912m = null;
                            throw illegalStateException;
                        }
                        MediaCodec.CodecException codecException = fVar.j;
                        if (codecException != null) {
                            fVar.j = null;
                            throw codecException;
                        }
                        N1.e eVar = fVar.f5904d;
                        if (eVar.f4648c != 0) {
                            z7 = false;
                        }
                        if (!z7) {
                            i7 = eVar.e();
                        }
                    }
                }
                z4 = true;
                i7 = -1;
                if (z4) {
                }
            } finally {
            }
        }
        return i7;
    }

    @Override // R1.k
    public void r(C1772g c1772g, Handler handler) {
        ((MediaCodec) this.f5883c).setOnFrameRenderedListener(new a(this, c1772g, 0), handler);
    }

    @Override // R1.k
    public void release() {
        try {
            if (this.f5881a == 1) {
                e eVar = (e) this.f5885e;
                if (eVar.f5900f) {
                    eVar.a();
                    eVar.f5896b.quit();
                }
                eVar.f5900f = false;
                f fVar = (f) this.f5884d;
                synchronized (fVar.f5901a) {
                    fVar.f5911l = true;
                    fVar.f5902b.quit();
                    fVar.a();
                }
            }
            this.f5881a = 2;
        } finally {
            if (!this.f5882b) {
                ((MediaCodec) this.f5883c).release();
                this.f5882b = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x001e, DONT_GENERATE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:24:0x0033, B:26:0x0035, B:28:0x003b, B:29:0x0062, B:32:0x0058, B:34:0x0064, B:35:0x0066, B:36:0x0067, B:37:0x0069), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:24:0x0033, B:26:0x0035, B:28:0x003b, B:29:0x0062, B:32:0x0058, B:34:0x0064, B:35:0x0066, B:36:0x0067, B:37:0x0069), top: B:3:0x0007 }] */
    @Override // R1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int s(MediaCodec.BufferInfo bufferInfo) {
        boolean z4;
        int i7;
        f fVar = (f) this.f5884d;
        synchronized (fVar.f5901a) {
            try {
                boolean z7 = true;
                if (fVar.f5910k <= 0 && !fVar.f5911l) {
                    z4 = false;
                    i7 = -1;
                    if (z4) {
                        IllegalStateException illegalStateException = fVar.f5912m;
                        if (illegalStateException != null) {
                            fVar.f5912m = null;
                            throw illegalStateException;
                        }
                        MediaCodec.CodecException codecException = fVar.j;
                        if (codecException != null) {
                            fVar.j = null;
                            throw codecException;
                        }
                        N1.e eVar = fVar.f5905e;
                        if (eVar.f4648c != 0) {
                            z7 = false;
                        }
                        if (!z7) {
                            i7 = eVar.e();
                            if (i7 >= 0) {
                                AbstractC1664a.i(fVar.f5908h);
                                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f5906f.remove();
                                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                            } else if (i7 == -2) {
                                fVar.f5908h = (MediaFormat) fVar.f5907g.remove();
                            }
                        }
                    }
                }
                z4 = true;
                i7 = -1;
                if (z4) {
                }
            } finally {
            }
        }
        return i7;
    }

    @Override // R1.k
    public void w(int i7, boolean z4) {
        ((MediaCodec) this.f5883c).releaseOutputBuffer(i7, z4);
    }

    @Override // R1.k
    public void z(int i7) {
        ((MediaCodec) this.f5883c).setVideoScalingMode(i7);
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f5883c = mediaCodec;
        this.f5884d = new f(handlerThread);
        this.f5885e = new e(mediaCodec, handlerThread2);
        this.f5881a = 0;
    }
}
