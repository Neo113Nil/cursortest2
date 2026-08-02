package M5;

import J5.s;
import N5.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17437a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17438b = c.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f17439c = c.a.a("n", "v");

    static J5.f a(N5.c cVar, B5.g gVar) throws IOException {
        J5.g gVar2;
        I5.d dVar;
        ArrayList arrayList = new ArrayList();
        J5.g gVar3 = null;
        String str = null;
        I5.c cVar2 = null;
        I5.f fVar = null;
        I5.f fVar2 = null;
        I5.b bVar = null;
        s.b bVar2 = null;
        s.c cVar3 = null;
        I5.b bVar3 = null;
        float f7 = 0.0f;
        boolean z11 = false;
        I5.d dVar2 = null;
        while (cVar.hasNext()) {
            switch (cVar.p(f17437a)) {
                case 0:
                    str = cVar.nextString();
                    break;
                case 1:
                    gVar2 = gVar3;
                    dVar = dVar2;
                    cVar.beginObject();
                    int i11 = -1;
                    while (cVar.hasNext()) {
                        int p11 = cVar.p(f17438b);
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
                    dVar2 = dVar;
                    gVar3 = gVar2;
                    break;
                case 2:
                    dVar2 = C3608d.d(cVar, gVar);
                    break;
                case 3:
                    I5.d dVar3 = dVar2;
                    gVar3 = cVar.nextInt() == 1 ? J5.g.LINEAR : J5.g.RADIAL;
                    dVar2 = dVar3;
                    break;
                case 4:
                    fVar = C3608d.e(cVar, gVar);
                    break;
                case 5:
                    fVar2 = C3608d.e(cVar, gVar);
                    break;
                case 6:
                    gVar2 = gVar3;
                    dVar = dVar2;
                    bVar = C3608d.b(cVar, gVar, true);
                    dVar2 = dVar;
                    gVar3 = gVar2;
                    break;
                case 7:
                    gVar2 = gVar3;
                    dVar = dVar2;
                    bVar2 = s.b.values()[cVar.nextInt() - 1];
                    dVar2 = dVar;
                    gVar3 = gVar2;
                    break;
                case 8:
                    gVar2 = gVar3;
                    dVar = dVar2;
                    cVar3 = s.c.values()[cVar.nextInt() - 1];
                    dVar2 = dVar;
                    gVar3 = gVar2;
                    break;
                case 9:
                    gVar2 = gVar3;
                    dVar = dVar2;
                    f7 = (float) cVar.nextDouble();
                    dVar2 = dVar;
                    gVar3 = gVar2;
                    break;
                case 10:
                    gVar2 = gVar3;
                    z11 = cVar.j();
                    gVar3 = gVar2;
                    break;
                case 11:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        String str2 = null;
                        I5.b bVar4 = null;
                        while (cVar.hasNext()) {
                            int p12 = cVar.p(f17439c);
                            if (p12 != 0) {
                                J5.g gVar4 = gVar3;
                                if (p12 != 1) {
                                    cVar.q();
                                    cVar.skipValue();
                                } else {
                                    bVar4 = C3608d.b(cVar, gVar, true);
                                }
                                gVar3 = gVar4;
                            } else {
                                str2 = cVar.nextString();
                            }
                        }
                        J5.g gVar5 = gVar3;
                        cVar.endObject();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else if (str2.equals("d") || str2.equals("g")) {
                            gVar.u();
                            arrayList.add(bVar4);
                        }
                        gVar3 = gVar5;
                    }
                    gVar2 = gVar3;
                    cVar.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((I5.b) arrayList.get(0));
                    }
                    gVar3 = gVar2;
                    break;
                default:
                    cVar.q();
                    cVar.skipValue();
                    break;
            }
        }
        J5.g gVar6 = gVar3;
        I5.d dVar4 = dVar2;
        if (dVar4 == null) {
            dVar4 = new I5.d(Collections.singletonList(new P5.a(100)));
        }
        return new J5.f(str, gVar6, cVar2, dVar4, fVar, fVar2, bVar, bVar2, cVar3, f7, arrayList, bVar3, z11);
    }
}
