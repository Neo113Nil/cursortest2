package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027ua {

    /* renamed from: H, reason: collision with root package name */
    public static volatile C1027ua f9366H;

    /* renamed from: C, reason: collision with root package name */
    public volatile T9 f9369C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9374a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0930qg f9375b;

    /* renamed from: c, reason: collision with root package name */
    public volatile L6 f9376c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Z2 f9378e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0958rj f9379f;

    /* renamed from: g, reason: collision with root package name */
    public volatile U f9380g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C0734j2 f9381h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f9382i;

    /* renamed from: j, reason: collision with root package name */
    public volatile C1135yf f9383j;

    /* renamed from: k, reason: collision with root package name */
    public volatile H3 f9384k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0618ef f9385l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Co f9386m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0751jj f9387n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Mb f9388o;

    /* renamed from: p, reason: collision with root package name */
    public El f9389p;

    /* renamed from: r, reason: collision with root package name */
    public volatile Ck f9391r;

    /* renamed from: w, reason: collision with root package name */
    public volatile Rb f9396w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C0937qn f9397x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C1116xl f9398y;
    public volatile Cd z;

    /* renamed from: q, reason: collision with root package name */
    public final C1001ta f9390q = new C1001ta();

    /* renamed from: s, reason: collision with root package name */
    public final Zc f9392s = new Zc();

    /* renamed from: t, reason: collision with root package name */
    public final C0539bd f9393t = new C0539bd();

    /* renamed from: u, reason: collision with root package name */
    public final C0806lm f9394u = new C0806lm();

    /* renamed from: v, reason: collision with root package name */
    public final C0752jk f9395v = new C0752jk();

    /* renamed from: A, reason: collision with root package name */
    public final Vd f9367A = new Vd();

    /* renamed from: B, reason: collision with root package name */
    public final UtilityServiceProvider f9368B = new UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final C0934qk f9370D = new C0934qk();

    /* renamed from: E, reason: collision with root package name */
    public final ReferenceHolder f9371E = new ReferenceHolder();

    /* renamed from: F, reason: collision with root package name */
    public final Bk f9372F = new Bk();

    /* renamed from: G, reason: collision with root package name */
    public final C0731j f9373G = new C0731j();

    /* renamed from: d, reason: collision with root package name */
    public final C0882ok f9377d = new C0882ok();

    public C1027ua(Context context) {
        this.f9374a = context;
    }

    public static void a(Context context) {
        if (f9366H == null) {
            synchronized (C1027ua.class) {
                try {
                    if (f9366H == null) {
                        f9366H = new C1027ua(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public static C1027ua k() {
        return f9366H;
    }

    public final synchronized S2 A() {
        try {
            if (this.f9389p == null) {
                El el = new El(this.f9374a);
                this.f9389p = el;
                this.f9394u.a(el);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9389p;
    }

    public final C0806lm B() {
        return this.f9394u;
    }

    public final C0937qn C() {
        C0937qn c0937qn = this.f9397x;
        if (c0937qn == null) {
            synchronized (this) {
                try {
                    c0937qn = this.f9397x;
                    if (c0937qn == null) {
                        c0937qn = new C0937qn(this.f9374a);
                        this.f9397x = c0937qn;
                    }
                } finally {
                }
            }
        }
        return c0937qn;
    }

    public final synchronized Co D() {
        try {
            if (this.f9386m == null) {
                this.f9386m = new Co(this.f9374a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9386m;
    }

    public final void E() {
        if (this.f9383j == null) {
            synchronized (this) {
                try {
                    if (this.f9383j == null) {
                        Um a6 = Tm.a(Cif.class);
                        Context context = this.f9374a;
                        Vm vm = (Vm) a6;
                        ProtobufStateStorage<Object> a7 = vm.a(context, vm.a(context));
                        Cif cif = (Cif) a7.read();
                        this.f9383j = new C1135yf(this.f9374a, a7, new C0903pf(), new C0670gf(cif), new C1110xf(), new C0877of(this.f9374a), new C1006tf(k().z()), new C0747jf(), cif, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    public final C0731j b() {
        return this.f9373G;
    }

    public final U c() {
        U u5 = this.f9380g;
        if (u5 == null) {
            synchronized (this) {
                try {
                    u5 = this.f9380g;
                    if (u5 == null) {
                        u5 = new U(this.f9374a, this.f9377d.a(), this.f9394u.b());
                        this.f9394u.a(u5);
                        this.f9380g = u5;
                    }
                } finally {
                }
            }
        }
        return u5;
    }

    public final C0734j2 d() {
        C0734j2 c0734j2 = this.f9381h;
        if (c0734j2 == null) {
            synchronized (this) {
                try {
                    c0734j2 = this.f9381h;
                    if (c0734j2 == null) {
                        c0734j2 = new C0734j2(this.f9374a, AbstractC0760k2.a());
                        this.f9381h = c0734j2;
                    }
                } finally {
                }
            }
        }
        return c0734j2;
    }

    public final C0890p2 e() {
        return l().f7138b;
    }

    public final H3 f() {
        if (this.f9384k == null) {
            synchronized (this) {
                try {
                    if (this.f9384k == null) {
                        Um a6 = Tm.a(A3.class);
                        Context context = this.f9374a;
                        Vm vm = (Vm) a6;
                        ProtobufStateStorage<Object> a7 = vm.a(context, vm.a(context));
                        this.f9384k = new H3(this.f9374a, a7, new I3(), new C1046v3(), new L3(), new Yi(this.f9374a), new J3(z()), new C1072w3(), (A3) a7.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f9384k;
    }

    public final Context g() {
        return this.f9374a;
    }

    public final L6 h() {
        if (this.f9376c == null) {
            synchronized (this) {
                try {
                    if (this.f9376c == null) {
                        this.f9376c = new L6(new K6(z()));
                    }
                } finally {
                }
            }
        }
        return this.f9376c;
    }

    public final T9 i() {
        T9 t9 = this.f9369C;
        if (t9 == null) {
            synchronized (this) {
                try {
                    t9 = this.f9369C;
                    if (t9 == null) {
                        t9 = new T9(this.f9374a);
                        this.f9369C = t9;
                    }
                } finally {
                }
            }
        }
        return t9;
    }

    public final PermissionExtractor j() {
        C1116xl c1116xl = this.f9398y;
        if (c1116xl != null) {
            return c1116xl;
        }
        synchronized (this) {
            try {
                C1116xl c1116xl2 = this.f9398y;
                if (c1116xl2 != null) {
                    return c1116xl2;
                }
                C1116xl c1116xl3 = new C1116xl(p().f6643c.getAskForPermissionStrategy());
                this.f9398y = c1116xl3;
                return c1116xl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Mb l() {
        Mb mb = this.f9388o;
        if (mb == null) {
            synchronized (this) {
                try {
                    mb = this.f9388o;
                    if (mb == null) {
                        mb = new Mb(new W2(this.f9374a, this.f9377d.a()), new C0890p2());
                        this.f9388o = mb;
                    }
                } finally {
                }
            }
        }
        return mb;
    }

    public final Rb m() {
        Rb rb = this.f9396w;
        if (rb == null) {
            synchronized (this) {
                try {
                    rb = this.f9396w;
                    if (rb == null) {
                        Context context = this.f9374a;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        rb = locationClient == null ? new Tb() : new Sb(context, new Zb(), locationClient);
                        this.f9396w = rb;
                    }
                } finally {
                }
            }
        }
        return rb;
    }

    public final Rb n() {
        return m();
    }

    public final C0539bd o() {
        return this.f9393t;
    }

    public final Ck p() {
        Ck ck = this.f9391r;
        if (ck == null) {
            synchronized (this) {
                try {
                    ck = this.f9391r;
                    if (ck == null) {
                        ck = new Ck();
                        this.f9391r = ck;
                    }
                } finally {
                }
            }
        }
        return ck;
    }

    public final Cd q() {
        Cd cd = this.z;
        if (cd == null) {
            synchronized (this) {
                try {
                    cd = this.z;
                    if (cd == null) {
                        cd = new Cd(this.f9374a, new C0912po());
                        this.z = cd;
                    }
                } finally {
                }
            }
        }
        return cd;
    }

    public final Vd r() {
        return this.f9367A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers = this.f9382i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.f9382i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(c(), d());
                        this.f9382i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    public final C1135yf t() {
        E();
        return this.f9383j;
    }

    public final C0930qg u() {
        if (this.f9375b == null) {
            synchronized (this) {
                try {
                    if (this.f9375b == null) {
                        this.f9375b = new C0930qg(this.f9374a, f9366H.D().f6654c);
                    }
                } finally {
                }
            }
        }
        return this.f9375b;
    }

    public final C0751jj v() {
        C0751jj c0751jj = this.f9387n;
        if (c0751jj == null) {
            synchronized (this) {
                try {
                    c0751jj = this.f9387n;
                    if (c0751jj == null) {
                        c0751jj = new C0751jj(this.f9374a);
                        this.f9387n = c0751jj;
                    }
                } finally {
                }
            }
        }
        return c0751jj;
    }

    public final synchronized C0958rj w() {
        return this.f9379f;
    }

    public final C0882ok x() {
        return this.f9377d;
    }

    public final Bk y() {
        return this.f9372F;
    }

    public final C0618ef z() {
        if (this.f9385l == null) {
            synchronized (this) {
                try {
                    if (this.f9385l == null) {
                        this.f9385l = new C0618ef(C0662g7.a(this.f9374a).c());
                    }
                } finally {
                }
            }
        }
        return this.f9385l;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.f9368B.getActivationBarrier();
    }
}
