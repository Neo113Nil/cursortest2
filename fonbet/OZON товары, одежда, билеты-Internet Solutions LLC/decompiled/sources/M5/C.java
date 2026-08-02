package M5;

import N5.c;
import android.graphics.PointF;
import java.io.IOException;

/* loaded from: classes8.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17394a = c.a.a("nm", "p", "s", "r", "hd");

    static J5.l a(N5.c cVar, B5.g gVar) throws IOException {
        String str = null;
        I5.m<PointF, PointF> mVar = null;
        I5.f fVar = null;
        I5.b bVar = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17394a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                mVar = C3605a.b(cVar, gVar);
            } else if (p11 == 2) {
                fVar = C3608d.e(cVar, gVar);
            } else if (p11 == 3) {
                bVar = C3608d.b(cVar, gVar, true);
            } else if (p11 != 4) {
                cVar.skipValue();
            } else {
                z11 = cVar.j();
            }
        }
        return new J5.l(str, mVar, fVar, bVar, z11);
    }
}
