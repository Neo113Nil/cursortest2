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
import p155w1.C1010l1;
import p155w1.C1017n0;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class H extends R1.p implements p151v2.h {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final Context f1395V0;
    public final P2 W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final E f1396X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public int f1397Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f1398Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public X f1399a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public long f1400b1;
    public boolean c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f1401d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f1402e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public O f1403f1;

    public H(Context context, R1.j jVar, Handler handler, A1.K k7, E e7) {
        super(1, jVar, 44100.0f);
        this.f1395V0 = context.getApplicationContext();
        this.f1396X0 = e7;
        this.W0 = new P2(4, handler, k7, false);
        e7.f1384r = new C1010l1(this);
    }

    public static AbstractC0167z r0(R1.q qVar, X x4, boolean z4, E e7) {
        String str = x4.f283C;
        if (str == null) {
            C0165x c0165x = AbstractC0167z.f2083b;
            return E3.L.f2000e;
        }
        if (e7.f(x4) != 0) {
            List listE = R1.w.e("audio/raw", false, false);
            R1.m mVar = listE.isEmpty() ? null : (R1.m) listE.get(0);
            if (mVar != null) {
                return AbstractC0167z.I(mVar);
            }
        }
        qVar.getClass();
        List listE2 = R1.w.e(str, z4, false);
        String strB = R1.w.b(x4);
        if (strB == null) {
            return AbstractC0167z.E(listE2);
        }
        List listE3 = R1.w.e(strB, z4, false);
        C0165x c0165x2 = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        c0164w.c(listE2);
        c0164w.c(listE3);
        return c0164w.d();
    }

    @Override // R1.p
    public final D1.i C(R1.m mVar, X x4, X x7) {
        D1.i iVarB = mVar.b(x4, x7);
        int iQ0 = q0(mVar, x7);
        int i7 = this.f1397Y0;
        int i8 = iVarB.f1706e;
        if (iQ0 > i7) {
            i8 |= 64;
        }
        int i9 = i8;
        return new D1.i(mVar.f5925a, x4, x7, i9 != 0 ? 0 : iVarB.f1705d, i9);
    }

    @Override // R1.p
    public final float M(float f7, X[] xArr) {
        int iMax = -1;
        for (X x4 : xArr) {
            int i7 = x4.f297Q;
            if (i7 != -1) {
                iMax = Math.max(iMax, i7);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f7 * iMax;
    }

    @Override // R1.p
    public final ArrayList N(R1.q qVar, X x4, boolean z4) {
        AbstractC0167z abstractC0167zR0 = r0(qVar, x4, z4, this.f1396X0);
        Pattern pattern = R1.w.f6011a;
        ArrayList arrayList = new ArrayList(abstractC0167zR0);
        Collections.sort(arrayList, new E4.M(new C0042s(x4, 27), 3));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    @Override // R1.p
    public final R1.i P(R1.m mVar, X x4, MediaCrypto mediaCrypto, float f7) {
        boolean z4;
        X[] xArr = this.f382y;
        xArr.getClass();
        int iQ0 = q0(mVar, x4);
        if (xArr.length != 1) {
            for (X x7 : xArr) {
                if (mVar.b(x4, x7).f1705d != 0) {
                    iQ0 = Math.max(iQ0, q0(mVar, x7));
                }
            }
        }
        this.f1397Y0 = iQ0;
        int i7 = p151v2.t.f17159a;
        if (i7 < 24 && "OMX.SEC.aac.dec".equals(mVar.f5925a) && "samsung".equals(p151v2.t.f17161c)) {
            String str = p151v2.t.f17160b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.f1398Z0 = z4;
        int i8 = this.f1397Y0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f5927c);
        mediaFormat.setInteger("channel-count", x4.f296P);
        int i9 = x4.f297Q;
        mediaFormat.setInteger("sample-rate", i9);
        p151v2.a.E(mediaFormat, x4.f285E);
        p151v2.a.w(mediaFormat, "max-input-size", i8);
        if (i7 >= 23) {
            mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
            if (f7 != -1.0f) {
                if (i7 == 23) {
                    String str2 = p151v2.t.f17162d;
                    if (!"ZTE B2017G".equals(str2) && !"AXON 7 mini".equals(str2)) {
                        mediaFormat.setFloat("operating-rate", f7);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f7);
                }
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
        this.f1399a1 = (!"audio/raw".equals(mVar.f5926b) || "audio/raw".equals(str3)) ? null : x4;
        return new R1.i(mVar, mediaFormat, x4, null, mediaCrypto);
    }

    @Override // R1.p
    public final void U(Exception exc) {
        p151v2.a.l("MediaCodecAudioRenderer", "Audio codec error", exc);
        P2 p5 = this.W0;
        Handler handler = (Handler) p5.f17514b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p5, exc, 2));
        }
    }

    @Override // R1.p
    public final void V(long j, long j3, String str) {
        P2 p5 = this.W0;
        Handler handler = (Handler) p5.f17514b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p5, str, j, j3));
        }
    }

    @Override // R1.p
    public final void W(String str) {
        P2 p5 = this.W0;
        Handler handler = (Handler) p5.f17514b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p5, str, 0));
        }
    }

    @Override // R1.p
    public final D1.i X(V0 v6) {
        D1.i iVarX = super.X(v6);
        X x4 = (X) v6.f17569c;
        P2 p5 = this.W0;
        Handler handler = (Handler) p5.f17514b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p5, x4, iVarX));
        }
        return iVarX;
    }

    @Override // R1.p
    public final void Y(X x4, MediaFormat mediaFormat) throws A1.r {
        int iV;
        int i7;
        X x7 = this.f1399a1;
        int[] iArr = null;
        if (x7 != null) {
            x4 = x7;
        } else if (this.f5980Z != null) {
            if ("audio/raw".equals(x4.f283C)) {
                iV = x4.f298R;
            } else if (p151v2.t.f17159a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iV = mediaFormat.containsKey("v-bits-per-sample") ? p151v2.t.v(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iV = mediaFormat.getInteger("pcm-encoding");
            }
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10537k = "audio/raw";
            format$Builder.f10552z = iV;
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

    @Override // p151v2.h
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

    @Override // p151v2.h
    public final void b(w0 w0Var) {
        E e7 = this.f1396X0;
        e7.getClass();
        w0 w0Var2 = new w0(p151v2.t.i(w0Var.f606a, 0.1f, 8.0f), p151v2.t.i(w0Var.f607b, 0.1f, 8.0f));
        if (!e7.f1377k || p151v2.t.f17159a < 23) {
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
            float fFloatValue = ((Float) obj).floatValue();
            if (e7.f1349J != fFloatValue) {
                e7.f1349J = fFloatValue;
                if (e7.m()) {
                    if (p151v2.t.f17159a >= 21) {
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
                int iIntValue = ((Integer) obj).intValue();
                if (e7.f1362W != iIntValue) {
                    e7.f1362W = iIntValue;
                    e7.f1361V = iIntValue != 0;
                    e7.d();
                }
                break;
            case 11:
                this.f1403f1 = (O) obj;
                break;
        }
    }

    @Override // p151v2.h
    public final w0 d() {
        E e7 = this.f1396X0;
        return e7.f1377k ? e7.f1391y : e7.g().f1334a;
    }

    @Override // R1.p
    public final boolean d0(long j, long j3, R1.k kVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, X x4) throws A1.r {
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
    public final void g0() throws A1.r {
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : (R1.m) r4.get(0)) != null) goto L30;
     */
    @Override // R1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m0(R1.q qVar, X x4) {
        boolean z4;
        if (!p151v2.i.h(x4.f283C)) {
            return AbstractC0023i.e(0, 0, 0);
        }
        int i7 = p151v2.t.f17159a >= 21 ? 32 : 0;
        boolean z7 = true;
        int i8 = x4.f302V;
        boolean z8 = i8 != 0;
        boolean z9 = i8 == 0 || i8 == 2;
        int i9 = 8;
        E e7 = this.f1396X0;
        if (z9 && e7.f(x4) != 0) {
            if (z8) {
                List listE = R1.w.e("audio/raw", false, false);
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
        AbstractC0167z abstractC0167zR0 = r0(qVar, x4, false, e7);
        if (abstractC0167zR0.isEmpty()) {
            return AbstractC0023i.e(1, 0, 0);
        }
        if (!z9) {
            return AbstractC0023i.e(2, 0, 0);
        }
        R1.m mVar = (R1.m) abstractC0167zR0.get(0);
        boolean zC = mVar.c(x4);
        if (!zC) {
            int i10 = 1;
            while (true) {
                if (i10 >= abstractC0167zR0.size()) {
                    z4 = true;
                    z7 = zC;
                    break;
                }
                R1.m mVar2 = (R1.m) abstractC0167zR0.get(i10);
                if (mVar2.c(x4)) {
                    z4 = false;
                    mVar = mVar2;
                    break;
                }
                i10++;
            }
        } else {
            z4 = true;
            z7 = zC;
            break;
        }
        int i11 = z7 ? 4 : 3;
        if (z7 && mVar.d(x4)) {
            i9 = 16;
        }
        return i11 | i9 | i7 | (mVar.f5931g ? 64 : 0) | (z4 ? 128 : 0);
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        P2 p5 = this.W0;
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
                p5.q(this.f5968Q0);
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
                p5.q(this.f5968Q0);
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final void o(boolean z4, boolean z7) {
        D1.e eVar = new D1.e();
        this.f5968Q0 = eVar;
        P2 p5 = this.W0;
        Handler handler = (Handler) p5.f17514b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p5, eVar, 4));
        }
        G0 g3 = this.f377c;
        g3.getClass();
        boolean z8 = g3.f97a;
        E e7 = this.f1396X0;
        if (z8) {
            e7.getClass();
            p151v2.a.h(p151v2.t.f17159a >= 21);
            p151v2.a.h(e7.f1361V);
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
                C1010l1 c1010l1 = this.f5973T;
                if (c1010l1 != null) {
                    c1010l1.F(null);
                }
                this.f5973T = null;
                if (this.f1402e1) {
                    this.f1402e1 = false;
                    e7.q();
                }
            } catch (Throwable th) {
                C1010l1 c1010l2 = this.f5973T;
                if (c1010l2 != null) {
                    c1010l2.F(null);
                }
                this.f5973T = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f1402e1) {
                this.f1402e1 = false;
                e7.q();
            }
            throw th2;
        }
    }

    public final int q0(R1.m mVar, X x4) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(mVar.f5925a) || (i7 = p151v2.t.f17159a) >= 24 || (i7 == 23 && p151v2.t.D(this.f1395V0))) {
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

    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0239  */
    public final void s0() {
        long j;
        long jMax;
        boolean z4;
        E e7;
        long jA;
        ArrayDeque arrayDeque;
        long jT;
        long jK;
        boolean z7;
        Method method;
        boolean zL = l();
        E e8 = this.f1396X0;
        if (!e8.m() || e8.f1347H) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            u uVar = e8.f1376i;
            AudioTrack audioTrack = uVar.f1534c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            E e9 = (E) uVar.f1532a.f17938b;
            if (playState == 3) {
                long jA2 = (uVar.a() * 1000000) / ((long) uVar.f1538g);
                if (jA2 == 0) {
                    z4 = zL;
                } else {
                    long jNanoTime = System.nanoTime() / 1000;
                    if (jNanoTime - uVar.f1543m >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                        int i7 = uVar.f1552v;
                        long[] jArr = uVar.f1533b;
                        jArr[i7] = jA2 - jNanoTime;
                        uVar.f1552v = (i7 + 1) % 10;
                        int i8 = uVar.f1553w;
                        if (i8 < 10) {
                            uVar.f1553w = i8 + 1;
                        }
                        uVar.f1543m = jNanoTime;
                        uVar.f1542l = 0L;
                        int i9 = 0;
                        while (true) {
                            int i10 = uVar.f1553w;
                            if (i9 >= i10) {
                                break;
                            }
                            uVar.f1542l = (jArr[i9] / ((long) i10)) + uVar.f1542l;
                            i9++;
                            zL = zL;
                        }
                    }
                    z4 = zL;
                    if (!uVar.f1539h) {
                        t tVar = uVar.f1537f;
                        tVar.getClass();
                        s sVar = tVar.f1520a;
                        if (sVar == null || jNanoTime - tVar.f1524e < tVar.f1523d) {
                            z7 = false;
                        } else {
                            tVar.f1524e = jNanoTime;
                            AudioTrack audioTrack2 = sVar.f1515a;
                            AudioTimestamp audioTimestamp = sVar.f1516b;
                            boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j3 = audioTimestamp.framePosition;
                                if (sVar.f1518d > j3) {
                                    sVar.f1517c++;
                                }
                                sVar.f1518d = j3;
                                sVar.f1519e = j3 + (sVar.f1517c << 32);
                            }
                            int i11 = tVar.f1521b;
                            if (i11 != 0) {
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 != 3) {
                                            if (i11 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            tVar.a();
                                        }
                                    } else if (timestamp == 0) {
                                        tVar.a();
                                    }
                                } else if (timestamp == 0) {
                                    tVar.a();
                                } else if (sVar.f1519e > tVar.f1525f) {
                                    tVar.b(2);
                                }
                            } else if (timestamp != 0) {
                                if (audioTimestamp.nanoTime / 1000 >= tVar.f1522c) {
                                    tVar.f1525f = sVar.f1519e;
                                    tVar.b(1);
                                } else {
                                    z7 = false;
                                }
                            } else if (jNanoTime - tVar.f1522c > 500000) {
                                tVar.b(3);
                            }
                            z7 = timestamp;
                        }
                        if (z7) {
                            long j7 = sVar != null ? sVar.f1516b.nanoTime / 1000 : -9223372036854775807L;
                            long j8 = sVar != null ? sVar.f1519e : -1L;
                            if (Math.abs(j7 - jNanoTime) > 5000000) {
                                StringBuilder sbJ = p031e1.k.j("Spurious audio timestamp (system clock mismatch): ", ", ", j8);
                                sbJ.append(j7);
                                sbJ.append(", ");
                                sbJ.append(jNanoTime);
                                sbJ.append(", ");
                                sbJ.append(jA2);
                                sbJ.append(", ");
                                sbJ.append(e9.h());
                                sbJ.append(", ");
                                sbJ.append(e9.i());
                                Log.w("DefaultAudioSink", sbJ.toString());
                                tVar.b(4);
                                e7 = e8;
                            } else {
                                e7 = e8;
                                if (Math.abs(((j8 * 1000000) / ((long) uVar.f1538g)) - jA2) > 5000000) {
                                    StringBuilder sbJ2 = p031e1.k.j("Spurious audio timestamp (frame position mismatch): ", ", ", j8);
                                    sbJ2.append(j7);
                                    sbJ2.append(", ");
                                    sbJ2.append(jNanoTime);
                                    sbJ2.append(", ");
                                    sbJ2.append(jA2);
                                    sbJ2.append(", ");
                                    sbJ2.append(e9.h());
                                    sbJ2.append(", ");
                                    sbJ2.append(e9.i());
                                    Log.w("DefaultAudioSink", sbJ2.toString());
                                    tVar.b(4);
                                } else if (tVar.f1521b == 4) {
                                    tVar.a();
                                }
                            }
                        } else {
                            e7 = e8;
                        }
                        if (uVar.f1547q && (method = uVar.f1544n) != null && jNanoTime - uVar.f1548r >= 500000) {
                            try {
                                AudioTrack audioTrack3 = uVar.f1534c;
                                audioTrack3.getClass();
                                Integer num = (Integer) method.invoke(audioTrack3, null);
                                int i12 = p151v2.t.f17159a;
                                long jIntValue = (((long) num.intValue()) * 1000) - uVar.f1540i;
                                uVar.f1545o = jIntValue;
                                long jMax2 = Math.max(jIntValue, 0L);
                                uVar.f1545o = jMax2;
                                if (jMax2 > 5000000) {
                                    Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax2);
                                    uVar.f1545o = 0L;
                                }
                            } catch (Exception unused) {
                                uVar.f1544n = null;
                            }
                            uVar.f1548r = jNanoTime;
                        }
                    }
                }
                e7 = e8;
            } else {
                z4 = zL;
                e7 = e8;
            }
            long jNanoTime2 = System.nanoTime() / 1000;
            t tVar2 = uVar.f1537f;
            tVar2.getClass();
            boolean z8 = tVar2.f1521b == 2;
            if (z8) {
                s sVar2 = tVar2.f1520a;
                jA = p151v2.t.t(jNanoTime2 - (sVar2 != null ? sVar2.f1516b.nanoTime / 1000 : -9223372036854775807L), uVar.j) + (((sVar2 != null ? sVar2.f1519e : -1L) * 1000000) / ((long) uVar.f1538g));
            } else {
                jA = uVar.f1553w == 0 ? (uVar.a() * 1000000) / ((long) uVar.f1538g) : uVar.f1542l + jNanoTime2;
                if (!z4) {
                    jA = Math.max(0L, jA - uVar.f1545o);
                }
            }
            if (uVar.f1529D != z8) {
                uVar.f1531F = uVar.f1528C;
                uVar.f1530E = uVar.f1527B;
            }
            long j9 = jNanoTime2 - uVar.f1531F;
            if (j9 < 1000000) {
                long jT2 = p151v2.t.t(j9, uVar.j) + uVar.f1530E;
                long j10 = (j9 * 1000) / 1000000;
                jA = (((1000 - j10) * jT2) + (jA * j10)) / 1000;
            }
            if (!uVar.f1541k) {
                long j11 = uVar.f1527B;
                if (jA > j11) {
                    uVar.f1541k = true;
                    long jCurrentTimeMillis = System.currentTimeMillis() - p151v2.t.N(p151v2.t.x(p151v2.t.N(jA - j11), uVar.j));
                    C1010l1 c1010l1 = e9.f1384r;
                    if (c1010l1 != null) {
                        P2 p5 = ((H) c1010l1.f17777a).W0;
                        Handler handler = (Handler) p5.f17514b;
                        if (handler != null) {
                            handler.post(new RunnableC0107m(p5, jCurrentTimeMillis));
                        }
                    }
                }
            }
            uVar.f1528C = jNanoTime2;
            uVar.f1527B = jA;
            uVar.f1529D = z8;
            E e10 = e7;
            long jMin = Math.min(jA, (e10.i() * 1000000) / ((long) e10.f1386t.f1329e));
            while (true) {
                arrayDeque = e10.j;
                if (arrayDeque.isEmpty() || jMin < ((B) arrayDeque.getFirst()).f1337d) {
                    break;
                } else {
                    e10.f1390x = (B) arrayDeque.remove();
                }
            }
            B b7 = e10.f1390x;
            long j12 = jMin - b7.f1337d;
            boolean zEquals = b7.f1334a.equals(w0.f605d);
            C1017n0 c1017n0 = e10.f1368b;
            if (zEquals) {
                jT = e10.f1390x.f1336c + j12;
            } else if (arrayDeque.isEmpty()) {
                M m7 = (M) c1017n0.f17813d;
                if (m7.f1455o >= 1024) {
                    long j13 = m7.f1454n;
                    L l7 = m7.j;
                    l7.getClass();
                    long j14 = j13 - ((long) ((l7.f1431k * l7.f1423b) * 2));
                    int i13 = m7.f1449h.f1498a;
                    int i14 = m7.f1448g.f1498a;
                    jK = i13 == i14 ? p151v2.t.K(j12, j14, m7.f1455o) : p151v2.t.K(j12, j14 * ((long) i13), m7.f1455o * ((long) i14));
                } else {
                    jK = (long) (((double) m7.f1444c) * j12);
                }
                jT = jK + e10.f1390x.f1336c;
            } else {
                B b8 = (B) arrayDeque.getFirst();
                jT = b8.f1336c - p151v2.t.t(b8.f1337d - jMin, e10.f1390x.f1334a.f606a);
            }
            jMax = ((((K) c1017n0.f17812c).f1421t * 1000000) / ((long) e10.f1386t.f1329e)) + jT;
            j = Long.MIN_VALUE;
        }
        if (jMax != j) {
            if (!this.f1401d1) {
                jMax = Math.max(this.f1400b1, jMax);
            }
            this.f1400b1 = jMax;
            this.f1401d1 = false;
        }
    }

    @Override // A1.AbstractC0023i
    public final p151v2.h i() {
        return this;
    }
}
