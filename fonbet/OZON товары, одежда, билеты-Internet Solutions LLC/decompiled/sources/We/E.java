package We;

import We.InterfaceC4865g;
import We.v;
import cf.C5824e;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kf.C7673a;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC7947c;
import lf.C7948d;
import org.jetbrains.annotations.NotNull;
import p002if.j;

/* loaded from: classes6.dex */
public class E implements Cloneable, InterfaceC4865g.a {

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private static final List<F> f33556E = Ye.b.n(F.HTTP_2, F.HTTP_1_1);

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private static final List<C4872n> f33557F = Ye.b.n(C4872n.f33772e, C4872n.f33773f);

    /* renamed from: A, reason: collision with root package name */
    private final int f33558A;

    /* renamed from: B, reason: collision with root package name */
    private final int f33559B;

    /* renamed from: C, reason: collision with root package name */
    private final long f33560C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final cf.m f33561D;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4876s f33562a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4871m f33563b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<B> f33564c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<B> f33565d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v.c f33566e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f33567f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4861c f33568g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33569h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f33570i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4875q f33571j;

    /* renamed from: k, reason: collision with root package name */
    private final C4862d f33572k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final u f33573l;

    /* renamed from: m, reason: collision with root package name */
    private final Proxy f33574m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ProxySelector f33575n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4861c f33576o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final SocketFactory f33577p;

    /* renamed from: q, reason: collision with root package name */
    private final SSLSocketFactory f33578q;

    /* renamed from: r, reason: collision with root package name */
    private final X509TrustManager f33579r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final List<C4872n> f33580s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final List<F> f33581t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final HostnameVerifier f33582u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C4867i f33583v;

    /* renamed from: w, reason: collision with root package name */
    private final AbstractC7947c f33584w;

    /* renamed from: x, reason: collision with root package name */
    private final int f33585x;

    /* renamed from: y, reason: collision with root package name */
    private final int f33586y;

    /* renamed from: z, reason: collision with root package name */
    private final int f33587z;

