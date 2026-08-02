package Dd0;

import B1.C2548q;
import Dd0.b;
import Ed0.c;
import Ed0.e;
import Ed0.g;
import Ed0.h;
import Ed0.i;
import Id0.a;
import Jb.d;
import Jb.f;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: Dd0.a$a, reason: collision with other inner class name */
    private static final class C0137a implements b.a {
        @Override // Dd0.b.a
        public final Dd0.b a(zd0.b bVar) {
            return new b(new C2548q(), new c(), bVar);
        }
    }

    private static final class b implements Dd0.b {

        /* renamed from: a, reason: collision with root package name */
        private f f6595a;

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<i> f6596b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<Cd0.a> f6597c;

        /* renamed from: d, reason: collision with root package name */
        private f f6598d;

        b(C2548q c2548q, c cVar, zd0.b bVar) {
            f a11 = f.a(bVar);
            this.f6595a = a11;
            Pc.a<i> b11 = d.b(new h(cVar, a11, new g(cVar), new Ed0.f(cVar, a11), new e()));
            this.f6596b = b11;
            Pc.a<Cd0.a> b12 = d.b(new Ed0.d(cVar, b11, 0));
            this.f6597c = b12;
            f fVar = this.f6595a;
            Ed0.d dVar = new Ed0.d(new Cd0.g(fVar, b12));
            this.f6598d = Id0.d.b(new Id0.c(dVar, fVar, new Id0.h(new Ed0.a(c2548q, dVar, 0))));
        }

        @Override // Dd0.b
        public final a.InterfaceC0241a a() {
            return (a.InterfaceC0241a) this.f6598d.get();
        }
    }

    public static b.a a() {
        return new C0137a();
    }
}
