package M5;

import N5.c;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: M5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3605a {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17406a = c.a.a("k", "x", "y");

    public static I5.e a(N5.c cVar, B5.g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.m() == c.b.BEGIN_ARRAY) {
            cVar.beginArray();
            while (cVar.hasNext()) {
                N5.c cVar2 = cVar;
                B5.g gVar2 = gVar;
                arrayList.add(new E5.i(gVar2, t.b(cVar2, gVar2, O5.g.c(), z.f17457a, cVar.m() == c.b.BEGIN_OBJECT, false)));
                cVar = cVar2;
                gVar = gVar2;
            }
            cVar.endArray();
            u.b(arrayList);
        } else {
            arrayList.add(new P5.a(s.b(cVar, O5.g.c())));
        }
        return new I5.e(arrayList);
    }

    static I5.m<PointF, PointF> b(N5.c cVar, B5.g gVar) throws IOException {
        cVar.beginObject();
        I5.e eVar = null;
        I5.b bVar = null;
        boolean z11 = false;
        I5.b bVar2 = null;
        while (cVar.m() != c.b.END_OBJECT) {
            int p11 = cVar.p(f17406a);
            if (p11 == 0) {
                eVar = a(cVar, gVar);
            } else if (p11 != 1) {
                if (p11 != 2) {
                    cVar.q();
                    cVar.skipValue();
                } else if (cVar.m() == c.b.STRING) {
                    cVar.skipValue();
                    z11 = true;
                } else {
                    bVar = C3608d.b(cVar, gVar, true);
                }
            } else if (cVar.m() == c.b.STRING) {
                cVar.skipValue();
                z11 = true;
            } else {
                bVar2 = C3608d.b(cVar, gVar, true);
            }
        }
        cVar.endObject();
        if (z11) {
            gVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new I5.i(bVar2, bVar);
    }
}
