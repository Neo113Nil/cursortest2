package M5;

import H5.b;
import N5.c;
import android.graphics.PointF;
import java.io.IOException;

/* renamed from: M5.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3613i implements M<H5.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3613i f17416a = new C3613i();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17417b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // M5.M
    public final H5.b a(N5.c cVar, float f7) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.beginObject();
        String str = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = true;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (cVar.hasNext()) {
            switch (cVar.p(f17417b)) {
                case 0:
                    str = cVar.nextString();
                    break;
                case 1:
                    str2 = cVar.nextString();
                    break;
                case 2:
                    f11 = (float) cVar.nextDouble();
                    break;
                case 3:
                    int nextInt = cVar.nextInt();
                    b.a aVar2 = b.a.CENTER;
                    if (nextInt <= aVar2.ordinal() && nextInt >= 0) {
                        aVar = b.a.values()[nextInt];
                        break;
                    } else {
                        aVar = aVar2;
                        break;
                    }
                    break;
                case 4:
                    i11 = cVar.nextInt();
                    break;
                case 5:
                    f12 = (float) cVar.nextDouble();
                    break;
                case 6:
                    f13 = (float) cVar.nextDouble();
                    break;
                case 7:
                    i12 = s.a(cVar);
                    break;
                case 8:
                    i13 = s.a(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.nextDouble();
                    break;
                case 10:
                    z11 = cVar.j();
                    break;
                case 11:
                    cVar.beginArray();
                    pointF = new PointF(((float) cVar.nextDouble()) * f7, ((float) cVar.nextDouble()) * f7);
                    cVar.endArray();
                    break;
                case 12:
                    cVar.beginArray();
                    pointF2 = new PointF(((float) cVar.nextDouble()) * f7, ((float) cVar.nextDouble()) * f7);
                    cVar.endArray();
                    break;
                default:
                    cVar.q();
                    cVar.skipValue();
                    break;
            }
        }
        cVar.endObject();
        H5.b bVar = new H5.b();
        bVar.f10600a = str;
        bVar.f10601b = str2;
        bVar.f10602c = f11;
        bVar.f10603d = aVar;
        bVar.f10604e = i11;
        bVar.f10605f = f12;
        bVar.f10606g = f13;
        bVar.f10607h = i12;
        bVar.f10608i = i13;
        bVar.f10609j = f14;
        bVar.f10610k = z11;
        bVar.f10611l = pointF;
        bVar.f10612m = pointF2;
        return bVar;
    }
}
