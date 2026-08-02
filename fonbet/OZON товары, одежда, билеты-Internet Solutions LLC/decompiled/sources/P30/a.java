package P30;

import Jb.j;
import P30.c;
import P30.d;
import Pa0.n;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: P30.a$a, reason: collision with other inner class name */
    private static final class C0429a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f21785a;

        /* renamed from: b, reason: collision with root package name */
        private O30.b f21786b;

        @Override // P30.c.a
        public final c.a a(Application application) {
            application.getClass();
            this.f21785a = application;
            return this;
        }

        @Override // P30.c.a
        public final c.a b(O30.b bVar) {
            bVar.getClass();
            this.f21786b = bVar;
            return this;
        }

        @Override // P30.c.a
        public final c create() {
            j.a(Application.class, this.f21785a);
            j.a(O30.b.class, this.f21786b);
            return new b(this.f21785a, this.f21786b);
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Application f21787a;

        /* renamed from: b, reason: collision with root package name */
        private final O30.b f21788b;

        /* renamed from: c, reason: collision with root package name */
        private Jb.f f21789c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<Context> f21790d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<R30.a> f21791e;

        /* renamed from: f, reason: collision with root package name */
        private Jb.f f21792f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<SharedPreferences> f21793g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<SharedPreferences> f21794h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<U30.a> f21795i;

        /* renamed from: j, reason: collision with root package name */
        private Pc.a<T30.c> f21796j;

        /* renamed from: k, reason: collision with root package name */
        private Pc.a<S30.a> f21797k;

        b(Application application, O30.b bVar) {
            d dVar;
            this.f21787a = application;
            this.f21788b = bVar;
            Jb.f a11 = Jb.f.a(application);
            this.f21789c = a11;
            this.f21790d = Jb.d.b(new n(a11, 2));
            dVar = d.a.f21798a;
            this.f21791e = Jb.d.b(dVar);
            Jb.f a12 = Jb.f.a(bVar);
            this.f21792f = a12;
            this.f21793g = Jb.d.b(new g(this.f21790d, a12, 0));
            this.f21794h = Jb.d.b(new f(this.f21790d, this.f21792f, 0));
            this.f21795i = Jb.d.b(new P80.c(this.f21790d, 1));
            this.f21796j = Jb.d.b(T30.b.a());
            this.f21797k = Jb.d.b(new e(this.f21793g, this.f21789c, 0));
        }

        @Override // P30.b
        public final SharedPreferences A() {
            return this.f21794h.get();
        }

        @Override // P30.b
        public final O30.b M0() {
            return this.f21788b;
        }

        @Override // P30.b
        public final R30.a f() {
            return this.f21791e.get();
        }

        @Override // P30.b
        public final S30.a getApplicationInfoDataSource() {
            return this.f21797k.get();
        }

        @Override // P30.b
        public final SharedPreferences getSharedPreferences() {
            return this.f21793g.get();
        }

        @Override // P30.b
        public final Context h() {
            return this.f21790d.get();
        }

        @Override // P30.b
        public final T30.c j1() {
            return this.f21796j.get();
        }

        @Override // P30.b
        public final Application m1() {
            return this.f21787a;
        }

        @Override // P30.b
        public final U30.a r1() {
            return this.f21795i.get();
        }
    }

    public static c.a a() {
        return new C0429a();
    }
}
