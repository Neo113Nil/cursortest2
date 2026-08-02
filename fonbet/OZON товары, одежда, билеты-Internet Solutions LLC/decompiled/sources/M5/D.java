package M5;

import N5.c;
import java.io.IOException;

/* loaded from: classes8.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17395a = c.a.a("nm", "c", "o", "tr", "hd");

    static J5.m a(N5.c cVar, B5.g gVar) throws IOException {
        String str = null;
        I5.b bVar = null;
        I5.b bVar2 = null;
        I5.l lVar = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17395a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                bVar = C3608d.b(cVar, gVar, false);
            } else if (p11 == 2) {
                bVar2 = C3608d.b(cVar, gVar, false);
            } else if (p11 == 3) {
                lVar = C3607c.a(cVar, gVar);
            } else if (p11 != 4) {
                cVar.skipValue();
            } else {
                z11 = cVar.j();
            }
        }
        return new J5.m(str, bVar, bVar2, lVar, z11);
    }
}
