package O40;

import Jb.i;
import Jb.j;
import androidx.lifecycle.z0;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment;
import s40.InterfaceC9592a;
import x40.C10656a;

/* loaded from: classes3.dex */
final class f implements O40.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9592a f19949a;

    /* renamed from: b, reason: collision with root package name */
    private final M80.a f19950b;

    /* renamed from: c, reason: collision with root package name */
    private final Y20.a f19951c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f19952d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<C10656a> f19953e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<S80.b> f19954f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f19955g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f19956h;

    /* renamed from: i, reason: collision with root package name */
    private Q40.b f19957i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<z0.b> f19958j;

    private static final class a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f19959a;

        a(InterfaceC6422b interfaceC6422b) {
            this.f19959a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f19959a.G0();
            j.c(G02);
            return G02;
        }
    }

    private static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f19960a;

        b(Y20.a aVar) {
            this.f19960a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f19960a.B();
            j.c(B11);
            return B11;
        }
    }

    private static final class c implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f19961a;

        c(O90.a aVar) {
            this.f19961a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f19961a.w0();
            j.c(w02);
            return w02;
        }
    }

    private static final class d implements Pc.a<C10656a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9592a f19962a;

        d(InterfaceC9592a interfaceC9592a) {
            this.f19962a = interfaceC9592a;
        }

        @Override // Pc.a
        public final C10656a get() {
            return this.f19962a.C0();
        }
    }

    private static final class e implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f19963a;

        e(M80.a aVar) {
            this.f19963a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f19963a.d0();
            j.c(d02);
            return d02;
        }
    }

    f(M80.a aVar, O90.a aVar2, Y20.a aVar3, InterfaceC6422b interfaceC6422b, InterfaceC9592a interfaceC9592a) {
        this.f19949a = interfaceC9592a;
        this.f19950b = aVar;
        this.f19951c = aVar3;
        a aVar4 = new a(interfaceC6422b);
        this.f19952d = aVar4;
        d dVar = new d(interfaceC9592a);
        this.f19953e = dVar;
        e eVar = new e(aVar);
        this.f19954f = eVar;
        P40.c cVar = new P40.c(dVar, eVar);
        b bVar = new b(aVar3);
        this.f19955g = bVar;
        c cVar2 = new c(aVar2);
        this.f19956h = cVar2;
        this.f19957i = new Q40.b(aVar4, dVar, cVar, bVar, cVar2);
        i.a b11 = i.b(1);
        b11.b(Q40.a.class, this.f19957i);
        this.f19958j = Jb.d.b(new O40.e(b11.a()));
    }

    @Override // O40.a
    public final void N(CbottomModalDialogFragment cbottomModalDialogFragment) {
        cbottomModalDialogFragment.factory = this.f19958j.get();
        InterfaceC6618a B11 = this.f19951c.B();
        j.c(B11);
        cbottomModalDialogFragment.analyticsInteractor = B11;
    }

    @Override // M40.a
    public final P40.b o() {
        C10656a C02 = this.f19949a.C0();
        S80.b d02 = this.f19950b.d0();
        j.c(d02);
        return new P40.b(C02, d02);
    }
}
