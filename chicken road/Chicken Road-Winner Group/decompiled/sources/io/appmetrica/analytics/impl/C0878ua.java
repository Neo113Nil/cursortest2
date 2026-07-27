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
public final class C0878ua {

    /* renamed from: H, reason: collision with root package name */
    public static volatile C0878ua f8414H;

    /* renamed from: C, reason: collision with root package name */
    public volatile T9 f8417C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8422a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0781qg f8423b;

    /* renamed from: c, reason: collision with root package name */
    public volatile L6 f8424c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Z2 f8426e;
    public volatile C0809rj f;

    /* renamed from: g, reason: collision with root package name */
    public volatile U f8427g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C0585j2 f8428h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f8429i;

    /* renamed from: j, reason: collision with root package name */
    public volatile C0986yf f8430j;

    /* renamed from: k, reason: collision with root package name */
    public volatile H3 f8431k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0469ef f8432l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Co f8433m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0602jj f8434n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Mb f8435o;

    /* renamed from: p, reason: collision with root package name */
    public El f8436p;

    /* renamed from: r, reason: collision with root package name */
    public volatile Ck f8438r;

    /* renamed from: w, reason: collision with root package name */
    public volatile Rb f8443w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C0788qn f8444x;
    public volatile C0967xl y;

    /* renamed from: z, reason: collision with root package name */
    public volatile Cd f8445z;

    /* renamed from: q, reason: collision with root package name */
    public final C0852ta f8437q = new C0852ta();

    /* renamed from: s, reason: collision with root package name */
    public final Zc f8439s = new Zc();

    /* renamed from: t, reason: collision with root package name */
    public final C0390bd f8440t = new C0390bd();

    /* renamed from: u, reason: collision with root package name */
    public final C0657lm f8441u = new C0657lm();

    /* renamed from: v, reason: collision with root package name */
    public final C0603jk f8442v = new C0603jk();

    /* renamed from: A, reason: collision with root package name */
    public final Vd f8415A = new Vd();

    /* renamed from: B, reason: collision with root package name */
    public final UtilityServiceProvider f8416B = new UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final C0785qk f8418D = new C0785qk();

    /* renamed from: E, reason: collision with root package name */
    public final ReferenceHolder f8419E = new ReferenceHolder();

    /* renamed from: F, reason: collision with root package name */
    public final Bk f8420F = new Bk();

    /* renamed from: G, reason: collision with root package name */
    public final C0582j f8421G = new C0582j();

    /* renamed from: d, reason: collision with root package name */
    public final C0733ok f8425d = new C0733ok();

    public C0878ua(Context context) {
        this.f8422a = context;
    }

