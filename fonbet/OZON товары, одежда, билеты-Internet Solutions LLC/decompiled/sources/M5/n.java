package M5;

import N5.c;
import java.io.IOException;

/* loaded from: classes8.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17433a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    static H5.c a(N5.c cVar) throws IOException {
        cVar.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17433a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                str2 = cVar.nextString();
            } else if (p11 == 2) {
                str3 = cVar.nextString();
            } else if (p11 != 3) {
                cVar.q();
                cVar.skipValue();
            } else {
                cVar.nextDouble();
            }
        }
        cVar.endObject();
        return new H5.c(str, str2, str3);
    }
}
