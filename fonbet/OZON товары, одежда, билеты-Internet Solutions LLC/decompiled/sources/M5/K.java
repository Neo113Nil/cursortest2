package M5;

import J5.s;
import N5.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes8.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17403a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17404b = c.a.a("n", "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static J5.s a(N5.c cVar, B5.g gVar) throws IOException {
        I5.d dVar;
        char c11;
        ArrayList arrayList = new ArrayList();
        float f7 = 0.0f;
        I5.d dVar2 = null;
        s.b bVar = null;
        s.c cVar2 = null;
        String str = null;
        I5.b bVar2 = null;
        I5.a aVar = null;
        I5.b bVar3 = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            switch (cVar.p(f17403a)) {
                case 0:
                    str = cVar.nextString();
                    continue;
                case 1:
                    aVar = C3608d.a(cVar, gVar);
                    continue;
                case 2:
                    dVar = dVar2;
                    bVar3 = C3608d.b(cVar, gVar, true);
                    break;
                case 3:
                    dVar2 = C3608d.d(cVar, gVar);
                    continue;
                case 4:
                    dVar = dVar2;
                    bVar = s.b.values()[cVar.nextInt() - 1];
                    break;
                case 5:
                    dVar = dVar2;
                    cVar2 = s.c.values()[cVar.nextInt() - 1];
                    break;
                case 6:
                    dVar = dVar2;
                    f7 = (float) cVar.nextDouble();
                    break;
                case 7:
                    z11 = cVar.j();
                    continue;
                case 8:
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        I5.b bVar4 = null;
                        String str2 = null;
                        while (cVar.hasNext()) {
                            int p11 = cVar.p(f17404b);
                            if (p11 == 0) {
                                str2 = cVar.nextString();
                            } else if (p11 != 1) {
                                cVar.q();
                                cVar.skipValue();
                            } else {
                                bVar4 = C3608d.b(cVar, gVar, true);
                            }
                        }
                        cVar.endObject();
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                                gVar.u();
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar2 = bVar4;
                                break;
                        }
                    }
                    cVar.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((I5.b) arrayList.get(0));
                        break;
                    } else {
                        continue;
                    }
                    break;
                default:
                    cVar.skipValue();
                    continue;
            }
            dVar2 = dVar;
        }
        I5.d dVar3 = dVar2;
        I5.d dVar4 = dVar3 == null ? new I5.d(Collections.singletonList(new P5.a(100))) : dVar3;
        if (bVar == null) {
            bVar = s.b.BUTT;
        }
        if (cVar2 == null) {
            cVar2 = s.c.MITER;
        }
        return new J5.s(str, bVar2, arrayList, aVar, dVar4, bVar3, bVar, cVar2, f7, z11);
    }
}
