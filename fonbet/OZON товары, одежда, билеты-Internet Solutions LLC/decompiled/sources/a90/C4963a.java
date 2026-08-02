package a90;

import E90.n;
import We.E;
import a90.C4968f;
import android.content.Context;
import android.content.SharedPreferences;
import b90.C5594a;
import b90.C5596c;
import b90.C5597d;
import c90.C5776d;
import c90.InterfaceC5773a;
import d90.C6114b;
import d90.C6117e;
import d90.C6121i;
import d90.C6123k;
import d90.m;
import e90.C6322b;
import e90.C6324d;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: a90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4963a implements Z80.a {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<Context> f36443a;

    /* renamed from: b, reason: collision with root package name */
    private Jb.f f36444b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<C5594a> f36445c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<S30.a> f36446d;

    /* renamed from: e, reason: collision with root package name */
    private C6322b f36447e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<SharedPreferences> f36448f;

    /* renamed from: g, reason: collision with root package name */
    private n f36449g;

    /* renamed from: h, reason: collision with root package name */
    private C6121i f36450h;

    /* renamed from: i, reason: collision with root package name */
    private P30.g f36451i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<InterfaceC5773a> f36452j;

    /* renamed from: k, reason: collision with root package name */
    private j f36453k;

    /* renamed from: l, reason: collision with root package name */
    private Jb.f f36454l;

    /* renamed from: m, reason: collision with root package name */
    private Pc.a<C5596c> f36455m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<E> f36456n;

    /* renamed from: a90.a$a, reason: collision with other inner class name */
    private static final class C0702a implements Pc.a<S30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f36457a;

        C0702a(P30.b bVar) {
            this.f36457a = bVar;
        }

        @Override // Pc.a
        public final S30.a get() {
            S30.a applicationInfoDataSource = this.f36457a.getApplicationInfoDataSource();
            Jb.j.c(applicationInfoDataSource);
            return applicationInfoDataSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a90.a$b */
    static final class b implements Pc.a<C5594a> {

        /* renamed from: a, reason: collision with root package name */
        private final ExternalNetworkSettings f36458a;

        b(ExternalNetworkSettings externalNetworkSettings) {
            this.f36458a = externalNetworkSettings;
        }

        @Override // Pc.a
        public final C5594a get() {
            C5594a c5594a = this.f36458a.get$externalOkHttpSettings();
            Jb.j.c(c5594a);
            return c5594a;
        }
    }

    /* renamed from: a90.a$c */
    private static final class c implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f36459a;

        c(P30.b bVar) {
            this.f36459a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences sharedPreferences = this.f36459a.getSharedPreferences();
            Jb.j.c(sharedPreferences);
            return sharedPreferences;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a90.a$d */
    static final class d implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f36460a;

        d(P30.b bVar) {
            this.f36460a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f36460a.h();
            Jb.j.c(h11);
            return h11;
        }
    }

    C4963a(P30.b bVar, ExternalNetworkSettings externalNetworkSettings, C5597d c5597d) {
        C4968f c4968f;
        this.f36443a = new d(bVar);
        Jb.f a11 = Jb.f.a(externalNetworkSettings);
        this.f36444b = a11;
        b bVar2 = new b(externalNetworkSettings);
        this.f36445c = bVar2;
        C0702a c0702a = new C0702a(bVar);
        this.f36446d = c0702a;
        this.f36447e = new C6322b(a11, bVar2, c0702a);
        c cVar = new c(bVar);
        this.f36448f = cVar;
        C6117e c6117e = new C6117e(a11, cVar);
        P30.e eVar = new P30.e(cVar, a11, 1);
        P30.f fVar = new P30.f(cVar, a11, 1);
        Pc.a<Context> aVar = this.f36443a;
        C6123k c6123k = new C6123k(cVar, aVar);
        m mVar = new m(cVar, aVar, 0);
        C6114b c6114b = new C6114b(a11, cVar);
        c90.g gVar = new c90.g(a11, cVar, aVar);
        this.f36449g = new n(cVar, a11, 1);
        this.f36450h = new C6121i(cVar);
        this.f36451i = new P30.g(cVar, a11, 1);
        c4968f = C4968f.a.f36466a;
        this.f36452j = Jb.d.b(new C5776d(c6117e, eVar, fVar, c6123k, mVar, c6114b, gVar, c4968f, this.f36449g, this.f36450h, this.f36451i));
        this.f36453k = new j(this.f36444b, this.f36445c, this.f36447e, C6324d.a(), this.f36452j);
        this.f36454l = Jb.f.a(c5597d);
        Pc.a<C5596c> b11 = Jb.d.b(new i(this.f36443a, this.f36445c, this.f36453k));
        this.f36455m = b11;
        this.f36456n = Jb.d.b(new k(this.f36443a, this.f36453k, this.f36454l, b11));
    }

    @Override // Z80.a
    public final InterfaceC5773a T0() {
        return this.f36452j.get();
    }

    @Override // Z80.a
    public final C5596c a0() {
        return this.f36455m.get();
    }

    @Override // Z80.a
    public final E getOkHttpClient() {
        return this.f36456n.get();
    }
}
