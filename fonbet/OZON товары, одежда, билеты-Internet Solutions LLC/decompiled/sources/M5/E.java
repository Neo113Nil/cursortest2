package M5;

import N5.c;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17396a = c.a.a("nm", "r", "hd");

    static J5.n a(N5.c cVar, B5.g gVar) throws IOException {
        boolean z11 = false;
        String str = null;
        I5.b bVar = null;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17396a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                bVar = C3608d.b(cVar, gVar, true);
            } else if (p11 != 2) {
                cVar.skipValue();
            } else {
                z11 = cVar.j();
            }
        }
        if (z11) {
            return null;
        }
        return new J5.n(str, bVar);
    }
}
