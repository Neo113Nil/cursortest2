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
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p018c2.AbstractC0755a;
import p146u2.C0946e;
import p146u2.C0960t;
import p146u2.InterfaceC0947f;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0021h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final M4.e f126A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f127B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f131F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f132G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f133H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final H0 f134I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p018c2.Z f135J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public y0 f136K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C0026j0 f137L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public AudioTrack f138M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Surface f139N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Surface f140O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f141P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f142Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f143R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f144S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0101g f145T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f146U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f147V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f148W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f149X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f150Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0039q f151Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C0026j0 f152a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p139t2.w f153b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public v0 f154b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f155c;
    public int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F1.y f156d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f157d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0021h f159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0023i[] f160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p139t2.s f161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p151v2.r f162i;
    public final A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U f163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p128r5.c f164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final P0 f166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B1.h f169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Looper f170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0947f f171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p151v2.p f172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final K f173u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final L f174v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0011c f175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0019g f176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final M0 f177y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final B4.V f178z;

    static {
        V.a("goog.exo.exoplayer");
    }

    public N(C0047v c0047v) {
        super(0);
        this.f156d = new F1.y();
        try {
            Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.0] [" + p151v2.t.f17163e + "]");
            Context context = c0047v.f568a;
            Looper looper = c0047v.f575h;
            this.f158e = context.getApplicationContext();
            p151v2.p pVar = c0047v.f569b;
            this.f169q = new B1.h(pVar);
            this.f145T = c0047v.f576i;
            this.f141P = c0047v.j;
            this.f147V = false;
            this.f127B = c0047v.f581o;
            K k7 = new K(this);
            this.f173u = k7;
            this.f174v = new L();
            Handler handler = new Handler(looper);
            AbstractC0023i[] abstractC0023iArrA = ((C0037p) c0047v.f570c.get()).a(handler, k7, k7, k7, k7);
            this.f160g = abstractC0023iArrA;
            p151v2.a.h(abstractC0023iArrA.length > 0);
            this.f161h = (p139t2.s) c0047v.f572e.get();
            c0047v.f571d.get();
            this.f171s = (InterfaceC0947f) c0047v.f574g.get();
            this.f168p = c0047v.f577k;
            this.f134I = c0047v.f578l;
            this.f170r = looper;
            this.f172t = pVar;
            this.f159f = this;
            this.f164l = new p128r5.c(looper, pVar, new A(this));
            this.f165m = new CopyOnWriteArraySet();
            this.f167o = new ArrayList();
            this.f135J = new p018c2.Z();
            this.f153b = new p139t2.w(new G0[abstractC0023iArrA.length], new p139t2.c[abstractC0023iArrA.length], T0.f235b, null);
            this.f166n = new P0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28, 31};
            for (int i7 = 0; i7 < 21; i7++) {
                int i8 = iArr[i7];
                p151v2.a.h(!false);
                sparseBooleanArray.append(i8, true);
            }
            this.f161h.getClass();
            p151v2.a.h(!false);
            sparseBooleanArray.append(29, true);
            p151v2.a.h(!false);
            p151v2.d dVar = new p151v2.d(sparseBooleanArray);
            this.f155c = new y0(dVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i9 = 0; i9 < dVar.f17110a.size(); i9++) {
                int iA = dVar.a(i9);
                p151v2.a.h(!false);
                sparseBooleanArray2.append(iA, true);
            }
            p151v2.a.h(!false);
            sparseBooleanArray2.append(4, true);
            p151v2.a.h(!false);
            sparseBooleanArray2.append(10, true);
            p151v2.a.h(!false);
            this.f136K = new y0(new p151v2.d(sparseBooleanArray2));
            this.f162i = this.f172t.a(this.f170r, null);
            A a2 = new A(this);
            this.j = a2;
            this.f154b0 = v0.i(this.f153b);
            this.f169q.O(this.f159f, this.f170r);
            int i10 = p151v2.t.f17159a;
            this.f163k = new U(this.f160g, this.f161h, this.f153b, (C0033n) c0047v.f573f.get(), this.f171s, this.f128C, this.f129D, this.f169q, this.f134I, c0047v.f579m, c0047v.f580n, this.f170r, this.f172t, a2, i10 < 31 ? new B1.p() : G.a(this.f158e, this, c0047v.f582p));
            this.f146U = 1.0f;
            this.f128C = 0;
            C0026j0 c0026j0 = C0026j0.f414X;
            this.f137L = c0026j0;
            this.f152a0 = c0026j0;
            int iGenerateAudioSessionId = -1;
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
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f144S = iGenerateAudioSessionId;
            }
            int i11 = p068j2.c.f14592a;
            this.f148W = true;
            B1.h hVar = this.f169q;
            hVar.getClass();
            this.f164l.a(hVar);
            InterfaceC0947f interfaceC0947f = this.f171s;
            Handler handler2 = new Handler(this.f170r);
            B1.h hVar2 = this.f169q;
            C0960t c0960t = (C0960t) interfaceC0947f;
            c0960t.getClass();
            hVar2.getClass();
            C1052y0 c1052y0 = c0960t.f16837b;
            c1052y0.getClass();
            CopyOnWriteArrayList<C0946e> copyOnWriteArrayList = (CopyOnWriteArrayList) c1052y0.f17938b;
            for (C0946e c0946e : copyOnWriteArrayList) {
                if (c0946e.f16783b == hVar2) {
                    c0946e.f16784c = true;
                    copyOnWriteArrayList.remove(c0946e);
                }
            }
            copyOnWriteArrayList.add(new C0946e(hVar2, handler2));
            this.f165m.add(this.f173u);
            C0011c c0011c = new C0011c(context, handler, this.f173u);
            this.f175w = c0011c;
            c0011c.h();
            C0019g c0019g = new C0019g(context, handler, this.f173u);
            this.f176x = c0019g;
            c0019g.b(null);
            M0 m7 = new M0(context, handler, this.f173u);
            this.f177y = m7;
            m7.e(p151v2.t.y(this.f145T.f1487c));
            B4.V v6 = new B4.V(2);
            this.f178z = v6;
            M4.e eVar = new M4.e();
            this.f126A = eVar;
            this.f151Z = s(m7);
            this.f161h.a(this.f145T);
            M(1, 10, Integer.valueOf(this.f144S));
            M(2, 10, Integer.valueOf(this.f144S));
            M(1, 3, this.f145T);
            M(2, 4, Integer.valueOf(this.f141P));
            M(2, 5, 0);
            M(1, 9, Boolean.valueOf(this.f147V));
            M(2, 7, this.f174v);
            M(6, 8, this.f174v);
        } finally {
            this.f156d.a();
        }
    }

    public static long F(v0 v0Var) {
        Q0 q1 = new Q0();
        P0 p5 = new P0();
        v0Var.f585a.g(v0Var.f586b.f10161a, p5);
        long j = v0Var.f587c;
        if (j != -9223372036854775807L) {
            return p5.f190e + j;
        }
        return v0Var.f585a.m(p5.f188c, q1, 0L).f206D;
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
        n2.f164l.k(24, new p151v2.e() { // from class: A1.C
            @Override // p151v2.e
            public final void invoke(Object obj) {
                ((z0) obj).G(i7, i8);
            }
        });
    }

    public static C0039q s(M0 m7) {
        m7.getClass();
        int i7 = p151v2.t.f17159a;
        AudioManager audioManager = (AudioManager) m7.f124g;
        return new C0039q(0, i7 >= 28 ? audioManager.getStreamMinVolume(m7.f118a) : 0, audioManager.getStreamMaxVolume(m7.f118a));
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
            R0 r0A = A();
            if (r0A.p()) {
                return -9223372036854775807L;
            }
            return p151v2.t.N(r0A.m(x(), (Q0) this.f364a, 0L).f207E);
        }
        v0 v0Var = this.f154b0;
        p018c2.D d7 = v0Var.f586b;
        R0 r7 = v0Var.f585a;
        Object obj = d7.f10161a;
        P0 p5 = this.f166n;
        r7.g(obj, p5);
        return p151v2.t.N(p5.a(d7.f10162b, d7.f10163c));
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

    public final v0 I(v0 v0Var, R0 r7, Pair pair) {
        List list;
        p151v2.a.f(r7.p() || pair != null);
        R0 r8 = v0Var.f585a;
        v0 v0VarH = v0Var.h(r7);
        if (r7.p()) {
            p018c2.D d7 = v0.f584t;
            long jE = p151v2.t.E(this.f157d0);
            v0 v0VarA = v0VarH.b(d7, jE, jE, jE, 0L, p018c2.f0.f10346d, this.f153b, E3.L.f2000e).a(d7);
            v0VarA.f600q = v0VarA.f602s;
            return v0VarA;
        }
        Object obj = v0VarH.f586b.f10161a;
        int i7 = p151v2.t.f17159a;
        boolean zEquals = obj.equals(pair.first);
        p018c2.D d8 = !zEquals ? new p018c2.D(pair.first) : v0VarH.f586b;
        long jLongValue = ((Long) pair.second).longValue();
        long jE2 = p151v2.t.E(u());
        if (!r8.p()) {
            jE2 -= r8.g(obj, this.f166n).f190e;
        }
        if (!zEquals || jLongValue < jE2) {
            p151v2.a.h(!d8.a());
            p018c2.f0 f0Var = !zEquals ? p018c2.f0.f10346d : v0VarH.f592h;
            p139t2.w wVar = !zEquals ? this.f153b : v0VarH.f593i;
            if (zEquals) {
                list = v0VarH.j;
            } else {
                C0165x c0165x = AbstractC0167z.f2083b;
                list = E3.L.f2000e;
            }
            v0 v0VarA2 = v0VarH.b(d8, jLongValue, jLongValue, jLongValue, 0L, f0Var, wVar, list).a(d8);
            v0VarA2.f600q = jLongValue;
            return v0VarA2;
        }
        if (jLongValue == jE2) {
            int iB = r7.b(v0VarH.f594k.f10161a);
            if (iB == -1 || r7.f(iB, this.f166n, false).f188c != r7.g(d8.f10161a, this.f166n).f188c) {
                r7.g(d8.f10161a, this.f166n);
                long jA = d8.a() ? this.f166n.a(d8.f10162b, d8.f10163c) : this.f166n.f189d;
                v0VarH = v0VarH.b(d8, v0VarH.f602s, v0VarH.f602s, v0VarH.f588d, jA - v0VarH.f602s, v0VarH.f592h, v0VarH.f593i, v0VarH.j).a(d8);
                v0VarH.f600q = jA;
            }
        } else {
            p151v2.a.h(!d8.a());
            long jMax = Math.max(0L, v0VarH.f601r - (jLongValue - jE2));
            long j = v0VarH.f600q;
            if (v0VarH.f594k.equals(v0VarH.f586b)) {
                j = jLongValue + jMax;
            }
            v0VarH = v0VarH.b(d8, jLongValue, jLongValue, jLongValue, jMax, v0VarH.f592h, v0VarH.f593i, v0VarH.j);
            v0VarH.f600q = j;
        }
        return v0VarH;
    }

    public final Pair J(R0 r7, int i7, long j) {
        if (r7.p()) {
            this.c0 = i7;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f157d0 = j;
            return null;
        }
        if (i7 == -1 || i7 >= r7.o()) {
            i7 = r7.a(this.f129D);
            j = p151v2.t.N(r7.m(i7, (Q0) this.f364a, 0L).f206D);
        }
        return r7.i((Q0) this.f364a, this.f166n, i7, p151v2.t.E(j));
    }

    public final void K() {
        W();
        boolean zD = D();
        int iD = this.f176x.d(2, zD);
        T(iD, (!zD || iD == 1) ? 1 : 2, zD);
        v0 v0Var = this.f154b0;
        if (v0Var.f589e != 1) {
            return;
        }
        v0 v0VarE = v0Var.e(null);
        v0 v0VarG = v0VarE.g(v0VarE.f585a.p() ? 4 : 2);
        this.f130E++;
        p151v2.r rVar = this.f163k.f275y;
        rVar.getClass();
        p151v2.q qVarB = p151v2.r.b();
        qVarB.f17152a = rVar.f17154a.obtainMessage(0);
        qVarB.b();
        U(v0VarG, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void L(int i7, long j) {
        W();
        B1.h hVar = this.f169q;
        if (!hVar.f994z) {
            B1.a aVarA = hVar.a();
            hVar.f994z = true;
            hVar.N(aVarA, -1, new C0046u(27));
        }
        R0 r7 = this.f154b0.f585a;
        if (i7 < 0 || (!r7.p() && i7 >= r7.o())) {
            throw new Z();
        }
        this.f130E++;
        if (!H()) {
            int i8 = E() != 1 ? 2 : 1;
            int iX = x();
            v0 v0VarI = I(this.f154b0.g(i8), r7, J(r7, i7, j));
            this.f163k.f275y.a(3, new T(r7, i7, p151v2.t.E(j))).b();
            U(v0VarI, 0, 1, true, true, 1, z(v0VarI), iX);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        Q q7 = new Q(this.f154b0);
        q7.a(1);
        N n2 = this.j.f61a;
        n2.f162i.f17154a.post(new A0.f(1, n2, q7));
    }

    public final void M(int i7, int i8, Object obj) {
        for (AbstractC0023i abstractC0023i : this.f160g) {
            if (abstractC0023i.f375a == i7) {
                int iB = B();
                R0 r7 = this.f154b0.f585a;
                int i9 = iB == -1 ? 0 : iB;
                U u4 = this.f163k;
                D0 d7 = new D0(u4, abstractC0023i, r7, i9, this.f172t, u4.f237A);
                p151v2.a.h(!d7.f82g);
                d7.f79d = i8;
                p151v2.a.h(!d7.f82g);
                d7.f80e = obj;
                d7.c();
            }
        }
    }

    public final void N(C0101g c0101g) {
        W();
        if (this.f150Y) {
            return;
        }
        boolean zA = p151v2.t.a(this.f145T, c0101g);
        int i7 = 1;
        p128r5.c cVar = this.f164l;
        if (!zA) {
            this.f145T = c0101g;
            M(1, 3, c0101g);
            this.f177y.e(p151v2.t.y(c0101g.f1487c));
            cVar.i(20, new C0042s(c0101g, 3));
        }
        C0019g c0019g = this.f176x;
        c0019g.b(null);
        this.f161h.a(c0101g);
        boolean zD = D();
        int iD = c0019g.d(E(), zD);
        if (zD && iD != 1) {
            i7 = 2;
        }
        T(iD, i7, zD);
        cVar.g();
    }

    public final void O(AbstractC0755a abstractC0755a) {
        W();
        List listSingletonList = Collections.singletonList(abstractC0755a);
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
        for (int i8 = 0; i8 < listSingletonList.size(); i8++) {
            C0041r0 c0041r0 = new C0041r0((AbstractC0755a) listSingletonList.get(i8), this.f168p);
            arrayList2.add(c0041r0);
            arrayList.add(i8, new M(c0041r0.f545b, c0041r0.f544a.f10421o));
        }
        p018c2.Z zB = this.f135J.b(0, arrayList2.size());
        this.f135J = zB;
        E0 e7 = new E0(arrayList, zB);
        boolean zP = e7.p();
        int i9 = e7.f89d;
        if (!zP && -1 >= i9) {
            throw new Z();
        }
        int iA = e7.a(this.f129D);
        v0 v0VarI = I(this.f154b0, e7, J(e7, iA, -9223372036854775807L));
        int i10 = v0VarI.f589e;
        if (iA != -1 && i10 != 1) {
            i10 = (e7.p() || iA >= i9) ? 4 : 2;
        }
        v0 v0VarG = v0VarI.g(i10);
        this.f163k.f275y.a(17, new P(arrayList2, this.f135J, iA, p151v2.t.E(-9223372036854775807L))).b();
        U(v0VarG, 0, 1, false, (this.f154b0.f586b.f10161a.equals(v0VarG.f586b.f10161a) || this.f154b0.f585a.p()) ? false : true, 4, z(v0VarG), -1);
    }

    public final void P(w0 w0Var) {
        W();
        if (this.f154b0.f597n.equals(w0Var)) {
            return;
        }
        v0 v0VarF = this.f154b0.f(w0Var);
        this.f130E++;
        this.f163k.f275y.a(4, w0Var).b();
        U(v0VarF, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void Q(Surface surface) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0023i abstractC0023i : this.f160g) {
            if (abstractC0023i.f375a == 2) {
                int iB = B();
                R0 r7 = this.f154b0.f585a;
                int i7 = iB == -1 ? 0 : iB;
                U u4 = this.f163k;
                D0 d7 = new D0(u4, abstractC0023i, r7, i7, this.f172t, u4.f237A);
                p151v2.a.h(!d7.f82g);
                d7.f79d = 1;
                p151v2.a.h(!d7.f82g);
                d7.f80e = surface;
                d7.c();
                arrayList.add(d7);
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
        v0 v0VarA = v0Var.a(v0Var.f586b);
        v0VarA.f600q = v0VarA.f602s;
        v0VarA.f601r = 0L;
        v0 v0VarG = v0VarA.g(1);
        if (rVar != null) {
            v0VarG = v0VarG.e(rVar);
        }
        v0 v0Var2 = v0VarG;
        this.f130E++;
        p151v2.r rVar2 = this.f163k.f275y;
        rVar2.getClass();
        p151v2.q qVarB = p151v2.r.b();
        qVarB.f17152a = rVar2.f17154a.obtainMessage(6);
        qVarB.b();
        U(v0Var2, 0, 1, false, v0Var2.f585a.p() && !this.f154b0.f585a.p(), 4, z(v0Var2), -1);
    }

    public final void S() {
        int iK;
        int iE;
        boolean z4 = false;
        y0 y0Var = this.f136K;
        int i7 = p151v2.t.f17159a;
        N n2 = (N) this.f159f;
        boolean zH = n2.H();
        R0 r0A = n2.A();
        boolean zP = r0A.p();
        Q0 q1 = (Q0) n2.f364a;
        boolean z7 = !zP && r0A.m(n2.x(), q1, 0L).f218y;
        R0 r0A2 = n2.A();
        if (r0A2.p()) {
            iK = -1;
        } else {
            int iX = n2.x();
            n2.W();
            int i8 = n2.f128C;
            if (i8 == 1) {
                i8 = 0;
            }
            n2.W();
            iK = r0A2.k(iX, i8, n2.f129D);
        }
        boolean z8 = iK != -1;
        R0 r0A3 = n2.A();
        if (r0A3.p()) {
            iE = -1;
        } else {
            int iX2 = n2.x();
            n2.W();
            int i9 = n2.f128C;
            if (i9 == 1) {
                i9 = 0;
            }
            n2.W();
            iE = r0A3.e(iX2, i9, n2.f129D);
        }
        boolean z9 = iE != -1;
        R0 r0A4 = n2.A();
        boolean z10 = !r0A4.p() && r0A4.m(n2.x(), q1, 0L).a();
        R0 r0A5 = n2.A();
        boolean z11 = !r0A5.p() && r0A5.m(n2.x(), q1, 0L).f219z;
        boolean zP2 = n2.A().p();
        x0 x0Var = new x0(0);
        p151v2.d dVar = this.f155c.f616a;
        B3.g gVar = (B3.g) x0Var.f613b;
        gVar.getClass();
        for (int i10 = 0; i10 < dVar.f17110a.size(); i10++) {
            gVar.c(dVar.a(i10));
        }
        boolean z12 = !zH;
        x0Var.o(4, z12);
        x0Var.o(5, z7 && !zH);
        x0Var.o(6, z8 && !zH);
        x0Var.o(7, !zP2 && (z8 || !z10 || z7) && !zH);
        x0Var.o(8, z9 && !zH);
        x0Var.o(9, !zP2 && (z9 || (z10 && z11)) && !zH);
        x0Var.o(10, z12);
        x0Var.o(11, z7 && !zH);
        if (z7 && !zH) {
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
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void T(int i7, int i8, boolean z4) {
        int i9 = 0;
        ?? r7 = (!z4 || i7 == -1) ? 0 : 1;
        if (r7 != 0 && i7 != 1) {
            i9 = 1;
        }
        v0 v0Var = this.f154b0;
        if (v0Var.f595l == r7 && v0Var.f596m == i9) {
            return;
        }
        this.f130E++;
        v0 v0VarD = v0Var.d(i9, r7);
        p151v2.r rVar = this.f163k.f275y;
        rVar.getClass();
        p151v2.q qVarB = p151v2.r.b();
        qVarB.f17152a = rVar.f17154a.obtainMessage(1, r7, i9);
        qVarB.b();
        U(v0VarD, 0, i8, false, false, 5, -9223372036854775807L, -1);
    }

    public final void U(final v0 v0Var, final int i7, final int i8, boolean z4, boolean z7, final int i9, long j, int i10) {
        Pair pair;
        int i11;
        C0022h0 c0022h0;
        int i12;
        Object obj;
        C0022h0 c0022h1;
        Object obj2;
        int i13;
        long j3;
        long j7;
        long jF;
        long jF2;
        Object obj3;
        C0022h0 c0022h2;
        Object obj4;
        int i14;
        v0 v0Var2 = this.f154b0;
        this.f154b0 = v0Var;
        boolean zEquals = v0Var2.f585a.equals(v0Var.f585a);
        R0 r7 = v0Var2.f585a;
        R0 r8 = v0Var.f585a;
        if (r8.p() && r7.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (r8.p() != r7.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            p018c2.D d7 = v0Var2.f586b;
            Object obj5 = d7.f10161a;
            P0 p5 = this.f166n;
            int i15 = r7.g(obj5, p5).f188c;
            Q0 q1 = (Q0) this.f364a;
            Object obj6 = r7.m(i15, q1, 0L).f211a;
            p018c2.D d8 = v0Var.f586b;
            if (obj6.equals(r8.m(r8.g(d8.f10161a, p5).f188c, q1, 0L).f211a)) {
                pair = (z7 && i9 == 0 && d7.f10164d < d8.f10164d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z7 && i9 == 0) {
                    i11 = 1;
                } else if (z7 && i9 == 1) {
                    i11 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i11 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        C0026j0 c0026j0R = this.f137L;
        if (zBooleanValue) {
            c0022h0 = v0Var.f585a.p() ? null : v0Var.f585a.m(v0Var.f585a.g(v0Var.f586b.f10161a, this.f166n).f188c, (Q0) this.f364a, 0L).f213c;
            this.f152a0 = C0026j0.f414X;
        } else {
            c0022h0 = null;
        }
        if (zBooleanValue || !v0Var2.j.equals(v0Var.j)) {
            C0024i0 c0024i0A = this.f152a0.a();
            List list = v0Var.j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                Metadata metadata = (Metadata) list.get(i16);
                int i17 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f10562a;
                    if (i17 < entryArr.length) {
                        entryArr[i17].h(c0024i0A);
                        i17++;
                    }
                }
            }
            this.f152a0 = new C0026j0(c0024i0A);
            c0026j0R = r();
        }
        boolean zEquals2 = c0026j0R.equals(this.f137L);
        this.f137L = c0026j0R;
        boolean z8 = v0Var2.f595l != v0Var.f595l;
        boolean z9 = v0Var2.f589e != v0Var.f589e;
        if (z9 || z8) {
            V();
        }
        boolean z10 = v0Var2.f591g != v0Var.f591g;
        if (!v0Var2.f585a.equals(v0Var.f585a)) {
            final int i18 = 0;
            this.f164l.i(0, new p151v2.e() { // from class: A1.E
                @Override // p151v2.e
                public final void invoke(Object obj7) {
                    z0 z0Var = (z0) obj7;
                    switch (i18) {
                        case 0:
                            R0 r9 = v0Var.f585a;
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
            P0 p7 = new P0();
            if (v0Var2.f585a.p()) {
                i12 = i10;
                obj = null;
                c0022h1 = null;
                obj2 = null;
                i13 = -1;
            } else {
                Object obj7 = v0Var2.f586b.f10161a;
                v0Var2.f585a.g(obj7, p7);
                int i19 = p7.f188c;
                int iB = v0Var2.f585a.b(obj7);
                obj = v0Var2.f585a.m(i19, (Q0) this.f364a, 0L).f211a;
                c0022h1 = ((Q0) this.f364a).f213c;
                i12 = i19;
                i13 = iB;
                obj2 = obj7;
            }
            if (i9 == 0) {
                if (v0Var2.f586b.a()) {
                    p018c2.D d9 = v0Var2.f586b;
                    jF = p7.a(d9.f10162b, d9.f10163c);
                    jF2 = F(v0Var2);
                } else {
                    if (v0Var2.f586b.f10165e != -1) {
                        jF = F(this.f154b0);
                    } else {
                        j3 = p7.f190e;
                        j7 = p7.f189d;
                        jF = j3 + j7;
                    }
                    jF2 = jF;
                }
            } else if (v0Var2.f586b.a()) {
                jF = v0Var2.f602s;
                jF2 = F(v0Var2);
            } else {
                j3 = p7.f190e;
                j7 = v0Var2.f602s;
                jF = j3 + j7;
                jF2 = jF;
            }
            long jN = p151v2.t.N(jF);
            long jN2 = p151v2.t.N(jF2);
            p018c2.D d10 = v0Var2.f586b;
            final A0 a2 = new A0(obj, i12, c0022h1, obj2, i13, jN, jN2, d10.f10162b, d10.f10163c);
            int iX = x();
            if (this.f154b0.f585a.p()) {
                obj3 = null;
                c0022h2 = null;
                obj4 = null;
                i14 = -1;
            } else {
                v0 v0Var3 = this.f154b0;
                Object obj8 = v0Var3.f586b.f10161a;
                v0Var3.f585a.g(obj8, this.f166n);
                int iB2 = this.f154b0.f585a.b(obj8);
                R0 r9 = this.f154b0.f585a;
                Q0 q7 = (Q0) this.f364a;
                i14 = iB2;
                obj3 = r9.m(iX, q7, 0L).f211a;
                c0022h2 = q7.f213c;
                obj4 = obj8;
            }
            long jN3 = p151v2.t.N(j);
            long jN4 = this.f154b0.f586b.a() ? p151v2.t.N(F(this.f154b0)) : jN3;
            p018c2.D d11 = this.f154b0.f586b;
            final A0 a4 = new A0(obj3, iX, c0022h2, obj4, i14, jN3, jN4, d11.f10162b, d11.f10163c);
            this.f164l.i(11, new p151v2.e() { // from class: A1.x
                @Override // p151v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    z0Var.getClass();
                    z0Var.i(i9, a2, a4);
                }
            });
        } else {
            z9 = z9;
            z10 = z10;
        }
        if (zBooleanValue) {
            this.f164l.i(1, new C0050y(c0022h0, iIntValue));
        }
        if (v0Var2.f590f != v0Var.f590f) {
            final int i20 = 0;
            this.f164l.i(10, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
                this.f164l.i(10, new p151v2.e() { // from class: A1.z
                    @Override // p151v2.e
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
                                z0Var.F(v0Var.f593i.f16452d);
                                break;
                            case 3:
                                v0 v0Var4 = v0Var;
                                boolean z11 = v0Var4.f591g;
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
        p139t2.w wVar = v0Var2.f593i;
        p139t2.w wVar2 = v0Var.f593i;
        if (wVar != wVar2) {
            p139t2.s sVar = this.f161h;
            E4.L l7 = wVar2.f16453e;
            sVar.getClass();
            final int i22 = 2;
            this.f164l.i(2, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
        if (!zEquals2) {
            this.f164l.i(14, new C0042s(this.f137L, 2));
        }
        if (z10) {
            final int i23 = 3;
            this.f164l.i(3, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
        if (z9 || z8) {
            final int i24 = 4;
            this.f164l.i(-1, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
        if (z9) {
            final int i25 = 5;
            this.f164l.i(4, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
            final int i26 = 1;
            this.f164l.i(5, new p151v2.e() { // from class: A1.E
                @Override // p151v2.e
                public final void invoke(Object obj9) {
                    z0 z0Var = (z0) obj9;
                    switch (i26) {
                        case 0:
                            R0 r10 = v0Var.f585a;
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
            this.f164l.i(6, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
            this.f164l.i(7, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
            this.f164l.i(12, new p151v2.e() { // from class: A1.z
                @Override // p151v2.e
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
                            z0Var.F(v0Var.f593i.f16452d);
                            break;
                        case 3:
                            v0 v0Var4 = v0Var;
                            boolean z11 = v0Var4.f591g;
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
        int iE = E();
        M4.e eVar = this.f126A;
        B4.V v6 = this.f178z;
        if (iE != 1) {
            if (iE == 2 || iE == 3) {
                W();
                boolean z4 = this.f154b0.f599p;
                D();
                v6.getClass();
                D();
                eVar.getClass();
                return;
            }
            if (iE != 4) {
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
            int i7 = p151v2.t.f17159a;
            Locale locale = Locale.US;
            String strJ = p155w1.L.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f148W) {
                throw new IllegalStateException(strJ);
            }
            p151v2.a.G(this.f149X ? null : new IllegalStateException(), "ExoPlayerImpl", strJ);
            this.f149X = true;
        }
    }

    public final C0026j0 r() {
        R0 r0A = A();
        if (r0A.p()) {
            return this.f152a0;
        }
        C0022h0 c0022h0 = r0A.m(x(), (Q0) this.f364a, 0L).f213c;
        C0024i0 c0024i0A = this.f152a0.a();
        C0026j0 c0026j0 = c0022h0.f369d;
        if (c0026j0 != null) {
            CharSequence charSequence = c0026j0.f439a;
            if (charSequence != null) {
                c0024i0A.f389a = charSequence;
            }
            CharSequence charSequence2 = c0026j0.f440b;
            if (charSequence2 != null) {
                c0024i0A.f390b = charSequence2;
            }
            CharSequence charSequence3 = c0026j0.f441c;
            if (charSequence3 != null) {
                c0024i0A.f391c = charSequence3;
            }
            CharSequence charSequence4 = c0026j0.f442d;
            if (charSequence4 != null) {
                c0024i0A.f392d = charSequence4;
            }
            CharSequence charSequence5 = c0026j0.f443e;
            if (charSequence5 != null) {
                c0024i0A.f393e = charSequence5;
            }
            CharSequence charSequence6 = c0026j0.f444f;
            if (charSequence6 != null) {
                c0024i0A.f394f = charSequence6;
            }
            CharSequence charSequence7 = c0026j0.f445x;
            if (charSequence7 != null) {
                c0024i0A.f395g = charSequence7;
            }
            F0 f7 = c0026j0.f446y;
            if (f7 != null) {
                c0024i0A.f396h = f7;
            }
            F0 f8 = c0026j0.f447z;
            if (f8 != null) {
                c0024i0A.f397i = f8;
            }
            byte[] bArr = c0026j0.f416A;
            if (bArr != null) {
                c0024i0A.j = (byte[]) bArr.clone();
                c0024i0A.f398k = c0026j0.f417B;
            }
            Uri uri = c0026j0.f418C;
            if (uri != null) {
                c0024i0A.f399l = uri;
            }
            Integer num = c0026j0.f419D;
            if (num != null) {
                c0024i0A.f400m = num;
            }
            Integer num2 = c0026j0.f420E;
            if (num2 != null) {
                c0024i0A.f401n = num2;
            }
            Integer num3 = c0026j0.f421F;
            if (num3 != null) {
                c0024i0A.f402o = num3;
            }
            Boolean bool = c0026j0.f422G;
            if (bool != null) {
                c0024i0A.f403p = bool;
            }
            Integer num4 = c0026j0.f423H;
            if (num4 != null) {
                c0024i0A.f404q = num4;
            }
            Integer num5 = c0026j0.f424I;
            if (num5 != null) {
                c0024i0A.f404q = num5;
            }
            Integer num6 = c0026j0.f425J;
            if (num6 != null) {
                c0024i0A.f405r = num6;
            }
            Integer num7 = c0026j0.f426K;
            if (num7 != null) {
                c0024i0A.f406s = num7;
            }
            Integer num8 = c0026j0.f427L;
            if (num8 != null) {
                c0024i0A.f407t = num8;
            }
            Integer num9 = c0026j0.f428M;
            if (num9 != null) {
                c0024i0A.f408u = num9;
            }
            Integer num10 = c0026j0.f429N;
            if (num10 != null) {
                c0024i0A.f409v = num10;
            }
            CharSequence charSequence8 = c0026j0.f430O;
            if (charSequence8 != null) {
                c0024i0A.f410w = charSequence8;
            }
            CharSequence charSequence9 = c0026j0.f431P;
            if (charSequence9 != null) {
                c0024i0A.f411x = charSequence9;
            }
            CharSequence charSequence10 = c0026j0.f432Q;
            if (charSequence10 != null) {
                c0024i0A.f412y = charSequence10;
            }
            Integer num11 = c0026j0.f433R;
            if (num11 != null) {
                c0024i0A.f413z = num11;
            }
            Integer num12 = c0026j0.f434S;
            if (num12 != null) {
                c0024i0A.f384A = num12;
            }
            CharSequence charSequence11 = c0026j0.f435T;
            if (charSequence11 != null) {
                c0024i0A.f385B = charSequence11;
            }
            CharSequence charSequence12 = c0026j0.f436U;
            if (charSequence12 != null) {
                c0024i0A.f386C = charSequence12;
            }
            CharSequence charSequence13 = c0026j0.f437V;
            if (charSequence13 != null) {
                c0024i0A.f387D = charSequence13;
            }
            Bundle bundle = c0026j0.f438W;
            if (bundle != null) {
                c0024i0A.f388E = bundle;
            }
        }
        return new C0026j0(c0024i0A);
    }

    public final long t() {
        W();
        if (H()) {
            v0 v0Var = this.f154b0;
            return v0Var.f594k.equals(v0Var.f586b) ? p151v2.t.N(this.f154b0.f600q) : C();
        }
        W();
        if (this.f154b0.f585a.p()) {
            return this.f157d0;
        }
        v0 v0Var2 = this.f154b0;
        if (v0Var2.f594k.f10164d != v0Var2.f586b.f10164d) {
            return p151v2.t.N(v0Var2.f585a.m(x(), (Q0) this.f364a, 0L).f207E);
        }
        long j = v0Var2.f600q;
        if (this.f154b0.f594k.a()) {
            v0 v0Var3 = this.f154b0;
            P0 p0G = v0Var3.f585a.g(v0Var3.f594k.f10161a, this.f166n);
            long jD = p0G.d(this.f154b0.f594k.f10162b);
            j = jD == Long.MIN_VALUE ? p0G.f189d : jD;
        }
        v0 v0Var4 = this.f154b0;
        R0 r7 = v0Var4.f585a;
        Object obj = v0Var4.f594k.f10161a;
        P0 p5 = this.f166n;
        r7.g(obj, p5);
        return p151v2.t.N(j + p5.f190e);
    }

    public final long u() {
        W();
        if (!H()) {
            return y();
        }
        v0 v0Var = this.f154b0;
        R0 r7 = v0Var.f585a;
        Object obj = v0Var.f586b.f10161a;
        P0 p5 = this.f166n;
        r7.g(obj, p5);
        v0 v0Var2 = this.f154b0;
        return v0Var2.f587c == -9223372036854775807L ? p151v2.t.N(v0Var2.f585a.m(x(), (Q0) this.f364a, 0L).f206D) : p151v2.t.N(p5.f190e) + p151v2.t.N(this.f154b0.f587c);
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
        int iB = B();
        if (iB == -1) {
            return 0;
        }
        return iB;
    }

    public final long y() {
        W();
        return p151v2.t.N(z(this.f154b0));
    }

    public final long z(v0 v0Var) {
        if (v0Var.f585a.p()) {
            return p151v2.t.E(this.f157d0);
        }
        if (v0Var.f586b.a()) {
            return v0Var.f602s;
        }
        R0 r7 = v0Var.f585a;
        p018c2.D d7 = v0Var.f586b;
        long j = v0Var.f602s;
        Object obj = d7.f10161a;
        P0 p5 = this.f166n;
        r7.g(obj, p5);
        return j + p5.f190e;
    }
}
