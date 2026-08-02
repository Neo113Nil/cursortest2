package M5;

import N5.c;
import java.io.IOException;

/* renamed from: M5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3612h {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17415a = c.a.a("ty", "d");

    static J5.c a(N5.c cVar, B5.g gVar) throws IOException {
        String str;
        String str2;
        J5.c a11;
        cVar.beginObject();
        int i11 = 2;
        while (true) {
            str = null;
            a11 = null;
            if (!cVar.hasNext()) {
                str2 = null;
                break;
            }
            int p11 = cVar.p(f17415a);
            if (p11 == 0) {
                str2 = cVar.nextString();
                break;
            }
            if (p11 != 1) {
                cVar.q();
                cVar.skipValue();
            } else {
                i11 = cVar.nextInt();
            }
        }
        if (str2 == null) {
            return null;
        }
        switch (str2) {
            case "el":
                a11 = C3610f.a(cVar, gVar, i11);
                break;
            case "fl":
                a11 = H.a(cVar, gVar);
                break;
            case "gf":
                a11 = p.a(cVar, gVar);
                break;
            case "gr":
                a11 = I.a(cVar, gVar);
                break;
            case "gs":
                a11 = q.a(cVar, gVar);
                break;
            case "mm":
                a11 = y.a(cVar);
                gVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case "rc":
                a11 = C.a(cVar, gVar);
                break;
            case "rd":
                a11 = E.a(cVar, gVar);
                break;
            case "rp":
                a11 = D.a(cVar, gVar);
                break;
            case "sh":
                c.a aVar = J.f17402a;
                int i12 = 0;
                boolean z11 = false;
                I5.h hVar = null;
                while (cVar.hasNext()) {
                    int p12 = cVar.p(J.f17402a);
                    if (p12 == 0) {
                        str = cVar.nextString();
                    } else if (p12 == 1) {
                        i12 = cVar.nextInt();
                    } else if (p12 == 2) {
                        hVar = new I5.h(u.a(cVar, gVar, O5.g.c(), G.f17398a, false));
                    } else if (p12 != 3) {
                        cVar.skipValue();
                    } else {
                        z11 = cVar.j();
                    }
                }
                a11 = new J5.r(str, i12, hVar, z11);
                break;
            case "sr":
                a11 = B.a(cVar, gVar, i11);
                break;
            case "st":
                a11 = K.a(cVar, gVar);
                break;
            case "tm":
                a11 = L.a(cVar, gVar);
                break;
            case "tr":
                a11 = C3607c.a(cVar, gVar);
                break;
            default:
                O5.c.c("Unknown shape type ".concat(str2));
                break;
        }
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endObject();
        return a11;
    }
}