    /* JADX WARN: Removed duplicated region for block: B:14:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E(@NotNull a builder) {
        ProxySelector J11;
        p002if.j jVar;
        p002if.j jVar2;
        p002if.j jVar3;
        List<B> list;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f33562a = builder.w();
        this.f33563b = builder.t();
        this.f33564c = Ye.b.B(builder.C());
        this.f33565d = Ye.b.B(builder.E());
        this.f33566e = builder.y();
        this.f33567f = builder.L();
        this.f33568g = builder.n();
        this.f33569h = builder.z();
        this.f33570i = builder.A();
        this.f33571j = builder.v();
        this.f33572k = builder.o();
        this.f33573l = builder.x();
        this.f33574m = builder.H();
        if (builder.H() != null) {
            J11 = C7673a.f71520a;
        } else {
            J11 = builder.J();
            J11 = J11 == null ? ProxySelector.getDefault() : J11;
            if (J11 == null) {
                J11 = C7673a.f71520a;
            }
        }
        this.f33575n = J11;
        this.f33576o = builder.I();
        this.f33577p = builder.N();
        List<C4872n> u11 = builder.u();
        this.f33580s = u11;
        this.f33581t = builder.G();
        this.f33582u = builder.B();
        this.f33585x = builder.p();
        this.f33586y = builder.s();
        this.f33587z = builder.K();
        this.f33558A = builder.P();
        this.f33559B = builder.F();
        this.f33560C = builder.D();
        cf.m M11 = builder.M();
        this.f33561D = M11 == null ? new cf.m() : M11;
        List<C4872n> list2 = u11;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((C4872n) it.next()).f()) {
                    if (builder.O() != null) {
                        this.f33578q = builder.O();
                        AbstractC7947c q11 = builder.q();
                        Intrinsics.f(q11);
                        this.f33584w = q11;
                        X509TrustManager Q11 = builder.Q();
                        Intrinsics.f(Q11);
                        this.f33579r = Q11;
                        this.f33583v = builder.r().d(q11);
                    } else {
                        j.a aVar = p002if.j.f66400c;
                        aVar.getClass();
                        jVar = p002if.j.f66398a;
                        X509TrustManager trustManager = jVar.o();
                        this.f33579r = trustManager;
                        jVar2 = p002if.j.f66398a;
                        this.f33578q = jVar2.n(trustManager);
                        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                        aVar.getClass();
                        jVar3 = p002if.j.f66398a;
                        AbstractC7947c c11 = jVar3.c(trustManager);
                        this.f33584w = c11;
                        this.f33583v = builder.r().d(c11);
                    }
                    list = this.f33564c;
                    if (list != null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    }
                    if (list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List<B> list3 = this.f33565d;
                    if (list3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    }
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List<C4872n> list4 = this.f33580s;
                    boolean z11 = list4 instanceof Collection;
                    X509TrustManager x509TrustManager = this.f33579r;
                    AbstractC7947c abstractC7947c = this.f33584w;
                    SSLSocketFactory sSLSocketFactory = this.f33578q;
                    if (!z11 || !list4.isEmpty()) {
                        Iterator<T> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((C4872n) it2.next()).f()) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (abstractC7947c == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (!(sSLSocketFactory == null)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (abstractC7947c != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Intrinsics.d(this.f33583v, C4867i.f33738c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f33578q = null;
        this.f33584w = null;
        this.f33579r = null;
        this.f33583v = C4867i.f33738c;
        list = this.f33564c;
        if (list != null) {
        }
    }

    public final Proxy A() {
        return this.f33574m;
    }

    @NotNull
    public final InterfaceC4861c B() {
        return this.f33576o;
    }

    @NotNull
    public final ProxySelector C() {
        return this.f33575n;
    }

    public final int D() {
        return this.f33587z;
    }

    public final boolean E() {
        return this.f33567f;
    }

    @NotNull
    public final SocketFactory F() {
        return this.f33577p;
    }

    @NotNull
    public final SSLSocketFactory G() {
        SSLSocketFactory sSLSocketFactory = this.f33578q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int H() {
        return this.f33558A;
    }

    public final X509TrustManager I() {
        return this.f33579r;
    }

    @Override // We.InterfaceC4865g.a
    @NotNull
    public InterfaceC4865g a(@NotNull G request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C5824e(this, request, false);
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @NotNull
    public final InterfaceC4861c e() {
        return this.f33568g;
    }

    public final C4862d f() {
        return this.f33572k;
    }

    public final int g() {
        return this.f33585x;
    }

    public final AbstractC7947c h() {
        return this.f33584w;
    }

    @NotNull
    public final C4867i i() {
        return this.f33583v;
    }

    public final int j() {
        return this.f33586y;
    }

    @NotNull
    public final C4871m k() {
        return this.f33563b;
    }

    @NotNull
    public final List<C4872n> l() {
        return this.f33580s;
    }

    @NotNull
    public final InterfaceC4875q m() {
        return this.f33571j;
    }

    @NotNull
    public final C4876s n() {
        return this.f33562a;
    }

    @NotNull
    public final u o() {
        return this.f33573l;
    }

    @NotNull
    public final v.c p() {
        return this.f33566e;
    }

    public final boolean q() {
        return this.f33569h;
    }

    public final boolean r() {
        return this.f33570i;
    }

    @NotNull
    public final cf.m s() {
        return this.f33561D;
    }

    @NotNull
    public final HostnameVerifier t() {
        return this.f33582u;
    }

    @NotNull
    public final List<B> u() {
        return this.f33564c;
    }

    public final long v() {
        return this.f33560C;
    }

    @NotNull
    public final List<B> w() {
        return this.f33565d;
    }

    @NotNull
    public final mf.d x(@NotNull G request, @NotNull S listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        mf.d dVar = new mf.d(bf.e.f55976h, request, listener, new Random(), this.f33559B, null, this.f33560C);
        dVar.h(this);
        return dVar;
    }

    public final int y() {
        return this.f33559B;
    }

    @NotNull
    public final List<F> z() {
        return this.f33581t;
    }

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private int f33588A;

        /* renamed from: B, reason: collision with root package name */
        private int f33589B;

        /* renamed from: C, reason: collision with root package name */
        private long f33590C;

        /* renamed from: D, reason: collision with root package name */
        private cf.m f33591D;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private C4876s f33592a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private C4871m f33593b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f33594c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f33595d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private v.c f33596e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f33597f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private InterfaceC4861c f33598g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f33599h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f33600i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private InterfaceC4875q f33601j;

        /* renamed from: k, reason: collision with root package name */
        private C4862d f33602k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private u f33603l;

        /* renamed from: m, reason: collision with root package name */
        private Proxy f33604m;

        /* renamed from: n, reason: collision with root package name */
        private ProxySelector f33605n;

        /* renamed from: o, reason: collision with root package name */
        @NotNull
        private InterfaceC4861c f33606o;

        /* renamed from: p, reason: collision with root package name */
        @NotNull
        private SocketFactory f33607p;

        /* renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f33608q;

        /* renamed from: r, reason: collision with root package name */
        private X509TrustManager f33609r;

