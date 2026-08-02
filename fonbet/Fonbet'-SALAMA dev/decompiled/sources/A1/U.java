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
import c2.AbstractC0795a;
import c2.C0796b;
import c2.InterfaceC0793A;
import c2.InterfaceC0794B;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.internal.ads.zzbbd;
import j2.C1314k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import u2.C1637n;
import u2.C1642t;
import u2.InterfaceC1629f;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class U implements Handler.Callback, InterfaceC0793A, B0 {

    /* renamed from: A, reason: collision with root package name */
    public final Looper f237A;

    /* renamed from: B, reason: collision with root package name */
    public final Q0 f238B;

    /* renamed from: C, reason: collision with root package name */
    public final P0 f239C;

    /* renamed from: D, reason: collision with root package name */
    public final long f240D;

    /* renamed from: E, reason: collision with root package name */
    public final C0035o f241E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f242F;

    /* renamed from: G, reason: collision with root package name */
    public final v2.p f243G;

    /* renamed from: H, reason: collision with root package name */
    public final A f244H;

    /* renamed from: I, reason: collision with root package name */
    public final C0034n0 f245I;

    /* renamed from: J, reason: collision with root package name */
    public final C0043s0 f246J;

    /* renamed from: K, reason: collision with root package name */
    public final C0031m f247K;

    /* renamed from: L, reason: collision with root package name */
    public final long f248L;

    /* renamed from: M, reason: collision with root package name */
    public H0 f249M;

    /* renamed from: N, reason: collision with root package name */
    public v0 f250N;

    /* renamed from: O, reason: collision with root package name */
    public Q f251O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f252P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f254R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f255S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f256T;

    /* renamed from: U, reason: collision with root package name */
    public int f257U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f258V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f259W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f260X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f261Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f262Z;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0023i[] f263a;

    /* renamed from: a0, reason: collision with root package name */
    public T f264a0;

    /* renamed from: b, reason: collision with root package name */
    public final Set f265b;

    /* renamed from: b0, reason: collision with root package name */
    public long f266b0;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0023i[] f267c;
    public int c0;

    /* renamed from: d, reason: collision with root package name */
    public final t2.s f268d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f269d0;

    /* renamed from: e, reason: collision with root package name */
    public final t2.w f270e;

    /* renamed from: e0, reason: collision with root package name */
    public r f271e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0033n f272f;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1629f f274x;

    /* renamed from: y, reason: collision with root package name */
    public final v2.r f275y;

    /* renamed from: z, reason: collision with root package name */
    public final HandlerThread f276z;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f253Q = false;

    /* renamed from: f0, reason: collision with root package name */
    public long f273f0 = -9223372036854775807L;

    public U(AbstractC0023i[] abstractC0023iArr, t2.s sVar, t2.w wVar, C0033n c0033n, InterfaceC1629f interfaceC1629f, int i7, boolean z4, B1.h hVar, H0 h02, C0031m c0031m, long j, Looper looper, v2.p pVar, A a2, B1.p pVar2) {
        this.f244H = a2;
        this.f263a = abstractC0023iArr;
        this.f268d = sVar;
        this.f270e = wVar;
        this.f272f = c0033n;
        this.f274x = interfaceC1629f;
        this.f257U = i7;
        this.f258V = z4;
        this.f249M = h02;
        this.f247K = c0031m;
        this.f248L = j;
        this.f243G = pVar;
        this.f240D = c0033n.f505h;
        v0 i8 = v0.i(wVar);
        this.f250N = i8;
        this.f251O = new Q(i8);
        this.f267c = new AbstractC0023i[abstractC0023iArr.length];
        for (int i9 = 0; i9 < abstractC0023iArr.length; i9++) {
            AbstractC0023i abstractC0023i = abstractC0023iArr[i9];
            abstractC0023i.f378d = i9;
            abstractC0023i.f379e = pVar2;
            this.f267c[i9] = abstractC0023i;
        }
        this.f241E = new C0035o(this, pVar);
        this.f242F = new ArrayList();
        this.f265b = Collections.newSetFromMap(new IdentityHashMap());
        this.f238B = new Q0();
        this.f239C = new P0();
        sVar.f16394a = this;
        sVar.f16395b = interfaceC1629f;
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

    public static Pair E(R0 r02, T t7, boolean z4, int i7, boolean z7, Q0 q02, P0 p02) {
        Pair i8;
        Object F7;
        R0 r03 = t7.f232a;
        if (r02.p()) {
            return null;
        }
        R0 r04 = r03.p() ? r02 : r03;
        try {
            i8 = r04.i(q02, p02, t7.f233b, t7.f234c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (r02.equals(r04)) {
            return i8;
        }
        if (r02.b(i8.first) != -1) {
            return (r04.g(i8.first, p02).f191f && r04.m(p02.f188c, q02, 0L).f208F == r04.b(i8.first)) ? r02.i(q02, p02, r02.g(i8.first, p02).f188c, t7.f234c) : i8;
        }
        if (z4 && (F7 = F(q02, p02, i7, z7, i8.first, r04, r02)) != null) {
            return r02.i(q02, p02, r02.g(F7, p02).f188c, -9223372036854775807L);
        }
        return null;
    }

    public static Object F(Q0 q02, P0 p02, int i7, boolean z4, Object obj, R0 r02, R0 r03) {
        int b7 = r02.b(obj);
        int h6 = r02.h();
        int i8 = b7;
        int i9 = -1;
        for (int i10 = 0; i10 < h6 && i9 == -1; i10++) {
            i8 = r02.d(i8, p02, q02, i7, z4);
            if (i8 == -1) {
                break;
            }
            i9 = r03.b(r02.l(i8));
        }
        if (i9 == -1) {
            return null;
        }
        return r03.l(i9);
    }

    public static void M(AbstractC0023i abstractC0023i, long j) {
        abstractC0023i.f373B = true;
        if (abstractC0023i instanceof C1314k) {
            C1314k c1314k = (C1314k) abstractC0023i;
            AbstractC1664a.h(c1314k.f373B);
            c1314k.f14620R = j;
        }
    }

    public static boolean q(AbstractC0023i abstractC0023i) {
        return abstractC0023i.f380f != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r5.equals(r30.f250N.f586b) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(boolean z4, boolean z7, boolean z8, boolean z9) {
        long j;
        List list;
        boolean z10 = true;
        this.f275y.f17148a.removeMessages(2);
        this.f271e0 = null;
        this.f255S = false;
        C0035o c0035o = this.f241E;
        c0035o.f524f = false;
        v2.o oVar = c0035o.f519a;
        if (oVar.f17141b) {
            oVar.c(oVar.a());
            oVar.f17141b = false;
        }
        this.f266b0 = 1000000000000L;
        for (AbstractC0023i abstractC0023i : this.f263a) {
            try {
                c(abstractC0023i);
            } catch (r | RuntimeException e7) {
                AbstractC1664a.l("ExoPlayerImplInternal", "Disable failed.", e7);
            }
        }
        if (z4) {
            for (AbstractC0023i abstractC0023i2 : this.f263a) {
                if (this.f265b.remove(abstractC0023i2)) {
                    try {
                        abstractC0023i2.x();
                    } catch (RuntimeException e8) {
                        AbstractC1664a.l("ExoPlayerImplInternal", "Reset failed.", e8);
                    }
                }
            }
        }
        this.f262Z = 0;
        v0 v0Var = this.f250N;
        c2.D d7 = v0Var.f586b;
        long j3 = v0Var.f602s;
        if (!this.f250N.f586b.a()) {
            v0 v0Var2 = this.f250N;
            P0 p02 = this.f239C;
            c2.D d8 = v0Var2.f586b;
            R0 r02 = v0Var2.f585a;
            if (!r02.p() && !r02.g(d8.f10161a, p02).f191f) {
                j = this.f250N.f602s;
                if (z7) {
                    this.f264a0 = null;
                    Pair h6 = h(this.f250N.f585a);
                    d7 = (c2.D) h6.first;
                    j3 = ((Long) h6.second).longValue();
                    j = -9223372036854775807L;
                }
                z10 = false;
                c2.D d9 = d7;
                long j7 = j3;
                this.f245I.b();
                this.f256T = false;
                v0 v0Var3 = this.f250N;
                R0 r03 = v0Var3.f585a;
                int i7 = v0Var3.f589e;
                r rVar = z9 ? null : v0Var3.f590f;
                c2.f0 f0Var = !z10 ? c2.f0.f10346d : v0Var3.f592h;
                t2.w wVar = !z10 ? this.f270e : v0Var3.f593i;
                if (z10) {
                    list = v0Var3.j;
                } else {
                    C0165x c0165x = AbstractC0167z.f2083b;
                    list = E3.L.f2000e;
                }
                this.f250N = new v0(r03, d9, j, j7, i7, rVar, false, f0Var, wVar, list, d9, v0Var3.f595l, v0Var3.f596m, v0Var3.f597n, j7, 0L, j7, this.f261Y, false);
                if (z8) {
                    return;
                }
                C0043s0 c0043s0 = this.f246J;
                HashMap hashMap = (HashMap) c0043s0.f556f;
                for (C0040q0 c0040q0 : hashMap.values()) {
                    try {
                        c0040q0.f532a.m(c0040q0.f533b);
                    } catch (RuntimeException e9) {
                        AbstractC1664a.l("MediaSourceList", "Failed to release child source.", e9);
                    }
                    AbstractC0795a abstractC0795a = c0040q0.f532a;
                    k1.g gVar = c0040q0.f534c;
                    abstractC0795a.p(gVar);
                    c0040q0.f532a.o(gVar);
                }
                hashMap.clear();
                ((HashSet) c0043s0.j).clear();
                c0043s0.f552b = false;
                return;
            }
        }
        j = this.f250N.f587c;
        if (z7) {
        }
        z10 = false;
        c2.D d92 = d7;
        long j72 = j3;
        this.f245I.b();
        this.f256T = false;
        v0 v0Var32 = this.f250N;
        R0 r032 = v0Var32.f585a;
        int i72 = v0Var32.f589e;
        r rVar2 = z9 ? null : v0Var32.f590f;
        c2.f0 f0Var2 = !z10 ? c2.f0.f10346d : v0Var32.f592h;
        t2.w wVar2 = !z10 ? this.f270e : v0Var32.f593i;
        if (z10) {
        }
        this.f250N = new v0(r032, d92, j, j72, i72, rVar2, false, f0Var2, wVar2, list, d92, v0Var32.f595l, v0Var32.f596m, v0Var32.f597n, j72, 0L, j72, this.f261Y, false);
        if (z8) {
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
        for (C0028k0 c0028k02 = r0.f514h; c0028k02 != null; c0028k02 = c0028k02.f458l) {
            for (t2.c cVar : c0028k02.f460n.f16445c) {
            }
        }
    }

    public final void D(R0 r02, R0 r03) {
        if (r02.p() && r03.p()) {
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
        v2.r rVar = this.f275y;
        rVar.f17148a.removeMessages(2);
        rVar.f17148a.sendEmptyMessageAtTime(2, j + j3);
    }

    public final void H(boolean z4) {
        c2.D d7 = this.f245I.f514h.f453f.f467a;
        long J5 = J(d7, this.f250N.f602s, true, false);
        if (J5 != this.f250N.f602s) {
            v0 v0Var = this.f250N;
            this.f250N = o(d7, J5, v0Var.f587c, v0Var.f588d, z4, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [c2.B, java.lang.Object] */
    public final void I(T t7) {
        long j;
        long j3;
        boolean z4;
        c2.D d7;
        long j7;
        long j8;
        long j9;
        v0 v0Var;
        int i7;
        this.f251O.a(1);
        Pair E7 = E(this.f250N.f585a, t7, true, this.f257U, this.f258V, this.f238B, this.f239C);
        if (E7 == null) {
            Pair h6 = h(this.f250N.f585a);
            d7 = (c2.D) h6.first;
            long longValue = ((Long) h6.second).longValue();
            z4 = !this.f250N.f585a.p();
            j = longValue;
            j3 = -9223372036854775807L;
        } else {
            Object obj = E7.first;
            long longValue2 = ((Long) E7.second).longValue();
            long j10 = t7.f234c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            c2.D m7 = this.f245I.m(this.f250N.f585a, obj, longValue2);
            if (m7.a()) {
                this.f250N.f585a.g(m7.f10161a, this.f239C);
                j = this.f239C.f(m7.f10162b) == m7.f10163c ? this.f239C.f192x.f12385b : 0L;
                j3 = j10;
                d7 = m7;
                z4 = true;
            } else {
                j = longValue2;
                j3 = j10;
                z4 = t7.f234c == -9223372036854775807L;
                d7 = m7;
            }
        }
        try {
            if (this.f250N.f585a.p()) {
                this.f264a0 = t7;
            } else {
                if (E7 != null) {
                    if (d7.equals(this.f250N.f586b)) {
                        C0028k0 c0028k0 = this.f245I.f514h;
                        long o7 = (c0028k0 == null || !c0028k0.f451d || j == 0) ? j : c0028k0.f448a.o(j, this.f249M);
                        if (v2.t.N(o7) == v2.t.N(this.f250N.f602s) && ((i7 = (v0Var = this.f250N).f589e) == 2 || i7 == 3)) {
                            long j11 = v0Var.f602s;
                            this.f250N = o(d7, j11, j3, j11, z4, 2);
                            return;
                        }
                        j8 = o7;
                    } else {
                        j8 = j;
                    }
                    boolean z7 = this.f250N.f589e == 4;
                    C0034n0 c0034n0 = this.f245I;
                    long J5 = J(d7, j8, c0034n0.f514h != c0034n0.f515i, z7);
                    boolean z8 = (j != J5) | z4;
                    try {
                        v0 v0Var2 = this.f250N;
                        R0 r02 = v0Var2.f585a;
                        f0(r02, d7, r02, v0Var2.f586b, j3);
                        z4 = z8;
                        j9 = J5;
                        this.f250N = o(d7, j9, j3, j9, z4, 2);
                    } catch (Throwable th) {
                        th = th;
                        z4 = z8;
                        j7 = J5;
                        this.f250N = o(d7, j7, j3, j7, z4, 2);
                        throw th;
                    }
                }
                if (this.f250N.f589e != 1) {
                    W(4);
                }
                A(false, true, false, true);
            }
            j9 = j;
            this.f250N = o(d7, j9, j3, j9, z4, 2);
        } catch (Throwable th2) {
            th = th2;
            j7 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [c2.B, java.lang.Object] */
    public final long J(c2.D d7, long j, boolean z4, boolean z7) {
        b0();
        this.f255S = false;
        if (z7 || this.f250N.f589e == 3) {
            W(2);
        }
        C0034n0 c0034n0 = this.f245I;
        C0028k0 c0028k0 = c0034n0.f514h;
        C0028k0 c0028k02 = c0028k0;
        while (c0028k02 != null && !d7.equals(c0028k02.f453f.f467a)) {
            c0028k02 = c0028k02.f458l;
        }
        if (z4 || c0028k0 != c0028k02 || (c0028k02 != null && c0028k02.f461o + j < 0)) {
            AbstractC0023i[] abstractC0023iArr = this.f263a;
            for (AbstractC0023i abstractC0023i : abstractC0023iArr) {
                c(abstractC0023i);
            }
            if (c0028k02 != null) {
                while (c0034n0.f514h != c0028k02) {
                    c0034n0.a();
                }
                c0034n0.k(c0028k02);
                c0028k02.f461o = 1000000000000L;
                e(new boolean[abstractC0023iArr.length]);
            }
        }
        if (c0028k02 != null) {
            c0034n0.k(c0028k02);
            if (!c0028k02.f451d) {
                c0028k02.f453f = c0028k02.f453f.b(j);
            } else if (c0028k02.f452e) {
                ?? r9 = c0028k02.f448a;
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

    public final void K(D0 d02) {
        Looper looper = d02.f81f;
        Looper looper2 = this.f237A;
        v2.r rVar = this.f275y;
        if (looper != looper2) {
            rVar.a(15, d02).b();
            return;
        }
        synchronized (d02) {
        }
        try {
            d02.f76a.c(d02.f79d, d02.f80e);
            d02.b(true);
            int i7 = this.f250N.f589e;
            if (i7 == 3 || i7 == 2) {
                rVar.c(2);
            }
        } catch (Throwable th) {
            d02.b(true);
            throw th;
        }
    }

    public final void L(D0 d02) {
        Looper looper = d02.f81f;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            d02.b(false);
        } else {
            v2.r a2 = this.f243G.a(looper, null);
            a2.f17148a.post(new A0.f(2, this, d02));
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

    public final void O(P p5) {
        this.f251O.a(1);
        int i7 = p5.f184c;
        ArrayList arrayList = p5.f182a;
        c2.Z z4 = p5.f183b;
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

    public final void Q(boolean z4) {
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
            for (t2.c cVar : c0028k0.f460n.f16445c) {
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i9 = this.f250N.f589e;
        v2.r rVar = this.f275y;
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
        w0 d7 = c0035o.d();
        n(d7, d7.f606a, true, true);
    }

    public final void T(int i7) {
        this.f257U = i7;
        R0 r02 = this.f250N.f585a;
        C0034n0 c0034n0 = this.f245I;
        c0034n0.f512f = i7;
        if (!c0034n0.n(r02)) {
            H(true);
        }
        k(false);
    }

    public final void U(boolean z4) {
        this.f258V = z4;
        R0 r02 = this.f250N.f585a;
        C0034n0 c0034n0 = this.f245I;
        c0034n0.f513g = z4;
        if (!c0034n0.n(r02)) {
            H(true);
        }
        k(false);
    }

    public final void V(c2.Z z4) {
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

    public final boolean Y(R0 r02, c2.D d7) {
        if (d7.a() || r02.p()) {
            return false;
        }
        int i7 = r02.g(d7.f10161a, this.f239C).f188c;
        Q0 q02 = this.f238B;
        r02.n(i7, q02);
        return q02.a() && q02.f219z && q02.f216f != -9223372036854775807L;
    }

    public final void Z() {
        this.f255S = false;
        C0035o c0035o = this.f241E;
        c0035o.f524f = true;
        c0035o.f519a.e();
        for (AbstractC0023i abstractC0023i : this.f263a) {
            if (q(abstractC0023i)) {
                AbstractC1664a.h(abstractC0023i.f380f == 1);
                abstractC0023i.f380f = 2;
                abstractC0023i.r();
            }
        }
    }

    public final void a(P p5, int i7) {
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

    @Override // c2.X
    public final void b(c2.Y y4) {
        this.f275y.a(9, (InterfaceC0794B) y4).b();
    }

    public final void b0() {
        int i7;
        C0035o c0035o = this.f241E;
        c0035o.f524f = false;
        v2.o oVar = c0035o.f519a;
        if (oVar.f17141b) {
            oVar.c(oVar.a());
            oVar.f17141b = false;
        }
        for (AbstractC0023i abstractC0023i : this.f263a) {
            if (q(abstractC0023i) && (i7 = abstractC0023i.f380f) == 2) {
                AbstractC1664a.h(i7 == 2);
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
                AbstractC1664a.h(i7 == 2);
                abstractC0023i.f380f = 1;
                abstractC0023i.s();
            }
            AbstractC1664a.h(abstractC0023i.f380f == 1);
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

    /* JADX WARN: Code restructure failed: missing block: B:320:0x0524, code lost:
    
        if (r0 >= r6.f506i) goto L349;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e0 A[EDGE_INSN: B:74:0x02e0->B:75:0x02e0 BREAK  A[LOOP:0: B:42:0x027f->B:53:0x02dc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032f  */
    /* JADX WARN: Type inference failed for: r1v30, types: [c2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [c2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71, types: [c2.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [c2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v83, types: [c2.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [c2.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [c2.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z4;
        boolean z7;
        boolean z8;
        long j;
        boolean z9;
        v0 v0Var;
        C0028k0 c0028k0;
        boolean z10;
        long max;
        boolean z11;
        boolean z12;
        v0 v0Var2;
        int i7;
        boolean z13;
        v0 v0Var3;
        boolean z14;
        boolean z15;
        C0028k0 c0028k02;
        int i8;
        C0028k0 c0028k03;
        C0028k0 c0028k04;
        boolean z16;
        C0034n0 c0034n0;
        C0028k0 c0028k05;
        C0028k0 c0028k06;
        C0028k0 a2;
        boolean z17;
        int i9;
        boolean z18;
        AbstractC0023i[] abstractC0023iArr;
        U u4 = this;
        u4.f243G.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (u4.f250N.f585a.p() || !u4.f246J.f552b) {
            z4 = true;
        } else {
            C0034n0 c0034n02 = u4.f245I;
            long j3 = u4.f266b0;
            C0028k0 c0028k07 = c0034n02.j;
            if (c0028k07 != null) {
                AbstractC1664a.h(c0028k07.f458l == null);
                if (c0028k07.f451d) {
                    c0028k07.f448a.Y(j3 - c0028k07.f461o);
                }
            }
            C0034n0 c0034n03 = u4.f245I;
            C0028k0 c0028k08 = c0034n03.j;
            if (c0028k08 == null || (!c0028k08.f453f.f475i && c0028k08.f451d && ((!c0028k08.f452e || c0028k08.f448a.T() == Long.MIN_VALUE) && c0034n03.j.f453f.f471e != -9223372036854775807L && c0034n03.f516k < 100))) {
                C0034n0 c0034n04 = u4.f245I;
                long j7 = u4.f266b0;
                v0 v0Var4 = u4.f250N;
                C0028k0 c0028k09 = c0034n04.j;
                C0030l0 d7 = c0028k09 == null ? c0034n04.d(v0Var4.f585a, v0Var4.f586b, v0Var4.f587c, v0Var4.f602s) : c0034n04.c(v0Var4.f585a, c0028k09, j7);
                if (d7 != null) {
                    C0034n0 c0034n05 = u4.f245I;
                    AbstractC0023i[] abstractC0023iArr2 = u4.f267c;
                    t2.s sVar = u4.f268d;
                    u2.r rVar = u4.f272f.f498a;
                    C0043s0 c0043s0 = u4.f246J;
                    t2.w wVar = u4.f270e;
                    C0028k0 c0028k010 = c0034n05.j;
                    C0028k0 c0028k011 = new C0028k0(abstractC0023iArr2, c0028k010 == null ? 1000000000000L : (c0028k010.f461o + c0028k010.f453f.f471e) - d7.f468b, sVar, rVar, c0043s0, d7, wVar);
                    C0028k0 c0028k012 = c0034n05.j;
                    if (c0028k012 == null) {
                        c0034n05.f514h = c0028k011;
                        c0034n05.f515i = c0028k011;
                    } else if (c0028k011 != c0028k012.f458l) {
                        c0028k012.b();
                        c0028k012.f458l = c0028k011;
                        c0028k012.c();
                    }
                    c0034n05.f517l = null;
                    c0034n05.j = c0028k011;
                    c0034n05.f516k++;
                    c0034n05.j();
                    u4 = this;
                    c0028k011.f448a.p(u4, d7.f468b);
                    if (u4.f245I.f514h == c0028k011) {
                        u4.C(d7.f468b);
                    }
                    i8 = 0;
                    u4.k(false);
                    if (u4.f256T) {
                        s();
                    } else {
                        u4.f256T = p();
                        c0();
                    }
                    C0034n0 c0034n06 = u4.f245I;
                    c0028k03 = c0034n06.f515i;
                    if (c0028k03 != null) {
                        C0028k0 c0028k013 = c0028k03.f458l;
                        AbstractC0023i[] abstractC0023iArr3 = u4.f263a;
                        if (c0028k013 == null || u4.f254R) {
                            if (c0028k03.f453f.f475i || u4.f254R) {
                                for (int i10 = 0; i10 < abstractC0023iArr3.length; i10++) {
                                    AbstractC0023i abstractC0023i = abstractC0023iArr3[i10];
                                    c2.W w7 = c0028k03.f450c[i10];
                                    if (w7 != null && abstractC0023i.f381x == w7 && abstractC0023i.k()) {
                                        long j8 = c0028k03.f453f.f471e;
                                        M(abstractC0023i, (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? -9223372036854775807L : c0028k03.f461o + j8);
                                    }
                                }
                            }
                        } else if (c0028k03.f451d) {
                            int i11 = i8;
                            while (true) {
                                if (i11 < abstractC0023iArr3.length) {
                                    AbstractC0023i abstractC0023i2 = abstractC0023iArr3[i11];
                                    c2.W w8 = c0028k03.f450c[i11];
                                    if (abstractC0023i2.f381x != w8) {
                                        break;
                                    }
                                    if (w8 != null && !abstractC0023i2.k()) {
                                        C0028k0 c0028k014 = c0028k03.f458l;
                                        if (!c0028k03.f453f.f472f) {
                                            break;
                                        }
                                        if (!c0028k014.f451d) {
                                            break;
                                        }
                                        if (!(abstractC0023i2 instanceof C1314k) && !(abstractC0023i2 instanceof com.google.android.exoplayer2.metadata.a) && abstractC0023i2.f372A < c0028k014.e()) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    C0028k0 c0028k015 = c0028k03.f458l;
                                    if (c0028k015.f451d || u4.f266b0 >= c0028k015.e()) {
                                        t2.w wVar2 = c0028k03.f460n;
                                        C0028k0 c0028k016 = c0034n06.f515i;
                                        AbstractC1664a.h((c0028k016 == null || c0028k016.f458l == null) ? i8 : 1);
                                        c0034n06.f515i = c0034n06.f515i.f458l;
                                        c0034n06.j();
                                        C0028k0 c0028k017 = c0034n06.f515i;
                                        t2.w wVar3 = c0028k017.f460n;
                                        R0 r02 = u4.f250N.f585a;
                                        f0(r02, c0028k017.f453f.f467a, r02, c0028k03.f453f.f467a, -9223372036854775807L);
                                        if (!c0028k017.f451d || c0028k017.f448a.M() == -9223372036854775807L) {
                                            for (int i12 = 0; i12 < abstractC0023iArr3.length; i12++) {
                                                boolean b7 = wVar2.b(i12);
                                                boolean b8 = wVar3.b(i12);
                                                if (b7 && !abstractC0023iArr3[i12].f373B) {
                                                    boolean z19 = u4.f267c[i12].f375a == -2;
                                                    G0 g02 = wVar2.f16444b[i12];
                                                    G0 g03 = wVar3.f16444b[i12];
                                                    if (!b8 || !g03.equals(g02) || z19) {
                                                        M(abstractC0023iArr3[i12], c0028k017.e());
                                                    }
                                                }
                                            }
                                        } else {
                                            long e7 = c0028k017.e();
                                            for (AbstractC0023i abstractC0023i3 : abstractC0023iArr3) {
                                                if (abstractC0023i3.f381x != null) {
                                                    M(abstractC0023i3, e7);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C0034n0 c0034n07 = u4.f245I;
                        c0028k04 = c0034n07.f515i;
                        if (c0028k04 != null && c0034n07.f514h != c0028k04 && !c0028k04.f454g) {
                            t2.w wVar4 = c0028k04.f460n;
                            i9 = 0;
                            z18 = false;
                            while (true) {
                                abstractC0023iArr = u4.f263a;
                                if (i9 < abstractC0023iArr.length) {
                                    break;
                                }
                                AbstractC0023i abstractC0023i4 = abstractC0023iArr[i9];
                                if (q(abstractC0023i4)) {
                                    c2.W w9 = abstractC0023i4.f381x;
                                    c2.W[] wArr = c0028k04.f450c;
                                    boolean z20 = w9 != wArr[i9];
                                    if (!wVar4.b(i9) || z20) {
                                        if (!abstractC0023i4.f373B) {
                                            t2.c cVar = wVar4.f16445c[i9];
                                            int length = cVar != null ? cVar.f16298c.length : 0;
                                            X[] xArr = new X[length];
                                            for (int i13 = 0; i13 < length; i13++) {
                                                xArr[i13] = cVar.f16299d[i13];
                                            }
                                            abstractC0023i4.w(xArr, wArr[i9], c0028k04.e(), c0028k04.f461o);
                                        } else if (abstractC0023i4.l()) {
                                            u4.c(abstractC0023i4);
                                        } else {
                                            z18 = true;
                                        }
                                    }
                                }
                                i9++;
                            }
                            if (!z18) {
                                u4.e(new boolean[abstractC0023iArr.length]);
                            }
                        }
                        z16 = false;
                        while (X() && !u4.f254R && (c0028k05 = (c0034n0 = u4.f245I).f514h) != null && (c0028k06 = c0028k05.f458l) != null && u4.f266b0 >= c0028k06.e() && c0028k06.f454g) {
                            if (z16) {
                                t();
                            }
                            a2 = c0034n0.a();
                            a2.getClass();
                            if (u4.f250N.f586b.f10161a.equals(a2.f453f.f467a.f10161a)) {
                                c2.D d8 = u4.f250N.f586b;
                                if (d8.f10162b == -1) {
                                    c2.D d9 = a2.f453f.f467a;
                                    if (d9.f10162b == -1 && d8.f10165e != d9.f10165e) {
                                        z17 = true;
                                        C0030l0 c0030l0 = a2.f453f;
                                        c2.D d10 = c0030l0.f467a;
                                        long j9 = c0030l0.f468b;
                                        z16 = true;
                                        u4.f250N = o(d10, j9, c0030l0.f469c, j9, !z17, 0);
                                        B();
                                        e0();
                                    }
                                }
                            }
                            z17 = false;
                            C0030l0 c0030l02 = a2.f453f;
                            c2.D d102 = c0030l02.f467a;
                            long j92 = c0030l02.f468b;
                            z16 = true;
                            u4.f250N = o(d102, j92, c0030l02.f469c, j92, !z17, 0);
                            B();
                            e0();
                        }
                        z4 = true;
                    }
                    C0034n0 c0034n072 = u4.f245I;
                    c0028k04 = c0034n072.f515i;
                    if (c0028k04 != null) {
                        t2.w wVar42 = c0028k04.f460n;
                        i9 = 0;
                        z18 = false;
                        while (true) {
                            abstractC0023iArr = u4.f263a;
                            if (i9 < abstractC0023iArr.length) {
                            }
                            i9++;
                        }
                        if (!z18) {
                        }
                    }
                    z16 = false;
                    while (X()) {
                        if (z16) {
                        }
                        a2 = c0034n0.a();
                        a2.getClass();
                        if (u4.f250N.f586b.f10161a.equals(a2.f453f.f467a.f10161a)) {
                        }
                        z17 = false;
                        C0030l0 c0030l022 = a2.f453f;
                        c2.D d1022 = c0030l022.f467a;
                        long j922 = c0030l022.f468b;
                        z16 = true;
                        u4.f250N = o(d1022, j922, c0030l022.f469c, j922, !z17, 0);
                        B();
                        e0();
                    }
                    z4 = true;
                }
            }
            i8 = 0;
            if (u4.f256T) {
            }
            C0034n0 c0034n062 = u4.f245I;
            c0028k03 = c0034n062.f515i;
            if (c0028k03 != null) {
            }
            C0034n0 c0034n0722 = u4.f245I;
            c0028k04 = c0034n0722.f515i;
            if (c0028k04 != null) {
            }
            z16 = false;
            while (X()) {
            }
            z4 = true;
        }
        int i14 = u4.f250N.f589e;
        if (i14 == z4 || i14 == 4) {
            u4.f275y.f17148a.removeMessages(2);
            return;
        }
        C0028k0 c0028k018 = u4.f245I.f514h;
        if (c0028k018 == null) {
            u4.G(uptimeMillis, 10L);
            return;
        }
        AbstractC1664a.c("doSomeWork");
        e0();
        if (c0028k018.f451d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            c0028k018.f448a.w(u4.f250N.f602s - u4.f240D);
            boolean z21 = z4;
            z7 = z21;
            int i15 = 0;
            while (true) {
                AbstractC0023i[] abstractC0023iArr4 = u4.f263a;
                if (i15 >= abstractC0023iArr4.length) {
                    break;
                }
                AbstractC0023i abstractC0023i5 = abstractC0023iArr4[i15];
                if (q(abstractC0023i5)) {
                    abstractC0023i5.v(u4.f266b0, elapsedRealtime);
                    boolean z22 = (z21 && abstractC0023i5.l()) ? z4 : false;
                    boolean z23 = c0028k018.f450c[i15] != abstractC0023i5.f381x ? z4 : false;
                    boolean z24 = (z23 || ((z23 || !abstractC0023i5.k()) ? false : z4) || abstractC0023i5.m() || abstractC0023i5.l()) ? z4 : false;
                    boolean z25 = (z7 && z24) ? z4 : false;
                    if (!z24) {
                        c2.W w10 = abstractC0023i5.f381x;
                        w10.getClass();
                        w10.c();
                    }
                    z7 = z25;
                    z21 = z22;
                }
                i15++;
            }
            z8 = z21;
        } else {
            c0028k018.f448a.q();
            z7 = z4;
            z8 = z7;
        }
        long j10 = c0028k018.f453f.f471e;
        if (z8 && c0028k018.f451d) {
            j = -9223372036854775807L;
            if (j10 == -9223372036854775807L || j10 <= u4.f250N.f602s) {
                z9 = z4;
                if (z9 && u4.f254R) {
                    u4.f254R = false;
                    u4.R(u4.f250N.f596m, 5, false, false);
                }
                if (z9 || !c0028k018.f453f.f475i) {
                    v0Var = u4.f250N;
                    if (v0Var.f589e != 2) {
                        if (u4.f262Z == 0) {
                            z10 = r();
                        } else {
                            if (!z7) {
                                c0028k0 = c0028k018;
                                z10 = false;
                            } else if (v0Var.f591g) {
                                R0 r03 = v0Var.f585a;
                                C0034n0 c0034n08 = u4.f245I;
                                long j11 = u4.Y(r03, c0034n08.f514h.f453f.f467a) ? u4.f247K.f487m : j;
                                C0028k0 c0028k019 = c0034n08.j;
                                boolean z26 = (!c0028k019.f451d || (c0028k019.f452e && c0028k019.f448a.T() != Long.MIN_VALUE) || !c0028k019.f453f.f475i) ? false : z4;
                                boolean z27 = (!c0028k019.f453f.f467a.a() || c0028k019.f451d) ? false : z4;
                                if (z26 || z27) {
                                    c0028k0 = c0028k018;
                                } else {
                                    long j12 = u4.f250N.f600q;
                                    C0028k0 c0028k020 = u4.f245I.j;
                                    if (c0028k020 == null) {
                                        c0028k0 = c0028k018;
                                        max = 0;
                                    } else {
                                        c0028k0 = c0028k018;
                                        max = Math.max(0L, j12 - (u4.f266b0 - c0028k020.f461o));
                                    }
                                    float f7 = u4.f241E.d().f606a;
                                    boolean z28 = u4.f255S;
                                    C0033n c0033n = u4.f272f;
                                    c0033n.getClass();
                                    long x4 = v2.t.x(max, f7);
                                    long j13 = z28 ? c0033n.f502e : c0033n.f501d;
                                    if (j11 != -9223372036854775807L) {
                                        j13 = Math.min(j11 / 2, j13);
                                    }
                                    if (j13 > 0 && x4 < j13) {
                                        if (!c0033n.f504g) {
                                            u2.r rVar2 = c0033n.f498a;
                                            synchronized (rVar2) {
                                                int i16 = rVar2.f16819d * rVar2.f16817b;
                                            }
                                        }
                                        z10 = false;
                                    }
                                }
                                z10 = true;
                            } else {
                                z10 = z4;
                            }
                            if (z10) {
                                u4.W(3);
                                u4.f271e0 = null;
                                if (X()) {
                                    Z();
                                }
                            }
                        }
                        c0028k0 = c0028k018;
                        if (z10) {
                        }
                    } else {
                        c0028k0 = c0028k018;
                    }
                    if (u4.f250N.f589e == 3 && (u4.f262Z != 0 ? !z7 : !r())) {
                        u4.f255S = X();
                        u4.W(2);
                        if (u4.f255S) {
                            for (C0028k0 c0028k021 = u4.f245I.f514h; c0028k021 != null; c0028k021 = c0028k021.f458l) {
                                for (t2.c cVar2 : c0028k021.f460n.f16445c) {
                                }
                            }
                            C0031m c0031m = u4.f247K;
                            long j14 = c0031m.f487m;
                            if (j14 != -9223372036854775807L) {
                                long j15 = j14 + c0031m.f481f;
                                c0031m.f487m = j15;
                                long j16 = c0031m.f486l;
                                if (j16 != -9223372036854775807L && j15 > j16) {
                                    c0031m.f487m = j16;
                                }
                                c0031m.f491q = -9223372036854775807L;
                            }
                        }
                        b0();
                    }
                } else {
                    u4.W(4);
                    b0();
                    c0028k0 = c0028k018;
                }
                if (u4.f250N.f589e == 2) {
                    int i17 = 0;
                    while (true) {
                        AbstractC0023i[] abstractC0023iArr5 = u4.f263a;
                        if (i17 >= abstractC0023iArr5.length) {
                            break;
                        }
                        if (q(abstractC0023iArr5[i17])) {
                            c2.W w11 = u4.f263a[i17].f381x;
                            c0028k02 = c0028k0;
                            if (w11 == c0028k02.f450c[i17]) {
                                w11.getClass();
                                w11.c();
                            }
                        } else {
                            c0028k02 = c0028k0;
                        }
                        i17++;
                        c0028k0 = c0028k02;
                    }
                    v0 v0Var5 = u4.f250N;
                    if (!v0Var5.f591g && v0Var5.f601r < 500000 && p()) {
                        z11 = true;
                        if (!z11) {
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
                        z12 = u4.f261Y;
                        v0Var2 = u4.f250N;
                        if (z12 != v0Var2.f598o) {
                            u4.f250N = v0Var2.c(z12);
                        }
                        if ((X() || u4.f250N.f589e != 3) && (i7 = u4.f250N.f589e) != 2) {
                            if (u4.f262Z != 0 || i7 == 4) {
                                u4.f275y.f17148a.removeMessages(2);
                            } else {
                                u4.G(uptimeMillis, 1000L);
                            }
                            z13 = false;
                        } else {
                            if (u4.f261Y && u4.f260X) {
                                z14 = true;
                                z15 = false;
                            } else {
                                u4.G(uptimeMillis, 10L);
                                z14 = true;
                                z15 = true;
                            }
                            z13 = z15 ^ z14;
                        }
                        v0Var3 = u4.f250N;
                        if (v0Var3.f599p != z13) {
                            u4.f250N = new v0(v0Var3.f585a, v0Var3.f586b, v0Var3.f587c, v0Var3.f588d, v0Var3.f589e, v0Var3.f590f, v0Var3.f591g, v0Var3.f592h, v0Var3.f593i, v0Var3.j, v0Var3.f594k, v0Var3.f595l, v0Var3.f596m, v0Var3.f597n, v0Var3.f600q, v0Var3.f601r, v0Var3.f602s, v0Var3.f598o, z13);
                        }
                        u4.f260X = false;
                        AbstractC1664a.m();
                    }
                }
                z11 = false;
                if (!z11) {
                }
                z12 = u4.f261Y;
                v0Var2 = u4.f250N;
                if (z12 != v0Var2.f598o) {
                }
                if (X()) {
                }
                if (u4.f262Z != 0) {
                }
                u4.f275y.f17148a.removeMessages(2);
                z13 = false;
                v0Var3 = u4.f250N;
                if (v0Var3.f599p != z13) {
                }
                u4.f260X = false;
                AbstractC1664a.m();
            }
        } else {
            j = -9223372036854775807L;
        }
        z9 = false;
        if (z9) {
            u4.f254R = false;
            u4.R(u4.f250N.f596m, 5, false, false);
        }
        if (z9) {
        }
        v0Var = u4.f250N;
        if (v0Var.f589e != 2) {
        }
        if (u4.f250N.f589e == 3) {
            u4.f255S = X();
            u4.W(2);
            if (u4.f255S) {
            }
            b0();
        }
        if (u4.f250N.f589e == 2) {
        }
        z11 = false;
        if (!z11) {
        }
        z12 = u4.f261Y;
        v0Var2 = u4.f250N;
        if (z12 != v0Var2.f598o) {
        }
        if (X()) {
        }
        if (u4.f262Z != 0) {
        }
        u4.f275y.f17148a.removeMessages(2);
        z13 = false;
        v0Var3 = u4.f250N;
        if (v0Var3.f599p != z13) {
        }
        u4.f260X = false;
        AbstractC1664a.m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0(t2.w wVar) {
        t2.c[] cVarArr = wVar.f16445c;
        C0033n c0033n = this.f272f;
        int i7 = c0033n.f503f;
        if (i7 == -1) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                AbstractC0023i[] abstractC0023iArr = this.f263a;
                int i10 = 13107200;
                if (i8 < abstractC0023iArr.length) {
                    if (cVarArr[i8] != null) {
                        switch (abstractC0023iArr[i8].f375a) {
                            case 0:
                                i10 = 144310272;
                                i9 += i10;
                                break;
                            case 1:
                                i9 += i10;
                                break;
                            case 2:
                                i10 = 131072000;
                                i9 += i10;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i10 = 131072;
                                i9 += i10;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i8++;
                } else {
                    i7 = Math.max(13107200, i9);
                }
            }
        }
        c0033n.f506i = i7;
        c0033n.f498a.a(i7);
    }

    public final void e(boolean[] zArr) {
        AbstractC0023i[] abstractC0023iArr;
        Set set;
        C0034n0 c0034n0;
        C0028k0 c0028k0;
        t2.w wVar;
        Set set2;
        v2.h hVar;
        C0034n0 c0034n02 = this.f245I;
        C0028k0 c0028k02 = c0034n02.f515i;
        t2.w wVar2 = c0028k02.f460n;
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
                if (!q(abstractC0023i)) {
                    C0028k0 c0028k03 = c0034n02.f515i;
                    boolean z7 = c0028k03 == c0034n02.f514h;
                    t2.w wVar3 = c0028k03.f460n;
                    G0 g02 = wVar3.f16444b[i8];
                    t2.c cVar = wVar3.f16445c[i8];
                    int length2 = cVar != null ? cVar.f16298c.length : 0;
                    X[] xArr = new X[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        xArr[i9] = cVar.f16299d[i9];
                        i9++;
                        c0034n02 = c0034n02;
                    }
                    c0034n0 = c0034n02;
                    boolean z8 = X() && this.f250N.f589e == 3;
                    boolean z9 = !z4 && z8;
                    this.f262Z++;
                    set.add(abstractC0023i);
                    c2.W w7 = c0028k03.f450c[i8];
                    set2 = set;
                    long j = this.f266b0;
                    long e7 = c0028k03.e();
                    c0028k0 = c0028k02;
                    wVar = wVar2;
                    long j3 = c0028k03.f461o;
                    AbstractC1664a.h(abstractC0023i.f380f == 0);
                    abstractC0023i.f377c = g02;
                    abstractC0023i.f380f = 1;
                    abstractC0023i.o(z9, z7);
                    abstractC0023i.w(xArr, w7, e7, j3);
                    abstractC0023i.f373B = false;
                    abstractC0023i.f372A = j;
                    abstractC0023i.p(j, z9);
                    abstractC0023i.c(11, new O(this));
                    C0035o c0035o = this.f241E;
                    c0035o.getClass();
                    v2.h i10 = abstractC0023i.i();
                    if (i10 != null && i10 != (hVar = c0035o.f522d)) {
                        if (hVar != null) {
                            throw new r(2, new IllegalStateException("Multiple renderer media clocks enabled."), zzbbd.zzq.zzf);
                        }
                        c0035o.f522d = i10;
                        c0035o.f521c = abstractC0023i;
                        ((C1.H) i10).b(c0035o.f519a.f17144e);
                    }
                    if (z8) {
                        AbstractC1664a.h(abstractC0023i.f380f == 1);
                        abstractC0023i.f380f = 2;
                        abstractC0023i.r();
                    }
                    i8++;
                    c0034n02 = c0034n0;
                    set = set2;
                    c0028k02 = c0028k0;
                    wVar2 = wVar;
                }
            }
            c0034n0 = c0034n02;
            c0028k0 = c0028k02;
            wVar = wVar2;
            set2 = set;
            i8++;
            c0034n02 = c0034n0;
            set = set2;
            c0028k02 = c0028k0;
            wVar2 = wVar;
        }
        c0028k02.f454g = true;
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [c2.B, java.lang.Object] */
    public final void e0() {
        float f7;
        C0028k0 c0028k0 = this.f245I.f514h;
        if (c0028k0 == null) {
            return;
        }
        long M7 = c0028k0.f451d ? c0028k0.f448a.M() : -9223372036854775807L;
        if (M7 != -9223372036854775807L) {
            C(M7);
            if (M7 != this.f250N.f602s) {
                v0 v0Var = this.f250N;
                this.f250N = o(v0Var.f586b, M7, v0Var.f587c, M7, true, 5);
            }
        } else {
            C0035o c0035o = this.f241E;
            boolean z4 = c0028k0 != this.f245I.f515i;
            AbstractC0023i abstractC0023i = c0035o.f521c;
            v2.o oVar = c0035o.f519a;
            if (abstractC0023i == null || abstractC0023i.l() || (!c0035o.f521c.m() && (z4 || c0035o.f521c.k()))) {
                c0035o.f523e = true;
                if (c0035o.f524f) {
                    oVar.e();
                }
            } else {
                v2.h hVar = c0035o.f522d;
                hVar.getClass();
                long a2 = hVar.a();
                if (c0035o.f523e) {
                    if (a2 >= oVar.a()) {
                        c0035o.f523e = false;
                        if (c0035o.f524f) {
                            oVar.e();
                        }
                    } else if (oVar.f17141b) {
                        oVar.c(oVar.a());
                        oVar.f17141b = false;
                    }
                }
                oVar.c(a2);
                w0 d7 = hVar.d();
                if (!d7.equals(oVar.f17144e)) {
                    oVar.b(d7);
                    c0035o.f520b.f275y.a(16, d7).b();
                }
            }
            long a4 = c0035o.a();
            this.f266b0 = a4;
            long j = a4 - c0028k0.f461o;
            long j3 = this.f250N.f602s;
            if (!this.f242F.isEmpty() && !this.f250N.f586b.a()) {
                if (this.f269d0) {
                    this.f269d0 = false;
                }
                v0 v0Var2 = this.f250N;
                v0Var2.f585a.b(v0Var2.f586b.f10161a);
                int min = Math.min(this.c0, this.f242F.size());
                if (min > 0 && this.f242F.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f242F.size() && this.f242F.get(min) != null) {
                    throw new ClassCastException();
                }
                this.c0 = min;
            }
            this.f250N.f602s = j;
        }
        this.f250N.f600q = this.f245I.j.d();
        v0 v0Var3 = this.f250N;
        long j7 = v0Var3.f600q;
        C0028k0 c0028k02 = this.f245I.j;
        v0Var3.f601r = c0028k02 == null ? 0L : Math.max(0L, j7 - (this.f266b0 - c0028k02.f461o));
        v0 v0Var4 = this.f250N;
        if (v0Var4.f595l && v0Var4.f589e == 3 && Y(v0Var4.f585a, v0Var4.f586b)) {
            v0 v0Var5 = this.f250N;
            if (v0Var5.f597n.f606a == 1.0f) {
                C0031m c0031m = this.f247K;
                long g3 = g(v0Var5.f585a, v0Var5.f586b.f10161a, v0Var5.f602s);
                long j8 = this.f250N.f600q;
                C0028k0 c0028k03 = this.f245I.j;
                long max = c0028k03 == null ? 0L : Math.max(0L, j8 - (this.f266b0 - c0028k03.f461o));
                if (c0031m.f483h == -9223372036854775807L) {
                    f7 = 1.0f;
                } else {
                    long j9 = g3 - max;
                    long j10 = c0031m.f492r;
                    if (j10 == -9223372036854775807L) {
                        c0031m.f492r = j9;
                        c0031m.f493s = 0L;
                    } else {
                        float f8 = c0031m.f482g;
                        float f9 = j10 * f8;
                        float f10 = 1.0f - f8;
                        c0031m.f492r = Math.max(j9, (long) ((j9 * f10) + f9));
                        c0031m.f493s = (long) ((f10 * Math.abs(j9 - r4)) + (f8 * c0031m.f493s));
                    }
                    long j11 = c0031m.f491q;
                    long j12 = c0031m.f478c;
                    if (j11 == -9223372036854775807L || SystemClock.elapsedRealtime() - c0031m.f491q >= j12) {
                        c0031m.f491q = SystemClock.elapsedRealtime();
                        long j13 = (c0031m.f493s * 3) + c0031m.f492r;
                        long j14 = c0031m.f487m;
                        float f11 = c0031m.f479d;
                        if (j14 > j13) {
                            float E7 = v2.t.E(j12);
                            long[] jArr = {j13, c0031m.j, c0031m.f487m - (((long) ((c0031m.f490p - 1.0f) * E7)) + ((long) ((c0031m.f488n - 1.0f) * E7)))};
                            long j15 = jArr[0];
                            for (int i7 = 1; i7 < 3; i7++) {
                                long j16 = jArr[i7];
                                if (j16 > j15) {
                                    j15 = j16;
                                }
                            }
                            c0031m.f487m = j15;
                        } else {
                            long k7 = v2.t.k(g3 - ((long) (Math.max(0.0f, c0031m.f490p - 1.0f) / f11)), c0031m.f487m, j13);
                            c0031m.f487m = k7;
                            long j17 = c0031m.f486l;
                            if (j17 != -9223372036854775807L && k7 > j17) {
                                c0031m.f487m = j17;
                            }
                        }
                        long j18 = g3 - c0031m.f487m;
                        if (Math.abs(j18) < c0031m.f480e) {
                            c0031m.f490p = 1.0f;
                        } else {
                            c0031m.f490p = v2.t.i((f11 * j18) + 1.0f, c0031m.f489o, c0031m.f488n);
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

    @Override // c2.InterfaceC0793A
    public final void f(InterfaceC0794B interfaceC0794B) {
        this.f275y.a(8, interfaceC0794B).b();
    }

    public final void f0(R0 r02, c2.D d7, R0 r03, c2.D d8, long j) {
        if (!Y(r02, d7)) {
            w0 w0Var = d7.a() ? w0.f605d : this.f250N.f597n;
            C0035o c0035o = this.f241E;
            if (c0035o.d().equals(w0Var)) {
                return;
            }
            c0035o.b(w0Var);
            return;
        }
        Object obj = d7.f10161a;
        P0 p02 = this.f239C;
        int i7 = r02.g(obj, p02).f188c;
        Q0 q02 = this.f238B;
        r02.n(i7, q02);
        C0014d0 c0014d0 = q02.f204B;
        int i8 = v2.t.f17153a;
        C0031m c0031m = this.f247K;
        c0031m.getClass();
        c0031m.f483h = v2.t.E(c0014d0.f337a);
        c0031m.f485k = v2.t.E(c0014d0.f338b);
        c0031m.f486l = v2.t.E(c0014d0.f339c);
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
            c0031m.f484i = g(r02, obj, j);
            c0031m.a();
            return;
        }
        if (v2.t.a(!r03.p() ? r03.m(r03.g(d8.f10161a, p02).f188c, q02, 0L).f211a : null, q02.f211a)) {
            return;
        }
        c0031m.f484i = -9223372036854775807L;
        c0031m.a();
    }

    public final long g(R0 r02, Object obj, long j) {
        P0 p02 = this.f239C;
        int i7 = r02.g(obj, p02).f188c;
        Q0 q02 = this.f238B;
        r02.n(i7, q02);
        if (q02.f216f != -9223372036854775807L && q02.a() && q02.f219z) {
            return v2.t.E(v2.t.u(q02.f217x) - q02.f216f) - (j + p02.f190e);
        }
        return -9223372036854775807L;
    }

    public final synchronized void g0(C0042s c0042s, long j) {
        this.f243G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z4 = false;
        while (!((Boolean) c0042s.get()).booleanValue() && j > 0) {
            try {
                this.f243G.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.f243G.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair h(R0 r02) {
        if (r02.p()) {
            return Pair.create(v0.f584t, 0L);
        }
        Pair i7 = r02.i(this.f238B, this.f239C, r02.a(this.f258V), -9223372036854775807L);
        c2.D m7 = this.f245I.m(r02, i7.first, 0L);
        long longValue = ((Long) i7.second).longValue();
        if (m7.a()) {
            Object obj = m7.f10161a;
            P0 p02 = this.f239C;
            r02.g(obj, p02);
            longValue = m7.f10163c == p02.f(m7.f10162b) ? p02.f192x.f12385b : 0L;
        }
        return Pair.create(m7, Long.valueOf(longValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
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
                    m((InterfaceC0794B) message.obj);
                    break;
                case 9:
                    i((InterfaceC0794B) message.obj);
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
                    D0 d02 = (D0) message.obj;
                    d02.getClass();
                    K(d02);
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
                    y(message.arg1, message.arg2, (c2.Z) message.obj);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    V((c2.Z) message.obj);
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
                AbstractC1664a.G(e, "ExoPlayerImplInternal", "Recoverable renderer error");
                this.f271e0 = e;
                v2.r rVar = this.f275y;
                v2.q a2 = rVar.a(25, e);
                rVar.getClass();
                Message message2 = a2.f17146a;
                message2.getClass();
                rVar.f17148a.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                r rVar2 = this.f271e0;
                if (rVar2 != null) {
                    rVar2.addSuppressed(e);
                    e = this.f271e0;
                }
                AbstractC1664a.l("ExoPlayerImplInternal", "Playback error", e);
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
        } catch (C0796b e10) {
            j(e10, 1002);
        } catch (C1637n e11) {
            j(e11, e11.f16794a);
        } catch (IOException e12) {
            j(e12, 2000);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i8 = 1004;
            }
            r rVar3 = new r(2, e13, i8);
            AbstractC1664a.l("ExoPlayerImplInternal", "Playback error", rVar3);
            a0(true, false);
            this.f250N = this.f250N.e(rVar3);
        }
        t();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [c2.Y, java.lang.Object] */
    public final void i(InterfaceC0794B interfaceC0794B) {
        C0028k0 c0028k0 = this.f245I.j;
        if (c0028k0 == null || c0028k0.f448a != interfaceC0794B) {
            return;
        }
        long j = this.f266b0;
        if (c0028k0 != null) {
            AbstractC1664a.h(c0028k0.f458l == null);
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
        AbstractC1664a.l("ExoPlayerImplInternal", "Playback error", rVar);
        a0(false, false);
        this.f250N = this.f250N.e(rVar);
    }

    public final void k(boolean z4) {
        C0028k0 c0028k0 = this.f245I.j;
        c2.D d7 = c0028k0 == null ? this.f250N.f586b : c0028k0.f453f.f467a;
        boolean equals = this.f250N.f594k.equals(d7);
        if (!equals) {
            this.f250N = this.f250N.a(d7);
        }
        v0 v0Var = this.f250N;
        v0Var.f600q = c0028k0 == null ? v0Var.f602s : c0028k0.d();
        v0 v0Var2 = this.f250N;
        long j = v0Var2.f600q;
        C0028k0 c0028k02 = this.f245I.j;
        v0Var2.f601r = c0028k02 != null ? Math.max(0L, j - (this.f266b0 - c0028k02.f461o)) : 0L;
        if ((!equals || z4) && c0028k0 != null && c0028k0.f451d) {
            d0(c0028k0.f460n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x01ee, code lost:
    
        if (r5.e(r6, r9) != 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01f0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01fe, code lost:
    
        if (r5.g(r3.f10162b) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02e8 A[Catch: all -> 0x02ed, TryCatch #5 {all -> 0x02ed, blocks: (B:21:0x02e2, B:23:0x02e8, B:117:0x02f4, B:119:0x02ff, B:121:0x0305, B:123:0x030f, B:125:0x031c, B:128:0x031f, B:131:0x032a), top: B:14:0x0280 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(R0 r02, boolean z4) {
        int i7;
        int i8;
        c2.D d7;
        long j;
        int i9;
        long j3;
        boolean z7;
        boolean z8;
        boolean z9;
        int i10;
        boolean z10;
        long j7;
        long j8;
        S s7;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r10;
        T t7;
        int i13;
        ?? r8;
        T t8;
        long j9;
        T t9;
        long j10;
        long j11;
        v0 v0Var = this.f250N;
        T t10 = this.f264a0;
        C0034n0 c0034n0 = this.f245I;
        int i14 = this.f257U;
        boolean z15 = this.f258V;
        Q0 q02 = this.f238B;
        P0 p02 = this.f239C;
        if (r02.p()) {
            s7 = new S(v0.f584t, 0L, -9223372036854775807L, false, true, false);
            j = 0;
            i8 = -1;
            i7 = 4;
        } else {
            c2.D d8 = v0Var.f586b;
            Object obj = d8.f10161a;
            R0 r03 = v0Var.f585a;
            boolean z16 = r03.p() || r03.g(d8.f10161a, p02).f191f;
            long j12 = (v0Var.f586b.a() || z16) ? v0Var.f587c : v0Var.f602s;
            if (t10 != null) {
                i7 = 4;
                Pair E7 = E(r02, t10, true, i14, z15, q02, p02);
                if (E7 == null) {
                    i12 = r02.a(z15);
                    j3 = j12;
                    z13 = false;
                    z12 = false;
                    z14 = true;
                } else {
                    if (t10.f234c == -9223372036854775807L) {
                        i12 = r02.g(E7.first, p02).f188c;
                        j3 = j12;
                        z11 = false;
                    } else {
                        obj = E7.first;
                        j3 = ((Long) E7.second).longValue();
                        i12 = -1;
                        z11 = true;
                    }
                    z12 = v0Var.f589e == 4;
                    z13 = z11;
                    z14 = false;
                }
                z9 = z13;
                z7 = z12;
                z8 = z14;
                d7 = d8;
                i8 = -1;
                j = 0;
                i9 = i12;
            } else {
                i7 = 4;
                if (v0Var.f585a.p()) {
                    i9 = r02.a(z15);
                    j3 = j12;
                    d7 = d8;
                    i8 = -1;
                } else {
                    i8 = -1;
                    if (r02.b(obj) == -1) {
                        Object F7 = F(q02, p02, i14, z15, obj, v0Var.f585a, r02);
                        if (F7 == null) {
                            i10 = r02.a(z15);
                            z10 = true;
                        } else {
                            i10 = r02.g(F7, p02).f188c;
                            z10 = false;
                        }
                        i9 = i10;
                        z8 = z10;
                        j3 = j12;
                        d7 = d8;
                        j = 0;
                        z7 = false;
                        z9 = false;
                    } else if (j12 == -9223372036854775807L) {
                        i9 = r02.g(obj, p02).f188c;
                        j3 = j12;
                        d7 = d8;
                    } else if (z16) {
                        d7 = d8;
                        v0Var.f585a.g(d7.f10161a, p02);
                        if (v0Var.f585a.m(p02.f188c, q02, 0L).f208F == v0Var.f585a.b(d7.f10161a)) {
                            j = 0;
                            Pair i15 = r02.i(q02, p02, r02.g(obj, p02).f188c, j12 + p02.f190e);
                            obj = i15.first;
                            j3 = ((Long) i15.second).longValue();
                        } else {
                            j = 0;
                            j3 = j12;
                        }
                        i9 = -1;
                        z7 = false;
                        z8 = false;
                        z9 = true;
                    } else {
                        d7 = d8;
                        j = 0;
                        i9 = -1;
                        j3 = j12;
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
            if (i9 != i8) {
                Pair i16 = r02.i(q02, p02, i9, -9223372036854775807L);
                obj = i16.first;
                j3 = ((Long) i16.second).longValue();
                j7 = -9223372036854775807L;
            } else {
                j7 = j3;
            }
            c2.D m7 = c0034n0.m(r02, obj, j3);
            int i17 = m7.f10165e;
            boolean z17 = d7.f10161a.equals(obj) && !d7.a() && !m7.a() && (i17 == i8 || ((i11 = d7.f10165e) != i8 && i17 >= i11));
            P0 g3 = r02.g(obj, p02);
            if (!z16 && j12 == j7 && d7.f10161a.equals(m7.f10161a)) {
                if (d7.a()) {
                    int i18 = d7.f10162b;
                    if (g3.g(i18)) {
                        int i19 = d7.f10163c;
                        if (g3.e(i18, i19) != i7) {
                        }
                    }
                }
                if (m7.a()) {
                }
            }
            boolean z18 = false;
            if (z17 || z18) {
                m7 = d7;
            }
            if (!m7.a()) {
                j8 = j3;
            } else if (m7.equals(d7)) {
                j8 = v0Var.f602s;
            } else {
                r02.g(m7.f10161a, p02);
                j8 = m7.f10163c == p02.f(m7.f10162b) ? p02.f192x.f12385b : j;
            }
            s7 = new S(m7, j8, j7, z7, z8, z9);
        }
        c2.D d9 = s7.f221a;
        long j13 = s7.f223c;
        boolean z19 = s7.f224d;
        long j14 = s7.f222b;
        int i20 = i7;
        boolean z20 = (this.f250N.f586b.equals(d9) && j14 == this.f250N.f602s) ? false : true;
        try {
            if (s7.f225e) {
                try {
                    i13 = 1;
                    if (this.f250N.f589e != 1) {
                        try {
                            W(i20);
                        } catch (Throwable th) {
                            th = th;
                            i8 = i13;
                            j = j13;
                            r10 = 0;
                            j13 = j14;
                            v0 v0Var2 = this.f250N;
                            f0(r02, d9, v0Var2.f585a, v0Var2.f586b, s7.f226f ? j13 : -9223372036854775807L);
                            if (z20 && j == this.f250N.f587c) {
                                t7 = r10;
                            } else {
                                v0 v0Var3 = this.f250N;
                                Object obj2 = v0Var3.f586b.f10161a;
                                R0 r04 = v0Var3.f585a;
                                t7 = r10;
                                this.f250N = o(d9, j13, j, this.f250N.f588d, (z20 || !z4 || r04.p() || r04.g(obj2, this.f239C).f191f) ? 0 : i8, r02.b(obj2) == -1 ? 4 : 3);
                            }
                            B();
                            D(r02, this.f250N.f585a);
                            this.f250N = this.f250N.h(r02);
                            if (!r02.p()) {
                                this.f264a0 = t7;
                            }
                            k(false);
                            throw th;
                        }
                    }
                    A(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i13 = 1;
                    i8 = i13;
                    j = j13;
                    r10 = 0;
                    j13 = j14;
                    v0 v0Var22 = this.f250N;
                    f0(r02, d9, v0Var22.f585a, v0Var22.f586b, s7.f226f ? j13 : -9223372036854775807L);
                    if (z20) {
                    }
                    v0 v0Var32 = this.f250N;
                    Object obj22 = v0Var32.f586b.f10161a;
                    R0 r042 = v0Var32.f585a;
                    t7 = r10;
                    this.f250N = o(d9, j13, j, this.f250N.f588d, (z20 || !z4 || r042.p() || r042.g(obj22, this.f239C).f191f) ? 0 : i8, r02.b(obj22) == -1 ? 4 : 3);
                    B();
                    D(r02, this.f250N.f585a);
                    this.f250N = this.f250N.h(r02);
                    if (!r02.p()) {
                    }
                    k(false);
                    throw th;
                }
            } else {
                i13 = 1;
            }
            try {
                if (z20) {
                    r8 = i13;
                    j = j13;
                    t8 = null;
                    j9 = j14;
                    if (!r02.p()) {
                        for (C0028k0 c0028k0 = this.f245I.f514h; c0028k0 != null; c0028k0 = c0028k0.f458l) {
                            if (c0028k0.f453f.f467a.equals(d9)) {
                                c0028k0.f453f = this.f245I.g(r02, c0028k0.f453f);
                                c0028k0.h();
                            }
                        }
                        C0034n0 c0034n02 = this.f245I;
                        j9 = J(d9, j9, c0034n02.f514h != c0034n02.f515i ? r8 : false, z19);
                    }
                } else {
                    C0034n0 c0034n03 = this.f245I;
                    long j15 = this.f266b0;
                    C0028k0 c0028k02 = c0034n03.f515i;
                    if (c0028k02 == null) {
                        j10 = j14;
                        j11 = j;
                    } else {
                        j10 = j14;
                        try {
                            long j16 = c0028k02.f461o;
                            if (c0028k02.f451d) {
                                int i21 = 0;
                                while (true) {
                                    AbstractC0023i[] abstractC0023iArr = this.f263a;
                                    if (i21 >= abstractC0023iArr.length) {
                                        j = j13;
                                        j11 = j16;
                                        break;
                                    }
                                    if (q(abstractC0023iArr[i21])) {
                                        AbstractC0023i abstractC0023i = abstractC0023iArr[i21];
                                        j = j13;
                                        try {
                                            if (abstractC0023i.f381x == c0028k02.f450c[i21]) {
                                                long j17 = abstractC0023i.f372A;
                                                j11 = Long.MIN_VALUE;
                                                if (j17 == Long.MIN_VALUE) {
                                                    break;
                                                } else {
                                                    j16 = Math.max(j17, j16);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            j13 = j10;
                                            i8 = 1;
                                            r10 = 0;
                                            v0 v0Var222 = this.f250N;
                                            f0(r02, d9, v0Var222.f585a, v0Var222.f586b, s7.f226f ? j13 : -9223372036854775807L);
                                            if (z20) {
                                            }
                                            v0 v0Var322 = this.f250N;
                                            Object obj222 = v0Var322.f586b.f10161a;
                                            R0 r0422 = v0Var322.f585a;
                                            t7 = r10;
                                            this.f250N = o(d9, j13, j, this.f250N.f588d, (z20 || !z4 || r0422.p() || r0422.g(obj222, this.f239C).f191f) ? 0 : i8, r02.b(obj222) == -1 ? 4 : 3);
                                            B();
                                            D(r02, this.f250N.f585a);
                                            this.f250N = this.f250N.h(r02);
                                            if (!r02.p()) {
                                            }
                                            k(false);
                                            throw th;
                                        }
                                    } else {
                                        j = j13;
                                    }
                                    i21++;
                                    j13 = j;
                                }
                                r8 = 1;
                                j9 = j10;
                                t8 = null;
                                if (!c0034n03.o(r02, j15, j11)) {
                                    H(false);
                                }
                            } else {
                                j11 = j16;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            j = j13;
                        }
                    }
                    j = j13;
                    r8 = 1;
                    j9 = j10;
                    t8 = null;
                    if (!c0034n03.o(r02, j15, j11)) {
                    }
                }
                v0 v0Var4 = this.f250N;
                f0(r02, d9, v0Var4.f585a, v0Var4.f586b, s7.f226f ? j9 : -9223372036854775807L);
                if (z20 || j != this.f250N.f587c) {
                    v0 v0Var5 = this.f250N;
                    Object obj3 = v0Var5.f586b.f10161a;
                    R0 r05 = v0Var5.f585a;
                    t9 = t8;
                    this.f250N = o(d9, j9, j, this.f250N.f588d, (!z20 || !z4 || r05.p() || r05.g(obj3, this.f239C).f191f) ? 0 : r8, r02.b(obj3) == -1 ? 4 : 3);
                } else {
                    t9 = t8;
                }
                B();
                D(r02, this.f250N.f585a);
                this.f250N = this.f250N.h(r02);
                if (!r02.p()) {
                    this.f264a0 = t9;
                }
                k(false);
            } catch (Throwable th5) {
                th = th5;
                r10 = i20;
            }
        } catch (Throwable th6) {
            th = th6;
            j = j13;
            i8 = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [c2.B, java.lang.Object] */
    public final void m(InterfaceC0794B interfaceC0794B) {
        C0034n0 c0034n0 = this.f245I;
        C0028k0 c0028k0 = c0034n0.j;
        if (c0028k0 == null || c0028k0.f448a != interfaceC0794B) {
            return;
        }
        float f7 = this.f241E.d().f606a;
        R0 r02 = this.f250N.f585a;
        c0028k0.f451d = true;
        c0028k0.f459m = c0028k0.f448a.P();
        t2.w g3 = c0028k0.g(f7, r02);
        C0030l0 c0030l0 = c0028k0.f453f;
        long j = c0030l0.f471e;
        long j3 = c0030l0.f468b;
        long a2 = c0028k0.a(g3, (j == -9223372036854775807L || j3 < j) ? j3 : Math.max(0L, j - 1), false, new boolean[c0028k0.f456i.length]);
        long j7 = c0028k0.f461o;
        C0030l0 c0030l02 = c0028k0.f453f;
        c0028k0.f461o = (c0030l02.f468b - a2) + j7;
        c0028k0.f453f = c0030l02.b(a2);
        d0(c0028k0.f460n);
        if (c0028k0 == c0034n0.f514h) {
            C(c0028k0.f453f.f468b);
            e(new boolean[this.f263a.length]);
            v0 v0Var = this.f250N;
            c2.D d7 = v0Var.f586b;
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
            t2.c[] cVarArr = c0028k0.f460n.f16445c;
            int length = cVarArr.length;
            while (i7 < length) {
                t2.c cVar = cVarArr[i7];
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

    public final v0 o(c2.D d7, long j, long j3, long j7, boolean z4, int i7) {
        c2.f0 f0Var;
        t2.w wVar;
        List list;
        E3.L l7;
        int i8;
        this.f269d0 = (!this.f269d0 && j == this.f250N.f602s && d7.equals(this.f250N.f586b)) ? false : true;
        B();
        v0 v0Var = this.f250N;
        c2.f0 f0Var2 = v0Var.f592h;
        t2.w wVar2 = v0Var.f593i;
        List list2 = v0Var.j;
        if (this.f246J.f552b) {
            C0028k0 c0028k0 = this.f245I.f514h;
            c2.f0 f0Var3 = c0028k0 == null ? c2.f0.f10346d : c0028k0.f459m;
            t2.w wVar3 = c0028k0 == null ? this.f270e : c0028k0.f460n;
            t2.c[] cVarArr = wVar3.f16445c;
            C0164w c0164w = new C0164w();
            int length = cVarArr.length;
            int i9 = 0;
            boolean z7 = false;
            while (i9 < length) {
                t2.c cVar = cVarArr[i9];
                if (cVar != null) {
                    Metadata metadata = cVar.f16299d[0].f281A;
                    if (metadata == null) {
                        c0164w.b(new Metadata(new Metadata.Entry[0]));
                    } else {
                        c0164w.b(metadata);
                        i8 = 1;
                        z7 = true;
                        i9 += i8;
                    }
                }
                i8 = 1;
                i9 += i8;
            }
            if (z7) {
                l7 = c0164w.d();
            } else {
                C0165x c0165x = AbstractC0167z.f2083b;
                l7 = E3.L.f2000e;
            }
            if (c0028k0 != null) {
                C0030l0 c0030l0 = c0028k0.f453f;
                if (c0030l0.f469c != j3) {
                    c0028k0.f453f = c0030l0.a(j3);
                }
            }
            list = l7;
            f0Var = f0Var3;
            wVar = wVar3;
        } else if (d7.equals(v0Var.f586b)) {
            f0Var = f0Var2;
            wVar = wVar2;
            list = list2;
        } else {
            f0Var = c2.f0.f10346d;
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
                AbstractC1664a.f(i7 == 5);
            }
        }
        v0 v0Var2 = this.f250N;
        long j8 = v0Var2.f600q;
        C0028k0 c0028k02 = this.f245I.j;
        return v0Var2.b(d7, j, j3, j7, c0028k02 == null ? 0L : Math.max(0L, j8 - (this.f266b0 - c0028k02.f461o)), f0Var, wVar, list);
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
        boolean p5 = p();
        C0034n0 c0034n0 = this.f245I;
        if (p5) {
            C0028k0 c0028k0 = c0034n0.j;
            long k7 = !c0028k0.f451d ? 0L : c0028k0.f448a.k();
            C0028k0 c0028k02 = this.f245I.j;
            long max = c0028k02 != null ? Math.max(0L, k7 - (this.f266b0 - c0028k02.f461o)) : 0L;
            float f7 = this.f241E.d().f606a;
            C0033n c0033n = this.f272f;
            u2.r rVar = c0033n.f498a;
            synchronized (rVar) {
                i7 = rVar.f16819d * rVar.f16817b;
            }
            boolean z7 = i7 >= c0033n.f506i;
            long j = c0033n.f500c;
            long j3 = c0033n.f499b;
            if (f7 > 1.0f) {
                j3 = Math.min(v2.t.t(j3, f7), j);
            }
            if (max < Math.max(j3, 500000L)) {
                boolean z8 = c0033n.f504g || !z7;
                c0033n.j = z8;
                if (!z8 && max < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (max >= j || z7) {
                c0033n.j = false;
            }
            z4 = c0033n.j;
        } else {
            z4 = false;
        }
        this.f256T = z4;
        if (z4) {
            C0028k0 c0028k03 = c0034n0.j;
            long j7 = this.f266b0;
            AbstractC1664a.h(c0028k03.f458l == null);
            c0028k03.f448a.y(j7 - c0028k03.f461o);
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
            n2.f162i.f17148a.post(new A0.f(1, n2, q7));
            this.f251O = new Q(this.f250N);
        }
    }

    public final void u() {
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
        C1642t c1642t = (C1642t) this.f274x;
        c1642t.getClass();
        C0043s0 c0043s0 = this.f246J;
        AbstractC1664a.h(!c0043s0.f552b);
        c0043s0.f561l = c1642t;
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

    public final void y(int i7, int i8, c2.Z z4) {
        this.f251O.a(1);
        C0043s0 c0043s0 = this.f246J;
        c0043s0.getClass();
        AbstractC1664a.f(i7 >= 0 && i7 <= i8 && i8 <= ((ArrayList) c0043s0.f554d).size());
        c0043s0.f560k = z4;
        c0043s0.k(i7, i8);
        l(c0043s0.b(), false);
    }

    public final void z() {
        float f7 = this.f241E.d().f606a;
        C0034n0 c0034n0 = this.f245I;
        C0028k0 c0028k0 = c0034n0.f514h;
        C0028k0 c0028k02 = c0034n0.f515i;
        boolean z4 = true;
        for (C0028k0 c0028k03 = c0028k0; c0028k03 != null && c0028k03.f451d; c0028k03 = c0028k03.f458l) {
            t2.w g3 = c0028k03.g(f7, this.f250N.f585a);
            t2.w wVar = c0028k03.f460n;
            if (wVar != null) {
                int length = wVar.f16445c.length;
                t2.c[] cVarArr = g3.f16445c;
                if (length == cVarArr.length) {
                    for (int i7 = 0; i7 < cVarArr.length; i7++) {
                        if (g3.a(wVar, i7)) {
                        }
                    }
                    if (c0028k03 == c0028k02) {
                        z4 = false;
                    }
                }
            }
            if (z4) {
                C0034n0 c0034n02 = this.f245I;
                C0028k0 c0028k04 = c0034n02.f514h;
                boolean k7 = c0034n02.k(c0028k04);
                boolean[] zArr = new boolean[this.f263a.length];
                long a2 = c0028k04.a(g3, this.f250N.f602s, k7, zArr);
                v0 v0Var = this.f250N;
                boolean z7 = (v0Var.f589e == 4 || a2 == v0Var.f602s) ? false : true;
                v0 v0Var2 = this.f250N;
                this.f250N = o(v0Var2.f586b, a2, v0Var2.f587c, v0Var2.f588d, z7, 5);
                if (z7) {
                    C(a2);
                }
                boolean[] zArr2 = new boolean[this.f263a.length];
                int i8 = 0;
                while (true) {
                    AbstractC0023i[] abstractC0023iArr = this.f263a;
                    if (i8 >= abstractC0023iArr.length) {
                        break;
                    }
                    AbstractC0023i abstractC0023i = abstractC0023iArr[i8];
                    boolean q7 = q(abstractC0023i);
                    zArr2[i8] = q7;
                    c2.W w7 = c0028k04.f450c[i8];
                    if (q7) {
                        if (w7 != abstractC0023i.f381x) {
                            c(abstractC0023i);
                        } else if (zArr[i8]) {
                            long j = this.f266b0;
                            abstractC0023i.f373B = false;
                            abstractC0023i.f372A = j;
                            abstractC0023i.p(j, false);
                            i8++;
                        }
                    }
                    i8++;
                }
                e(zArr2);
            } else {
                this.f245I.k(c0028k03);
                if (c0028k03.f451d) {
                    c0028k03.a(g3, Math.max(c0028k03.f453f.f468b, this.f266b0 - c0028k03.f461o), false, new boolean[c0028k03.f456i.length]);
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
