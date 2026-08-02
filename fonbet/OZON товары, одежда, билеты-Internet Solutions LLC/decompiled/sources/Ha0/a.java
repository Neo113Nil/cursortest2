package Ha0;

import Ca0.c;
import Ha0.b;
import Jb.d;
import Jb.f;
import Jb.i;
import Pa0.e;
import Pa0.j;
import Pa0.l;
import Pa0.n;
import Za0.g;
import android.app.Application;
import kb0.EnumC7626a;
import za0.InterfaceC11014a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: Ha0.a$a, reason: collision with other inner class name */
    private static final class C0218a implements b.a {
        @Override // Ha0.b.a
        public final Ha0.b a(Application application, InterfaceC11014a interfaceC11014a, Fa0.a aVar, EnumC7626a enumC7626a) {
            application.getClass();
            interfaceC11014a.getClass();
            aVar.getClass();
            enumC7626a.getClass();
            return new b(application, interfaceC11014a, aVar, enumC7626a);
        }
    }

    private static final class b implements Ha0.b {

        /* renamed from: a, reason: collision with root package name */
        private f f10775a;

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<Ra0.a> f10776b;

        /* renamed from: c, reason: collision with root package name */
        private Ua0.b f10777c;

        /* renamed from: d, reason: collision with root package name */
        private f f10778d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<Na0.a> f10779e;

        /* renamed from: f, reason: collision with root package name */
        private e f10780f;

        /* renamed from: g, reason: collision with root package name */
        private g f10781g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<Ia0.a> f10782h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<Ca0.b> f10783i;

        b(Application application, InterfaceC11014a interfaceC11014a, Fa0.a aVar, EnumC7626a enumC7626a) {
            f a11 = f.a(interfaceC11014a);
            this.f10775a = a11;
            Pc.a<Ra0.a> b11 = d.b(new Bi0.e(a11, 2));
            this.f10776b = b11;
            this.f10777c = new Ua0.b(b11, 0);
            this.f10778d = f.a(aVar);
            Pc.a<Na0.a> b12 = d.b(new Ea0.d(this.f10778d, f.a(enumC7626a), this.f10775a));
            this.f10779e = b12;
            this.f10780f = new e(b12, 0);
            La0.b bVar = new La0.b(f.a(application), 0);
            Pc.a<Na0.a> aVar2 = this.f10779e;
            this.f10781g = new g(this.f10777c, this.f10780f, bVar, new Pa0.b(aVar2, 0), new Pa0.g(aVar2, 0), new l(aVar2, 0), new j(this.f10778d, 0));
            i.a b13 = i.b(1);
            b13.b(Za0.e.class, this.f10781g);
            this.f10782h = d.b(new Ia0.b(b13.a(), 0));
            this.f10783i = d.b(new c(new n(this.f10779e, 0)));
        }

        @Override // Ha0.b
        public final Ca0.b a0() {
            return this.f10783i.get();
        }

        @Override // Ha0.b
        public final Ia0.a getViewModelFactory() {
            return this.f10782h.get();
        }
    }

    public static b.a a() {
        return new C0218a();
    }
}
