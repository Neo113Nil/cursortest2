package a30;

import android.content.Context;
import c30.C5742a;
import c30.i;
import c30.j;
import oa0.InterfaceC8681a;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;

/* renamed from: a30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4933a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a30.a$a, reason: collision with other inner class name */
    static final class C0687a implements Z20.a {

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<Context> f36229a;

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<C5742a> f36230b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<S30.a> f36231c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<R30.a> f36232d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<WalletManager> f36233e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<c30.b> f36234f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<K80.b> f36235g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<i> f36236h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<j> f36237i;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a30.a$a$a, reason: collision with other inner class name */
        static final class C0688a implements Pc.a<S30.a> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f36238a;

            C0688a(P30.b bVar) {
                this.f36238a = bVar;
            }

            @Override // Pc.a
            public final S30.a get() {
                S30.a applicationInfoDataSource = this.f36238a.getApplicationInfoDataSource();
                Jb.j.c(applicationInfoDataSource);
                return applicationInfoDataSource;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a30.a$a$b */
        static final class b implements Pc.a<R30.a> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f36239a;

            b(P30.b bVar) {
                this.f36239a = bVar;
            }

            @Override // Pc.a
            public final R30.a get() {
                R30.a f7 = this.f36239a.f();
                Jb.j.c(f7);
                return f7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a30.a$a$c */
        static final class c implements Pc.a<Context> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f36240a;

            c(P30.b bVar) {
                this.f36240a = bVar;
            }

            @Override // Pc.a
            public final Context get() {
                Context h11 = this.f36240a.h();
                Jb.j.c(h11);
                return h11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a30.a$a$d */
        static final class d implements Pc.a<K80.b> {

            /* renamed from: a, reason: collision with root package name */
            private final H80.a f36241a;

            d(H80.a aVar) {
                this.f36241a = aVar;
            }

            @Override // Pc.a
            public final K80.b get() {
                K80.b u02 = this.f36241a.u0();
                Jb.j.c(u02);
                return u02;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a30.a$a$e */
        static final class e implements Pc.a<WalletManager> {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC8681a f36242a;

            e(InterfaceC8681a interfaceC8681a) {
                this.f36242a = interfaceC8681a;
            }

            @Override // Pc.a
            public final WalletManager get() {
                WalletManager t2 = this.f36242a.t();
                Jb.j.c(t2);
                return t2;
            }
        }

        C0687a(P30.b bVar, InterfaceC8681a interfaceC8681a, H80.a aVar) {
            c cVar = new c(bVar);
            this.f36229a = cVar;
            this.f36230b = Jb.d.b(new C4935c(cVar));
            C0688a c0688a = new C0688a(bVar);
            this.f36231c = c0688a;
            b bVar2 = new b(bVar);
            this.f36232d = bVar2;
            e eVar = new e(interfaceC8681a);
            this.f36233e = eVar;
            this.f36234f = Jb.d.b(new C4936d(this.f36229a, c0688a, bVar2, eVar));
            d dVar = new d(aVar);
            this.f36235g = dVar;
            this.f36236h = Jb.d.b(new C4937e(this.f36229a, dVar));
            this.f36237i = Jb.d.b(new C4938f(this.f36229a));
        }

        @Override // Z20.a
        public final j H() {
            return this.f36237i.get();
        }

        @Override // Z20.a
        public final i l1() {
            return this.f36236h.get();
        }

        @Override // Z20.a
        public final C5742a p0() {
            return this.f36230b.get();
        }

        @Override // Z20.a
        public final c30.b s1() {
            return this.f36234f.get();
        }
    }

    /* renamed from: a30.a$b */
    private static final class b implements InterfaceC4934b {
        @Override // a30.InterfaceC4934b
        public final Z20.a a(P30.b bVar, InterfaceC8681a interfaceC8681a, H80.a aVar) {
            bVar.getClass();
            interfaceC8681a.getClass();
            aVar.getClass();
            return new C0687a(bVar, interfaceC8681a, aVar);
        }
    }

    public static InterfaceC4934b a() {
        return new b();
    }
}
