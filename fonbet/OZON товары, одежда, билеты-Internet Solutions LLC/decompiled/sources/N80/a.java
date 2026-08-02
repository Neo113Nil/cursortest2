package N80;

import Jb.f;
import Jb.j;
import N80.b;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import ru.ozon.fintech.nav.domain.activityresult.FintechActivityResultHandler;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: N80.a$a, reason: collision with other inner class name */
    private static final class C0364a implements b.a {
        @Override // N80.b.a
        public final N80.b a(P30.b bVar, O90.a aVar, T80.b bVar2) {
            bVar.getClass();
            aVar.getClass();
            bVar2.getClass();
            return new b(bVar, aVar, bVar2);
        }
    }

    private static final class b implements N80.b {

        /* renamed from: a, reason: collision with root package name */
        private final T80.b f18787a;

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<Application> f18788b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<ru.ozon.fintech.settings.domain.a> f18789c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<SharedPreferences> f18790d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<S80.b> f18791e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<Q80.c> f18792f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<FintechActivityResultHandler> f18793g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<Context> f18794h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<V80.b> f18795i;

        /* renamed from: N80.a$b$a, reason: collision with other inner class name */
        private static final class C0365a implements Pc.a<ru.ozon.fintech.settings.domain.a> {

            /* renamed from: a, reason: collision with root package name */
            private final O90.a f18796a;

            C0365a(O90.a aVar) {
                this.f18796a = aVar;
            }

            @Override // Pc.a
            public final ru.ozon.fintech.settings.domain.a get() {
                ru.ozon.fintech.settings.domain.a w02 = this.f18796a.w0();
                j.c(w02);
                return w02;
            }
        }

        /* renamed from: N80.a$b$b, reason: collision with other inner class name */
        private static final class C0366b implements Pc.a<SharedPreferences> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f18797a;

            C0366b(P30.b bVar) {
                this.f18797a = bVar;
            }

            @Override // Pc.a
            public final SharedPreferences get() {
                SharedPreferences sharedPreferences = this.f18797a.getSharedPreferences();
                j.c(sharedPreferences);
                return sharedPreferences;
            }
        }

        private static final class c implements Pc.a<Application> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f18798a;

            c(P30.b bVar) {
                this.f18798a = bVar;
            }

            @Override // Pc.a
            public final Application get() {
                Application m12 = this.f18798a.m1();
                j.c(m12);
                return m12;
            }
        }

        private static final class d implements Pc.a<Context> {

            /* renamed from: a, reason: collision with root package name */
            private final P30.b f18799a;

            d(P30.b bVar) {
                this.f18799a = bVar;
            }

            @Override // Pc.a
            public final Context get() {
                Context h11 = this.f18799a.h();
                j.c(h11);
                return h11;
            }
        }

        b(P30.b bVar, O90.a aVar, T80.b bVar2) {
            this.f18787a = bVar2;
            this.f18788b = new c(bVar);
            this.f18789c = new C0365a(aVar);
            f a11 = f.a(bVar2);
            C0366b c0366b = new C0366b(bVar);
            this.f18790d = c0366b;
            this.f18791e = Jb.d.b(new P80.d(this.f18788b, this.f18789c, a11, c0366b));
            Pc.a<Q80.c> b11 = Jb.d.b(P80.b.a());
            this.f18792f = b11;
            this.f18793g = Jb.d.b(new P80.a(b11, 0));
            d dVar = new d(bVar);
            this.f18794h = dVar;
            this.f18795i = Jb.d.b(new P80.c(dVar, 0));
        }

        @Override // M80.a
        public final FintechActivityResultHandler J() {
            return this.f18793g.get();
        }

        @Override // M80.a
        public final V80.b N0() {
            return this.f18795i.get();
        }

        @Override // M80.a
        public final T80.b X() {
            return this.f18787a;
        }

        @Override // M80.a
        public final S80.b d0() {
            return this.f18791e.get();
        }
    }

    public static b.a a() {
        return new C0364a();
    }
}
