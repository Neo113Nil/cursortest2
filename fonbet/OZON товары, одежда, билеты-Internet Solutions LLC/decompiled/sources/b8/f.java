package b8;

import S7.j;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.C;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.C5893l;
import com.google.crypto.tink.internal.E;
import com.google.crypto.tink.internal.t;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class f implements E<e, e> {

    /* renamed from: a, reason: collision with root package name */
    private static final f f55678a = new f();

    /* loaded from: classes9.dex */
    private static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final e f55679a;

        a(e eVar) {
            this.f55679a = eVar;
        }
    }

    static void d() throws GeneralSecurityException {
        t.b().d(f55678a);
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<e> a() {
        return e.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<e> b() {
        return e.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Object c(S7.j jVar, C5893l c5893l, C c11) throws GeneralSecurityException {
        C7306a e11;
        j.c g10 = jVar.g();
        A.b bVar = new A.b();
        for (int i11 = 0; i11 < jVar.k(); i11++) {
            j.c e12 = jVar.e(i11);
            if (e12.i().equals(S7.g.f25997b)) {
                e eVar = (e) c11.a(e12);
                He.g h11 = e12.h();
                if (h11 instanceof l) {
                    e11 = ((l) h11).e();
                } else {
                    if (!(h11 instanceof C5891j)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + h11.getClass().getName() + " with parameters " + h11.d());
                    }
                    e11 = ((C5891j) h11).e();
                }
                bVar.b(e11, eVar);
            }
        }
        e eVar2 = (e) c11.a(g10);
        bVar.a();
        return new a(eVar2);
    }
}
