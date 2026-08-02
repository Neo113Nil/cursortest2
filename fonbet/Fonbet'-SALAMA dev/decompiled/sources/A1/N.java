package A1;

import C1.C0101g;
import E3.AbstractC0167z;
import E3.C0165x;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import c2.AbstractC0795a;
import com.google.android.exoplayer2.metadata.Metadata;
import j2.C1306c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import r5.C1578c;
import u2.C1628e;
import u2.C1642t;
import u2.InterfaceC1629f;
import v2.AbstractC1664a;
import w1.C1761y0;

/* loaded from: classes.dex */
public final class N extends AbstractC0021h {

    /* renamed from: A, reason: collision with root package name */
    public final M4.e f126A;

    /* renamed from: B, reason: collision with root package name */
    public final long f127B;

    /* renamed from: C, reason: collision with root package name */
    public int f128C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f129D;

    /* renamed from: E, reason: collision with root package name */
    public int f130E;

    /* renamed from: F, reason: collision with root package name */
    public int f131F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f132G;

    /* renamed from: H, reason: collision with root package name */
    public int f133H;

    /* renamed from: I, reason: collision with root package name */
    public final H0 f134I;

    /* renamed from: J, reason: collision with root package name */
    public c2.Z f135J;

    /* renamed from: K, reason: collision with root package name */
    public y0 f136K;

    /* renamed from: L, reason: collision with root package name */
    public C0026j0 f137L;

    /* renamed from: M, reason: collision with root package name */
    public AudioTrack f138M;

    /* renamed from: N, reason: collision with root package name */
    public Surface f139N;

    /* renamed from: O, reason: collision with root package name */
    public Surface f140O;

    /* renamed from: P, reason: collision with root package name */
    public final int f141P;

    /* renamed from: Q, reason: collision with root package name */
    public int f142Q;

    /* renamed from: R, reason: collision with root package name */
    public int f143R;

    /* renamed from: S, reason: collision with root package name */
    public final int f144S;

    /* renamed from: T, reason: collision with root package name */
    public C0101g f145T;

    /* renamed from: U, reason: collision with root package name */
    public float f146U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f147V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f148W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f149X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f150Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0039q f151Z;

    /* renamed from: a0, reason: collision with root package name */
    public C0026j0 f152a0;

    /* renamed from: b, reason: collision with root package name */
    public final t2.w f153b;

    /* renamed from: b0, reason: collision with root package name */
    public v0 f154b0;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f155c;
    public int c0;

    /* renamed from: d, reason: collision with root package name */
    public final F1.y f156d;

    /* renamed from: d0, reason: collision with root package name */
    public long f157d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f158e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0021h f159f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0023i[] f160g;

    /* renamed from: h, reason: collision with root package name */
    public final t2.s f161h;

    /* renamed from: i, reason: collision with root package name */
    public final v2.r f162i;
    public final A j;

    /* renamed from: k, reason: collision with root package name */
    public final U f163k;

    /* renamed from: l, reason: collision with root package name */
    public final C1578c f164l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f165m;

    /* renamed from: n, reason: collision with root package name */
    public final P0 f166n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f167o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f168p;

    /* renamed from: q, reason: collision with root package name */
    public final B1.h f169q;

    /* renamed from: r, reason: collision with root package name */
    public final Looper f170r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1629f f171s;

    /* renamed from: t, reason: collision with root package name */
    public final v2.p f172t;

    /* renamed from: u, reason: collision with root package name */
    public final K f173u;

    /* renamed from: v, reason: collision with root package name */
    public final L f174v;

    /* renamed from: w, reason: collision with root package name */
    public final C0011c f175w;

    /* renamed from: x, reason: collision with root package name */
    public final C0019g f176x;

    /* renamed from: y, reason: collision with root package name */
    public final M0 f177y;

    /* renamed from: z, reason: collision with root package name */
    public final B4.V f178z;

    static {
        V.a("goog.exo.exoplayer");
    }

