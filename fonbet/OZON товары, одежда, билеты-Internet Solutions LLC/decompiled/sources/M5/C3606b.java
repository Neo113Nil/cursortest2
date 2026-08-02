package M5;

import N5.c;
import java.io.IOException;

/* renamed from: M5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3606b {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17407a = c.a.a("a");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17408b = c.a.a("fc", "sc", "sw", "t");

    public static I5.k a(N5.c cVar, B5.g gVar) throws IOException {
        cVar.beginObject();
        I5.k kVar = null;
        while (cVar.hasNext()) {
            if (cVar.p(f17407a) != 0) {
                cVar.q();
                cVar.skipValue();
            } else {
                cVar.beginObject();
                I5.a aVar = null;
                I5.a aVar2 = null;
                I5.b bVar = null;
                I5.b bVar2 = null;
                while (cVar.hasNext()) {
                    int p11 = cVar.p(f17408b);
                    if (p11 == 0) {
                        aVar = C3608d.a(cVar, gVar);
                    } else if (p11 == 1) {
                        aVar2 = C3608d.a(cVar, gVar);
                    } else if (p11 == 2) {
                        bVar = C3608d.b(cVar, gVar, true);
                    } else if (p11 != 3) {
                        cVar.q();
                        cVar.skipValue();
                    } else {
                        bVar2 = C3608d.b(cVar, gVar, true);
                    }
                }
                cVar.endObject();
                kVar = new I5.k(aVar, aVar2, bVar, bVar2);
            }
        }
        cVar.endObject();
        return kVar == null ? new I5.k(null, null, null, null) : kVar;
    }
}
