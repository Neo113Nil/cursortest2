package M5;

import N5.c;
import android.graphics.PointF;
import java.io.IOException;

/* renamed from: M5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3610f {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17413a = c.a.a("nm", "p", "s", "hd", "d");

    static J5.b a(N5.c cVar, B5.g gVar, int i11) throws IOException {
        boolean z11 = i11 == 3;
        boolean z12 = false;
        String str = null;
        I5.m<PointF, PointF> mVar = null;
        I5.f fVar = null;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17413a);
            if (p11 == 0) {
                str = cVar.nextString();
            } else if (p11 == 1) {
                mVar = C3605a.b(cVar, gVar);
            } else if (p11 == 2) {
                fVar = C3608d.e(cVar, gVar);
            } else if (p11 == 3) {
                z12 = cVar.j();
            } else if (p11 != 4) {
                cVar.q();
                cVar.skipValue();
            } else {
                z11 = cVar.nextInt() == 3;
            }
        }
        return new J5.b(str, mVar, fVar, z11, z12);
    }
}
