package M5;

import N5.c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: M5.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3617m {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17431a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17432b = c.a.a("shapes");

    static H5.d a(N5.c cVar, B5.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.beginObject();
        String str = null;
        String str2 = null;
        double d11 = 0.0d;
        char c11 = 0;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17431a);
            if (p11 == 0) {
                c11 = cVar.nextString().charAt(0);
            } else if (p11 == 1) {
                cVar.nextDouble();
            } else if (p11 == 2) {
                d11 = cVar.nextDouble();
            } else if (p11 == 3) {
                str = cVar.nextString();
            } else if (p11 == 4) {
                str2 = cVar.nextString();
            } else if (p11 != 5) {
                cVar.q();
                cVar.skipValue();
            } else {
                cVar.beginObject();
                while (cVar.hasNext()) {
                    if (cVar.p(f17432b) != 0) {
                        cVar.q();
                        cVar.skipValue();
                    } else {
                        cVar.beginArray();
                        while (cVar.hasNext()) {
                            arrayList.add((J5.q) C3612h.a(cVar, gVar));
                        }
                        cVar.endArray();
                    }
                }
                cVar.endObject();
            }
        }
        cVar.endObject();
        return new H5.d(arrayList, c11, d11, str, str2);
    }
}
