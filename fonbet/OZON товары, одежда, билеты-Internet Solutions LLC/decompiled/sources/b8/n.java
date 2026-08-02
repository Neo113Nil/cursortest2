package b8;

import b8.C5584d;
import b8.j;
import com.google.crypto.tink.internal.L;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f55715a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f55716b;

    /* renamed from: c, reason: collision with root package name */
    public static final C5584d f55717c;

    static {
        try {
            j.a aVar = new j.a();
            aVar.c(32);
            aVar.d(16);
            j.c cVar = j.c.f55707b;
            aVar.e(cVar);
            j.b bVar = j.b.f55703d;
            aVar.b(bVar);
            f55715a = aVar.a();
            try {
                j.a aVar2 = new j.a();
                aVar2.c(32);
                aVar2.d(32);
                aVar2.e(cVar);
                aVar2.b(bVar);
                aVar2.a();
                try {
                    j.a aVar3 = new j.a();
                    aVar3.c(64);
                    aVar3.d(32);
                    aVar3.e(cVar);
                    j.b bVar2 = j.b.f55705f;
                    aVar3.b(bVar2);
                    aVar3.a();
                    try {
                        j.a aVar4 = new j.a();
                        aVar4.c(64);
                        aVar4.d(64);
                        aVar4.e(cVar);
                        aVar4.b(bVar2);
                        f55716b = aVar4.a();
                        try {
                            C5584d.a aVar5 = new C5584d.a();
                            aVar5.b(32);
                            aVar5.c(16);
                            aVar5.d(C5584d.b.f55673b);
                            f55717c = aVar5.a();
                        } catch (Exception e11) {
                            throw new L(e11);
                        }
                    } catch (Exception e12) {
                        throw new L(e12);
                    }
                } catch (Exception e13) {
                    throw new L(e13);
                }
            } catch (Exception e14) {
                throw new L(e14);
            }
        } catch (Exception e15) {
            throw new L(e15);
        }
    }
}
