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
import p155w1.C1010l1;
import p155w1.C1017n0;
import p155w1.C1050x1;
import p155w1.C1052y0;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1340A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f1341B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f1342C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f1343D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f1344E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1345F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f1346G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f1347H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f1348I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f1349J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public InterfaceC0106l[] f1350K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ByteBuffer[] f1351L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ByteBuffer f1352M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f1353N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ByteBuffer f1354O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public byte[] f1355P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f1356Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f1357R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f1358S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f1359T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f1360U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f1361V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f1362W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public v f1363X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f1364Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f1365Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0103i f1366a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1367a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1017n0 f1368b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1369b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f1371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f1372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0106l[] f1373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0106l[] f1374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConditionVariable f1375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f1376i;
    public final ArrayDeque j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1050x1 f1379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0083b f1380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0083b f1381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F f1382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B1.p f1383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1010l1 f1384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public A f1385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public A f1386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AudioTrack f1387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0101g f1388v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B f1389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public B f1390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w0 f1391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer f1392z;

    public E(p151v2.n nVar) {
        int i7 = 2;
        this.f1366a = (C0103i) nVar.f17143b;
        C1017n0 c1017n0 = (C1017n0) nVar.f17144c;
        this.f1368b = c1017n0;
        int i8 = p151v2.t.f17159a;
        this.f1370c = false;
        this.f1377k = false;
        this.f1378l = i8 >= 29 ? nVar.f17142a : 0;
        this.f1382p = (F) nVar.f17145d;
        this.f1375h = new ConditionVariable(true);
        this.f1376i = new u(new C1052y0(this, i7));
        x xVar = new x();
        this.f1371d = xVar;
        N n2 = new N();
        n2.f1460m = p151v2.t.f17164f;
        this.f1372e = n2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new J(), xVar, n2);
        Collections.addAll(arrayList, (InterfaceC0106l[]) c1017n0.f17811b);
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
        return p151v2.t.f17159a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        w0 w0Var;
        boolean z4;
        boolean zT = t();
        C1017n0 c1017n0 = this.f1368b;
        if (zT) {
            w0Var = g().f1334a;
            c1017n0.getClass();
            float f7 = w0Var.f606a;
            M m7 = (M) c1017n0.f17813d;
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
            ((K) c1017n0.f17812c).f1414m = z4;
        } else {
            z4 = false;
        }
        this.j.add(new B(w0Var2, z4, Math.max(0L, j), (i() * 1000000) / ((long) this.f1386t.f1329e)));
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
        C1010l1 c1010l1 = this.f1384r;
        if (c1010l1 != null) {
            P2 p5 = ((H) c1010l1.f17777a).W0;
            Handler handler = (Handler) p5.f17514b;
            if (handler != null) {
                handler.post(new RunnableC0108n(p5, z4, 0));
            }
        }
    }

    public final void b(X x4, int[] iArr) {
        InterfaceC0106l[] interfaceC0106lArr;
        int i7;
        int iIntValue;
        int iIntValue2;
        int i8;
        int i9;
        int i10;
        int i11;
        int iW;
        int iJ;
        int i12;
        int i13;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(x4.f283C);
        int i14 = x4.f297Q;
        int i15 = x4.f296P;
        if (zEquals) {
            int i16 = x4.f298R;
            p151v2.a.f(p151v2.t.C(i16));
            int iW2 = p151v2.t.w(i16, i15);
            InterfaceC0106l[] interfaceC0106lArr2 = (this.f1370c && (i16 == 536870912 || i16 == 805306368 || i16 == 4)) ? this.f1374g : this.f1373f;
            int i17 = x4.f299S;
            N n2 = this.f1372e;
            n2.f1457i = i17;
            n2.j = x4.f300T;
            if (p151v2.t.f17159a < 21 && i15 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i18 = 0; i18 < 6; i18++) {
                    iArr2[i18] = i18;
                }
            } else {
                iArr2 = iArr;
            }
            this.f1371d.f1564i = iArr2;
            C0104j c0104j = new C0104j(i14, i15, i16);
            for (InterfaceC0106l interfaceC0106l : interfaceC0106lArr2) {
                try {
                    C0104j c0104jB = interfaceC0106l.b(c0104j);
                    if (interfaceC0106l.isActive()) {
                        c0104j = c0104jB;
                    }
                } catch (C0105k e7) {
                    throw new o(e7, x4);
                }
            }
            int i19 = c0104j.f1500c;
            int i20 = c0104j.f1499b;
            int iO = p151v2.t.o(i20);
            iW = p151v2.t.w(i19, i20);
            interfaceC0106lArr = interfaceC0106lArr2;
            i7 = iW2;
            i10 = iO;
            i11 = c0104j.f1498a;
            i9 = i19;
            i8 = 0;
        } else {
            interfaceC0106lArr = new InterfaceC0106l[0];
            i7 = -1;
            if (u(x4, this.f1388v)) {
                String str = x4.f283C;
                str.getClass();
                iIntValue = p151v2.i.b(str, x4.f312z);
                iIntValue2 = p151v2.t.o(i15);
                i8 = 1;
            } else {
                Pair pairA = this.f1366a.a(x4);
                if (pairA == null) {
                    throw new o("Unable to configure passthrough for: " + x4, x4);
                }
                iIntValue = ((Integer) pairA.first).intValue();
                iIntValue2 = ((Integer) pairA.second).intValue();
                i8 = 2;
            }
            i9 = iIntValue;
            i10 = iIntValue2;
            i11 = i14;
            iW = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i11, i10, i9);
        p151v2.a.h(minBufferSize != -2);
        double d7 = this.f1377k ? 8.0d : 1.0d;
        this.f1382p.getClass();
        if (i8 == 0) {
            i8 = i8;
            long j = i11;
            long j3 = iW;
            iJ = p151v2.t.j(minBufferSize * 4, Q0.a.g(((((long) 250000) * j) * j3) / 1000000), Q0.a.g(((((long) 750000) * j) * j3) / 1000000));
        } else if (i8 == 1) {
            iJ = Q0.a.g((((long) 50000000) * ((long) F.a(i9))) / 1000000);
        } else {
            if (i8 != 2) {
                throw new IllegalArgumentException();
            }
            iJ = Q0.a.g((((long) (i9 == 5 ? 500000 : 250000)) * ((long) F.a(i9))) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d7)) + iW) - 1) / iW) * iW;
        if (i9 == 0) {
            throw new o("Invalid output encoding (mode=" + i8 + ") for: " + x4, x4);
        }
        if (i10 == 0) {
            throw new o("Invalid output channel config (mode=" + i8 + ") for: " + x4, x4);
        }
        this.f1367a0 = false;
        A a2 = new A(x4, i7, i8, iW, i12, i13, i9, iMax, interfaceC0106lArr);
        if (m()) {
            i12 = i11;
            i13 = i10;
            this.f1385s = a2;
        } else {
            i12 = i11;
            i13 = i10;
            this.f1386t = a2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean c() {
        /*
            r9 = this;
            int r0 = r9.f1357R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f1357R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f1357R
            C1.l[] r5 = r9.f1350K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.p(r7)
            boolean r0 = r4.e()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f1357R
            int r0 = r0 + r1
            r9.f1357R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f1354O
            if (r0 == 0) goto L3b
            r9.v(r0, r7)
            java.nio.ByteBuffer r0 = r9.f1354O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f1357R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.E.c():boolean");
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
                C1050x1 c1050x1 = this.f1379m;
                c1050x1.getClass();
                this.f1387u.unregisterStreamEventCallback((D) c1050x1.f17932c);
                ((Handler) c1050x1.f17931b).removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f1387u;
            this.f1387u = null;
            if (p151v2.t.f17159a < 21 && !this.f1361V) {
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
        if (p151v2.t.C(i7)) {
            return (i7 == 2 || (this.f1370c && i7 == 4)) ? 2 : 1;
        }
        p150v0.a.j(i7, "Invalid PCM encoding: ", "DefaultAudioSink");
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
        A a2 = this.f1386t;
        return a2.f1327c == 0 ? this.f1341B / ((long) a2.f1326b) : this.f1342C;
    }

    public final long i() {
        A a2 = this.f1386t;
        return a2.f1327c == 0 ? this.f1343D / ((long) a2.f1328d) : this.f1344E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x02c4 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
    
        if (r10.a() == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(long j, ByteBuffer byteBuffer, int i7) throws Exception {
        int i8;
        int i9;
        byte b7;
        int i10;
        byte b8;
        int i11;
        ByteBuffer byteBuffer2 = this.f1352M;
        p151v2.a.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
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
        boolean zM = m();
        C0083b c0083b = this.f1380n;
        if (!zM) {
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
            if (this.f1377k && p151v2.t.f17159a >= 23) {
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
        long jI = i();
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
        boolean zB = uVar.b(jI);
        uVar.f1546p = zB;
        if (z7 && !zB && playState != 1) {
            int i12 = uVar.f1536e;
            long jN = p151v2.t.N(uVar.f1540i);
            E e8 = (E) uVar.f1532a.f17938b;
            if (e8.f1384r != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - e8.f1365Z;
                P2 p5 = ((H) e8.f1384r.f17777a).W0;
                Handler handler = (Handler) p5.f17514b;
                if (handler != null) {
                    handler.post(new RunnableC0107m(p5, i12, jN, jElapsedRealtime));
                }
            }
        }
        if (this.f1352M == null) {
            p151v2.a.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            A a7 = this.f1386t;
            if (a7.f1327c != 0 && this.f1345F == 0) {
                int i13 = a7.f1331g;
                int iH = 1024;
                switch (i13) {
                    case 5:
                    case 6:
                    case 18:
                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                            i8 = AbstractC0096b.f1468c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                        } else {
                            i8 = 1536;
                        }
                        iH = i8;
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
                        }
                        break;
                    case 7:
                    case 8:
                        int iPosition = byteBuffer.position();
                        byte b9 = byteBuffer.get(iPosition);
                        if (b9 != -2) {
                            if (b9 == -1) {
                                i9 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b8 = byteBuffer.get(iPosition + 7);
                            } else if (b9 != 31) {
                                i9 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                b7 = byteBuffer.get(iPosition + 5);
                            } else {
                                i9 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                b8 = byteBuffer.get(iPosition + 6);
                            }
                            i10 = b8 & 60;
                            iH = (((i10 >> 2) | i9) + 1) * 32;
                            this.f1345F = iH;
                            if (iH == 0) {
                                return true;
                            }
                        } else {
                            i9 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                            b7 = byteBuffer.get(iPosition + 4);
                        }
                        i10 = b7 & 252;
                        iH = (((i10 >> 2) | i9) + 1) * 32;
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
                        }
                        break;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i14 = p151v2.t.f17159a;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iH = AbstractC0096b.h(iReverseBytes);
                        if (iH == -1) {
                            throw new IllegalArgumentException();
                        }
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
                        }
                        break;
                    case 10:
                    case 16:
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
                        }
                        break;
                    case 11:
                    case 12:
                        iH = 2048;
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
                        }
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(p031e1.k.d(i13, "Unexpected audio encoding: "));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i15 = iPosition3;
                        while (true) {
                            if (i15 <= iLimit) {
                                int i16 = p151v2.t.f17159a;
                                int iReverseBytes2 = byteBuffer.getInt(i15 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i11 = i15 - iPosition3;
                                } else {
                                    i15++;
                                }
                            } else {
                                i11 = -1;
                            }
                        }
                        if (i11 == -1) {
                            iH = 0;
                        } else {
                            i8 = (40 << ((byteBuffer.get((byteBuffer.position() + i11) + ((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            iH = i8;
                        }
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
                        }
                        break;
                    case 15:
                        iH = 512;
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
                        }
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iH = AbstractC0096b.f(new F1.x(bArr, 16)).f1291c;
                        this.f1345F = iH;
                        if (iH == 0) {
                            return true;
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
            long jH = (((h() - this.f1372e.f1462o) * 1000000) / ((long) this.f1386t.f1325a.f297Q)) + this.f1348I;
            if (!this.f1346G && Math.abs(jH - j) > 200000) {
                C1010l1 c1010l1 = this.f1384r;
                StringBuilder sbJ = p031e1.k.j("Unexpected audio track timestamp discontinuity: expected ", ", got ", jH);
                sbJ.append(j);
                c1010l1.A(new q(sbJ.toString()));
                this.f1346G = true;
            }
            if (this.f1346G) {
                if (!c()) {
                    return false;
                }
                long j3 = j - jH;
                this.f1348I += j3;
                this.f1346G = false;
                a(j);
                C1010l1 c1010l2 = this.f1384r;
                if (c1010l2 != null && j3 != 0) {
                    ((H) c1010l2.f17777a).f1401d1 = true;
                }
            }
            if (this.f1386t.f1327c == 0) {
                this.f1341B += (long) byteBuffer.remaining();
            } else {
                this.f1342C = (((long) this.f1345F) * ((long) i7)) + this.f1342C;
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
        long jI2 = i();
        if (uVar.f1555y == -9223372036854775807L || jI2 <= 0 || SystemClock.elapsedRealtime() - uVar.f1555y < 200) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        d();
        return true;
    }

    public final boolean k() {
        return m() && this.f1376i.b(i());
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    public final void l() throws p {
        AudioTrack audioTrackA;
        B1.p pVar;
        this.f1375h.block();
        try {
            A a2 = this.f1386t;
            a2.getClass();
            try {
                audioTrackA = a2.a(this.f1364Y, this.f1388v, this.f1362W);
                this.f1387u = audioTrackA;
                if (n(audioTrackA)) {
                    AudioTrack audioTrack = this.f1387u;
                    if (this.f1379m == null) {
                        this.f1379m = new C1050x1(this);
                    }
                    C1050x1 c1050x1 = this.f1379m;
                    Handler handler = (Handler) c1050x1.f17931b;
                    Objects.requireNonNull(handler);
                    audioTrack.registerStreamEventCallback(new C(handler), (D) c1050x1.f17932c);
                    if (this.f1378l != 3) {
                        AudioTrack audioTrack2 = this.f1387u;
                        X x4 = this.f1386t.f1325a;
                        audioTrack2.setOffloadDelayPadding(x4.f299S, x4.f300T);
                    }
                }
                int i7 = p151v2.t.f17159a;
                if (i7 >= 31 && (pVar = this.f1383q) != null) {
                    z.a(this.f1387u, pVar);
                }
                this.f1362W = this.f1387u.getAudioSessionId();
                AudioTrack audioTrack3 = this.f1387u;
                A a4 = this.f1386t;
                boolean z4 = a4.f1327c == 2;
                u uVar = this.f1376i;
                uVar.f1534c = audioTrack3;
                int i8 = a4.f1328d;
                uVar.f1535d = i8;
                int i9 = a4.f1332h;
                uVar.f1536e = i9;
                uVar.f1537f = new t(audioTrack3);
                uVar.f1538g = audioTrack3.getSampleRate();
                int i10 = a4.f1331g;
                uVar.f1539h = z4 && i7 < 23 && (i10 == 5 || i10 == 6);
                boolean zC = p151v2.t.C(i10);
                uVar.f1547q = zC;
                uVar.f1540i = zC ? (((long) (i9 / i8)) * 1000000) / ((long) uVar.f1538g) : -9223372036854775807L;
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
                        AudioTrack audioTrack4 = this.f1387u;
                        float f7 = this.f1349J;
                        audioTrack4.setStereoVolume(f7, f7);
                    }
                }
                this.f1363X.getClass();
                this.f1347H = true;
            } catch (p e7) {
                C1010l1 c1010l1 = this.f1384r;
                if (c1010l1 != null) {
                    c1010l1.A(e7);
                }
                throw e7;
            }
        } catch (p e8) {
            A a7 = this.f1386t;
            if (a7.f1332h > 1000000) {
                A a8 = new A(a7.f1325a, a7.f1326b, a7.f1327c, a7.f1328d, a7.f1329e, a7.f1330f, a7.f1331g, 1000000, a7.f1333i);
                try {
                    try {
                        AudioTrack audioTrackA2 = a8.a(this.f1364Y, this.f1388v, this.f1362W);
                        this.f1386t = a8;
                        audioTrackA = audioTrackA2;
                    } catch (p e9) {
                        C1010l1 c1010l2 = this.f1384r;
                        if (c1010l2 != null) {
                            c1010l2.A(e9);
                        }
                        throw e9;
                    }
                } catch (p e10) {
                    e8.addSuppressed(e10);
                    if (this.f1386t.f1327c == 1) {
                        throw e8;
                    }
                    this.f1367a0 = true;
                    throw e8;
                }
            }
            if (this.f1386t.f1327c == 1) {
                throw e8;
            }
            this.f1367a0 = true;
            throw e8;
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
        long jI = i();
        u uVar = this.f1376i;
        uVar.f1556z = uVar.a();
        uVar.f1554x = SystemClock.elapsedRealtime() * 1000;
        uVar.f1526A = jI;
        this.f1387u.stop();
        this.f1340A = 0;
    }

    public final void p(long j) throws Exception {
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
                ByteBuffer byteBufferA = interfaceC0106l.a();
                this.f1351L[i7] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
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
        B bG = g();
        if (w0Var.equals(bG.f1334a) && z4 == bG.f1335b) {
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
                p151v2.a.G(e7, "DefaultAudioSink", "Failed to set playback params");
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
                int i8 = p151v2.t.f17159a;
                if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean u(X x4, C0101g c0101g) {
        int i7;
        int iO;
        int playbackOffloadSupport;
        int i8 = p151v2.t.f17159a;
        if (i8 < 29 || (i7 = this.f1378l) == 0) {
            return false;
        }
        String str = x4.f283C;
        str.getClass();
        int iB = p151v2.i.b(str, x4.f312z);
        if (iB == 0 || (iO = p151v2.t.o(x4.f296P)) == 0) {
            return false;
        }
        AudioFormat audioFormatE = e(x4.f297Q, iO, iB);
        AudioAttributes audioAttributes = (AudioAttributes) c0101g.a().f16597b;
        if (i8 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributes)) {
            playbackOffloadSupport = (i8 == 30 && p151v2.t.f17162d.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((x4.f299S != 0 || x4.f300T != 0) && (i7 == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    public final void v(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        C1010l1 c1010l1;
        O o7;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f1354O;
            if (byteBuffer2 != null) {
                p151v2.a.f(byteBuffer2 == byteBuffer);
            } else {
                this.f1354O = byteBuffer;
                if (p151v2.t.f17159a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f1355P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f1355P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f1355P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f1356Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i7 = p151v2.t.f17159a;
            if (i7 < 21) {
                long j3 = this.f1343D;
                u uVar = this.f1376i;
                int iA = uVar.f1536e - ((int) (j3 - (uVar.a() * ((long) uVar.f1535d))));
                if (iA > 0) {
                    iWrite = this.f1387u.write(this.f1355P, this.f1356Q, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.f1356Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f1364Y) {
                p151v2.a.h(j != -9223372036854775807L);
                AudioTrack audioTrack = this.f1387u;
                if (i7 >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j * 1000);
                } else {
                    if (this.f1392z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f1392z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f1392z.putInt(1431633921);
                    }
                    if (this.f1340A == 0) {
                        this.f1392z.putInt(4, iRemaining2);
                        this.f1392z.putLong(8, j * 1000);
                        this.f1392z.position(0);
                        this.f1340A = iRemaining2;
                    }
                    int iRemaining3 = this.f1392z.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f1340A = 0;
                        } else {
                            this.f1340A -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f1392z, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f1340A = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f1340A = 0;
                            } else {
                                this.f1340A -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f1387u.write(byteBuffer, iRemaining2, 1);
            }
            this.f1365Z = SystemClock.elapsedRealtime();
            C0083b c0083b = this.f1381o;
            if (iWrite < 0) {
                boolean z4 = (i7 >= 24 && iWrite == -6) || iWrite == -32;
                if (z4 && this.f1386t.f1327c == 1) {
                    this.f1367a0 = true;
                }
                r rVar = new r(iWrite, this.f1386t.f1325a, z4);
                C1010l1 c1010l2 = this.f1384r;
                if (c1010l2 != null) {
                    c1010l2.A(rVar);
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
                if (this.f1360U && (c1010l1 = this.f1384r) != null && iWrite < iRemaining2 && !this.f1369b0 && (o7 = ((H) c1010l1.f17777a).f1403f1) != null) {
                    o7.f181a.f260X = true;
                }
            }
            int i8 = this.f1386t.f1327c;
            if (i8 == 0) {
                this.f1343D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i8 != 0) {
                    p151v2.a.h(byteBuffer == this.f1352M);
                    this.f1344E = (((long) this.f1345F) * ((long) this.f1353N)) + this.f1344E;
                }
                this.f1354O = null;
            }
        }
    }
}
