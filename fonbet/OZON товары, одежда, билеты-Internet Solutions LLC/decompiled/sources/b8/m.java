package b8;

import B0.A0;
import S7.j;
import S7.p;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.C5893l;
import com.google.crypto.tink.internal.E;
import com.google.crypto.tink.internal.InterfaceC5894m;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class m implements E<p, p> {

    /* renamed from: a, reason: collision with root package name */
    private static final m f55712a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C5891j, p> f55713b = B.b(new A0(4), C5891j.class, p.class);

    /* loaded from: classes9.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final p f55714a;

        public a(p pVar, int i11) {
            this.f55714a = pVar;
        }
    }

    /* loaded from: classes9.dex */
    private static class b implements p {
        b(a aVar, A a11, InterfaceC5894m.a aVar2, InterfaceC5894m.a aVar3) {
        }
    }

    static void d() throws GeneralSecurityException {
        t.b().d(f55712a);
        t.b().c(f55713b);
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<p> a() {
        return p.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<p> b() {
        return p.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Object c(S7.j jVar, C5893l c5893l, C c11) throws GeneralSecurityException {
        C7306a e11;
        InterfaceC5894m.a aVar = com.google.crypto.tink.internal.n.f59282a;
        A.b bVar = new A.b();
        for (int i11 = 0; i11 < jVar.k(); i11++) {
            j.c e12 = jVar.e(i11);
            if (e12.i().equals(S7.g.f25997b)) {
                p pVar = (p) c11.a(e12);
                He.g h11 = e12.h();
                if (h11 instanceof l) {
                    e11 = ((l) h11).e();
                } else {
                    if (!(h11 instanceof C5891j)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + h11.getClass().getName() + " with parameters " + h11.d());
                    }
                    e11 = ((C5891j) h11).e();
                }
                bVar.b(e11, new a(pVar, e12.g()));
            }
        }
        if (!c5893l.a()) {
            r.b().a().getClass();
        }
        return new b(new a((p) c11.a(jVar.g()), jVar.g().g()), bVar.a(), aVar, aVar);
    }
}
