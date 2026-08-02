package E80;

import B50.m;
import Bi0.e;
import E80.b;
import Jb.f;
import Jb.h;
import Jb.j;
import We.E;
import a90.C4965c;
import android.app.Application;
import b30.C5524b;
import b40.InterfaceC5539a;
import b90.C5597d;
import d50.C6093c;
import d50.InterfaceC6091a;
import f40.InterfaceC6422b;
import f80.InterfaceC6466a;
import f90.InterfaceC6469a;
import g30.InterfaceC6618a;
import g90.InterfaceC6681b;
import i30.C7004a;
import i30.C7005b;
import i40.InterfaceC7007a;
import i50.C7012c;
import i50.InterfaceC7010a;
import kotlin.jvm.internal.Intrinsics;
import l90.C7901a;
import m40.InterfaceC8077a;
import m90.C8110a;
import n90.InterfaceC8456a;
import pa0.C8888d;
import pa0.InterfaceC8886b;
import q90.C9001b;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.features.camera.di.CameraApi;
import ru.ozon.fintech.features.camera.di.factory.CameraApiComponentFactory_Factory;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import s30.InterfaceC9590a;
import s50.InterfaceC9600a;
import s80.InterfaceC9627b;
import u30.C9944b;
import u40.C9961c;
import u40.InterfaceC9959a;
import v30.C10219a;
import v70.InterfaceC10268b;
import v80.InterfaceC10276c;
import wa0.InterfaceC10467a;
import x70.C10674a;
import x70.C10675b;
import xa0.C10692c;
import y30.InterfaceC10835a;
import y50.C10841c;
import y50.InterfaceC10839a;
import y50.g;
import y50.i;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: E80.a$a, reason: collision with other inner class name */
    private static final class C0169a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f7594a;

        /* renamed from: b, reason: collision with root package name */
        private ExternalFintechSettings f7595b;

        /* renamed from: c, reason: collision with root package name */
        private ExternalNetworkSettings f7596c;

        /* renamed from: d, reason: collision with root package name */
        private ExternalFintechAuth f7597d;

        /* renamed from: e, reason: collision with root package name */
        private T80.b f7598e;

        /* renamed from: f, reason: collision with root package name */
        private AnalyticsConfig f7599f;

        /* renamed from: g, reason: collision with root package name */
        private C8110a f7600g;

        /* renamed from: h, reason: collision with root package name */
        private C7004a f7601h;

        /* renamed from: i, reason: collision with root package name */
        private N30.b f7602i;

        /* renamed from: j, reason: collision with root package name */
        private C10675b f7603j;

        /* renamed from: k, reason: collision with root package name */
        private C10219a f7604k;

        /* renamed from: l, reason: collision with root package name */
        private InterfaceC5539a f7605l;

        /* renamed from: m, reason: collision with root package name */
        private O30.b f7606m;

        /* renamed from: n, reason: collision with root package name */
        private C7901a f7607n;

        /* renamed from: o, reason: collision with root package name */
        private C10674a f7608o;

        /* renamed from: p, reason: collision with root package name */
        private C80.a f7609p;

        /* renamed from: q, reason: collision with root package name */
        private M90.a f7610q;

        /* renamed from: r, reason: collision with root package name */
        private N90.a f7611r;

        /* renamed from: s, reason: collision with root package name */
        private CameraScannerFactory f7612s;

        /* renamed from: t, reason: collision with root package name */
        private C7005b f7613t;

        /* renamed from: u, reason: collision with root package name */
        private K80.a f7614u;

        /* renamed from: v, reason: collision with root package name */
        private Z30.a f7615v;

        /* renamed from: w, reason: collision with root package name */
        private C5597d f7616w;

        @Override // E80.b.a
        public final b.a a(Application application) {
            application.getClass();
            this.f7594a = application;
            return this;
        }

        @Override // E80.b.a
        public final b.a b(InterfaceC5539a interfaceC5539a) {
            interfaceC5539a.getClass();
            this.f7605l = interfaceC5539a;
            return this;
        }

        @Override // E80.b.a
        public final b.a c(ExternalNetworkSettings externalNetworkSettings) {
            externalNetworkSettings.getClass();
            this.f7596c = externalNetworkSettings;
            return this;
        }

        @Override // E80.b.a
        public final E80.b create() {
            j.a(Application.class, this.f7594a);
            j.a(ExternalFintechSettings.class, this.f7595b);
            j.a(ExternalNetworkSettings.class, this.f7596c);
            j.a(ExternalFintechAuth.class, this.f7597d);
            j.a(T80.b.class, this.f7598e);
            j.a(AnalyticsConfig.class, this.f7599f);
            j.a(C8110a.class, this.f7600g);
            j.a(C7004a.class, this.f7601h);
            j.a(N30.b.class, this.f7602i);
            j.a(C10675b.class, this.f7603j);
            j.a(C10219a.class, this.f7604k);
            j.a(InterfaceC5539a.class, this.f7605l);
            j.a(O30.b.class, this.f7606m);
            j.a(C7901a.class, this.f7607n);
            j.a(C10674a.class, this.f7608o);
            j.a(C80.a.class, this.f7609p);
            j.a(M90.a.class, this.f7610q);
            j.a(N90.a.class, this.f7611r);
            j.a(CameraScannerFactory.class, this.f7612s);
            j.a(C7005b.class, this.f7613t);
            j.a(K80.a.class, this.f7614u);
            j.a(Z30.a.class, this.f7615v);
            j.a(C5597d.class, this.f7616w);
            return new b(new c(), this.f7594a, this.f7595b, this.f7596c, this.f7597d, this.f7598e, this.f7599f, this.f7600g, this.f7601h, this.f7602i, this.f7603j, this.f7604k, this.f7605l, this.f7606m, this.f7607n, this.f7608o, this.f7609p, this.f7610q, this.f7611r, this.f7612s, this.f7613t, this.f7614u, this.f7615v, this.f7616w);
        }

        @Override // E80.b.a
        public final b.a d(C7004a c7004a) {
            c7004a.getClass();
            this.f7601h = c7004a;
            return this;
        }

        @Override // E80.b.a
        public final b.a e(C10219a c10219a) {
            c10219a.getClass();
            this.f7604k = c10219a;
            return this;
        }

        @Override // E80.b.a
        public final b.a f(C8110a c8110a) {
            c8110a.getClass();
            this.f7600g = c8110a;
            return this;
        }

        @Override // E80.b.a
        public final b.a g(C10674a c10674a) {
            c10674a.getClass();
            this.f7608o = c10674a;
            return this;
        }

        @Override // E80.b.a
        public final b.a h(T80.b bVar) {
            bVar.getClass();
            this.f7598e = bVar;
            return this;
        }

        @Override // E80.b.a
        public final b.a i(Z30.a aVar) {
            aVar.getClass();
            this.f7615v = aVar;
            return this;
        }

        @Override // E80.b.a
        public final b.a j(ExternalFintechAuth externalFintechAuth) {
            externalFintechAuth.getClass();
            this.f7597d = externalFintechAuth;
            return this;
        }

        @Override // E80.b.a
        public final b.a k(C10675b c10675b) {
            c10675b.getClass();
            this.f7603j = c10675b;
            return this;
        }

        @Override // E80.b.a
        public final b.a l(C7901a c7901a) {
            c7901a.getClass();
            this.f7607n = c7901a;
            return this;
        }

        @Override // E80.b.a
        public final b.a m(M90.a aVar) {
            aVar.getClass();
            this.f7610q = aVar;
            return this;
        }

        @Override // E80.b.a
        public final b.a n(C5597d c5597d) {
            c5597d.getClass();
            this.f7616w = c5597d;
            return this;
        }

        @Override // E80.b.a
        public final b.a o(K80.a aVar) {
            aVar.getClass();
            this.f7614u = aVar;
            return this;
        }

        @Override // E80.b.a
        public final b.a p(N90.a aVar) {
            aVar.getClass();
            this.f7611r = aVar;
            return this;
        }

        @Override // E80.b.a
        public final b.a q(CameraScannerFactory cameraScannerFactory) {
            cameraScannerFactory.getClass();
            this.f7612s = cameraScannerFactory;
            return this;
        }

        @Override // E80.b.a
        public final b.a r(ExternalFintechSettings externalFintechSettings) {
            externalFintechSettings.getClass();
            this.f7595b = externalFintechSettings;
            return this;
        }

        @Override // E80.b.a
        public final b.a s(N30.b bVar) {
            bVar.getClass();
            this.f7602i = bVar;
            return this;
        }

        @Override // E80.b.a
        public final b.a t(C7005b c7005b) {
            c7005b.getClass();
            this.f7613t = c7005b;
            return this;
        }

        @Override // E80.b.a
        public final b.a u(AnalyticsConfig analyticsConfig) {
            analyticsConfig.getClass();
            this.f7599f = analyticsConfig;
            return this;
        }

        @Override // E80.b.a
        public final b.a v(O30.b bVar) {
            bVar.getClass();
            this.f7606m = bVar;
            return this;
        }

        @Override // E80.b.a
        public final b.a w(C80.a aVar) {
            aVar.getClass();
            this.f7609p = aVar;
            return this;
        }
    }

    private static final class b implements E80.b {

        /* renamed from: A, reason: collision with root package name */
        private f f7617A;

        /* renamed from: B, reason: collision with root package name */
        private n40.b f7618B;

        /* renamed from: C, reason: collision with root package name */
        private Pc.a<Y30.b> f7619C;

        /* renamed from: a, reason: collision with root package name */
        private f f7620a;

        /* renamed from: b, reason: collision with root package name */
        private f f7621b;

        /* renamed from: c, reason: collision with root package name */
        private f f7622c;

        /* renamed from: d, reason: collision with root package name */
        private f30.c f7623d;

        /* renamed from: e, reason: collision with root package name */
        private f f7624e;

        /* renamed from: f, reason: collision with root package name */
        private Q30.b f7625f;

        /* renamed from: g, reason: collision with root package name */
        private O80.b f7626g;

        /* renamed from: h, reason: collision with root package name */
        private f f7627h;

        /* renamed from: i, reason: collision with root package name */
        private C4965c f7628i;

        /* renamed from: j, reason: collision with root package name */
        private f f7629j;

        /* renamed from: k, reason: collision with root package name */
        private f f7630k;

        /* renamed from: l, reason: collision with root package name */
        private CameraApiComponentFactory_Factory f7631l;

        /* renamed from: m, reason: collision with root package name */
        private f f7632m;

        /* renamed from: n, reason: collision with root package name */
        private P80.a f7633n;

        /* renamed from: o, reason: collision with root package name */
        private e f7634o;

        /* renamed from: p, reason: collision with root package name */
        private z30.b f7635p;

        /* renamed from: q, reason: collision with root package name */
        private w90.d f7636q;

        /* renamed from: r, reason: collision with root package name */
        private f f7637r;

        /* renamed from: s, reason: collision with root package name */
        private f f7638s;

        /* renamed from: t, reason: collision with root package name */
        private g80.d f7639t;

        /* renamed from: u, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.data.j f7640u;

        /* renamed from: v, reason: collision with root package name */
        private Pa0.j f7641v;

        /* renamed from: w, reason: collision with root package name */
        private m f7642w;

        /* renamed from: x, reason: collision with root package name */
        private C9944b f7643x;

        /* renamed from: y, reason: collision with root package name */
        private J80.b f7644y;

        /* renamed from: z, reason: collision with root package name */
        private f f7645z;

        b(c cVar, Application application, ExternalFintechSettings externalFintechSettings, ExternalNetworkSettings externalNetworkSettings, ExternalFintechAuth externalFintechAuth, T80.b bVar, AnalyticsConfig analyticsConfig, C8110a c8110a, C7004a c7004a, N30.b bVar2, C10675b c10675b, C10219a c10219a, InterfaceC5539a interfaceC5539a, O30.b bVar3, C7901a c7901a, C10674a c10674a, C80.a aVar, M90.a aVar2, N90.a aVar3, CameraScannerFactory cameraScannerFactory, C7005b c7005b, K80.a aVar4, Z30.a aVar5, C5597d c5597d) {
            this.f7620a = f.a(analyticsConfig);
            this.f7621b = f.a(c7004a);
            this.f7622c = f.a(c8110a);
            this.f7623d = new f30.c(this.f7620a, this.f7621b, this.f7622c, f.a(c7005b));
            this.f7624e = f.a(application);
            this.f7625f = new Q30.b(this.f7624e, f.a(bVar3));
            this.f7626g = new O80.b(f.a(bVar), 0);
            this.f7627h = f.a(externalNetworkSettings);
            this.f7628i = new C4965c(this.f7627h, f.a(c5597d));
            this.f7629j = f.a(cameraScannerFactory);
            f a11 = f.a(externalFintechSettings);
            this.f7630k = a11;
            this.f7631l = CameraApiComponentFactory_Factory.create(this.f7629j, a11);
            f a12 = f.a(aVar5);
            this.f7632m = a12;
            this.f7633n = new P80.a(a12, 2);
            this.f7634o = new e(this.f7630k, 1);
            this.f7635p = new z30.b(f.a(externalFintechAuth));
            this.f7636q = new w90.d(this.f7632m);
            this.f7637r = f.a(c10675b);
            f a13 = f.a(interfaceC5539a);
            this.f7638s = a13;
            this.f7639t = new g80.d(this.f7637r, a13);
            this.f7640u = new ru.ozon.android.messenger.framework.data.j(this.f7637r, f.a(c10674a), 1);
            this.f7641v = new Pa0.j(f.a(aVar2), 1);
            this.f7642w = new m(this.f7638s, f.a(bVar2), this.f7632m, this.f7627h, 1);
            this.f7643x = new C9944b(f.a(c10219a));
            this.f7644y = new J80.b(f.a(aVar4));
            this.f7645z = f.a(c7901a);
            this.f7617A = f.a(aVar);
            this.f7618B = new n40.b(this.f7645z, this.f7617A, f.a(aVar3));
            h.a b11 = h.b(43);
            b11.b(Y20.a.class, this.f7623d);
            b11.b(P30.b.class, this.f7625f);
            b11.b(M80.a.class, this.f7626g);
            b11.b(Z80.a.class, this.f7628i);
            b11.b(CameraApi.class, this.f7631l);
            b11.b(InterfaceC10276c.class, this.f7633n);
            b11.b(O90.a.class, this.f7634o);
            b11.b(InterfaceC10835a.class, this.f7635p);
            b11.b(InterfaceC6422b.class, g40.b.a());
            b11.b(w90.b.class, this.f7636q);
            b11.b(g80.b.class, this.f7639t);
            b11.b(InterfaceC8886b.class, C8888d.a());
            b11.b(InterfaceC6681b.class, g90.d.a());
            b11.b(InterfaceC10268b.class, this.f7640u);
            b11.b(InterfaceC7007a.class, this.f7641v);
            b11.b(InterfaceC8456a.class, C9001b.a());
            b11.b(X70.b.class, Y70.b.a());
            b11.b(InterfaceC9627b.class, s80.d.a());
            b11.b(L50.b.class, L50.d.a());
            b11.b(N70.b.class, N70.d.a());
            b11.b(B70.b.class, B70.d.a());
            b11.b(Q50.a.class, this.f7642w);
            b11.b(o50.a.class, o50.c.a());
            b11.b(InterfaceC9600a.class, t50.b.a());
            b11.b(g.class, i.a());
            b11.b(InterfaceC10839a.class, C10841c.a());
            b11.b(T40.a.class, T40.c.a());
            b11.b(InterfaceC9959a.class, C9961c.a());
            b11.b(O40.a.class, O40.c.a());
            b11.b(H50.a.class, H50.c.a());
            b11.b(J40.a.class, J40.c.a());
            b11.b(InterfaceC9590a.class, this.f7643x);
            b11.b(Q60.a.class, R60.c.a());
            b11.b(H80.a.class, this.f7644y);
            b11.b(InterfaceC8077a.class, this.f7618B);
            b11.b(InterfaceC7010a.class, C7012c.a());
            b11.b(InterfaceC6091a.class, C6093c.a());
            b11.b(T70.a.class, U70.c.a());
            b11.b(N60.a.class, O60.c.a());
            b11.b(I70.a.class, J70.c.a());
            b11.b(Z20.a.class, C5524b.a());
            b11.b(U60.a.class, c70.d.a());
            b11.b(InterfaceC10467a.class, C10692c.a());
            this.f7619C = Jb.d.b(new d(cVar, b11.a()));
        }

        @Override // E80.b
        public final E a() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            E okHttpClient = ((Z80.a) componentStorage.a(Z80.a.class)).getOkHttpClient();
            j.d(okHttpClient);
            return okHttpClient;
        }

        @Override // E80.b
        public final R30.a f() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            R30.a f7 = ((P30.b) componentStorage.a(P30.b.class)).f();
            j.d(f7);
            return f7;
        }

        @Override // E80.b
        public final h80.b g() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            h80.b g10 = ((InterfaceC6466a) componentStorage.a(InterfaceC6466a.class)).g();
            j.d(g10);
            return g10;
        }

        @Override // E80.b
        public final Y30.b h() {
            return this.f7619C.get();
        }

        @Override // E80.b
        public final S80.b i() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            S80.b d02 = ((M80.a) componentStorage.a(M80.a.class)).d0();
            j.d(d02);
            return d02;
        }

        @Override // E80.b
        public final ru.ozon.fintech.settings.domain.a j() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            ru.ozon.fintech.settings.domain.a w02 = ((O90.a) componentStorage.a(O90.a.class)).w0();
            j.d(w02);
            return w02;
        }

        @Override // E80.b
        public final S30.a k() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            S30.a applicationInfoDataSource = ((P30.b) componentStorage.a(P30.b.class)).getApplicationInfoDataSource();
            j.d(applicationInfoDataSource);
            return applicationInfoDataSource;
        }

        @Override // E80.b
        public final h90.f l() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            h90.f g12 = ((InterfaceC6469a) componentStorage.a(InterfaceC6469a.class)).g1();
            j.d(g12);
            return g12;
        }

        @Override // E80.b
        public final InterfaceC6618a m() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            InterfaceC6618a B11 = ((Y20.a) componentStorage.a(Y20.a.class)).B();
            j.d(B11);
            return B11;
        }

        @Override // E80.b
        public final A30.m n() {
            Y30.b componentStorage = this.f7619C.get();
            Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
            A30.m a12 = ((InterfaceC10835a) componentStorage.a(InterfaceC10835a.class)).a1();
            j.d(a12);
            return a12;
        }
    }

    public static b.a a() {
        return new C0169a();
    }
}