    public static void a(Context context) {
        if (f8414H == null) {
            synchronized (C0878ua.class) {
                try {
                    if (f8414H == null) {
                        f8414H = new C0878ua(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C0878ua k() {
        return f8414H;
    }

    public final synchronized S2 A() {
        try {
            if (this.f8436p == null) {
                El el = new El(this.f8422a);
                this.f8436p = el;
                this.f8441u.a(el);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8436p;
    }

    public final C0657lm B() {
        return this.f8441u;
    }

    public final C0788qn C() {
        C0788qn c0788qn;
        C0788qn c0788qn2 = this.f8444x;
        if (c0788qn2 != null) {
            return c0788qn2;
        }
        synchronized (this) {
            try {
                c0788qn = this.f8444x;
                if (c0788qn == null) {
                    c0788qn = new C0788qn(this.f8422a);
                    this.f8444x = c0788qn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0788qn;
    }

    public final synchronized Co D() {
        try {
            if (this.f8433m == null) {
                this.f8433m = new Co(this.f8422a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8433m;
    }

    public final void E() {
        if (this.f8430j == null) {
            synchronized (this) {
                try {
                    if (this.f8430j == null) {
                        Um a3 = Tm.a(Cif.class);
                        Context context = this.f8422a;
                        Vm vm = (Vm) a3;
                        ProtobufStateStorage<Object> a4 = vm.a(context, vm.a(context));
                        Cif cif = (Cif) a4.read();
                        this.f8430j = new C0986yf(this.f8422a, a4, new C0754pf(), new C0521gf(cif), new C0961xf(), new C0728of(this.f8422a), new C0857tf(k().z()), new C0598jf(), cif, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C0582j b() {
        return this.f8421G;
    }

    public final U c() {
        U u3;
        U u4 = this.f8427g;
        if (u4 != null) {
            return u4;
        }
        synchronized (this) {
            try {
                u3 = this.f8427g;
                if (u3 == null) {
                    u3 = new U(this.f8422a, this.f8425d.a(), this.f8441u.b());
                    this.f8441u.a(u3);
                    this.f8427g = u3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u3;
    }

    public final C0585j2 d() {
        C0585j2 c0585j2;
        C0585j2 c0585j22 = this.f8428h;
        if (c0585j22 != null) {
            return c0585j22;
        }
        synchronized (this) {
            try {
                c0585j2 = this.f8428h;
                if (c0585j2 == null) {
                    c0585j2 = new C0585j2(this.f8422a, AbstractC0611k2.a());
                    this.f8428h = c0585j2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0585j2;
    }

    public final C0741p2 e() {
        return l().f6282b;
    }

    public final H3 f() {
        if (this.f8431k == null) {
            synchronized (this) {
                try {
                    if (this.f8431k == null) {
                        Um a3 = Tm.a(A3.class);
                        Context context = this.f8422a;
                        Vm vm = (Vm) a3;
                        ProtobufStateStorage<Object> a4 = vm.a(context, vm.a(context));
                        this.f8431k = new H3(this.f8422a, a4, new I3(), new C0897v3(), new L3(), new Yi(this.f8422a), new J3(z()), new C0923w3(), (A3) a4.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f8431k;
    }

    public final Context g() {
        return this.f8422a;
    }

    public final L6 h() {
        if (this.f8424c == null) {
            synchronized (this) {
                try {
                    if (this.f8424c == null) {
                        this.f8424c = new L6(new K6(z()));
                    }
                } finally {
                }
            }
        }
        return this.f8424c;
    }

    public final T9 i() {
        T9 t9;
        T9 t92 = this.f8417C;
        if (t92 != null) {
            return t92;
        }
        synchronized (this) {
            try {
                t9 = this.f8417C;
                if (t9 == null) {
                    t9 = new T9(this.f8422a);
                    this.f8417C = t9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t9;
    }

    public final PermissionExtractor j() {
        C0967xl c0967xl = this.y;
        if (c0967xl != null) {
            return c0967xl;
        }
        synchronized (this) {
            try {
                C0967xl c0967xl2 = this.y;
                if (c0967xl2 != null) {
                    return c0967xl2;
                }
                C0967xl c0967xl3 = new C0967xl(p().f5808c.getAskForPermissionStrategy());
                this.y = c0967xl3;
                return c0967xl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Mb l() {
        Mb mb;
        Mb mb2 = this.f8435o;
        if (mb2 != null) {
            return mb2;
        }
        synchronized (this) {
            try {
                mb = this.f8435o;
                if (mb == null) {
                    mb = new Mb(new W2(this.f8422a, this.f8425d.a()), new C0741p2());
                    this.f8435o = mb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mb;
    }

    public final Rb m() {
        Rb rb;
        Rb rb2 = this.f8443w;
        if (rb2 != null) {
            return rb2;
        }
        synchronized (this) {
            try {
                rb = this.f8443w;
                if (rb == null) {
                    Context context = this.f8422a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    rb = locationClient == null ? new Tb() : new Sb(context, new Zb(), locationClient);
                    this.f8443w = rb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rb;
    }

    public final Rb n() {
        return m();
    }

    public final C0390bd o() {
        return this.f8440t;
    }

    public final Ck p() {
        Ck ck;
        Ck ck2 = this.f8438r;
        if (ck2 != null) {
            return ck2;
        }
        synchronized (this) {
            try {
                ck = this.f8438r;
                if (ck == null) {
                    ck = new Ck();
                    this.f8438r = ck;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ck;
    }

    public final Cd q() {
        Cd cd;
        Cd cd2 = this.f8445z;
        if (cd2 != null) {
            return cd2;
        }
        synchronized (this) {
            try {
                cd = this.f8445z;
                if (cd == null) {
                    cd = new Cd(this.f8422a, new C0763po());
                    this.f8445z = cd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cd;
    }

    public final Vd r() {
        return this.f8415A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.f8429i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.f8429i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.f8429i = platformIdentifiers;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformIdentifiers;
    }

    public final C0986yf t() {
        E();
        return this.f8430j;
    }

    public final C0781qg u() {
        if (this.f8423b == null) {
            synchronized (this) {
                try {
                    if (this.f8423b == null) {
                        this.f8423b = new C0781qg(this.f8422a, f8414H.D().f5818c);
                    }
                } finally {
                }
            }
        }
        return this.f8423b;
    }

    public final C0602jj v() {
        C0602jj c0602jj;
        C0602jj c0602jj2 = this.f8434n;
        if (c0602jj2 != null) {
            return c0602jj2;
        }
        synchronized (this) {
            try {
                c0602jj = this.f8434n;
                if (c0602jj == null) {
                    c0602jj = new C0602jj(this.f8422a);
                    this.f8434n = c0602jj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0602jj;
    }

    public final synchronized C0809rj w() {
        return this.f;
    }

    public final C0733ok x() {
        return this.f8425d;
    }

    public final Bk y() {
        return this.f8420F;
    }

    public final C0469ef z() {
        if (this.f8432l == null) {
            synchronized (this) {
                try {
                    if (this.f8432l == null) {
                        this.f8432l = new C0469ef(C0513g7.a(this.f8422a).c());
                    }
                } finally {
                }
            }
        }
        return this.f8432l;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.f8416B.getActivationBarrier();
    }
}
