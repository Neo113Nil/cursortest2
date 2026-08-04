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
import p146u2.C0960t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5885e;

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public b(Context context) {
        String strB0;
        TelephonyManager telephonyManager;
        this.f5883c = context == null ? null : context.getApplicationContext();
        int i7 = p151v2.t.f17159a;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            strB0 = D.b0(Locale.getDefault().getCountry());
        } else {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (TextUtils.isEmpty(networkCountryIso)) {
                strB0 = D.b0(Locale.getDefault().getCountry());
            } else {
                strB0 = D.b0(networkCountryIso);
            }
        }
        int[] iArrA = C0960t.a(strB0);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        L l7 = C0960t.f16829n;
        map.put(2, (Long) l7.get(iArrA[0]));
        map.put(3, (Long) C0960t.f16830o.get(iArrA[1]));
        map.put(4, (Long) C0960t.f16831p.get(iArrA[2]));
        map.put(5, (Long) C0960t.f16832q.get(iArrA[3]));
        map.put(10, (Long) C0960t.f16833r.get(iArrA[4]));
        map.put(9, (Long) C0960t.f16834s.get(iArrA[5]));
        map.put(7, (Long) l7.get(iArrA[0]));
        this.f5884d = map;
        this.f5881a = 2000;
        this.f5885e = p151v2.p.f17151a;
        this.f5882b = true;
    }

    public static void a(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = (f) bVar.f5884d;
        p151v2.a.h(fVar.f5903c == null);
        HandlerThread handlerThread = fVar.f5902b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) bVar.f5883c;
        mediaCodec.setCallback(fVar, handler);
        fVar.f5903c = handler;
        p151v2.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        p151v2.a.m();
        e eVar = (e) bVar.f5885e;
        if (!eVar.f5900f) {
            HandlerThread handlerThread2 = eVar.f5896b;
            handlerThread2.start();
            eVar.f5897c = new c(eVar, handlerThread2.getLooper(), 0);
            eVar.f5900f = true;
        }
        p151v2.a.c("startCodec");
        mediaCodec.start();
        p151v2.a.m();
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
        d dVarB = e.b();
        dVarB.f5888a = i7;
        dVarB.f5889b = 0;
        dVarB.f5891d = j;
        dVarB.f5892e = 0;
        int i8 = cVar.f1681f;
        MediaCodec.CryptoInfo cryptoInfo = dVarB.f5890c;
        cryptoInfo.numSubSamples = i8;
        int[] iArr = cVar.f1679d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cVar.f1680e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cVar.f1677b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = cVar.f1676a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = cVar.f1678c;
        if (p151v2.t.f17159a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f1682g, cVar.f1683h));
        }
        eVar.f5897c.obtainMessage(1, dVarB).sendToTarget();
    }

    @Override // R1.k
    public void P(int i7, int i8, long j, int i9) {
        e eVar = (e) this.f5885e;
        RuntimeException runtimeException = (RuntimeException) eVar.f5898d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d dVarB = e.b();
        dVarB.f5888a = i7;
        dVarB.f5889b = i8;
        dVarB.f5891d = j;
        dVarB.f5892e = i9;
        c cVar = eVar.f5897c;
        int i10 = p151v2.t.f17159a;
        cVar.obtainMessage(0, dVarB).sendToTarget();
    }

    @Override // R1.k
    public void flush() {
        ((e) this.f5885e).a();
        ((MediaCodec) this.f5883c).flush();
        f fVar = (f) this.f5884d;
        synchronized (fVar.f5901a) {
            fVar.f5910k++;
            Handler handler = fVar.f5903c;
            int i7 = p151v2.t.f17159a;
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

    @Override // R1.k
    public int o() {
        int iE;
        f fVar = (f) this.f5884d;
        synchronized (fVar.f5901a) {
            try {
                boolean z4 = true;
                iE = -1;
                if (!(fVar.f5910k > 0 || fVar.f5911l)) {
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
                        z4 = false;
                    }
                    if (!z4) {
                        iE = eVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iE;
    }

    @Override // R1.k
    public void r(p156w2.g gVar, Handler handler) {
        ((MediaCodec) this.f5883c).setOnFrameRenderedListener(new a(this, gVar, 0), handler);
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
            if (this.f5882b) {
                return;
            }
            ((MediaCodec) this.f5883c).release();
            this.f5882b = true;
        } catch (Throwable th) {
            if (!this.f5882b) {
                ((MediaCodec) this.f5883c).release();
                this.f5882b = true;
            }
            throw th;
        }
    }

    @Override // R1.k
    public int s(MediaCodec.BufferInfo bufferInfo) {
        int iE;
        f fVar = (f) this.f5884d;
        synchronized (fVar.f5901a) {
            try {
                boolean z4 = true;
                iE = -1;
                if (!(fVar.f5910k > 0 || fVar.f5911l)) {
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
                        z4 = false;
                    }
                    if (!z4) {
                        iE = eVar.e();
                        if (iE >= 0) {
                            p151v2.a.i(fVar.f5908h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f5906f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (iE == -2) {
                            fVar.f5908h = (MediaFormat) fVar.f5907g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iE;
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
