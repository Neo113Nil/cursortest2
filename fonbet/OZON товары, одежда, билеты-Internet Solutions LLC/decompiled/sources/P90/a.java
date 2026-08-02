package P90;

import P90.f;
import Q90.n;
import Q90.o;
import Q90.p;
import We.E;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import b90.C5596c;
import c90.InterfaceC5773a;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.network.AuthPinpadNetwork;
import ru.ozon.fintech.settings.network.FeaturesNetwork;
import ru.ozon.fintech.settings.network.SettingsNetworkPins;

/* loaded from: classes3.dex */
final class a implements P90.c {

    /* renamed from: a, reason: collision with root package name */
    private final ExternalFintechSettings f22018a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<Application> f22019b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<O30.b> f22020c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<E> f22021d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<SharedPreferences> f22022e;

    /* renamed from: f, reason: collision with root package name */
    private Jb.f f22023f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<SettingsNetworkPins> f22024g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<SharedPreferences> f22025h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f22026i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<Moshi> f22027j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<T90.f> f22028k;

    /* renamed from: l, reason: collision with root package name */
    private Pc.a<T90.g> f22029l;

    /* renamed from: m, reason: collision with root package name */
    private Pc.a<o> f22030m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<C5596c> f22031n;

    /* renamed from: o, reason: collision with root package name */
    private Pc.a<InterfaceC5773a> f22032o;

    /* renamed from: p, reason: collision with root package name */
    private Pc.a<FeaturesNetwork> f22033p;

    /* renamed from: q, reason: collision with root package name */
    private Pc.a<T90.a> f22034q;

    /* renamed from: r, reason: collision with root package name */
    private Pc.a<R90.a> f22035r;

    /* renamed from: s, reason: collision with root package name */
    private Pc.a<AuthPinpadNetwork> f22036s;

    /* renamed from: t, reason: collision with root package name */
    private Pc.a<Q90.c> f22037t;

    /* renamed from: u, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f22038u;

    /* renamed from: v, reason: collision with root package name */
    private Pc.a<Context> f22039v;

    /* renamed from: w, reason: collision with root package name */
    private Pc.a<n> f22040w;

    /* renamed from: P90.a$a, reason: collision with other inner class name */
    private static final class C0436a implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f22041a;

        C0436a(P30.b bVar) {
            this.f22041a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences A11 = this.f22041a.A();
            Jb.j.c(A11);
            return A11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f22042a;

        b(Y20.a aVar) {
            this.f22042a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f22042a.B();
            Jb.j.c(B11);
            return B11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<C5596c> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f22043a;

        c(Z80.a aVar) {
            this.f22043a = aVar;
        }

        @Override // Pc.a
        public final C5596c get() {
            C5596c a02 = this.f22043a.a0();
            Jb.j.c(a02);
            return a02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f22044a;

        d(Z80.a aVar) {
            this.f22044a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f22044a.getOkHttpClient();
            Jb.j.c(okHttpClient);
            return okHttpClient;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f22045a;

        e(P30.b bVar) {
            this.f22045a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences sharedPreferences = this.f22045a.getSharedPreferences();
            Jb.j.c(sharedPreferences);
            return sharedPreferences;
        }
    }

    private static final class f implements Pc.a<InterfaceC5773a> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f22046a;

        f(Z80.a aVar) {
            this.f22046a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC5773a get() {
            InterfaceC5773a T02 = this.f22046a.T0();
            Jb.j.c(T02);
            return T02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g implements Pc.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f22047a;

        g(P30.b bVar) {
            this.f22047a = bVar;
        }

        @Override // Pc.a
        public final Application get() {
            Application m12 = this.f22047a.m1();
            Jb.j.c(m12);
            return m12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class h implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f22048a;

        h(P30.b bVar) {
            this.f22048a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f22048a.h();
            Jb.j.c(h11);
            return h11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i implements Pc.a<O30.b> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f22049a;

        i(P30.b bVar) {
            this.f22049a = bVar;
        }

        @Override // Pc.a
        public final O30.b get() {
            O30.b M02 = this.f22049a.M0();
            Jb.j.c(M02);
            return M02;
        }
    }

    a(P30.b bVar, Z80.a aVar, ExternalFintechSettings externalFintechSettings, Y20.a aVar2) {
        P90.f fVar;
        this.f22018a = externalFintechSettings;
        this.f22019b = new g(bVar);
        this.f22020c = new i(bVar);
        this.f22021d = new d(aVar);
        this.f22022e = new e(bVar);
        Jb.f a11 = Jb.f.a(externalFintechSettings);
        this.f22023f = a11;
        this.f22024g = Jb.d.b(new P90.h(a11, this.f22021d, this.f22022e));
        this.f22025h = new C0436a(bVar);
        this.f22026i = new b(aVar2);
        fVar = f.a.f22059a;
        Pc.a<Moshi> b11 = Jb.d.b(fVar);
        this.f22027j = b11;
        Pc.a<T90.f> b12 = Jb.d.b(new k(this.f22024g, this.f22025h, this.f22026i, b11));
        this.f22028k = b12;
        this.f22029l = Jb.d.b(new La0.b(b12, 1));
        this.f22030m = Jb.d.b(p.a());
        c cVar = new c(aVar);
        this.f22031n = cVar;
        f fVar2 = new f(aVar);
        this.f22032o = fVar2;
        Pc.a<FeaturesNetwork> b13 = Jb.d.b(new P90.g(cVar, this.f22022e, this.f22023f, fVar2));
        this.f22033p = b13;
        this.f22034q = Jb.d.b(new D90.k(b13, 1));
        Pc.a<R90.a> b14 = Jb.d.b(R90.b.a());
        this.f22035r = b14;
        Pc.a<AuthPinpadNetwork> b15 = Jb.d.b(new P90.d(this.f22023f, this.f22021d, this.f22022e, this.f22032o, b14));
        this.f22036s = b15;
        Pc.a<Q90.c> b16 = Jb.d.b(new P90.i(this.f22023f, this.f22034q, this.f22026i, this.f22030m, b15, this.f22020c));
        this.f22037t = b16;
        this.f22038u = Jb.d.b(new j(this.f22023f, this.f22019b, this.f22020c, this.f22029l, this.f22022e, this.f22026i, this.f22021d, this.f22030m, b16));
        h hVar = new h(bVar);
        this.f22039v = hVar;
        this.f22040w = Jb.d.b(new P90.e(hVar, this.f22037t, this.f22022e));
    }

    @Override // P90.c
    public final void C(U90.a aVar) {
        aVar.f27461b = this.f22040w.get();
        aVar.f27462c = this.f22038u.get();
    }

    @Override // O90.a
    public final Q90.c F0() {
        return this.f22037t.get();
    }

    @Override // O90.a
    public final n e1() {
        return this.f22040w.get();
    }

    @Override // O90.a
    public final R90.a k0() {
        return this.f22035r.get();
    }

    @Override // O90.a
    public final ru.ozon.fintech.settings.domain.a w0() {
        return this.f22038u.get();
    }
}
