package Y7;

import B0.C2454a;
import S7.j;
import com.google.crypto.tink.internal.A;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.C5893l;
import com.google.crypto.tink.internal.E;
import com.google.crypto.tink.internal.InterfaceC5894m;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.r;
import com.google.crypto.tink.internal.t;
import j8.C7306a;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements E<S7.d, S7.d> {

    /* renamed from: a, reason: collision with root package name */
    private static final h f34769a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final B<C5891j, S7.d> f34770b = B.b(new C2454a(), C5891j.class, S7.d.class);

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final S7.d f34771a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34772b;

        public a(S7.d dVar, int i11) {
            this.f34771a = dVar;
            this.f34772b = i11;
        }
    }

    private static class b implements S7.d {

        /* renamed from: a, reason: collision with root package name */
        private final a f34773a;

        /* renamed from: b, reason: collision with root package name */
        private final A<a> f34774b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC5894m.a f34775c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC5894m.a f34776d;

        public b(a aVar, A<a> a11, InterfaceC5894m.a aVar2, InterfaceC5894m.a aVar3) {
            this.f34773a = aVar;
            this.f34774b = a11;
            this.f34775c = aVar2;
            this.f34776d = aVar3;
        }

        @Override // S7.d
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            Iterator<a> it = this.f34774b.a(bArr).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                InterfaceC5894m.a aVar = this.f34776d;
                if (!hasNext) {
                    aVar.getClass();
                    throw new GeneralSecurityException("decryption failed");
                }
                try {
                    byte[] a11 = it.next().f34771a.a(bArr, bArr2);
                    aVar.getClass();
                    return a11;
                } catch (GeneralSecurityException unused) {
                }
            }
        }

        @Override // S7.d
        public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            InterfaceC5894m.a aVar = this.f34775c;
            a aVar2 = this.f34773a;
            try {
                byte[] b11 = aVar2.f34771a.b(bArr, bArr2);
                int i11 = aVar2.f34772b;
                int length = bArr.length;
                aVar.getClass();
                return b11;
            } catch (GeneralSecurityException e11) {
                aVar.getClass();
                throw e11;
            }
        }
    }

    public static void d() throws GeneralSecurityException {
        t.b().d(f34769a);
        t.b().c(f34770b);
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<S7.d> a() {
        return S7.d.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Class<S7.d> b() {
        return S7.d.class;
    }

    @Override // com.google.crypto.tink.internal.E
    public final Object c(j jVar, C5893l c5893l, C c11) throws GeneralSecurityException {
        C7306a e11;
        InterfaceC5894m.a aVar = n.f59282a;
        A.b bVar = new A.b();
        for (int i11 = 0; i11 < jVar.k(); i11++) {
            j.c e12 = jVar.e(i11);
            if (e12.i().equals(S7.g.f25997b)) {
                S7.d dVar = (S7.d) c11.a(e12);
                He.g h11 = e12.h();
                if (h11 instanceof f) {
                    e11 = ((f) h11).e();
                } else {
                    if (!(h11 instanceof C5891j)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + h11.getClass().getName() + " with parameters " + h11.d());
                    }
                    e11 = ((C5891j) h11).e();
                }
                bVar.b(e11, new a(dVar, e12.g()));
            }
        }
        if (!c5893l.a()) {
            r.b().a().getClass();
        }
        return new b(new a((S7.d) c11.a(jVar.g()), jVar.g().g()), bVar.a(), aVar, aVar);
    }
}
