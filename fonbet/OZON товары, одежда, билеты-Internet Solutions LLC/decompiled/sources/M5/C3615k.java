package M5;

import N5.c;
import java.io.IOException;

/* renamed from: M5.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3615k {

    /* renamed from: f, reason: collision with root package name */
    private static final c.a f17423f = c.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    private static final c.a f17424g = c.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    private I5.a f17425a;

    /* renamed from: b, reason: collision with root package name */
    private I5.b f17426b;

    /* renamed from: c, reason: collision with root package name */
    private I5.b f17427c;

    /* renamed from: d, reason: collision with root package name */
    private I5.b f17428d;

    /* renamed from: e, reason: collision with root package name */
    private I5.b f17429e;

    final C3614j a(N5.c cVar, B5.g gVar) throws IOException {
        I5.b bVar;
        I5.b bVar2;
        I5.b bVar3;
        I5.b bVar4;
        while (cVar.hasNext()) {
            if (cVar.p(f17423f) != 0) {
                cVar.q();
                cVar.skipValue();
            } else {
                cVar.beginArray();
                while (cVar.hasNext()) {
                    cVar.beginObject();
                    String str = "";
                    while (cVar.hasNext()) {
                        int p11 = cVar.p(f17424g);
                        if (p11 == 0) {
                            str = cVar.nextString();
                        } else if (p11 == 1) {
                            str.getClass();
                            switch (str) {
                                case "Distance":
                                    this.f17428d = C3608d.b(cVar, gVar, true);
                                    break;
                                case "Opacity":
                                    this.f17426b = C3608d.b(cVar, gVar, false);
                                    break;
                                case "Direction":
                                    this.f17427c = C3608d.b(cVar, gVar, false);
                                    break;
                                case "Shadow Color":
                                    this.f17425a = C3608d.a(cVar, gVar);
                                    break;
                                case "Softness":
                                    this.f17429e = C3608d.b(cVar, gVar, true);
                                    break;
                                default:
                                    cVar.skipValue();
                                    break;
                            }
                        } else {
                            cVar.q();
                            cVar.skipValue();
                        }
                    }
                    cVar.endObject();
                }
                cVar.endArray();
            }
        }
        I5.a aVar = this.f17425a;
        if (aVar == null || (bVar = this.f17426b) == null || (bVar2 = this.f17427c) == null || (bVar3 = this.f17428d) == null || (bVar4 = this.f17429e) == null) {
            return null;
        }
        return new C3614j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
