package C1;

import A1.AbstractC0023i;
import A1.C0042s;
import A1.G0;
import A1.O;
import A1.X;
import A1.w0;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import android.content.Context;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import io.sentry.TransactionOptions;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import v2.AbstractC1664a;
import w1.C1719l1;
import w1.C1726n0;
import w1.P2;
import w1.V0;

/* loaded from: classes.dex */
public final class H extends R1.p implements v2.h {

    /* renamed from: V0, reason: collision with root package name */
    public final Context f1395V0;
    public final P2 W0;

    /* renamed from: X0, reason: collision with root package name */
    public final E f1396X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f1397Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f1398Z0;

    /* renamed from: a1, reason: collision with root package name */
    public X f1399a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f1400b1;
    public boolean c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f1401d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f1402e1;

    /* renamed from: f1, reason: collision with root package name */
    public O f1403f1;

    public H(Context context, R1.j jVar, Handler handler, A1.K k7, E e7) {
        super(1, jVar, 44100.0f);
        this.f1395V0 = context.getApplicationContext();
        this.f1396X0 = e7;
        this.W0 = new P2(4, handler, k7, false);
        e7.f1384r = new C1719l1(this);
    }

    public static AbstractC0167z r0(R1.q qVar, X x4, boolean z4, E e7) {
        String str = x4.f283C;
        if (str == null) {
            C0165x c0165x = AbstractC0167z.f2083b;
            return E3.L.f2000e;
        }
        if (e7.f(x4) != 0) {
            List e8 = R1.w.e("audio/raw", false, false);
            R1.m mVar = e8.isEmpty() ? null : (R1.m) e8.get(0);
            if (mVar != null) {
                return AbstractC0167z.I(mVar);
            }
        }
        qVar.getClass();
        List e9 = R1.w.e(str, z4, false);
        String b7 = R1.w.b(x4);
        if (b7 == null) {
            return AbstractC0167z.E(e9);
        }
        List e10 = R1.w.e(b7, z4, false);
        C0165x c0165x2 = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        c0164w.c(e9);
        c0164w.c(e10);
        return c0164w.d();
    }

    @Override // R1.p
    public final D1.i C(R1.m mVar, X x4, X x7) {
        D1.i b7 = mVar.b(x4, x7);
        int q02 = q0(mVar, x7);
        int i7 = this.f1397Y0;
        int i8 = b7.f1706e;
        if (q02 > i7) {
            i8 |= 64;
        }
        int i9 = i8;
        return new D1.i(mVar.f5925a, x4, x7, i9 != 0 ? 0 : b7.f1705d, i9);
    }

