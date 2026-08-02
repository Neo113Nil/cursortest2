package M5;

import J5.t;
import N5.c;
import java.io.IOException;

/* loaded from: classes8.dex */
final class L {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17405a = c.a.a("s", "e", "o", "nm", "m", "hd");

    static J5.t a(N5.c cVar, B5.g gVar) throws IOException {
        t.a aVar;
        String str = null;
        t.a aVar2 = null;
        I5.b bVar = null;
        I5.b bVar2 = null;
        I5.b bVar3 = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17405a);
            if (p11 == 0) {
                bVar = C3608d.b(cVar, gVar, false);
            } else if (p11 == 1) {
                bVar2 = C3608d.b(cVar, gVar, false);
            } else if (p11 == 2) {
                bVar3 = C3608d.b(cVar, gVar, false);
            } else if (p11 == 3) {
                str = cVar.nextString();
            } else if (p11 == 4) {
                int nextInt = cVar.nextInt();
                if (nextInt == 1) {
                    aVar = t.a.SIMULTANEOUSLY;
                } else {
                    if (nextInt != 2) {
                        throw new IllegalArgumentException(Ej.b.a(nextInt, "Unknown trim path type "));
                    }
                    aVar = t.a.INDIVIDUALLY;
                }
                aVar2 = aVar;
            } else if (p11 != 5) {
                cVar.skipValue();
            } else {
                z11 = cVar.j();
            }
        }
        return new J5.t(str, aVar2, bVar, bVar2, bVar3, z11);
    }
}
