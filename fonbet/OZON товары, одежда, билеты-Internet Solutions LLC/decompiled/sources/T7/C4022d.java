package T7;

import S7.j;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.C5893l;
import com.google.crypto.tink.internal.InterfaceC5894m;
import j8.C7306a;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: T7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4022d implements com.google.crypto.tink.internal.E<S7.a, S7.a> {

    /* renamed from: a, reason: collision with root package name */
    private static final C4022d f26794a = new C4022d();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.B<C5891j, S7.a> f26795b = com.google.crypto.tink.internal.B.b(new P4.f(), C5891j.class, S7.a.class);

    /* renamed from: T7.d$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final S7.a f26796a;

        public a(S7.a aVar, int i11) {
            this.f26796a = aVar;
        }
    }

    /* renamed from: T7.d$b */
    private static class b implements S7.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f26797a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.crypto.tink.internal.A<a> f26798b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC5894m.a f26799c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC5894m.a f26800d;

        b(a aVar, com.google.crypto.tink.internal.A a11, InterfaceC5894m.a aVar2, InterfaceC5894m.a aVar3) {
            this.f26797a = aVar;
            this.f26798b = a11;
            this.f26799c = aVar2;
            this.f26800d = aVar3;
        }

        @Override // S7.a
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            InterfaceC5894m.a aVar = this.f26799c;
            try {
                byte[] a11 = this.f26797a.f26796a.a(bArr, bArr2);
                int length = bArr.length;
                aVar.getClass();
                return a11;
            } catch (GeneralSecurityException e11) {
                aVar.getClass();
                throw e11;
            }
        }

        @Override // S7.a
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            Iterator<a> it = this.f26798b.a(bArr).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                InterfaceC5894m.a aVar = this.f26800d;
                if (!hasNext) {
                    aVar.getClass();
                    throw new GeneralSecurityException("decryption failed");
                }
                try {
                    byte[] b11 = it.next().f26796a.b(bArr, bArr2);
                    aVar.getClass();
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
    }

    public static void d() throws GeneralSecurityException {
        com.google.crypto.tink.internal.t.b().d(f26794a);
        com.google.crypto.tink.internal.t.b().c(f26795b);
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<S7.a> a() {
        return S7.a.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<S7.a> b() {
        return S7.a.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Object c(S7.j jVar, C5893l c5893l, com.google.crypto.tink.internal.C c11) throws GeneralSecurityException {
        C7306a e11;
        InterfaceC5894m.a aVar = com.google.crypto.tink.internal.n.f59282a;
        A.b bVar = new A.b();
        for (int i11 = 0; i11 < jVar.k(); i11++) {
            j.c e12 = jVar.e(i11);
            if (e12.i().equals(S7.g.f25997b)) {
                He.g h11 = e12.h();
                if (h11 instanceof AbstractC4020b) {
                    e11 = ((AbstractC4020b) h11).e();
                } else {
                    if (!(h11 instanceof C5891j)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + h11.getClass().getName() + " with parameters " + h11.d());
                    }
                    e11 = ((C5891j) h11).e();
                }
                bVar.b(e11, new a((S7.a) c11.a(e12), e12.g()));
            }
        }
        if (!c5893l.a()) {
            com.google.crypto.tink.internal.r.b().a().getClass();
        }
        return new b(new a((S7.a) c11.a(jVar.g()), jVar.g().g()), bVar.a(), aVar, aVar);
    }
}