    @Override // R1.p
    public final float M(float f7, X[] xArr) {
        int i7 = -1;
        for (X x4 : xArr) {
            int i8 = x4.f297Q;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return f7 * i7;
    }

    @Override // R1.p
    public final ArrayList N(R1.q qVar, X x4, boolean z4) {
        AbstractC0167z r02 = r0(qVar, x4, z4, this.f1396X0);
        Pattern pattern = R1.w.f6011a;
        ArrayList arrayList = new ArrayList(r02);
        Collections.sort(arrayList, new E4.M(new C0042s(x4, 27), 3));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if ("AXON 7 mini".equals(r2) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    @Override // R1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final R1.i P(R1.m mVar, X x4, MediaCrypto mediaCrypto, float f7) {
        boolean z4;
        MediaFormat mediaFormat;
        X[] xArr = this.f382y;
        xArr.getClass();
        int q02 = q0(mVar, x4);
        if (xArr.length != 1) {
            for (X x7 : xArr) {
                if (mVar.b(x4, x7).f1705d != 0) {
                    q02 = Math.max(q02, q0(mVar, x7));
                }
            }
        }
        this.f1397Y0 = q02;
        int i7 = v2.t.f17153a;
        if (i7 < 24 && "OMX.SEC.aac.dec".equals(mVar.f5925a) && "samsung".equals(v2.t.f17155c)) {
            String str = v2.t.f17154b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z4 = true;
                this.f1398Z0 = z4;
                int i8 = this.f1397Y0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", mVar.f5927c);
                mediaFormat.setInteger("channel-count", x4.f296P);
                int i9 = x4.f297Q;
                mediaFormat.setInteger("sample-rate", i9);
                AbstractC1664a.E(mediaFormat, x4.f285E);
                AbstractC1664a.w(mediaFormat, "max-input-size", i8);
                if (i7 >= 23) {
                    mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
                    if (f7 != -1.0f) {
                        if (i7 == 23) {
                            String str2 = v2.t.f17156d;
                            if (!"ZTE B2017G".equals(str2)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f7);
                    }
                }
                String str3 = x4.f283C;
                if (i7 <= 28 && "audio/ac4".equals(str3)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i7 >= 24) {
                    Format$Builder format$Builder = new Format$Builder();
                    format$Builder.f10537k = "audio/raw";
                    format$Builder.f10550x = x4.f296P;
                    format$Builder.f10551y = i9;
                    format$Builder.f10552z = 4;
                    if (this.f1396X0.f(new X(format$Builder)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i7 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.f1399a1 = ("audio/raw".equals(mVar.f5926b) || "audio/raw".equals(str3)) ? null : x4;
                return new R1.i(mVar, mediaFormat, x4, null, mediaCrypto);
            }
        }
        z4 = false;
        this.f1398Z0 = z4;
        int i82 = this.f1397Y0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f5927c);
        mediaFormat.setInteger("channel-count", x4.f296P);
        int i92 = x4.f297Q;
        mediaFormat.setInteger("sample-rate", i92);
        AbstractC1664a.E(mediaFormat, x4.f285E);
        AbstractC1664a.w(mediaFormat, "max-input-size", i82);
        if (i7 >= 23) {
        }
        String str32 = x4.f283C;
        if (i7 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i7 >= 24) {
        }
        if (i7 >= 32) {
        }
        this.f1399a1 = ("audio/raw".equals(mVar.f5926b) || "audio/raw".equals(str32)) ? null : x4;
        return new R1.i(mVar, mediaFormat, x4, null, mediaCrypto);
    }

    @Override // R1.p
    public final void U(Exception exc) {
        AbstractC1664a.l("MediaCodecAudioRenderer", "Audio codec error", exc);
        P2 p22 = this.W0;
        Handler handler = (Handler) p22.f17508b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p22, exc, 2));
        }
    }

    @Override // R1.p
    public final void V(long j, long j3, String str) {
        P2 p22 = this.W0;
        Handler handler = (Handler) p22.f17508b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p22, str, j, j3));
        }
    }

    @Override // R1.p
    public final void W(String str) {
        P2 p22 = this.W0;
        Handler handler = (Handler) p22.f17508b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p22, str, 0));
        }
    }

    @Override // R1.p
    public final D1.i X(V0 v02) {
        D1.i X6 = super.X(v02);
        X x4 = (X) v02.f17563c;
        P2 p22 = this.W0;
        Handler handler = (Handler) p22.f17508b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p22, x4, X6));
        }
        return X6;
    }

    @Override // R1.p
    public final void Y(X x4, MediaFormat mediaFormat) {
        int i7;
        X x7 = this.f1399a1;
        int[] iArr = null;
        if (x7 != null) {
            x4 = x7;
        } else if (this.f5980Z != null) {
            int v6 = "audio/raw".equals(x4.f283C) ? x4.f298R : (v2.t.f17153a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? v2.t.v(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10537k = "audio/raw";
            format$Builder.f10552z = v6;
            format$Builder.f10524A = x4.f299S;
            format$Builder.f10525B = x4.f300T;
            format$Builder.f10550x = mediaFormat.getInteger("channel-count");
            format$Builder.f10551y = mediaFormat.getInteger("sample-rate");
            X x8 = new X(format$Builder);
            if (this.f1398Z0 && x8.f296P == 6 && (i7 = x4.f296P) < 6) {
                iArr = new int[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr[i8] = i8;
                }
            }
            x4 = x8;
        }
        try {
            this.f1396X0.b(x4, iArr);
        } catch (o e7) {
            throw f(e7, e7.f1508a, false, 5001);
        }
    }

    @Override // v2.h
    public final long a() {
        if (this.f380f == 2) {
            s0();
        }
        return this.f1400b1;
    }

    @Override // R1.p
    public final void a0() {
        this.f1396X0.f1346G = true;
    }

    @Override // v2.h
    public final void b(w0 w0Var) {
        E e7 = this.f1396X0;
        e7.getClass();
        w0 w0Var2 = new w0(v2.t.i(w0Var.f606a, 0.1f, 8.0f), v2.t.i(w0Var.f607b, 0.1f, 8.0f));
        if (!e7.f1377k || v2.t.f17153a < 23) {
            e7.r(w0Var2, e7.g().f1335b);
        } else {
            e7.s(w0Var2);
        }
    }

    @Override // R1.p
    public final void b0(D1.h hVar) {
        if (!this.c1 || hVar.f(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(hVar.f1699f - this.f1400b1) > 500000) {
            this.f1400b1 = hVar.f1699f;
        }
        this.c1 = false;
    }

    @Override // A1.AbstractC0023i, A1.C0
    public final void c(int i7, Object obj) {
        E e7 = this.f1396X0;
        if (i7 == 2) {
            float floatValue = ((Float) obj).floatValue();
            if (e7.f1349J != floatValue) {
                e7.f1349J = floatValue;
                if (e7.m()) {
                    if (v2.t.f17153a >= 21) {
                        e7.f1387u.setVolume(e7.f1349J);
                        return;
                    }
                    AudioTrack audioTrack = e7.f1387u;
                    float f7 = e7.f1349J;
                    audioTrack.setStereoVolume(f7, f7);
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            C0101g c0101g = (C0101g) obj;
            if (e7.f1388v.equals(c0101g)) {
                return;
            }
            e7.f1388v = c0101g;
            if (e7.f1364Y) {
                return;
            }
            e7.d();
            return;
        }
        if (i7 == 6) {
            v vVar = (v) obj;
            if (e7.f1363X.equals(vVar)) {
                return;
            }
            vVar.getClass();
            if (e7.f1387u != null) {
                e7.f1363X.getClass();
            }
            e7.f1363X = vVar;
            return;
        }
        switch (i7) {
            case 9:
                e7.r(e7.g().f1334a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                if (e7.f1362W != intValue) {
                    e7.f1362W = intValue;
                    e7.f1361V = intValue != 0;
                    e7.d();
                    break;
                }
                break;
            case 11:
                this.f1403f1 = (O) obj;
                break;
        }
    }

    @Override // v2.h
    public final w0 d() {
        E e7 = this.f1396X0;
        return e7.f1377k ? e7.f1391y : e7.g().f1334a;
    }

    @Override // R1.p
    public final boolean d0(long j, long j3, R1.k kVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, X x4) {
        byteBuffer.getClass();
        if (this.f1399a1 != null && (i8 & 2) != 0) {
            kVar.getClass();
            kVar.w(i7, false);
            return true;
        }
        E e7 = this.f1396X0;
        if (z4) {
            if (kVar != null) {
                kVar.w(i7, false);
            }
            this.f5968Q0.f1690f += i9;
            e7.f1346G = true;
            return true;
        }
        try {
            if (!e7.j(j7, byteBuffer, i9)) {
                return false;
            }
            if (kVar != null) {
                kVar.w(i7, false);
            }
            this.f5968Q0.f1689e += i9;
            return true;
        } catch (p e8) {
            throw f(e8, e8.f1511c, e8.f1510b, 5001);
        } catch (r e9) {
            throw f(e9, x4, e9.f1513b, 5002);
        }
    }

    @Override // R1.p
    public final void g0() {
        try {
            E e7 = this.f1396X0;
            if (!e7.f1358S && e7.m() && e7.c()) {
                e7.o();
                e7.f1358S = true;
            }
        } catch (r e8) {
            throw f(e8, e8.f1514c, e8.f1513b, 5002);
        }
    }

    @Override // A1.AbstractC0023i
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // R1.p, A1.AbstractC0023i
    public final boolean l() {
        if (this.f5960M0) {
            E e7 = this.f1396X0;
            if (!e7.m() || (e7.f1358S && !e7.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // R1.p
    public final boolean l0(X x4) {
        return this.f1396X0.f(x4) != 0;
    }

    @Override // R1.p, A1.AbstractC0023i
    public final boolean m() {
        return this.f1396X0.k() || super.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : (R1.m) r4.get(0)) != null) goto L30;
     */
    @Override // R1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m0(R1.q qVar, X x4) {
        boolean z4;
        if (!v2.i.h(x4.f283C)) {
            return AbstractC0023i.e(0, 0, 0);
        }
        int i7 = v2.t.f17153a >= 21 ? 32 : 0;
        boolean z7 = true;
        int i8 = x4.f302V;
        boolean z8 = i8 != 0;
        boolean z9 = i8 == 0 || i8 == 2;
        int i9 = 8;
        E e7 = this.f1396X0;
        if (z9 && e7.f(x4) != 0) {
            if (z8) {
                List e8 = R1.w.e("audio/raw", false, false);
            }
            return AbstractC0023i.e(4, 8, i7);
        }
        if ("audio/raw".equals(x4.f283C) && e7.f(x4) == 0) {
            return AbstractC0023i.e(1, 0, 0);
        }
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "audio/raw";
        format$Builder.f10550x = x4.f296P;
        format$Builder.f10551y = x4.f297Q;
        format$Builder.f10552z = 2;
        if (e7.f(new X(format$Builder)) == 0) {
            return AbstractC0023i.e(1, 0, 0);
        }
        AbstractC0167z r02 = r0(qVar, x4, false, e7);
        if (r02.isEmpty()) {
            return AbstractC0023i.e(1, 0, 0);
        }
        if (!z9) {
            return AbstractC0023i.e(2, 0, 0);
        }
        R1.m mVar = (R1.m) r02.get(0);
        boolean c3 = mVar.c(x4);
        if (!c3) {
            for (int i10 = 1; i10 < r02.size(); i10++) {
                R1.m mVar2 = (R1.m) r02.get(i10);
                if (mVar2.c(x4)) {
                    z4 = false;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z4 = true;
        z7 = c3;
        int i11 = z7 ? 4 : 3;
        if (z7 && mVar.d(x4)) {
            i9 = 16;
        }
        return i11 | i9 | i7 | (mVar.f5931g ? 64 : 0) | (z4 ? 128 : 0);
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        P2 p22 = this.W0;
        this.f1402e1 = true;
        try {
            this.f1396X0.d();
            try {
                this.f5967Q = null;
                this.f5970R0 = -9223372036854775807L;
                this.f5972S0 = -9223372036854775807L;
                this.f5974T0 = 0;
                J();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.f5967Q = null;
                this.f5970R0 = -9223372036854775807L;
                this.f5972S0 = -9223372036854775807L;
                this.f5974T0 = 0;
                J();
                throw th;
            } finally {
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final void o(boolean z4, boolean z7) {
        D1.e eVar = new D1.e();
        this.f5968Q0 = eVar;
        P2 p22 = this.W0;
        Handler handler = (Handler) p22.f17508b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p22, eVar, 4));
        }
        G0 g02 = this.f377c;
        g02.getClass();
        boolean z8 = g02.f97a;
        E e7 = this.f1396X0;
        if (z8) {
            e7.getClass();
            AbstractC1664a.h(v2.t.f17153a >= 21);
            AbstractC1664a.h(e7.f1361V);
            if (!e7.f1364Y) {
                e7.f1364Y = true;
                e7.d();
            }
        } else if (e7.f1364Y) {
            e7.f1364Y = false;
            e7.d();
        }
        B1.p pVar = this.f379e;
        pVar.getClass();
        e7.f1383q = pVar;
    }

    @Override // R1.p, A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        super.p(j, z4);
        this.f1396X0.d();
        this.f1400b1 = j;
        this.c1 = true;
        this.f1401d1 = true;
    }

    @Override // A1.AbstractC0023i
    public final void q() {
        E e7 = this.f1396X0;
        try {
            try {
                E();
                f0();
                C1719l1 c1719l1 = this.f5973T;
                if (c1719l1 != null) {
                    c1719l1.F(null);
                }
                this.f5973T = null;
            } catch (Throwable th) {
                C1719l1 c1719l12 = this.f5973T;
                if (c1719l12 != null) {
                    c1719l12.F(null);
                }
                this.f5973T = null;
                throw th;
            }
        } finally {
            if (this.f1402e1) {
                this.f1402e1 = false;
                e7.q();
            }
        }
    }

    public final int q0(R1.m mVar, X x4) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(mVar.f5925a) || (i7 = v2.t.f17153a) >= 24 || (i7 == 23 && v2.t.D(this.f1395V0))) {
            return x4.f284D;
        }
        return -1;
    }

    @Override // A1.AbstractC0023i
    public final void r() {
        E e7 = this.f1396X0;
        e7.f1360U = true;
        if (e7.m()) {
            t tVar = e7.f1376i.f1537f;
            tVar.getClass();
            tVar.a();
            e7.f1387u.play();
        }
    }

    @Override // A1.AbstractC0023i
    public final void s() {
        s0();
        E e7 = this.f1396X0;
        e7.f1360U = false;
        if (e7.m()) {
            u uVar = e7.f1376i;
            uVar.f1542l = 0L;
            uVar.f1553w = 0;
            uVar.f1552v = 0;
            uVar.f1543m = 0L;
            uVar.f1528C = 0L;
            uVar.f1531F = 0L;
            uVar.f1541k = false;
            if (uVar.f1554x == -9223372036854775807L) {
                t tVar = uVar.f1537f;
                tVar.getClass();
                tVar.a();
                e7.f1387u.pause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0331 A[ADDED_TO_REGION, EDGE_INSN: B:117:0x0331->B:94:0x0331 BREAK  A[LOOP:1: B:88:0x0314->B:92:0x0328], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021e A[Catch: Exception -> 0x0234, TRY_LEAVE, TryCatch #0 {Exception -> 0x0234, blocks: (B:55:0x01f5, B:57:0x021e), top: B:54:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0() {
        long j;
        long j3;
        boolean z4;
        E e7;
        boolean z7;
        long a2;
        long j7;
        E e8;
        ArrayDeque arrayDeque;
        boolean equals;
        long t7;
        long j8;
        boolean z8;
        Method method;
        long max;
        boolean z9;
        boolean l7 = l();
        E e9 = this.f1396X0;
        if (!e9.m() || e9.f1347H) {
            j = Long.MIN_VALUE;
            j3 = Long.MIN_VALUE;
        } else {
            u uVar = e9.f1376i;
            AudioTrack audioTrack = uVar.f1534c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            E e10 = (E) uVar.f1532a.f17932b;
            if (playState == 3) {
                long a4 = (uVar.a() * 1000000) / uVar.f1538g;
                if (a4 != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - uVar.f1543m >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                        int i7 = uVar.f1552v;
                        long[] jArr = uVar.f1533b;
                        jArr[i7] = a4 - nanoTime;
                        uVar.f1552v = (i7 + 1) % 10;
                        int i8 = uVar.f1553w;
                        if (i8 < 10) {
                            uVar.f1553w = i8 + 1;
                        }
                        uVar.f1543m = nanoTime;
                        uVar.f1542l = 0L;
                        int i9 = 0;
                        while (true) {
                            int i10 = uVar.f1553w;
                            if (i9 >= i10) {
                                break;
                            }
                            uVar.f1542l = (jArr[i9] / i10) + uVar.f1542l;
                            i9++;
                            l7 = l7;
                        }
                    }
                    z4 = l7;
                    if (!uVar.f1539h) {
                        t tVar = uVar.f1537f;
                        tVar.getClass();
                        s sVar = tVar.f1520a;
                        if (sVar != null && nanoTime - tVar.f1524e >= tVar.f1523d) {
                            tVar.f1524e = nanoTime;
                            AudioTrack audioTrack2 = sVar.f1515a;
                            AudioTimestamp audioTimestamp = sVar.f1516b;
                            boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j9 = audioTimestamp.framePosition;
                                z9 = timestamp;
                                if (sVar.f1518d > j9) {
                                    sVar.f1517c++;
                                }
                                sVar.f1518d = j9;
                                sVar.f1519e = j9 + (sVar.f1517c << 32);
                            } else {
                                z9 = timestamp;
                            }
                            int i11 = tVar.f1521b;
                            if (i11 != 0) {
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 != 3) {
                                            if (i11 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (z9) {
                                            tVar.a();
                                        }
                                    } else if (!z9) {
                                        tVar.a();
                                    }
                                } else if (!z9) {
                                    tVar.a();
                                } else if (sVar.f1519e > tVar.f1525f) {
                                    tVar.b(2);
                                }
                            } else if (z9) {
                                if (audioTimestamp.nanoTime / 1000 >= tVar.f1522c) {
                                    tVar.f1525f = sVar.f1519e;
                                    tVar.b(1);
                                }
                            } else if (nanoTime - tVar.f1522c > 500000) {
                                tVar.b(3);
                            }
                            z8 = z9;
                            if (z8) {
                                long j10 = sVar != null ? sVar.f1516b.nanoTime / 1000 : -9223372036854775807L;
                                long j11 = sVar != null ? sVar.f1519e : -1L;
                                if (Math.abs(j10 - nanoTime) > 5000000) {
                                    StringBuilder j12 = e1.k.j("Spurious audio timestamp (system clock mismatch): ", ", ", j11);
                                    j12.append(j10);
                                    j12.append(", ");
                                    j12.append(nanoTime);
                                    j12.append(", ");
                                    j12.append(a4);
                                    j12.append(", ");
                                    j12.append(e10.h());
                                    j12.append(", ");
                                    j12.append(e10.i());
                                    Log.w("DefaultAudioSink", j12.toString());
                                    tVar.b(4);
                                } else {
                                    e7 = e9;
                                    if (Math.abs(((j11 * 1000000) / uVar.f1538g) - a4) > 5000000) {
                                        StringBuilder j13 = e1.k.j("Spurious audio timestamp (frame position mismatch): ", ", ", j11);
                                        j13.append(j10);
                                        j13.append(", ");
                                        j13.append(nanoTime);
                                        j13.append(", ");
                                        j13.append(a4);
                                        j13.append(", ");
                                        j13.append(e10.h());
                                        j13.append(", ");
                                        j13.append(e10.i());
                                        Log.w("DefaultAudioSink", j13.toString());
                                        tVar.b(4);
                                    } else if (tVar.f1521b == 4) {
                                        tVar.a();
                                    }
                                    if (uVar.f1547q && (method = uVar.f1544n) != null && nanoTime - uVar.f1548r >= 500000) {
                                        try {
                                            AudioTrack audioTrack3 = uVar.f1534c;
                                            audioTrack3.getClass();
                                            Integer num = (Integer) method.invoke(audioTrack3, null);
                                            int i12 = v2.t.f17153a;
                                            long intValue = (num.intValue() * 1000) - uVar.f1540i;
                                            uVar.f1545o = intValue;
                                            max = Math.max(intValue, 0L);
                                            uVar.f1545o = max;
                                            if (max > 5000000) {
                                                Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                                uVar.f1545o = 0L;
                                            }
                                        } catch (Exception unused) {
                                            uVar.f1544n = null;
                                        }
                                        uVar.f1548r = nanoTime;
                                    }
                                    long nanoTime2 = System.nanoTime() / 1000;
                                    t tVar2 = uVar.f1537f;
                                    tVar2.getClass();
                                    z7 = tVar2.f1521b == 2;
                                    if (z7) {
                                        s sVar2 = tVar2.f1520a;
                                        a2 = v2.t.t(nanoTime2 - (sVar2 != null ? sVar2.f1516b.nanoTime / 1000 : -9223372036854775807L), uVar.j) + (((sVar2 != null ? sVar2.f1519e : -1L) * 1000000) / uVar.f1538g);
                                    } else {
                                        a2 = uVar.f1553w == 0 ? (uVar.a() * 1000000) / uVar.f1538g : uVar.f1542l + nanoTime2;
                                        if (!z4) {
                                            a2 = Math.max(0L, a2 - uVar.f1545o);
                                        }
                                    }
                                    if (uVar.f1529D != z7) {
                                        uVar.f1531F = uVar.f1528C;
                                        uVar.f1530E = uVar.f1527B;
                                    }
                                    j7 = nanoTime2 - uVar.f1531F;
                                    if (j7 < 1000000) {
                                        long t8 = v2.t.t(j7, uVar.j) + uVar.f1530E;
                                        long j14 = (j7 * 1000) / 1000000;
                                        a2 = (((1000 - j14) * t8) + (a2 * j14)) / 1000;
                                    }
                                    if (!uVar.f1541k) {
                                        long j15 = uVar.f1527B;
                                        if (a2 > j15) {
                                            uVar.f1541k = true;
                                            long currentTimeMillis = System.currentTimeMillis() - v2.t.N(v2.t.x(v2.t.N(a2 - j15), uVar.j));
                                            C1719l1 c1719l1 = e10.f1384r;
                                            if (c1719l1 != null) {
                                                P2 p22 = ((H) c1719l1.f17771a).W0;
                                                Handler handler = (Handler) p22.f17508b;
                                                if (handler != null) {
                                                    handler.post(new RunnableC0107m(p22, currentTimeMillis));
                                                }
                                            }
                                        }
                                    }
                                    uVar.f1528C = nanoTime2;
                                    uVar.f1527B = a2;
                                    uVar.f1529D = z7;
                                    e8 = e7;
                                    long min = Math.min(a2, (e8.i() * 1000000) / e8.f1386t.f1329e);
                                    while (true) {
                                        arrayDeque = e8.j;
                                        if (!arrayDeque.isEmpty() || min < ((B) arrayDeque.getFirst()).f1337d) {
                                            break;
                                        } else {
                                            e8.f1390x = (B) arrayDeque.remove();
                                        }
                                    }
                                    B b7 = e8.f1390x;
                                    long j16 = min - b7.f1337d;
                                    equals = b7.f1334a.equals(w0.f605d);
                                    C1726n0 c1726n0 = e8.f1368b;
                                    if (equals) {
                                        t7 = e8.f1390x.f1336c + j16;
                                    } else if (arrayDeque.isEmpty()) {
                                        M m7 = (M) c1726n0.f17807d;
                                        if (m7.f1455o >= 1024) {
                                            long j17 = m7.f1454n;
                                            m7.j.getClass();
                                            long j18 = j17 - ((r5.f1431k * r5.f1423b) * 2);
                                            int i13 = m7.f1449h.f1498a;
                                            int i14 = m7.f1448g.f1498a;
                                            j8 = i13 == i14 ? v2.t.K(j16, j18, m7.f1455o) : v2.t.K(j16, j18 * i13, m7.f1455o * i14);
                                        } else {
                                            j8 = (long) (m7.f1444c * j16);
                                        }
                                        t7 = j8 + e8.f1390x.f1336c;
                                    } else {
                                        B b8 = (B) arrayDeque.getFirst();
                                        t7 = b8.f1336c - v2.t.t(b8.f1337d - min, e8.f1390x.f1334a.f606a);
                                    }
                                    j3 = ((((K) c1726n0.f17806c).f1421t * 1000000) / e8.f1386t.f1329e) + t7;
                                    j = Long.MIN_VALUE;
                                }
                            }
                            e7 = e9;
                            if (uVar.f1547q) {
                                AudioTrack audioTrack32 = uVar.f1534c;
                                audioTrack32.getClass();
                                Integer num2 = (Integer) method.invoke(audioTrack32, null);
                                int i122 = v2.t.f17153a;
                                long intValue2 = (num2.intValue() * 1000) - uVar.f1540i;
                                uVar.f1545o = intValue2;
                                max = Math.max(intValue2, 0L);
                                uVar.f1545o = max;
                                if (max > 5000000) {
                                }
                                uVar.f1548r = nanoTime;
                            }
                            long nanoTime22 = System.nanoTime() / 1000;
                            t tVar22 = uVar.f1537f;
                            tVar22.getClass();
                            if (tVar22.f1521b == 2) {
                            }
                            if (z7) {
                            }
                            if (uVar.f1529D != z7) {
                            }
                            j7 = nanoTime22 - uVar.f1531F;
                            if (j7 < 1000000) {
                            }
                            if (!uVar.f1541k) {
                            }
                            uVar.f1528C = nanoTime22;
                            uVar.f1527B = a2;
                            uVar.f1529D = z7;
                            e8 = e7;
                            long min2 = Math.min(a2, (e8.i() * 1000000) / e8.f1386t.f1329e);
                            while (true) {
                                arrayDeque = e8.j;
                                if (!arrayDeque.isEmpty()) {
                                    break;
                                } else {
                                    break;
                                }
                                e8.f1390x = (B) arrayDeque.remove();
                            }
                            B b72 = e8.f1390x;
                            long j162 = min2 - b72.f1337d;
                            equals = b72.f1334a.equals(w0.f605d);
                            C1726n0 c1726n02 = e8.f1368b;
                            if (equals) {
                            }
                            j3 = ((((K) c1726n02.f17806c).f1421t * 1000000) / e8.f1386t.f1329e) + t7;
                            j = Long.MIN_VALUE;
                        }
                        z8 = false;
                        if (z8) {
                        }
                        e7 = e9;
                        if (uVar.f1547q) {
                        }
                        long nanoTime222 = System.nanoTime() / 1000;
                        t tVar222 = uVar.f1537f;
                        tVar222.getClass();
                        if (tVar222.f1521b == 2) {
                        }
                        if (z7) {
                        }
                        if (uVar.f1529D != z7) {
                        }
                        j7 = nanoTime222 - uVar.f1531F;
                        if (j7 < 1000000) {
                        }
                        if (!uVar.f1541k) {
                        }
                        uVar.f1528C = nanoTime222;
                        uVar.f1527B = a2;
                        uVar.f1529D = z7;
                        e8 = e7;
                        long min22 = Math.min(a2, (e8.i() * 1000000) / e8.f1386t.f1329e);
                        while (true) {
                            arrayDeque = e8.j;
                            if (!arrayDeque.isEmpty()) {
                            }
                            e8.f1390x = (B) arrayDeque.remove();
                        }
                        B b722 = e8.f1390x;
                        long j1622 = min22 - b722.f1337d;
                        equals = b722.f1334a.equals(w0.f605d);
                        C1726n0 c1726n022 = e8.f1368b;
                        if (equals) {
                        }
                        j3 = ((((K) c1726n022.f17806c).f1421t * 1000000) / e8.f1386t.f1329e) + t7;
                        j = Long.MIN_VALUE;
                    }
                    e7 = e9;
                    long nanoTime2222 = System.nanoTime() / 1000;
                    t tVar2222 = uVar.f1537f;
                    tVar2222.getClass();
                    if (tVar2222.f1521b == 2) {
                    }
                    if (z7) {
                    }
                    if (uVar.f1529D != z7) {
                    }
                    j7 = nanoTime2222 - uVar.f1531F;
                    if (j7 < 1000000) {
                    }
                    if (!uVar.f1541k) {
                    }
                    uVar.f1528C = nanoTime2222;
                    uVar.f1527B = a2;
                    uVar.f1529D = z7;
                    e8 = e7;
                    long min222 = Math.min(a2, (e8.i() * 1000000) / e8.f1386t.f1329e);
                    while (true) {
                        arrayDeque = e8.j;
                        if (!arrayDeque.isEmpty()) {
                        }
                        e8.f1390x = (B) arrayDeque.remove();
                    }
                    B b7222 = e8.f1390x;
                    long j16222 = min222 - b7222.f1337d;
                    equals = b7222.f1334a.equals(w0.f605d);
                    C1726n0 c1726n0222 = e8.f1368b;
                    if (equals) {
                    }
                    j3 = ((((K) c1726n0222.f17806c).f1421t * 1000000) / e8.f1386t.f1329e) + t7;
                    j = Long.MIN_VALUE;
                }
            }
            z4 = l7;
            e7 = e9;
            long nanoTime22222 = System.nanoTime() / 1000;
            t tVar22222 = uVar.f1537f;
            tVar22222.getClass();
            if (tVar22222.f1521b == 2) {
            }
            if (z7) {
            }
            if (uVar.f1529D != z7) {
            }
            j7 = nanoTime22222 - uVar.f1531F;
            if (j7 < 1000000) {
            }
            if (!uVar.f1541k) {
            }
            uVar.f1528C = nanoTime22222;
            uVar.f1527B = a2;
            uVar.f1529D = z7;
            e8 = e7;
            long min2222 = Math.min(a2, (e8.i() * 1000000) / e8.f1386t.f1329e);
            while (true) {
                arrayDeque = e8.j;
                if (!arrayDeque.isEmpty()) {
                }
                e8.f1390x = (B) arrayDeque.remove();
            }
            B b72222 = e8.f1390x;
            long j162222 = min2222 - b72222.f1337d;
            equals = b72222.f1334a.equals(w0.f605d);
            C1726n0 c1726n02222 = e8.f1368b;
            if (equals) {
            }
            j3 = ((((K) c1726n02222.f17806c).f1421t * 1000000) / e8.f1386t.f1329e) + t7;
            j = Long.MIN_VALUE;
        }
        if (j3 != j) {
            if (!this.f1401d1) {
                j3 = Math.max(this.f1400b1, j3);
            }
            this.f1400b1 = j3;
            this.f1401d1 = false;
        }
    }

    @Override // A1.AbstractC0023i
    public final v2.h i() {
        return this;
    }
}
