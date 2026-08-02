package M5;

import N5.c;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17401a = c.a.a("nm", "hd", "it");

    static J5.q a(N5.c cVar, B5.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17401a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                z11 = cVar.j();
            } else if (p11 != 2) {
                cVar.skipValue();
            } else {
                cVar.beginArray();
                while (cVar.hasNext()) {
                    J5.c a11 = C3612h.a(cVar, gVar);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                cVar.endArray();
            }
        }
        return new J5.q(str, arrayList, z11);
    }
}
