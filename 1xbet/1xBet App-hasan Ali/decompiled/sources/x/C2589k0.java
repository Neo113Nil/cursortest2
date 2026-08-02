package x;

import A0.C0009a;
import android.view.KeyEvent;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import com.google.android.gms.internal.ads.Sm;
import g0.InterfaceC1966k;
import h0.C1988b;
import k0.C2023c;
import m4.InterfaceC2105h;
import p4.AbstractC2282w;
import r0.AbstractC2346c;
import r0.C2344a;
import r0.InterfaceC2347d;
import s0.C2355d;
import s0.C2358g;
import t0.AbstractC2403A;
import t3.AbstractC2425d;
import u.C2475w;
import y.C2645a;
import y.C2646b;
import y.C2647c;
import y.C2654j;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.InterfaceC2754k;

/* renamed from: x.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2589k0 extends AbstractC2756m implements z0.i0, g0.n, InterfaceC2347d, z0.v0, z0.s0, InterfaceC2754k {

    /* renamed from: A, reason: collision with root package name */
    public P f20799A;

    /* renamed from: B, reason: collision with root package name */
    public C2576e f20800B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f20801C;

    /* renamed from: D, reason: collision with root package name */
    public C2654j f20802D;

    /* renamed from: E, reason: collision with root package name */
    public r4.c f20803E;

    /* renamed from: F, reason: collision with root package name */
    public C2646b f20804F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f20805G;

    /* renamed from: H, reason: collision with root package name */
    public t0.H f20806H;

    /* renamed from: I, reason: collision with root package name */
    public v.k0 f20807I;
    public C2592m J;
    public final C2355d K;

    /* renamed from: L, reason: collision with root package name */
    public final V f20808L;

    /* renamed from: M, reason: collision with root package name */
    public final C2592m f20809M;

    /* renamed from: N, reason: collision with root package name */
    public final C2604s0 f20810N;

    /* renamed from: O, reason: collision with root package name */
    public final Sm f20811O;

    /* renamed from: P, reason: collision with root package name */
    public final C2588k f20812P;

    /* renamed from: Q, reason: collision with root package name */
    public C2568a f20813Q;

    /* renamed from: R, reason: collision with root package name */
    public C0009a f20814R;

    /* renamed from: S, reason: collision with root package name */
    public C2587j0 f20815S;

    public C2589k0(v.k0 k0Var, C2592m c2592m, P p5, InterfaceC2591l0 interfaceC2591l0, C2654j c2654j, boolean z3, boolean z5) {
        C2576e c2576e = C2576e.f20755n;
        this.f20799A = p5;
        this.f20800B = c2576e;
        this.f20801C = z3;
        this.f20802D = c2654j;
        this.f20807I = k0Var;
        this.J = c2592m;
        C2355d c2355d = new C2355d();
        this.K = c2355d;
        V v4 = new V();
        v4.f20728y = z3;
        y0(v4);
        this.f20808L = v4;
        C2592m c2592m2 = new C2592m(new C2475w(new C2023c(androidx.compose.foundation.gestures.a.f6843c)));
        this.f20809M = c2592m2;
        v.k0 k0Var2 = this.f20807I;
        C2592m c2592m3 = this.J;
        C2604s0 c2604s0 = new C2604s0(interfaceC2591l0, k0Var2, c2592m3 == null ? c2592m2 : c2592m3, p5, z5, c2355d);
        this.f20810N = c2604s0;
        Sm sm = new Sm(c2604s0, z3);
        this.f20811O = sm;
        C2588k c2588k = new C2588k(p5, c2604s0, z5);
        y0(c2588k);
        this.f20812P = c2588k;
        y0(new C2358g(sm, c2355d));
        y0(new g0.s(new E.q0(1, g0.u.f17064a, g0.u.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 2), 3));
        C.i iVar = new C.i();
        iVar.f798y = c2588k;
        y0(iVar);
        t0.F f = new t0.F(6, this);
        v.Q q5 = new v.Q();
        q5.f20180y = f;
        y0(q5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B0(C2589k0 c2589k0, AbstractC0542c abstractC0542c) {
        C2561G c2561g;
        int i;
        c2589k0.getClass();
        if (abstractC0542c instanceof C2561G) {
            c2561g = (C2561G) abstractC0542c;
            int i5 = c2561g.f20633n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2561g.f20633n = i5 - Integer.MIN_VALUE;
                Object obj = c2561g.f20631l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2561g.f20633n;
                if (i != 0) {
                    G4.l.N(obj);
                    C2646b c2646b = c2589k0.f20804F;
                    if (c2646b != null) {
                        C2654j c2654j = c2589k0.f20802D;
                        if (c2654j != null) {
                            C2645a c2645a = new C2645a(c2646b);
                            c2561g.f20630k = c2589k0;
                            c2561g.f20633n = 1;
                            if (c2654j.a(c2645a, c2561g) == enumC0510a) {
                                return enumC0510a;
                            }
                        }
                    }
                    AbstractC2282w.p(c2589k0.K.c(), null, new C2575d0(c2589k0, 0L, null), 3);
                    return W3.o.f6046a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2589k0 = c2561g.f20630k;
                G4.l.N(obj);
                c2589k0.f20804F = null;
                AbstractC2282w.p(c2589k0.K.c(), null, new C2575d0(c2589k0, 0L, null), 3);
                return W3.o.f6046a;
            }
        }
        c2561g = new C2561G(c2589k0, abstractC0542c);
        Object obj2 = c2561g.f20631l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2561g.f20633n;
        if (i != 0) {
        }
        c2589k0.f20804F = null;
        AbstractC2282w.p(c2589k0.K.c(), null, new C2575d0(c2589k0, 0L, null), 3);
        return W3.o.f6046a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r2.a(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C0(C2589k0 c2589k0, C2605t c2605t, AbstractC0542c abstractC0542c) {
        C2562H c2562h;
        int i;
        C2646b c2646b;
        C2654j c2654j;
        C2589k0 c2589k02;
        C2646b c2646b2;
        c2589k0.getClass();
        if (abstractC0542c instanceof C2562H) {
            c2562h = (C2562H) abstractC0542c;
            int i5 = c2562h.f20640p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2562h.f20640p = i5 - Integer.MIN_VALUE;
                Object obj = c2562h.f20638n;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2562h.f20640p;
                if (i != 0) {
                    G4.l.N(obj);
                    C2646b c2646b3 = c2589k0.f20804F;
                    if (c2646b3 != null && (r2 = c2589k0.f20802D) != null) {
                        C2645a c2645a = new C2645a(c2646b3);
                        c2562h.f20635k = c2589k0;
                        c2562h.f20636l = c2605t;
                        c2562h.f20640p = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2646b2 = c2562h.f20637m;
                        c2605t = c2562h.f20636l;
                        c2589k02 = c2562h.f20635k;
                        G4.l.N(obj);
                        c2646b = c2646b2;
                        c2589k0 = c2589k02;
                        c2589k0.f20804F = c2646b;
                        long j5 = c2605t.f20871a;
                        return W3.o.f6046a;
                    }
                    c2605t = c2562h.f20636l;
                    c2589k0 = c2562h.f20635k;
                    G4.l.N(obj);
                }
                c2646b = new C2646b();
                c2654j = c2589k0.f20802D;
                if (c2654j != null) {
                    c2562h.f20635k = c2589k0;
                    c2562h.f20636l = c2605t;
                    c2562h.f20637m = c2646b;
                    c2562h.f20640p = 2;
                    if (c2654j.a(c2646b, c2562h) != enumC0510a) {
                        c2589k02 = c2589k0;
                        c2646b2 = c2646b;
                        c2646b = c2646b2;
                        c2589k0 = c2589k02;
                    }
                    return enumC0510a;
                }
                c2589k0.f20804F = c2646b;
                long j52 = c2605t.f20871a;
                return W3.o.f6046a;
            }
        }
        c2562h = new C2562H(c2589k0, abstractC0542c);
        Object obj2 = c2562h.f20638n;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2562h.f20640p;
        if (i != 0) {
        }
        c2646b = new C2646b();
        c2654j = c2589k0.f20802D;
        if (c2654j != null) {
        }
        c2589k0.f20804F = c2646b;
        long j522 = c2605t.f20871a;
        return W3.o.f6046a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D0(C2589k0 c2589k0, C2606u c2606u, AbstractC0542c abstractC0542c) {
        C2563I c2563i;
        int i;
        c2589k0.getClass();
        if (abstractC0542c instanceof C2563I) {
            c2563i = (C2563I) abstractC0542c;
            int i5 = c2563i.f20646o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2563i.f20646o = i5 - Integer.MIN_VALUE;
                Object obj = c2563i.f20644m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2563i.f20646o;
                if (i != 0) {
                    G4.l.N(obj);
                    C2646b c2646b = c2589k0.f20804F;
                    if (c2646b != null) {
                        C2654j c2654j = c2589k0.f20802D;
                        if (c2654j != null) {
                            C2647c c2647c = new C2647c(c2646b);
                            c2563i.f20642k = c2589k0;
                            c2563i.f20643l = c2606u;
                            c2563i.f20646o = 1;
                            if (c2654j.a(c2647c, c2563i) == enumC0510a) {
                                return enumC0510a;
                            }
                        }
                    }
                    AbstractC2282w.p(c2589k0.K.c(), null, new C2575d0(c2589k0, c2606u.f20877a, null), 3);
                    return W3.o.f6046a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2606u = c2563i.f20643l;
                c2589k0 = c2563i.f20642k;
                G4.l.N(obj);
                c2589k0.f20804F = null;
                AbstractC2282w.p(c2589k0.K.c(), null, new C2575d0(c2589k0, c2606u.f20877a, null), 3);
                return W3.o.f6046a;
            }
        }
        c2563i = new C2563I(c2589k0, abstractC0542c);
        Object obj2 = c2563i.f20644m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2563i.f20646o;
        if (i != 0) {
        }
        c2589k0.f20804F = null;
        AbstractC2282w.p(c2589k0.K.c(), null, new C2575d0(c2589k0, c2606u.f20877a, null), 3);
        return W3.o.f6046a;
    }

    @Override // z0.i0
    public final void E() {
        AbstractC2749f.s(this, new C2559E(this, 2));
    }

    public final void E0() {
        C2646b c2646b = this.f20804F;
        if (c2646b != null) {
            C2654j c2654j = this.f20802D;
            if (c2654j != null) {
                c2654j.b(new C2645a(c2646b));
            }
            this.f20804F = null;
        }
    }

    @Override // g0.n
    public final void F(InterfaceC1966k interfaceC1966k) {
        interfaceC1966k.b(false);
    }

    @Override // r0.InterfaceC2347d
    public final boolean O(KeyEvent keyEvent) {
        long d5;
        if (!this.f20801C || ((!C2344a.a(AbstractC2346c.q(keyEvent), C2344a.f19079n) && !C2344a.a(AbstractC2425d.b(keyEvent.getKeyCode()), C2344a.f19078m)) || AbstractC2346c.t(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z3 = this.f20810N.f20866d == P.f20695k;
        C2588k c2588k = this.f20812P;
        if (z3) {
            int i = (int) (c2588k.f20795F & 4294967295L);
            d5 = G4.d.d(0.0f, C2344a.a(AbstractC2425d.b(keyEvent.getKeyCode()), C2344a.f19078m) ? i : -i);
        } else {
            int i5 = (int) (c2588k.f20795F >> 32);
            d5 = G4.d.d(C2344a.a(AbstractC2425d.b(keyEvent.getKeyCode()), C2344a.f19078m) ? i5 : -i5, 0.0f);
        }
        AbstractC2282w.p(k0(), null, new C2579f0(this, d5, null), 3);
        return true;
    }

    @Override // z0.s0
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // z0.s0
    public final void U() {
        W();
    }

    @Override // z0.s0
    public final void W() {
        t0.H h3 = this.f20806H;
        if (h3 != null) {
            h3.W();
        }
    }

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.s0
    public final /* synthetic */ void g0() {
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
        if (this.f20801C && (this.f20814R == null || this.f20815S == null)) {
            this.f20814R = new C0009a(12, this);
            this.f20815S = new C2587j0(this, null);
        }
        C0009a c0009a = this.f20814R;
        if (c0009a != null) {
            InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
            jVar.f(H0.i.f2082d, new H0.a(null, c0009a));
        }
        C2587j0 c2587j0 = this.f20815S;
        if (c2587j0 != null) {
            InterfaceC2105h[] interfaceC2105hArr2 = H0.u.f2183a;
            jVar.f(H0.i.f2083e, c2587j0);
        }
    }

    @Override // r0.InterfaceC2347d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // b0.o
    public final void o0() {
        AbstractC2749f.s(this, new C2559E(this, 2));
        this.f20813Q = C2568a.f20733a;
    }

    @Override // b0.o
    public final void p0() {
        W();
    }

    @Override // b0.o
    public final void q0() {
        this.f20805G = false;
        E0();
    }

    @Override // z0.s0
    public final long r() {
        return z0.y0.f21873a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    @Override // z0.s0
    public final void v(t0.j jVar, t0.k kVar, long j5) {
        long j6;
        ?? r02 = jVar.f19485a;
        int size = r02.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.f20800B.c((t0.s) r02.get(i))).booleanValue()) {
                if (this.f20801C && this.f20806H == null) {
                    C2560F c2560f = new C2560F(this, null);
                    t0.j jVar2 = AbstractC2403A.f19430a;
                    t0.H h3 = new t0.H(null, null, t0.B.f19431k);
                    h3.f19449A = c2560f;
                    y0(h3);
                    this.f20806H = h3;
                }
                t0.H h4 = this.f20806H;
                if (h4 != null) {
                    h4.v(jVar, kVar, j5);
                }
            } else {
                i++;
            }
        }
        if (kVar == t0.k.f19490l && jVar.f19488d == 6) {
            ?? r10 = jVar.f19485a;
            int size2 = r10.size();
            for (int i5 = 0; i5 < size2; i5++) {
                if (((t0.s) r10.get(i5)).b()) {
                    return;
                }
            }
            kotlin.jvm.internal.l.c(this.f20813Q);
            W0.c cVar = AbstractC2749f.v(this).f21607H;
            C1988b c1988b = new C1988b(0L);
            int size3 = r10.size();
            int i6 = 0;
            while (true) {
                j6 = c1988b.f17191a;
                if (i6 >= size3) {
                    break;
                }
                c1988b = new C1988b(C1988b.h(j6, ((t0.s) r10.get(i6)).f19507j));
                i6++;
            }
            AbstractC2282w.p(k0(), null, new C2583h0(this, C1988b.i(-cVar.y(64), j6), null), 3);
            int size4 = r10.size();
            for (int i7 = 0; i7 < size4; i7++) {
                ((t0.s) r10.get(i7)).a();
            }
        }
    }
}
