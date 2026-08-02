package Hj0;

import Bl0.k0;
import Hj0.C3145b;
import Hj0.C3146c;
import Hj0.C3148e;
import Hj0.C3149f;
import Hj0.C3150g;
import Hj0.M;
import Qj0.Y;
import Qj0.j0;
import Qj0.l0;
import Qj0.q0;
import Qj0.u0;
import Qj0.w0;
import ak0.InterfaceC5031a;
import android.content.Context;
import com.squareup.moshi.Moshi;
import hi0.InterfaceC6959a;
import ki0.InterfaceC7684a;
import li0.InterfaceC7963a;
import mi0.C8332b;
import mi0.C8335e;
import mi0.InterfaceC8333c;
import mi0.InterfaceC8336f;
import mi0.InterfaceC8339i;
import nf.C8588a;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.android.hardwareinfo.BuildInfoManager;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import ru.ozon.tracker.db.TrackerDataBase;
import ru.ozon.tracker.sendEvent.CurrentPageInternalProvider;
import ru.ozon.tracker.sendEvent.CurrentPageInternalProvider_Factory;
import ru.ozon.tracker.sendEvent.EventManager;
import ru.ozon.tracker.sendEvent.EventManagerImpl_Factory;
import ru.ozon.tracker.sendEvent.EventMapper;
import ru.ozon.tracker.sendEvent.EventMapper_Factory;
import ru.ozon.tracker.sendEvent.EventUpdateHandler_Factory;
import ru.ozon.tracker.sendEvent.SendEventThrowableHandler;
import ru.ozon.tracker.sendEvent.SendEventThrowableHandlerImpl_Factory;
import ru.ozon.tracker.sendEvent.repository.EventRepositoryImpl;
import ru.ozon.tracker.sendEvent.repository.EventRepositoryImpl_Factory;
import ru.ozon.tracker.sendEvent.runner.EventDelayedTaskLauncher;
import xe.C10720e0;

