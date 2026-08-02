package U70;

import Jb.j;
import We.E;
import android.content.Context;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.recordaudio.network.AudioRecordNetwork;

/* loaded from: classes3.dex */
final class e implements U70.a {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f27440a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<Context> f27441b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f27442c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<Q90.c> f27443d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<E> f27444e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f27445f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<AudioRecordNetwork> f27446g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<O30.b> f27447h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<R30.a> f27448i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<V70.b> f27449j;

    private static final class a implements Pc.a<Q90.c> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f27450a;

        a(O90.a aVar) {
            this.f27450a = aVar;
        }

        @Override // Pc.a
        public final Q90.c get() {
            Q90.c F02 = this.f27450a.F0();
            j.c(F02);
            return F02;
        }
    }

    private static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f27451a;

        b(Y20.a aVar) {
            this.f27451a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f27451a.B();
            j.c(B11);
            return B11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f27452a;

        c(O90.a aVar) {
            this.f27452a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f27452a.w0();
            j.c(w02);
            return w02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f27453a;

        d(Z80.a aVar) {
            this.f27453a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f27453a.getOkHttpClient();
            j.c(okHttpClient);
            return okHttpClient;
        }
    }

    /* renamed from: U70.e$e, reason: collision with other inner class name */
    private static final class C0553e implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f27454a;

        C0553e(P30.b bVar) {
            this.f27454a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f27454a.f();
            j.c(f7);
            return f7;
        }
    }

    private static final class f implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f27455a;

        f(P30.b bVar) {
            this.f27455a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f27455a.h();
            j.c(h11);
            return h11;
        }
    }

    private static final class g implements Pc.a<O30.b> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f27456a;

        g(P30.b bVar) {
            this.f27456a = bVar;
        }

        @Override // Pc.a
        public final O30.b get() {
            O30.b M02 = this.f27456a.M0();
            j.c(M02);
            return M02;
        }
    }

    e(P30.b bVar, O90.a aVar, Z80.a aVar2, Y20.a aVar3) {
        this.f27440a = aVar3;
        this.f27441b = new f(bVar);
        this.f27442c = new b(aVar3);
        this.f27443d = new a(aVar);
        d dVar = new d(aVar2);
        this.f27444e = dVar;
        c cVar = new c(aVar);
        this.f27445f = cVar;
        Pc.a<AudioRecordNetwork> b11 = Jb.d.b(new U70.d(dVar, cVar));
        this.f27446g = b11;
        g gVar = new g(bVar);
        this.f27447h = gVar;
        C0553e c0553e = new C0553e(bVar);
        this.f27448i = c0553e;
        this.f27449j = Jb.d.b(new V70.e(this.f27441b, this.f27442c, this.f27443d, b11, gVar, c0553e));
    }

    @Override // T70.a
    public final V70.b L() {
        return this.f27449j.get();
    }

    @Override // U70.a
    public final AudioRecordNetwork X0() {
        return this.f27446g.get();
    }

    @Override // U70.a
    public final InterfaceC6618a e0() {
        InterfaceC6618a B11 = this.f27440a.B();
        j.c(B11);
        return B11;
    }
}
