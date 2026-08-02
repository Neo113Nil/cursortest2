package C1;

import A1.O;
import A1.X;
import A1.w0;
import C0.C0083b;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import v0.AbstractC1663a;
import v2.AbstractC1664a;
import w1.C1719l1;
import w1.C1726n0;
import w1.C1759x1;
import w1.C1761y0;
import w1.P2;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: A, reason: collision with root package name */
    public int f1340A;

    /* renamed from: B, reason: collision with root package name */
    public long f1341B;

    /* renamed from: C, reason: collision with root package name */
    public long f1342C;

    /* renamed from: D, reason: collision with root package name */
    public long f1343D;

    /* renamed from: E, reason: collision with root package name */
    public long f1344E;

    /* renamed from: F, reason: collision with root package name */
    public int f1345F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1346G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1347H;

    /* renamed from: I, reason: collision with root package name */
    public long f1348I;

    /* renamed from: J, reason: collision with root package name */
    public float f1349J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC0106l[] f1350K;

    /* renamed from: L, reason: collision with root package name */
    public ByteBuffer[] f1351L;

    /* renamed from: M, reason: collision with root package name */
    public ByteBuffer f1352M;

    /* renamed from: N, reason: collision with root package name */
    public int f1353N;

    /* renamed from: O, reason: collision with root package name */
    public ByteBuffer f1354O;

    /* renamed from: P, reason: collision with root package name */
    public byte[] f1355P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1356Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1357R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1358S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1359T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1360U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1361V;

    /* renamed from: W, reason: collision with root package name */
    public int f1362W;

    /* renamed from: X, reason: collision with root package name */
    public v f1363X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1364Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f1365Z;

    /* renamed from: a, reason: collision with root package name */
    public final C0103i f1366a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1367a0;

    /* renamed from: b, reason: collision with root package name */
    public final C1726n0 f1368b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1369b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1370c;

    /* renamed from: d, reason: collision with root package name */
    public final x f1371d;

    /* renamed from: e, reason: collision with root package name */
    public final N f1372e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0106l[] f1373f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0106l[] f1374g;

    /* renamed from: h, reason: collision with root package name */
    public final ConditionVariable f1375h;

    /* renamed from: i, reason: collision with root package name */
    public final u f1376i;
    public final ArrayDeque j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1377k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1378l;

    /* renamed from: m, reason: collision with root package name */
    public C1759x1 f1379m;

    /* renamed from: n, reason: collision with root package name */
    public final C0083b f1380n;

    /* renamed from: o, reason: collision with root package name */
    public final C0083b f1381o;

    /* renamed from: p, reason: collision with root package name */
    public final F f1382p;

    /* renamed from: q, reason: collision with root package name */
    public B1.p f1383q;

    /* renamed from: r, reason: collision with root package name */
    public C1719l1 f1384r;

    /* renamed from: s, reason: collision with root package name */
    public A f1385s;

    /* renamed from: t, reason: collision with root package name */
    public A f1386t;

    /* renamed from: u, reason: collision with root package name */
    public AudioTrack f1387u;

    /* renamed from: v, reason: collision with root package name */
    public C0101g f1388v;

    /* renamed from: w, reason: collision with root package name */
    public B f1389w;

    /* renamed from: x, reason: collision with root package name */
    public B f1390x;

    /* renamed from: y, reason: collision with root package name */
    public w0 f1391y;

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer f1392z;

    public E(v2.n nVar) {
        int i7 = 2;
        this.f1366a = (C0103i) nVar.f17137b;
        C1726n0 c1726n0 = (C1726n0) nVar.f17138c;
        this.f1368b = c1726n0;
        int i8 = v2.t.f17153a;
        this.f1370c = false;
        this.f1377k = false;
        this.f1378l = i8 >= 29 ? nVar.f17136a : 0;
        this.f1382p = (F) nVar.f17139d;
        this.f1375h = new ConditionVariable(true);
        this.f1376i = new u(new C1761y0(this, i7));
        x xVar = new x();
        this.f1371d = xVar;
        N n2 = new N();
        n2.f1460m = v2.t.f17158f;
        this.f1372e = n2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new J(), xVar, n2);
        Collections.addAll(arrayList, (InterfaceC0106l[]) c1726n0.f17805b);
        this.f1373f = (InterfaceC0106l[]) arrayList.toArray(new InterfaceC0106l[0]);
        this.f1374g = new InterfaceC0106l[]{new G()};
        this.f1349J = 1.0f;
        this.f1388v = C0101g.f1484x;
        this.f1362W = 0;
        this.f1363X = new v();
        w0 w0Var = w0.f605d;
        this.f1390x = new B(w0Var, false, 0L, 0L);
        this.f1391y = w0Var;
        this.f1357R = -1;
        this.f1350K = new InterfaceC0106l[0];
        this.f1351L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.f1380n = new C0083b(1);
        this.f1381o = new C0083b(1);
    }

    public static AudioFormat e(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (v2.t.f17153a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j) {
        w0 w0Var;
        boolean z4;
        boolean t7 = t();
        C1726n0 c1726n0 = this.f1368b;
        if (t7) {
            w0Var = g().f1334a;
            c1726n0.getClass();
            float f7 = w0Var.f606a;
            M m7 = (M) c1726n0.f17807d;
            if (m7.f1444c != f7) {
                m7.f1444c = f7;
                m7.f1450i = true;
            }
            float f8 = m7.f1445d;
            float f9 = w0Var.f607b;
            if (f8 != f9) {
                m7.f1445d = f9;
                m7.f1450i = true;
            }
        } else {
            w0Var = w0.f605d;
        }
        w0 w0Var2 = w0Var;
        int i7 = 0;
        if (t()) {
            z4 = g().f1335b;
            ((K) c1726n0.f17806c).f1414m = z4;
        } else {
            z4 = false;
        }
        this.j.add(new B(w0Var2, z4, Math.max(0L, j), (i() * 1000000) / this.f1386t.f1329e));
        InterfaceC0106l[] interfaceC0106lArr = this.f1386t.f1333i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0106l interfaceC0106l : interfaceC0106lArr) {
            if (interfaceC0106l.isActive()) {
                arrayList.add(interfaceC0106l);
            } else {
                interfaceC0106l.flush();
            }
        }
        int size = arrayList.size();
        this.f1350K = (InterfaceC0106l[]) arrayList.toArray(new InterfaceC0106l[size]);
        this.f1351L = new ByteBuffer[size];
        while (true) {
            InterfaceC0106l[] interfaceC0106lArr2 = this.f1350K;
            if (i7 >= interfaceC0106lArr2.length) {
                break;
            }
            InterfaceC0106l interfaceC0106l2 = interfaceC0106lArr2[i7];
            interfaceC0106l2.flush();
            this.f1351L[i7] = interfaceC0106l2.a();
            i7++;
        }
        C1719l1 c1719l1 = this.f1384r;
        if (c1719l1 != null) {
            P2 p22 = ((H) c1719l1.f17771a).W0;
            Handler handler = (Handler) p22.f17508b;
            if (handler != null) {
                handler.post(new RunnableC0108n(p22, z4, 0));
            }
        }
    }

    public final void b(X x4, int[] iArr) {
        int i7;
        int intValue;
        int intValue2;
        InterfaceC0106l[] interfaceC0106lArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int j;
        int[] iArr2;
        boolean equals = "audio/raw".equals(x4.f283C);
        int i18 = x4.f297Q;
        int i19 = x4.f296P;
        if (equals) {
            int i20 = x4.f298R;
            AbstractC1664a.f(v2.t.C(i20));
            int w7 = v2.t.w(i20, i19);
            InterfaceC0106l[] interfaceC0106lArr2 = (this.f1370c && (i20 == 536870912 || i20 == 805306368 || i20 == 4)) ? this.f1374g : this.f1373f;
            int i21 = x4.f299S;
            N n2 = this.f1372e;
            n2.f1457i = i21;
            n2.j = x4.f300T;
            if (v2.t.f17153a < 21 && i19 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i22 = 0; i22 < 6; i22++) {
                    iArr2[i22] = i22;
                }
            } else {
                iArr2 = iArr;
            }
            this.f1371d.f1564i = iArr2;
            C0104j c0104j = new C0104j(i18, i19, i20);
            for (InterfaceC0106l interfaceC0106l : interfaceC0106lArr2) {
                try {
                    C0104j b7 = interfaceC0106l.b(c0104j);
                    if (interfaceC0106l.isActive()) {
                        c0104j = b7;
                    }
                } catch (C0105k e7) {
                    throw new o(e7, x4);
                }
            }
            int i23 = c0104j.f1500c;
            int i24 = c0104j.f1499b;
            int o7 = v2.t.o(i24);
            i12 = v2.t.w(i23, i24);
            interfaceC0106lArr = interfaceC0106lArr2;
            i7 = w7;
            i10 = o7;
            i11 = c0104j.f1498a;
            i9 = i23;
            i8 = 0;
        } else {
            InterfaceC0106l[] interfaceC0106lArr3 = new InterfaceC0106l[0];
            i7 = -1;
            if (u(x4, this.f1388v)) {
                String str = x4.f283C;
                str.getClass();
                intValue = v2.i.b(str, x4.f312z);
                intValue2 = v2.t.o(i19);
                interfaceC0106lArr = interfaceC0106lArr3;
                i8 = 1;
            } else {
                Pair a2 = this.f1366a.a(x4);
                if (a2 == null) {
                    throw new o("Unable to configure passthrough for: " + x4, x4);
                }
                intValue = ((Integer) a2.first).intValue();
                intValue2 = ((Integer) a2.second).intValue();
                interfaceC0106lArr = interfaceC0106lArr3;
                i8 = 2;
            }
            i9 = intValue;
            i10 = intValue2;
            i11 = i18;
            i12 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i11, i10, i9);
        AbstractC1664a.h(minBufferSize != -2);
        double d7 = this.f1377k ? 8.0d : 1.0d;
        this.f1382p.getClass();
        if (i8 != 0) {
            if (i8 == 1) {
                i13 = i8;
                j = Q0.a.g((50000000 * F.a(i9)) / 1000000);
            } else {
                if (i8 != 2) {
                    throw new IllegalArgumentException();
                }
                j = Q0.a.g(((i9 == 5 ? 500000 : 250000) * F.a(i9)) / 1000000);
                i13 = i8;
            }
            i14 = i11;
            i15 = i10;
            i16 = i7;
            i17 = i9;
        } else {
            i13 = i8;
            long j3 = i11;
            i14 = i11;
            i15 = i10;
            long j7 = i12;
            i16 = i7;
            i17 = i9;
            j = v2.t.j(minBufferSize * 4, Q0.a.g(((250000 * j3) * j7) / 1000000), Q0.a.g(((750000 * j3) * j7) / 1000000));
        }
        int max = (((Math.max(minBufferSize, (int) (j * d7)) + i12) - 1) / i12) * i12;
        if (i17 == 0) {
            throw new o("Invalid output encoding (mode=" + i13 + ") for: " + x4, x4);
        }
        if (i15 == 0) {
            throw new o("Invalid output channel config (mode=" + i13 + ") for: " + x4, x4);
        }
        this.f1367a0 = false;
        A a4 = new A(x4, i16, i13, i12, i14, i15, i17, max, interfaceC0106lArr);
        if (m()) {
            this.f1385s = a4;
        } else {
            this.f1386t = a4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z4;
        int i7;
        InterfaceC0106l[] interfaceC0106lArr;
        if (this.f1357R == -1) {
            this.f1357R = 0;
            z4 = true;
            i7 = this.f1357R;
            interfaceC0106lArr = this.f1350K;
            if (i7 < interfaceC0106lArr.length) {
                InterfaceC0106l interfaceC0106l = interfaceC0106lArr[i7];
                if (z4) {
                    interfaceC0106l.d();
                }
                p(-9223372036854775807L);
                if (!interfaceC0106l.e()) {
                    return false;
                }
                this.f1357R++;
                z4 = true;
                i7 = this.f1357R;
                interfaceC0106lArr = this.f1350K;
                if (i7 < interfaceC0106lArr.length) {
                    ByteBuffer byteBuffer = this.f1354O;
                    if (byteBuffer != null) {
                        v(byteBuffer, -9223372036854775807L);
                        if (this.f1354O != null) {
                            return false;
                        }
                    }
                    this.f1357R = -1;
                    return true;
                }
            }
        } else {
            z4 = false;
            i7 = this.f1357R;
            interfaceC0106lArr = this.f1350K;
            if (i7 < interfaceC0106lArr.length) {
            }
        }
    }

    public final void d() {
        if (m()) {
            this.f1341B = 0L;
            this.f1342C = 0L;
            this.f1343D = 0L;
            this.f1344E = 0L;
            this.f1369b0 = false;
            this.f1345F = 0;
            this.f1390x = new B(g().f1334a, g().f1335b, 0L, 0L);
            this.f1348I = 0L;
            this.f1389w = null;
            this.j.clear();
            this.f1352M = null;
            this.f1353N = 0;
            this.f1354O = null;
            this.f1359T = false;
            this.f1358S = false;
            this.f1357R = -1;
            this.f1392z = null;
            this.f1340A = 0;
            this.f1372e.f1462o = 0L;
            int i7 = 0;
            while (true) {
                InterfaceC0106l[] interfaceC0106lArr = this.f1350K;
                if (i7 >= interfaceC0106lArr.length) {
                    break;
                }
                InterfaceC0106l interfaceC0106l = interfaceC0106lArr[i7];
                interfaceC0106l.flush();
                this.f1351L[i7] = interfaceC0106l.a();
                i7++;
            }
            u uVar = this.f1376i;
            AudioTrack audioTrack = uVar.f1534c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f1387u.pause();
            }
            if (n(this.f1387u)) {
                C1759x1 c1759x1 = this.f1379m;
                c1759x1.getClass();
                this.f1387u.unregisterStreamEventCallback((D) c1759x1.f17926c);
                ((Handler) c1759x1.f17925b).removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f1387u;
            this.f1387u = null;
            if (v2.t.f17153a < 21 && !this.f1361V) {
                this.f1362W = 0;
            }
            A a2 = this.f1385s;
            if (a2 != null) {
                this.f1386t = a2;
                this.f1385s = null;
            }
            uVar.f1542l = 0L;
            uVar.f1553w = 0;
            uVar.f1552v = 0;
            uVar.f1543m = 0L;
            uVar.f1528C = 0L;
            uVar.f1531F = 0L;
            uVar.f1541k = false;
            uVar.f1534c = null;
            uVar.f1537f = null;
            this.f1375h.close();
            new y(this, audioTrack2).start();
        }
        this.f1381o.f1247c = null;
        this.f1380n.f1247c = null;
    }

    public final int f(X x4) {
        if (!"audio/raw".equals(x4.f283C)) {
            return ((this.f1367a0 || !u(x4, this.f1388v)) && this.f1366a.a(x4) == null) ? 0 : 2;
        }
        int i7 = x4.f298R;
        if (v2.t.C(i7)) {
            return (i7 == 2 || (this.f1370c && i7 == 4)) ? 2 : 1;
        }
        AbstractC1663a.j(i7, "Invalid PCM encoding: ", "DefaultAudioSink");
        return 0;
    }

    public final B g() {
        B b7 = this.f1389w;
        if (b7 != null) {
            return b7;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (B) arrayDeque.getLast() : this.f1390x;
    }

    public final long h() {
        return this.f1386t.f1327c == 0 ? this.f1341B / r0.f1326b : this.f1342C;
    }

    public final long i() {
        return this.f1386t.f1327c == 0 ? this.f1343D / r0.f1328d : this.f1344E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
    
        if (r10.a() == 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(long j, ByteBuffer byteBuffer, int i7) {
        int i8;
        int i9;
        byte b7;
        int i10;
        byte b8;
        int i11;
        ByteBuffer byteBuffer2 = this.f1352M;
        AbstractC1664a.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f1385s != null) {
            if (!c()) {
                return false;
            }
            A a2 = this.f1385s;
            A a4 = this.f1386t;
            a2.getClass();
            if (a4.f1327c == a2.f1327c && a4.f1331g == a2.f1331g && a4.f1329e == a2.f1329e && a4.f1330f == a2.f1330f && a4.f1328d == a2.f1328d) {
                this.f1386t = this.f1385s;
                this.f1385s = null;
                if (n(this.f1387u) && this.f1378l != 3) {
                    if (this.f1387u.getPlayState() == 3) {
                        this.f1387u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f1387u;
                    X x4 = this.f1386t.f1325a;
                    audioTrack.setOffloadDelayPadding(x4.f299S, x4.f300T);
                    this.f1369b0 = true;
                }
            } else {
                o();
                if (k()) {
                    return false;
                }
                d();
            }
            a(j);
        }
        boolean m7 = m();
        C0083b c0083b = this.f1380n;
        if (!m7) {
            try {
                l();
            } catch (p e7) {
                if (e7.f1510b) {
                    throw e7;
                }
                c0083b.F(e7);
                return false;
            }
        }
        c0083b.f1247c = null;
        boolean z4 = this.f1347H;
        u uVar = this.f1376i;
        if (z4) {
            this.f1348I = Math.max(0L, j);
            this.f1346G = false;
            this.f1347H = false;
            if (this.f1377k && v2.t.f17153a >= 23) {
                s(this.f1391y);
            }
            a(j);
            if (this.f1360U) {
                this.f1360U = true;
                if (m()) {
                    t tVar = uVar.f1537f;
                    tVar.getClass();
                    tVar.a();
                    this.f1387u.play();
                }
            }
        }
        long i12 = i();
        AudioTrack audioTrack2 = uVar.f1534c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (uVar.f1539h) {
            if (playState == 2) {
                uVar.f1546p = false;
            } else if (playState == 1) {
            }
            return false;
        }
        boolean z7 = uVar.f1546p;
        boolean b9 = uVar.b(i12);
        uVar.f1546p = b9;
        if (z7 && !b9 && playState != 1) {
            int i13 = uVar.f1536e;
            long N7 = v2.t.N(uVar.f1540i);
            E e8 = (E) uVar.f1532a.f17932b;
            if (e8.f1384r != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - e8.f1365Z;
                P2 p22 = ((H) e8.f1384r.f17771a).W0;
                Handler handler = (Handler) p22.f17508b;
                if (handler != null) {
                    handler.post(new RunnableC0107m(p22, i13, N7, elapsedRealtime));
                }
            }
        }
        if (this.f1352M == null) {
            AbstractC1664a.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            A a7 = this.f1386t;
            if (a7.f1327c != 0 && this.f1345F == 0) {
                int i14 = a7.f1331g;
                int i15 = 1024;
                switch (i14) {
                    case 5:
                    case 6:
                    case 18:
                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                            i8 = AbstractC0096b.f1468c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                        } else {
                            i8 = 1536;
                        }
                        i15 = i8;
                        this.f1345F = i15;
                        if (i15 == 0) {
                            return true;
                        }
                        break;
                    case 7:
                    case 8:
                        int position = byteBuffer.position();
                        byte b10 = byteBuffer.get(position);
                        if (b10 != -2) {
                            if (b10 == -1) {
                                i9 = (byteBuffer.get(position + 4) & 7) << 4;
                                b8 = byteBuffer.get(position + 7);
                            } else if (b10 != 31) {
                                i9 = (byteBuffer.get(position + 4) & 1) << 6;
                                b7 = byteBuffer.get(position + 5);
                            } else {
                                i9 = (byteBuffer.get(position + 5) & 7) << 4;
                                b8 = byteBuffer.get(position + 6);
                            }
                            i10 = b8 & 60;
                            i15 = (((i10 >> 2) | i9) + 1) * 32;
                            this.f1345F = i15;
                            if (i15 == 0) {
                            }
                        } else {
                            i9 = (byteBuffer.get(position + 5) & 1) << 6;
                            b7 = byteBuffer.get(position + 4);
                        }
                        i10 = b7 & 252;
                        i15 = (((i10 >> 2) | i9) + 1) * 32;
                        this.f1345F = i15;
                        if (i15 == 0) {
                        }
                        break;
                    case 9:
                        int position2 = byteBuffer.position();
                        int i16 = v2.t.f17153a;
                        int i17 = byteBuffer.getInt(position2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            i17 = Integer.reverseBytes(i17);
                        }
                        i15 = AbstractC0096b.h(i17);
                        if (i15 == -1) {
                            throw new IllegalArgumentException();
                        }
                        this.f1345F = i15;
                        if (i15 == 0) {
                        }
                        break;
                    case 10:
                    case 16:
                        this.f1345F = i15;
                        if (i15 == 0) {
                        }
                        break;
                    case 11:
                    case 12:
                        i15 = 2048;
                        this.f1345F = i15;
                        if (i15 == 0) {
                        }
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(e1.k.d(i14, "Unexpected audio encoding: "));
                    case 14:
                        int position3 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i18 = position3;
                        while (true) {
                            if (i18 <= limit) {
                                int i19 = v2.t.f17153a;
                                int i20 = byteBuffer.getInt(i18 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    i20 = Integer.reverseBytes(i20);
                                }
                                if ((i20 & (-2)) == -126718022) {
                                    i11 = i18 - position3;
                                } else {
                                    i18++;
                                }
                            } else {
                                i11 = -1;
                            }
                        }
                        if (i11 == -1) {
                            i15 = 0;
                            this.f1345F = i15;
                            if (i15 == 0) {
                            }
                        } else {
                            i8 = (40 << ((byteBuffer.get((byteBuffer.position() + i11) + ((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            i15 = i8;
                            this.f1345F = i15;
                            if (i15 == 0) {
                            }
                        }
                        break;
                    case 15:
                        i15 = 512;
                        this.f1345F = i15;
                        if (i15 == 0) {
                        }
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int position4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position4);
                        i15 = AbstractC0096b.f(new F1.x(bArr, 16)).f1291c;
                        this.f1345F = i15;
                        if (i15 == 0) {
                        }
                        break;
                }
            }
            if (this.f1389w != null) {
                if (!c()) {
                    return false;
                }
                a(j);
                this.f1389w = null;
            }
            long h6 = (((h() - this.f1372e.f1462o) * 1000000) / this.f1386t.f1325a.f297Q) + this.f1348I;
            if (!this.f1346G && Math.abs(h6 - j) > 200000) {
                C1719l1 c1719l1 = this.f1384r;
                StringBuilder j3 = e1.k.j("Unexpected audio track timestamp discontinuity: expected ", ", got ", h6);
                j3.append(j);
                c1719l1.A(new q(j3.toString()));
                this.f1346G = true;
            }
            if (this.f1346G) {
                if (!c()) {
                    return false;
                }
                long j7 = j - h6;
                this.f1348I += j7;
                this.f1346G = false;
                a(j);
                C1719l1 c1719l12 = this.f1384r;
                if (c1719l12 != null && j7 != 0) {
                    ((H) c1719l12.f17771a).f1401d1 = true;
                }
            }
            if (this.f1386t.f1327c == 0) {
                this.f1341B += byteBuffer.remaining();
            } else {
                this.f1342C = (this.f1345F * i7) + this.f1342C;
            }
            this.f1352M = byteBuffer;
            this.f1353N = i7;
        }
        p(j);
        if (!this.f1352M.hasRemaining()) {
            this.f1352M = null;
            this.f1353N = 0;
            return true;
        }
        long i21 = i();
        if (uVar.f1555y == -9223372036854775807L || i21 <= 0 || SystemClock.elapsedRealtime() - uVar.f1555y < 200) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        d();
        return true;
    }

    public final boolean k() {
        return m() && this.f1376i.b(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        AudioTrack audioTrack;
        B1.p pVar;
        A a2;
        this.f1375h.block();
        try {
            a2 = this.f1386t;
            a2.getClass();
        } catch (p e7) {
            A a4 = this.f1386t;
            if (a4.f1332h > 1000000) {
                A a7 = new A(a4.f1325a, a4.f1326b, a4.f1327c, a4.f1328d, a4.f1329e, a4.f1330f, a4.f1331g, 1000000, a4.f1333i);
                try {
                    try {
                        AudioTrack a8 = a7.a(this.f1364Y, this.f1388v, this.f1362W);
                        this.f1386t = a7;
                        audioTrack = a8;
                    } catch (p e8) {
                        C1719l1 c1719l1 = this.f1384r;
                        if (c1719l1 != null) {
                            c1719l1.A(e8);
                        }
                        throw e8;
                    }
                } catch (p e9) {
                    e7.addSuppressed(e9);
                    if (this.f1386t.f1327c == 1) {
                    }
                }
            }
            if (this.f1386t.f1327c == 1) {
                throw e7;
            }
            this.f1367a0 = true;
            throw e7;
        }
        try {
            audioTrack = a2.a(this.f1364Y, this.f1388v, this.f1362W);
            this.f1387u = audioTrack;
            if (n(audioTrack)) {
                AudioTrack audioTrack2 = this.f1387u;
                if (this.f1379m == null) {
                    this.f1379m = new C1759x1(this);
                }
                C1759x1 c1759x1 = this.f1379m;
                Handler handler = (Handler) c1759x1.f17925b;
                Objects.requireNonNull(handler);
                audioTrack2.registerStreamEventCallback(new C(handler), (D) c1759x1.f17926c);
                if (this.f1378l != 3) {
                    AudioTrack audioTrack3 = this.f1387u;
                    X x4 = this.f1386t.f1325a;
                    audioTrack3.setOffloadDelayPadding(x4.f299S, x4.f300T);
                }
            }
            int i7 = v2.t.f17153a;
            if (i7 >= 31 && (pVar = this.f1383q) != null) {
                z.a(this.f1387u, pVar);
            }
            this.f1362W = this.f1387u.getAudioSessionId();
            AudioTrack audioTrack4 = this.f1387u;
            A a9 = this.f1386t;
            boolean z4 = a9.f1327c == 2;
            u uVar = this.f1376i;
            uVar.f1534c = audioTrack4;
            uVar.f1535d = a9.f1328d;
            uVar.f1536e = a9.f1332h;
            uVar.f1537f = new t(audioTrack4);
            uVar.f1538g = audioTrack4.getSampleRate();
            int i8 = a9.f1331g;
            uVar.f1539h = z4 && i7 < 23 && (i8 == 5 || i8 == 6);
            boolean C3 = v2.t.C(i8);
            uVar.f1547q = C3;
            uVar.f1540i = C3 ? ((r8 / r7) * 1000000) / uVar.f1538g : -9223372036854775807L;
            uVar.f1549s = 0L;
            uVar.f1550t = 0L;
            uVar.f1551u = 0L;
            uVar.f1546p = false;
            uVar.f1554x = -9223372036854775807L;
            uVar.f1555y = -9223372036854775807L;
            uVar.f1548r = 0L;
            uVar.f1545o = 0L;
            uVar.j = 1.0f;
            if (m()) {
                if (i7 >= 21) {
                    this.f1387u.setVolume(this.f1349J);
                } else {
                    AudioTrack audioTrack5 = this.f1387u;
                    float f7 = this.f1349J;
                    audioTrack5.setStereoVolume(f7, f7);
                }
            }
            this.f1363X.getClass();
            this.f1347H = true;
        } catch (p e10) {
            C1719l1 c1719l12 = this.f1384r;
            if (c1719l12 != null) {
                c1719l12.A(e10);
            }
            throw e10;
        }
    }

    public final boolean m() {
        return this.f1387u != null;
    }

    public final void o() {
        if (this.f1359T) {
            return;
        }
        this.f1359T = true;
        long i7 = i();
        u uVar = this.f1376i;
        uVar.f1556z = uVar.a();
        uVar.f1554x = SystemClock.elapsedRealtime() * 1000;
        uVar.f1526A = i7;
        this.f1387u.stop();
        this.f1340A = 0;
    }

    public final void p(long j) {
        ByteBuffer byteBuffer;
        int length = this.f1350K.length;
        int i7 = length;
        while (i7 >= 0) {
            if (i7 > 0) {
                byteBuffer = this.f1351L[i7 - 1];
            } else {
                byteBuffer = this.f1352M;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC0106l.f1502a;
                }
            }
            if (i7 == length) {
                v(byteBuffer, j);
            } else {
                InterfaceC0106l interfaceC0106l = this.f1350K[i7];
                if (i7 > this.f1357R) {
                    interfaceC0106l.c(byteBuffer);
                }
                ByteBuffer a2 = interfaceC0106l.a();
                this.f1351L[i7] = a2;
                if (a2.hasRemaining()) {
                    i7++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i7--;
            }
        }
    }

    public final void q() {
        d();
        for (InterfaceC0106l interfaceC0106l : this.f1373f) {
            interfaceC0106l.reset();
        }
        for (InterfaceC0106l interfaceC0106l2 : this.f1374g) {
            interfaceC0106l2.reset();
        }
        this.f1360U = false;
        this.f1367a0 = false;
    }

    public final void r(w0 w0Var, boolean z4) {
        B g3 = g();
        if (w0Var.equals(g3.f1334a) && z4 == g3.f1335b) {
            return;
        }
        B b7 = new B(w0Var, z4, -9223372036854775807L, -9223372036854775807L);
        if (m()) {
            this.f1389w = b7;
        } else {
            this.f1390x = b7;
        }
    }

    public final void s(w0 w0Var) {
        if (m()) {
            try {
                this.f1387u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(w0Var.f606a).setPitch(w0Var.f607b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                AbstractC1664a.G(e7, "DefaultAudioSink", "Failed to set playback params");
            }
            w0Var = new w0(this.f1387u.getPlaybackParams().getSpeed(), this.f1387u.getPlaybackParams().getPitch());
            float f7 = w0Var.f606a;
            u uVar = this.f1376i;
            uVar.j = f7;
            t tVar = uVar.f1537f;
            if (tVar != null) {
                tVar.a();
            }
        }
        this.f1391y = w0Var;
    }

    public final boolean t() {
        if (!this.f1364Y && "audio/raw".equals(this.f1386t.f1325a.f283C)) {
            int i7 = this.f1386t.f1325a.f298R;
            if (this.f1370c) {
                int i8 = v2.t.f17153a;
                if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean u(X x4, C0101g c0101g) {
        int i7;
        int o7;
        boolean isOffloadedPlaybackSupported;
        int i8;
        int i9 = v2.t.f17153a;
        if (i9 < 29 || (i7 = this.f1378l) == 0) {
            return false;
        }
        String str = x4.f283C;
        str.getClass();
        int b7 = v2.i.b(str, x4.f312z);
        if (b7 == 0 || (o7 = v2.t.o(x4.f296P)) == 0) {
            return false;
        }
        AudioFormat e7 = e(x4.f297Q, o7, b7);
        AudioAttributes audioAttributes = (AudioAttributes) c0101g.a().f16591b;
        if (i9 >= 31) {
            i8 = AudioManager.getPlaybackOffloadSupport(e7, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(e7, audioAttributes);
            i8 = !isOffloadedPlaybackSupported ? 0 : (i9 == 30 && v2.t.f17156d.startsWith("Pixel")) ? 2 : 1;
        }
        if (i8 == 0) {
            return false;
        }
        if (i8 == 1) {
            return ((x4.f299S != 0 || x4.f300T != 0) && (i7 == 1)) ? false : true;
        }
        if (i8 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e3, code lost:
    
        if (r15 < r14) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(ByteBuffer byteBuffer, long j) {
        int write;
        C1719l1 c1719l1;
        O o7;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f1354O;
            if (byteBuffer2 != null) {
                AbstractC1664a.f(byteBuffer2 == byteBuffer);
            } else {
                this.f1354O = byteBuffer;
                if (v2.t.f17153a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f1355P;
                    if (bArr == null || bArr.length < remaining) {
                        this.f1355P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f1355P, 0, remaining);
                    byteBuffer.position(position);
                    this.f1356Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i7 = v2.t.f17153a;
            if (i7 < 21) {
                long j3 = this.f1343D;
                u uVar = this.f1376i;
                int a2 = uVar.f1536e - ((int) (j3 - (uVar.a() * uVar.f1535d)));
                if (a2 > 0) {
                    write = this.f1387u.write(this.f1355P, this.f1356Q, Math.min(remaining2, a2));
                    if (write > 0) {
                        this.f1356Q += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                }
                write = 0;
            } else if (this.f1364Y) {
                AbstractC1664a.h(j != -9223372036854775807L);
                AudioTrack audioTrack = this.f1387u;
                if (i7 >= 26) {
                    write = audioTrack.write(byteBuffer, remaining2, 1, j * 1000);
                } else {
                    if (this.f1392z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f1392z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f1392z.putInt(1431633921);
                    }
                    if (this.f1340A == 0) {
                        this.f1392z.putInt(4, remaining2);
                        this.f1392z.putLong(8, j * 1000);
                        this.f1392z.position(0);
                        this.f1340A = remaining2;
                    }
                    int remaining3 = this.f1392z.remaining();
                    if (remaining3 > 0) {
                        int write2 = audioTrack.write(this.f1392z, remaining3, 1);
                        if (write2 < 0) {
                            this.f1340A = 0;
                            write = write2;
                        }
                    }
                    write = audioTrack.write(byteBuffer, remaining2, 1);
                    if (write < 0) {
                        this.f1340A = 0;
                    } else {
                        this.f1340A -= write;
                    }
                }
            } else {
                write = this.f1387u.write(byteBuffer, remaining2, 1);
            }
            this.f1365Z = SystemClock.elapsedRealtime();
            C0083b c0083b = this.f1381o;
            if (write < 0) {
                boolean z4 = (i7 >= 24 && write == -6) || write == -32;
                if (z4 && this.f1386t.f1327c == 1) {
                    this.f1367a0 = true;
                }
                r rVar = new r(write, this.f1386t.f1325a, z4);
                C1719l1 c1719l12 = this.f1384r;
                if (c1719l12 != null) {
                    c1719l12.A(rVar);
                }
                if (rVar.f1513b) {
                    throw rVar;
                }
                c0083b.F(rVar);
                return;
            }
            c0083b.f1247c = null;
            if (n(this.f1387u)) {
                if (this.f1344E > 0) {
                    this.f1369b0 = false;
                }
                if (this.f1360U && (c1719l1 = this.f1384r) != null && write < remaining2 && !this.f1369b0 && (o7 = ((H) c1719l1.f17771a).f1403f1) != null) {
                    o7.f181a.f260X = true;
                }
            }
            int i8 = this.f1386t.f1327c;
            if (i8 == 0) {
                this.f1343D += write;
            }
            if (write == remaining2) {
                if (i8 != 0) {
                    AbstractC1664a.h(byteBuffer == this.f1352M);
                    this.f1344E = (this.f1345F * this.f1353N) + this.f1344E;
                }
                this.f1354O = null;
            }
        }
    }
}