/* renamed from: Hj0.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3151h {

    /* renamed from: Hj0.h$a */
    private static final class a implements M.a {
        @Override // Hj0.M.a
        public final M a(Context context, fi0.x xVar) {
            context.getClass();
            xVar.getClass();
            return new b(new C3163u(), new D(), new C3156m(), new k0(), new T(), new G(), new Bl0.D(), new r(), context, xVar);
        }
    }

    /* renamed from: Hj0.h$b */
    private static final class b implements M {

        /* renamed from: A, reason: collision with root package name */
        private Pc.a<bk0.e> f11120A;

        /* renamed from: B, reason: collision with root package name */
        private Pc.a<MoshiConverterFactory> f11121B;

        /* renamed from: C, reason: collision with root package name */
        private Pc.a<Mj0.i> f11122C;

        /* renamed from: D, reason: collision with root package name */
        private Pc.a<C8588a> f11123D;

        /* renamed from: E, reason: collision with root package name */
        private Pc.a<Nj0.a> f11124E;

        /* renamed from: F, reason: collision with root package name */
        private Pc.a<Retrofit.Builder> f11125F;

        /* renamed from: G, reason: collision with root package name */
        private Pc.a<Retrofit> f11126G;

        /* renamed from: H, reason: collision with root package name */
        private Pc.a<Mj0.h> f11127H;

        /* renamed from: I, reason: collision with root package name */
        private EventRepositoryImpl_Factory f11128I;

        /* renamed from: J, reason: collision with root package name */
        private E f11129J;

        /* renamed from: K, reason: collision with root package name */
        private EventUpdateHandler_Factory f11130K;

        /* renamed from: L, reason: collision with root package name */
        private Pc.a<sj.d> f11131L;

        /* renamed from: M, reason: collision with root package name */
        private Pc.a<Lj0.g> f11132M;

        /* renamed from: N, reason: collision with root package name */
        private Pc.a<Lj0.e> f11133N;

        /* renamed from: O, reason: collision with root package name */
        private Pc.a<SendEventThrowableHandler> f11134O;

        /* renamed from: P, reason: collision with root package name */
        private Pc.a<EventManager> f11135P;

        /* renamed from: Q, reason: collision with root package name */
        private Pc.a<PowerManagerRepository> f11136Q;

        /* renamed from: R, reason: collision with root package name */
        private Tj0.b f11137R;

        /* renamed from: S, reason: collision with root package name */
        private Qj0.k0 f11138S;

        /* renamed from: T, reason: collision with root package name */
        private Pc.a<InterfaceC7684a> f11139T;

        /* renamed from: U, reason: collision with root package name */
        private Pc.a<l0> f11140U;

        /* renamed from: V, reason: collision with root package name */
        private Pc.a<InterfaceC8339i> f11141V;

        /* renamed from: W, reason: collision with root package name */
        private Pc.a<Yj0.a> f11142W;

        /* renamed from: X, reason: collision with root package name */
        private Pc.a<ru.ozon.tracker.process.lifecycle.a> f11143X;

        /* renamed from: Y, reason: collision with root package name */
        private Pc.a<InterfaceC6959a> f11144Y;

        /* renamed from: Z, reason: collision with root package name */
        private Pc.a<Y> f11145Z;

        /* renamed from: a, reason: collision with root package name */
        private final Context f11146a;

        /* renamed from: a0, reason: collision with root package name */
        private Pc.a<Qj0.V> f11147a0;

        /* renamed from: b, reason: collision with root package name */
        private final fi0.x f11148b;

        /* renamed from: b0, reason: collision with root package name */
        private Pc.a<InterfaceC8333c> f11149b0;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<Moshi> f11150c = Jb.d.b(new z());

        /* renamed from: c0, reason: collision with root package name */
        private Pc.a<Yj0.a> f11151c0;

        /* renamed from: d, reason: collision with root package name */
        private Jb.f f11152d;

        /* renamed from: d0, reason: collision with root package name */
        private Pc.a<ru.ozon.tracker.process.lifecycle.a> f11153d0;

        /* renamed from: e, reason: collision with root package name */
        private fi0.l f11154e;

        /* renamed from: f, reason: collision with root package name */
        private Jb.f f11155f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<fi0.s> f11156g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<DeviceInfoManager> f11157h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<BuildInfoManager> f11158i;

        /* renamed from: j, reason: collision with root package name */
        private Pc.a<TrackerDataBase> f11159j;

        /* renamed from: k, reason: collision with root package name */
        private Pc.a<li0.m> f11160k;

        /* renamed from: l, reason: collision with root package name */
        private Pc.a<InterfaceC5031a> f11161l;

        /* renamed from: m, reason: collision with root package name */
        private Pc.a<xe.J> f11162m;

        /* renamed from: n, reason: collision with root package name */
        private Pc.a<xe.M> f11163n;

        /* renamed from: o, reason: collision with root package name */
        private Pc.a<u0> f11164o;

        /* renamed from: p, reason: collision with root package name */
        private Pc.a<EventMapper> f11165p;

        /* renamed from: q, reason: collision with root package name */
        private Pc.a<bk0.g> f11166q;

        /* renamed from: r, reason: collision with root package name */
        private Pc.a<InterfaceC8336f> f11167r;

        /* renamed from: s, reason: collision with root package name */
        private Pc.a<CurrentPageInternalProvider> f11168s;

        /* renamed from: t, reason: collision with root package name */
        private Pc.a<fi0.v> f11169t;

        /* renamed from: u, reason: collision with root package name */
        private Pc.a<Wj0.a> f11170u;

        /* renamed from: v, reason: collision with root package name */
        private Pc.a<Yj0.a> f11171v;

        /* renamed from: w, reason: collision with root package name */
        private Pc.a<ru.ozon.tracker.process.lifecycle.a> f11172w;

        /* renamed from: x, reason: collision with root package name */
        private Pc.a<EventDelayedTaskLauncher> f11173x;

        /* renamed from: y, reason: collision with root package name */
        private Pc.a<InterfaceC7963a> f11174y;

        /* renamed from: z, reason: collision with root package name */
        private Pc.a<pf0.i> f11175z;

        b(C3163u c3163u, D d11, C3156m c3156m, k0 k0Var, T t2, G g10, Bl0.D d12, r rVar, Context context, fi0.x xVar) {
            C3149f c3149f;
            C3148e c3148e;
            C3148e c3148e2;
            C3146c c3146c;
            C3148e c3148e3;
            C3149f c3149f2;
            C3145b c3145b;
            C3150g c3150g;
            C3149f c3149f3;
            this.f11146a = context;
            this.f11148b = xVar;
            Jb.f a11 = Jb.f.a(context);
            this.f11152d = a11;
            this.f11154e = new fi0.l(a11, this.f11150c);
            Jb.f a12 = Jb.f.a(xVar);
            this.f11155f = a12;
            this.f11156g = Jb.d.b(new fi0.u(this.f11152d, this.f11154e, a12));
            this.f11157h = Jb.d.b(new O(this.f11152d, this.f11155f));
            this.f11158i = Jb.d.b(new N(this.f11152d));
            Pc.a<TrackerDataBase> b11 = Jb.d.b(new C3154k(this.f11152d, 0));
            this.f11159j = b11;
            Pc.a<li0.m> b12 = Jb.d.b(new C3153j(b11, 0));
            this.f11160k = b12;
            this.f11161l = Jb.d.b(new ak0.c(b12));
            Pc.a<xe.J> b13 = Jb.d.b(new C3147d(this.f11155f));
            this.f11162m = b13;
            Pc.a<xe.M> b14 = Jb.d.b(new C3144a(b13, 0));
            this.f11163n = b14;
            Pc.a<u0> b15 = Jb.d.b(new w0(this.f11161l, b14));
            this.f11164o = b15;
            this.f11165p = Jb.d.b(EventMapper_Factory.create(this.f11150c, this.f11156g, this.f11157h, this.f11158i, b15));
            this.f11166q = Jb.d.b(bk0.h.a());
            this.f11167r = Jb.d.b(new P(this.f11155f));
            this.f11168s = Jb.m.a(CurrentPageInternalProvider_Factory.create(this.f11155f, this.f11166q));
            this.f11169t = Jb.d.b(new S(this.f11155f, 0));
            Pc.a<Wj0.a> b16 = Jb.d.b(new C3160q(this.f11155f));
            this.f11170u = b16;
            this.f11171v = Jb.d.b(new C3158o(c3156m, this.f11169t, b16));
            c3149f = C3149f.a.f11118a;
            this.f11172w = Jb.d.b(new C3157n(c3156m, c3149f, this.f11171v));
            this.f11173x = Jb.d.b(new C3159p(d12, this.f11163n, this.f11155f));
            this.f11174y = Jb.d.b(new C3155l(this.f11159j));
            Pc.a<pf0.i> b17 = Jb.d.b(new A(c3163u));
            this.f11175z = b17;
            this.f11120A = Jb.d.b(new bk0.f(this.f11155f, b17));
            this.f11121B = Jb.d.b(new y(c3163u, this.f11150c, 0));
            Pc.a<Mj0.i> b18 = Jb.d.b(new w());
            this.f11122C = b18;
            this.f11123D = Jb.d.b(new x(c3163u, b18));
            Pc.a<Nj0.a> b19 = Jb.d.b(new C3164v(c3163u, this.f11122C, 0));
            this.f11124E = b19;
            Pc.a<Retrofit.Builder> b21 = Jb.d.b(new I(g10, this.f11123D, b19, this.f11155f));
            this.f11125F = b21;
            Pc.a<Retrofit> b22 = Jb.d.b(new H(g10, this.f11120A, this.f11155f, this.f11175z, this.f11121B, b21, this.f11124E));
            this.f11126G = b22;
            Pc.a<Mj0.h> a13 = Jb.m.a(new J(g10, b22, this.f11120A));
            this.f11127H = a13;
            Pc.a<InterfaceC7963a> aVar = this.f11174y;
            c3148e = C3148e.a.f11117a;
            EventRepositoryImpl_Factory create = EventRepositoryImpl_Factory.create(aVar, a13, c3148e);
            this.f11128I = create;
            this.f11129J = new E(d11, new F(d11, this.f11155f));
            c3148e2 = C3148e.a.f11117a;
            this.f11130K = EventUpdateHandler_Factory.create(create, c3148e2, this.f11129J);
            this.f11131L = Jb.d.b(new C3161s());
            Pc.a<Lj0.g> b23 = Jb.d.b(new Lj0.h(this.f11155f));
            this.f11132M = b23;
            Pc.a<Lj0.e> b24 = Jb.d.b(new Lj0.f(this.f11131L, this.f11128I, b23, this.f11155f));
            this.f11133N = b24;
            this.f11134O = Jb.d.b(SendEventThrowableHandlerImpl_Factory.create(this.f11128I, b24));
            Pc.a<EventMapper> aVar2 = this.f11165p;
            Jb.f fVar = this.f11155f;
            Pc.a<bk0.g> aVar3 = this.f11166q;
            Pc.a<InterfaceC8336f> aVar4 = this.f11167r;
            Pc.a<CurrentPageInternalProvider> aVar5 = this.f11168s;
            Pc.a<ru.ozon.tracker.process.lifecycle.a> aVar6 = this.f11172w;
            Pc.a<xe.M> aVar7 = this.f11163n;
            c3146c = C3146c.a.f11114a;
            this.f11135P = Jb.d.b(EventManagerImpl_Factory.create(aVar2, fVar, aVar3, aVar4, aVar5, aVar6, aVar7, c3146c, this.f11173x, this.f11128I, this.f11130K, this.f11169t, this.f11162m, this.f11134O));
            Pc.a<PowerManagerRepository> b25 = Jb.d.b(new C(this.f11152d, this.f11157h));
            this.f11136Q = b25;
            this.f11137R = new Tj0.b(b25, this.f11163n);
            this.f11138S = new Qj0.k0(this.f11155f, this.f11164o, this.f11156g, this.f11157h, this.f11158i, this.f11168s);
            Pc.a<InterfaceC7684a> b26 = Jb.d.b(new C3152i(this.f11159j));
            this.f11139T = b26;
            C3154k c3154k = new C3154k(this.f11150c, 1);
            Pc.a<Mj0.h> aVar8 = this.f11127H;
            Jb.f fVar2 = this.f11155f;
            c3148e3 = C3148e.a.f11117a;
            this.f11140U = Jb.d.b(new q0(aVar8, b26, c3154k, fVar2, c3148e3));
            this.f11141V = Jb.d.b(new Q(this.f11150c, this.f11155f, 0));
            this.f11142W = Jb.d.b(new L(k0Var, this.f11169t, this.f11170u));
            c3149f2 = C3149f.a.f11118a;
            this.f11143X = Jb.d.b(new K(k0Var, c3149f2, this.f11142W));
            c3145b = C3145b.a.f11113a;
            this.f11144Y = Jb.d.b(new hi0.c(c3145b));
            Tj0.b bVar = this.f11137R;
            Qj0.k0 k0Var2 = this.f11138S;
            Jb.f fVar3 = this.f11155f;
            Pc.a<l0> aVar9 = this.f11140U;
            Pc.a<PowerManagerRepository> aVar10 = this.f11136Q;
            Pc.a<InterfaceC8339i> aVar11 = this.f11141V;
            Pc.a<xe.M> aVar12 = this.f11163n;
            Pc.a<ru.ozon.tracker.process.lifecycle.a> aVar13 = this.f11143X;
            Pc.a<Yj0.a> aVar14 = this.f11142W;
            c3150g = C3150g.a.f11119a;
            this.f11145Z = Jb.d.b(new j0(bVar, k0Var2, fVar3, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, c3150g, this.f11144Y, this.f11169t));
            this.f11147a0 = Jb.d.b(new B(this.f11145Z, Qj0.A.a(), this.f11155f));
            this.f11149b0 = Jb.d.b(C8335e.a());
            this.f11151c0 = Jb.d.b(new V(t2, this.f11169t, this.f11170u));
            c3149f3 = C3149f.a.f11118a;
            this.f11153d0 = Jb.d.b(new U(t2, c3149f3, this.f11151c0));
        }

        @Override // Hj0.M
        public final DeviceInfoManager a() {
            return this.f11157h.get();
        }

        @Override // Hj0.M
        public final ru.ozon.tracker.performance.d b() {
            return new ru.ozon.tracker.performance.d(this.f11164o.get(), this.f11156g.get(), this.f11157h.get(), this.f11158i.get(), this.f11148b, this.f11168s.get());
        }

        @Override // Hj0.M
        public final Vj0.a c() {
            return this.f11170u.get();
        }

        @Override // Hj0.M
        public final InterfaceC8339i d() {
            return this.f11141V.get();
        }

        @Override // Hj0.M
        public final InterfaceC8336f e() {
            return this.f11167r.get();
        }

        @Override // Hj0.M
        public final EventRepositoryImpl f() {
            Ib.a a11 = Jb.d.a(this.f11174y);
            Ib.a a12 = Jb.d.a(this.f11127H);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            Jb.j.d(bVar);
            return new EventRepositoryImpl(a11, a12, bVar);
        }

        @Override // Hj0.M
        public final l0 g() {
            return this.f11140U.get();
        }

        @Override // Hj0.M
        public final fi0.f getCustomPropertyTracker() {
            return new fi0.f(this.f11164o.get());
        }

        @Override // Hj0.M
        public final EventManager h() {
            return this.f11135P.get();
        }

        @Override // Hj0.M
        public final InterfaceC8333c i() {
            return this.f11149b0.get();
        }

        @Override // Hj0.M
        public final fi0.s j() {
            return this.f11156g.get();
        }

        @Override // Hj0.M
        public final ek0.a k() {
            return new ek0.a(this.f11146a, this.f11169t.get(), this.f11163n.get(), this.f11153d0.get());
        }

        @Override // Hj0.M
        public final Qj0.V l() {
            return this.f11147a0.get();
        }

        @Override // Hj0.M
        public final C8332b m() {
            return new C8332b(this.f11149b0.get(), this.f11122C.get());
        }
    }

    public static M.a a() {
        return new a();
    }
}
