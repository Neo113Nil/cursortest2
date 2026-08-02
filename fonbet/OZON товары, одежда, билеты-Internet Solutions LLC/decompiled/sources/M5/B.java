package M5;

import J5.k;
import N5.c;
import android.graphics.PointF;
import java.io.IOException;

/* loaded from: classes8.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17393a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static J5.k a(N5.c cVar, B5.g gVar, int i11) throws IOException {
        boolean z11 = false;
        boolean z12 = i11 == 3;
        String str = null;
        k.a aVar = null;
        I5.b bVar = null;
        I5.m<PointF, PointF> mVar = null;
        I5.b bVar2 = null;
        I5.b bVar3 = null;
        I5.b bVar4 = null;
        I5.b bVar5 = null;
        I5.b bVar6 = null;
        while (cVar.hasNext()) {
            switch (cVar.p(f17393a)) {
                case 0:
                    str = cVar.nextString();
                    break;
                case 1:
                    aVar = k.a.a(cVar.nextInt());
                    break;
                case 2:
                    bVar = C3608d.b(cVar, gVar, false);
                    break;
                case 3:
                    mVar = C3605a.b(cVar, gVar);
                    break;
                case 4:
                    bVar2 = C3608d.b(cVar, gVar, false);
                    break;
                case 5:
                    bVar4 = C3608d.b(cVar, gVar, true);
                    break;
                case 6:
                    bVar6 = C3608d.b(cVar, gVar, false);
                    break;
                case 7:
                    bVar3 = C3608d.b(cVar, gVar, true);
                    break;
                case 8:
                    bVar5 = C3608d.b(cVar, gVar, false);
                    break;
                case 9:
                    z11 = cVar.j();
                    break;
                case 10:
                    if (cVar.nextInt() != 3) {
                        z12 = false;
                        break;
                    } else {
                        z12 = true;
                        break;
                    }
                default:
                    cVar.q();
                    cVar.skipValue();
                    break;
            }
        }
        return new J5.k(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z11, z12);
    }
}
