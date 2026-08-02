package M5;

import N5.c;
import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes8.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17435a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17436b = c.a.a("p", "k");

    static J5.e a(N5.c cVar, B5.g gVar) throws IOException {
        I5.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        J5.g gVar2 = null;
        I5.c cVar2 = null;
        I5.f fVar = null;
        I5.f fVar2 = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            switch (cVar.p(f17435a)) {
                case 0:
                    str = cVar.nextString();
                    break;
                case 1:
                    cVar.beginObject();
                    int i11 = -1;
                    while (cVar.hasNext()) {
                        int p11 = cVar.p(f17436b);
                        if (p11 == 0) {
                            i11 = cVar.nextInt();
                        } else if (p11 != 1) {
                            cVar.q();
                            cVar.skipValue();
                        } else {
                            cVar2 = C3608d.c(cVar, gVar, i11);
                        }
                    }
                    cVar.endObject();
                    break;
                case 2:
                    dVar = C3608d.d(cVar, gVar);
                    break;
                case 3:
                    gVar2 = cVar.nextInt() == 1 ? J5.g.LINEAR : J5.g.RADIAL;
                    break;
                case 4:
                    fVar = C3608d.e(cVar, gVar);
                    break;
                case 5:
                    fVar2 = C3608d.e(cVar, gVar);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z11 = cVar.j();
                    break;
                default:
                    cVar.q();
                    cVar.skipValue();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new I5.d(Collections.singletonList(new P5.a(100)));
        }
        return new J5.e(str, gVar2, fillType, cVar2, dVar, fVar, fVar2, z11);
    }
}
