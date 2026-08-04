package A1;

import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import W5.AbstractC0486a1;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p018c2.AbstractC0755a;
import p018c2.C0756b;
import p146u2.C0955n;
import p146u2.C0960t;
import p146u2.InterfaceC0947f;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Handler.Callback, p018c2.A, B0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Looper f237A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Q0 f238B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final P0 f239C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f240D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0035o f241E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f242F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p151v2.p f243G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final A f244H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0034n0 f245I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0043s0 f246J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0031m f247K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final long f248L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public H0 f249M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public v0 f250N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Q f251O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f252P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f254R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f255S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f256T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f257U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f258V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f259W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f260X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f261Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f262Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0023i[] f263a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public T f264a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f265b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f266b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0023i[] f267c;
    public int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p139t2.s f268d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f269d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p139t2.w f270e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public r f271e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0033n f272f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC0947f f274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p151v2.r f275y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HandlerThread f276z;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f253Q = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f273f0 = -9223372036854775807L;

    public U(AbstractC0023i[] abstractC0023iArr, p139t2.s sVar, p139t2.w wVar, C0033n c0033n, InterfaceC0947f interfaceC0947f, int i7, boolean z4, B1.h hVar, H0 h6, C0031m c0031m, long j, Looper looper, p151v2.p pVar, A a2, B1.p pVar2) {
        this.f244H = a2;
        this.f263a = abstractC0023iArr;
        this.f268d = sVar;
        this.f270e = wVar;
        this.f272f = c0033n;
        this.f274x = interfaceC0947f;
        this.f257U = i7;
        this.f258V = z4;
        this.f249M = h6;
        this.f247K = c0031m;
        this.f248L = j;
        this.f243G = pVar;
        this.f240D = c0033n.f505h;
        v0 v0VarI = v0.i(wVar);
        this.f250N = v0VarI;
        this.f251O = new Q(v0VarI);
        this.f267c = new AbstractC0023i[abstractC0023iArr.length];
        for (int i8 = 0; i8 < abstractC0023iArr.length; i8++) {
            AbstractC0023i abstractC0023i = abstractC0023iArr[i8];
            abstractC0023i.f378d = i8;
            abstractC0023i.f379e = pVar2;
            this.f267c[i8] = abstractC0023i;
        }
        this.f241E = new C0035o(this, pVar);
        this.f242F = new ArrayList();
        this.f265b = Collections.newSetFromMap(new IdentityHashMap());
        this.f238B = new Q0();
        this.f239C = new P0();
        sVar.f16400a = this;
        sVar.f16401b = interfaceC0947f;
        this.f269d0 = true;
        Handler handler = new Handler(looper);
        this.f245I = new C0034n0(hVar, handler);
        this.f246J = new C0043s0(this, hVar, handler, pVar2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f276z = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f237A = looper2;
        this.f275y = pVar.a(looper2, this);
    }

    public static Pair E(R0 r7, T t7, boolean z4, int i7, boolean z7, Q0 q1, P0 p5) {
        Object objF;
        R0 r8 = t7.f232a;
        if (r7.p()) {
            return null;
        }
        R0 r9 = r8.p() ? r7 : r8;
        try {
            Pair pairI = r9.i(q1, p5, t7.f233b, t7.f234c);
            if (r7.equals(r9)) {
                return pairI;
            }
            if (r7.b(pairI.first) != -1) {
                return (r9.g(pairI.first, p5).f191f && r9.m(p5.f188c, q1, 0L).f208F == r9.b(pairI.first)) ? r7.i(q1, p5, r7.g(pairI.first, p5).f188c, t7.f234c) : pairI;
            }
            if (z4 && (objF = F(q1, p5, i7, z7, pairI.first, r9, r7)) != null) {
                return r7.i(q1, p5, r7.g(objF, p5).f188c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object F(Q0 q1, P0 p5, int i7, boolean z4, Object obj, R0 r7, R0 r8) {
        int iB = r7.b(obj);
        int iH = r7.h();
        int iD = iB;
        int iB2 = -1;
        for (int i8 = 0; i8 < iH && iB2 == -1; i8++) {
            iD = r7.d(iD, p5, q1, i7, z4);
            if (iD == -1) {
                break;
            }
            iB2 = r8.b(r7.l(iD));
        }
        if (iB2 == -1) {
            return null;
        }
        return r8.l(iB2);
    }

    public static void M(AbstractC0023i abstractC0023i, long j) {
        abstractC0023i.f373B = true;
        if (abstractC0023i instanceof p068j2.k) {
            p068j2.k kVar = (p068j2.k) abstractC0023i;
            p151v2.a.h(kVar.f373B);
            kVar.f14626R = j;
        }
    }

    public static boolean q(AbstractC0023i abstractC0023i) {
        return abstractC0023i.f380f != 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[PHI: r5 r6 r8
      0x00c2: PHI (r5v4 c2.D) = (r5v3 c2.D), (r5v10 c2.D) binds: [B:35:0x0096, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r6v2 long) = (r6v1 long), (r6v7 long) binds: [B:35:0x0096, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r8v3 long) = (r8v2 long), (r8v6 long) binds: [B:35:0x0096, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    public final void A(boolean z4, boolean z7, boolean z8, boolean z9) {
        long j;
        boolean z10;
        List list;
        this.f275y.f17154a.removeMessages(2);
        this.f271e0 = null;
        this.f255S = false;
        C0035o c0035o = this.f241E;
        c0035o.f524f = false;
        p151v2.o oVar = c0035o.f519a;
        if (oVar.f17147b) {
            oVar.c(oVar.a());
            oVar.f17147b = false;
        }
        this.f266b0 = 1000000000000L;
        for (AbstractC0023i abstractC0023i : this.f263a) {
            try {
                c(abstractC0023i);
            } catch (r | RuntimeException e7) {
                p151v2.a.l("ExoPlayerImplInternal", "Disable failed.", e7);
            }
        }
        if (z4) {
            for (AbstractC0023i abstractC0023i2 : this.f263a) {
                if (this.f265b.remove(abstractC0023i2)) {
                    try {
                        abstractC0023i2.x();
                    } catch (RuntimeException e8) {
                        p151v2.a.l("ExoPlayerImplInternal", "Reset failed.", e8);
                    }
                }
            }
        }
        this.f262Z = 0;
        v0 v0Var = this.f250N;
        p018c2.D d7 = v0Var.f586b;
        long jLongValue = v0Var.f602s;
        if (this.f250N.f586b.a()) {
            j = this.f250N.f587c;
        } else {
            v0 v0Var2 = this.f250N;
            P0 p5 = this.f239C;
            p018c2.D d8 = v0Var2.f586b;
            R0 r7 = v0Var2.f585a;
            if (r7.p() || r7.g(d8.f10161a, p5).f191f) {
                j = this.f250N.f587c;
            } else {
                j = this.f250N.f602s;
            }
        }
        if (z7) {
            this.f264a0 = null;
            Pair pairH = h(this.f250N.f585a);
            d7 = (p018c2.D) pairH.first;
            jLongValue = ((Long) pairH.second).longValue();
            j = -9223372036854775807L;
            z10 = d7.equals(this.f250N.f586b) ? false : true;
        }
        p018c2.D d9 = d7;
        long j3 = jLongValue;
        this.f245I.b();
        this.f256T = false;
        v0 v0Var3 = this.f250N;
        R0 r8 = v0Var3.f585a;
        int i7 = v0Var3.f589e;
        r rVar = z9 ? null : v0Var3.f590f;
        p018c2.f0 f0Var = z10 ? p018c2.f0.f10346d : v0Var3.f592h;
        p139t2.w wVar = z10 ? this.f270e : v0Var3.f593i;
        if (z10) {
            C0165x c0165x = AbstractC0167z.f2083b;
            list = E3.L.f2000e;
        } else {
            list = v0Var3.j;
        }
        this.f250N = new v0(r8, d9, j, j3, i7, rVar, false, f0Var, wVar, list, d9, v0Var3.f595l, v0Var3.f596m, v0Var3.f597n, j3, 0L, j3, this.f261Y, false);
        if (z8) {
            C0043s0 c0043s0 = this.f246J;
            HashMap map = (HashMap) c0043s0.f556f;
            for (C0040q0 c0040q0 : map.values()) {
                try {
                    c0040q0.f532a.m(c0040q0.f533b);
                } catch (RuntimeException e9) {
                    p151v2.a.l("MediaSourceList", "Failed to release child source.", e9);
                }
                AbstractC0755a abstractC0755a = c0040q0.f532a;
                p072k1.g gVar = c0040q0.f534c;
                abstractC0755a.p(gVar);
                c0040q0.f532a.o(gVar);
            }
            map.clear();
            ((HashSet) c0043s0.j).clear();
            c0043s0.f552b = false;
        }
    }

    public final void B() {
        C0028k0 c0028k0 = this.f245I.f514h;
        this.f254R = c0028k0 != null && c0028k0.f453f.f474h && this.f253Q;
    }

    public final void C(long j) {
        C0028k0 c0028k0 = this.f245I.f514h;
        long j3 = j + (c0028k0 == null ? 1000000000000L : c0028k0.f461o);
        this.f266b0 = j3;
        this.f241E.f519a.c(j3);
        for (AbstractC0023i abstractC0023i : this.f263a) {
            if (q(abstractC0023i)) {
                long j7 = this.f266b0;
                abstractC0023i.f373B = false;
                abstractC0023i.f372A = j7;
                abstractC0023i.p(j7, false);
            }
        }
        for (C0028k0 c0028k1 = r0.f514h; c0028k1 != null; c0028k1 = c0028k1.f458l) {
            for (p139t2.c cVar : c0028k1.f460n.f16451c) {
            }
        }
    }

    public final void D(R0 r7, R0 r8) {
        if (r7.p() && r8.p()) {
            return;
        }
        ArrayList arrayList = this.f242F;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0486a1.n(arrayList.get(size));
            throw null;
        }
    }

    public final void G(long j, long j3) {
        p151v2.r rVar = this.f275y;
        rVar.f17154a.removeMessages(2);
        rVar.f17154a.sendEmptyMessageAtTime(2, j + j3);
    }

    public final void H(boolean z4) throws r {
        p018c2.D d7 = this.f245I.f514h.f453f.f467a;
        long J5 = J(d7, this.f250N.f602s, true, false);
        if (J5 != this.f250N.f602s) {
            v0 v0Var = this.f250N;
            this.f250N = o(d7, J5, v0Var.f587c, v0Var.f588d, z4, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [c2.B, java.lang.Object] */
    public final void I(T t7) throws Throwable {
        long j;
        long j3;
        boolean z4;
        p018c2.D d7;
        long j7;
        long j8;
        long j9;
        v0 v0Var;
        int i7;
        this.f251O.a(1);
        Pair pairE = E(this.f250N.f585a, t7, true, this.f257U, this.f258V, this.f238B, this.f239C);
        if (pairE == null) {
            Pair pairH = h(this.f250N.f585a);
            d7 = (p018c2.D) pairH.first;
            long jLongValue = ((Long) pairH.second).longValue();
            z4 = !this.f250N.f585a.p();
            j = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            Object obj = pairE.first;
            long jLongValue2 = ((Long) pairE.second).longValue();
            long j10 = t7.f234c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            p018c2.D dM = this.f245I.m(this.f250N.f585a, obj, jLongValue2);
            if (dM.a()) {
                this.f250N.f585a.g(dM.f10161a, this.f239C);
                j = this.f239C.f(dM.f10162b) == dM.f10163c ? this.f239C.f192x.f12391b : 0L;
                j3 = j10;
                d7 = dM;
                z4 = true;
            } else {
                j = jLongValue2;
                j3 = j10;
                z4 = t7.f234c == -9223372036854775807L;
                d7 = dM;
            }
        }
        try {
            if (!this.f250N.f585a.p()) {
                if (pairE == null) {
                    if (this.f250N.f589e != 1) {
                        W(4);
                    }
                    A(false, true, false, true);
                } else {
                    if (d7.equals(this.f250N.f586b)) {
                        C0028k0 c0028k0 = this.f245I.f514h;
                        long jO = (c0028k0 == null || !c0028k0.f451d || j == 0) ? j : c0028k0.f448a.o(j, this.f249M);
                        if (p151v2.t.N(jO) == p151v2.t.N(this.f250N.f602s) && ((i7 = (v0Var = this.f250N).f589e) == 2 || i7 == 3)) {
                            long j11 = v0Var.f602s;
                            this.f250N = o(d7, j11, j3, j11, z4, 2);
                            return;
                        }
                        j8 = jO;
                    } else {
                        j8 = j;
                    }
                    boolean z7 = this.f250N.f589e == 4;
                    C0034n0 c0034n0 = this.f245I;
                    long J5 = J(d7, j8, c0034n0.f514h != c0034n0.f515i, z7);
                    boolean z8 = (j != J5) | z4;
                    try {
                        v0 v0Var2 = this.f250N;
                        R0 r7 = v0Var2.f585a;
                        f0(r7, d7, r7, v0Var2.f586b, j3);
                        z4 = z8;
                        j9 = J5;
                    } catch (Throwable th) {
                        th = th;
                        z4 = z8;
                        j7 = J5;
                        this.f250N = o(d7, j7, j3, j7, z4, 2);
                        throw th;
                    }
                }
                this.f250N = o(d7, j9, j3, j9, z4, 2);
            }
            this.f264a0 = t7;
            j9 = j;
            this.f250N = o(d7, j9, j3, j9, z4, 2);
        } catch (Throwable th2) {
            th = th2;
            j7 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [c2.B, java.lang.Object] */
    public final long J(p018c2.D d7, long j, boolean z4, boolean z7) throws r {
        b0();
        this.f255S = false;
        if (z7 || this.f250N.f589e == 3) {
            W(2);
        }
        C0034n0 c0034n0 = this.f245I;
        C0028k0 c0028k0 = c0034n0.f514h;
        C0028k0 c0028k1 = c0028k0;
        while (c0028k1 != null && !d7.equals(c0028k1.f453f.f467a)) {
            c0028k1 = c0028k1.f458l;
        }
        if (z4 || c0028k0 != c0028k1 || (c0028k1 != null && c0028k1.f461o + j < 0)) {
            AbstractC0023i[] abstractC0023iArr = this.f263a;
            for (AbstractC0023i abstractC0023i : abstractC0023iArr) {
                c(abstractC0023i);
            }
            if (c0028k1 != null) {
                while (c0034n0.f514h != c0028k1) {
                    c0034n0.a();
                }
                c0034n0.k(c0028k1);
                c0028k1.f461o = 1000000000000L;
                e(new boolean[abstractC0023iArr.length]);
            }
        }
        if (c0028k1 != null) {
            c0034n0.k(c0028k1);
            if (!c0028k1.f451d) {
                c0028k1.f453f = c0028k1.f453f.b(j);
            } else if (c0028k1.f452e) {
                ?? r9 = c0028k1.f448a;
                j = r9.v(j);
                r9.w(j - this.f240D);
            }
            C(j);
            s();
        } else {
            c0034n0.b();
            C(j);
        }
        k(false);
        this.f275y.c(2);
        return j;
    }

    public final void K(D0 d7) {
        Looper looper = d7.f81f;
        Looper looper2 = this.f237A;
        p151v2.r rVar = this.f275y;
        if (looper != looper2) {
            rVar.a(15, d7).b();
            return;
        }
        synchronized (d7) {
        }
        try {
            d7.f76a.c(d7.f79d, d7.f80e);
            d7.b(true);
            int i7 = this.f250N.f589e;
            if (i7 == 3 || i7 == 2) {
                rVar.c(2);
            }
        } catch (Throwable th) {
            d7.b(true);
            throw th;
        }
    }

    public final void L(D0 d7) {
        Looper looper = d7.f81f;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            d7.b(false);
        } else {
            p151v2.r rVarA = this.f243G.a(looper, null);
            rVarA.f17154a.post(new A0.f(2, this, d7));
        }
    }

    public final void N(boolean z4, AtomicBoolean atomicBoolean) {
        if (this.f259W != z4) {
            this.f259W = z4;
            if (!z4) {
                for (AbstractC0023i abstractC0023i : this.f263a) {
                    if (!q(abstractC0023i) && this.f265b.remove(abstractC0023i)) {
                        abstractC0023i.x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(P p5) throws Throwable {
        this.f251O.a(1);
        int i7 = p5.f184c;
        ArrayList arrayList = p5.f182a;
        p018c2.Z z4 = p5.f183b;
        if (i7 != -1) {
            this.f264a0 = new T(new E0(arrayList, z4), p5.f184c, p5.f185d);
        }
        C0043s0 c0043s0 = this.f246J;
        ArrayList arrayList2 = (ArrayList) c0043s0.f554d;
        c0043s0.k(0, arrayList2.size());
        l(c0043s0.a(arrayList2.size(), arrayList, z4), false);
    }

    public final void P(boolean z4) {
        if (z4 == this.f261Y) {
            return;
        }
        this.f261Y = z4;
        v0 v0Var = this.f250N;
        int i7 = v0Var.f589e;
        if (z4 || i7 == 4 || i7 == 1) {
            this.f250N = v0Var.c(z4);
        } else {
            this.f275y.c(2);
        }
    }

    public final void Q(boolean z4) throws r {
        this.f253Q = z4;
        B();
        if (this.f254R) {
            C0034n0 c0034n0 = this.f245I;
            if (c0034n0.f515i != c0034n0.f514h) {
                H(true);
                k(false);
            }
        }
    }

    public final void R(int i7, int i8, boolean z4, boolean z7) {
        this.f251O.a(z7 ? 1 : 0);
        Q q7 = this.f251O;
        q7.f193a = true;
        q7.f198f = true;
        q7.f197e = i8;
        this.f250N = this.f250N.d(i7, z4);
        this.f255S = false;
        for (C0028k0 c0028k0 = this.f245I.f514h; c0028k0 != null; c0028k0 = c0028k0.f458l) {
            for (p139t2.c cVar : c0028k0.f460n.f16451c) {
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i9 = this.f250N.f589e;
        p151v2.r rVar = this.f275y;
        if (i9 == 3) {
            Z();
            rVar.c(2);
        } else if (i9 == 2) {
            rVar.c(2);
        }
    }

    public final void S(w0 w0Var) {
        C0035o c0035o = this.f241E;
        c0035o.b(w0Var);
        w0 w0VarD = c0035o.d();
        n(w0VarD, w0VarD.f606a, true, true);
    }

    public final void T(int i7) throws r {
        this.f257U = i7;
        R0 r7 = this.f250N.f585a;
        C0034n0 c0034n0 = this.f245I;
        c0034n0.f512f = i7;
        if (!c0034n0.n(r7)) {
            H(true);
        }
        k(false);
    }

    public final void U(boolean z4) throws r {
        this.f258V = z4;
        R0 r7 = this.f250N.f585a;
        C0034n0 c0034n0 = this.f245I;
        c0034n0.f513g = z4;
        if (!c0034n0.n(r7)) {
            H(true);
        }
        k(false);
    }

    public final void V(p018c2.Z z4) throws Throwable {
        this.f251O.a(1);
        C0043s0 c0043s0 = this.f246J;
        int size = ((ArrayList) c0043s0.f554d).size();
        if (z4.f10294b.length != size) {
            z4 = z4.a().b(0, size);
        }
        c0043s0.f560k = z4;
        l(c0043s0.b(), false);
    }

    public final void W(int i7) {
        v0 v0Var = this.f250N;
        if (v0Var.f589e != i7) {
            if (i7 != 2) {
                this.f273f0 = -9223372036854775807L;
            }
            this.f250N = v0Var.g(i7);
        }
    }

    public final boolean X() {
        v0 v0Var = this.f250N;
        return v0Var.f595l && v0Var.f596m == 0;
    }

    public final boolean Y(R0 r7, p018c2.D d7) {
        if (d7.a() || r7.p()) {
            return false;
        }
        int i7 = r7.g(d7.f10161a, this.f239C).f188c;
        Q0 q1 = this.f238B;
        r7.n(i7, q1);
        return q1.a() && q1.f219z && q1.f216f != -9223372036854775807L;
    }

    public final void Z() {
        this.f255S = false;
        C0035o c0035o = this.f241E;
        c0035o.f524f = true;
        c0035o.f519a.e();
        for (AbstractC0023i abstractC0023i : this.f263a) {
            if (q(abstractC0023i)) {
                p151v2.a.h(abstractC0023i.f380f == 1);
                abstractC0023i.f380f = 2;
                abstractC0023i.r();
            }
        }
    }

    public final void a(P p5, int i7) throws Throwable {
        this.f251O.a(1);
        C0043s0 c0043s0 = this.f246J;
        if (i7 == -1) {
            i7 = ((ArrayList) c0043s0.f554d).size();
        }
        l(c0043s0.a(i7, p5.f182a, p5.f183b), false);
    }

    public final void a0(boolean z4, boolean z7) {
        A(z4 || !this.f259W, false, true, false);
        this.f251O.a(z7 ? 1 : 0);
        this.f272f.b(true);
        W(1);
    }

    @Override // p018c2.X
    public final void b(p018c2.Y y4) {
        this.f275y.a(9, (p018c2.B) y4).b();
    }

    public final void b0() {
        int i7;
        C0035o c0035o = this.f241E;
        c0035o.f524f = false;
        p151v2.o oVar = c0035o.f519a;
        if (oVar.f17147b) {
            oVar.c(oVar.a());
            oVar.f17147b = false;
        }
        for (AbstractC0023i abstractC0023i : this.f263a) {
            if (q(abstractC0023i) && (i7 = abstractC0023i.f380f) == 2) {
                p151v2.a.h(i7 == 2);
                abstractC0023i.f380f = 1;
                abstractC0023i.s();
            }
        }
    }

    public final void c(AbstractC0023i abstractC0023i) {
        if (q(abstractC0023i)) {
            C0035o c0035o = this.f241E;
            if (abstractC0023i == c0035o.f521c) {
                c0035o.f522d = null;
                c0035o.f521c = null;
                c0035o.f523e = true;
            }
            int i7 = abstractC0023i.f380f;
            if (i7 == 2) {
                p151v2.a.h(i7 == 2);
                abstractC0023i.f380f = 1;
                abstractC0023i.s();
            }
            p151v2.a.h(abstractC0023i.f380f == 1);
            abstractC0023i.f376b.k();
            abstractC0023i.f380f = 0;
            abstractC0023i.f381x = null;
            abstractC0023i.f382y = null;
            abstractC0023i.f373B = false;
            abstractC0023i.n();
            this.f262Z--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [c2.Y, java.lang.Object] */
    public final void c0() {
        C0028k0 c0028k0 = this.f245I.j;
        boolean z4 = this.f256T || (c0028k0 != null && c0028k0.f448a.isLoading());
        v0 v0Var = this.f250N;
        if (z4 != v0Var.f591g) {
            this.f250N = new v0(v0Var.f585a, v0Var.f586b, v0Var.f587c, v0Var.f588d, v0Var.f589e, v0Var.f590f, z4, v0Var.f592h, v0Var.f593i, v0Var.j, v0Var.f594k, v0Var.f595l, v0Var.f596m, v0Var.f597n, v0Var.f600q, v0Var.f601r, v0Var.f602s, v0Var.f598o, v0Var.f599p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:211:0x0348  */
    /* JADX WARN: Code duplicated, block: B:285:0x045c  */
    /* JADX WARN: Code duplicated, block: B:287:0x0463  */
    /* JADX WARN: Code duplicated, block: B:289:0x0467  */
    /* JADX WARN: Code duplicated, block: B:291:0x046f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x0471  */
    /* JADX WARN: Code duplicated, block: B:293:0x0476  */
    /* JADX WARN: Code duplicated, block: B:295:0x047a  */
    /* JADX WARN: Code duplicated, block: B:296:0x047c  */
    /* JADX WARN: Code duplicated, block: B:298:0x048c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0491  */
    /* JADX WARN: Code duplicated, block: B:302:0x0498  */
    /* JADX WARN: Code duplicated, block: B:309:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:312:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:315:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:317:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:348:0x052c  */
    /* JADX WARN: Code duplicated, block: B:351:0x0531  */
    /* JADX WARN: Code duplicated, block: B:353:0x053d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0541  */
    /* JADX WARN: Code duplicated, block: B:357:0x0549  */
    /* JADX WARN: Code duplicated, block: B:365:0x0564  */
    /* JADX WARN: Code duplicated, block: B:367:0x056a  */
    /* JADX WARN: Code duplicated, block: B:369:0x0572 A[LOOP:6: B:368:0x0570->B:369:0x0572, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:374:0x0588  */
    /* JADX WARN: Code duplicated, block: B:376:0x0593  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:386:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:388:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:391:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:400:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:402:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:403:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:406:0x0608  */
    /* JADX WARN: Code duplicated, block: B:410:0x0622  */
    /* JADX WARN: Code duplicated, block: B:426:0x0653  */
    /* JADX WARN: Code duplicated, block: B:429:0x065c  */
    /* JADX WARN: Code duplicated, block: B:433:0x066b  */
    /* JADX WARN: Code duplicated, block: B:436:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:460:0x05cf A[EDGE_INSN: B:460:0x05cf->B:393:0x05cf BREAK  A[LOOP:4: B:384:0x05a6->B:392:0x05ca], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x05ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Instruction removed from duplicated block: B:367:0x056a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [c2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [c2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71, types: [c2.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [c2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v83, types: [c2.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [c2.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [c2.B, java.lang.Object] */
    public final void d() throws r {
        boolean z4;
        boolean z7;
        boolean z8;
        long j;
        boolean z9;
        v0 v0Var;
        C0028k0 c0028k0;
        C0031m c0031m;
        long j3;
        long j7;
        int i7;
        R0 r7;
        C0034n0 c0034n0;
        long j8;
        C0028k0 c0028k1;
        boolean z10;
        boolean z11;
        boolean zR;
        int i8;
        boolean z12;
        boolean z13;
        v0 v0Var2;
        int i9;
        boolean z14;
        v0 v0Var3;
        boolean z15;
        boolean z16;
        int i10;
        AbstractC0023i[] abstractC0023iArr;
        v0 v0Var4;
        C0028k0 c0028k2;
        p018c2.W w7;
        int i11;
        C0034n0 c0034n1;
        C0028k0 c0028k3;
        C0028k0 c0028k4;
        boolean z17;
        AbstractC0023i[] abstractC0023iArr2;
        U u4 = this;
        u4.f243G.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (u4.f250N.f585a.p() || !u4.f246J.f552b) {
            z4 = true;
        } else {
            C0034n0 c0034n2 = u4.f245I;
            long j9 = u4.f266b0;
            C0028k0 c0028k5 = c0034n2.j;
            if (c0028k5 != null) {
                p151v2.a.h(c0028k5.f458l == null);
                if (c0028k5.f451d) {
                    c0028k5.f448a.Y(j9 - c0028k5.f461o);
                }
            }
            C0034n0 c0034n3 = u4.f245I;
            C0028k0 c0028k6 = c0034n3.j;
            if (c0028k6 == null || (!c0028k6.f453f.f475i && c0028k6.f451d && ((!c0028k6.f452e || c0028k6.f448a.T() == Long.MIN_VALUE) && c0034n3.j.f453f.f471e != -9223372036854775807L && c0034n3.f516k < 100))) {
                C0034n0 c0034n4 = u4.f245I;
                long j10 = u4.f266b0;
                v0 v0Var5 = u4.f250N;
                C0028k0 c0028k7 = c0034n4.j;
                C0030l0 c0030l0D = c0028k7 == null ? c0034n4.d(v0Var5.f585a, v0Var5.f586b, v0Var5.f587c, v0Var5.f602s) : c0034n4.c(v0Var5.f585a, c0028k7, j10);
                if (c0030l0D != null) {
                    C0034n0 c0034n5 = u4.f245I;
                    AbstractC0023i[] abstractC0023iArr3 = u4.f267c;
                    p139t2.s sVar = u4.f268d;
                    p146u2.r rVar = u4.f272f.f498a;
                    C0043s0 c0043s0 = u4.f246J;
                    p139t2.w wVar = u4.f270e;
                    C0028k0 c0028k8 = c0034n5.j;
                    C0028k0 c0028k9 = new C0028k0(abstractC0023iArr3, c0028k8 == null ? 1000000000000L : (c0028k8.f461o + c0028k8.f453f.f471e) - c0030l0D.f468b, sVar, rVar, c0043s0, c0030l0D, wVar);
                    C0028k0 c0028k10 = c0034n5.j;
                    if (c0028k10 == null) {
                        c0034n5.f514h = c0028k9;
                        c0034n5.f515i = c0028k9;
                    } else if (c0028k9 != c0028k10.f458l) {
                        c0028k10.b();
                        c0028k10.f458l = c0028k9;
                        c0028k10.c();
                    }
                    c0034n5.f517l = null;
                    c0034n5.j = c0028k9;
                    c0034n5.f516k++;
                    c0034n5.j();
                    u4 = this;
                    c0028k9.f448a.p(u4, c0030l0D.f468b);
                    if (u4.f245I.f514h == c0028k9) {
                        u4.C(c0030l0D.f468b);
                    }
                    i11 = 0;
                    u4.k(false);
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            if (u4.f256T) {
                u4.f256T = p();
                c0();
            } else {
                s();
            }
            C0034n0 c0034n6 = u4.f245I;
            C0028k0 c0028k11 = c0034n6.f515i;
            if (c0028k11 == null) {
                break;
            }
            C0028k0 c0028k12 = c0028k11.f458l;
            AbstractC0023i[] abstractC0023iArr4 = u4.f263a;
            if (c0028k12 != null && !u4.f254R) {
                if (!c0028k11.f451d) {
                    break;
                    break;
                }
                int i12 = i11;
                while (true) {
                    if (i12 >= abstractC0023iArr4.length) {
                        C0028k0 c0028k13 = c0028k11.f458l;
                        if (c0028k13.f451d || u4.f266b0 >= c0028k13.e()) {
                            p139t2.w wVar2 = c0028k11.f460n;
                            C0028k0 c0028k14 = c0034n6.f515i;
                            p151v2.a.h((c0028k14 == null || c0028k14.f458l == null) ? i11 : 1);
                            c0034n6.f515i = c0034n6.f515i.f458l;
                            c0034n6.j();
                            C0028k0 c0028k15 = c0034n6.f515i;
                            p139t2.w wVar3 = c0028k15.f460n;
                            R0 r8 = u4.f250N.f585a;
                            f0(r8, c0028k15.f453f.f467a, r8, c0028k11.f453f.f467a, -9223372036854775807L);
                            if (c0028k15.f451d && c0028k15.f448a.M() != -9223372036854775807L) {
                                long jE = c0028k15.e();
                                for (AbstractC0023i abstractC0023i : abstractC0023iArr4) {
                                    if (abstractC0023i.f381x != null) {
                                        M(abstractC0023i, jE);
                                    }
                                }
                                break;
                            }
                            for (int i13 = 0; i13 < abstractC0023iArr4.length; i13++) {
                                boolean zB = wVar2.b(i13);
                                boolean zB2 = wVar3.b(i13);
                                if (zB && !abstractC0023iArr4[i13].f373B) {
                                    boolean z18 = u4.f267c[i13].f375a == -2;
                                    G0 g3 = wVar2.f16450b[i13];
                                    G0 g7 = wVar3.f16450b[i13];
                                    if (!zB2 || !g7.equals(g3) || z18) {
                                        M(abstractC0023iArr4[i13], c0028k15.e());
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        AbstractC0023i abstractC0023i2 = abstractC0023iArr4[i12];
                        p018c2.W w8 = c0028k11.f450c[i12];
                        if (abstractC0023i2.f381x == w8) {
                            if (w8 != null && !abstractC0023i2.k()) {
                                C0028k0 c0028k16 = c0028k11.f458l;
                                if (!c0028k11.f453f.f472f || !c0028k16.f451d || (!(abstractC0023i2 instanceof p068j2.k) && !(abstractC0023i2 instanceof com.google.android.exoplayer2.metadata.a) && abstractC0023i2.f372A < c0028k16.e())) {
                                }
                            }
                            i12++;
                        }
                    }
                    break;
                    break;
                }
            }
            if (c0028k11.f453f.f475i || u4.f254R) {
                for (int i14 = 0; i14 < abstractC0023iArr4.length; i14++) {
                    AbstractC0023i abstractC0023i3 = abstractC0023iArr4[i14];
                    p018c2.W w9 = c0028k11.f450c[i14];
                    if (w9 != null && abstractC0023i3.f381x == w9 && abstractC0023i3.k()) {
                        long j11 = c0028k11.f453f.f471e;
                        M(abstractC0023i3, (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? -9223372036854775807L : c0028k11.f461o + j11);
                    }
                }
            }
            C0034n0 c0034n7 = u4.f245I;
            C0028k0 c0028k17 = c0034n7.f515i;
            if (c0028k17 != null && c0034n7.f514h != c0028k17 && !c0028k17.f454g) {
                p139t2.w wVar4 = c0028k17.f460n;
                int i15 = 0;
                boolean z19 = false;
                while (true) {
                    abstractC0023iArr2 = u4.f263a;
                    if (i15 >= abstractC0023iArr2.length) {
                        break;
                    }
                    AbstractC0023i abstractC0023i4 = abstractC0023iArr2[i15];
                    if (q(abstractC0023i4)) {
                        p018c2.W w10 = abstractC0023i4.f381x;
                        p018c2.W[] wArr = c0028k17.f450c;
                        boolean z20 = w10 != wArr[i15];
                        if (!wVar4.b(i15) || z20) {
                            if (!abstractC0023i4.f373B) {
                                p139t2.c cVar = wVar4.f16451c[i15];
                                int length = cVar != null ? cVar.f16304c.length : 0;
                                X[] xArr = new X[length];
                                for (int i16 = 0; i16 < length; i16++) {
                                    xArr[i16] = cVar.f16305d[i16];
                                }
                                abstractC0023i4.w(xArr, wArr[i15], c0028k17.e(), c0028k17.f461o);
                            } else if (abstractC0023i4.l()) {
                                u4.c(abstractC0023i4);
                            } else {
                                z19 = true;
                            }
                        }
                    }
                    i15++;
                }
                if (!z19) {
                    u4.e(new boolean[abstractC0023iArr2.length]);
                }
            }
            boolean z21 = false;
            while (X() && !u4.f254R && (c0028k3 = (c0034n1 = u4.f245I).f514h) != null && (c0028k4 = c0028k3.f458l) != null && u4.f266b0 >= c0028k4.e() && c0028k4.f454g) {
                if (z21) {
                    t();
                }
                C0028k0 c0028k0A = c0034n1.a();
                c0028k0A.getClass();
                if (u4.f250N.f586b.f10161a.equals(c0028k0A.f453f.f467a.f10161a)) {
                    p018c2.D d7 = u4.f250N.f586b;
                    if (d7.f10162b == -1) {
                        p018c2.D d8 = c0028k0A.f453f.f467a;
                        if (d8.f10162b != -1 || d7.f10165e == d8.f10165e) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                    } else {
                        z17 = false;
                    }
                } else {
                    z17 = false;
                }
                C0030l0 c0030l0 = c0028k0A.f453f;
                p018c2.D d9 = c0030l0.f467a;
                long j12 = c0030l0.f468b;
                z21 = true;
                u4.f250N = o(d9, j12, c0030l0.f469c, j12, !z17, 0);
                B();
                e0();
            }
            z4 = true;
        }
        int i17 = u4.f250N.f589e;
        if (i17 == z4 || i17 == 4) {
            u4.f275y.f17154a.removeMessages(2);
            return;
        }
        C0028k0 c0028k18 = u4.f245I.f514h;
        if (c0028k18 == null) {
            u4.G(jUptimeMillis, 10L);
            return;
        }
        p151v2.a.c("doSomeWork");
        e0();
        if (c0028k18.f451d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            c0028k18.f448a.w(u4.f250N.f602s - u4.f240D);
            boolean z22 = z4;
            z7 = z22;
            int i18 = 0;
            while (true) {
                AbstractC0023i[] abstractC0023iArr5 = u4.f263a;
                if (i18 >= abstractC0023iArr5.length) {
                    break;
                }
                AbstractC0023i abstractC0023i5 = abstractC0023iArr5[i18];
                if (q(abstractC0023i5)) {
                    abstractC0023i5.v(u4.f266b0, jElapsedRealtime);
                    boolean z23 = (z22 && abstractC0023i5.l()) ? z4 : false;
                    boolean z24 = c0028k18.f450c[i18] != abstractC0023i5.f381x ? z4 : false;
                    boolean z25 = (z24 || ((z24 || !abstractC0023i5.k()) ? false : z4) || abstractC0023i5.m() || abstractC0023i5.l()) ? z4 : false;
                    boolean z26 = (z7 && z25) ? z4 : false;
                    if (!z25) {
                        p018c2.W w11 = abstractC0023i5.f381x;
                        w11.getClass();
                        w11.c();
                    }
                    z7 = z26;
                    z22 = z23;
                }
                i18++;
            }
            z8 = z22;
        } else {
            c0028k18.f448a.q();
            z7 = z4;
            z8 = z7;
        }
        long j13 = c0028k18.f453f.f471e;
        if (z8 && c0028k18.f451d) {
            j = -9223372036854775807L;
            z9 = (j13 == -9223372036854775807L || j13 <= u4.f250N.f602s) ? z4 : false;
            if (z9 && u4.f254R) {
                u4.f254R = false;
                u4.R(u4.f250N.f596m, 5, false, false);
            }
            if (z9 || !c0028k18.f453f.f475i) {
                v0Var = u4.f250N;
                if (v0Var.f589e == 2) {
                    if (u4.f262Z == 0) {
                        zR = r();
                    } else {
                        if (!z7) {
                            c0028k18 = c0028k18;
                            zR = false;
                        } else if (v0Var.f591g) {
                            r7 = v0Var.f585a;
                            c0034n0 = u4.f245I;
                            if (u4.Y(r7, c0034n0.f514h.f453f.f467a)) {
                                j8 = u4.f247K.f487m;
                            } else {
                                j8 = j;
                            }
                            c0028k1 = c0034n0.j;
                            if (c0028k1.f451d || ((c0028k1.f452e && c0028k1.f448a.T() != Long.MIN_VALUE) || !c0028k1.f453f.f475i)) {
                                z10 = false;
                            } else {
                                z10 = z4;
                            }
                            if (c0028k1.f453f.f467a.a() || c0028k1.f451d) {
                                z11 = false;
                            } else {
                                z11 = z4;
                            }
                            if (!z10 || z11) {
                                c0028k18 = c0028k18;
                            } else {
                                long j14 = u4.f250N.f600q;
                                C0028k0 c0028k19 = u4.f245I.j;
                                long jMax = c0028k19 == null ? 0L : Math.max(0L, j14 - (u4.f266b0 - c0028k19.f461o));
                                float f7 = u4.f241E.d().f606a;
                                boolean z27 = u4.f255S;
                                C0033n c0033n = u4.f272f;
                                c0033n.getClass();
                                long jX = p151v2.t.x(jMax, f7);
                                long jMin = z27 ? c0033n.f502e : c0033n.f501d;
                                if (j8 != -9223372036854775807L) {
                                    jMin = Math.min(j8 / 2, jMin);
                                }
                                if (jMin > 0 && jX < jMin) {
                                    if (!c0033n.f504g) {
                                        p146u2.r rVar2 = c0033n.f498a;
                                        synchronized (rVar2) {
                                            i8 = rVar2.f16825d * rVar2.f16823b;
                                        }
                                        if (i8 >= c0033n.f506i) {
                                        }
                                    }
                                    zR = false;
                                }
                            }
                            zR = true;
                        } else {
                            zR = z4;
                        }
                        if (zR) {
                            u4.W(3);
                            u4.f271e0 = null;
                            if (X()) {
                                Z();
                            }
                        }
                    }
                    c0028k18 = c0028k18;
                    if (zR) {
                        u4.W(3);
                        u4.f271e0 = null;
                        if (X()) {
                            Z();
                        }
                    }
                } else {
                    c0028k18 = c0028k18;
                }
                if (u4.f250N.f589e == 3 && (u4.f262Z != 0 ? !z7 : !r())) {
                    u4.f255S = X();
                    u4.W(2);
                    if (u4.f255S) {
                        for (c0028k0 = u4.f245I.f514h; c0028k0 != null; c0028k0 = c0028k0.f458l) {
                            for (p139t2.c cVar2 : c0028k0.f460n.f16451c) {
                            }
                        }
                        c0031m = u4.f247K;
                        j3 = c0031m.f487m;
                        if (j3 != -9223372036854775807L) {
                            long j15 = j3 + c0031m.f481f;
                            c0031m.f487m = j15;
                            j7 = c0031m.f486l;
                            if (j7 != -9223372036854775807L && j15 > j7) {
                                c0031m.f487m = j7;
                            }
                            c0031m.f491q = -9223372036854775807L;
                        }
                    }
                    b0();
                }
            } else {
                u4.W(4);
                b0();
                c0028k18 = c0028k18;
            }
            if (u4.f250N.f589e == 2) {
                i10 = 0;
                while (true) {
                    abstractC0023iArr = u4.f263a;
                    if (i10 < abstractC0023iArr.length) {
                        break;
                    }
                    if (q(abstractC0023iArr[i10])) {
                        w7 = u4.f263a[i10].f381x;
                        c0028k2 = c0028k18;
                        if (w7 == c0028k2.f450c[i10]) {
                            w7.getClass();
                            w7.c();
                        }
                    } else {
                        c0028k2 = c0028k18;
                    }
                    i10++;
                    c0028k18 = c0028k2;
                }
                v0Var4 = u4.f250N;
                if (v0Var4.f591g && v0Var4.f601r < 500000 && p()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (!z12) {
                u4.f273f0 = -9223372036854775807L;
            } else if (u4.f273f0 == -9223372036854775807L) {
                u4.f243G.getClass();
                u4.f273f0 = SystemClock.elapsedRealtime();
            } else {
                u4.f243G.getClass();
                if (SystemClock.elapsedRealtime() - u4.f273f0 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            z13 = u4.f261Y;
            v0Var2 = u4.f250N;
            if (z13 != v0Var2.f598o) {
                u4.f250N = v0Var2.c(z13);
            }
            if ((X() || u4.f250N.f589e != 3) && (i9 = u4.f250N.f589e) != 2) {
                if (u4.f262Z != 0 || i9 == 4) {
                    u4.f275y.f17154a.removeMessages(2);
                } else {
                    u4.G(jUptimeMillis, 1000L);
                }
                z14 = false;
            } else {
                if (u4.f261Y && u4.f260X) {
                    z15 = true;
                    z16 = false;
                } else {
                    u4.G(jUptimeMillis, 10L);
                    z15 = true;
                    z16 = true;
                }
                z14 = z16 ^ z15;
            }
            v0Var3 = u4.f250N;
            if (v0Var3.f599p != z14) {
                u4.f250N = new v0(v0Var3.f585a, v0Var3.f586b, v0Var3.f587c, v0Var3.f588d, v0Var3.f589e, v0Var3.f590f, v0Var3.f591g, v0Var3.f592h, v0Var3.f593i, v0Var3.j, v0Var3.f594k, v0Var3.f595l, v0Var3.f596m, v0Var3.f597n, v0Var3.f600q, v0Var3.f601r, v0Var3.f602s, v0Var3.f598o, z14);
            }
            u4.f260X = false;
            p151v2.a.m();
        }
        j = -9223372036854775807L;
        if (z9) {
            u4.f254R = false;
            u4.R(u4.f250N.f596m, 5, false, false);
        }
        if (z9) {
            v0Var = u4.f250N;
            if (v0Var.f589e == 2) {
                if (u4.f262Z == 0) {
                    zR = r();
                } else {
                    if (!z7) {
                        c0028k18 = c0028k18;
                        zR = false;
                    } else if (v0Var.f591g) {
                        zR = z4;
                    } else {
                        r7 = v0Var.f585a;
                        c0034n0 = u4.f245I;
                        if (u4.Y(r7, c0034n0.f514h.f453f.f467a)) {
                            j8 = u4.f247K.f487m;
                        } else {
                            j8 = j;
                        }
                        c0028k1 = c0034n0.j;
                        if (c0028k1.f451d) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (c0028k1.f453f.f467a.a()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z10) {
                            c0028k18 = c0028k18;
                            zR = true;
                        } else {
                            c0028k18 = c0028k18;
                            zR = true;
                        }
                    }
                    if (zR) {
                        u4.W(3);
                        u4.f271e0 = null;
                        if (X()) {
                            Z();
                        }
                    }
                }
                c0028k18 = c0028k18;
                if (zR) {
                    u4.W(3);
                    u4.f271e0 = null;
                    if (X()) {
                        Z();
                    }
                }
            } else {
                c0028k18 = c0028k18;
            }
            if (u4.f250N.f589e == 3) {
                u4.f255S = X();
                u4.W(2);
                if (u4.f255S) {
                    while (c0028k0 != null) {
                        while (i7 < r3) {
                        }
                    }
                    c0031m = u4.f247K;
                    j3 = c0031m.f487m;
                    if (j3 != -9223372036854775807L) {
                        long j16 = j3 + c0031m.f481f;
                        c0031m.f487m = j16;
                        j7 = c0031m.f486l;
                        if (j7 != -9223372036854775807L) {
                            c0031m.f487m = j7;
                        }
                        c0031m.f491q = -9223372036854775807L;
                    }
                }
                b0();
            }
        } else {
            v0Var = u4.f250N;
            if (v0Var.f589e == 2) {
                if (u4.f262Z == 0) {
                    zR = r();
                } else {
                    if (!z7) {
                        c0028k18 = c0028k18;
                        zR = false;
                    } else if (v0Var.f591g) {
                        zR = z4;
                    } else {
                        r7 = v0Var.f585a;
                        c0034n0 = u4.f245I;
                        if (u4.Y(r7, c0034n0.f514h.f453f.f467a)) {
                            j8 = u4.f247K.f487m;
                        } else {
                            j8 = j;
                        }
                        c0028k1 = c0034n0.j;
                        if (c0028k1.f451d) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (c0028k1.f453f.f467a.a()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z10) {
                            c0028k18 = c0028k18;
                            zR = true;
                        } else {
                            c0028k18 = c0028k18;
                            zR = true;
                        }
                    }
                    if (zR) {
                        u4.W(3);
                        u4.f271e0 = null;
                        if (X()) {
                            Z();
                        }
                    }
                }
                c0028k18 = c0028k18;
                if (zR) {
                    u4.W(3);
                    u4.f271e0 = null;
                    if (X()) {
                        Z();
                    }
                }
            } else {
                c0028k18 = c0028k18;
            }
            if (u4.f250N.f589e == 3) {
                u4.f255S = X();
                u4.W(2);
                if (u4.f255S) {
                    while (c0028k0 != null) {
                        while (i7 < r3) {
                        }
                    }
                    c0031m = u4.f247K;
                    j3 = c0031m.f487m;
                    if (j3 != -9223372036854775807L) {
                        long j17 = j3 + c0031m.f481f;
                        c0031m.f487m = j17;
                        j7 = c0031m.f486l;
                        if (j7 != -9223372036854775807L) {
                            c0031m.f487m = j7;
                        }
                        c0031m.f491q = -9223372036854775807L;
                    }
                }
                b0();
            }
        }
        if (u4.f250N.f589e == 2) {
            i10 = 0;
            while (true) {
                abstractC0023iArr = u4.f263a;
                if (i10 < abstractC0023iArr.length) {
                    break;
                    break;
                }
                if (q(abstractC0023iArr[i10])) {
                    w7 = u4.f263a[i10].f381x;
                    c0028k2 = c0028k18;
                    if (w7 == c0028k2.f450c[i10]) {
                        w7.getClass();
                        w7.c();
                    }
                } else {
                    c0028k2 = c0028k18;
                }
                i10++;
                c0028k18 = c0028k2;
            }
            v0Var4 = u4.f250N;
            if (v0Var4.f591g) {
                z12 = false;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (!z12) {
            u4.f273f0 = -9223372036854775807L;
        } else if (u4.f273f0 == -9223372036854775807L) {
            u4.f243G.getClass();
            u4.f273f0 = SystemClock.elapsedRealtime();
        } else {
            u4.f243G.getClass();
            if (SystemClock.elapsedRealtime() - u4.f273f0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        z13 = u4.f261Y;
        v0Var2 = u4.f250N;
        if (z13 != v0Var2.f598o) {
            u4.f250N = v0Var2.c(z13);
        }
        if (X()) {
            if (u4.f262Z != 0) {
                u4.f275y.f17154a.removeMessages(2);
            } else {
                u4.f275y.f17154a.removeMessages(2);
            }
            z14 = false;
        } else {
            if (u4.f262Z != 0) {
                u4.f275y.f17154a.removeMessages(2);
            } else {
                u4.f275y.f17154a.removeMessages(2);
            }
            z14 = false;
        }
        v0Var3 = u4.f250N;
        if (v0Var3.f599p != z14) {
            u4.f250N = new v0(v0Var3.f585a, v0Var3.f586b, v0Var3.f587c, v0Var3.f588d, v0Var3.f589e, v0Var3.f590f, v0Var3.f591g, v0Var3.f592h, v0Var3.f593i, v0Var3.j, v0Var3.f594k, v0Var3.f595l, v0Var3.f596m, v0Var3.f597n, v0Var3.f600q, v0Var3.f601r, v0Var3.f602s, v0Var3.f598o, z14);
        }
        u4.f260X = false;
        p151v2.a.m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0(p139t2.w wVar) {
        p139t2.c[] cVarArr = wVar.f16451c;
        C0033n c0033n = this.f272f;
        int iMax = c0033n.f503f;
        if (iMax == -1) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                AbstractC0023i[] abstractC0023iArr = this.f263a;
                int i9 = 13107200;
                if (i7 < abstractC0023iArr.length) {
                    if (cVarArr[i7] != null) {
                        switch (abstractC0023iArr[i7].f375a) {
                            case 0:
                                i9 = 144310272;
                                i8 += i9;
                                break;
                            case 1:
                                i8 += i9;
                                break;
                            case 2:
                                i9 = 131072000;
                                i8 += i9;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i9 = 131072;
                                i8 += i9;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i7++;
                } else {
                    iMax = Math.max(13107200, i8);
                }
            }
        }
        c0033n.f506i = iMax;
        c0033n.f498a.a(iMax);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    public final void e(boolean[] zArr) throws r {
        AbstractC0023i[] abstractC0023iArr;
        Set set;
        C0034n0 c0034n0;
        C0028k0 c0028k0;
        p139t2.w wVar;
        Set set2;
        p151v2.h hVar;
        C0034n0 c0034n1 = this.f245I;
        C0028k0 c0028k1 = c0034n1.f515i;
        p139t2.w wVar2 = c0028k1.f460n;
        int i7 = 0;
        while (true) {
            abstractC0023iArr = this.f263a;
            int length = abstractC0023iArr.length;
            set = this.f265b;
            if (i7 >= length) {
                break;
            }
            if (!wVar2.b(i7) && set.remove(abstractC0023iArr[i7])) {
                abstractC0023iArr[i7].x();
            }
            i7++;
        }
        int i8 = 0;
        while (i8 < abstractC0023iArr.length) {
            if (wVar2.b(i8)) {
                boolean z4 = zArr[i8];
                AbstractC0023i abstractC0023i = abstractC0023iArr[i8];
                if (q(abstractC0023i)) {
                    c0034n0 = c0034n1;
                    c0028k0 = c0028k1;
                    wVar = wVar2;
                    set2 = set;
                } else {
                    C0028k0 c0028k2 = c0034n1.f515i;
                    boolean z7 = c0028k2 == c0034n1.f514h;
                    p139t2.w wVar3 = c0028k2.f460n;
                    G0 g3 = wVar3.f16450b[i8];
                    p139t2.c cVar = wVar3.f16451c[i8];
                    int length2 = cVar != null ? cVar.f16304c.length : 0;
                    X[] xArr = new X[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        xArr[i9] = cVar.f16305d[i9];
                        i9++;
                        c0034n1 = c0034n1;
                    }
                    c0034n0 = c0034n1;
                    boolean z8 = X() && this.f250N.f589e == 3;
                    boolean z9 = !z4 && z8;
                    this.f262Z++;
                    set.add(abstractC0023i);
                    p018c2.W w7 = c0028k2.f450c[i8];
                    set2 = set;
                    long j = this.f266b0;
                    long jE = c0028k2.e();
                    c0028k0 = c0028k1;
                    wVar = wVar2;
                    long j3 = c0028k2.f461o;
                    p151v2.a.h(abstractC0023i.f380f == 0);
                    abstractC0023i.f377c = g3;
                    abstractC0023i.f380f = 1;
                    abstractC0023i.o(z9, z7);
                    abstractC0023i.w(xArr, w7, jE, j3);
                    abstractC0023i.f373B = false;
                    abstractC0023i.f372A = j;
                    abstractC0023i.p(j, z9);
                    abstractC0023i.c(11, new O(this));
                    C0035o c0035o = this.f241E;
                    c0035o.getClass();
                    p151v2.h hVarI = abstractC0023i.i();
                    if (hVarI != null && hVarI != (hVar = c0035o.f522d)) {
                        if (hVar != null) {
                            throw new r(2, new IllegalStateException("Multiple renderer media clocks enabled."), zzbbd.zzq.zzf);
                        }
                        c0035o.f522d = hVarI;
                        c0035o.f521c = abstractC0023i;
                        ((C1.H) hVarI).b(c0035o.f519a.f17150e);
                    }
                    if (z8) {
                        p151v2.a.h(abstractC0023i.f380f == 1);
                        abstractC0023i.f380f = 2;
                        abstractC0023i.r();
                    }
                }
            } else {
                c0034n0 = c0034n1;
                c0028k0 = c0028k1;
                wVar = wVar2;
                set2 = set;
            }
            i8++;
            c0034n1 = c0034n0;
            set = set2;
            c0028k1 = c0028k0;
            wVar2 = wVar;
        }
        c0028k1.f454g = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v25, types: [c2.B, java.lang.Object] */
    public final void e0() {
        w0 w0VarD;
        float f7;
        C0028k0 c0028k0 = this.f245I.f514h;
        if (c0028k0 == null) {
            return;
        }
        long jM = c0028k0.f451d ? c0028k0.f448a.M() : -9223372036854775807L;
        if (jM != -9223372036854775807L) {
            C(jM);
            if (jM != this.f250N.f602s) {
                v0 v0Var = this.f250N;
                this.f250N = o(v0Var.f586b, jM, v0Var.f587c, jM, true, 5);
            }
        } else {
            C0035o c0035o = this.f241E;
            boolean z4 = c0028k0 != this.f245I.f515i;
            AbstractC0023i abstractC0023i = c0035o.f521c;
            p151v2.o oVar = c0035o.f519a;
            if (abstractC0023i == null || abstractC0023i.l() || (!c0035o.f521c.m() && (z4 || c0035o.f521c.k()))) {
                c0035o.f523e = true;
                if (c0035o.f524f) {
                    oVar.e();
                }
            } else {
                p151v2.h hVar = c0035o.f522d;
                hVar.getClass();
                long jA = hVar.a();
                if (!c0035o.f523e) {
                    oVar.c(jA);
                    w0VarD = hVar.d();
                    if (!w0VarD.equals(oVar.f17150e)) {
                        oVar.b(w0VarD);
                        c0035o.f520b.f275y.a(16, w0VarD).b();
                    }
                } else if (jA >= oVar.a()) {
                    c0035o.f523e = false;
                    if (c0035o.f524f) {
                        oVar.e();
                    }
                    oVar.c(jA);
                    w0VarD = hVar.d();
                    if (!w0VarD.equals(oVar.f17150e)) {
                        oVar.b(w0VarD);
                        c0035o.f520b.f275y.a(16, w0VarD).b();
                    }
                } else if (oVar.f17147b) {
                    oVar.c(oVar.a());
                    oVar.f17147b = false;
                }
            }
            long jA2 = c0035o.a();
            this.f266b0 = jA2;
            long j = jA2 - c0028k0.f461o;
            long j3 = this.f250N.f602s;
            if (!this.f242F.isEmpty() && !this.f250N.f586b.a()) {
                if (this.f269d0) {
                    this.f269d0 = false;
                }
                v0 v0Var2 = this.f250N;
                v0Var2.f585a.b(v0Var2.f586b.f10161a);
                int iMin = Math.min(this.c0, this.f242F.size());
                if (iMin > 0 && this.f242F.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.f242F.size() && this.f242F.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.c0 = iMin;
            }
            this.f250N.f602s = j;
        }
        this.f250N.f600q = this.f245I.j.d();
        v0 v0Var3 = this.f250N;
        long j7 = v0Var3.f600q;
        C0028k0 c0028k1 = this.f245I.j;
        v0Var3.f601r = c0028k1 == null ? 0L : Math.max(0L, j7 - (this.f266b0 - c0028k1.f461o));
        v0 v0Var4 = this.f250N;
        if (v0Var4.f595l && v0Var4.f589e == 3 && Y(v0Var4.f585a, v0Var4.f586b)) {
            v0 v0Var5 = this.f250N;
            if (v0Var5.f597n.f606a == 1.0f) {
                C0031m c0031m = this.f247K;
                long jG = g(v0Var5.f585a, v0Var5.f586b.f10161a, v0Var5.f602s);
                long j8 = this.f250N.f600q;
                C0028k0 c0028k2 = this.f245I.j;
                long jMax = c0028k2 == null ? 0L : Math.max(0L, j8 - (this.f266b0 - c0028k2.f461o));
                if (c0031m.f483h == -9223372036854775807L) {
                    f7 = 1.0f;
                } else {
                    long j9 = jG - jMax;
                    long j10 = c0031m.f492r;
                    if (j10 == -9223372036854775807L) {
                        c0031m.f492r = j9;
                        c0031m.f493s = 0L;
                    } else {
                        float f8 = c0031m.f482g;
                        float f9 = j10 * f8;
                        float f10 = 1.0f - f8;
                        long jMax2 = Math.max(j9, (long) ((j9 * f10) + f9));
                        c0031m.f492r = jMax2;
                        c0031m.f493s = (long) ((f10 * Math.abs(j9 - jMax2)) + (f8 * c0031m.f493s));
                    }
                    long j11 = c0031m.f491q;
                    long j12 = c0031m.f478c;
                    if (j11 == -9223372036854775807L || SystemClock.elapsedRealtime() - c0031m.f491q >= j12) {
                        c0031m.f491q = SystemClock.elapsedRealtime();
                        long j13 = (c0031m.f493s * 3) + c0031m.f492r;
                        long j14 = c0031m.f487m;
                        float f11 = c0031m.f479d;
                        if (j14 > j13) {
                            float fE = p151v2.t.E(j12);
                            long[] jArr = {j13, c0031m.j, c0031m.f487m - (((long) ((c0031m.f490p - 1.0f) * fE)) + ((long) ((c0031m.f488n - 1.0f) * fE)))};
                            long j15 = jArr[0];
                            for (int i7 = 1; i7 < 3; i7++) {
                                long j16 = jArr[i7];
                                if (j16 > j15) {
                                    j15 = j16;
                                }
                            }
                            c0031m.f487m = j15;
                        } else {
                            long jK = p151v2.t.k(jG - ((long) (Math.max(0.0f, c0031m.f490p - 1.0f) / f11)), c0031m.f487m, j13);
                            c0031m.f487m = jK;
                            long j17 = c0031m.f486l;
                            if (j17 != -9223372036854775807L && jK > j17) {
                                c0031m.f487m = j17;
                            }
                        }
                        long j18 = jG - c0031m.f487m;
                        if (Math.abs(j18) < c0031m.f480e) {
                            c0031m.f490p = 1.0f;
                        } else {
                            c0031m.f490p = p151v2.t.i((f11 * j18) + 1.0f, c0031m.f489o, c0031m.f488n);
                        }
                        f7 = c0031m.f490p;
                    } else {
                        f7 = c0031m.f490p;
                    }
                }
                if (this.f241E.d().f606a != f7) {
                    this.f241E.b(new w0(f7, this.f250N.f597n.f607b));
                    n(this.f250N.f597n, this.f241E.d().f606a, false, false);
                }
            }
        }
    }

    @Override // p018c2.A
    public final void f(p018c2.B b7) {
        this.f275y.a(8, b7).b();
    }

    public final void f0(R0 r7, p018c2.D d7, R0 r8, p018c2.D d8, long j) {
        if (!Y(r7, d7)) {
            w0 w0Var = d7.a() ? w0.f605d : this.f250N.f597n;
            C0035o c0035o = this.f241E;
            if (c0035o.d().equals(w0Var)) {
                return;
            }
            c0035o.b(w0Var);
            return;
        }
        Object obj = d7.f10161a;
        P0 p5 = this.f239C;
        int i7 = r7.g(obj, p5).f188c;
        Q0 q1 = this.f238B;
        r7.n(i7, q1);
        C0014d0 c0014d0 = q1.f204B;
        int i8 = p151v2.t.f17159a;
        C0031m c0031m = this.f247K;
        c0031m.getClass();
        c0031m.f483h = p151v2.t.E(c0014d0.f337a);
        c0031m.f485k = p151v2.t.E(c0014d0.f338b);
        c0031m.f486l = p151v2.t.E(c0014d0.f339c);
        float f7 = c0014d0.f340d;
        if (f7 == -3.4028235E38f) {
            f7 = c0031m.f476a;
        }
        c0031m.f489o = f7;
        float f8 = c0014d0.f341e;
        if (f8 == -3.4028235E38f) {
            f8 = c0031m.f477b;
        }
        c0031m.f488n = f8;
        if (f7 == 1.0f && f8 == 1.0f) {
            c0031m.f483h = -9223372036854775807L;
        }
        c0031m.a();
        if (j != -9223372036854775807L) {
            c0031m.f484i = g(r7, obj, j);
            c0031m.a();
            return;
        }
        if (p151v2.t.a(!r8.p() ? r8.m(r8.g(d8.f10161a, p5).f188c, q1, 0L).f211a : null, q1.f211a)) {
            return;
        }
        c0031m.f484i = -9223372036854775807L;
        c0031m.a();
    }

    public final long g(R0 r7, Object obj, long j) {
        P0 p5 = this.f239C;
        int i7 = r7.g(obj, p5).f188c;
        Q0 q1 = this.f238B;
        r7.n(i7, q1);
        if (q1.f216f != -9223372036854775807L && q1.a() && q1.f219z) {
            return p151v2.t.E(p151v2.t.u(q1.f217x) - q1.f216f) - (j + p5.f190e);
        }
        return -9223372036854775807L;
    }

    public final synchronized void g0(C0042s c0042s, long j) {
        this.f243G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z4 = false;
        while (!((Boolean) c0042s.get()).booleanValue() && j > 0) {
            try {
                this.f243G.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.f243G.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair h(R0 r7) {
        if (r7.p()) {
            return Pair.create(v0.f584t, 0L);
        }
        Pair pairI = r7.i(this.f238B, this.f239C, r7.a(this.f258V), -9223372036854775807L);
        p018c2.D dM = this.f245I.m(r7, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (dM.a()) {
            Object obj = dM.f10161a;
            P0 p5 = this.f239C;
            r7.g(obj, p5);
            jLongValue = dM.f10163c == p5.f(dM.f10162b) ? p5.f192x.f12391b : 0L;
        }
        return Pair.create(dM, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i7;
        C0028k0 c0028k0;
        int i8 = zzbbd.zzq.zzf;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    I((T) message.obj);
                    break;
                case 4:
                    S((w0) message.obj);
                    break;
                case 5:
                    this.f249M = (H0) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((p018c2.B) message.obj);
                    break;
                case 9:
                    i((p018c2.B) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    U(message.arg1 != 0);
                    break;
                case 13:
                    N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    D0 d7 = (D0) message.obj;
                    d7.getClass();
                    K(d7);
                    break;
                case 15:
                    L((D0) message.obj);
                    break;
                case 16:
                    w0 w0Var = (w0) message.obj;
                    n(w0Var, w0Var.f606a, true, false);
                    break;
                case 17:
                    O((P) message.obj);
                    break;
                case 18:
                    a((P) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC0486a1.n(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (p018c2.Z) message.obj);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    V((p018c2.Z) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case 24:
                    P(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (r e7) {
            e = e7;
            if (e.f537c == 1 && (c0028k0 = this.f245I.f515i) != null) {
                e = e.a(c0028k0.f453f.f467a);
            }
            if (e.f543z && this.f271e0 == null) {
                p151v2.a.G(e, "ExoPlayerImplInternal", "Recoverable renderer error");
                this.f271e0 = e;
                p151v2.r rVar = this.f275y;
                p151v2.q qVarA = rVar.a(25, e);
                rVar.getClass();
                Message message2 = qVarA.f17152a;
                message2.getClass();
                rVar.f17154a.sendMessageAtFrontOfQueue(message2);
                qVarA.a();
            } else {
                r rVar2 = this.f271e0;
                if (rVar2 != null) {
                    rVar2.addSuppressed(e);
                    e = this.f271e0;
                }
                p151v2.a.l("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.f250N = this.f250N.e(e);
            }
        } catch (C0045t0 e8) {
            boolean z4 = e8.f564a;
            int i9 = e8.f565b;
            if (i9 == 1) {
                i7 = z4 ? 3001 : 3003;
            } else {
                if (i9 == 4) {
                    i7 = z4 ? 3002 : 3004;
                }
                j(e8, i8);
            }
            i8 = i7;
            j(e8, i8);
        } catch (E1.c e9) {
            j(e9, e9.f1901a);
        } catch (C0756b e10) {
            j(e10, 1002);
        } catch (C0955n e11) {
            j(e11, e11.f16800a);
        } catch (IOException e12) {
            j(e12, 2000);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i8 = 1004;
            }
            r rVar3 = new r(2, e13, i8);
            p151v2.a.l("ExoPlayerImplInternal", "Playback error", rVar3);
            a0(true, false);
            this.f250N = this.f250N.e(rVar3);
        }
        t();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [c2.Y, java.lang.Object] */
    public final void i(p018c2.B b7) {
        C0028k0 c0028k0 = this.f245I.j;
        if (c0028k0 == null || c0028k0.f448a != b7) {
            return;
        }
        long j = this.f266b0;
        if (c0028k0 != null) {
            p151v2.a.h(c0028k0.f458l == null);
            if (c0028k0.f451d) {
                c0028k0.f448a.Y(j - c0028k0.f461o);
            }
        }
        s();
    }

    public final void j(IOException iOException, int i7) {
        r rVar = new r(0, iOException, i7);
        C0028k0 c0028k0 = this.f245I.f514h;
        if (c0028k0 != null) {
            rVar = rVar.a(c0028k0.f453f.f467a);
        }
        p151v2.a.l("ExoPlayerImplInternal", "Playback error", rVar);
        a0(false, false);
        this.f250N = this.f250N.e(rVar);
    }

    public final void k(boolean z4) {
        C0028k0 c0028k0 = this.f245I.j;
        p018c2.D d7 = c0028k0 == null ? this.f250N.f586b : c0028k0.f453f.f467a;
        boolean zEquals = this.f250N.f594k.equals(d7);
        if (!zEquals) {
            this.f250N = this.f250N.a(d7);
        }
        v0 v0Var = this.f250N;
        v0Var.f600q = c0028k0 == null ? v0Var.f602s : c0028k0.d();
        v0 v0Var2 = this.f250N;
        long j = v0Var2.f600q;
        C0028k0 c0028k1 = this.f245I.j;
        v0Var2.f601r = c0028k1 != null ? Math.max(0L, j - (this.f266b0 - c0028k1.f461o)) : 0L;
        if ((!zEquals || z4) && c0028k0 != null && c0028k0.f451d) {
            d0(c0028k0.f460n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x02e8 A[Catch: all -> 0x02ed, TryCatch #5 {all -> 0x02ed, blocks: (B:166:0x02e2, B:168:0x02e8, B:173:0x02f4, B:175:0x02ff, B:177:0x0305, B:179:0x030f, B:180:0x031c, B:181:0x031f, B:185:0x032a), top: B:255:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:223:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:227:0x03da  */
    /* JADX WARN: Code duplicated, block: B:229:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:238:0x0404  */
    /* JADX WARN: Code duplicated, block: B:242:0x042e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void l(R0 r7, boolean z4) throws Throwable {
        p018c2.D d7;
        int i7;
        int i8;
        long j;
        int iA;
        boolean z7;
        boolean z8;
        boolean z9;
        int iA2;
        boolean z10;
        long j3;
        boolean z11;
        long j7;
        S s7;
        int i9;
        int iA3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long j8;
        int i10;
        int i11;
        int i12;
        boolean z16;
        long J5;
        long j9;
        long j10;
        v0 v0Var = this.f250N;
        T t7 = this.f264a0;
        C0034n0 c0034n0 = this.f245I;
        int i13 = this.f257U;
        boolean z17 = this.f258V;
        Q0 q1 = this.f238B;
        P0 p5 = this.f239C;
        if (r7.p()) {
            s7 = new S(v0.f584t, 0L, -9223372036854775807L, false, true, false);
            j = 0;
            i8 = -1;
            i7 = 4;
        } else {
            p018c2.D d8 = v0Var.f586b;
            Object obj = d8.f10161a;
            R0 r8 = v0Var.f585a;
            boolean z18 = r8.p() || r8.g(d8.f10161a, p5).f191f;
            long jLongValue = (v0Var.f586b.a() || z18) ? v0Var.f587c : v0Var.f602s;
            if (t7 != null) {
                i7 = 4;
                Pair pairE = E(r7, t7, true, i13, z17, q1, p5);
                if (pairE == null) {
                    iA3 = r7.a(z17);
                    jLongValue = jLongValue;
                    z14 = false;
                    z13 = false;
                    z15 = true;
                } else {
                    if (t7.f234c == -9223372036854775807L) {
                        iA3 = r7.g(pairE.first, p5).f188c;
                        jLongValue = jLongValue;
                        z12 = false;
                    } else {
                        obj = pairE.first;
                        jLongValue = ((Long) pairE.second).longValue();
                        iA3 = -1;
                        z12 = true;
                    }
                    z13 = v0Var.f589e == 4;
                    z14 = z12;
                    z15 = false;
                }
                z9 = z14;
                z7 = z13;
                z8 = z15;
                d7 = d8;
                i8 = -1;
                j = 0;
                iA = iA3;
            } else {
                d7 = d8;
                i7 = 4;
                if (v0Var.f585a.p()) {
                    iA = r7.a(z17);
                    i8 = -1;
                } else {
                    i8 = -1;
                    if (r7.b(obj) == -1) {
                        Object objF = F(q1, p5, i13, z17, obj, v0Var.f585a, r7);
                        if (objF == null) {
                            iA2 = r7.a(z17);
                            z10 = true;
                        } else {
                            iA2 = r7.g(objF, p5).f188c;
                            z10 = false;
                        }
                        iA = iA2;
                        z8 = z10;
                        jLongValue = jLongValue;
                        d7 = d7;
                        j = 0;
                        z7 = false;
                        z9 = false;
                    } else if (jLongValue == -9223372036854775807L) {
                        iA = r7.g(obj, p5).f188c;
                    } else if (z18) {
                        d7 = d7;
                        v0Var.f585a.g(d7.f10161a, p5);
                        j = 0;
                        if (v0Var.f585a.m(p5.f188c, q1, 0L).f208F == v0Var.f585a.b(d7.f10161a)) {
                            Pair pairI = r7.i(q1, p5, r7.g(obj, p5).f188c, jLongValue + p5.f190e);
                            obj = pairI.first;
                            jLongValue = ((Long) pairI.second).longValue();
                        } else {
                            jLongValue = jLongValue;
                        }
                        iA = -1;
                        z7 = false;
                        z8 = false;
                        z9 = true;
                    } else {
                        d7 = d7;
                        j = 0;
                        iA = -1;
                        jLongValue = jLongValue;
                        z7 = false;
                        z8 = false;
                        z9 = false;
                    }
                }
                j = 0;
                z7 = false;
                z8 = false;
                z9 = false;
            }
            if (iA != i8) {
                Pair pairI2 = r7.i(q1, p5, iA, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue = ((Long) pairI2.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                j3 = jLongValue;
            }
            p018c2.D dM = c0034n0.m(r7, obj, jLongValue);
            int i14 = dM.f10165e;
            boolean z19 = d7.f10161a.equals(obj) && !d7.a() && !dM.a() && (i14 == i8 || ((i9 = d7.f10165e) != i8 && i14 >= i9));
            P0 p0G = r7.g(obj, p5);
            if (z18 || jLongValue != j3 || !d7.f10161a.equals(dM.f10161a)) {
                z11 = false;
            } else if (d7.a()) {
                int i15 = d7.f10162b;
                if (p0G.g(i15)) {
                    int i16 = d7.f10163c;
                    if (p0G.e(i15, i16) == i7 || p0G.e(i15, i16) == 2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else if (dM.a() || !p0G.g(dM.f10162b)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } else {
                if (dM.a()) {
                }
                z11 = false;
            }
            if (z19 || z11) {
                dM = d7;
            }
            if (!dM.a()) {
                j7 = jLongValue;
            } else if (dM.equals(d7)) {
                j7 = v0Var.f602s;
            } else {
                r7.g(dM.f10161a, p5);
                j7 = dM.f10163c == p5.f(dM.f10162b) ? p5.f192x.f12391b : j;
            }
            s7 = new S(dM, j7, j3, z7, z8, z9);
        }
        p018c2.D d9 = s7.f221a;
        j = s7.f223c;
        boolean z20 = s7.f224d;
        long j11 = s7.f222b;
        int i17 = i7;
        boolean z21 = (this.f250N.f586b.equals(d9) && j11 == this.f250N.f602s) ? false : true;
        try {
            if (s7.f225e) {
                try {
                    i11 = 1;
                    if (this.f250N.f589e != 1) {
                        try {
                            W(i17);
                        } catch (Throwable th) {
                            th = th;
                            i8 = i11;
                            i17 = 0;
                            j = j11;
                            v0 v0Var2 = this.f250N;
                            R0 r9 = v0Var2.f585a;
                            p018c2.D d10 = v0Var2.f586b;
                            if (s7.f226f) {
                                j8 = j;
                            } else {
                                j8 = -9223372036854775807L;
                            }
                            f0(r7, d9, r9, d10, j8);
                            if (z21 || j != this.f250N.f587c) {
                                v0 v0Var3 = this.f250N;
                                Object obj2 = v0Var3.f586b.f10161a;
                                R0 r10 = v0Var3.f585a;
                                if (z21 || !z4 || r10.p() || r10.g(obj2, this.f239C).f191f) {
                                    i10 = 0;
                                } else {
                                    i10 = i8;
                                }
                                this.f250N = o(d9, j, j, this.f250N.f588d, i10, r7.b(obj2) == -1 ? 4 : 3);
                            }
                            B();
                            D(r7, this.f250N.f585a);
                            this.f250N = this.f250N.h(r7);
                            if (!r7.p()) {
                                this.f264a0 = i17;
                            }
                            k(false);
                            throw th;
                        }
                    }
                    A(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i11 = 1;
                    i8 = i11;
                    i17 = 0;
                    j = j11;
                    v0 v0Var4 = this.f250N;
                    R0 r11 = v0Var4.f585a;
                    p018c2.D d11 = v0Var4.f586b;
                    if (s7.f226f) {
                        j8 = j;
                    } else {
                        j8 = -9223372036854775807L;
                    }
                    f0(r7, d9, r11, d11, j8);
                    if (z21) {
                        v0 v0Var5 = this.f250N;
                        Object obj3 = v0Var5.f586b.f10161a;
                        R0 r12 = v0Var5.f585a;
                        if (z21) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        this.f250N = o(d9, j, j, this.f250N.f588d, i10, r7.b(obj3) == -1 ? 4 : 3);
                    } else {
                        v0 v0Var6 = this.f250N;
                        Object obj4 = v0Var6.f586b.f10161a;
                        R0 r13 = v0Var6.f585a;
                        if (z21) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        this.f250N = o(d9, j, j, this.f250N.f588d, i10, r7.b(obj4) == -1 ? 4 : 3);
                    }
                    B();
                    D(r7, this.f250N.f585a);
                    this.f250N = this.f250N.h(r7);
                    if (!r7.p()) {
                        this.f264a0 = i17;
                    }
                    k(false);
                    throw th;
                }
            } else {
                i11 = 1;
            }
            try {
                if (z21) {
                    i12 = i11;
                    j = j;
                    z16 = false;
                    J5 = j11;
                    if (!r7.p()) {
                        for (C0028k0 c0028k0 = this.f245I.f514h; c0028k0 != null; c0028k0 = c0028k0.f458l) {
                            if (c0028k0.f453f.f467a.equals(d9)) {
                                c0028k0.f453f = this.f245I.g(r7, c0028k0.f453f);
                                c0028k0.h();
                            }
                        }
                        C0034n0 c0034n1 = this.f245I;
                        J5 = J(d9, J5, c0034n1.f514h != c0034n1.f515i ? i12 : 0, z20);
                    }
                } else {
                    C0034n0 c0034n2 = this.f245I;
                    long j12 = this.f266b0;
                    C0028k0 c0028k1 = c0034n2.f515i;
                    if (c0028k1 == null) {
                        j9 = j11;
                        j10 = j;
                    } else {
                        j9 = j11;
                        try {
                            long jMax = c0028k1.f461o;
                            if (c0028k1.f451d) {
                                int i18 = 0;
                                while (true) {
                                    AbstractC0023i[] abstractC0023iArr = this.f263a;
                                    if (i18 >= abstractC0023iArr.length) {
                                        j = j;
                                        j10 = jMax;
                                        break;
                                    }
                                    if (q(abstractC0023iArr[i18])) {
                                        AbstractC0023i abstractC0023i = abstractC0023iArr[i18];
                                        j = j;
                                        try {
                                            if (abstractC0023i.f381x == c0028k1.f450c[i18]) {
                                                long j13 = abstractC0023i.f372A;
                                                j10 = Long.MIN_VALUE;
                                                if (j13 == Long.MIN_VALUE) {
                                                    break;
                                                } else {
                                                    jMax = Math.max(j13, jMax);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            j = j9;
                                            i8 = 1;
                                            i17 = 0;
                                            v0 v0Var7 = this.f250N;
                                            R0 r14 = v0Var7.f585a;
                                            p018c2.D d12 = v0Var7.f586b;
                                            if (s7.f226f) {
                                                j8 = j;
                                            } else {
                                                j8 = -9223372036854775807L;
                                            }
                                            f0(r7, d9, r14, d12, j8);
                                            if (z21) {
                                                v0 v0Var8 = this.f250N;
                                                Object obj5 = v0Var8.f586b.f10161a;
                                                R0 r15 = v0Var8.f585a;
                                                if (z21) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 0;
                                                }
                                                this.f250N = o(d9, j, j, this.f250N.f588d, i10, r7.b(obj5) == -1 ? 4 : 3);
                                            } else {
                                                v0 v0Var9 = this.f250N;
                                                Object obj6 = v0Var9.f586b.f10161a;
                                                R0 r16 = v0Var9.f585a;
                                                if (z21) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 0;
                                                }
                                                this.f250N = o(d9, j, j, this.f250N.f588d, i10, r7.b(obj6) == -1 ? 4 : 3);
                                            }
                                            B();
                                            D(r7, this.f250N.f585a);
                                            this.f250N = this.f250N.h(r7);
                                            if (!r7.p()) {
                                                this.f264a0 = i17;
                                            }
                                            k(false);
                                            throw th;
                                        }
                                    } else {
                                        j = j;
                                    }
                                    i18++;
                                    j = j;
                                }
                            } else {
                                j10 = jMax;
                            }
                            i12 = 1;
                            J5 = j9;
                            z16 = false;
                            if (!c0034n2.o(r7, j12, j10)) {
                                H(false);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            j = j;
                        }
                    }
                    j = j;
                    i12 = 1;
                    J5 = j9;
                    z16 = false;
                    if (!c0034n2.o(r7, j12, j10)) {
                        H(false);
                    }
                }
                v0 v0Var10 = this.f250N;
                f0(r7, d9, v0Var10.f585a, v0Var10.f586b, s7.f226f ? J5 : -9223372036854775807L);
                if (z21 || j != this.f250N.f587c) {
                    v0 v0Var11 = this.f250N;
                    Object obj7 = v0Var11.f586b.f10161a;
                    R0 r17 = v0Var11.f585a;
                    this.f250N = o(d9, J5, j, this.f250N.f588d, (!z21 || !z4 || r17.p() || r17.g(obj7, this.f239C).f191f) ? 0 : i12, r7.b(obj7) == -1 ? 4 : 3);
                }
                B();
                D(r7, this.f250N.f585a);
                this.f250N = this.f250N.h(r7);
                if (!r7.p()) {
                    this.f264a0 = z16;
                }
                k(false);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            i8 = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [c2.B, java.lang.Object] */
    public final void m(p018c2.B b7) throws r {
        C0034n0 c0034n0 = this.f245I;
        C0028k0 c0028k0 = c0034n0.j;
        if (c0028k0 == null || c0028k0.f448a != b7) {
            return;
        }
        float f7 = this.f241E.d().f606a;
        R0 r7 = this.f250N.f585a;
        c0028k0.f451d = true;
        c0028k0.f459m = c0028k0.f448a.P();
        p139t2.w wVarG = c0028k0.g(f7, r7);
        C0030l0 c0030l0 = c0028k0.f453f;
        long j = c0030l0.f471e;
        long j3 = c0030l0.f468b;
        long jA = c0028k0.a(wVarG, (j == -9223372036854775807L || j3 < j) ? j3 : Math.max(0L, j - 1), false, new boolean[c0028k0.f456i.length]);
        long j7 = c0028k0.f461o;
        C0030l0 c0030l1 = c0028k0.f453f;
        c0028k0.f461o = (c0030l1.f468b - jA) + j7;
        c0028k0.f453f = c0030l1.b(jA);
        d0(c0028k0.f460n);
        if (c0028k0 == c0034n0.f514h) {
            C(c0028k0.f453f.f468b);
            e(new boolean[this.f263a.length]);
            v0 v0Var = this.f250N;
            p018c2.D d7 = v0Var.f586b;
            long j8 = c0028k0.f453f.f468b;
            this.f250N = o(d7, j8, v0Var.f587c, j8, false, 5);
        }
        s();
    }

    public final void n(w0 w0Var, float f7, boolean z4, boolean z7) {
        int i7;
        if (z4) {
            if (z7) {
                this.f251O.a(1);
            }
            this.f250N = this.f250N.f(w0Var);
        }
        float f8 = w0Var.f606a;
        C0028k0 c0028k0 = this.f245I.f514h;
        while (true) {
            i7 = 0;
            if (c0028k0 == null) {
                break;
            }
            p139t2.c[] cVarArr = c0028k0.f460n.f16451c;
            int length = cVarArr.length;
            while (i7 < length) {
                p139t2.c cVar = cVarArr[i7];
                if (cVar != null) {
                    cVar.k(f8);
                }
                i7++;
            }
            c0028k0 = c0028k0.f458l;
        }
        AbstractC0023i[] abstractC0023iArr = this.f263a;
        int length2 = abstractC0023iArr.length;
        while (i7 < length2) {
            AbstractC0023i abstractC0023i = abstractC0023iArr[i7];
            if (abstractC0023i != null) {
                abstractC0023i.y(f7, w0Var.f606a);
            }
            i7++;
        }
    }

    public final v0 o(p018c2.D d7, long j, long j3, long j7, boolean z4, int i7) {
        p018c2.f0 f0Var;
        p139t2.w wVar;
        List list;
        E3.L lD;
        int i8;
        this.f269d0 = (!this.f269d0 && j == this.f250N.f602s && d7.equals(this.f250N.f586b)) ? false : true;
        B();
        v0 v0Var = this.f250N;
        p018c2.f0 f0Var2 = v0Var.f592h;
        p139t2.w wVar2 = v0Var.f593i;
        List list2 = v0Var.j;
        if (this.f246J.f552b) {
            C0028k0 c0028k0 = this.f245I.f514h;
            p018c2.f0 f0Var3 = c0028k0 == null ? p018c2.f0.f10346d : c0028k0.f459m;
            p139t2.w wVar3 = c0028k0 == null ? this.f270e : c0028k0.f460n;
            p139t2.c[] cVarArr = wVar3.f16451c;
            C0164w c0164w = new C0164w();
            int length = cVarArr.length;
            int i9 = 0;
            boolean z7 = false;
            while (i9 < length) {
                p139t2.c cVar = cVarArr[i9];
                if (cVar == null) {
                    i8 = 1;
                } else {
                    Metadata metadata = cVar.f16305d[0].f281A;
                    if (metadata == null) {
                        c0164w.b(new Metadata(new Metadata.Entry[0]));
                        i8 = 1;
                    } else {
                        c0164w.b(metadata);
                        i8 = 1;
                        z7 = true;
                    }
                }
                i9 += i8;
            }
            if (z7) {
                lD = c0164w.d();
            } else {
                C0165x c0165x = AbstractC0167z.f2083b;
                lD = E3.L.f2000e;
            }
            if (c0028k0 != null) {
                C0030l0 c0030l0 = c0028k0.f453f;
                if (c0030l0.f469c != j3) {
                    c0028k0.f453f = c0030l0.a(j3);
                }
            }
            list = lD;
            f0Var = f0Var3;
            wVar = wVar3;
        } else if (d7.equals(v0Var.f586b)) {
            f0Var = f0Var2;
            wVar = wVar2;
            list = list2;
        } else {
            f0Var = p018c2.f0.f10346d;
            wVar = this.f270e;
            list = E3.L.f2000e;
        }
        if (z4) {
            Q q7 = this.f251O;
            if (!q7.f196d || q7.f195c == 5) {
                q7.f193a = true;
                q7.f196d = true;
                q7.f195c = i7;
            } else {
                p151v2.a.f(i7 == 5);
            }
        }
        v0 v0Var2 = this.f250N;
        long j8 = v0Var2.f600q;
        C0028k0 c0028k1 = this.f245I.j;
        return v0Var2.b(d7, j, j3, j7, c0028k1 == null ? 0L : Math.max(0L, j8 - (this.f266b0 - c0028k1.f461o)), f0Var, wVar, list);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c2.Y, java.lang.Object] */
    public final boolean p() {
        C0028k0 c0028k0 = this.f245I.j;
        if (c0028k0 == null) {
            return false;
        }
        return (!c0028k0.f451d ? 0L : c0028k0.f448a.k()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        C0028k0 c0028k0 = this.f245I.f514h;
        long j = c0028k0.f453f.f471e;
        return c0028k0.f451d && (j == -9223372036854775807L || this.f250N.f602s < j || !X());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c2.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [c2.Y, java.lang.Object] */
    public final void s() {
        int i7;
        boolean z4;
        boolean zP = p();
        C0034n0 c0034n0 = this.f245I;
        if (zP) {
            C0028k0 c0028k0 = c0034n0.j;
            long jK = !c0028k0.f451d ? 0L : c0028k0.f448a.k();
            C0028k0 c0028k1 = this.f245I.j;
            long jMax = c0028k1 != null ? Math.max(0L, jK - (this.f266b0 - c0028k1.f461o)) : 0L;
            float f7 = this.f241E.d().f606a;
            C0033n c0033n = this.f272f;
            p146u2.r rVar = c0033n.f498a;
            synchronized (rVar) {
                i7 = rVar.f16825d * rVar.f16823b;
            }
            boolean z7 = i7 >= c0033n.f506i;
            long j = c0033n.f500c;
            long jMin = c0033n.f499b;
            if (f7 > 1.0f) {
                jMin = Math.min(p151v2.t.t(jMin, f7), j);
            }
            if (jMax < Math.max(jMin, 500000L)) {
                boolean z8 = c0033n.f504g || !z7;
                c0033n.j = z8;
                if (!z8 && jMax < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (jMax >= j || z7) {
                c0033n.j = false;
            }
            z4 = c0033n.j;
        } else {
            z4 = false;
        }
        this.f256T = z4;
        if (z4) {
            C0028k0 c0028k2 = c0034n0.j;
            long j3 = this.f266b0;
            p151v2.a.h(c0028k2.f458l == null);
            c0028k2.f448a.y(j3 - c0028k2.f461o);
        }
        c0();
    }

    public final void t() {
        Q q7 = this.f251O;
        v0 v0Var = this.f250N;
        boolean z4 = q7.f193a | (((v0) q7.f199g) != v0Var);
        q7.f193a = z4;
        q7.f199g = v0Var;
        if (z4) {
            N n2 = this.f244H.f61a;
            n2.f162i.f17154a.post(new A0.f(1, n2, q7));
            this.f251O = new Q(this.f250N);
        }
    }

    public final void u() throws Throwable {
        l(this.f246J.b(), true);
    }

    public final void v() {
        this.f251O.a(1);
        throw null;
    }

    public final void w() {
        this.f251O.a(1);
        int i7 = 0;
        A(false, false, false, true);
        this.f272f.b(false);
        W(this.f250N.f585a.p() ? 4 : 2);
        C0960t c0960t = (C0960t) this.f274x;
        c0960t.getClass();
        C0043s0 c0043s0 = this.f246J;
        p151v2.a.h(!c0043s0.f552b);
        c0043s0.f561l = c0960t;
        while (true) {
            ArrayList arrayList = (ArrayList) c0043s0.f554d;
            if (i7 >= arrayList.size()) {
                c0043s0.f552b = true;
                this.f275y.c(2);
                return;
            } else {
                C0041r0 c0041r0 = (C0041r0) arrayList.get(i7);
                c0043s0.i(c0041r0);
                ((HashSet) c0043s0.j).add(c0041r0);
                i7++;
            }
        }
    }

    public final void x() {
        A(true, false, true, false);
        this.f272f.b(true);
        W(1);
        this.f276z.quit();
        synchronized (this) {
            this.f252P = true;
            notifyAll();
        }
    }

    public final void y(int i7, int i8, p018c2.Z z4) throws Throwable {
        this.f251O.a(1);
        C0043s0 c0043s0 = this.f246J;
        c0043s0.getClass();
        p151v2.a.f(i7 >= 0 && i7 <= i8 && i8 <= ((ArrayList) c0043s0.f554d).size());
        c0043s0.f560k = z4;
        c0043s0.k(i7, i8);
        l(c0043s0.b(), false);
    }

    public final void z() throws r {
        float f7 = this.f241E.d().f606a;
        C0034n0 c0034n0 = this.f245I;
        C0028k0 c0028k0 = c0034n0.f514h;
        C0028k0 c0028k1 = c0034n0.f515i;
        boolean z4 = true;
        for (C0028k0 c0028k2 = c0028k0; c0028k2 != null && c0028k2.f451d; c0028k2 = c0028k2.f458l) {
            p139t2.w wVarG = c0028k2.g(f7, this.f250N.f585a);
            p139t2.w wVar = c0028k2.f460n;
            if (wVar != null) {
                int length = wVar.f16451c.length;
                p139t2.c[] cVarArr = wVarG.f16451c;
                if (length == cVarArr.length) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= cVarArr.length) {
                            if (c0028k2 == c0028k1) {
                                z4 = false;
                            }
                        } else if (wVarG.a(wVar, i7)) {
                            i7++;
                        }
                    }
                }
            }
            if (z4) {
                C0034n0 c0034n1 = this.f245I;
                C0028k0 c0028k3 = c0034n1.f514h;
                boolean zK = c0034n1.k(c0028k3);
                boolean[] zArr = new boolean[this.f263a.length];
                long jA = c0028k3.a(wVarG, this.f250N.f602s, zK, zArr);
                v0 v0Var = this.f250N;
                boolean z7 = (v0Var.f589e == 4 || jA == v0Var.f602s) ? false : true;
                v0 v0Var2 = this.f250N;
                this.f250N = o(v0Var2.f586b, jA, v0Var2.f587c, v0Var2.f588d, z7, 5);
                if (z7) {
                    C(jA);
                }
                boolean[] zArr2 = new boolean[this.f263a.length];
                int i8 = 0;
                while (true) {
                    AbstractC0023i[] abstractC0023iArr = this.f263a;
                    if (i8 >= abstractC0023iArr.length) {
                        break;
                    }
                    AbstractC0023i abstractC0023i = abstractC0023iArr[i8];
                    boolean zQ = q(abstractC0023i);
                    zArr2[i8] = zQ;
                    p018c2.W w7 = c0028k3.f450c[i8];
                    if (zQ) {
                        if (w7 != abstractC0023i.f381x) {
                            c(abstractC0023i);
                        } else if (zArr[i8]) {
                            long j = this.f266b0;
                            abstractC0023i.f373B = false;
                            abstractC0023i.f372A = j;
                            abstractC0023i.p(j, false);
                        }
                    }
                    i8++;
                }
                e(zArr2);
            } else {
                this.f245I.k(c0028k2);
                if (c0028k2.f451d) {
                    c0028k2.a(wVarG, Math.max(c0028k2.f453f.f468b, this.f266b0 - c0028k2.f461o), false, new boolean[c0028k2.f456i.length]);
                }
            }
            k(true);
            if (this.f250N.f589e != 4) {
                s();
                e0();
                this.f275y.c(2);
                return;
            }
            return;
        }
    }
}
