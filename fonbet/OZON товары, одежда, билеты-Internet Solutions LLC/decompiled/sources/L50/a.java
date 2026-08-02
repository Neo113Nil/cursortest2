package L50;

import Jb.i;
import Jb.j;
import N50.p;
import android.app.Application;
import androidx.lifecycle.z0;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.demo.presentation.DemoFragment;

/* loaded from: classes3.dex */
final class a implements L50.b {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f16560a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<R30.a> f16561b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<M50.c> f16562c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<S80.b> f16563d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<Application> f16564e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<K40.a> f16565f;

    /* renamed from: g, reason: collision with root package name */
    private p f16566g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<z0.b> f16567h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L50.a$a, reason: collision with other inner class name */
    static final class C0314a implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f16568a;

        C0314a(P30.b bVar) {
            this.f16568a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f16568a.f();
            j.c(f7);
            return f7;
        }
    }

    private static final class b implements Pc.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f16569a;

        b(P30.b bVar) {
            this.f16569a = bVar;
        }

        @Override // Pc.a
        public final Application get() {
            Application m12 = this.f16569a.m1();
            j.c(m12);
            return m12;
        }
    }

    private static final class c implements Pc.a<K40.a> {

        /* renamed from: a, reason: collision with root package name */
        private final I40.a f16570a;

        c(I40.a aVar) {
            this.f16570a = aVar;
        }

        @Override // Pc.a
        public final K40.a get() {
            K40.a D02 = this.f16570a.D0();
            j.c(D02);
            return D02;
        }
    }

    private static final class d implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f16571a;

        d(M80.a aVar) {
            this.f16571a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f16571a.d0();
            j.c(d02);
            return d02;
        }
    }

    a(Y20.a aVar, P30.b bVar, M80.a aVar2, I40.a aVar3) {
        this.f16560a = aVar;
        C0314a c0314a = new C0314a(bVar);
        this.f16561b = c0314a;
        Pc.a<M50.c> b11 = Jb.d.b(new f(c0314a));
        this.f16562c = b11;
        d dVar = new d(aVar2);
        this.f16563d = dVar;
        b bVar2 = new b(bVar);
        this.f16564e = bVar2;
        c cVar = new c(aVar3);
        this.f16565f = cVar;
        this.f16566g = new p(b11, dVar, bVar2, cVar);
        i.a b12 = i.b(1);
        b12.b(N50.e.class, this.f16566g);
        this.f16567h = Jb.d.b(new g(b12.a()));
    }

    @Override // L50.b
    public final void m0(DemoFragment demoFragment) {
        demoFragment.factory = this.f16567h.get();
        InterfaceC6618a B11 = this.f16560a.B();
        j.c(B11);
        demoFragment.analyticsInteractor = B11;
    }
}