    public N(C0047v c0047v) {
        super(0);
        this.f156d = new F1.y();
        try {
            Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.0] [" + v2.t.f17157e + "]");
            Context context = c0047v.f568a;
            Looper looper = c0047v.f575h;
            this.f158e = context.getApplicationContext();
            v2.p pVar = c0047v.f569b;
            this.f169q = new B1.h(pVar);
            this.f145T = c0047v.f576i;
            this.f141P = c0047v.j;
            this.f147V = false;
            this.f127B = c0047v.f581o;
            K k7 = new K(this);
            this.f173u = k7;
            this.f174v = new L();
            Handler handler = new Handler(looper);
            AbstractC0023i[] a2 = ((C0037p) c0047v.f570c.get()).a(handler, k7, k7, k7, k7);
            this.f160g = a2;
            AbstractC1664a.h(a2.length > 0);
            this.f161h = (t2.s) c0047v.f572e.get();
            c0047v.f571d.get();
            this.f171s = (InterfaceC1629f) c0047v.f574g.get();
            this.f168p = c0047v.f577k;
            this.f134I = c0047v.f578l;
            this.f170r = looper;
            this.f172t = pVar;
            this.f159f = this;
            this.f164l = new C1578c(looper, pVar, new A(this));
            this.f165m = new CopyOnWriteArraySet();
            this.f167o = new ArrayList();
            this.f135J = new c2.Z();
            this.f153b = new t2.w(new G0[a2.length], new t2.c[a2.length], T0.f235b, null);
            this.f166n = new P0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28, 31};
            for (int i7 = 0; i7 < 21; i7++) {
                int i8 = iArr[i7];
                AbstractC1664a.h(!false);
                sparseBooleanArray.append(i8, true);
            }
            this.f161h.getClass();
            AbstractC1664a.h(!false);
            sparseBooleanArray.append(29, true);
            AbstractC1664a.h(!false);
            v2.d dVar = new v2.d(sparseBooleanArray);
            this.f155c = new y0(dVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i9 = 0; i9 < dVar.f17104a.size(); i9++) {
                int a4 = dVar.a(i9);
                AbstractC1664a.h(!false);
                sparseBooleanArray2.append(a4, true);
            }
            AbstractC1664a.h(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC1664a.h(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC1664a.h(!false);
            this.f136K = new y0(new v2.d(sparseBooleanArray2));
            this.f162i = this.f172t.a(this.f170r, null);
            A a7 = new A(this);
            this.j = a7;
            this.f154b0 = v0.i(this.f153b);
            this.f169q.O(this.f159f, this.f170r);
            int i10 = v2.t.f17153a;
            this.f163k = new U(this.f160g, this.f161h, this.f153b, (C0033n) c0047v.f573f.get(), this.f171s, this.f128C, this.f129D, this.f169q, this.f134I, c0047v.f579m, c0047v.f580n, this.f170r, this.f172t, a7, i10 < 31 ? new B1.p() : G.a(this.f158e, this, c0047v.f582p));
            this.f146U = 1.0f;
            this.f128C = 0;
            C0026j0 c0026j0 = C0026j0.f414X;
            this.f137L = c0026j0;
            this.f152a0 = c0026j0;
            int i11 = -1;
            this.c0 = -1;
            if (i10 < 21) {
                AudioTrack audioTrack = this.f138M;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f138M.release();
                    this.f138M = null;
                }
                if (this.f138M == null) {
                    this.f138M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f144S = this.f138M.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f158e.getSystemService("audio");
                if (audioManager != null) {
                    i11 = audioManager.generateAudioSessionId();
                }
                this.f144S = i11;
            }
            int i12 = C1306c.f14586a;
            this.f148W = true;
            B1.h hVar = this.f169q;
            hVar.getClass();
            this.f164l.a(hVar);
            InterfaceC1629f interfaceC1629f = this.f171s;
            Handler handler2 = new Handler(this.f170r);
            B1.h hVar2 = this.f169q;
            C1642t c1642t = (C1642t) interfaceC1629f;
            c1642t.getClass();
            hVar2.getClass();
            C1761y0 c1761y0 = c1642t.f16831b;
            c1761y0.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c1761y0.f17932b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1628e c1628e = (C1628e) it.next();
                if (c1628e.f16777b == hVar2) {
                    c1628e.f16778c = true;
                    copyOnWriteArrayList.remove(c1628e);
                }
            }
            copyOnWriteArrayList.add(new C1628e(hVar2, handler2));
            this.f165m.add(this.f173u);
            C0011c c0011c = new C0011c(context, handler, this.f173u);
            this.f175w = c0011c;
            c0011c.h();
            C0019g c0019g = new C0019g(context, handler, this.f173u);
            this.f176x = c0019g;
            c0019g.b(null);
            M0 m02 = new M0(context, handler, this.f173u);
            this.f177y = m02;
            m02.e(v2.t.y(this.f145T.f1487c));
            B4.V v6 = new B4.V(2);
            this.f178z = v6;
            M4.e eVar = new M4.e();
            this.f126A = eVar;
            this.f151Z = s(m02);
            this.f161h.a(this.f145T);
            M(1, 10, Integer.valueOf(this.f144S));
            M(2, 10, Integer.valueOf(this.f144S));
            M(1, 3, this.f145T);
            M(2, 4, Integer.valueOf(this.f141P));
            M(2, 5, 0);
            M(1, 9, Boolean.valueOf(this.f147V));
            M(2, 7, this.f174v);
            M(6, 8, this.f174v);
            this.f156d.a();
        } catch (Throwable th) {
            this.f156d.a();
            throw th;
        }
    }

    public static long F(v0 v0Var) {
        Q0 q02 = new Q0();
        P0 p02 = new P0();
        v0Var.f585a.g(v0Var.f586b.f10161a, p02);
        long j = v0Var.f587c;
        if (j != -9223372036854775807L) {
            return p02.f190e + j;
        }
        return v0Var.f585a.m(p02.f188c, q02, 0L).f206D;
    }

    public static boolean G(v0 v0Var) {
        return v0Var.f589e == 3 && v0Var.f595l && v0Var.f596m == 0;
    }

    public static void q(N n2, final int i7, final int i8) {
        if (i7 == n2.f142Q && i8 == n2.f143R) {
            return;
        }
        n2.f142Q = i7;
        n2.f143R = i8;
        n2.f164l.k(24, new v2.e() { // from class: A1.C
            @Override // v2.e
            public final void invoke(Object obj) {
                ((z0) obj).G(i7, i8);
            }
        });
    }

    public static C0039q s(M0 m02) {
        m02.getClass();
        int i7 = v2.t.f17153a;
        AudioManager audioManager = (AudioManager) m02.f124g;
        return new C0039q(0, i7 >= 28 ? audioManager.getStreamMinVolume(m02.f118a) : 0, audioManager.getStreamMaxVolume(m02.f118a));
    }

    public final R0 A() {
        W();
        return this.f154b0.f585a;
    }

    public final int B() {
        if (this.f154b0.f585a.p()) {
            return this.c0;
        }
        v0 v0Var = this.f154b0;
        return v0Var.f585a.g(v0Var.f586b.f10161a, this.f166n).f188c;
    }

    public final long C() {
        W();
        if (!H()) {
            R0 A7 = A();
            if (A7.p()) {
                return -9223372036854775807L;
            }
            return v2.t.N(A7.m(x(), (Q0) this.f364a, 0L).f207E);
        }
        v0 v0Var = this.f154b0;
        c2.D d7 = v0Var.f586b;
        R0 r02 = v0Var.f585a;
        Object obj = d7.f10161a;
        P0 p02 = this.f166n;
        r02.g(obj, p02);
        return v2.t.N(p02.a(d7.f10162b, d7.f10163c));
    }

    public final boolean D() {
        W();
        return this.f154b0.f595l;
    }

    public final int E() {
        W();
        return this.f154b0.f589e;
    }

    public final boolean H() {
        W();
        return this.f154b0.f586b.a();
    }

    public final v0 I(v0 v0Var, R0 r02, Pair pair) {
        List list;
        AbstractC1664a.f(r02.p() || pair != null);
        R0 r03 = v0Var.f585a;
        v0 h6 = v0Var.h(r02);
        if (r02.p()) {
            c2.D d7 = v0.f584t;
            long E7 = v2.t.E(this.f157d0);
            v0 a2 = h6.b(d7, E7, E7, E7, 0L, c2.f0.f10346d, this.f153b, E3.L.f2000e).a(d7);
            a2.f600q = a2.f602s;
            return a2;
        }
        Object obj = h6.f586b.f10161a;
        int i7 = v2.t.f17153a;
        boolean equals = obj.equals(pair.first);
        c2.D d8 = !equals ? new c2.D(pair.first) : h6.f586b;
        long longValue = ((Long) pair.second).longValue();
        long E8 = v2.t.E(u());
        if (!r03.p()) {
            E8 -= r03.g(obj, this.f166n).f190e;
        }
        if (!equals || longValue < E8) {
            AbstractC1664a.h(!d8.a());
            c2.f0 f0Var = !equals ? c2.f0.f10346d : h6.f592h;
            t2.w wVar = !equals ? this.f153b : h6.f593i;
            if (equals) {
                list = h6.j;
            } else {
                C0165x c0165x = AbstractC0167z.f2083b;
                list = E3.L.f2000e;
            }
            v0 a4 = h6.b(d8, longValue, longValue, longValue, 0L, f0Var, wVar, list).a(d8);
            a4.f600q = longValue;
            return a4;
        }
        if (longValue == E8) {
            int b7 = r02.b(h6.f594k.f10161a);
            if (b7 == -1 || r02.f(b7, this.f166n, false).f188c != r02.g(d8.f10161a, this.f166n).f188c) {
                r02.g(d8.f10161a, this.f166n);
                long a7 = d8.a() ? this.f166n.a(d8.f10162b, d8.f10163c) : this.f166n.f189d;
                h6 = h6.b(d8, h6.f602s, h6.f602s, h6.f588d, a7 - h6.f602s, h6.f592h, h6.f593i, h6.j).a(d8);
                h6.f600q = a7;
            }
        } else {
            AbstractC1664a.h(!d8.a());
            long max = Math.max(0L, h6.f601r - (longValue - E8));
            long j = h6.f600q;
            if (h6.f594k.equals(h6.f586b)) {
                j = longValue + max;
            }
            h6 = h6.b(d8, longValue, longValue, longValue, max, h6.f592h, h6.f593i, h6.j);
            h6.f600q = j;
        }
        return h6;
    }

    public final Pair J(R0 r02, int i7, long j) {
        if (r02.p()) {
            this.c0 = i7;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f157d0 = j;
            return null;
        }
        if (i7 == -1 || i7 >= r02.o()) {
            i7 = r02.a(this.f129D);
            j = v2.t.N(r02.m(i7, (Q0) this.f364a, 0L).f206D);
        }
        return r02.i((Q0) this.f364a, this.f166n, i7, v2.t.E(j));
    }

    public final void K() {
        W();
        boolean D7 = D();
        int d7 = this.f176x.d(2, D7);
        T(d7, (!D7 || d7 == 1) ? 1 : 2, D7);
        v0 v0Var = this.f154b0;
        if (v0Var.f589e != 1) {
            return;
        }
        v0 e7 = v0Var.e(null);
        v0 g3 = e7.g(e7.f585a.p() ? 4 : 2);
        this.f130E++;
        v2.r rVar = this.f163k.f275y;
        rVar.getClass();
        v2.q b7 = v2.r.b();
        b7.f17146a = rVar.f17148a.obtainMessage(0);
        b7.b();
        U(g3, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void L(int i7, long j) {
        W();
        B1.h hVar = this.f169q;
        if (!hVar.f994z) {
            B1.a a2 = hVar.a();
            hVar.f994z = true;
            hVar.N(a2, -1, new C0046u(27));
        }
        R0 r02 = this.f154b0.f585a;
        if (i7 < 0 || (!r02.p() && i7 >= r02.o())) {
            throw new Z();
        }
        this.f130E++;
        if (!H()) {
            int i8 = E() != 1 ? 2 : 1;
            int x4 = x();
            v0 I7 = I(this.f154b0.g(i8), r02, J(r02, i7, j));
            this.f163k.f275y.a(3, new T(r02, i7, v2.t.E(j))).b();
            U(I7, 0, 1, true, true, 1, z(I7), x4);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        Q q7 = new Q(this.f154b0);
        q7.a(1);
        N n2 = this.j.f61a;
        n2.f162i.f17148a.post(new A0.f(1, n2, q7));
    }

    public final void M(int i7, int i8, Object obj) {
        for (AbstractC0023i abstractC0023i : this.f160g) {
            if (abstractC0023i.f375a == i7) {
                int B7 = B();
                R0 r02 = this.f154b0.f585a;
                int i9 = B7 == -1 ? 0 : B7;
                U u4 = this.f163k;
                D0 d02 = new D0(u4, abstractC0023i, r02, i9, this.f172t, u4.f237A);
                AbstractC1664a.h(!d02.f82g);
                d02.f79d = i8;
                AbstractC1664a.h(!d02.f82g);
                d02.f80e = obj;
                d02.c();
            }
        }
    }

    public final void N(C0101g c0101g) {
        W();
        if (this.f150Y) {
            return;
        }
        boolean a2 = v2.t.a(this.f145T, c0101g);
        int i7 = 1;
        C1578c c1578c = this.f164l;
        if (!a2) {
            this.f145T = c0101g;
            M(1, 3, c0101g);
            this.f177y.e(v2.t.y(c0101g.f1487c));
            c1578c.i(20, new C0042s(c0101g, 3));
        }
        C0019g c0019g = this.f176x;
        c0019g.b(null);
        this.f161h.a(c0101g);
        boolean D7 = D();
        int d7 = c0019g.d(E(), D7);
        if (D7 && d7 != 1) {
            i7 = 2;
        }
        T(d7, i7, D7);
        c1578c.g();
    }

    public final void O(AbstractC0795a abstractC0795a) {
        W();
        List singletonList = Collections.singletonList(abstractC0795a);
        W();
        W();
        B();
        y();
        this.f130E++;
        ArrayList arrayList = this.f167o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = size - 1; i7 >= 0; i7--) {
                arrayList.remove(i7);
            }
            this.f135J = this.f135J.c(0, size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < singletonList.size(); i8++) {
            C0041r0 c0041r0 = new C0041r0((AbstractC0795a) singletonList.get(i8), this.f168p);
            arrayList2.add(c0041r0);
            arrayList.add(i8, new M(c0041r0.f545b, c0041r0.f544a.f10421o));
        }
        c2.Z b7 = this.f135J.b(0, arrayList2.size());
        this.f135J = b7;
        E0 e02 = new E0(arrayList, b7);
        boolean p5 = e02.p();
        int i9 = e02.f89d;
        if (!p5 && -1 >= i9) {
            throw new Z();
        }
        int a2 = e02.a(this.f129D);
        v0 I7 = I(this.f154b0, e02, J(e02, a2, -9223372036854775807L));
        int i10 = I7.f589e;
        if (a2 != -1 && i10 != 1) {
            i10 = (e02.p() || a2 >= i9) ? 4 : 2;
        }
        v0 g3 = I7.g(i10);
        this.f163k.f275y.a(17, new P(arrayList2, this.f135J, a2, v2.t.E(-9223372036854775807L))).b();
        U(g3, 0, 1, false, (this.f154b0.f586b.f10161a.equals(g3.f586b.f10161a) || this.f154b0.f585a.p()) ? false : true, 4, z(g3), -1);
    }

    public final void P(w0 w0Var) {
        W();
        if (this.f154b0.f597n.equals(w0Var)) {
            return;
        }
        v0 f7 = this.f154b0.f(w0Var);
        this.f130E++;
        this.f163k.f275y.a(4, w0Var).b();
        U(f7, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void Q(Surface surface) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0023i abstractC0023i : this.f160g) {
            if (abstractC0023i.f375a == 2) {
                int B7 = B();
                R0 r02 = this.f154b0.f585a;
                int i7 = B7 == -1 ? 0 : B7;
                U u4 = this.f163k;
                D0 d02 = new D0(u4, abstractC0023i, r02, i7, this.f172t, u4.f237A);
                AbstractC1664a.h(!d02.f82g);
                d02.f79d = 1;
                AbstractC1664a.h(!d02.f82g);
                d02.f80e = surface;
                d02.c();
                arrayList.add(d02);
            }
        }
        Surface surface2 = this.f139N;
        if (surface2 == null || surface2 == surface) {
            z4 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((D0) it.next()).a(this.f127B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            z4 = false;
            Surface surface3 = this.f139N;
            Surface surface4 = this.f140O;
            if (surface3 == surface4) {
                surface4.release();
                this.f140O = null;
            }
        }
        this.f139N = surface;
        if (z4) {
            R(new r(2, new W("Detaching surface timed out."), 1003));
        }
    }

    public final void R(r rVar) {
        v0 v0Var = this.f154b0;
        v0 a2 = v0Var.a(v0Var.f586b);
        a2.f600q = a2.f602s;
        a2.f601r = 0L;
        v0 g3 = a2.g(1);
        if (rVar != null) {
            g3 = g3.e(rVar);
        }
        v0 v0Var2 = g3;
        this.f130E++;
        v2.r rVar2 = this.f163k.f275y;
        rVar2.getClass();
        v2.q b7 = v2.r.b();
        b7.f17146a = rVar2.f17148a.obtainMessage(6);
        b7.b();
        U(v0Var2, 0, 1, false, v0Var2.f585a.p() && !this.f154b0.f585a.p(), 4, z(v0Var2), -1);
    }

    public final void S() {
        int k7;
        int e7;
        boolean z4 = false;
        y0 y0Var = this.f136K;
        int i7 = v2.t.f17153a;
        N n2 = (N) this.f159f;
        boolean H7 = n2.H();
        R0 A7 = n2.A();
        boolean p5 = A7.p();
        Q0 q02 = (Q0) n2.f364a;
        boolean z7 = !p5 && A7.m(n2.x(), q02, 0L).f218y;
        R0 A8 = n2.A();
        if (A8.p()) {
            k7 = -1;
        } else {
            int x4 = n2.x();
            n2.W();
            int i8 = n2.f128C;
            if (i8 == 1) {
                i8 = 0;
            }
            n2.W();
            k7 = A8.k(x4, i8, n2.f129D);
        }
        boolean z8 = k7 != -1;
        R0 A9 = n2.A();
        if (A9.p()) {
            e7 = -1;
        } else {
            int x7 = n2.x();
            n2.W();
            int i9 = n2.f128C;
            if (i9 == 1) {
                i9 = 0;
            }
            n2.W();
            e7 = A9.e(x7, i9, n2.f129D);
        }
        boolean z9 = e7 != -1;
        R0 A10 = n2.A();
        boolean z10 = !A10.p() && A10.m(n2.x(), q02, 0L).a();
        R0 A11 = n2.A();
        boolean z11 = !A11.p() && A11.m(n2.x(), q02, 0L).f219z;
        boolean p7 = n2.A().p();
        x0 x0Var = new x0(0);
        v2.d dVar = this.f155c.f616a;
        B3.g gVar = (B3.g) x0Var.f613b;
        gVar.getClass();
        for (int i10 = 0; i10 < dVar.f17104a.size(); i10++) {
            gVar.c(dVar.a(i10));
        }
        boolean z12 = !H7;
        x0Var.o(4, z12);
        x0Var.o(5, z7 && !H7);
        x0Var.o(6, z8 && !H7);
        x0Var.o(7, !p7 && (z8 || !z10 || z7) && !H7);
        x0Var.o(8, z9 && !H7);
        x0Var.o(9, !p7 && (z9 || (z10 && z11)) && !H7);
        x0Var.o(10, z12);
        x0Var.o(11, z7 && !H7);
        if (z7 && !H7) {
            z4 = true;
        }
        x0Var.o(12, z4);
        y0 y0Var2 = new y0(gVar.e());
        this.f136K = y0Var2;
        if (y0Var2.equals(y0Var)) {
            return;
        }
        this.f164l.i(13, new A(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void T(int i7, int i8, boolean z4) {
        int i9 = 0;
        ?? r32 = (!z4 || i7 == -1) ? 0 : 1;
        if (r32 != 0 && i7 != 1) {
            i9 = 1;
        }
        v0 v0Var = this.f154b0;
        if (v0Var.f595l == r32 && v0Var.f596m == i9) {
            return;
        }
        this.f130E++;
        v0 d7 = v0Var.d(i9, r32);
        v2.r rVar = this.f163k.f275y;
        rVar.getClass();
        v2.q b7 = v2.r.b();
        b7.f17146a = rVar.f17148a.obtainMessage(1, r32, i9);
        b7.b();
        U(d7, 0, i8, false, false, 5, -9223372036854775807L, -1);
    }

    public final void U(final v0 v0Var, final int i7, final int i8, boolean z4, boolean z7, final int i9, long j, int i10) {
        Pair pair;
        int i11;
        C0022h0 c0022h0;
        boolean z8;
        boolean z9;
        int i12;
        Object obj;
        C0022h0 c0022h02;
        Object obj2;
        int i13;
        long j3;
        long j7;
        long j8;
        long F7;
        Object obj3;
        C0022h0 c0022h03;
        Object obj4;
        int i14;
        v0 v0Var2 = this.f154b0;
        this.f154b0 = v0Var;
        boolean equals = v0Var2.f585a.equals(v0Var.f585a);
        R0 r02 = v0Var2.f585a;
        R0 r03 = v0Var.f585a;
        if (r03.p() && r02.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (r03.p() != r02.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            c2.D d7 = v0Var2.f586b;
            Object obj5 = d7.f10161a;
            P0 p02 = this.f166n;
            int i15 = r02.g(obj5, p02).f188c;
            Q0 q02 = (Q0) this.f364a;
            Object obj6 = r02.m(i15, q02, 0L).f211a;
            c2.D d8 = v0Var.f586b;
            if (obj6.equals(r03.m(r03.g(d8.f10161a, p02).f188c, q02, 0L).f211a)) {
                pair = (z7 && i9 == 0 && d7.f10164d < d8.f10164d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z7 && i9 == 0) {
                    i11 = 1;
                } else if (z7 && i9 == 1) {
                    i11 = 2;
                } else {
                    if (equals) {
                        throw new IllegalStateException();
                    }
                    i11 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        C0026j0 c0026j0 = this.f137L;
        if (booleanValue) {
            c0022h0 = !v0Var.f585a.p() ? v0Var.f585a.m(v0Var.f585a.g(v0Var.f586b.f10161a, this.f166n).f188c, (Q0) this.f364a, 0L).f213c : null;
            this.f152a0 = C0026j0.f414X;
        } else {
            c0022h0 = null;
        }
        if (booleanValue || !v0Var2.j.equals(v0Var.j)) {
            C0024i0 a2 = this.f152a0.a();
            List list = v0Var.j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                Metadata metadata = (Metadata) list.get(i16);
                int i17 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f10562a;
                    if (i17 < entryArr.length) {
                        entryArr[i17].h(a2);
                        i17++;
                    }
                }
            }
            this.f152a0 = new C0026j0(a2);
            c0026j0 = r();
        }
        boolean equals2 = c0026j0.equals(this.f137L);
        this.f137L = c0026j0;
        boolean z10 = v0Var2.f595l != v0Var.f595l;
        boolean z11 = v0Var2.f589e != v0Var.f589e;
        if (z11 || z10) {
            V();
        }
        boolean z12 = v0Var2.f591g != v0Var.f591g;
        if (!v0Var2.f585a.equals(v0Var.f585a)) {
            final int i18 = 0;
            this.f164l.i(0, new v2.e() { // from class: A1.E
                @Override // v2.e
                public final void invoke(Object obj7) {
                    z0 z0Var = (z0) obj7;
                    switch (i18) {
                        case 0:
                            R0 r04 = v0Var.f585a;
                            z0Var.w(i7);
                            break;
                        default:
                            z0Var.k(i7, v0Var.f595l);
                            break;
                    }
                }
            });
        }
        if (z7) {
            P0 p03 = new P0();
            if (v0Var2.f585a.p()) {
                z8 = z11;
                z9 = z12;
                i12 = i10;
                obj = null;
                c0022h02 = null;
                obj2 = null;
                i13 = -1;
            } else {
                Object obj7 = v0Var2.f586b.f10161a;
                v0Var2.f585a.g(obj7, p03);
                int i19 = p03.f188c;
                int b7 = v0Var2.f585a.b(obj7);
                z8 = z11;
                z9 = z12;
                obj = v0Var2.f585a.m(i19, (Q0) this.f364a, 0L).f211a;
                c0022h02 = ((Q0) this.f364a).f213c;
                i12 = i19;
                i13 = b7;
                obj2 = obj7;
            }
            if (i9 == 0) {
                if (v0Var2.f586b.a()) {
                    c2.D d9 = v0Var2.f586b;
                    j8 = p03.a(d9.f10162b, d9.f10163c);
                    F7 = F(v0Var2);
                } else if (v0Var2.f586b.f10165e != -1) {
                    j8 = F(this.f154b0);
                    F7 = j8;
                } else {
                    j3 = p03.f190e;
                    j7 = p03.f189d;
                    j8 = j3 + j7;
                    F7 = j8;
                }
            } else if (v0Var2.f586b.a()) {
                j8 = v0Var2.f602s;
                F7 = F(v0Var2);
            } else {
                j3 = p03.f190e;
                j7 = v0Var2.f602s;
                j8 = j3 + j7;
                F7 = j8;
            }
            long N7 = v2.t.N(j8);
            long N8 = v2.t.N(F7);
            c2.D d10 = v0Var2.f586b;
            final A0 a02 = new A0(obj, i12, c0022h02, obj2, i13, N7, N8, d10.f10162b, d10.f10163c);
            int x4 = x();
            if (this.f154b0.f585a.p()) {
                obj3 = null;
                c0022h03 = null;
                obj4 = null;
                i14 = -1;
            } else {
                v0 v0Var3 = this.f154b0;
                Object obj8 = v0Var3.f586b.f10161a;
                v0Var3.f585a.g(obj8, this.f166n);
                int b8 = this.f154b0.f585a.b(obj8);
                R0 r04 = this.f154b0.f585a;
                Q0 q03 = (Q0) this.f364a;
                i14 = b8;
                obj3 = r04.m(x4, q03, 0L).f211a;
                c0022h03 = q03.f213c;
                obj4 = obj8;
            }
            long N9 = v2.t.N(j);
            long N10 = this.f154b0.f586b.a() ? v2.t.N(F(this.f154b0)) : N9;
            c2.D d11 = this.f154b0.f586b;
            final A0 a03 = new A0(obj3, x4, c0022h03, obj4, i14, N9, N10, d11.f10162b, d11.f10163c);
            this.f164l.i(11, new v2.e() { // from class: A1.x
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    z0Var.getClass();
                    z0Var.i(i9, a02, a03);
                }
            });
        } else {
            z8 = z11;
            z9 = z12;
        }
        if (booleanValue) {
            this.f164l.i(1, new C0050y(c0022h0, intValue));
        }
        if (v0Var2.f590f != v0Var.f590f) {
            final int i20 = 0;
            this.f164l.i(10, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i20) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
            if (v0Var.f590f != null) {
                final int i21 = 1;
                this.f164l.i(10, new v2.e() { // from class: A1.z
                    @Override // v2.e
                    public final void invoke(Object obj9) {
                        z0 z0Var = (z0) obj9;
                        switch (i21) {
                            case 0:
                                z0Var.h(v0Var.f590f);
                                break;
                            case 1:
                                z0Var.s(v0Var.f590f);
                                break;
                            case 2:
                                z0Var.F(v0Var.f593i.f16446d);
                                break;
                            case 3:
                                v0 v0Var4 = v0Var;
                                boolean z13 = v0Var4.f591g;
                                z0Var.getClass();
                                z0Var.f(v0Var4.f591g);
                                break;
                            case 4:
                                v0 v0Var5 = v0Var;
                                z0Var.D(v0Var5.f589e, v0Var5.f595l);
                                break;
                            case 5:
                                z0Var.n(v0Var.f589e);
                                break;
                            case 6:
                                z0Var.c(v0Var.f596m);
                                break;
                            case 7:
                                z0Var.I(N.G(v0Var));
                                break;
                            default:
                                z0Var.E(v0Var.f597n);
                                break;
                        }
                    }
                });
            }
        }
        t2.w wVar = v0Var2.f593i;
        t2.w wVar2 = v0Var.f593i;
        if (wVar != wVar2) {
            t2.s sVar = this.f161h;
            E4.L l7 = wVar2.f16447e;
            sVar.getClass();
            final int i22 = 2;
            this.f164l.i(2, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i22) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
        }
        if (!equals2) {
            this.f164l.i(14, new C0042s(this.f137L, 2));
        }
        if (z9) {
            final int i23 = 3;
            this.f164l.i(3, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i23) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
        }
        if (z8 || z10) {
            final int i24 = 4;
            this.f164l.i(-1, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i24) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
        }
        if (z8) {
            final int i25 = 5;
            this.f164l.i(4, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i25) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
        }
        if (z10) {
            final int i26 = 1;
            this.f164l.i(5, new v2.e() { // from class: A1.E
                @Override // v2.e
                public final void invoke(Object obj72) {
                    z0 z0Var = (z0) obj72;
                    switch (i26) {
                        case 0:
                            R0 r042 = v0Var.f585a;
                            z0Var.w(i8);
                            break;
                        default:
                            z0Var.k(i8, v0Var.f595l);
                            break;
                    }
                }
            });
        }
        if (v0Var2.f596m != v0Var.f596m) {
            final int i27 = 6;
            this.f164l.i(6, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i27) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
        }
        if (G(v0Var2) != G(v0Var)) {
            final int i28 = 7;
            this.f164l.i(7, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i28) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
        }
        if (!v0Var2.f597n.equals(v0Var.f597n)) {
            final int i29 = 8;
            this.f164l.i(12, new v2.e() { // from class: A1.z
                @Override // v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i29) {
                        case 0:
                            z0Var.h(v0Var.f590f);
                            break;
                        case 1:
                            z0Var.s(v0Var.f590f);
                            break;
                        case 2:
                            z0Var.F(v0Var.f593i.f16446d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z13 = v0Var4.f591g;
                            z0Var.getClass();
                            z0Var.f(v0Var4.f591g);
                            break;
                        case 4:
                            v0 v0Var5 = v0Var;
                            z0Var.D(v0Var5.f589e, v0Var5.f595l);
                            break;
                        case 5:
                            z0Var.n(v0Var.f589e);
                            break;
                        case 6:
                            z0Var.c(v0Var.f596m);
                            break;
                        case 7:
                            z0Var.I(N.G(v0Var));
                            break;
                        default:
                            z0Var.E(v0Var.f597n);
                            break;
                    }
                }
            });
        }
        if (z4) {
            this.f164l.i(-1, new C0046u(2));
        }
        S();
        this.f164l.g();
        if (v0Var2.f598o != v0Var.f598o) {
            Iterator it = this.f165m.iterator();
            while (it.hasNext()) {
                ((K) it.next()).getClass();
            }
        }
        if (v0Var2.f599p != v0Var.f599p) {
            Iterator it2 = this.f165m.iterator();
            while (it2.hasNext()) {
                ((K) it2.next()).f109a.V();
            }
        }
    }

    public final void V() {
        int E7 = E();
        M4.e eVar = this.f126A;
        B4.V v6 = this.f178z;
        if (E7 != 1) {
            if (E7 == 2 || E7 == 3) {
                W();
                boolean z4 = this.f154b0.f599p;
                D();
                v6.getClass();
                D();
                eVar.getClass();
                return;
            }
            if (E7 != 4) {
                throw new IllegalStateException();
            }
        }
        v6.getClass();
        eVar.getClass();
    }

    public final void W() {
        F1.y yVar = this.f156d;
        synchronized (yVar) {
            boolean z4 = false;
            while (!yVar.f2588a) {
                try {
                    yVar.wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f170r.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f170r.getThread().getName();
            int i7 = v2.t.f17153a;
            Locale locale = Locale.US;
            String j = w1.L.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f148W) {
                throw new IllegalStateException(j);
            }
            AbstractC1664a.G(this.f149X ? null : new IllegalStateException(), "ExoPlayerImpl", j);
            this.f149X = true;
        }
    }

    public final C0026j0 r() {
        R0 A7 = A();
        if (A7.p()) {
            return this.f152a0;
        }
        C0022h0 c0022h0 = A7.m(x(), (Q0) this.f364a, 0L).f213c;
        C0024i0 a2 = this.f152a0.a();
        C0026j0 c0026j0 = c0022h0.f369d;
        if (c0026j0 != null) {
            CharSequence charSequence = c0026j0.f439a;
            if (charSequence != null) {
                a2.f389a = charSequence;
            }
            CharSequence charSequence2 = c0026j0.f440b;
            if (charSequence2 != null) {
                a2.f390b = charSequence2;
            }
            CharSequence charSequence3 = c0026j0.f441c;
            if (charSequence3 != null) {
                a2.f391c = charSequence3;
            }
            CharSequence charSequence4 = c0026j0.f442d;
            if (charSequence4 != null) {
                a2.f392d = charSequence4;
            }
            CharSequence charSequence5 = c0026j0.f443e;
            if (charSequence5 != null) {
                a2.f393e = charSequence5;
            }
            CharSequence charSequence6 = c0026j0.f444f;
            if (charSequence6 != null) {
                a2.f394f = charSequence6;
            }
            CharSequence charSequence7 = c0026j0.f445x;
            if (charSequence7 != null) {
                a2.f395g = charSequence7;
            }
            F0 f02 = c0026j0.f446y;
            if (f02 != null) {
                a2.f396h = f02;
            }
            F0 f03 = c0026j0.f447z;
            if (f03 != null) {
                a2.f397i = f03;
            }
            byte[] bArr = c0026j0.f416A;
            if (bArr != null) {
                a2.j = (byte[]) bArr.clone();
                a2.f398k = c0026j0.f417B;
            }
            Uri uri = c0026j0.f418C;
            if (uri != null) {
                a2.f399l = uri;
            }
            Integer num = c0026j0.f419D;
            if (num != null) {
                a2.f400m = num;
            }
            Integer num2 = c0026j0.f420E;
            if (num2 != null) {
                a2.f401n = num2;
            }
            Integer num3 = c0026j0.f421F;
            if (num3 != null) {
                a2.f402o = num3;
            }
            Boolean bool = c0026j0.f422G;
            if (bool != null) {
                a2.f403p = bool;
            }
            Integer num4 = c0026j0.f423H;
            if (num4 != null) {
                a2.f404q = num4;
            }
            Integer num5 = c0026j0.f424I;
            if (num5 != null) {
                a2.f404q = num5;
            }
            Integer num6 = c0026j0.f425J;
            if (num6 != null) {
                a2.f405r = num6;
            }
            Integer num7 = c0026j0.f426K;
            if (num7 != null) {
                a2.f406s = num7;
            }
            Integer num8 = c0026j0.f427L;
            if (num8 != null) {
                a2.f407t = num8;
            }
            Integer num9 = c0026j0.f428M;
            if (num9 != null) {
                a2.f408u = num9;
            }
            Integer num10 = c0026j0.f429N;
            if (num10 != null) {
                a2.f409v = num10;
            }
            CharSequence charSequence8 = c0026j0.f430O;
            if (charSequence8 != null) {
                a2.f410w = charSequence8;
            }
            CharSequence charSequence9 = c0026j0.f431P;
            if (charSequence9 != null) {
                a2.f411x = charSequence9;
            }
            CharSequence charSequence10 = c0026j0.f432Q;
            if (charSequence10 != null) {
                a2.f412y = charSequence10;
            }
            Integer num11 = c0026j0.f433R;
            if (num11 != null) {
                a2.f413z = num11;
            }
            Integer num12 = c0026j0.f434S;
            if (num12 != null) {
                a2.f384A = num12;
            }
            CharSequence charSequence11 = c0026j0.f435T;
            if (charSequence11 != null) {
                a2.f385B = charSequence11;
            }
            CharSequence charSequence12 = c0026j0.f436U;
            if (charSequence12 != null) {
                a2.f386C = charSequence12;
            }
            CharSequence charSequence13 = c0026j0.f437V;
            if (charSequence13 != null) {
                a2.f387D = charSequence13;
            }
            Bundle bundle = c0026j0.f438W;
            if (bundle != null) {
                a2.f388E = bundle;
            }
        }
        return new C0026j0(a2);
    }

    public final long t() {
        W();
        if (H()) {
            v0 v0Var = this.f154b0;
            return v0Var.f594k.equals(v0Var.f586b) ? v2.t.N(this.f154b0.f600q) : C();
        }
        W();
        if (this.f154b0.f585a.p()) {
            return this.f157d0;
        }
        v0 v0Var2 = this.f154b0;
        if (v0Var2.f594k.f10164d != v0Var2.f586b.f10164d) {
            return v2.t.N(v0Var2.f585a.m(x(), (Q0) this.f364a, 0L).f207E);
        }
        long j = v0Var2.f600q;
        if (this.f154b0.f594k.a()) {
            v0 v0Var3 = this.f154b0;
            P0 g3 = v0Var3.f585a.g(v0Var3.f594k.f10161a, this.f166n);
            long d7 = g3.d(this.f154b0.f594k.f10162b);
            j = d7 == Long.MIN_VALUE ? g3.f189d : d7;
        }
        v0 v0Var4 = this.f154b0;
        R0 r02 = v0Var4.f585a;
        Object obj = v0Var4.f594k.f10161a;
        P0 p02 = this.f166n;
        r02.g(obj, p02);
        return v2.t.N(j + p02.f190e);
    }

    public final long u() {
        W();
        if (!H()) {
            return y();
        }
        v0 v0Var = this.f154b0;
        R0 r02 = v0Var.f585a;
        Object obj = v0Var.f586b.f10161a;
        P0 p02 = this.f166n;
        r02.g(obj, p02);
        v0 v0Var2 = this.f154b0;
        return v0Var2.f587c == -9223372036854775807L ? v2.t.N(v0Var2.f585a.m(x(), (Q0) this.f364a, 0L).f206D) : v2.t.N(p02.f190e) + v2.t.N(this.f154b0.f587c);
    }

    public final int v() {
        W();
        if (H()) {
            return this.f154b0.f586b.f10162b;
        }
        return -1;
    }

    public final int w() {
        W();
        if (H()) {
            return this.f154b0.f586b.f10163c;
        }
        return -1;
    }

    public final int x() {
        W();
        int B7 = B();
        if (B7 == -1) {
            return 0;
        }
        return B7;
    }

    public final long y() {
        W();
        return v2.t.N(z(this.f154b0));
    }

    public final long z(v0 v0Var) {
        if (v0Var.f585a.p()) {
            return v2.t.E(this.f157d0);
        }
        if (v0Var.f586b.a()) {
            return v0Var.f602s;
        }
        R0 r02 = v0Var.f585a;
        c2.D d7 = v0Var.f586b;
        long j = v0Var.f602s;
        Object obj = d7.f10161a;
        P0 p02 = this.f166n;
        r02.g(obj, p02);
        return j + p02.f190e;
    }
}