        /* renamed from: s, reason: collision with root package name */
        @NotNull
        private List<C4872n> f33610s;

        /* renamed from: t, reason: collision with root package name */
        @NotNull
        private List<? extends F> f33611t;

        /* renamed from: u, reason: collision with root package name */
        @NotNull
        private HostnameVerifier f33612u;

        /* renamed from: v, reason: collision with root package name */
        @NotNull
        private C4867i f33613v;

        /* renamed from: w, reason: collision with root package name */
        private AbstractC7947c f33614w;

        /* renamed from: x, reason: collision with root package name */
        private int f33615x;

        /* renamed from: y, reason: collision with root package name */
        private int f33616y;

        /* renamed from: z, reason: collision with root package name */
        private int f33617z;

        public a() {
            this.f33592a = new C4876s();
            this.f33593b = new C4871m();
            this.f33594c = new ArrayList();
            this.f33595d = new ArrayList();
            this.f33596e = Ye.b.a(v.NONE);
            this.f33597f = true;
            InterfaceC4861c interfaceC4861c = InterfaceC4861c.f33685a;
            this.f33598g = interfaceC4861c;
            this.f33599h = true;
            this.f33600i = true;
            this.f33601j = InterfaceC4875q.f33801a;
            this.f33603l = u.f33807a;
            this.f33606o = interfaceC4861c;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "SocketFactory.getDefault()");
            this.f33607p = socketFactory;
            this.f33610s = E.f33557F;
            this.f33611t = E.f33556E;
            this.f33612u = C7948d.f73278a;
            this.f33613v = C4867i.f33738c;
            this.f33616y = 10000;
            this.f33617z = 10000;
            this.f33588A = 10000;
            this.f33590C = 1024L;
        }

        public final boolean A() {
            return this.f33600i;
        }

        @NotNull
        public final HostnameVerifier B() {
            return this.f33612u;
        }

        @NotNull
        public final ArrayList C() {
            return this.f33594c;
        }

        public final long D() {
            return this.f33590C;
        }

        @NotNull
        public final ArrayList E() {
            return this.f33595d;
        }

        public final int F() {
            return this.f33589B;
        }

        @NotNull
        public final List<F> G() {
            return this.f33611t;
        }

        public final Proxy H() {
            return this.f33604m;
        }

        @NotNull
        public final InterfaceC4861c I() {
            return this.f33606o;
        }

        public final ProxySelector J() {
            return this.f33605n;
        }

        public final int K() {
            return this.f33617z;
        }

        public final boolean L() {
            return this.f33597f;
        }

        public final cf.m M() {
            return this.f33591D;
        }

        @NotNull
        public final SocketFactory N() {
            return this.f33607p;
        }

        public final SSLSocketFactory O() {
            return this.f33608q;
        }

        public final int P() {
            return this.f33588A;
        }

        public final X509TrustManager Q() {
            return this.f33609r;
        }

        @NotNull
        public final void R(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.d(hostnameVerifier, this.f33612u)) {
                this.f33591D = null;
            }
            this.f33612u = hostnameVerifier;
        }

        @NotNull
        public final ArrayList S() {
            return this.f33594c;
        }

        @NotNull
        public final ArrayList T() {
            return this.f33595d;
        }

        @NotNull
        public final void U(long j11) {
            TimeUnit unit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f33589B = Ye.b.d("interval", unit, j11);
        }

        @NotNull
        public final void V(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList W02 = C7714v.W0(protocols);
            F f7 = F.H2_PRIOR_KNOWLEDGE;
            if (!W02.contains(f7) && !W02.contains(F.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + W02).toString());
            }
            if (W02.contains(f7) && W02.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + W02).toString());
            }
            if (W02.contains(F.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + W02).toString());
            }
            if (W02.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            W02.remove(F.SPDY_3);
            if (!W02.equals(this.f33611t)) {
                this.f33591D = null;
            }
            List<? extends F> unmodifiableList = Collections.unmodifiableList(W02);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            this.f33611t = unmodifiableList;
        }

        @NotNull
        public final void W() {
            Proxy proxy = Proxy.NO_PROXY;
            if (!Intrinsics.d(proxy, this.f33604m)) {
                this.f33591D = null;
            }
            this.f33604m = proxy;
        }

        @NotNull
        public final void X(long j11, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f33617z = Ye.b.d("timeout", unit, j11);
        }

        @NotNull
        public final void Y() {
            this.f33597f = true;
        }

        @NotNull
        public final void Z(@NotNull SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!Intrinsics.d(socketFactory, this.f33607p)) {
                this.f33591D = null;
            }
            this.f33607p = socketFactory;
        }

        @NotNull
        public final void a(@NotNull B interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f33594c.add(interceptor);
        }

        @NotNull
        public final void a0(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            p002if.j jVar;
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.d(sslSocketFactory, this.f33608q) || !Intrinsics.d(trustManager, this.f33609r)) {
                this.f33591D = null;
            }
            this.f33608q = sslSocketFactory;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            p002if.j.f66400c.getClass();
            jVar = p002if.j.f66398a;
            this.f33614w = jVar.c(trustManager);
            this.f33609r = trustManager;
        }

        @NotNull
        public final void b(@NotNull B interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f33595d.add(interceptor);
        }

        @NotNull
        public final void b0(long j11, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f33588A = Ye.b.d("timeout", unit, j11);
        }

        @NotNull
        public final void c(C4862d c4862d) {
            this.f33602k = c4862d;
        }

        @NotNull
        public final void d(long j11, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f33615x = Ye.b.d("timeout", unit, j11);
        }

        @NotNull
        public final void e(@NotNull C4867i certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!certificatePinner.equals(this.f33613v)) {
                this.f33591D = null;
            }
            this.f33613v = certificatePinner;
        }

        @NotNull
        public final void f(long j11, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f33616y = Ye.b.d("timeout", unit, j11);
        }

        @NotNull
        public final void g(@NotNull C4871m connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.f33593b = connectionPool;
        }

        @NotNull
        public final void h(@NotNull InterfaceC4875q cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.f33601j = cookieJar;
        }

        @NotNull
        public final void i(@NotNull C4876s dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f33592a = dispatcher;
        }

        @NotNull
        public final void j(@NotNull v eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.f33596e = Ye.b.a(eventListener);
        }

        @NotNull
        public final void k(@NotNull v.c eventListenerFactory) {
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.f33596e = eventListenerFactory;
        }

        @NotNull
        public final void l(boolean z11) {
            this.f33599h = z11;
        }

        @NotNull
        public final void m() {
            this.f33600i = true;
        }

        @NotNull
        public final InterfaceC4861c n() {
            return this.f33598g;
        }

        public final C4862d o() {
            return this.f33602k;
        }

        public final int p() {
            return this.f33615x;
        }

        public final AbstractC7947c q() {
            return this.f33614w;
        }

        @NotNull
        public final C4867i r() {
            return this.f33613v;
        }

        public final int s() {
            return this.f33616y;
        }

        @NotNull
        public final C4871m t() {
            return this.f33593b;
        }

        @NotNull
        public final List<C4872n> u() {
            return this.f33610s;
        }

        @NotNull
        public final InterfaceC4875q v() {
            return this.f33601j;
        }

        @NotNull
        public final C4876s w() {
            return this.f33592a;
        }

        @NotNull
        public final u x() {
            return this.f33603l;
        }

        @NotNull
        public final v.c y() {
            return this.f33596e;
        }

        public final boolean z() {
            return this.f33599h;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull E okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f33592a = okHttpClient.n();
            this.f33593b = okHttpClient.k();
            C7714v.p(okHttpClient.u(), this.f33594c);
            C7714v.p(okHttpClient.w(), this.f33595d);
            this.f33596e = okHttpClient.p();
            this.f33597f = okHttpClient.E();
            this.f33598g = okHttpClient.e();
            this.f33599h = okHttpClient.q();
            this.f33600i = okHttpClient.r();
            this.f33601j = okHttpClient.m();
            this.f33602k = okHttpClient.f();
            this.f33603l = okHttpClient.o();
            this.f33604m = okHttpClient.A();
            this.f33605n = okHttpClient.C();
            this.f33606o = okHttpClient.B();
            this.f33607p = okHttpClient.F();
            this.f33608q = okHttpClient.f33578q;
            this.f33609r = okHttpClient.I();
            this.f33610s = okHttpClient.l();
            this.f33611t = okHttpClient.z();
            this.f33612u = okHttpClient.t();
            this.f33613v = okHttpClient.i();
            this.f33614w = okHttpClient.h();
            this.f33615x = okHttpClient.g();
            this.f33616y = okHttpClient.j();
            this.f33617z = okHttpClient.D();
            this.f33588A = okHttpClient.H();
            this.f33589B = okHttpClient.y();
            this.f33590C = okHttpClient.v();
            this.f33591D = okHttpClient.s();
        }
    }

    public E() {
        this(new a());
    }
}
