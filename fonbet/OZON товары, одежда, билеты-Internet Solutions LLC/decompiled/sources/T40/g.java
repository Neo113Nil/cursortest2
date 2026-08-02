package T40;

import Jb.i;
import K70.j;
import We.E;
import a50.C4950b;
import a50.C4951c;
import a50.C4952d;
import android.app.Application;
import androidx.lifecycle.z0;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment;
import s40.InterfaceC9592a;
import x40.C10656a;

/* loaded from: classes3.dex */
final class g implements T40.a {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f26640a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<C10656a> f26641b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<S80.b> f26642c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<U40.a> f26643d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f26644e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f26645f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f26646g;

    /* renamed from: h, reason: collision with root package name */
    private Z40.f f26647h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<Application> f26648i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<E> f26649j;

    /* renamed from: k, reason: collision with root package name */
    private Z40.d f26650k;

    /* renamed from: l, reason: collision with root package name */
    private a50.e f26651l;

    /* renamed from: m, reason: collision with root package name */
    private j f26652m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<z0.b> f26653n;

    private static final class a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f26654a;

        a(InterfaceC6422b interfaceC6422b) {
            this.f26654a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f26654a.G0();
            Jb.j.c(G02);
            return G02;
        }
    }

    private static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f26655a;

        b(Y20.a aVar) {
            this.f26655a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f26655a.B();
            Jb.j.c(B11);
            return B11;
        }
    }

    private static final class c implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f26656a;

        c(O90.a aVar) {
            this.f26656a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f26656a.w0();
            Jb.j.c(w02);
            return w02;
        }
    }

    private static final class d implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f26657a;

        d(Z80.a aVar) {
            this.f26657a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f26657a.getOkHttpClient();
            Jb.j.c(okHttpClient);
            return okHttpClient;
        }
    }

    private static final class e implements Pc.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f26658a;

        e(P30.b bVar) {
            this.f26658a = bVar;
        }

        @Override // Pc.a
        public final Application get() {
            Application m12 = this.f26658a.m1();
            Jb.j.c(m12);
            return m12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements Pc.a<C10656a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9592a f26659a;

        f(InterfaceC9592a interfaceC9592a) {
            this.f26659a = interfaceC9592a;
        }

        @Override // Pc.a
        public final C10656a get() {
            return this.f26659a.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T40.g$g, reason: collision with other inner class name */
    static final class C0531g implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f26660a;

        C0531g(M80.a aVar) {
            this.f26660a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f26660a.d0();
            Jb.j.c(d02);
            return d02;
        }
    }

    g(P30.b bVar, InterfaceC9592a interfaceC9592a, InterfaceC6422b interfaceC6422b, M80.a aVar, Y20.a aVar2, O90.a aVar3, Z80.a aVar4) {
        this.f26640a = aVar2;
        f fVar = new f(interfaceC9592a);
        this.f26641b = fVar;
        C0531g c0531g = new C0531g(aVar);
        this.f26642c = c0531g;
        Pc.a<U40.a> b11 = Jb.d.b(new T40.e(fVar, c0531g));
        this.f26643d = b11;
        b bVar2 = new b(aVar2);
        this.f26644e = bVar2;
        c cVar = new c(aVar3);
        this.f26645f = cVar;
        a aVar5 = new a(interfaceC6422b);
        this.f26646g = aVar5;
        Pc.a<C10656a> aVar6 = this.f26641b;
        this.f26647h = new Z40.f(aVar6, b11, bVar2, cVar, aVar5);
        e eVar = new e(bVar);
        this.f26648i = eVar;
        d dVar = new d(aVar4);
        this.f26649j = dVar;
        this.f26650k = new Z40.d(eVar, bVar2, dVar);
        this.f26651l = new a50.e(aVar6, b11, bVar2, cVar, aVar5);
        this.f26652m = new j(eVar, bVar2, dVar, 1);
        i.a b12 = i.b(4);
        b12.b(Z40.e.class, this.f26647h);
        b12.b(Z40.c.class, this.f26650k);
        b12.b(C4952d.class, this.f26651l);
        b12.b(C4951c.class, this.f26652m);
        this.f26653n = Jb.d.b(new T40.f(b12.a()));
    }

    @Override // T40.a
    public final void R(Z40.b bVar) {
        bVar.factory = this.f26653n.get();
        InterfaceC6618a B11 = this.f26640a.B();
        Jb.j.c(B11);
        bVar.analyticsInteractor = B11;
    }

    @Override // T40.a
    public final void U0(OnboardingSlidesV2Fragment onboardingSlidesV2Fragment) {
        onboardingSlidesV2Fragment.factory = this.f26653n.get();
        InterfaceC6618a B11 = this.f26640a.B();
        Jb.j.c(B11);
        onboardingSlidesV2Fragment.analyticsInteractor = B11;
    }

    @Override // R40.a
    public final U40.a h1() {
        return this.f26643d.get();
    }

    @Override // T40.a
    public final void n0(C4950b c4950b) {
        c4950b.factory = this.f26653n.get();
        InterfaceC6618a B11 = this.f26640a.B();
        Jb.j.c(B11);
        c4950b.analyticsInteractor = B11;
    }

    @Override // T40.a
    public final void w1(OnboardingSlidesFragment onboardingSlidesFragment) {
        onboardingSlidesFragment.factory = this.f26653n.get();
        InterfaceC6618a B11 = this.f26640a.B();
        Jb.j.c(B11);
        onboardingSlidesFragment.analyticsInteractor = B11;
    }
}
