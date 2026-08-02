package M5;

import J5.j;
import N5.c;
import java.io.IOException;

/* loaded from: classes8.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17456a = c.a.a("nm", "mm", "hd");

    static J5.j a(N5.c cVar) throws IOException {
        String str = null;
        boolean z11 = false;
        j.a aVar = null;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17456a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                int nextInt = cVar.nextInt();
                aVar = nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? nextInt != 4 ? nextInt != 5 ? j.a.MERGE : j.a.EXCLUDE_INTERSECTIONS : j.a.INTERSECT : j.a.SUBTRACT : j.a.ADD : j.a.MERGE;
            } else if (p11 != 2) {
                cVar.q();
                cVar.skipValue();
            } else {
                z11 = cVar.j();
            }
        }
        return new J5.j(str, aVar, z11);
    }
}
