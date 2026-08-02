package M5;

import N5.c;
import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
final class H {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17400a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static J5.p a(N5.c cVar, B5.g gVar) throws IOException {
        I5.d dVar = null;
        String str = null;
        I5.a aVar = null;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 1;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17400a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                aVar = C3608d.a(cVar, gVar);
            } else if (p11 == 2) {
                dVar = C3608d.d(cVar, gVar);
            } else if (p11 == 3) {
                z11 = cVar.j();
            } else if (p11 == 4) {
                i11 = cVar.nextInt();
            } else if (p11 != 5) {
                cVar.q();
                cVar.skipValue();
            } else {
                z12 = cVar.j();
            }
        }
        if (dVar == null) {
            dVar = new I5.d(Collections.singletonList(new P5.a(100)));
        }
        return new J5.p(str, z11, i11 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z12);
    }
}
