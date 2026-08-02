package M5;

import N5.c;
import java.io.IOException;

/* renamed from: M5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3609e {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17411a = c.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17412b = c.a.a("ty", "v");

    static J5.a a(N5.c cVar, B5.g gVar) throws IOException {
        J5.a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.p(f17411a) != 0) {
                cVar.q();
                cVar.skipValue();
            } else {
                cVar.beginArray();
                while (cVar.hasNext()) {
                    cVar.beginObject();
                    J5.a aVar2 = null;
                    while (true) {
                        boolean z11 = false;
                        while (cVar.hasNext()) {
                            int p11 = cVar.p(f17412b);
                            if (p11 != 0) {
                                if (p11 != 1) {
                                    cVar.q();
                                    cVar.skipValue();
                                } else if (z11) {
                                    aVar2 = new J5.a(C3608d.b(cVar, gVar, true));
                                } else {
                                    cVar.skipValue();
                                }
                            } else if (cVar.nextInt() == 0) {
                                z11 = true;
                            }
                        }
                    }
                    cVar.endObject();
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                }
                cVar.endArray();
            }
        }
        return aVar;
    }
}
