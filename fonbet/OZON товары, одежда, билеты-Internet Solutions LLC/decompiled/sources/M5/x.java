package M5;

import J5.i;
import java.io.IOException;

/* loaded from: classes8.dex */
final class x {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static J5.i a(N5.c cVar, B5.g gVar) throws IOException {
        boolean z11;
        boolean z12;
        cVar.beginObject();
        i.a aVar = null;
        I5.h hVar = null;
        I5.d dVar = null;
        boolean z13 = false;
        while (cVar.hasNext()) {
            String nextName = cVar.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        z11 = false;
                        break;
                    }
                    z11 = -1;
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z11 = true;
                        break;
                    }
                    z11 = -1;
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z11 = 2;
                        break;
                    }
                    z11 = -1;
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        z11 = 3;
                        break;
                    }
                    z11 = -1;
                    break;
                default:
                    z11 = -1;
                    break;
            }
            switch (z11) {
                case false:
                    dVar = C3608d.d(cVar, gVar);
                    break;
                case true:
                    hVar = new I5.h(u.a(cVar, gVar, O5.g.c(), G.f17398a, false));
                    break;
                case true:
                    z13 = cVar.j();
                    break;
                case true:
                    String nextString = cVar.nextString();
                    nextString.getClass();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                z12 = false;
                                break;
                            }
                            z12 = -1;
                            break;
                        case 105:
                            if (nextString.equals("i")) {
                                z12 = true;
                                break;
                            }
                            z12 = -1;
                            break;
                        case 110:
                            if (nextString.equals("n")) {
                                z12 = 2;
                                break;
                            }
                            z12 = -1;
                            break;
                        case 115:
                            if (nextString.equals("s")) {
                                z12 = 3;
                                break;
                            }
                            z12 = -1;
                            break;
                        default:
                            z12 = -1;
                            break;
                    }
                    switch (z12) {
                        case false:
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                        case true:
                            gVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = i.a.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            aVar = i.a.MASK_MODE_NONE;
                            break;
                        case true:
                            aVar = i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            O5.c.c("Unknown mask mode " + nextName + ". Defaulting to Add.");
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                    }
                default:
                    cVar.skipValue();
                    break;
            }
        }
        cVar.endObject();
        return new J5.i(aVar, hVar, dVar, z13);
    }
}
