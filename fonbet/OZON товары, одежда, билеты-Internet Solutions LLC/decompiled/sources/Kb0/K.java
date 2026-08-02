package Kb0;

import Sc.InterfaceC4008j;
import android.accounts.AccountManager;
import android.app.Application;
import dc0.C6149M;
import dc0.C6155a;
import dc0.C6159e;
import dc0.C6176v;
import id0.C7050a;
import id0.C7051b;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kd0.C7667a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nd0.C8578a;
import od0.C8696b;
import org.jetbrains.annotations.NotNull;
import pd0.C8899a;
import rd0.C9255b;
import ru.ozon.id.nativeauth.tracking.TrackingApi;
import ru.ozon.id.switchUser.data.SwitchUserApi;
import ru.ozon.id.user.data.GetUserApi;
import ud0.C10042b;
import xd0.C10708a;
import zb0.c;
import zb0.f;

/* loaded from: classes7.dex */
public final class K {

    /* renamed from: c0, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<C7667a> f15466c0 = Sc.k.b(a.f15521b);

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15467A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sb0.e> f15468B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sb0.b> f15469C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sb0.c> f15470D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Rb0.a> f15471E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7051b> f15472F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<TrackingApi> f15473G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7050a> f15474H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.B> f15475I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8578a> f15476J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6155a> f15477K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6176v> f15478L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.k> f15479M;

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Xb0.a> f15480N;

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10042b> f15481O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10708a> f15482P;

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6149M> f15483Q;

    /* renamed from: R, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9255b> f15484R;

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<GetUserApi> f15485S;

    /* renamed from: T, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.d> f15486T;

    /* renamed from: U, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Fb0.a> f15487U;

    /* renamed from: V, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Jc0.c> f15488V;

    /* renamed from: W, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Jc0.j> f15489W;

    /* renamed from: X, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nb0.i> f15490X;

    /* renamed from: Y, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Db0.f> f15491Y;

    /* renamed from: Z, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ib0.e> f15492Z;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f15493a;

    /* renamed from: a0, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<URI> f15494a0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ld0.c f15495b;

    /* renamed from: b0, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.b> f15496b0;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Fb0.f f15497c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f15498d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f15499e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f15500f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15501g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15502h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15503i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15504j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15505k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15506l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15507m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15508n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15509o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cc0.a> f15510p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.i> f15511q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15512r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f15513s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<SwitchUserApi> f15514t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8899a> f15515u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8696b> f15516v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ub0.c> f15517w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AccountManager> f15518x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6159e> f15519y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<yc0.c> f15520z;

    static final class a extends AbstractC7737t implements Function0<C7667a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15521b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C7667a invoke() {
            InterfaceC4008j interfaceC4008j;
            InterfaceC4008j interfaceC4008j2;
            InterfaceC4008j interfaceC4008j3;
            InterfaceC4008j interfaceC4008j4;
            InterfaceC4008j interfaceC4008j5;
            InterfaceC4008j interfaceC4008j6;
            InterfaceC4008j b11 = Sc.k.b(new J(0));
            interfaceC4008j = C3452e.f15603q;
            interfaceC4008j2 = C3452e.f15602p;
            interfaceC4008j3 = C3487w.f15745r;
            InterfaceC4008j interfaceC4008j7 = C3487w.f15742o;
            interfaceC4008j4 = U0.f15558h;
            interfaceC4008j5 = C3487w.f15744q;
            interfaceC4008j6 = C3487w.f15746s;
            return new C7667a(b11, interfaceC4008j, interfaceC4008j2, interfaceC4008j3, interfaceC4008j7, interfaceC4008j5, interfaceC4008j4, interfaceC4008j6);
        }
    }

    public K(@NotNull Application application, @NotNull Ld0.c limbDiStore, @NotNull Fb0.f ozonIdConfig, @NotNull ArrayList authCookieEventListeners, @NotNull ArrayList cookieListeners, @NotNull ArrayList ozonIdCookieHandlers) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(authCookieEventListeners, "authCookieEventListeners");
        Intrinsics.checkNotNullParameter(cookieListeners, "cookieListeners");
        Intrinsics.checkNotNullParameter(ozonIdCookieHandlers, "ozonIdCookieHandlers");
        this.f15493a = application;
        this.f15495b = limbDiStore;
        this.f15497c = ozonIdConfig;
        this.f15498d = authCookieEventListeners;
        this.f15499e = cookieListeners;
        this.f15500f = ozonIdCookieHandlers;
        this.f15501g = Sc.k.b(new C0(this));
        this.f15502h = Sc.k.b(new X(this));
        this.f15503i = Sc.k.b(new C3477q0(this));
        this.f15504j = Sc.k.b(new P(this));
        this.f15505k = Sc.k.b(new C3471n0(this));
        this.f15506l = Sc.k.b(new B0(this));
        this.f15507m = Sc.k.b(new C3445a0(this));
        this.f15508n = Sc.k.b(new Y(this));
        this.f15509o = Sc.k.b(new H0(this));
        this.f15510p = Sc.k.b(C3447b0.f15599b);
        this.f15511q = Sc.k.b(C3475p0.f15724b);
        this.f15512r = Sc.k.b(C3449c0.f15600b);
        this.f15513s = Sc.k.b(new C3451d0(this));
        this.f15514t = Sc.k.b(new D0(this));
        this.f15515u = Sc.k.b(new E0(this));
        this.f15516v = Sc.k.b(new F0(this));
        this.f15517w = Sc.k.b(new C3469m0(this));
        this.f15518x = Sc.k.b(new M(this));
        this.f15519y = Sc.k.b(new N(this));
        this.f15520z = Sc.k.b(new C3459h0(this));
        this.f15467A = Sc.k.b(new C3478r0(this));
        this.f15468B = Sc.k.b(new C3486v0(this));
        this.f15469C = Sc.k.b(new C3482t0(this));
        this.f15470D = Sc.k.b(new C3484u0(this));
        this.f15471E = Sc.k.b(new C3467l0(this));
        this.f15472F = Sc.k.b(new z0(this));
        this.f15473G = Sc.k.b(new Q(this));
        this.f15474H = Sc.k.b(new G0(this));
        this.f15475I = Sc.k.b(new y0(this));
        this.f15476J = Sc.k.b(new C3480s0(this));
        this.f15477K = Sc.k.b(new L(this));
        this.f15478L = Sc.k.b(new Z(this));
        this.f15479M = Sc.k.b(new S(this));
        this.f15480N = Sc.k.b(new C3473o0(this));
        this.f15481O = Sc.k.b(new W(this));
        this.f15482P = Sc.k.b(new V(this));
        this.f15483Q = Sc.k.b(C3488w0.f15780b);
        this.f15484R = Sc.k.b(new C3457g0(this));
        this.f15485S = Sc.k.b(new C3455f0(this));
        this.f15486T = Sc.k.b(C3465k0.f15682b);
        this.f15487U = Sc.k.b(new U(this));
        this.f15488V = Sc.k.b(new C3461i0(this));
        this.f15489W = Sc.k.b(new C3463j0(this));
        this.f15490X = Sc.k.b(new C3453e0(this));
        this.f15491Y = Sc.k.b(new O(this));
        this.f15492Z = Sc.k.b(T.f15556b);
        this.f15494a0 = Sc.k.b(new A0(this));
        this.f15496b0 = Sc.k.b(new C3490x0(this));
    }

    @NotNull
    public final InterfaceC4008j<Nb0.i> A() {
        return this.f15490X;
    }

    @NotNull
    public final InterfaceC4008j<C9255b> B() {
        return this.f15484R;
    }

    @NotNull
    public final InterfaceC4008j<yc0.c> C() {
        return this.f15520z;
    }

    @NotNull
    public final InterfaceC4008j<Jc0.c> D() {
        return this.f15488V;
    }

    @NotNull
    public final InterfaceC4008j<Jc0.j> E() {
        return this.f15489W;
    }

    @NotNull
    public final InterfaceC4008j<vc0.d> F() {
        return this.f15486T;
    }

    @NotNull
    public final Ld0.c G() {
        return this.f15495b;
    }

    @NotNull
    public final InterfaceC4008j<Rb0.a> H() {
        return this.f15471E;
    }

    @NotNull
    public final InterfaceC4008j<Ub0.c> I() {
        return this.f15517w;
    }

    @NotNull
    public final Zb0.a J() {
        return (Zb0.a) this.f15505k.getValue();
    }

    @NotNull
    public final InterfaceC4008j<Xb0.a> K() {
        return this.f15480N;
    }

    @NotNull
    public final InterfaceC4008j<Cb0.i> L() {
        return this.f15511q;
    }

    @NotNull
    public final C3487w M() {
        return (C3487w) this.f15503i.getValue();
    }

    @NotNull
    public final Fb0.f N() {
        return this.f15497c;
    }

    @NotNull
    public final List<zb0.g> O() {
        return this.f15500f;
    }

    @NotNull
    public final Wb0.c P() {
        return (Wb0.c) this.f15467A.getValue();
    }

    @NotNull
    public final InterfaceC4008j<C8578a> Q() {
        return this.f15476J;
    }

    @NotNull
    public final InterfaceC4008j<C6149M> R() {
        return this.f15483Q;
    }

    @NotNull
    public final InterfaceC4008j<hd0.b> S() {
        return this.f15496b0;
    }

    @NotNull
    public final InterfaceC4008j<ob0.B> T() {
        return this.f15475I;
    }

    @NotNull
    public final InterfaceC4008j<C7051b> U() {
        return this.f15472F;
    }

    @NotNull
    public final InterfaceC4008j<URI> V() {
        return this.f15494a0;
    }

    @NotNull
    public final K0 W() {
        return (K0) this.f15506l.getValue();
    }

    @NotNull
    public final U0 X() {
        return (U0) this.f15501g.getValue();
    }

    @NotNull
    public final InterfaceC4008j<C8899a> Y() {
        return this.f15515u;
    }

    @NotNull
    public final InterfaceC4008j<C8696b> Z() {
        return this.f15516v;
    }

    @NotNull
    public final InterfaceC4008j<C7050a> a0() {
        return this.f15474H;
    }

    @NotNull
    public final X0 b0() {
        return (X0) this.f15509o.getValue();
    }

    @NotNull
    public final InterfaceC4008j<AccountManager> i() {
        return this.f15518x;
    }

    @NotNull
    public final InterfaceC4008j<C6159e> j() {
        return this.f15519y;
    }

    @NotNull
    public final InterfaceC4008j<Db0.f> k() {
        return this.f15491Y;
    }

    @NotNull
    public final C3452e l() {
        return (C3452e) this.f15504j.getValue();
    }

    @NotNull
    public final Application m() {
        return this.f15493a;
    }

    @NotNull
    public final InterfaceC4008j<Cb0.k> n() {
        return this.f15479M;
    }

    @NotNull
    public final List<c.b> o() {
        return this.f15498d;
    }

    @NotNull
    public final InterfaceC4008j<Ib0.e> p() {
        return this.f15492Z;
    }

    @NotNull
    public final InterfaceC4008j<Fb0.a> q() {
        return this.f15487U;
    }

    @NotNull
    public final InterfaceC4008j<C10708a> r() {
        return this.f15482P;
    }

    @NotNull
    public final InterfaceC4008j<C10042b> s() {
        return this.f15481O;
    }

    @NotNull
    public final C3460i t() {
        return (C3460i) this.f15502h.getValue();
    }

    @NotNull
    public final List<f.a> u() {
        return this.f15499e;
    }

    @NotNull
    public final C3468m v() {
        return (C3468m) this.f15508n.getValue();
    }

    @NotNull
    public final InterfaceC4008j<C6176v> w() {
        return this.f15478L;
    }

    @NotNull
    public final C3483u x() {
        return (C3483u) this.f15507m.getValue();
    }

    @NotNull
    public final Hb0.b y() {
        return (Hb0.b) this.f15512r.getValue();
    }

    @NotNull
    public final InterfaceC4008j<Hb0.c> z() {
        return this.f15513s;
    }
}
