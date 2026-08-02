package J70;

import A30.m;
import J70.d;
import Jb.j;
import We.E;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import y30.InterfaceC10835a;

/* loaded from: classes3.dex */
final class a implements I70.a {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<R30.a> f14178a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<SharedPreferences> f14179b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f14180c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<E> f14181d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<Moshi> f14182e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<m> f14183f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<Q90.c> f14184g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f14185h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<K70.b> f14186i;

    /* renamed from: J70.a$a, reason: collision with other inner class name */
    private static final class C0267a implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f14187a;

        C0267a(P30.b bVar) {
            this.f14187a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences A11 = this.f14187a.A();
            j.c(A11);
            return A11;
        }
    }

    private static final class b implements Pc.a<Q90.c> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f14188a;

        b(O90.a aVar) {
            this.f14188a = aVar;
        }

        @Override // Pc.a
        public final Q90.c get() {
            Q90.c F02 = this.f14188a.F0();
            j.c(F02);
            return F02;
        }
    }

    private static final class c implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f14189a;

        c(Y20.a aVar) {
            this.f14189a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f14189a.B();
            j.c(B11);
            return B11;
        }
    }

    private static final class d implements Pc.a<m> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC10835a f14190a;

        d(InterfaceC10835a interfaceC10835a) {
            this.f14190a = interfaceC10835a;
        }

        @Override // Pc.a
        public final m get() {
            m a12 = this.f14190a.a1();
            j.c(a12);
            return a12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f14191a;

        e(O90.a aVar) {
            this.f14191a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f14191a.w0();
            j.c(w02);
            return w02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f14192a;

        f(Z80.a aVar) {
            this.f14192a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f14192a.getOkHttpClient();
            j.c(okHttpClient);
            return okHttpClient;
        }
    }

    private static final class g implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f14193a;

        g(P30.b bVar) {
            this.f14193a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f14193a.f();
            j.c(f7);
            return f7;
        }
    }

    a(O90.a aVar, P30.b bVar, Y20.a aVar2, Z80.a aVar3, InterfaceC10835a interfaceC10835a) {
        J70.d dVar;
        this.f14178a = new g(bVar);
        this.f14179b = new C0267a(bVar);
        this.f14180c = new e(aVar);
        this.f14181d = new f(aVar3);
        dVar = d.a.f14195a;
        Pc.a<Moshi> b11 = Jb.d.b(dVar);
        this.f14182e = b11;
        J70.e eVar = new J70.e(this.f14180c, this.f14181d, b11);
        Pc.a<R30.a> aVar4 = this.f14178a;
        K70.j jVar = new K70.j(aVar4, this.f14179b, eVar, 0);
        d dVar2 = new d(interfaceC10835a);
        this.f14183f = dVar2;
        b bVar2 = new b(aVar);
        this.f14184g = bVar2;
        c cVar = new c(aVar2);
        this.f14185h = cVar;
        this.f14186i = Jb.d.b(new K70.f(jVar, dVar2, aVar4, bVar2, cVar));
    }

    @Override // I70.a
    public final K70.b G() {
        return this.f14186i.get();
    }
}
