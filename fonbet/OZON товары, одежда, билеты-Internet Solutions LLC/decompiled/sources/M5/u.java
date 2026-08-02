package M5;

import N5.c;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    static c.a f17446a = c.a.a("k");

    static ArrayList a(N5.c cVar, B5.g gVar, float f7, M m11, boolean z11) throws IOException {
        N5.c cVar2;
        B5.g gVar2;
        float f11;
        M m12;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        if (cVar.m() == c.b.STRING) {
            gVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.beginObject();
        while (cVar.hasNext()) {
            if (cVar.p(f17446a) != 0) {
                cVar.skipValue();
            } else if (cVar.m() == c.b.BEGIN_ARRAY) {
                cVar.beginArray();
                if (cVar.m() == c.b.NUMBER) {
                    N5.c cVar3 = cVar;
                    B5.g gVar3 = gVar;
                    float f12 = f7;
                    M m13 = m11;
                    boolean z13 = z11;
                    P5.a b11 = t.b(cVar3, gVar3, f12, m13, false, z13);
                    cVar2 = cVar3;
                    gVar2 = gVar3;
                    f11 = f12;
                    m12 = m13;
                    z12 = z13;
                    arrayList.add(b11);
                } else {
                    cVar2 = cVar;
                    gVar2 = gVar;
                    f11 = f7;
                    m12 = m11;
                    z12 = z11;
                    while (cVar2.hasNext()) {
                        arrayList.add(t.b(cVar2, gVar2, f11, m12, true, z12));
                    }
                }
                cVar2.endArray();
                cVar = cVar2;
                gVar = gVar2;
                f7 = f11;
                m11 = m12;
                z11 = z12;
            } else {
                N5.c cVar4 = cVar;
                arrayList.add(t.b(cVar4, gVar, f7, m11, false, z11));
                cVar = cVar4;
            }
        }
        cVar.endObject();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i11;
        T t2;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            P5.a aVar = (P5.a) arrayList.get(i12);
            i12++;
            P5.a aVar2 = (P5.a) arrayList.get(i12);
            aVar.f21855h = Float.valueOf(aVar2.f21854g);
            if (aVar.f21850c == 0 && (t2 = aVar2.f21849b) != 0) {
                aVar.f21850c = t2;
                if (aVar instanceof E5.i) {
                    ((E5.i) aVar).i();
                }
            }
        }
        P5.a aVar3 = (P5.a) arrayList.get(i11);
        if ((aVar3.f21849b == 0 || aVar3.f21850c == 0) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
